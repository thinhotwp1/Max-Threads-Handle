package org.learn.maxthreadshandle.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnyController {
    @PostMapping("/post")
    public int getName(@RequestBody int number) throws InterruptedException {
        if(number==5) Thread.sleep(5000);
        return number;
    }
}
