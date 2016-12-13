package com.kerberjg.gdxstudio.entities;

import com.badlogic.gdx.utils.Disposable;

/** 
 * Defines what a game object should essentially do.
 * This class should serve as a compass of what the development should actually strive to achieve
 * 
 * @hide
 * @author kerberjg
 * */
interface PrimitiveEntity extends Disposable {
	public void create();
	public void render(int lod);
	public void update(float delta);
}	