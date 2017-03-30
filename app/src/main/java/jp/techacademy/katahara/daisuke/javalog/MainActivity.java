package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 整数型の変数をnumと言う名前で作成して、10を代入する。Lesson 5.3
        int num = 10;
        Log.d("javatest", String.valueOf(num));

        // numに50を代入する。Lesson 5.3
        num = 50;
        Log.d("javatest", String.valueOf(num));
    }
}
