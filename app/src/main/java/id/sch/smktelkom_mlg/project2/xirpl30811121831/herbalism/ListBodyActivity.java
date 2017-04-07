package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.adapter.MyAdapter;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.Herbalism;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleChild;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleParent;

/**
 * Created by MHRJ on 4/7/2017.
 */

public class ListBodyActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((MyAdapter) recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.body_layout);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Herbalism herbalism = (Herbalism) getIntent().getSerializableExtra(HeadActivity.HERBALISM);
        setTitle(herbalism.Judul);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(this, initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);
        recyclerView.setAdapter(adapter);
    }

    public List<ParentObject> initData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);

        List<TitleParent> _titleParent;
        _titleParent = new ArrayList<>();

        for (int i = 0; i < arJudul.length; i++) {
            TitleParent title = new TitleParent(arJudul[i]);
            _titleParent.add(title);
        }
        List<TitleParent> tiles = _titleParent;
        List<ParentObject> parentObject = new ArrayList<>();
        for (TitleParent title : tiles) {
            List<Object> childList = new ArrayList<>();
            childList.add(new TitleChild("Penyakit", "Penyebab"));
            title.setChildObjectList(childList);
            parentObject.add(title);
        }

        adapter.notifyDataSetChanged();
        return parentObject;

    }

}
