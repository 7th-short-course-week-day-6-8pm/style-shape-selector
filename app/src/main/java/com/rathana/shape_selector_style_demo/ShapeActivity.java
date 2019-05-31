package com.rathana.shape_selector_style_demo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ShapeActivity extends AppCompatActivity {


    LinearLayout circleShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        circleShape=findViewById(R.id.circleShape);

        Drawable rectangleDrawable= getDrawable(R.drawable.rectangle_shape);
        //circleShape.setBackground(rectangleDrawable);
    }
}
