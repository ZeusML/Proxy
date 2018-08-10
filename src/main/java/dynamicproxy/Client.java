/*
 * Copyright (c) 2018年08月10日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/8/10
 * @Version 1.0.0
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        UserManager1 userManager = new UserManagerImpl();
        LogHandler logHandler = new LogHandler(userManager);
        UserManager1 proxy = (UserManager1) Proxy.newProxyInstance(userManager.getClass().getClassLoader(), userManager.getClass().getInterfaces(), logHandler);
        proxy.addUser1("aaaa");

//
//        BufferedOutputStream bos = null;
//        FileOutputStream fos = null;
//        String proxyName = "com.sun.proxy.$Proxy0";
//        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
//                proxyName, userManager.getClass().getInterfaces(), 17);
//        try {
//            File dir = new File("E:\\study");
//            if (!dir.exists() && dir.isDirectory()) {//判断文件目录是否存在
//                dir.mkdirs();
//            }
//            File file = new File("E:\\study" + File.separator + "Proxy0.class");
//            fos = new FileOutputStream(file);
//            bos = new BufferedOutputStream(fos);
//
//            bos.write(proxyClassFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (bos != null) {
//                try {
//                    bos.close();
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
//            }
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
//            }
//        }

    }
}
