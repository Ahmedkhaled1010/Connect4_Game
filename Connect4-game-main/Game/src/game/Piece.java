/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;


import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import javafx.scene.shape.Circle;



/**
 *
 * @author Ahmed Tarek
 */
public class Piece extends Circle{
    private static final int TILE_SIZE=80;
     final boolean red;
        public Piece(boolean red){
            // check if entered color is true put red color else put yellow
          
         super(TILE_SIZE/2,red?Color.web(Menu.color_p1):Color.web(Menu.color_p2));

            this.red=red;
            
            setCenterX(TILE_SIZE/2);
            setCenterY(TILE_SIZE/2);
        }

}
