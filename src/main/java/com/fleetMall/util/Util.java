package com.fleetMall.util;

import java.util.UUID;

/**
 * Created by beila on 2017/4/8.
 */
public class Util {

    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
}
