package in.blogspot.randomcompiler.composite.pattern.impl;

import in.blogspot.randomcompiler.composite.pattern.api.Entity;

public class File extends Entity {
	private String name;
	private long bytes;
	private String owner;
	
	public File(String name, long bytes, String owner) {
		this.name = name;
		this.bytes = bytes;
		this.owner = owner;
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
		System.out.println("(FILE) Name: " + name + " , Bytes: " + bytes + " , Owner: " + owner);
	}
}
