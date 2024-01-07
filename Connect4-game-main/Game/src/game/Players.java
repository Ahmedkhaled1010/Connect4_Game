package game;



import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Tarek
 */
public class Players {
    
    // creat intance from menu
    Menu menu=new Menu();
    private   boolean check[]=new boolean[4];
    private int checkval=0;
    private boolean return_check=false;
    private static final int TILE_SIZE=80;
    private static final int COLUMNS=7;
    private static final int ROWS=6;
    
    //indacte color for entered piece
    private boolean  redmove=true;
    
    //to check winner 
    private boolean  redMove_winnr=true;
    
    
    private Piece[][] grid=new Piece[ROWS][COLUMNS];
    
    private int[] place=new int[2];
    
    boolean game =true;
    
    
    //for copy board function
    private Piece [][] grid2 = new Piece[1][1];
    
    public Pane copyroot = new Pane();
    
    public Pane pieceRoot=new Pane();
    
    
    //first requierd
    void Drop_piece(Piece piece,int column){
        
        //first check for row valid
        final int recieved_column =column;
        int current_row=0;
        for(int i=ROWS-1;i>=0;i--){
            
            if(grid[i][recieved_column]==null){
                
                grid[i][recieved_column]=piece;
                current_row=i;
                
                
                 
                    pieceRoot.getChildren().add(piece);
                    grid[current_row][column].setTranslateX(400+(column*(TILE_SIZE + 5) + TILE_SIZE / 4));


                    //take last piece place
                    place[0]=current_row;
                    place[1]=column;

                    TranslateTransition animation =new TranslateTransition(Duration.seconds(0.7),piece);
                    animation.setToY(200+(current_row*(TILE_SIZE+5)+TILE_SIZE/4));
                    redmove=!redmove;

                    final int currentRow_final=current_row;
                    animation.setOnFinished(e->{

                        if(Find_winner(column,currentRow_final)){

                            //
                            game=false;
                            gameOver();
                        }

                        // take last piece color after animation to check winner
                        redMove_winnr=redmove;

                    });
                    animation.play();
                break;
            }
            
        
        }
       
          
    }
    
    
    //idecator arrow
    List<ImageView> make_indecator(){
        
        // here make array of indecator png with respect to column
        List<ImageView>list=new ArrayList<>();
        Image img=new Image("/ic/indecator.png");
        
        for(int x=0;x<COLUMNS;x++){
            ImageView imageview = new ImageView();
            imageview.setFitHeight((COLUMNS+1)*TILE_SIZE);
            imageview.setImage(img);
            imageview.setOpacity(0);
            
            //for all indecators first shift x by 20 
            imageview.setTranslateX(400+(x*(TILE_SIZE+5)+(TILE_SIZE/4)));
            
            imageview.setTranslateY(100);
            imageview.setOnMouseEntered(e->imageview.setOpacity(100f));
            imageview.setOnMouseExited(e->imageview.setOpacity(0));
            
            
            final int column=x;
//            set_transparant();
            //boolean game check game still going on 
            imageview.setOnMouseClicked(e->{
                if(game==true){
                Drop_piece(new Piece(redmove),column);
                }
            });
            list.add(imageview);
        }
        
        return list;
    }
    
