package com.kaishengit.action;

/**
 * Created by Mxia on 2017/3/17.
 */
public class HelloAction {
    private String name;
    private String address;


    public String execute() {
        System.out.println(name+"->"+address);
        System.out.println("请求转发发");

        return "success";
    }
    public String hi() {

        System.out.println("he heheh heh heh he");
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
