package e1623.endelig;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sensor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button green = (Button) (findViewById(R.id.green));
        Button yellow = (Button) (findViewById(R.id.yellow));
        Button red = (Button) (findViewById(R.id.red));
        final ImageView imageView = (ImageView) findViewById(R.id.sensorroed);
        final ImageView imageView1 = (ImageView) findViewById(R.id.sensorgul);
        final ImageView imageView2 = (ImageView) findViewById(R.id.sensorgronn);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.animate().alpha(0).setDuration(500);

            }
        });
        red.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView.animate().alpha(1).setDuration(500);
                return(true);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView1.animate().alpha(0).setDuration(500);

            }
        });
        yellow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView1.animate().alpha(1).setDuration(500);
                return (true);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView2.animate().alpha(0).setDuration(500);

            }
        });
        green.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageView2.animate().alpha(1).setDuration(500);
                return(true);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
