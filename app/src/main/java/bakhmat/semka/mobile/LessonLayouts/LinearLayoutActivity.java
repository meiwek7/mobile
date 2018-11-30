package bakhmat.semka.mobile.LessonLayouts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import bakhmat.semka.mobile.R;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //VBox HBox

        LinearLayout layout = new LinearLayout(this);

        layout.setOrientation(LinearLayout.VERTICAL);

        //Label
        TextView lbl = new TextView(this);
        TextView lbl2 = new TextView(this);

        lbl.setText("Hello !");
        lbl.setBackgroundColor(Color.CYAN);

        lbl2.setText("World !");
        lbl2.setBackgroundColor(Color.CYAN);

        layout.addView(lbl,300,400);
        layout.addView(lbl2,300,400);


        setContentView(layout);
    }

}
