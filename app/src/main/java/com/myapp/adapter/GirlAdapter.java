package com.myapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.myapp.R;
import com.myapp.bean.Girl;

import java.util.List;

public class GirlAdapter extends BaseAdapter {

    List<Girl> list;
    Context context;

    public GirlAdapter(List<Girl> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=LayoutInflater.from(context).inflate(R.layout.adapter_girl,parent,false);
            holder=new ViewHolder();
            holder.tv_name=convertView.findViewById(R.id.adapter_name);
            holder.tv_age=convertView.findViewById(R.id.adapter_age);
            holder.tv_sex=convertView.findViewById(R.id.adapter_sex);
            holder.tv_addr=convertView.findViewById(R.id.adapter_address);
            holder.tv_des=convertView.findViewById(R.id.adapter_des);
            convertView.setTag(holder);
        }else{
           holder= (ViewHolder) convertView.getTag();
        }
        Girl girl=list.get(position);
        holder.tv_name.setText(girl.getName());
        holder.tv_age.setText(String.valueOf(girl.getAge()));
        holder.tv_sex.setText(girl.getSex());
        holder.tv_addr.setText(girl.getAddress());
        holder.tv_des.setText(girl.getDes());
        return convertView;
    }
    class ViewHolder{
        TextView tv_name;
        TextView tv_age;
        TextView tv_sex;
        TextView tv_addr;
        TextView tv_des;
    }
}
