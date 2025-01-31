package com.jumongweb.hngstagezero.controller;

import com.jumongweb.hngstagezero.dto.InformationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class InformationController {
    // one
    @GetMapping("info")
    public InformationResponse getInfo(){
        String email = "lawaltoheeb36@gmail.com";
        String currentTime = Instant.now().toString();
        String githubUrl = "https://github.com/Jumongweb/hng-stagezero";

        InformationResponse informationResponse = new InformationResponse();
        informationResponse.setEmail(email);
        informationResponse.setCurrentTime(currentTime);
        informationResponse.setGithubUrl(githubUrl);
        return informationResponse;
    }


}
