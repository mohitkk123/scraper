package com.example.scrapper.service;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface IScrapperService {

    List<String> fetchedUrls(String url);



}
