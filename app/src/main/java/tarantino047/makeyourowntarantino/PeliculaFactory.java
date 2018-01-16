package tarantino047.makeyourowntarantino;

import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Javi047 on 13/6/2017.
 */

public class PeliculaFactory {


   private static  PeliculaFactory instance;

    private Dao<Pelicula,Integer> dao;

    public static PeliculaFactory getInstance(Context context){
        if (instance==null)
            instance = new PeliculaFactory(context);
        return instance;

    }

    PeliculaFactory(Context context) { // conexion con BD, se indica con que clase se va a trabajar.

        OrmLiteSqliteOpenHelper helper = OpenHelperManager.getHelper(context, DataHelper.class);

        try {
            dao = helper.getDao(Pelicula.class);
        } catch (SQLException e) {


        }


    }

    public void guardarPeli(Pelicula pelicula)throws  SQLException{
        dao.create(pelicula);
    }

    public void actualizarPeli(Pelicula pelicula)throws  SQLException{
        dao.update(pelicula);
    }

    public List<Pelicula> obtenerPeliculas() throws  SQLException{
        return  dao.queryForAll();

    }


}
