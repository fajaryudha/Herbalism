package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.adapter;

import android.content.Context;
import android.net.Uri;
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
    IHerbalismAdapter mIHerbalismAdapter;

    public HerbalismAdapter(Context context, ArrayList<Herbalism> herbalismList) {
        this.herbalismList = herbalismList;
        mIHerbalismAdapter = (IHerbalismAdapter) context;
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
        holder.ivFoto.setImageURI(Uri.parse(herbalism.Foto));

    }

    @Override
    public int getItemCount() {
        if (herbalismList != null)
            return herbalismList.size();
        return 0;
    }

    public interface IHerbalismAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageList);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mIHerbalismAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }
}
