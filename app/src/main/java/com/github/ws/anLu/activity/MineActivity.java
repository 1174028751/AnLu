package com.github.ws.anLu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.ws.anLu.R;
import com.github.ws.anLu.base.BaseActivity;

import butterknife.Bind;
import butterknife.OnClick;

public class MineActivity extends BaseActivity {
    private Intent intent;
    private static  int UPDATE_TEXT = 1;

    @Bind(R.id.top_text)
    TextView mTopText;

    public void initView()
    {
        super.initView();
        mTopText.setText("注册账号");
    }
    @Override
    protected int getResourceId(){
        return R.layout.activity_mine;
    }

//    @OnClick(R.id.)
    public void  OnViewListener(View view){

    }
}