    private boolean Find_winner(int column, int row){
        
      if(return_check==false)
      {
      check_herizontal( row,column);
      }
      check_return_check();
      if(return_check==false)
      {
      check_vertical( row,column);
      }
      check_return_check();
      if(return_check==false)
      {
      check_diagonal_r(row,column);
      }
      check_return_check();
      if(return_check==false)
      {
      check_diagonal_l(row,column);
      }
      check_return_check();
       return return_check;
    }
     public void check_return_check()
    {
        for(int i=0;i<4;i++)
  {
      if(check[i]==true)
          return_check=true;
      else
     {
         return_check=false;
         break;
     }
 }
    }
      public void check_vertical(int row,int column)
    {
        if(row<=2)
        {
           for(int i=0;i<4;i++)
        {
           check[i]=false;
        }
       checkval=0; 
      for(int i=row;i<row+4;i++)
          {
              if(grid[row][column]!=null)
              {
                    if(grid[row][column].getFill()==grid[i][column].getFill())
                    {
                     check[checkval]=true;
                      checkval++;
                    }
                    else
                    {
                        break;
                    }
              }
              else
              {
                  break;
              }
          }
        }
         
    }
    public void check_herizontal(int row,int column)
    {
        for(int i=0;i<4;i++)
        {
           check[i]=false;
        }
       checkval=0;    
      for(int i=0;i<7;i++)
      {
          if(grid[row][i]!=null&&grid[row][column]!=null)
          {
           if(grid[row][column].getFill()==grid[row][i].getFill())
           {
               check[checkval]=true;
               if(checkval==3)
               {
              break;
               }
               else
               {
                   checkval++;
               }
           }
           else
           {
               for(int x=0;x<checkval;x++)
               {
                    check[x]=false;
               }
           checkval=0;
           }
          }
          else
          {
               for(int x=0;x<checkval;x++)
               {
                    check[x]=false;
               }
           checkval=0;
          }
      }
    }
    
    
    private void check_diagonal_r(int row,int column){
        int r1=0,r2=0,a=0;
        int x=column,y=row;   
        for(int i=0;i<4;i++)
        {
           check[i]=false;
        }
       checkval=0;
        while (r1<3){            
            if(x==0||y==0){
                break;
            }
            x--; y--;
            r1++;           
        }
        x=column; y=row;
        while (r2<3){            
            if(x==6||y==5){
                break;
            }
            x++; y++;
            r2++;            
        }
        //System.out.println(r1+" "+r2);
        a= column-r1;
        for(int i=(row-r1);i<=(row+r2);i++){
            if (grid[i][a] !=null&&grid[row][column]!=null){
                if(grid[i][a].getFill()==grid[row][column].getFill()){
                    check[checkval]=true;
                    checkval++;
                }
                else {
                    for(int z=0;z<4;z++)
                    {
                       check[z]=false;
                    }
                   checkval=0;
                }
            }
            else {
                for(int z=0;z<4;z++)
                {
                   check[z]=false;
                }
               checkval=0;
            }          
            a++;
        }       
    }
    
    private void check_diagonal_l(int row,int column){
        int r1=0,r2=0,a=0;  int x=column,y=row; 
        for(int i=0;i<4;i++)
        {
           check[i]=false;
        }
       checkval=0;
        while (r1<3){            
            if(x==6||y==0){
                break;
            }
            x++; y--;
            r1++;           
        }
        x=column; y=row;
        while (r2<3){            
            if(x==0||y==5){
                break;
            }
            x--; y++;
            r2++;            
        }
        //System.out.println(r1+" "+r2);
        a= column+r1;
        for(int i=(row-r1);i<=(row+r2);i++){
            if (grid[i][a] !=null&&grid[row][column]!=null){
                if(grid[i][a].getFill()==grid[row][column].getFill()){
                    check[checkval]=true;
                    checkval++;
                }
                else {
                    for(int z=0;z<4;z++)
                    {
                       check[z]=false;
                    }
                   checkval=0;
                    
                }
            }
            else {                
                for(int z=0;z<4;z++)
                {
                   check[z]=false;
                }
               checkval=0;
            }                      
            a--;
        }
       
    }
   
    
       public void order()throws Exception
            {
               

             menu.start( Menu.primaryStagee);
              
            }
       

       //
    private void gameOver() {
        
       if(redMove_winnr==true)
       {
           
           try {
               Menu.i=4;
               order();
           } catch (Exception ex) {
               Logger.getLogger(Players.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       }
       else
       {
           try {
               Menu.i=5;
               order();
           } catch (Exception ex) {
               Logger.getLogger(Players.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
    
    
    //
    public void copy_board (){   
        for(int x=0;x<ROWS;x++){
            for(int y=0;y<COLUMNS;y++){                                 
                if(grid[x][y]!=null){
                                   
                   try{ copyroot.getChildren().add(grid[x][y]);}
                   catch(Exception e){
                     
                   }
                    
                }                    
            }
        } 
       if(grid[place[0]][place[1]]!=null){
            redmove = !redmove;
            redMove_winnr=redmove;
       }
       copyroot.getChildren().remove(grid[place[0]][place[1]]);
       pieceRoot.getChildren().remove(grid[place[0]][place[1]]);
       grid[place[0]][place[1]]=grid2[0][0];
            
    }

}
