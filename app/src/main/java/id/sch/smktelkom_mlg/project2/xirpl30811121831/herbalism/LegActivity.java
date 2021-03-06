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

public class LegActivity extends AppCompatActivity implements HerbalismAdapter.IHerbalismAdapter {

    public static final String HERBALISM = "Herbalism";
    ArrayList<Herbalism> mList = new ArrayList<>();
    HerbalismAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);
        this.setTitle("Organ Bawah");
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
        String[] arJudul = resources.getStringArray(R.array.kulit_oyi2);
        String[] arDescripsi = resources.getStringArray(R.array.kulit_oyi1);
        String[] arDetail = resources.getStringArray(R.array.kulit_oyi1);
        String[] arLokasi = resources.getStringArray(R.array.kulit_oyi1);
        TypedArray a = resources.obtainTypedArray(R.array.gambar_kulit);
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
            Intent intent = new Intent(this, Kulit.class);//ListBodyActivity diubah untuk menuju ke activity yang diinginkan
            intent.putExtra(HERBALISM, mList.get(pos));
            startActivity(intent);
        }
    }
}
