package com.wjy.sample.feignclient.service.impl;

import com.wjy.sample.feignclient.service.IHelloWorldService;
import org.springframework.stereotype.Component;

/**
 * Created by weijiayou on 2018/11/15
 */
@Component
public class HelloWorldServiceFailure implements IHelloWorldService {

  @Override
  public String sayHello() {
    System.out.println("hello world service is not available !");
    return "hello world service is not available !";
  }
}
