package com.example.scrapper.util;

import java.io.IOException;
import java.util.List;

public interface Iscrapper {
    List<String> getPageUrls(String url) throws IOException;
}
