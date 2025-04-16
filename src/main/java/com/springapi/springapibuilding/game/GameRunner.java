package com.springapi.springapibuilding.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameRunnerInter game;

    public GameRunner(GameRunnerInter game){
        this.game = game;
    }

    public void run(){
        System.out.printf("running this game %s",this.game);
    }
}
