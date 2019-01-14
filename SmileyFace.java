//this is about the GUI program
import javafx.application.Application;     
import javafx.stage.Stage;                 
import javafx.scene.Scene;                 
import javafx.scene.layout.Pane;           
import javafx.scene.paint.Color;           
import javafx.scene.shape.*;  
import javafx.scene.control.*;
 
public class SmileyFace extends Application{
   @Override
   public void start(Stage primaryStage){
      Circle face=new Circle();
      Circle left_eye=new Circle();
      Circle right_eye=new Circle();
      //set the face
      face.setCenterX(150);
      face.setCenterY(150);
      face.setRadius(100);
      face.setFill(Color.YELLOW);
      face.setStroke(Color.BLACK);
      //set the left eye
      left_eye.setCenterX(110);
      left_eye.setCenterY(110);
      left_eye.setRadius(10);
      left_eye.setFill(Color.BLACK);
      left_eye.setStroke(Color.BLACK);
      //set the right eye
      right_eye.setCenterX(190);
      right_eye.setCenterY(110);
      right_eye.setRadius(10);
      right_eye.setFill(Color.BLACK);
      right_eye.setStroke(Color.BLACK);
      //set the mouth
      Arc arc1=new Arc(150,200,20,30,-10,-160);
      arc1.setStroke(Color.BLACK);
      arc1.setFill(Color.YELLOW);
      
      Pane pane=new Pane();
      Label label = new Label("Player1");
      pane.getChildren().add(face);
      pane.getChildren().add(left_eye);
      pane.getChildren().add(right_eye);
      pane.getChildren().add(arc1);
      pane.getChildren().add(label);
      
      Scene scene=new Scene(pane,350,350);
      primaryStage.setTitle("Player1");
      primaryStage.setScene(scene);
      primaryStage.setX(0);
      primaryStage.setY(50);
      primaryStage.show();
      
      Circle face1=new Circle();
      Circle left_eye1=new Circle();
      Circle right_eye1=new Circle();
      //set the face
      face1.setCenterX(150);
      face1.setCenterY(150);
      face1.setRadius(100);
      face1.setFill(Color.LIGHTBLUE);
      face1.setStroke(Color.BLACK);
      //set the left eye
      left_eye1.setCenterX(110);
      left_eye1.setCenterY(110);
      left_eye1.setRadius(10);
      left_eye1.setFill(Color.BLACK);
      left_eye1.setStroke(Color.BLACK);
      //set the right eye
      right_eye1.setCenterX(190);
      right_eye1.setCenterY(110);
      right_eye1.setRadius(10);
      right_eye1.setFill(Color.BLACK);
      right_eye1.setStroke(Color.BLACK);
      //set the mouth
      Arc arc11=new Arc(150,200,20,30,-10,-160);
      arc11.setStroke(Color.BLACK);
      arc11.setFill(Color.LIGHTBLUE);
      
      Pane pane1=new Pane();
      Label label1 = new Label("Player2");
      pane1.getChildren().add(face1);
      pane1.getChildren().add(left_eye1);
      pane1.getChildren().add(right_eye1);
      pane1.getChildren().add(arc11);
      pane1.getChildren().add(label1);
      
      Scene scene1=new Scene(pane1,350,350);
      Stage primaryStage1 = new Stage();
      primaryStage1.setTitle("Player2");
      primaryStage1.setScene(scene1);
      primaryStage1.setX(350);
      primaryStage1.setY(50);
      primaryStage1.show();
      
      Circle face2=new Circle();
      Circle left_eye2=new Circle();
      Circle right_eye2=new Circle();
      //set the face
      face2.setCenterX(150);
      face2.setCenterY(150);
      face2.setRadius(100);
      face2.setFill(Color.PINK);
      face2.setStroke(Color.BLACK);
      //set the left eye
      left_eye2.setCenterX(110);
      left_eye2.setCenterY(110);
      left_eye2.setRadius(10);
      left_eye2.setFill(Color.BLACK);
      left_eye2.setStroke(Color.BLACK);
      //set the right eye
      right_eye2.setCenterX(190);
      right_eye2.setCenterY(110);
      right_eye2.setRadius(10);
      right_eye2.setFill(Color.BLACK);
      right_eye2.setStroke(Color.BLACK);
      //set the mouth
      Arc arc12=new Arc(150,200,20,30,-10,-160);
      arc12.setStroke(Color.BLACK);
      arc12.setFill(Color.PINK);
      
      Pane pane2=new Pane();
      Label label2 = new Label("Player3");
      pane2.getChildren().add(face2);
      pane2.getChildren().add(left_eye2);
      pane2.getChildren().add(right_eye2);
      pane2.getChildren().add(arc12);
      pane2.getChildren().add(label2);
      
      Scene scene2=new Scene(pane2,350,350);
      Stage primaryStage2 = new Stage();
      primaryStage2.setTitle("Player3");
      primaryStage2.setScene(scene2);
      primaryStage2.setX(700);
      primaryStage2.setY(50);
      primaryStage2.show();
      
      Circle face3=new Circle();
      Circle left_eye3=new Circle();
      Circle right_eye3=new Circle();
      //set the face
      face3.setCenterX(150);
      face3.setCenterY(150);
      face3.setRadius(100);
      face3.setFill(Color.WHITE);
      face3.setStroke(Color.BLACK);
      //set the left eye
      left_eye3.setCenterX(110);
      left_eye3.setCenterY(110);
      left_eye3.setRadius(10);
      left_eye3.setFill(Color.BLACK);
      left_eye3.setStroke(Color.BLACK);
      //set the right eye
      right_eye3.setCenterX(190);
      right_eye3.setCenterY(110);
      right_eye3.setRadius(10);
      right_eye3.setFill(Color.BLACK);
      right_eye3.setStroke(Color.BLACK);
      //set the mouth
      Arc arc13=new Arc(150,200,20,30,-10,-160);
      arc13.setStroke(Color.BLACK);
      arc13.setFill(Color.WHITE);
      
      Pane pane3=new Pane();
      Label label3 = new Label("Player4");
      pane3.getChildren().add(face3);
      pane3.getChildren().add(left_eye3);
      pane3.getChildren().add(right_eye3);
      pane3.getChildren().add(arc13);
      pane3.getChildren().add(label3);
      
      Scene scene3=new Scene(pane3,300,350);
      Stage primaryStage3 = new Stage();
      primaryStage3.setTitle("Player4");
      primaryStage3.setScene(scene3);
      primaryStage3.setX(1050);
      primaryStage3.setY(50);
      primaryStage3.show();



   }
   public static void main(String[]args){
      launch(args);
   }
}