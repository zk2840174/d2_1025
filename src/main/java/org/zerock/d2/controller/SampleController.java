package org.zerock.d2.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {




    @GetMapping("hello")
    public String[] hello() {

        log.info("--------------------------");
        log.info("hello");

        return new String[] {"Hello", "World"};
    }
}
