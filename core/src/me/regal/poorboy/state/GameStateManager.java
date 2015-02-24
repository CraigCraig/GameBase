package me.regal.poorboy.state;

import me.regal.poorboy.state.extended.State;
import me.regal.poorboy.state.extended.StateCollection;
import me.regal.poorboy.state.overlay.Overlay;


/**
 * The GameStateManager class is to be extended.
 * 
 * <p>
 * It is intended to manage the GameState, the 
 * Overlay, where the input goes, and what order
 * things are drawn in. 
 * <p>
 * 
 * @author Collin Regalia <collinregalia@gmail.com>
 */
public abstract class GameStateManager{
	
	protected GameState gameState;
	protected Overlay overlay;
	
	protected boolean isOverlayed;
	
	public static GameStateManager instance;
	
	public GameStateManager(){
		instance = this;
		gameState = StateCollection.EMPTY.getState();
		isOverlayed = false;
	}
	
	public GameState getGameState(){
		return gameState;
	}
	
	public void setState(State state){
		getGameState().dispose();
		gameState = state.getState();
	}
	
	public void setOverlay(Overlay overlay){
		this.overlay = overlay;
		isOverlayed = true;
	}
	
	public void removeOverlay(){
		isOverlayed = false;
	}
	
	public abstract void handleInput();
	
	public abstract void update(float dt);
	
	public abstract void draw();
}
