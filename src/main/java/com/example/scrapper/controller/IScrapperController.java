package com.example.scrapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

public interface IScrapperController {

    @GetMapping("/v1/test")
    String testMapping();

    @PostMapping("/v1/scrape/")
    List<String> scrapeUrls(@RequestParam("url") String url) throws IOException;

}
