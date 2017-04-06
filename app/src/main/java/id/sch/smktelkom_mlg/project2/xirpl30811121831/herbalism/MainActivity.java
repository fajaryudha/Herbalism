package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
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
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app at: https://play.google.com/store/apps/details?id=com.google.android.apps.plus");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
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

    public void onBody(View view) {
        ImageView body = (ImageView) findViewById(R.id.BodyImage);
        Intent intent = new Intent(getApplicationContext(), BodyActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, body, "HeadTransition");
        startActivity(intent, options.toBundle());
    }

    public void onLeftHand(View view) {
        ImageView lh = (ImageView) findViewById(R.id.LeftHandImage);
        Intent intent = new Intent(getApplicationContext(), HandActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, lh, "HeadTransition");
        startActivity(intent, options.toBundle());
    }

    public void onRightHand(View view) {
        ImageView rh = (ImageView) findViewById(R.id.RightHandImage);
        Intent intent = new Intent(getApplicationContext(), HandActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, rh, "HeadTransition");
        startActivity(intent, options.toBundle());
    }

    public void onLeg(View view) {
        ImageView leg = (ImageView) findViewById(R.id.LegImage);
        Intent intent = new Intent(getApplicationContext(), LegActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, leg, "HeadTransition");
        startActivity(intent, options.toBundle());
    }
}
