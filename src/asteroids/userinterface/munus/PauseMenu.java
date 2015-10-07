package com.thiefg.asteroids.userinterface.munus;

import org.lwjgl.input.Keyboard;

import com.thiefg.asteroids.Game;
import com.thiefg.asteroids.input.Input;
import com.thiefg.asteroids.userinterface.UserInterface;

/**
 * @author Dominik
 *
 */
public class PauseMenu implements Menu {
	
	/**
	 * Renders Menu
	 */
	@Override
	public void render() {
		Game.getInstance().getUi().getMainFont32p().drawString(100, 100, UserInterface.PAUSE_MENU_TEXT);
	}

	/**
	 * Updates Menu
	 */
	@Override
	public void update() {
		if (Input.getKeyDown(Keyboard.KEY_ESCAPE)) Game.getInstance().unpause();
	}
}