package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View view) {
        ImageView head = (ImageView) findViewById(R.id.HeadImage);
        Intent intent = new Intent(getApplicationContext(), HeadActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, head, "HeadTransition");
        startActivity(intent, options.toBundle());
    }
}
