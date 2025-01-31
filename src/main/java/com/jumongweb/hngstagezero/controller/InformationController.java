package com.jumongweb.hngstagezero.controller;

import com.jumongweb.hngstagezero.dto.InformationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class InformationController {

    @GetMapping("info")
    public InformationResponse getInfo(){
        String email = "lawaltoheeb36@gmail.com";
        String current_time = Instant.now().toString();
        String github_url = "https://github.com/Jumongweb/HNGStageZero";

        InformationResponse informationResponse = new InformationResponse();
        informationResponse.setEmail(email);
        informationResponse.setCurrentTime(current_time);
        informationResponse.setGithubUrl(github_url);
        return informationResponse;
    }


}
