package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson 9.0 インタフェース

        Dog dog = new Dog("ポチ", 3); // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move();

    }
}
