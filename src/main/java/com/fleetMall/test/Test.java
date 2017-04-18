package com.fleetMall.test;

import com.fleetMall.util.Util;

import java.util.UUID;

/**
 * Created by beila on 2017/3/19.
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 0 ;i < 30;i ++) {
            System.out.println(Util.get32UUID());
        }
    }
}
