import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lab02_LynaSelami extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        Label lblTop = new Label("Random Game");
        Label lblBottom = new Label("Waiting…");

        BorderPane.setMargin(lblTop, new Insets(5));
        BorderPane.setMargin(lblBottom, new Insets(5));

        root.setTop(lblTop);
        root.setBottom(lblBottom);

        Scene scene = new Scene(root, 250, 300);
        stage.setTitle("Java Games");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

