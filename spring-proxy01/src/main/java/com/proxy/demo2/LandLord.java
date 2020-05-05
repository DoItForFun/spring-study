package com.proxy.demo2;
public class LandLord implements Rent {
    public void rent() {
        watchHouse();
        contract();
        fee();
        System.out.println("出租房子");
    }

    public void fee(){
        System.out.println("收中介费");
    }
    public void watchHouse(){
        System.out.println("看房子");
    }
    public void contract(){
        System.out.println("签合同");
    }
}
