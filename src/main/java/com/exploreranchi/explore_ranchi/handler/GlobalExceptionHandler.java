package com.exploreranchi.explore_ranchi.handler;

import com.exploreranchi.explore_ranchi.exception.AttractionNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AttractionNotFoundException.class)
    public String handleAttractionNotFound(
            AttractionNotFoundException ex,
            Model model) {

        model.addAttribute("message", ex.getMessage());
        return "error/404";
    }
}

