package com.wjy.sample.feignclient.service;

import com.wjy.sample.feignclient.service.impl.HelloWorldServiceFailure;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by weijiayou on 2018/11/15
 */
@FeignClient(value = "eureka-client", fallback = HelloWorldServiceFailure.class)
public interface IHelloWorldService {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  String sayHello();
}
