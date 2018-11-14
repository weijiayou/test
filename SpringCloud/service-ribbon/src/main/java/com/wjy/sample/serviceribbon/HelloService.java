package com.wjy.sample.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by weijiayou on 2018/11/14
 */
@Service
public class HelloService {
  @Autowired
  RestTemplate restTemplate;

  public String getHelloContent() {
    return restTemplate.getForObject("http://EUREKA-CLIENT/",String.class);
  }
}
