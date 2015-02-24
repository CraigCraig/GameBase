package me.regal.poorboy.state.overlay;

import me.regal.poorboy.state.GameStateManager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface Overlay {
	/**
	 * Intended to be called repeatedly by the {@link GameStateManager} in every iteration of the libgdx render loop
	 * as long as the game state is overlaid.
	 * <p>
	 * Use this method to update the position of {@link Sprite Sprites}, and change any variables.
	 * @param dt The amount of time that has passed between the last frame and the current frame.
	 *           Use it while translating {@link Sprite Sprites} and {@link Texture Textures}
	 *           multiplied by the number of pixels per second to smooth translations. 
	 */
	void update(float dt);
	/**
	 * @param batch An instance of {@link SpriteBatch}, with .begin() already called.
	 */
	void draw(SpriteBatch sb);
}
