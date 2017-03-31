package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson 5.7 配列

        int [] points = new int [5];

        points [0] = 10;
        points [1] = 6;
        points [2] = 15;
        points [3] = 23;
        points [4] = 17;

        for (int i = 0; i < 5; i++) {
            Log.d("javatest", String.valueOf(points[i]));
        }

    }
}
