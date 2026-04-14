package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Personaje;

public class CarreraController {

    @FXML
    private ImageView imgP1;

    @FXML
    private ImageView imgP2;

    @FXML
    private ImageView imgP3;

    @FXML
    private Label lblGanador;

    @FXML
    private Button btnIniciar;

    @FXML
    private Button btnReiniciar;

    @FXML
    public void initialize() {
        try {
            imgP1.setImage(new Image(getClass().getResource("/img/perro.png").toExternalForm()));
            imgP2.setImage(new Image(getClass().getResource("/img/hongo.png").toExternalForm()));
            imgP3.setImage(new Image(getClass().getResource("/img/persona.png").toExternalForm()));
        } catch (Exception e) {
            System.err.println("No se pudieron cargar algunas imágenes: " + e.getMessage());
        }
    }

    @FXML
    public void iniciarCarrera() {
        btnIniciar.setDisable(true);
        Personaje.reiniciarCarrera();
        lblGanador.setText("");

        Personaje p1 = new Personaje("Perro", imgP1, lblGanador);
        Personaje p2 = new Personaje("Hongo", imgP2, lblGanador);
        Personaje p3 = new Personaje("Persona", imgP3, lblGanador);

        p1.start();
        p2.start();
        p3.start();
    }

    @FXML
    public void reiniciarCarrera() {
        imgP1.setLayoutX(0);
        imgP2.setLayoutX(0);
        imgP3.setLayoutX(0);
        lblGanador.setText("");
        btnIniciar.setDisable(false);
        Personaje.reiniciarCarrera();
    }
}
