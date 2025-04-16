package com.springapi.springapibuilding.game;

import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
final public class MarioGame implements GameRunnerInter {
    int gameMinAge;

    public void up() {
        out.printf("Going up %i",this.gameMinAge);
    }

    public void down() {
        out.println("Going down");
    }

    public void left() {
        out.println("Going left");
    }

    public void right() {
        out.println("Going right");
    }
}
