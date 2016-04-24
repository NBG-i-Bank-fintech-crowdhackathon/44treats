package aa.fourtyfourtreats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {
                Intent i = new Intent(MainActivity.this, ActivityDrawer.class);
                startActivity(i);
            }

        }, 3000);


    }
}
