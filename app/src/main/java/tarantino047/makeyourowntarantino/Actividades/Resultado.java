package tarantino047.makeyourowntarantino.Actividades;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import tarantino047.makeyourowntarantino.R;

public class Resultado extends AppCompatActivity {

    private TextView titulo;
    private TextView sinopsis;
    private TextView critica;
    private TextView puntaje;
    private Typeface cap;

    private Button compartir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        String fuente = "font/American Captain.otf";

        this.cap = Typeface.createFromAsset(getAssets(), fuente);
        titulo = (TextView) findViewById(R.id.titulomix);

        sinopsis = (TextView) findViewById(R.id.sinop);

        critica = (TextView) findViewById(R.id.critica);

        puntaje = (TextView) findViewById(R.id.puntaje);


         compartir=(Button) findViewById(R.id.compartir);


        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle wowi = getIntent().getExtras();
                String titulo=wowi.getString("titulo");
                 String sinop=wowi.getString("sinopsis");

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");

                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "SpyTools: AudioRecord");
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT,titulo+sinop);
                startActivity(Intent.createChooser(sharingIntent, "select app ..."));

                /*Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.pfictionbb);
//Se guarda la imagen en la SDCARD
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                icon.compress(Bitmap.CompressFormat.PNG, 50, bytes);
                File f = new File( Environment.getExternalStorageDirectory() + File.separator + "tmp" + File.separator + "peter.png");
                try {
                    f.createNewFile();
                    FileOutputStream fo = new FileOutputStream(f);
                    fo.write(bytes.toByteArray());
                } catch (Exception e) {
                    Log.e("ERROR", e.getMessage() );
                }
//compartir imagen
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("image/png");
                share.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));
                share.putExtra(Intent.EXTRA_TEXT, "Mi imagen");
                startActivity(Intent.createChooser(share, "Compartir imagen"));*/

            }
        });
        Bundle wow = getIntent().getExtras();


        titulo.setText(wow.getString("titulo"));
        titulo.setTypeface(cap);
        sinopsis.setText(wow.getString("sinopsis"));
        critica.setText(wow.getString("critica"));
        puntaje.setText(wow.getString("calificacion"));


    }
}
