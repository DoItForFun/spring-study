package com.proxy.demo;

public class Client {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        Proxy proxy = new Proxy(landLord);
        proxy.rent();
    }
}
