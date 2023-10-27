# JavaSwing_recetas
Systema de gestion de recetas de cocina

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "myusername";
        String password = "mypassword";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();

            String createUsuarios = "CREATE TABLE usuarios ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "nombre VARCHAR(255) NOT NULL,"
                    + "correo_electronico VARCHAR(255) NOT NULL,"
                    + "contrasena VARCHAR(255) NOT NULL,"
                    + "PRIMARY KEY (id)"
                    + ")";
            statement.executeUpdate(createUsuarios);

            String createRecetas = "CREATE TABLE recetas ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "titulo VARCHAR(255) NOT NULL,"
                    + "descripcion TEXT NOT NULL,"
                    + "tiempo_preparacion INT NOT NULL,"
                    + "tiempo_coccion INT NOT NULL,"
                    + "porciones INT NOT NULL,"
                    + "dificultad VARCHAR(255) NOT NULL,"
                    + "imagen VARCHAR(255) NOT NULL,"
                    + "usuario_id INT NOT NULL,"
                    + "PRIMARY KEY (id),"
                    + "FOREIGN KEY (usuario_id) REFERENCES usuarios(id)"
                    + ")";
            statement.executeUpdate(createRecetas);

            String createIngredientes = "CREATE TABLE ingredientes ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "nombre VARCHAR(255) NOT NULL,"
                    + "cantidad VARCHAR(255) NOT NULL,"
                    + "PRIMARY KEY (id)"
                    + ")";
            statement.executeUpdate(createIngredientes);

            String createRecetasIngredientes = "CREATE TABLE recetas_ingredientes ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "receta_id INT NOT NULL,"
                    + "ingrediente_id INT NOT NULL,"
                    + "PRIMARY KEY (id),"
                    + "FOREIGN KEY (receta_id) REFERENCES recetas(id),"
                    + "FOREIGN KEY (ingrediente_id) REFERENCES ingredientes(id)"
                    + ")";
            statement.executeUpdate(createRecetasIngredientes);

            String createPasos = "CREATE TABLE pasos ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "descripcion TEXT NOT NULL,"
                    + "orden INT NOT NULL,"
                    + "receta_id INT NOT NULL,"
                    + "PRIMARY KEY (id),"
                    + "FOREIGN KEY (receta_id) REFERENCES recetas(id)"
                    + ")";
            statement.executeUpdate(createPasos);

            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            System.err.println("Error creating tables: " + e.getMessage());
        }
    }
}
```
