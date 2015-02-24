package me.regal.poorboy.state;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

 /**
  * @author Collin Regalia <collinregalia@gmail.com>
  */
public abstract class GameState {
	
	protected GameState(){
		init();
	}
	
	/**
	 * Called automatically by the constructor when the GameState object is created.
	 * 
	 * <p>
	 * Use this method to initialize variables, configure the game, load any needed {@link Sprite Sprites}, etc.
	 */
	public abstract void init();
	
	/**
	 * Intended to be called repeatedly by the {@link GameStateManager} in every iteration of the libgdx render loop.
	 * <p>
	 * Use this method to update the position of {@link Sprite Sprites}, and change any variables.
	 * @param dt The amount of time that has passed between the last frame and the current frame.
	 *           Use it while translating {@link Sprite Sprites} and {@link Texture Textures}
	 *           multiplied by the number of pixels per second to smooth translations.
	 * @param input False if the GameState was not intended to retrieve input this iteration.
	 */
	public abstract void update(float dt, boolean input); 
	
	/**
	 * Use to draw your sprites and backgrounds using batch.draw(...).
	 * @param batch An instance of {@link SpriteBatch}, with .begin() already called.
	 */
	public abstract void draw(SpriteBatch batch); 
	
	/**
	 * Called by the GameStateManager when switching to another GameState.
	 * 
	 * Use this method to preserve any data.
	 */
	public abstract void dispose(); 
	
}
