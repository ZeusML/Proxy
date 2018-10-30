/*
 * Copyright (c) 2018年10月30日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/10/30
 * @Version 1.0.0
 */
public class UserMenthodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Proxy:before");
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("Proxy:after");
        return object;
    }
}
