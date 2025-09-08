import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX 24!");
        Scene scene = new Scene(label, 420, 200);
        stage.setTitle("Demo JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);  // launches the JavaFX runtime
    }
}