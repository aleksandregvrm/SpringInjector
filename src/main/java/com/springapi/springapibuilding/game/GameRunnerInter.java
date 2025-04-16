package com.springapi.springapibuilding.game;

sealed public interface GameRunnerInter permits MarioGame,DonkiKongGame {
    int gameMinAge = 6;
    void up();

    void down();

    void left();

    void right();
}
