/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author OMEN
 */
public class menu_button_pro extends StackPane  {
     
           private Text text;
               private  Rectangle border;
           public void menu_button_name(String name)
           {
               text=new Text(name);
               text.setFont(text.getFont().font(23));
               text.setFill(Color.WHITE);
                border=new Rectangle(250,40);  
           border.setFill(Color.BLACK);
            border.setOpacity(.3);
       
           setAlignment(Pos.CENTER_LEFT);
           setRotate(-.6);
           getChildren().addAll(border,text);
           setOnMouseEntered(event->{
               border.setTranslateX(30);
              text.setTranslateX(30);
              border.setFill(Color.WHITE);
              text.setFill(Color.BLACK);
           });
            
            setOnMouseExited(event->{
               border.setTranslateX(0);
              text.setTranslateX(0);
              border.setFill(Color.BLACK);
              text.setFill(Color.WHITE);
           });
           
           }
           
            
       
    
}
