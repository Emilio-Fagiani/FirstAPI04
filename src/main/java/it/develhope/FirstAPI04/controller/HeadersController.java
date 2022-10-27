package it.develhope.FirstAPI04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
@RestController
@RequestMapping ("/headers")
public class HeadersController {

    @GetMapping
    public String getHeaders(@RequestHeader HttpHeaders headers){
        String hostName = headers.getHost().getHostName();
        int port= headers.getHost().getPort();
        return
                "Host Name : " + hostName +"\n"+ "Num. port : " + port;
    }
}
