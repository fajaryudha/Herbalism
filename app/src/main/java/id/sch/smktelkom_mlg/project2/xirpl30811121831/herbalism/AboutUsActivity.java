package id.sch.smktelkom_mlg.project2.xirpl30811121831.herbalism;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        findViewById(R.id.telp1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telpa("0855465918018");
            }
        });

        findViewById(R.id.telp2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telpb("082132104016");
            }
        });

        findViewById(R.id.telp3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telpc("081515261202");
            }
        });

        findViewById(R.id.telp4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telpd("081232785231");
            }
        });

        findViewById(R.id.telp5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telpe("089683124238");
            }
        });

    }

    public void telpe(String phone5) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone5));
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void telpd(String phone4) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone4));
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void telpc(String phone3) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone3));
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void telpb(String phone2) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone2));
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void telpa(String phone1) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone1));
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    public void Instagram1(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/dianofika");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/_u/dianofika")));
        }
    }

    public void Instagram2(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/fajar_yudhapratama");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/_u/fajar_yudhapratama")));
        }
    }

    public void Instagram3(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/fitriamelaagnes_");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/_u/fitriamelaagnes_")));
        }
    }

    public void Instagram4(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/muhammadhrj");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/_u/muhammadhrj")));
        }
    }

    public void Instagram5(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/savinarp");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/_u/savinarp")));
        }
    }


}
