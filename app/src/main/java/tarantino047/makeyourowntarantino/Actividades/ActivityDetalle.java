package tarantino047.makeyourowntarantino.Actividades;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.text.DateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import at.blogc.android.views.ExpandableTextView;
import tarantino047.makeyourowntarantino.R;

import static tarantino047.makeyourowntarantino.R.drawable.pfictionbb;


public class ActivityDetalle extends AppCompatActivity {

    private TextView titulo;
    private TextView cast;
    private ImageView capp;
    private RelativeLayout real;
   int hh = R.drawable.pfictionbb;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ExpandableTextView expandableTextView = (ExpandableTextView) this.findViewById(R.id.expandableTextView);
        final Button buttonToggle = (Button) this.findViewById(R.id.button_toggle);

        expandableTextView.setExpandInterpolator(new OvershootInterpolator());
        expandableTextView.setCollapseInterpolator(new OvershootInterpolator());
        expandableTextView.setAnimationDuration(100L);

        titulo= (TextView)findViewById(R.id.nombre);


        cast= (TextView)findViewById(R.id.cast);

        capp= (ImageView)findViewById(R.id.captura);

        real= (RelativeLayout)findViewById(R.id.rela);

        Bundle extras = getIntent().getExtras();

        expandableTextView.setText(extras.getString("sinopsis"));


        titulo.setText(extras.getString("nombre"));
        cast.setText(extras.getString("cast"));
        capp.setImageResource(extras.getInt("captura"));
        int fondo = extras.getInt("imgdetalle");
        real.setBackgroundResource(fondo);




        buttonToggle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                if (expandableTextView.isExpanded())
                {
                    expandableTextView.collapse();
                    buttonToggle.setBackgroundResource(R.drawable.expandir);
                }
                else
                {
                    expandableTextView.expand();
                    buttonToggle.setBackgroundResource(R.drawable.contraer);
                    ;
                }
            }
        });

        /*titulo= (TextView)findViewById(R.id.titulo);
        cast= (TextView)findViewById(R.id.cast);
        sinopsis= (TextView)findViewById(R.id.sinopsis);
        cyp= (TextView)findViewById(R.id.cyp);
        exp=(ExpandableTextView)findViewById(R.id.expand_text_view);
        exp.setText(tex);


        Bundle extras= getIntent().getExtras();

        String titulos = extras.getString("titulo");*/

        //titulo.setText(titulos);



    }
}
