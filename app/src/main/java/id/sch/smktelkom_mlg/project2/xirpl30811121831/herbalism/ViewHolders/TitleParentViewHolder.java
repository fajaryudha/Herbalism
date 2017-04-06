package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.R;

/**
 * Created by MHRJ on 4/6/2017.
 */
public class TitleParentViewHolder extends ParentViewHolder {
    public TextView _textView;
    public ImageButton _imageButton;

    public TitleParentViewHolder(View itemView) {
        super(itemView);
        _textView = (TextView) itemView.findViewById(R.id.parentTitle);
        _imageButton = (ImageButton) itemView.findViewById(R.id.expandArrow);

    }
}
