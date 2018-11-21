package com.myapp.model;

import com.myapp.R;
import com.myapp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class GirlModelImpl implements  IGirlModel {

    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> girls=new ArrayList<>();
        girls.add(new Girl("张三",20,"男","北京市昌平区","阿卡索爱撒娇说啊"));
        girls.add(new Girl("张一山",25,"男","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("杨幂",26,"女","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("赵丽颖",28,"女","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("李易峰",28,"男","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("胡汉三",25,"男","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("张杰",28,"男","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("谢娜",27,"女","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("欧阳娜娜",23,"女","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("令狐冲",22,"男","北京市昌平区","赛数据爱莎死啊"));
        girls.add(new Girl("岳不群",26,"男","北京市昌平区","赛数据爱莎死啊"));
        girlOnLoadListener.onComplete(girls);
    }
}
