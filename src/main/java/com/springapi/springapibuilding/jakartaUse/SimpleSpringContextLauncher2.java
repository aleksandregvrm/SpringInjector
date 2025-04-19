package com.springapi.springapibuilding.jakartaUse;

import com.springapi.springapibuilding.game.GameRunnerInter;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static java.lang.System.out;

import java.util.Arrays;

@Service
class BusinessService {
    private DataService dataService;

    @Autowired
    public void setDataService(DataService dataService) {
        out.println("Injection has happened");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }

}
@Named
class DataService {

}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncher2 {
    public static void main(String[] args){
      try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher2.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            out.println(context.getBean(BusinessService.class).getDataService());
      }
    }
}
