package com.neo.romote.hystrix;

import com.neo.romote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuyankun
 * @title: HelloRemoteHystrix
 * @projectName spring-cloud-examples
 * @description: TODO
 * @date 2019/5/3116:39
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
