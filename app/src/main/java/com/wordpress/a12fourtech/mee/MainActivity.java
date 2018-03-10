package com.wordpress.a12fourtech.mee;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    String arrayName[]= {"Facebook",
    "Bio",
    "Twitter",
    "Wordpress",
    "gmail"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_menu_black_24dp,R.drawable.ic_change_history_black_24dp)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.download)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.downloa)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.downlo)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.downl)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.down)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        //Toast.makeText(MainActivity.this,"You selected "+arrayName[index],Toast.LENGTH_SHORT).show();
                        switch(index){
                            case 0: new FinestWebView.Builder(MainActivity.this).show("https://yourProfileUrl"); break;
                           
                            case 1: new FinestWebView.Builder(MainActivity.this).show("https://yourProfileUrl"); break;
                                
                            case 2: new FinestWebView.Builder(MainActivity.this).show("https://yourProfileUrl"); break;
                                
                            case 3: new FinestWebView.Builder(MainActivity.this).show("https://yourProfileUrl"); break;
                                
                            case 4: new FinestWebView.Builder(MainActivity.this).show("https://yourProfileUrl"); break;
                    }
                });
    }

}
