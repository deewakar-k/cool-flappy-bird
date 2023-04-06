package com.daksh.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera cam; //for position in the world
    protected Vector3 mouse; //x y z coordinate system
    protected GameStateManager gsm; //to manage our states

    protected State(GameStateManager gsm) {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstract void handleInput();
    public abstract void update(float dt); //delta time | difference between 1 frame rendered and next frame rendered
    public abstract void render(SpriteBatch sb); //to render all we need
    public abstract void dispose();
}
