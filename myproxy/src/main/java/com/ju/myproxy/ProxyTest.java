package com.ju.myproxy;

import com.ju.myproxy.proxy.ProxyInvocationHandler;
import com.ju.myproxy.service.Host;
import com.ju.myproxy.serviceImpl.HostImpl;

/**
 * 代理测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        //要被代理的接口，不改变原有接口的逻辑代码
        HostImpl host = new HostImpl();

        ProxyInvocationHandler proxy = new ProxyInvocationHandler();
        proxy.setTarget(host);
        //代理类的生成
        Host h = (Host)proxy.getProxy();
        //调用被代理的接口的方法
        h.rent();
    }
}
