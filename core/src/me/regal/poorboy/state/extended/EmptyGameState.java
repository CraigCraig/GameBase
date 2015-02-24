package me.regal.poorboy.state.extended;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import me.regal.poorboy.state.GameState;

public class EmptyGameState extends GameState {
	
	
	public EmptyGameState() {
		super();
	}

	@Override
	public void init() {}
	
	@Override
	public void update(float dt, boolean input) {}

	@Override
	public void draw(SpriteBatch batch) {}

	@Override
	public void dispose() {}

}
