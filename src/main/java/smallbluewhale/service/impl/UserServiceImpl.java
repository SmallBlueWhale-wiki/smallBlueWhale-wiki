package smallbluewhale.service.impl;

import org.springframework.stereotype.Service;
import smallbluewhale.entity.User;
import smallbluewhale.service.UserService;

/**
 * Created by 铠联 on 2018/2/25.
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 登录(需要)
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    /**
     * 注册(需要)
     *
     * @param user
     * @return
     */
    @Override
    public boolean signUp(User user) {
        return false;
    }
}
