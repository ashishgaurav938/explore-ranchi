package com.exploreranchi.explore_ranchi.controller;

import com.exploreranchi.explore_ranchi.model.PlaceSuggestion;
import com.exploreranchi.explore_ranchi.repository.PlaceSuggestionRepository;
import jdk.jshell.SourceCodeAnalysis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final PlaceSuggestionRepository repo;

    public AdminController(PlaceSuggestionRepository repo) {
        this.repo = repo;
    }

//    @GetMapping("/dashboard")
//    public String dashboard(Model model) {
//        model.addAttribute("suggestions",
//                repo.findByStatusOrderByCreatedAtDesc("PENDING"));
//        return "admin/admin-dashboard";
//    }

    @PostMapping("/approve/{id}")
    public String approve(@PathVariable Long id) {
        PlaceSuggestion s = repo.findById(id).orElseThrow();
        s.setStatus("APPROVED");
        repo.save(s);
        return "redirect:/admin/dashboard";
    }

    @PostMapping("/reject/{id}")
    public String reject(@PathVariable Long id) {
        PlaceSuggestion s = repo.findById(id).orElseThrow();
        s.setStatus("REJECTED");
        repo.save(s);
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/login")
    public String login() {
        return "admin/admin-login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("suggestions", repo.findByStatusOrderByCreatedAtDesc("PENDING"));
        return "admin/admin-dashboard";
    }
}


