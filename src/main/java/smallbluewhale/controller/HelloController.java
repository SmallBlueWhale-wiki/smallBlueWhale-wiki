package smallbluewhale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 铠联 on 2018/2/21.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/index")
    public String hello() {
        return "index";
    }
}