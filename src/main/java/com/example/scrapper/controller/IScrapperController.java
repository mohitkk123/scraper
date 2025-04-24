package com.example.scrapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface IScrapperController {

    @GetMapping("/v1/test")
    String testMapping();

    @PostMapping("/v1/scrape/{url}")
    String scrapeUrls(@PathVariable("url") String url);

}
