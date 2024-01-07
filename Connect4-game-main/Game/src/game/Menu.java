package game;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
public class Menu extends Application
{
    static String color_p1=null;
    static String color_p2=null;
      show_button button;
     static Stage primaryStagee=new Stage();
     static int i=0;
     Open open;
	@Override
	public void start(Stage primaryStage) throws Exception {
            button=new show_button();
            primaryStagee.setTitle("CONECT4");
		 open=new Open() ;
                 if(i==0)
                 {
                     button.show_button();
                open.open_window(primaryStagee,"/ic/back_ground.jpg",button);
                 }
                 else if(i==6)
                 {
                     button.show_buttoncolorP1();
                     open.open_window(primaryStagee,"/ic/back_ground.jpg",button);
                 }
                  else if(i==7)
                 {
                     button.show_buttoncolorP2();
                     open.open_window(primaryStagee,"/ic/back_ground.jpg",button);
                 }
                 else if(i==1)
                 { button.show_buttons();
                       open.open_window(primaryStage,"/ic/conect4.jpg",button);
                 }
                 else if(i==2||i==3)
                 {
                     button.show_buttons();
                     if(i==2)
                open.open_window(primaryStage,"/ic/about_us.jpeg",button);
                     else
                          open.open_window(primaryStage,"/ic/how to play.jpg",button);
                 }
               else if(i==4||i==5)
                 {
                     button.show_button_win();
                     if(i==4)
                open.open_window(primaryStage,"/ic/red winner.jpeg",button);
                     else
                          open.open_window(primaryStage,"/ic/yellow winner.jpeg",button);
                 }		
	}

        public static void main(String[]args)
        {
            launch(args);
        }
         
	
	
}