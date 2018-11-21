package com.myapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.myapp.adapter.GirlAdapter;
import com.myapp.bean.Girl;
import com.myapp.presenter.GirlPresenter;
import com.myapp.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView {

    private ListView listView;
    GirlPresenter girlPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activity只关心 1.接口功能数据去哪里拿 2.选择哪个表示层进行展示
        listView=findViewById(R.id.listView);
        girlPresenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.detachView();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        GirlAdapter adapter= new GirlAdapter(girls,this);
        listView.setAdapter(adapter);
    }
}
