package com.wjy.sample.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weijiayou on 2018/11/14
 */
@RestController
public class HelloControler {
  @Autowired
  HelloService helloService;
  @RequestMapping(value = "/")
  public String hello(){
    return helloService.getHelloContent();
  }
}
