package org.x.c4.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy<T> implements InvocationHandler {
    private T t;

    public T bind(T t) {
       this.t = t;
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("start hello");
        Object o = method.invoke(t, args);
        return o;
    }

    public static void main(String[] args) {
        HelloServiceProxy<HelloService> helloHandler = new HelloServiceProxy<>();
        HelloService helloService = helloHandler.bind(new HelloServiceImpl());
        helloService.sayHello("xz");
    }
}
