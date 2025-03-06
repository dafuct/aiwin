package com.makarenko.aiwin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat/")
public class OpenAiChatController {

    @GetMapping("/openai")
    public String getChat() {
        return "Hello from openai controller";
    }
}
