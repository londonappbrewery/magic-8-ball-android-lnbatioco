package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button myButton = (Button) findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mag-8-ball", "Decision revealed!");

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(5);

                // Set the ballDisplay to a particular image from the ballArray
                ballDisplay.setImageResource(ballArray[number]);
            }
        });


    }
}
