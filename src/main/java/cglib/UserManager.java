/*
 * Copyright (c) 2018年10月30日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package cglib;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public class UserManager {
    public void addUser(String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    public void delUser(String userNmae) {
        System.out.println("UserManagerImpl.delUser");
    }

    public String findUser(String userName) {
        System.out.println("UserManagerImpl.findUser");
        return "Tom";
    }

    public String updateUser(String userName) {
        System.out.println("UserManagerImpl.updateUser");
        return "James";
    }

    public void addUser1(String userName) {
        System.out.println("UserManagerImpl.addUser1");
    }
}
