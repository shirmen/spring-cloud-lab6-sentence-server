package com.miga.springcloud.lab6sentenceserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miga.springcloud.lab6sentenceserver.service.SentenceService;

@Controller
public class SentenceController {

    @Autowired
    SentenceService sentenceService;

    /**
     * Display a small list of Sentences to the caller:
     */
    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
      return 
        "<h3>Some Sentences</h3><br/>" +
        sentenceService.buildSentence() + "<br/>" +
        sentenceService.buildSentence() + "<br/>" +
        sentenceService.buildSentence() + "<br/>" +
        sentenceService.buildSentence() + "<br/>" +
        sentenceService.buildSentence() + "<br/>"
        ;
    }

}
