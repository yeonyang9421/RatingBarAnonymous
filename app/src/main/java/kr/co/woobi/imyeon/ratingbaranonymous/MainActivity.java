package kr.co.woobi.imyeon.ratingbaranonymous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(
            new RatingBar.OnRatingBarChangeListener(){

                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    String text=rating + "," + String.valueOf(ratingBar.getRating());
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
                }

        });

    }
}
