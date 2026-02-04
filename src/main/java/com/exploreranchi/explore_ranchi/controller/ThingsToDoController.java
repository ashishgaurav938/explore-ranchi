package com.exploreranchi.explore_ranchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/things-to-do")
public class ThingsToDoController {

    @GetMapping("/waterfalls")
    public String waterfalls() {
        return "things/waterfalls";
    }

    @GetMapping("/spiritual")
    public String spiritual() {
        return "things/spiritual";
    }

    @GetMapping("/nature")
    public String nature() {
        return "things/nature";
    }

    @GetMapping("/photography")
    public String photography() {
        return "things/photography";
    }
}

