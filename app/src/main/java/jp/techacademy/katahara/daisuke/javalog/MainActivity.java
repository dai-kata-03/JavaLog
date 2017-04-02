package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 課題：Humanクラスの定義

        Human human = new Human("宮原", 35); // 名前を宮原、年齢35歳で、Humanのインスタンスを作る

        human.say();

    }
}
