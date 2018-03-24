package com.miga.springcloud.lab6sentenceserver.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.miga.springcloud.lab6sentenceserver.domain.Word;

@FeignClient("NOUN")
public interface NounClient {

    @GetMapping("/")
    public Word getWord();

}
