package me.regal.poorboy.map;

import me.regal.poorboy.Game;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public abstract class TMap extends Map {

	public TMap(String tiledMapString) {
		super();
		tiledMap = new TmxMapLoader().load(tiledMapString);
		tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
		// TODO Auto-generated constructor stub
	}
	
	public TiledMap getTiledMap(){
		return tiledMap;
	}
	
	public TiledMapRenderer getRenderer(){
		return tiledMapRenderer;
	}
	
	public void renderMap(){
		tiledMapRenderer.setView(Game.cam);
		tiledMapRenderer.render();
	}
	
	

}
