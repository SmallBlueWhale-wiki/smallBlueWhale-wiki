package smallbluewhale.service;

import smallbluewhale.entity.User;

/**
 * Created by 铠联 on 2018/2/25.
 */
public interface UserService {
    /**
     *  登录(需要)
     * @param userName
     * @param password
     * @return
     */
    public boolean login(String userName,String password);


    /**
     *  注册(需要)
     * @param user
     * @return
     */
    public boolean signUp(User user);
}
