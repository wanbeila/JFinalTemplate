package com.fleetMall.controller.view;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by beila on 2017/4/9.
 */
@Controller
@CrossOrigin
@RequestMapping("/")
public class MainController {

    Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping("/")
    public ModelAndView mainView() {
        logger.info("main view controller");
        return new ModelAndView("index.html");
    }
}
