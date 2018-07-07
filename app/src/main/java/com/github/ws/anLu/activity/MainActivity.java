package com.github.ws.anLu.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.ws.anLu.R;
import com.github.ws.anLu.entity.Item;
import com.github.ws.anLu.widget.CircleMenuLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private CircleMenuLayout circleMenuLayout;

    List<Item> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleMenuLayout = (CircleMenuLayout) findViewById(R.id.cm);

        Item item = new Item();
        item.imageRes = R.mipmap.explain;
        item.text = "说明";
        mList.add(item);
        item = new Item();
        item.imageRes = R.mipmap.m_record;
        item.text = "记录";
        mList.add(item);
        item = new Item();
        item.imageRes = R.mipmap.messages;
        item.text = "消息";
        mList.add(item);
        item = new Item();
        item.imageRes = R.mipmap.mine;
        item.text = "我的";
        mList.add(item);
        item = new Item();
        item.imageRes = R.mipmap.setting;
        item.text = "设置";
        mList.add(item);
//        item = new Item();
//        item.imageRes = R.mipmap.rw;
//        item.text = "快递";
//        mList.add(item);


        circleMenuLayout.setAdapter(new MyAdapter());



        circleMenuLayout.setOnItemClickListener(new CircleMenuLayout.OnItemClickListener() {

            public void onItemClickListener(View v,int position) {
                switch(mList.get(position)){
                    case :
                        Intent intent =new Intent(MainActivity.this,MineActivity.class);

                }
                Toast.makeText(MainActivity.this, mList.get(position).text + "", Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public class  MyAdapter extends  BaseAdapter{
        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Object getItem(int position) {
            return mList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
            View itemView = mInflater.inflate(R.layout.circle_menu_item, parent, false);
            initMenuItem(itemView, position);
            return itemView;
        }

        // 初始化菜单项
        private void initMenuItem(View itemView, int position) {
            // 获取数据项
            final Item item = (Item) getItem(position);
            ImageView iv = (ImageView) itemView
                    .findViewById(R.id.iv_icon);
            TextView tv = (TextView) itemView
                    .findViewById(R.id.tv_text);
            // 数据绑定
            iv.setImageResource(item.imageRes);
            tv.setText(item.text);
        }
    }

}
