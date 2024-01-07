package game;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
   class show_button extends Parent
        {
        Menu menu=new Menu();
            public void show_button()
            {
                 VBox menu0=new VBox(40);
                  menu0.setTranslateY(300);
                  menu0.setTranslateX(100);
                  menu_button_pro[] button=new menu_button_pro[4];
                  for(int i=0;i<4;i++)
                  {
                      button[i]=new menu_button_pro();
                  }
                  button[0].menu_button_name("START");
                    button[1].menu_button_name("How TO PLAY");
                      button[2].menu_button_name("ABOUT US");
                        button[3].menu_button_name("EXIT");
               button[0].setOnMouseClicked(event->{

                      try {
                    Menu.i=6;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                 button[1].setOnMouseClicked(event->{
               try {
                    
                    Menu.i=3;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 });
                   button[2].setOnMouseClicked(event->{
               try {
                    Menu.i=2;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                     button[3].setOnMouseClicked(event->{
               Menu.primaryStagee.close();
               
                 });
               menu0.getChildren().addAll(button[0],button[1],button[2],button[3]);
              getChildren().addAll(menu0);
            }
              public void show_buttons()
            {
                 VBox menu0=new VBox(40);
                  menu0.setTranslateY(10);
                  menu0.setTranslateX(0);
                  menu_button_pro button=new menu_button_pro();
                 button.menu_button_name("BACK");
   button.setOnMouseClicked(event->{
               try {
                    Menu.i=0;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
               menu0.getChildren().addAll(button);
              
              getChildren().addAll(menu0);
            }
                 public void show_button_win()
            {
                 VBox menu0=new VBox(40);
                  menu0.setTranslateY(10);
                  menu0.setTranslateX(0);      
                  menu_button_pro[] button=new menu_button_pro[2];
                  for(int i=0;i<2;i++)
                  {
                      button[i]=new menu_button_pro();
                  }
                  button[0].menu_button_name("New Game");
                    button[1].menu_button_name("Back To Menu");
                      
               button[0].setOnMouseClicked(event->{

                      try {
                    
                    Menu.i=1;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                 button[1].setOnMouseClicked(event->{
               try {
                    
                    Menu.i=0;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 });
               menu0.getChildren().addAll(button);
              
              getChildren().addAll(menu0);
            }
                 public void show_buttoncolorP1()
                 { VBox menu0=new VBox(40);
                   VBox menu1=new VBox(40);
                  menu0.setTranslateY(10);
                  menu0.setTranslateX(0); 
                   menu1.setTranslateY(400);
                  menu1.setTranslateX(100);
                menu_button_pro button_back=new menu_button_pro();
                   menu_button_pro[] button=new menu_button_pro[3];
                  for(int i=0;i<3;i++)
                  {
                      button[i]=new menu_button_pro();
                  }
                  button_back.menu_button_name("BACK");
                  button[0].menu_button_name("RED_P1");
                    button[1].menu_button_name("BLACK_P1");
                      button[2].menu_button_name("GREEN_P1");
                        button_back.setOnMouseClicked(event->{

                      try {
                    Menu.i=0;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                       button[0].setOnMouseClicked(event->{

                      try {
                    Menu.color_p1="RED";
                    Menu.i=7;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                 button[1].setOnMouseClicked(event->{
               try {
                     Menu.color_p1="BLACK";
                    Menu.i=7;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 });
                  button[2].setOnMouseClicked(event->{
               try {
                     Menu.color_p1="GREEN";
                    Menu.i=7;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 });
                    menu0.getChildren().addAll(button_back);
               menu1.getChildren().addAll(button[0],button[1],button[2]);
              getChildren().addAll(menu0,menu1);
                 }
                 
                   public void show_buttoncolorP2()
                 { VBox menu0=new VBox(40);
                   VBox menu1=new VBox(40);
                  menu0.setTranslateY(10);
                  menu0.setTranslateX(0); 
                   menu1.setTranslateY(400);
                  menu1.setTranslateX(100);
                menu_button_pro button_back=new menu_button_pro();
                   menu_button_pro[] button=new menu_button_pro[3];
                  for(int i=0;i<3;i++)
                  {
                      button[i]=new menu_button_pro();
                  }
                  button_back.menu_button_name("BACK");
                  button[0].menu_button_name("WHITE_P2");
                    button[1].menu_button_name("YELLOW_P2");
                      button[2].menu_button_name("BLUE_P2");
                        button_back.setOnMouseClicked(event->{

                      try {
                    Menu.i=6;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                       button[0].setOnMouseClicked(event->{

                      try {
                    Menu.color_p2="WHITE";
                    Menu.i=1;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
               
                 });
                 button[1].setOnMouseClicked(event->{
               try {
                     Menu.color_p2="YELLOW";
                    Menu.i=1;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 });
                  button[2].setOnMouseClicked(event->{
               try {
                     Menu.color_p2="BLUE";
                    Menu.i=1;
                         order();
                     } catch (Exception ex) {
                         Logger.getLogger(show_button.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 });
                    menu0.getChildren().addAll(button_back);
               menu1.getChildren().addAll(button[0],button[1],button[2]);
              getChildren().addAll(menu0,menu1);
                 }
                 
            public void order()throws Exception
            {
               
             menu.start( Menu.primaryStagee);
              
            }
         
        }