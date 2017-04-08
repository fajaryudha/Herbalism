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

public class HandActivity extends AppCompatActivity implements HerbalismAdapter.IHerbalismAdapter {

    public static final String HERBALISM = "Herbalism";
    ArrayList<Herbalism> mList = new ArrayList<>();
    HerbalismAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);
        this.setTitle("Badan");
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
        String[] arJudul = resources.getStringArray(R.array.anggota_badan);
        String[] arDescripsi = resources.getStringArray(R.array.place_desc);
        String[] arDetail = resources.getStringArray(R.array.place_details);
        String[] arLokasi = resources.getStringArray(R.array.place_locations);
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

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Herbalism(arJudul[i], arDescripsi[i], arDetail[i], arLokasi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {

        if (pos == 0) {
            Intent intent = new Intent(this, Jantung.class);//ListBodyActivity diubah untuk menuju ke activity yang diinginkan
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 1) {
            Intent intent = new Intent(this, Paru.class); //MainActivity diubah untuk menuju ke activity yang diinginkan
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 2) {
            Intent intent = new Intent(this, Lambung.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 3) {
            Intent intent = new Intent(this, Usus.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 4) {
            Intent intent = new Intent(this, Ginjal.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 5) {
            Intent intent = new Intent(this, Hati.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 6) {
            Intent intent = new Intent(this, Pankreas.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        } else if (pos == 7) {
            Intent intent = new Intent(this, Anus.class);
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        }

    }
}
