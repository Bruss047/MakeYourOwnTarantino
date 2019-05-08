package tarantino047.makeyourowntarantino.Actividades;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tarantino047.makeyourowntarantino.Fragment_detalle;
import tarantino047.makeyourowntarantino.R;

public class Activity_Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.layout_activity_detalle);

        // Comprobamos que previamente no hayamos entrado en esta actividad (por ejemplo, al rotar el dispositivo). Si es así se añade el fragmento al contenedor
        if (savedInstanceState == null) {
            // Crea el fragmento del detalle de la entrada y lo añade a la actividad
            Bundle arguments = new Bundle();
            arguments.putString(Fragment_detalle.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(Fragment_detalle.ARG_ID_ENTRADA_SELECIONADA));
            Fragment_detalle fragment = new Fragment_detalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.framelayout_contenedor_detalle, fragment).commit();
        }
    }



}
