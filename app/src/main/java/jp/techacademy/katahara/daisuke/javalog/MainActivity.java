package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson 6.0 関数

        total(50, 1000);
    }

    private void total(int first, int last) {
        int sum = 0;

        for (int i = first; i <= last; i++) {
            sum = sum + i;
        }

        Log.d("javatest", String.valueOf(sum));
    }
}
