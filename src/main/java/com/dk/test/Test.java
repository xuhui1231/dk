package com.dk.test;

import java.util.HashMap;

/**
 * @author Xuhui
 * @title: Test
 * @projectName dk
 * @description: TODO
 * @date 2022/6/1011:26
 */
public class Test {


    public static void main(String[] args) {
        SeatunnelHashMap<String, Object> objectObjectHashMap = new SeatunnelHashMap<String, Object>("KafkaTableStream");
        objectObjectHashMap.put("xuhui", 1);
        objectObjectHashMap.put("xiaoming", "xuhui");
        System.out.println(objectObjectHashMap);
    }

}