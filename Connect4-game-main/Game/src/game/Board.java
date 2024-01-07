/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.util.ArrayList;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author Ahmed Tarek
 */
public class Board {
    private static final int TILE_SIZE=80;
    private static final int COLUMNS=7;
    private static final int ROWS=6;
    
    Shape makeGrid(){
        Shape shape=new Rectangle((COLUMNS+1)*TILE_SIZE,(ROWS+1)*TILE_SIZE);
        for(int y=0;y<ROWS;y++){
            for(int x=0;x<COLUMNS;x++){
                //fghdffhgfddjghh
                
                //put circle position from x =40 and position =40
                Circle circle=new Circle(TILE_SIZE/2,TILE_SIZE/2,TILE_SIZE/2);
                
                //for each circle translate 20from x& y with respect its poistion
                
                circle.setTranslateX(x*(TILE_SIZE+5)+TILE_SIZE/4);
                circle.setTranslateY(y*(TILE_SIZE+5)+TILE_SIZE/4);
                shape=Shape.subtract(shape, circle);
            }
        }
        Light.Distant light =new Light.Distant();
        light.setAzimuth(45.0);
        light.setElevation(30.0);
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5.0);
        shape.setFill(Color.BLUE);
        shape.setEffect(lighting);
        // translate bord it self
        shape.setTranslateY(200);
        shape.setTranslateX(400);
        return shape;
    }

}
