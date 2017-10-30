package com.kdx;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yangshuxi on 2017/10/27.
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
