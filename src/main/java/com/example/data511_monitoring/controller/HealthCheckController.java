package com.example.data511_monitoring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("""
            <html>
              <body style="text-align:center; font-family:sans-serif">
                <h1>Service is healthy ✅</h1>
                <img src="https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExd3gxcHJ0NGNyYWdjeTIzN2prd21lYXhxaXFzc3FrYjhqNTYxc2sybyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/QQiBECCi0pw2itTbHr/giphy.gif" />
              </body>
            </html>
        """);
    }
}
