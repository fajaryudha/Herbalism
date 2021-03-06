package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.R;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.ViewHolders.TitleChildViewHolder;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.ViewHolders.TitleParentViewHolder;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleChild;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleParent;

/**
 * Created by MHRJ on 4/6/2017.
 */

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder, TitleChildViewHolder> {

    LayoutInflater inflater;

    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater = LayoutInflater.from(context);

    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_parent, viewGroup, false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_child, viewGroup, false);
        return new TitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
        TitleParent title = (TitleParent) o;
        titleParentViewHolder._textView.setText(title.getTittle());
    }

    @Override
    public void onBindChildViewHolder(TitleChildViewHolder titleChildViewHolder, int i, Object o) {
        TitleChild title = (TitleChild) o;
        titleChildViewHolder.option1.setText(title.getOption1());
        titleChildViewHolder.option2.setText(title.getOption2());
        titleChildViewHolder.option3.setText(title.getOption3());
        titleChildViewHolder.option4.setImageURI(Uri.parse(title.getOption4()));
    }

    @Override
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }
}
