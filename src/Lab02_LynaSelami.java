// Lab02 - Fall 2025
// Student: Lyna Selami
// Repo link: https://github.com/lynasellami/Lab02_JavaFX


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

    // Constants from the lab spec
    private static final String TITLE_TOP = "Random Game";     // Top label text
    private static final String TITLE_BOTTOM = "Waiting…";     // Bottom label text
    private static final int RANDOM_MIN = 101;                 // inclusive
    private static final int RANDOM_MAX = 120;                 // inclusive
    private static final String IMAGES_DIR = "file:images/";   // project-root "images" folder (not in src)

    @Override
    public void start(Stage primaryStage) {
        // ---------- Root layout: BorderPane ----------
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // ---------- Top & Bottom labels ----------
        Label lblTop = new Label(TITLE_TOP);
        Label lblBottom = new Label(TITLE_BOTTOM);
        BorderPane.setMargin(lblTop, new Insets(5));
        BorderPane.setMargin(lblBottom, new Insets(5));
        root.setTop(lblTop);
        root.setBottom(lblBottom);

        // ---------- Center VBox with image label ----------
        Label lblImage = new Label();            // starts blank; we’ll setGraphic() with an ImageView
        VBox middle = new VBox(lblImage);
        middle.setAlignment(Pos.CENTER);
        middle.setPadding(new Insets(10));
        root.setCenter(middle);

        // ---------- Random image selection ----------
        int number = randomBetween(RANDOM_MIN, RANDOM_MAX);
        String path = IMAGES_DIR + number + ".jpg";      // e.g., file:images/107.png
        Image img = new Image(path, true);               // background loading true (safe here)
        ImageView iv = new ImageView(img);

        // Optional: fit image nicely if your PNGs are large; comment out if not needed.
        iv.setPreserveRatio(true);
        iv.setFitWidth(200);      // tweak if your image is too big/small
        // iv.setFitHeight(220);

        lblImage.setGraphic(iv);

        // ---------- Stage & Scene ----------
        Scene scene = new Scene(root, 250, 300);         // lab’s suggested size
        primaryStage.setTitle("Java Games");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Utility: inclusive random int in [min, max]
    private static int randomBetween(int minInclusive, int maxInclusive) {
        if (minInclusive > maxInclusive) throw new IllegalArgumentException("min > max");
        return new Random().nextInt(maxInclusive - minInclusive + 1) + minInclusive;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

