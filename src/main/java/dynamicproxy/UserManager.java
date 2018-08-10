package dynamicproxy;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/8/10
 * @Version 1.0.0
 */
public interface UserManager {
    void addUser(String userName);

    void delUser(String userNmae);

    String findUser(String userName);

    String updateUser(String userName);
}
