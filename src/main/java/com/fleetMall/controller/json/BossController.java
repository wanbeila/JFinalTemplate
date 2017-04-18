package com.fleetMall.controller.json;

import com.fleetMall.service.other.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by beila on 2017/4/9.
 */
@Controller
@CrossOrigin
@RequestMapping(value = "/fleet/json/boss/")
public class BossController {

    @Autowired
    BossService bossService;

    @RequestMapping(value = "listboss", method = RequestMethod.GET)
    @ResponseBody
    public Object bossList(){
        return null;
    }
}
