package me.regal.poorboy.map;

import java.util.ArrayList;
import java.util.List;

import me.regal.poorboy.Game;
import me.regal.poorboy.entities.Entity;
import me.regal.poorboy.entities.properties.Drawable;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public abstract class Map {
	
	protected TiledMap tiledMap;
	protected TiledMapRenderer tiledMapRenderer;
	
	protected List<Entity> entities;
	
	public Map(){
		entities = new ArrayList<Entity>();
		loadEntities();
	}
	
	public List<Entity> getEntities(){
		return entities;
	}
	
	public abstract void loadEntities();
	
	public abstract void addEntity(Entity e);
	
	public abstract void removeEntity(Entity e);
	
	public void renderEntities(SpriteBatch sb){
		for(Entity e: entities){
			if(e instanceof Drawable){
				((Drawable) e).draw(sb);
			}
		}
	}
	
	
	
}
