import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Lab02_LynaSelami extends Application {

    private static final String TITLE_TOP = "Random Game";
    private static final String TITLE_BOTTOM = "Waiting…";
    private static final int RANDOM_MIN = 101;
    private static final int RANDOM_MAX = 120;
    private static final String IMAGES_DIR = "file:images/";

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        Label lblTop = new Label(TITLE_TOP);
        Label lblBottom = new Label(TITLE_BOTTOM);
        BorderPane.setMargin(lblTop, new Insets(5));
        BorderPane.setMargin(lblBottom, new Insets(5));
        root.setTop(lblTop);
        root.setBottom(lblBottom);

        Label lblImage = new Label("Loading image…");
        VBox middle = new VBox(lblImage);
        middle.setAlignment(Pos.CENTER);
        middle.setPadding(new Insets(10));
        root.setCenter(middle);

        int number = randomBetween(RANDOM_MIN, RANDOM_MAX);
        String path = IMAGES_DIR + number + ".png";
        System.out.println("Selected image path = " + path);

        Image img = new Image(path, true); // background loading ok here
        ImageView iv = new ImageView(img);
        lblImage.setText(null);            // clear placeholder text
        lblImage.setGraphic(iv);

        Scene scene = new Scene(root, 250, 300);
        stage.setTitle("Java Games");
        stage.setScene(scene);
        stage.show();
    }

    private static int randomBetween(int minInclusive, int maxInclusive) {
        return new Random().nextInt(maxInclusive - minInclusive + 1) + minInclusive;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

