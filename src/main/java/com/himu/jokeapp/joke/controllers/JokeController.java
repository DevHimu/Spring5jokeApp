package com.himu.jokeapp.joke.controllers;

import com.himu.jokeapp.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *
 *@Project joke
 *@author Himandri on 4/19/2020
 *
 */
@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController() {
    }

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());
        return "chuknorris";
    }
}
