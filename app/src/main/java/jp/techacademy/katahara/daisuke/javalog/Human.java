package jp.techacademy.katahara.daisuke.javalog;

import android.util.Log;

/**
 * Created by Daisuke on 2017/04/02.
 */

class Human extends Animal {

    // メンバ変数
    String name;
    int age;

    // コンストラクタ
    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest","「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }


}
