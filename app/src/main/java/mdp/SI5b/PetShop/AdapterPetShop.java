package mdp.SI5b.PetShop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterPetShop extends RecyclerView.Adapter<AdapterPetShop.VHPetShop> {
    private ArrayList<ModelPetShop> dataPetShop;
    private Context ctx;

    public AdapterPetShop(ArrayList<ModelPetShop> dataPetShop, Context ctx) {
        this.dataPetShop = dataPetShop;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public VHPetShop onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new VHPetShop(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull VHPetShop holder, int position) {
        ModelPetShop petShop = dataPetShop.get(position);

        holder.tvNama.setText(petShop.getNama());
        holder.tvTentang.setText(petShop.getTentang());

        Glide
                .with(ctx)
                .load(petShop.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNama, xTentang, xFoto;

                xNama = petShop.getNama();
                xTentang = petShop.getTentang();
                xFoto = petShop.getFoto();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xFoto", xFoto);
                kirim.putExtra("xTentang", xTentang);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataPetShop.size();
    }

    public class VHPetShop extends RecyclerView.ViewHolder {
        TextView tvNama, tvTentang;
        ImageView ivFoto;

        public VHPetShop(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}
