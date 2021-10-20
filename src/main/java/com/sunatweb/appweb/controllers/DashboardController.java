package com.sunatweb.appweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DashboardController {
    private static final String DASHBOARD_INDEX = "layout/panel";
    @GetMapping(value = "/dashboard")
    public String index(Model model){
        return DASHBOARD_INDEX;
    }
}
