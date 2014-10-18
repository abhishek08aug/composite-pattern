package in.blogspot.randomcompiler.composite.pattern.impl;

import java.util.ArrayList;
import java.util.List;

import in.blogspot.randomcompiler.composite.pattern.api.Entity;

public class Folder extends Entity {
	private String name;
	private long bytes;
	private String owner;
	private List<Entity> entities;
	
	public Folder(String name, long bytes, String owner) {
		this.name = name;
		this.bytes = bytes;
		this.owner = owner;
		this.entities = new ArrayList<Entity>();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public long getBytes() {
		return bytes;
	}
	
	@Override
	public String getOwner() {
		return owner;
	}
	
	@Override
	public void print() {
		System.out.println("(FOLDER) Name: " + name + " , Bytes: " + bytes + " , Owner: " + owner);
		for(Entity e : entities) {
			e.print();
		}
	}
	
	@Override
	public void add(Entity e) {
		entities.add(e);
	}
	
	@Override
	public void remove(Entity e) {
		entities.remove(e);
	}
}
