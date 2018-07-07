package com.github.ws.anLu.fragment;

import android.content.Intent;
import android.view.View;

import com.github.ws.anLu.R;
import com.github.ws.anLu.base.BaseFragment;

import butterknife.OnClick;

public class MineFragment extends BaseFragment {
    private Intent intent;

    @Override
    protected  int getResourceId(){return R.layout.fragment_mine;}


//    @OnClick({R.id.user_file,R.id.about_self})
//    public void OnViewClicked(View view){
//        switch(view.getId()){
//            case R.id.user_file:
//                intent=new Intent(getActivity(),MyActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.about_self:
//                intent=new Intent(getActivity(),aboutActivity.calss);
//                startActivity(intent);
//                break;
//        }
//
//
//    }


}


