package sut.game01.core;

/**
 * Created by Administrator on 23/3/2559.
 */
import static playn.core.PlayN.*;

import tripleplay.game.Screen;
import tripleplay.game.ScreenStack;
import tripleplay.game.UIScreen;
import playn.core.Font;
import tripleplay.ui.Root;
import tripleplay.ui.*;
import tripleplay.ui.layout.*;
import react.UnitSlot;


public class Homescreen extends UIScreen{

    public static final Font TITLE_FONT =  graphics().createFont("Helvatica",Font.Style.PLAIN,24);




    private  TestScreen testScreen;

    private   ScreenStack ss;
    private  Root root;

public Homescreen(ScreenStack ss){

    this.ss = ss;
    this.testScreen = new TestScreen(ss);

}

    @Override
    public void wasShown () {
        super.wasShown();
        root = iface.createRoot(
                AxisLayout.vertical().gap(15),
                SimpleStyles.newSheet(), this.layer) ;
        root.addStyles(Style.BACKGROUND.is(Background.bordered(0xFFCCCCCC, 0xFF99CCFF, 5)
                .inset(5, 10))) ;


        root.setSize(width(), height());

        root.add(new Label("Event Driven Programing")
                .addStyles(Style.FONT.is(Homescreen.TITLE_FONT)));


    root.add(new Button("Start").onClick(new UnitSlot(){
        public void onEmit(){

            ss.push(testScreen);

        }




    }));




    }




}
