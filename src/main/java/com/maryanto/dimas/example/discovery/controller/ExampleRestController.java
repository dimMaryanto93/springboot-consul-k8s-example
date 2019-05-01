package com.maryanto.dimas.example.discovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExampleRestController {

    @GetMapping("/halo")
    public Map<String, Object> halo() {
        Map<String, Object> params = new HashMap<>();
        params.put("time", LocalDateTime.now());
        params.put("message", "Halo ini dari aplikasi springboot");
        return params;
    }
}
