package com.neo.romote;

import com.neo.romote.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuyankun
 * @title: HelloRemote
 * @projectName spring-cloud-examples
 * @description: TODO
 * @date 2019/5/3115:34
 */
@FeignClient(name= "spring-cloud-config-server",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
