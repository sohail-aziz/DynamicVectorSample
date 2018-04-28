package sohail.aziz.myvectorsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.devs.vectorchildfinder.VectorChildFinder;
import com.devs.vectorchildfinder.VectorDrawableCompat;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private boolean toggle = true;
    private int color = Color.GREEN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_vector);
        findViewById(R.id.buttonChange).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleColor();
            }
        });
    }

    private void toggleColor() {

        color = (toggle == true) ? Color.GREEN : Color.BLUE;
        toggle = !toggle;


        VectorChildFinder vector = new VectorChildFinder(this, R.drawable.icon_biketype_comfort, imageView);
        VectorDrawableCompat.VFullPath path1 = vector.findPathByName("main");
        path1.setFillColor(color);

//        VectorDrawableCompat.VGroup group1 = vector.findGroupByName("group1");
//        group1.setTranslateX(10);

        imageView.invalidate();


    }
}
