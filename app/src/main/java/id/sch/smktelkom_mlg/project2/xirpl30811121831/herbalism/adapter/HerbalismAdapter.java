package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.R;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.Herbalism;

/**
 * Created by Smktelkom on 3/16/2017.
 */

public class HerbalismAdapter extends RecyclerView.Adapter<HerbalismAdapter.ViewHolder> {

    ArrayList<Herbalism> herbalismList;

    public HerbalismAdapter(ArrayList<Herbalism> herbalismList) {
        this.herbalismList = herbalismList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Herbalism herbalism = herbalismList.get(position);
        holder.tvJudul.setText(herbalism.Judul);
        holder.tvDescripsi.setText(herbalism.Descripsi);
        holder.ivFoto.setImageDrawable(herbalism.Foto);

    }

    @Override
    public int getItemCount() {
        if (herbalismList != null)
            return herbalismList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDescripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageList);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDescripsi = (TextView) itemView.findViewById(R.id.textViewDescripsi);
        }
    }
}
