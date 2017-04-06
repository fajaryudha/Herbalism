package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

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
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleCreator;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleParent;

/**
 * Created by Smktelkom on 3/16/2017.
 */

public class ListHeadActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((MyAdapter) recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.head_layout);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Herbalism herbalism = (Herbalism) getIntent().getSerializableExtra(HeadActivity.HERBALISM);
        setTitle(herbalism.Judul);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this, initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        TitleCreator titleCreator = TitleCreator.get(this);
        List<TitleParent> tiles = titleCreator.getAll();
        List<ParentObject> parentObject = new ArrayList<>();
        for (TitleParent title : tiles) {
            List<Object> childList = new ArrayList<>();
            childList.add(new TitleChild("Add to contacs", "Send Message"));
            title.setChildObjectList(childList);
            parentObject.add(title);
        }
        return parentObject;
    }
}
