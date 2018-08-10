/*
 * Copyright (c) 2018年08月10日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package dynamicproxy;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/8/10
 * @Version 1.0.0
 */
public class UserManagerImpl implements UserManager,UserManager1 {

    @Override
    public void addUser(String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public void delUser(String userNmae) {
        System.out.println("UserManagerImpl.delUser");
    }

    @Override
    public String findUser(String userName) {
        System.out.println("UserManagerImpl.findUser");
        return "Tom";
    }

    @Override
    public String updateUser(String userName) {
        System.out.println("UserManagerImpl.updateUser");
        return "James";
    }

    @Override
    public void addUser1(String userName) {
        System.out.println("UserManagerImpl.addUser1");
    }
}
