package com.xworkz.commonModule.controller;

import com.xworkz.commonModule.dto.UserDTO;
import com.xworkz.commonModule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/")
public class SignUpController {
    @Autowired
    private UserService userService;
   public SignUpController()
    {
        System.out.println("SignUpController created");
    }
    @PostMapping("/signup")
    public String onSignUp(UserDTO userDTO, Model model)
    {
        System.out.println("signup created");
        System.out.println(userDTO);
        String signUpData=userService.onsave(userDTO);
        model.addAttribute("message","success");
        return "signup";
    }
}
