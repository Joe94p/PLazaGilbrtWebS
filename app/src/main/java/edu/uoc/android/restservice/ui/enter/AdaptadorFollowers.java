package edu.uoc.android.restservice.ui.enter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.uoc.android.restservice.R;
import edu.uoc.android.restservice.rest.model.Follower;

/**
 * Created by edgardopanchana on 4/29/18.
 */

public class AdaptadorFollowers extends RecyclerView.Adapter<AdaptadorFollowers.ViewHolderFollowers> {

    ArrayList<Follower> listaFollowers;

    public AdaptadorFollowers(ArrayList<Follower> listaFollowers) {
        this.listaFollowers = listaFollowers;
    }

    @NonNull
    @Override
    public ViewHolderFollowers onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderFollowers(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFollowers holder, int position) {
        holder.etiNombre.setText(listaFollowers.get(position).getNombre());
        //codigo para llamar la imagen del usuario
        Picasso.with(holder.img.getContext()).load(listaFollowers.get(position).getUrl()).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return listaFollowers.size();
    }

    public class ViewHolderFollowers extends RecyclerView.ViewHolder {

        TextView etiNombre;
        //variable que tendra la imagen
        ImageView img;

        public ViewHolderFollowers(View itemView) {
            super(itemView);

            etiNombre = (TextView) itemView.findViewById(R.id.textViewLista);
            //conectamos la imagen usuario con la interfaz
            img = (ImageView) itemView.findViewById(R.id.imageViewLista);
        }
    }
}
