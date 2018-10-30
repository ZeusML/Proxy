/*
 * Copyright (c) 2018年10月30日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserManager.class);
        enhancer.setCallback(new UserMenthodInterceptor());
        UserManager manager = (UserManager) enhancer.create();

        manager.addUser("qwe");

    }
}
