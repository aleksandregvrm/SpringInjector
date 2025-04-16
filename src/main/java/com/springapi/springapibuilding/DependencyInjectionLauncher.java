package com.springapi.springapibuilding;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class DependencyInjectionLauncher {
    public static void main(String[] args){
      try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      }
    }
}
