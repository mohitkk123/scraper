package com.example.scrapper.util;


import jakarta.annotation.PostConstruct;
import org.htmlunit.WebClient;
import org.htmlunit.html.HtmlHeading2;
import org.htmlunit.html.HtmlPage;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class scrapper implements Iscrapper {

   private WebClient webClient;

 @PostConstruct
 void init(){
    webClient=new WebClient();
    webClient.getOptions().setCssEnabled(false);
    webClient.getOptions().setJavaScriptEnabled(false);
 }
   @Override
   public List<String> getPageUrls(String url) throws IOException {
      HtmlPage page = webClient.getPage(url);
      String xpath = "//*[@id=\"bd-about-htmlunit\"]";
       HtmlHeading2 latestPostLink
              = (HtmlHeading2) page.getByXPath(xpath).get(0);
      HtmlPage postPage = latestPostLink.click();

      List<HtmlHeading2> h2
              =postPage.getByXPath("//h2");
      List<String> headings=new ArrayList<>();
      for(HtmlHeading2 heading2: h2) {
         headings.add(heading2.getTextContent());
      }

      return headings;

   }
}
