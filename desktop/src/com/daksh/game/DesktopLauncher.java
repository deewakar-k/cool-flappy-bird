package com.daksh.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.daksh.game.CoolFlappyBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setWindowedMode(CoolFlappyBird.WIDTH, CoolFlappyBird.HEIGHT);
		config.setTitle(CoolFlappyBird.TITLE);
		config.setForegroundFPS(60);

		new Lwjgl3Application(new CoolFlappyBird(), config);
	}
}
