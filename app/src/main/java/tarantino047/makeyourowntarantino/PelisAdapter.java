package tarantino047.makeyourowntarantino;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static tarantino047.makeyourowntarantino.R.drawable.casting;

/**
 * Created by Javi047 on 13/6/2017.
 */

public class PelisAdapter extends BaseAdapter {

    private List<Pelicula> listap = new ArrayList<>();


    public PelisAdapter(List<Pelicula> listap){


        this.listap=listap;


    }

    @Override
    public int getCount() {
        return listap.size();
    }

    @Override
    public Object getItem(int position) {
        return listap.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listap.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;


        if (convertView == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pelidata, parent, false);

        } else {
            view = convertView;
        }

        Pelicula film =(Pelicula) getItem(position);


        TextView tit = (TextView)view.findViewById(R.id.titulo);
        tit.setText(film.getNombre());

        TextView ww = (TextView)view.findViewById(R.id.year);
        ww.setText(film.getFecha());
        ImageView rr = (ImageView)view.findViewById(R.id.img);



        Uri imgUri=Uri.parse("android.resource://tarantino047.makeyourowntarantino/"+film.getImg());
        rr.setImageURI(imgUri);








        //
        /*ImageView w = (ImageView)view.findViewById(R.id.img);
        int image = R.drawable.casting;

        w.setImageResource(image);*/

        return  view;
    }

}
