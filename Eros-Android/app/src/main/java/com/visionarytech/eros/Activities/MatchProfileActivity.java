package com.visionarytech.eros.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.visionarytech.eros.R;

public class MatchProfileActivity extends AppCompatActivity {

    private TextView userNameTextView, userAgeTextView, userLocationTextView, userDescriptionTextView;
    private ImageView userMainPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_profile);

        userNameTextView = findViewById(R.id.datesName);
        userAgeTextView = findViewById(R.id.datesAge);
        userLocationTextView = findViewById(R.id.datesLocation);
        userDescriptionTextView = findViewById(R.id.datesBio);
        userMainPicture = findViewById(R.id.app_bar_image);

//        Receive data
        Intent intent = getIntent();
        String userId = intent.getExtras().getString("userId");
        String userName = intent.getExtras().getString("userName");
        String userLocation = intent.getExtras().getString("location");
        int userProfile = intent.getExtras().getInt("userProfile");

        Toast.makeText(this, userName, Toast.LENGTH_SHORT).show();

        userNameTextView.setText(userName + ", ");
        userAgeTextView.setText("");
        userLocationTextView.setText(userLocation);
        userMainPicture.setImageResource(userProfile);
    }
}
