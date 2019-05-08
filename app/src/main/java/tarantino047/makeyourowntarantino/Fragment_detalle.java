package tarantino047.makeyourowntarantino;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Javi047 on 27/4/2019.
 */

public class Fragment_detalle extends android.support.v4.app.Fragment {

    public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";
    private Lista_contenido.Peliculax mItem;



    public Fragment_detalle() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {
            //Cargamos el contenido de la entrada con cierto ID seleccionado en la lista. Se recomiendo usar un Loader para cargar el contenido
            mItem = Lista_contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_detalle, container, false);


        //Mostramos el contenido al usuario
        if (mItem != null) {
            int background = mItem.imgdetalle;
            ((RelativeLayout) rootView.findViewById(R.id.fondo)).setBackgroundResource(background);
            ((TextView) rootView.findViewById(R.id.nombre)).setText(mItem.nombre);
            ((TextView) rootView.findViewById(R.id.sinopsis)).setText(mItem.sinopsis);
            ((TextView) rootView.findViewById(R.id.cast)).setText(mItem.cast);
            ((ImageView) rootView.findViewById(R.id.captura)).setImageResource(mItem.imgcaptura);
        }

        return rootView;
    }
}
