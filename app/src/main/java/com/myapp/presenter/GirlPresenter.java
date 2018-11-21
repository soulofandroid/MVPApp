package com.myapp.presenter;

import com.myapp.bean.Girl;
import com.myapp.model.GirlModelImpl;
import com.myapp.model.IGirlModel;
import com.myapp.view.IGirlView;

import java.util.List;

/**
 * 顶层接口  使用泛型  IGirdView的子类
 * 1.需要View层的引用
 * 2.需要moel层的引用
 * 3.初始化
 * 4.执行UI逻辑
 */
public class GirlPresenter<T extends IGirlView> {

    //1.需要View层的引用
    IGirlView view;
    //2.需要moel层的引用
    IGirlModel girlModel=new GirlModelImpl();
    //3.初始化
    public GirlPresenter(T view) {
        this.view = view;
    }
    // 4.执行UI逻辑
    public void fetch(){
        if(view!=null){
            view.showLoading();
            if(girlModel!=null){
                girlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if(view!=null){
                            view.showGirls(girls);
                        }
                    }
                });
            }
        }
    }
}
