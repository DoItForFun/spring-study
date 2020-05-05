package com.proxy.demo2;

public class Client {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(landLord);
        Rent rent = (Rent)proxyInvocationHandler.getProxy();
        rent.rent();
    }
}
