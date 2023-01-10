package org.hitlabnz.sensor_fusion_demo;

import java.util.Locale;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Activity, that displays a single WebView with the text shown under the section About in the settings
 * 
 * @author Alexander Pacha
 * 
 */
public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
//        MediaPlayer mp;
//        setContentView(R.layout.activity_sensor_selection);
//    mp = MediaPlayer.create(this, R.raw.beer);
//    Button play_button = (Button)this.findViewById(R.id.button);
//        play_button.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            mp.start();
//        }
//    });
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.beer);

        Button play_button = (Button)this.findViewById(R.id.button2);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mp.start();
            }
        });
        // Get the locale substring to access the localised assets
        String localPrefix = Locale.getDefault().getLanguage().substring(0, 2).toLowerCase(Locale.US);

        // Enable the logo in the top left corner to bring the user back to another activity.
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
        case android.R.id.home:
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
