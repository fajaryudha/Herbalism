package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.adapter.HerbalismAdapter;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.Herbalism;

public class HeadActivity extends AppCompatActivity {

    ArrayList<Herbalism> mList = new ArrayList<>();
    HerbalismAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
        this.setTitle("Head");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new HerbalismAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }

    private void fillData() {

        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);
        String[] arDescripsi = resources.getStringArray(R.array.place_desc);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        Drawable[] arFoto = new Drawable[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            arFoto[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Herbalism(arJudul[i], arDescripsi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

}
