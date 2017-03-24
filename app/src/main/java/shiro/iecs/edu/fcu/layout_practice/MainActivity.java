package shiro.iecs.edu.fcu.layout_practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_m = (Button)findViewById(R.id.up_but);//建立一個button(中間那顆), 並初始化
        Button btn_r = (Button)findViewById(R.id.r_but);
        Button btn_l = (Button)findViewById(R.id.l_but);

        btn_m.setOnClickListener(new View.OnClickListener() {//按鈕傾聽者 中間那顆
            @Override
            public void onClick(View v) {
                //利用Toast的靜態函式makeText來建立Toast物件
                Toast toast = Toast.makeText(MainActivity.this,
                        R.string.press_up_but_text, Toast.LENGTH_SHORT);
                //顯示Toast
                toast.show();
            }
        });

        btn_l.setOnClickListener(new View.OnClickListener() {//按鈕傾聽者 左邊那顆
            @Override
            public void onClick(View v) {
                //利用Toast的靜態函式makeText來建立Toast物件
                Toast toast = Toast.makeText(MainActivity.this,
                        R.string.press_lf_but_text, Toast.LENGTH_SHORT);
                //顯示Toast
                toast.show();
            }
        });

        btn_r.setOnClickListener(new View.OnClickListener() {//按鈕傾聽者 右邊那顆
            @Override
            public void onClick(View v) {
                //利用Toast的靜態函式makeText來建立Toast物件
                Toast toast = Toast.makeText(MainActivity.this,
                        R.string.press_rt_but_text, Toast.LENGTH_SHORT);
                //顯示Toast
                toast.show();
            }
        });


    }
}
