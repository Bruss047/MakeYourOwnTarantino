package tarantino047.makeyourowntarantino;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Javi047 on 1/5/2019.
 */

public class Fragment_lista extends ListFragment {

    private Callbacks mCallbacks = CallbacksVacios;


    public interface Callbacks {
        public void onEntradaSelecionada(String id);
    }

    private static Callbacks CallbacksVacios = new Callbacks() {
        @Override
        public void onEntradaSelecionada(String id) {
        }
    };

    public Fragment_lista() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new Adapter(getActivity(), R.layout.pelidata, Lista_contenido.ENTRADAS_LISTA){

            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView titulo = (TextView) view.findViewById(R.id.titulo);
                    titulo.setText(((Lista_contenido.Peliculax) entrada).nombre);

                    TextView anio = (TextView)view.findViewById(R.id.year);
                    anio.setText(((Lista_contenido.Peliculax) entrada).fecha);

                    ImageView miniatura = (ImageView)view.findViewById(R.id.img);

                    Uri imgUri=Uri.parse("android.resource://tarantino047.makeyourowntarantino/"+((Lista_contenido.Peliculax) entrada).img);
                    miniatura.setImageURI(imgUri);

                    /*if (titulo != null)
                        titulo.setText(((Lista_contenido.Peliculax) entrada).nombre);*/

                }
            }
        });

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (!(activity instanceof Callbacks)) {
            throw new IllegalStateException("Error: La actividad debe implementar el callback del fragmento");
        }

        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = CallbacksVacios;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id) {
        super.onListItemClick(listView, view, posicion, id);
        mCallbacks.onEntradaSelecionada(Lista_contenido.ENTRADAS_LISTA.get(posicion).id);
    }


}
