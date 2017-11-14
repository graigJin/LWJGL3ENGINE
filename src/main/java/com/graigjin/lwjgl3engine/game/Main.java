package com.graigjin.lwjgl3engine.game;

import com.graigjin.lwjgl3engine.engine.GameEngine;
import com.graigjin.lwjgl3engine.engine.IGameLogic;

public class Main {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new Game();
            GameEngine gameEngine = new GameEngine("GAME", 600, 480, vSync, gameLogic);
            gameEngine.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
