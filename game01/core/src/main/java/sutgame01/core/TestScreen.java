package sutgame01.core;


import playn.core.*;
import tripleplay.game.Screen;
import tripleplay.game.ScreenStack;
import static playn.core.PlayN.*;

/**
 * Created by USER on 3/24/2016.
 */
public class TestScreen extends Screen{


    private  final ScreenStack ss;
    private  ImageLayer bg ;
    private  ImageLayer backButton;




    public TestScreen(final ScreenStack ss){

        this.ss = ss;

        Image bgImage = assets().getImage("images/bg.png");
        this.bg = graphics().createImageLayer(bgImage);

        Image backImage = assets().getImage("images/backward.png");
        this.backButton = graphics().createImageLayer(backImage);
        backButton.setTranslation(10,10);

        backButton.addListener(new Mouse.LayerAdapter() {

            @Override
            public void onMouseUp(Mouse.ButtonEvent event) {

                ss.remove(ss.top());

            }
        }) ;


    }




    @Override
    public void wasShown(){

        super.wasShown();

        this.layer.add(bg);

        this.layer.add(backButton);


    }


}
