package com.fleetMall.common;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by beila on 2017/4/9.
 */
public class DataFormat {

    public static String formatDataToJSONArray(Object object, boolean isSuccess) {
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("code", isSuccess ? "0" : "1");
        if (object instanceof List) {

        } else {

        }
        return JSON.toJSONString(object);
    }
}
