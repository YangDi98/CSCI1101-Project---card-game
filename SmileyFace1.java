//this is about the GUI program
import javafx.application.Application;     
import javafx.stage.Stage;                 
import javafx.scene.Scene;                 
import javafx.scene.layout.Pane;           
import javafx.scene.paint.Color;
import javafx.scene.control.*; 
import javafx.scene.shape.*;               
public class SmileyFace1 extends Application{
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
      primaryStage.setX(300);
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
      primaryStage1.setX(750);
      primaryStage1.setY(50);
      primaryStage1.show();

   }
   public static void main(String[]args){
      launch(args);
   }
}