package com.springapi.springapibuilding;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "value";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean(name = "krebsonaPersona")
    public Person person(){
        var person = new Person("John",24);
        return person;
    }

    @Bean(name = "person3")
    @Primary
    public Person person2(String name, int age){
        var person = new Person(name,age);
        return person;
    }

    @Bean
    public Person person3(String name, @Qualifier("person3Qualifier") Person person2){
        var person = new Person(name,15);
        return person;
    }

}
