package de.internship.server.controller;

import de.internship.server.helper.Utils;
import de.internship.server.helper.Validator;
import de.internship.server.model.Message;
import de.internship.server.model.Vertretung;
import de.internship.server.repository.VertretungRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping(path = "/vertretung")
public class VertretungsController {

    public static final String REGISTER_SUCCESFULL = "REGISTER_SUCCESFULL";
    @Autowired
    private VertretungRepository vertretungRepository;
    @Autowired
    private static final Logger log = LoggerFactory.getLogger(VertretungsController.class);
    @Autowired
    private MessageController messageController;


    @GetMapping(value = "", produces = "application/json")
    @ResponseBody
    public List<Vertretung> getVertretungasJSON() {
        List<Vertretung> vertretungList = vertretungRepository.findAll();
        return vertretungList;
    }

    @GetMapping(value = "/vertretung.html")
    public String vertretungHTML(Model model, @ModelAttribute("stunde") String stunde, @ModelAttribute("klasse") String klasse, @ModelAttribute("fach") String fach, @ModelAttribute("lehrer") String lehrer) {
        model.addAttribute("vertretung", vertretungRepository.findAll());
        model.addAttribute("stunde", stunde);
        model.addAttribute("klasse", klasse);
        model.addAttribute("fach", fach);
        model.addAttribute("lehrer", lehrer);
        Vertretung newVertretung = new Vertretung();
        model.addAttribute("newVertretung", newVertretung);
        return "vertretung";
    }

    @GetMapping(value = "/registerVertretung")
    public String registerVHTML(@RequestBody Vertretung vertretung){
        String loginStatus = validateVertretung(vertretung.getStunde(),vertretung.getKlasse(), vertretung.getFach(), vertretung.getLehrer());
        Vertretung tempvertretung = new Vertretung();

        if(loginStatus.equals(REGISTER_SUCCESFULL)){

            vertretungRepository.save(tempvertretung);
            return Utils.generateJson(1, REGISTER_SUCCESFULL);

        }
        return "redirect:/vertretung/vertretung.html";

    }
    private Long v_idnew()
    {
        List<Vertretung> vertretungList = vertretungRepository.findAll();
      int  i = vertretungList.size();
      i++;
      Long v_idnew = Long.valueOf(i);
      return  v_idnew();
    }

    private String validateVertretung(int stunde, String klasse, String fach, String lehrer) {
        int statusValue= Validator.validateVer(stunde, klasse, fach, lehrer);
        // Here below a test for the actual existence of transmitter and receiver still's to add
        if(statusValue==1) {
            return "ERR_INV_ID";
        } else if(statusValue==2) {
            return "ERR_INV_ID_ID_CLONED";
        } else if(statusValue==3) {
            return "ERR_TRANSMITTER_EQUALS_RECEIVER";
        } else if(statusValue==4) {
            return "ERR_MSG_LENGTH_INADEQUATE_MSG_EMPTY";
        } else if(statusValue==5) {
            return "ERR_MSG_LENGTH_INADEQUATE_MSG_MAX_LENGTH_EXCEEDED";
        } else if(statusValue==6) {
            return "ERR_TIME_TRAVEL";
        } else {
            return REGISTER_SUCCESFULL;
        }
    }
}
