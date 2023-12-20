package org.learn.maxthreadshandle.tomcat;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnyController {
    @PostMapping("/post")
    public int getName(@RequestBody int number) throws InterruptedException {
        if(number==5) Thread.sleep(10000);
        return number;
    }
}
