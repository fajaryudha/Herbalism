package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.adapter.HerbalismAdapter;
import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.Herbalism;

public class HeadActivity extends AppCompatActivity implements HerbalismAdapter.IHerbalismAdapter {

    public static final String HERBALISM = "Herbalism";
    ArrayList<Herbalism> mList = new ArrayList<>();
    HerbalismAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
        this.setTitle("Organ Atas");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new HerbalismAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();

    }

    private void fillData() {

        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places1);
        String[] arDescripsi = resources.getStringArray(R.array.place_desc1);
        String[] arDetail = resources.getStringArray(R.array.place_details1);
        String[] arLokasi = resources.getStringArray(R.array.place_locations1);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture1);
        String[] arFoto = new String[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            int id = a.getResourceId(i, 0);
            arFoto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id) + '/';
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Herbalism(arJudul[i], arDescripsi[i], arDetail[i], arLokasi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        if (pos == 0) {
            Intent intent = new Intent(this, ListHeadActivity.class);//ListBodyActivity diubah untuk menuju ke activity yang diinginkan
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 1) {
            Intent intent = new Intent(this, Mata.class); //MainActivity diubah untuk menuju ke activity yang diinginkan
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 2) {
            Intent intent = new Intent(this, Hidung.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 3) {
            Intent intent = new Intent(this, Mulut.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 4) {
            Intent intent = new Intent(this, Telinga.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        }
    }
}
