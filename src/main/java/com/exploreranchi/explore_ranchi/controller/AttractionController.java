package com.exploreranchi.explore_ranchi.controller;

import com.exploreranchi.explore_ranchi.model.Attraction;
import com.exploreranchi.explore_ranchi.service.AttractionService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class AttractionController {

    private final AttractionService service;

    public AttractionController(AttractionService service) {
        this.service = service;
    }


    @GetMapping("/search")
    public String search(@RequestParam String q, Model model) {
        model.addAttribute("attractions", service.search(q));
        return "home";
    }

    @GetMapping("/attractions")
    public String attractions(
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) String category,
            Model model) {


        model.addAttribute(
                "attractions",
                service.search(keyword, category)
        );

        model.addAttribute("keyword", keyword);
        model.addAttribute("category", category);

        // ✅ Dynamic page title
        if (category != null && !category.isBlank()) {
            model.addAttribute("pageTitle", category + "s in Ranchi");
        } else {
            model.addAttribute("pageTitle", "Top Attractions in Ranchi");
        }

        return "attractions";
    }

    @GetMapping("/attractions/{slug}")
    public String attractionById(@PathVariable String slug, Model model) {

//        Attraction attraction = service
//                .getAttractionById(id)
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND, "Attraction not found"
//                ));

        Attraction attraction = service.getBySlug(slug);

        model.addAttribute("attraction", attraction);
        return "attraction-detail";
    }
}

