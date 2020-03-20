package kr.co.fastcampus.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class WelcomeController {
/*
    @RestController는 Spring MVC Controlle에 @ResponseBody가 추가된 것입니다.
    당연하게도 RestController의 주용도는 Json/Xml 형태로 객체 데이터를 반환하는 것입니다.
 */
    @GetMapping("/")
    public String hello() {
        ZonedDateTime nowSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        return "ECS Now in Seoul is " + nowSeoul + "!+5";
        //return "Hello, world!!5!! " + LocalDateTime.now().toString();
    }
}

