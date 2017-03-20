package com.kaishengit.action;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mxia on 2017/3/17.
 */
public class UserAction {

    private List<String> nameList;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public String execute() {
        System.out.println("hello struts");
        //String[] array = {"aa","bb","cc"};
        nameList = Arrays.asList("aa","bb","cc");
         name = "hahhah";

        return "success";
    }

    public String list() {
        System.out.println("list list list");
        return "success";
    }
}
