package com.springapi.springapibuilding;

import com.springapi.springapibuilding.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springapi.springapibuilding.game")
public class GamingAppLauncher {

    @Bean(name = "doNothing")
    public String doNothing() {
        return "This bean does nothing!";
    }

    public static void main(String[] args) {

        var context2 = new AnnotationConfigApplicationContext(GamingAppLauncher.class);
        System.out.println(context2.getBean("doNothing"));
        var runningGame = context2.getBean(GameRunner.class);
        runningGame.run();
    }
}