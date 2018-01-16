package tarantino047.makeyourowntarantino;

/**
 * Created by Javi047 on 29/6/2017.
 */

public class Mix {

    private  String nombre;
    private String sinopsis;
    private String critica;
    private String calificacion;



    public  Mix (String nombre,String sinopsis,String critica, String calificacion){
        this.nombre=nombre;
        this.sinopsis=sinopsis;
        this.critica=critica;
        this.calificacion=calificacion;



    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }



    public String getCritica() {
        return critica;
    }

    public void setCritica(String critica) {
        this.critica = critica;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
