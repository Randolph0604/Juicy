package com.example.dell.juicy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {


    private Context miContext;
    private List<Reseta> midata;
    private String verificacion="";

    public RecycleViewAdapter(Context miContext, List<Reseta> midata) {
        this.miContext = miContext;
        this.midata = midata;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater miinflater=LayoutInflater.from(miContext);
        view = miinflater.inflate(R.layout.cardview_item_back,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_receta_tittle.setText(midata.get(position).getTittle());
        holder.img_receta_thumbnail.setImageResource(midata.get(position).getThumbanail());

        //set click listener

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //aqui se decide si el usuario esta logeado o no para dar el permiso a las recetas

                VerificacionUsers VR=new VerificacionUsers();
                String verificado=VR.getVerificacion();
                if(verificado.equals("1")){
                    //aqui pasamoss la informacion al nuevo layout
                    Intent nuevointent = new Intent(miContext, Receta_activity.class );
                    nuevointent.putExtra("Titulo receta", midata.get(position).getTittle());
                    nuevointent.putExtra("Category", midata.get(position).getCategory());
                    nuevointent.putExtra("Description", midata.get(position).getDescription());
                    nuevointent.putExtra("Thumbanail", midata.get(position).getThumbanail());
                    nuevointent.putExtra("link_conect", midata.get(position).getLink_conect());
                    //inicio nuevo layout
                    miContext.startActivity(nuevointent);
                }else{
                    Toast.makeText(miContext, "Registrese para continuar !", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }

    @Override
    public int getItemCount() {
        return midata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_receta_tittle;
        ImageView img_receta_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_receta_tittle=itemView.findViewById(R.id.receta_tittle_id);
            img_receta_thumbnail=itemView.findViewById(R.id.receta_img_id);
            cardView=itemView.findViewById(R.id.cardview_id);
        }
    }



}