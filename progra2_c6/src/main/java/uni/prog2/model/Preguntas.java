package uni.prog2.model;

public class Preguntas {
    private int id;
    private String seccion;
    private String pregunta_id;
    private String respuesta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(String pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
