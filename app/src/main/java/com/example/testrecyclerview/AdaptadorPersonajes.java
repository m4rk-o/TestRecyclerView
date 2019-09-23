package com.example.testrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {

    ArrayList<Personaje> listaPersonjes;

    public AdaptadorPersonajes(ArrayList<Personaje> listaPersonjes) {
        this.listaPersonjes = listaPersonjes;
    }

    @NonNull
    @Override
    public ViewHolderPersonajes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personajes, null, false);
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersonajes holder, int position) {
        holder.tvNombre.setText(listaPersonjes.get(position).getNombre());
        holder.tvInformaciion.setText(listaPersonjes.get(position).getInfo());
        holder.foto.setImageResource(listaPersonjes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaPersonjes.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        TextView tvNombre, tvInformaciion;
        ImageView foto;

        public ViewHolderPersonajes(@NonNull View itemView) {
            super(itemView);
            tvNombre = (TextView)itemView.findViewById(R.id.texviewnombre);
            tvInformaciion = (TextView)itemView.findViewById(R.id.textviewInformacion);
            foto = (ImageView)itemView.findViewById(R.id.imageviewPersonaje);
        }
    }
}
