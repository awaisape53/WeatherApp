package com.gary.weatherdemo.ui.ItemView;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gary.weatherdemo.R;
import com.gary.weatherdemo.databinding.CurWeatherBinding;
import com.gary.weatherdemo.model.LiveWeatherBean;
import com.gary.weatherdemo.viewmodel.CurWeatherViewModel;

/**
 * Created by GaryCao on 2018/12/12.
 */
public class CurWeatherViewItem implements IViewItem<LiveWeatherBean> {
    private CurWeatherBinding mDataBinding;

    public static CurWeatherViewItem getViewItem() {
        return new CurWeatherViewItem();
    }

    public View createView(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cur_weather, parent, false);
        mDataBinding = CurWeatherBinding.bind(itemView);
        return itemView;
    }

    public void bindView(@NonNull LiveWeatherBean data) {
        mDataBinding.setViewModel(new CurWeatherViewModel(data));
    }
}
