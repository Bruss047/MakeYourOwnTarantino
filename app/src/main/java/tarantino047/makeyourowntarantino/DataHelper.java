package tarantino047.makeyourowntarantino;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by Javi047 on 13/6/2017.
 */

public class DataHelper extends OrmLiteSqliteOpenHelper {


    public static final String NOMBRE_BD="tarantino_GHHH771";
    public static final int VERSION_BD=6;


    public DataHelper (Context context){
     super(context, NOMBRE_BD,null, VERSION_BD);

    }




    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {

            TableUtils.createTable(connectionSource,Pelicula.class);
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
