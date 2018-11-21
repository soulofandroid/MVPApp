package com.myapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.myapp.adapter.GirlAdapter;
import com.myapp.bean.Girl;
import com.myapp.presenter.GirlPresenter;
import com.myapp.view.IGirlView;

import java.util.List;

/**
 * mvp 比mvc的优点
 * 1.Activity的职责更明确
 * 2.代码结构更清晰，便于维护
 * 3.方便单元测试
 * 4.解决MVC中的内存泄漏
 */
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
