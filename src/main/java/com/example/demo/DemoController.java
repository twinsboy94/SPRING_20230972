package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller // 컨트롤러 어노테이션 명시
public class DemoController{
    @GetMapping("/about_detailed") // 전송 방식 GET
    public String about_detailed(Model model) {
        model.addAttribute("data","홈페이지 메인"); // model 설정
        return "about_detailed"; // hello.html 연결
    }
}