package com.wjy.sample.feignclient.action;

import com.wjy.sample.feignclient.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weijiayou on 2018/11/15
 */
@RestController
public class WebController {

  @Autowired
  IHelloWorldService helloWorldService;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String sayHello() {
    return helloWorldService.sayHello();
  }
}
