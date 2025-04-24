package com.example.scrapper.controller;

import com.example.scrapper.service.IScrapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ScrapperController implements IScrapperController{

    @Autowired
    private IScrapperService scrapperService;
    @Override
    public String testMapping() {
        return "working...";
    }

    @Override
    public List<String> scrapeUrls(String url){
            return scrapperService.fetchedUrls(url);

    }
}
