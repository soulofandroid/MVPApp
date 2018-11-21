package com.myapp.view;

import com.myapp.bean.Girl;

import java.util.List;

/**
 * 定义出所有的UI逻辑
 */
public interface IGirlView {

    void showLoading();
    //显示listView中的数据
    void showGirls(List<Girl> girls);
}
