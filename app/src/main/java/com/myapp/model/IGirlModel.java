package com.myapp.model;

import com.myapp.bean.Girl;

import java.util.List;

/**
 * 加载数据
 */
public interface IGirlModel {
    //如果数据来源非常耗时，应该单独设计一个回调接口，处理相关事情(网络断线==)
    void loadGirl(GirlOnLoadListener girlOnLoadListener);
    interface GirlOnLoadListener{
     void onComplete(List<Girl> girls);
    }
}
