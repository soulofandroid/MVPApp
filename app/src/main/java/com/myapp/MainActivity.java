package com.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.myapp.adapter.GirlAdapter;
import com.myapp.bean.Girl;
import com.myapp.presenter.GirlPresenter;
import com.myapp.view.IGirlView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IGirlView {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        new GirlPresenter<>(this).fetch();
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
