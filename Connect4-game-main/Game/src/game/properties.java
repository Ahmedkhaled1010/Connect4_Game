/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author OMEN
 */
public abstract class  properties {
    Pane root;
    Image img;
    ImageView imgview;
    Scene sence;
    abstract void inser_img(String ad_photo,show_button button);
    abstract void open_window(Stage primaryStage,String ad_photo,show_button button);
}
