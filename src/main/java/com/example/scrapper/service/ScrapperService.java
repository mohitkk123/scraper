package com.example.scrapper.service;


import com.example.scrapper.util.Iscrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ScrapperService implements IScrapperService {

    @Autowired
    private Iscrapper iscrapper;

    @Override
    public List<String> fetchedUrls(String url) {
        try {
            return iscrapper.getPageUrls(url);
            }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
