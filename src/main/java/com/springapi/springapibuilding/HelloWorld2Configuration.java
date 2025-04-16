package com.springapi.springapibuilding;

import com.springapi.springapibuilding.game.DonkiKongGame;
import com.springapi.springapibuilding.game.GameRunnerInter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorld2Configuration {

    @Bean
    public GameRunnerInter game(){
        var game = new DonkiKongGame();
        return game;
    }

}
