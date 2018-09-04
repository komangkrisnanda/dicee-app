package id.decode.dicee;

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

        Button rollButton;
        rollButton = (Button) findViewById(R.id.btn_roll);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_diceLeft);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_diceRight);

        final int[] images = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The button is successfully clicked!");

                Random myRandomNumber = new Random();

                int myNumber = myRandomNumber.nextInt(6);

                leftDice.setImageResource(images[myNumber]);

                myNumber = myRandomNumber.nextInt(6);

                rightDice.setImageResource(images[myNumber]);
            }
        });
    }
}
