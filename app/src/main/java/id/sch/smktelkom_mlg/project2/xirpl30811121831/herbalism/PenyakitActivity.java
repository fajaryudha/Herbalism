package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.TitleParent;

public class PenyakitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);
        TitleParent titleParent = (TitleParent) getIntent().getSerializableExtra(ListHeadActivity.PENYAKIT);
        setTitle(titleParent.getTittle());
    }
}
