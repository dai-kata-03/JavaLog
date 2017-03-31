package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson 6.3 関数の戻り値

        int t = total(100, 1000);
        Log.d("javatest",String.valueOf(t));
    }

    private int total(int first, int last) {
        int sum = 0;

        for (int i = first; i < last; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
