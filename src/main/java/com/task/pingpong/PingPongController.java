package com.task.pingpong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {
    @RequestMapping
    public String pingPong() {
        return "Hello from Ping Pong!";
    }

    @RequestMapping("/ping")
    public String pong() {
        return "pong";
    }
}
