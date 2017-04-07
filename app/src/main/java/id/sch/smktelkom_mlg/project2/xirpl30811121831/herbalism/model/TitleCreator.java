package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MHRJ on 4/6/2017.
 */

public class TitleCreator {

    static TitleCreator _titleCreator;
    List<TitleParent> _titleParent;

    public TitleCreator(Context context) {
        _titleParent = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            TitleParent title = new TitleParent(String.format("Caller #%d", i));
            _titleParent.add(title);
        }
    }

    public static TitleCreator get(Context context) {

        if (_titleCreator == null)
            _titleCreator = new TitleCreator(context);
        return _titleCreator;


    }

    public List<TitleParent> getAll() {
        return _titleParent;
    }
}
