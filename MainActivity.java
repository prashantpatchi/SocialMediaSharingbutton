package win.prashant.socialmediasharingbutton;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnfb,btntwitter,btnWhtsapp,btng;
    String uriString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfb = findViewById(R.id.buttonFacebook);
        btntwitter = findViewById(R.id.buttonTwitter);
        btnWhtsapp = findViewById(R.id.buttonWhtsapp);
        btng = findViewById(R.id.buttonGoogle);
    }

    public void btnFacebook(View v){
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        // give any url in Uri String

        uriString = "http://www.prashant.win";
        sharingIntent.putExtra(Intent.EXTRA_TEXT,uriString);
        sharingIntent.setPackage("com.facebook.katana");
        startActivity(sharingIntent);
    }
    public void buttonTwitter(View v) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        // give any url in Uri String

        uriString = "http://www.prashant.win";
        sharingIntent.putExtra(Intent.EXTRA_TEXT, uriString);
        sharingIntent.setPackage("advanced.twitter.android");
        startActivity(sharingIntent);

    }

    public void buttonWhtsapp(View v) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        // give any url in Uri String

        uriString = "http://www.prashant.win";
        sharingIntent.putExtra(Intent.EXTRA_TEXT, uriString);
        sharingIntent.setPackage("com.whtsapp");
        startActivity(sharingIntent);

    }
    public void buttonGoogle(View v) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        // give any url in Uri String

        uriString = "http://www.prashant.win";
        sharingIntent.putExtra(Intent.EXTRA_TEXT, uriString);
        sharingIntent.setPackage("com.google.android.apps.plus");
        startActivity(sharingIntent);

    }

}
