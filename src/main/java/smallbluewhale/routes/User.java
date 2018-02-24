package smallbluewhale.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 铠联 on 2018/2/21.
 */
@Controller
public class User {

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

}