package com.kdx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangshuxi on 2017/10/27.
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
