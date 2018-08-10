/*
 * Copyright (c) 2018年08月10日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package staticproxy;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/8/10
 * @Version 1.0.0
 */
public class UserManagerProxy implements UserManager{

    private UserManager userManager;

    public UserManagerProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    private void beforeMethod(){
        System.out.println("Proxy-->Before");
    }

    private void afterMethod(){
        System.out.println("Proxy-->After");
    }


    @Override
    public void addUser(String userName) {
        beforeMethod();
        userManager.addUser(userName);
        afterMethod();
    }

    @Override
    public void delUser(String userName) {
        beforeMethod();
        userManager.delUser(userName);
        afterMethod();
    }

    @Override
    public String findUser(String userName) {
        beforeMethod();
        String name = userManager.findUser(userName);
        afterMethod();
        return name;
    }

    @Override
    public String updateUser(String userName) {
        beforeMethod();
       String name = userManager.updateUser(userName);
        afterMethod();
        return name;
    }
}
