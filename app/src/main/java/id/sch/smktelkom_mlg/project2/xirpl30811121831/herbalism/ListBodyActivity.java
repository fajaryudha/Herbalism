package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
        //TitleCreator titleCreator = TitleCreator.get(this);
        //List<TitleParent> tiles = titleCreator.getAll();
        //List<ParentObject> parentObject = new ArrayList<>();
        //for (TitleParent title : tiles) {
        //   List<Object> childList = new ArrayList<>();
        //   childList.add(new TitleChild("Add to contact", "Send Message"));
        //   title.setChildObjectList(childList);
        //  parentObject.add(title);
        //}
        //return parentObject;
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);
        String[] arPenyakit = resources.getStringArray(R.array.places_coba);
        String[] arPenyakit1 = resources.getStringArray(R.array.places_coba1);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        String[] arFoto = new String[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            int id = a.getResourceId(i, 0);
            arFoto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id) + '/';
        }
        a.recycle();

        List<TitleParent> _titleParent;
        _titleParent = new ArrayList<>();
        List<TitleParent> titles = _titleParent;
        List<ParentObject> parentObject = new ArrayList<>();

        for (int i = 0; i < arJudul.length; i++) {
            TitleParent title = new TitleParent(arJudul[i]);
            _titleParent.add(title);
            for (int j = 0; j < arPenyakit.length - 7; j++) {
                //for (TitleParent titlel : titles) {
                List<Object> childList = new ArrayList<>();
                childList.add(new TitleChild(arPenyakit[i], arPenyakit1[i], arPenyakit1[i], arFoto[i]));
                title.setChildObjectList(childList);
                parentObject.add(title);
                //}
            }
        }

        return parentObject;
    }
}
