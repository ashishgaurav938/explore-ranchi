package com.exploreranchi.explore_ranchi.controller;

import com.exploreranchi.explore_ranchi.model.PlaceSuggestion;
import com.exploreranchi.explore_ranchi.repository.PlaceSuggestionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactController {

    private final PlaceSuggestionRepository repository;

    public ContactController(PlaceSuggestionRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/contact")
    public String submitSuggestion(
            @RequestParam String placeName,
            @RequestParam String description,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email,
            RedirectAttributes redirectAttributes) {

        PlaceSuggestion suggestion = new PlaceSuggestion();
        suggestion.setPlaceName(placeName);
        suggestion.setDescription(description);
        suggestion.setName(name);
        suggestion.setEmail(email);

        repository.save(suggestion);

        redirectAttributes.addFlashAttribute(
                "successMessage",
                "✨ Thanks! Your suggestion has been submitted for review.");

        return "redirect:/contact";
    }

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact";
    }
}

