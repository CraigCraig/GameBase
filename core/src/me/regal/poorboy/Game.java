package me.regal.poorboy;

import me.regal.poorboy.input.GameKeys;
import me.regal.poorboy.state.GameStateManager;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class Game extends ApplicationAdapter {
	
	public static int WIDTH;
	public static int HEIGHT;
	
	public static OrthographicCamera cam;

	@Override
	public void create () {
		
		Gdx.graphics.setDisplayMode(1080, 720, true);
		Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode().width, Gdx.graphics.getDesktopDisplayMode().height, true);
		
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		cam = new OrthographicCamera(WIDTH,HEIGHT);
		cam.update();
		
		Gdx.input.setInputProcessor(new GameKeys());
		
		// TODO Extend GameStateManager and create a new instance here.
	}
	
	@Override
	public void render () {
		GameStateManager.instance.handleInput();
		GameStateManager.instance.update(Gdx.graphics.getDeltaTime());
		GameStateManager.instance.draw();
	}
	
	
}

