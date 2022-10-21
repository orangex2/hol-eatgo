package kr.co.fastcampus.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String hello() {

        ZonedDateTime nowSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("System.out.println " + nowSeoul + "-- +9");
        return "eks test 자동배포(수정3) : 현재 서울 시각은: " + nowSeoul + "-- +9";
    }
}




