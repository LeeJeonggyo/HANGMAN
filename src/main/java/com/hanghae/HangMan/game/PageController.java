package com.hanghae.HangMan.game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hangman")
public class PageController {
    /**
     * 메인 페이지
     * <a href="http://localhost:8080/hangman/home">메인</a>
     * <a href="https://hanghaeplus-coyukdae.oopy.io/">항해 플러스: 제1회 코육대</a>
     */
    @RequestMapping(value = "/home")
    public String home(){
        return "/home";
    }

    /**
     * 메인 페이지
     * <a href="http://localhost:8080/hangman/home">메인</a>
     * <a href="https://hanghaeplus-coyukdae.oopy.io/">항해 플러스: 제1회 코육대</a>
     */
    @RequestMapping(value = "/play")
    public String play(Model model){
        // 30개 이상 단어를 추가 및 랜덤으로 출력될 수 있도록 구현.
        model.addAttribute("world","apple");
        return "/play";
    }
}
