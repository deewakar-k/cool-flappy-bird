package com.daksh.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.daksh.game.CoolFlappyBird;

public class MenuState extends State{
   private Texture background;
   private Texture playButton;

   public MenuState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, (CoolFlappyBird.WIDTH / 2), (CoolFlappyBird.HEIGHT / 2));
        background = new Texture("playbg.png");
        playButton = new Texture("playbutton2.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
       handleInput();

    }

    @Override
    public void render(SpriteBatch sb){
       sb.setProjectionMatrix(cam.combined);
      sb.begin();
      //sb.draw(background, 0, 0, CoolFlappyBird.WIDTH, CoolFlappyBird.HEIGHT);
        sb.draw(background, 0, 0);
      //sb.draw(playButton, (float) ((CoolFlappyBird.WIDTH / 2.1) - (float) (playButton.getWidth() / 3.0)), (float) (CoolFlappyBird.HEIGHT / 3.6));
        sb.draw(playButton, cam.position.x - playButton.getWidth() / 2, cam.position.y);
      sb.end();
    }

    @Override
    public void dispose() {
       background.dispose();
       playButton.dispose();
       System.out.println("menu state disposed");
    }
}
