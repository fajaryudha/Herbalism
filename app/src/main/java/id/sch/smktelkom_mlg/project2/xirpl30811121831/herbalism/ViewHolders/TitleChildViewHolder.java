package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.ViewHolders;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.R;

/**
 * Created by MHRJ on 4/6/2017.
 */

public class TitleChildViewHolder extends ChildViewHolder {
    public TextView option1, option2;

    public TitleChildViewHolder(View itemView) {
        super(itemView);
        option1 = (TextView) itemView.findViewById(R.id.option1);
        option2 = (TextView) itemView.findViewById(R.id.option2);
    }
}