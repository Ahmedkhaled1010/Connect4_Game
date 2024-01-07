package game;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Open extends properties
{

        @Override
	 void open_window(Stage primaryStage,String ad_photo, show_button button)
        {
          root=new Pane();
		root.setPrefSize(1920, 1000);
                sence=new Scene(root);
                if(Menu.i==1)
                {
                    inser_img(ad_photo);
                   
                }
                else
                {
                 inser_img(ad_photo,button); 
                }
                 if(Menu.i==1)
                 {
                       Board board=new Board();
                       Players players=new Players();
                       sence.setOnKeyPressed(e ->{
                     KeyCode keyCode = e.getCode();
                     if (keyCode.equals(KeyCode.SPACE)) {
                        players.copy_board();
                       root.getChildren().remove(players.pieceRoot);
                        root.getChildren().remove(button);
                       root.getChildren().add(players.copyroot); 
                       players.pieceRoot=players.copyroot;  
                       root.getChildren().addAll(players.make_indecator());
                                           root.getChildren().addAll(button);       

                     }
                    });

                       
                    root.getChildren().addAll(board.makeGrid());
                    root.getChildren().addAll(players.pieceRoot);
                    root.getChildren().addAll(players.make_indecator());
                    root.getChildren().addAll(button);
                 }
                
                primaryStage.setScene(sence);
       primaryStage.show(); 
        }

 
    @Override
    public void inser_img(String ad_photo,show_button button) {
        img=new Image(ad_photo);
                imgview=new ImageView(img);
                imgview.setFitHeight(1000);
                imgview.setFitWidth(1920);
                 root.getChildren().addAll(imgview,button);

    }
        public void inser_img(String ad_photo) {
        img=new Image(ad_photo);
                imgview=new ImageView(img);
                imgview.setFitHeight(1000);
                imgview.setFitWidth(1920);
                 root.getChildren().addAll(imgview);

    }
}