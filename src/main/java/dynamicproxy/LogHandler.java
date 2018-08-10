/*
 * Copyright (c) 2018年08月10日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/8/10
 * @Version 1.0.0
 */
public class LogHandler implements InvocationHandler {

    //目标对象
    private Object targetObject;

    public LogHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    private void beforeMethod(){
        System.out.println("Proxy-->Before");
    }

    private void afterMethod(){
        System.out.println("Proxy-->After");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        Object result = method.invoke(targetObject,args);
        afterMethod();
        return result;
    }
}
