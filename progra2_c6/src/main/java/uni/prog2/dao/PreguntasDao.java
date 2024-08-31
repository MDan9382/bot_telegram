package uni.prog2.dao;

import uni.prog2.db.DatabaseConnection;
import uni.prog2.model.Preguntas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreguntasDao {

    public void InsertRespuesta(Preguntas pregunta) throws SQLException {
       String query = "INSERT INTO preguntas (seccion, telegram_id, pregunta_id, respuesta_texto) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, pregunta.getSeccion());
            statement.setString(2, pregunta.getSeccion());
            statement.setString(3, pregunta.getPregunta_id());
            statement.setString(4, pregunta.getRespuesta());

        }

    }

}
