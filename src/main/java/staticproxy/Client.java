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
public class Client {

    public static void main(String[] args) {
       UserManager proxy = new UserManagerProxy(new UserManagerImpl());
       proxy.addUser("aaa");
       proxy.delUser("aaa");
       proxy.findUser("bbbb");
       proxy.updateUser("ccc");
    }
}
