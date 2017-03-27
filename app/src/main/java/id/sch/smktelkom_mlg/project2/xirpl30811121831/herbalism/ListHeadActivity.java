package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism.model.Herbalism;

/**
 * Created by Smktelkom on 3/16/2017.
 */

public class ListHeadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.head_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Herbalism herbalism = (Herbalism) getIntent().getSerializableExtra(HeadActivity.HERBALISM);
        setTitle(herbalism.Judul);
    }
}
