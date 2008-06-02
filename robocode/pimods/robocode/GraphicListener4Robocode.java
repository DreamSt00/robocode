/******************************************************************************
 * Copyright (c) 2008 Marco Della Vedova, Matteo Foppiano
 * and Pimods contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.pixelinstrument.net/license/cpl-v10.html
 ******************************************************************************/

package pimods.robocode;

import javax.media.opengl.GL;

import pimods.GraphicListener;
import javax.media.opengl.GLAutoDrawable;


/**
 * @author Marco Della Vedova - pixelinstrument.net
 * @author Matteo Foppiano - pixelinstrument.net
 */

public class GraphicListener4Robocode extends GraphicListener {
	public void init( GLAutoDrawable drawable ) {
		GL gl=drawable.getGL();

		Field.setTextureBP( GraphicListener.loadTextureFromModel( gl, Field.modelBP ) );
		Field.setTextureRW( GraphicListener.loadTextureFromModel( gl, Field.modelRW ) );
		Field.setTextureWT( GraphicListener.loadTextureFromModel( gl, Field.modelWT ) );
		Bullet.setTexture( GraphicListener.loadTextureFromModel( gl, Bullet.model ) );
		Tank.setTexture( GraphicListener.loadTextureFromModel( gl, Tank.model ) );
		Text3D.setTexture( GraphicListener.loadTextureFromModel( gl, Text3D.model ) );
		Explosion.setTextureSparkle( GraphicListener.loadTextureFromModel( gl, Explosion.modelSparkle ) );
		Explosion.setTextureSmoke( GraphicListener.loadTextureFromModel( gl, Explosion.modelSmoke ) );
		SkyDome.setTexture( GraphicListener.loadTextureFromModel( gl, SkyDome.model ) );
		Track.setTexture( GraphicListener.loadTextureFromModel( gl, Track.model ) );
	

		gl.glTexEnvi( GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_MODULATE );
		gl.glLightModeli( GL.GL_LIGHT_MODEL_COLOR_CONTROL, GL.GL_SEPARATE_SPECULAR_COLOR );

		super.init( drawable );
	}
}