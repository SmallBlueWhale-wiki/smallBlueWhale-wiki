package smallbluewhale.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 铠联 on 2018/2/21.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,this is a springboot demo";
    }
}