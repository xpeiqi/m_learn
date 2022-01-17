package org.x.c4.proxy;

public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
