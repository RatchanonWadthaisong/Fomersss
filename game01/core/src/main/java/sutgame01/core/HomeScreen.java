package sutgame01.core;

/**
 * Created by USER on 3/24/2016.
 */


import tripleplay.game.*;

import playn.core.*;

import static playn.core.PlayN.*;

public class HomeScreen extends Screen {

    private  TestScreen testScreen;

    private final ScreenStack ss;

    private  ImageLayer bg ;
    private  ImageLayer startButton;



    public HomeScreen(final ScreenStack ss) {

        this.testScreen = new TestScreen(ss);

        this.ss = ss;

        Image bgImage = assets().getImage("images/1.jpg");
        this.bg = graphics().createImageLayer(bgImage);

        Image startImage = assets().getImage("images/start.png");
        this.startButton = graphics().createImageLayer(startImage);
        startButton.setTranslation(300,200);

        startButton.addListener(new Mouse.LayerAdapter(){
            @Override
            public void onMouseUp(Mouse.ButtonEvent event) {
                ss.push(testScreen);

            }
        });







    }

    @Override
    public void wasShown(){

        super.wasShown();

        this.layer.add(bg);

        this.layer.add(startButton);


    }








}