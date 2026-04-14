# Deber 2: Simulación de Carrera con Hilos 🏎️

Este es un proyecto sencillo en Java que utiliza **JavaFX** y **Hilos (Threads)** para simular una carrera entre tres personajes. Fue realizado como parte de las tareas de la universidad para practicar la programación multihilo y el manejo de interfaces gráficas.

###  ¿De qué trata?
La aplicación muestra una ventana con tres carriles donde compiten:
*   🐶 **Perro**
*   🍄 **Hongo**
*   👤 **Persona**

Cada personaje corre de forma independiente gracias a que cada uno funciona en su propio hilo. El avance es aleatorio, por lo que cualquiera puede ganar en cada partida.

### 🛠️ Tecnologías usadas
*   **Java 17+**
*   **JavaFX & FXML**: Para toda la parte visual y diseño de la interfaz.
*   **Threads (Hilos)**: Para que los personajes se muevan al mismo tiempo sin trabar el programa.

### Cómo usarlo
1.  Abrir el proyecto en un IDE  (IntelliJ, Eclipse, etc.).
2.  Asegúrarse de tener configurado el SDK de JavaFX.
3.  Ejecutar la clase `MainApp.java`.
4.  Darle al botón **"Iniciar Carrera"** para ver quién gana y usar **"Reiniciar"** para volver a empezar.
