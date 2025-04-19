package com.springapi.springapibuilding.examplesv1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import static java.lang.System.out;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some initialization logic goes in here!!!");
        this.classA = classA;
    }
}

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        out.println("Constructor initialized");
        this.someDependency = someDependency;
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        out.println("Connections cleaned up");
    }
}

@Component
class SomeDependency {
    public void getReady(){
        out.println("Some logic using some dependency");
    }
}

@Configuration
@ComponentScan
public class LazyBeanScopes {
    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args){
        try (var context = new AnnotationConfigApplicationContext(LazyBeanScopes.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
