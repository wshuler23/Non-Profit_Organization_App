package edu.desu.dsuappacademy.non_profitorganizationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView volunteer = (TextView) findViewById(R.id.volunteer);
        volunteer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent volunteerIntent = new Intent(MainActivity.this, Volunteer.class);

                startActivity(volunteerIntent);

            }
        });

        final TextView mission = (TextView) findViewById(R.id.mission);
        mission.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(MainActivity.this, Mission.class);

                startActivity(missionIntent);

            }
        });

    }

    public void call(View v) {
        dialContactPhone("4103982470");
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

    public void map(View view) {
        Uri gmmIntentUri = Uri.parse("geo:39.6071231,-75.8396411");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null)

        {
            startActivity(mapIntent);
        }
    }
}