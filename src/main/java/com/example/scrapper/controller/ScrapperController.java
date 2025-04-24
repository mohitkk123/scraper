package com.example.scrapper.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrapperController implements IScrapperController{
    @Override
    public String testMapping() {
        return "working...";
    }

    @Override
    public String scrapeUrls(String url) {
        return url;
    }
}
