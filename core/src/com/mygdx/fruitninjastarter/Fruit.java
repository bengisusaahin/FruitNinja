package com.mygdx.fruitninjastarter;

import com.badlogic.gdx.math.Vector2;

public class Fruit {

    public static float radius = 60f;
    public enum Type { //enum static yapılar olusturmak icin
        REGULAR, EXTRA, ENEMY, LIFE
    }
    Type type;
    Vector2 pos, velocity;

    Fruit(Vector2 pos, Vector2 velocity){
        this.pos = pos;
        this.velocity = velocity;
        type = Type.REGULAR;
    }

    public boolean clicked(Vector2 click){
        if (pos.dst2(click) <= radius*radius+1) return true;
        return false;
    }

    public final Vector2 getPos(){
        return pos;
    }

    public boolean outOfScreen(){
        return (pos.y < -2f * radius);
    }

    public void update(float deltaTime){
        pos.mulAdd(velocity,deltaTime);
    }
}
