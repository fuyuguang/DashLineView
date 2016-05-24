package com.alex.dashlineview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import github.alex.dashlineview.DashLineView;

public class MainActivity extends AppCompatActivity {
    private DashLineView dashLineView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        dashLineView = (DashLineView) findViewById(R.id.dlv);
        dashLineView.setDashWidth(24);
        dashLineView.setDashColor(Color.parseColor("#666666"));
        dashLineView.setDashGap(8);
    }
}
