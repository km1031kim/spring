package com.mycompany.mvcproject.controller;

import com.mycompany.mvcproject.service.LoggedUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String main(
            // ? 뒤는 RequestParam
            @RequestParam(required = false) String logout,
            Model model
    ) {
        if (logout != null) {
            loggedUserManagementService.setUserName(null);
            return "login";
        }

        String userName = loggedUserManagementService.getUserName();
        if (userName == null) {
            return "login";
        }
        model.addAttribute("userName", userName);
        return "main";
    }
}
