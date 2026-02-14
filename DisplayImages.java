import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane pane = new GridPane();

        // Load images
        Image image1 = new Image("image1.png");
        Image image2 = new Image("image2.png");
        Image image3 = new Image("image3.png");
        Image image4 = new Image("image4.png");

        // Create ImageViews
        ImageView iv1 = new ImageView(image1);
        ImageView iv2 = new ImageView(image2);
        ImageView iv3 = new ImageView(image3);
        ImageView iv4 = new ImageView(image4);

        // Add images to GridPane (column, row)
        pane.add(iv1, 0, 0);
        pane.add(iv2, 1, 0);
        pane.add(iv3, 0, 1);
        pane.add(iv4, 1, 1);

        // Create and show scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
