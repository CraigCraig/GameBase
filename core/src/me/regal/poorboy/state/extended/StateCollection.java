package me.regal.poorboy.state.extended;

import me.regal.poorboy.state.GameState;
/**
 * 
 * Open Declaration to see an example of how to implement State properly.
 * 
 * @author Collin Regalia <collinregalia@gmail.com>
 *
 */
public enum StateCollection implements State{
	
	EMPTY(EmptyGameState.class);
	
	private GameState gameState;
	
	/**
	 * @param cla55 Pronounced "Klaf".
	 */
	StateCollection(Class<?> cla55){ 
		if(cla55.getSuperclass().equals(GameState.class)){
			try {
				gameState = (GameState) cla55.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			gameState = new EmptyGameState();
		}
	}
	
	@Override
	public GameState getState(){
		return gameState;
	}
	
}




