package tarantino047.makeyourowntarantino;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.provider.ContactsContract;
import android.widget.ImageView;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Javi047 on 13/6/2017.
 */


@DatabaseTable(tableName = "peliculas")
public class Pelicula {


    @DatabaseField(id = true)
    private int id;

    @DatabaseField
    private String nombre;

    @DatabaseField
    private String fecha;

    @DatabaseField
    private String cast;

    @DatabaseField
    private String sinopsis;


    @DatabaseField
    private String img;

    @DatabaseField
    private int imgdetalle;

    @DatabaseField
    private int imgcaptura;








    public Pelicula() {
    }


    public Pelicula(int id, String nombre, String fecha, String cast, String sinopsis, String img, int imgdetalle, int imgcaptura) {
        this.id = id;
        this.nombre = nombre;
        this.fecha=fecha;
        this.cast=cast;
        this.sinopsis=sinopsis;
        this.img=img;
        this.imgdetalle=imgdetalle;
        this.imgcaptura=imgcaptura;




    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getImgdetalle() {
        return imgdetalle;
    }

    public void setImgdetalle(int imgdetalle) {
        this.imgdetalle = imgdetalle;
    }

    public int getImgcaptura() {
        return imgcaptura;
    }

    public void setImgcaptura(int imgcaptura) {
        this.imgcaptura = imgcaptura;
    }
}

