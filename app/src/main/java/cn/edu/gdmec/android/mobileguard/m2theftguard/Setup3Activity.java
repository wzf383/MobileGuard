package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import cn.edu.gdmec.android.mobileguard.R;

/**
 * Created by 38322 on 2017/10/12.
 */

public class Setup3Activity  extends  BaseSetUpActivity{

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_3);
        //设置第3个小圆点的颜色
        ((RadioButton) findViewById(R.id.rb_third)).setChecked(true);

    }
    @Override
    public  void showNext(){
        startActivityAndFinishSelf(Setup4Activity.class);
    }
    @Override
    public  void showPre(){
        startActivityAndFinishSelf(Setup2Activity.class);
    }
}
