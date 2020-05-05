package com.proxy.demo;

public class Proxy{
    private LandLord landLord;

    public Proxy() {
    }

    public Proxy(LandLord landLord) {
        this.landLord = landLord;
    }

    public void rent(){
        this.watchHouse();
        this.contract();
        this.fee();
        this.landLord.rent();
    }

    public void watchHouse(){
        System.out.println("看房子");
    }

    public void fee(){
        System.out.println("收中介费");
    }

    public void contract(){
        System.out.println("签合同");
    }
}
