package com.mn.dubbo.provider;

import com.mn.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {

        return "hello, " + name;
    }
}
