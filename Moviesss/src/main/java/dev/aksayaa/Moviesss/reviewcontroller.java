package dev.aksayaa.Moviesss;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")

public class reviewcontroller {
    @Autowired
    private reviewservice reviewService;
    @PostMapping
    public ResponseEntity<reviews> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<reviews>(reviewService.createReview(payload.get(("reviewBody")), payload.get("imdbId")), HttpStatus.OK);
    }

}
