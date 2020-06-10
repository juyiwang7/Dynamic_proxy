package com.ju.myproxy.serviceImpl;

import com.ju.myproxy.service.Host;

public class HostImpl implements Host {
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
