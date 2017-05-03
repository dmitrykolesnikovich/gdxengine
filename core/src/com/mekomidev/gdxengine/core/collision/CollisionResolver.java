package com.mekomidev.gdxengine.core.collision;

import java.util.List;

import com.mekomidev.gdxengine.core.geometry.Shape;

public interface CollisionResolver {
	public List<Collision> checkCollisions(Iterable<Shape> shapes);
	public Collision checkCollision(Shape a, Shape b);
	
	public static class Collision {
		public final Shape a, b;
		
		public Collision(Shape a, Shape b) {
			this.a = a;
			this.b = b;
		}
	}
}
