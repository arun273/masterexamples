package com.arun.cxf.springboot.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.cxf.services.helloworld.HelloWorldPortType;


@Configuration
public class ClientConfig {

  @Value("${client.ticketagent.address}")
  private String address;

  @Bean(name = "helloWorldProxy")
  public HelloWorldPortType helloWorldProxy() {
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
    jaxWsProxyFactoryBean.setServiceClass(HelloWorldPortType.class);
    jaxWsProxyFactoryBean.setAddress(address);

    return (HelloWorldPortType) jaxWsProxyFactoryBean.create();
  }
}
