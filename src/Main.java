/*
 * Riley Bosetti
 * STN: 1108477
 * */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/tableview.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cutomer List");
        stage.show();
    }
}
