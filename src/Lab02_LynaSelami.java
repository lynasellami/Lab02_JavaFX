import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lab02_LynaSelami extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane(); // placeholder root
        Scene scene = new Scene(root, 250, 300);
        stage.setTitle("Java Games");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
