package modelo;

import javafx.application.Platform;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import java.util.Random;

public class Personaje extends Thread {
    private String nombre;
    private ImageView imagen;
    private Label labelGanador;
    private static boolean hayGanador = false;
    private double progreso = 0;
    private final double META = 410.0;

    public Personaje(String nombre, ImageView imagen, Label labelGanador) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.labelGanador = labelGanador;
    }

    public static void reiniciarCarrera() {
        hayGanador = false;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (progreso < 1.0 && !hayGanador) {
            try {
                Thread.sleep(random.nextInt(100) + 50);
                progreso += random.nextDouble() * 0.05;
                if (progreso > 1.0) progreso = 1.0;

                final double p = progreso;
                Platform.runLater(() -> imagen.setLayoutX(p * META));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (progreso >= 1.0 && !hayGanador) {
            hayGanador = true;
            Platform.runLater(() -> {
                labelGanador.setText("¡El ganador es: " + nombre + "!");
            });
        }
    }
}
