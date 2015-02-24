package me.regal.poorboy.input;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;

public class GameInputProcessor extends InputAdapter {
	
	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.W){
			GameKeys.setKey(GameKeys.UP, true);
		}
		if(keycode == Keys.A){
			GameKeys.setKey(GameKeys.LEFT, true);
		}
		if(keycode == Keys.S){
			GameKeys.setKey(GameKeys.DOWN, true);
		}
		if(keycode == Keys.D){
			GameKeys.setKey(GameKeys.RIGHT, true);
		}
		if(keycode == Keys.ESCAPE){
			Gdx.app.exit();
		}
		if(keycode == Keys.SPACE){
			GameKeys.setKey(GameKeys.SPACE, true);
		}
		return true;
	}
	
	@Override
	public boolean keyUp(int keycode) {
		if(keycode == Keys.W){
			GameKeys.setKey(GameKeys.UP, false);
		}
		if(keycode == Keys.A){
			GameKeys.setKey(GameKeys.LEFT, false);
		}
		if(keycode == Keys.S){
			GameKeys.setKey(GameKeys.DOWN, false);
		}
		if(keycode == Keys.D){
			GameKeys.setKey(GameKeys.RIGHT, false);
		}
		if(keycode == Keys.SPACE){
			GameKeys.setKey(GameKeys.SPACE, false);
		}
		return true;
	}
	
}
