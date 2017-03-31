package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson 5.4 演算子
        int num1 = 10 + 5 - 2 * 4 / 2;
        Log.d("javatest", "10 + 5 - 2 * 4 / 2 =" + String.valueOf(num1));

        boolean flag1 = true;
        boolean flag2 = false;

        Log.d("javatest","flag1 && flag2 =" + String.valueOf(flag1 && flag2));
        Log.d("javatest", "flag1 || flag2 =" + String.valueOf(flag1 || flag2));

        int num2 = 10;
        int num3 = 20;
        Log.d("javatest", "num2 < num3 =" + String.valueOf(num2 < num3) );

        String str = "aaa" + "bbb";
        Log.d("javatest", "aaa + bbb =" + str);

    }
}
