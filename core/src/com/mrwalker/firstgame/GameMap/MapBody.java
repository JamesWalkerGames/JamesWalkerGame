package com.mrwalker.firstgame.GameMap;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.mrwalker.firstgame.Contact.EntityIdentification;
import com.mrwalker.firstgame.WorldManager;

public class MapBody {

    private BodyDef bodyDef;
    private Body body;
    private PolygonShape shape;

    public MapBody(float[] vertices, EntityIdentification identification) {
        bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;

        body = WorldManager.getWorld().createBody(bodyDef);

        shape = new PolygonShape();
        shape.set(vertices);
        body.createFixture(shape, 1f);
        body.setUserData(identification);
        shape.dispose();
    }
}
