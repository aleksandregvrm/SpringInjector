package com.springapi.springapibuilding;

import com.springapi.springapibuilding.game.GameRunner;
import com.springapi.springapibuilding.game.MarioGame;

public class App01Gaming {
    public static void main(String[] args){
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
