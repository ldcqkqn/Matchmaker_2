package com.example.matchmaker_2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    Button btn_cross,btn_vs,btn_underover,btn_special,btn_live,btn_all,btn_soccer,btn_basketball,btn_baseball,btn_volleyball,btn_icehockey,btn_also;
    LinearLayout sub_scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cross = (Button)findViewById(R.id.btn_cross);
        btn_vs = (Button)findViewById(R.id.btn_vs);
        btn_underover = (Button)findViewById(R.id.btn_underover);
        btn_special = (Button)findViewById(R.id.btn_special);
        btn_live = (Button)findViewById(R.id.btn_live);
        btn_all = (Button)findViewById(R.id.btn_all);
        btn_soccer = (Button)findViewById(R.id.btn_soccer);
        btn_basketball = (Button)findViewById(R.id.btn_basketball);
        btn_baseball = (Button)findViewById(R.id.btn_baseball);
        btn_volleyball = (Button)findViewById(R.id.btn_volleyball);
        btn_icehockey = (Button)findViewById(R.id.btn_icehockey);
        btn_also = (Button)findViewById(R.id.btn_also);

        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Scrollview 안보이게합니다.",Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //지금은 안보이게 설정
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_club, R.id.nav_item_shop,
                R.id.nav_matchup_result,R.id.nav_my_bank,R.id.nav_pick,R.id.nav_my_mission,
                R.id.nav_mesege, R.id.nav_giftbox,R.id.nav_event,
                R.id.nav_like, R.id.nav_item_management,
                R.id.nav_club_search, R.id.nav_bata_search,R.id.nav_my_room,
                R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void onClicked(View view){
        Toast.makeText(getApplicationContext(),"Scrollview를 보이게합니다.",Toast.LENGTH_SHORT).show();
        switch (view.getId()){
            case R.id.btn_soccer :
                Toast.makeText(getApplicationContext(),"축구입니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_basketball :
                Toast.makeText(getApplicationContext(),"농구입니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_baseball :
                Toast.makeText(getApplicationContext(),"야구입니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_icehockey :
                Toast.makeText(getApplicationContext(),"아이스하키입니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_also :
                Toast.makeText(getApplicationContext(),"기타입니다.",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
