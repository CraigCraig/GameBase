package me.regal.poorboy.state.extended;

import me.regal.poorboy.state.GameState;
/**
 * 
 * This interface is intended to be implemented by an enum
 * with values are classes extending GameState. See StateCollectoin for an example.
 * 
 * @see StateCollection
 * @author Collin Regalia <collinregalia@gmail.com>
 */
public interface State {
	/**
	 * @see StateCollection
	 * @return the GameState associated with the class in an Enum value.
	 */
	GameState getState();
}
