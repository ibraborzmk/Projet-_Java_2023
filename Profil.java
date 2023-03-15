import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Profil extends Application {
    //creer une frame avec javaFX
@Override
public void start(Stage primaryStage) throws Exception {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Profil.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 600, 400);
    primaryStage.setTitle("Profil");
    primaryStage.setScene(scene);
    primaryStage.show();

}

    public static void main(String[] args){
        launch();
    }


}
