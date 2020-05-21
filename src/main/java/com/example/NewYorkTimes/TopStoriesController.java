package com.example.NewYorkTimes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopStoriesController {

    @GetMapping ("/home")
    public TopStories getTopStories(){
        return new TopStories();
    }
}
