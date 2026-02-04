package com.exploreranchi.explore_ranchi.controller;

import com.exploreranchi.explore_ranchi.service.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final AttractionService attractionService;

    public HomeController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("featuredAttractions", attractionService.getAllAttractions());
        model.addAttribute("topPlaces", attractionService.getMostVisitedAttractions());
        return "index";
    }

    //    @GetMapping("/")
//    public String home(Model model) {
//        model.addAttribute("city", "Ranchi");
//        model.addAttribute(
//                "featuredAttractions",
//                attractionService.getAllAttractions().subList(0, 2)
//        );
//        return "index";
//    }

//    @GetMapping("/attractions")
//    public String attractions(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(required = false) String keyword,
//            @RequestParam(required = false) String category,
//            Model model) {
//
//        int PAGE_SIZE = 4;
//
//        List<Attraction> filteredAttractions =
//                attractionService.searchAndFilter(keyword, category);
//
//        int totalItems = filteredAttractions.size();
//        int totalPages = (int) Math.ceil((double) totalItems / PAGE_SIZE);
//
//        int start = page * PAGE_SIZE;
//        int end = Math.min(start + PAGE_SIZE, totalItems);
//
//        List<Attraction> pagedAttractions =
//                filteredAttractions.subList(start, end);
//
//        model.addAttribute("attractions", pagedAttractions);
//        model.addAttribute("currentPage", page);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("keyword", keyword);
//        model.addAttribute("category", category);
//
//        return "attractions";
//    }
//
//
//
//    @GetMapping("/attractions/{id}")
//    public String attractionDetail(@PathVariable int id, Model model) {
//
//        Attraction attraction =
//                attractionService.getAttractionById(id);
//
//        if (attraction == null) {
//            return "redirect:/attractions";
//        }
//
//        model.addAttribute("attraction", attraction);
//        return "attraction-detail";
//    }
}
