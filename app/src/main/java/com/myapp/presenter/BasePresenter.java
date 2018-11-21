package com.myapp.presenter;

import java.lang.ref.WeakReference;

/**
 * 解决内存泄漏
 * @param <T>
 */
public class BasePresenter<T> {
   protected WeakReference<T> mViewRef;
   //进行绑定
   public void attachView(T view){
       mViewRef=new WeakReference<>(view);
   }
  //解绑
   public void detachView(){
       mViewRef.clear();
   }
}
