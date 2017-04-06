package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton menu1,menu2,menu3 ;
    ImageView head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu1 = (FloatingActionButton)findViewById(R.id.subFloatingMenu1) ;
        menu2 = (FloatingActionButton)findViewById(R.id.subFloatingMenu2) ;
        menu3 = (FloatingActionButton)findViewById(R.id.subFloatingMenu3) ;

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/html");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>This is the text that will be shared.</p>"));
                startActivity(Intent.createChooser(sharingIntent,"Share using"));
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this , "BackUp Icon clicked", Toast.LENGTH_LONG).show();

            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this , "Settings Icon clicked", Toast.LENGTH_LONG).show();

            }
        });

    }

    public void click(View view) {
        ImageView head = (ImageView) findViewById(R.id.HeadImage);
        Intent intent = new Intent(getApplicationContext(), HeadActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, head, "HeadTransition");
        startActivity(intent, options.toBundle());
    }
}
