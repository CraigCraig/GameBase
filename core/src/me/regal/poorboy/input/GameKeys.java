package me.regal.poorboy.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Input.Keys;

public class GameKeys extends InputAdapter{
	private static boolean[] keys;
	private static boolean[] pkeys;
	
	private static final int NUM_KEYS = 5;
	public static final int UP = 0;
	public static final int LEFT = 1;
	public static final int DOWN = 2;
	public static final int RIGHT = 3;
	public static final int SPACE = 4;
	
	static{
		keys = new boolean[NUM_KEYS];
		pkeys = new boolean[NUM_KEYS];
	}
	
	public static void update(){
		for(int i = 0; i< NUM_KEYS; i++){
			pkeys[i] = keys[i];
		}
	}
	
	public static void setKey(int k, boolean b){
		keys[k] = b;
	}
	
	public static boolean isDown(int k){
		return keys[k];
	}
	
	public static boolean isPressed(int k){
		return keys[k] && !pkeys[k];
	}
	
	public static boolean isUnPressed(int k){
		return !keys[k] && pkeys[k];
	}
	
	
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
