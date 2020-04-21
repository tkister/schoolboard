package de.internship.server.service;

import de.internship.server.model.UserProfile;
import de.internship.server.repository.UserProfileRepository;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class UserProfileService implements IUserService{
    @Autowired
    private UserProfileRepository repository;
    @Override
    public Var findAll(){
        Var userprofil = (Var) repository.findAll();

        return userprofil;
    }

}
