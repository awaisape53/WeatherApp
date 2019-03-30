package com.gary.weatherdemo.bean.base;

/**
 * Created by GaryCao on 2018/12/12.
 */
public abstract class BaseItemBean {
    private final int mViewItemType;

    public BaseItemBean(int viewItemType) {
        this.mViewItemType = viewItemType;
    }

    public int getViewItemType() {
        return mViewItemType;
    }

    /**
     * Created by GaryCao on 2018/12/12.
     */
    public static class ItemViewType {
        /*当前天气列表项*/
        public final static int RV_CURRENT_WEATHER_ITEM_TYPE = 1;

        /*预报天气列表项*/
        public final static int RV_FORECAST_DAY_WEATHER_ITEM_TYPE = 2;

        /*搜索城市列表项*/
        public final static int RV_SEARCH_CITY_ITEM_TYPE = 3;
    }
}
