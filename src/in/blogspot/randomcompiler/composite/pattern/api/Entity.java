package in.blogspot.randomcompiler.composite.pattern.api;

public abstract class Entity {
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public long getBytes() {
		throw new UnsupportedOperationException();
	}
	
	public String getOwner() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public void add(Entity e) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Entity e) {
		throw new UnsupportedOperationException();
	}
}
