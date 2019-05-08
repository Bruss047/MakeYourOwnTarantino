package tarantino047.makeyourowntarantino.Actividades;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tarantino047.makeyourowntarantino.Fragment_detalle;
import tarantino047.makeyourowntarantino.Fragment_lista;
import tarantino047.makeyourowntarantino.R;

public class Activity_Principal extends AppCompatActivity implements Fragment_lista.Callbacks  {

    private boolean dosFragmentos;
    private Button make;
    private Typeface cap;
    private MediaPlayer mp;
    static boolean checkPrimerinicio=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal_listado);

        if(checkPrimerinicio){
            mp = MediaPlayer.create(this, R.raw.intro);
            mp.start();
            checkPrimerinicio=false;
        }


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("| MakeYourOwnTarantino |");
        getSupportActionBar().setIcon(R.drawable.logoaction);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        make=(Button)findViewById(R.id.myt);

        String fuente = "font/Dust West.otf";

        this.cap = Typeface.createFromAsset(getAssets(), fuente);
        make.setTypeface(cap);

        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity_Principal.this,MakeYTarantino.class);

                startActivity(intent);
            }
        });


        if (findViewById(R.id.framelayout_contenedor_detalle) != null) {
            dosFragmentos = true;
        }
    }

    @Override
    public void onEntradaSelecionada(String id) {
        if (dosFragmentos) {
            Bundle arguments = new Bundle();
            arguments.putString(Fragment_detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            Fragment_detalle fragment = new Fragment_detalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_contenedor_detalle, fragment).commit();

        } else {
            Intent detailIntent = new Intent(this, Activity_Detalle.class);
            detailIntent.putExtra(Fragment_detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            startActivity(detailIntent);
        }
    }
}
