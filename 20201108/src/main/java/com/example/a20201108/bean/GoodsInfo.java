package com.example.a20201108.bean;

import com.example.a20201108.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone12", "小米10至尊纪念版", "iphone12 ProMax","watch","ipad","macbook","华为P40","华为Mate40"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 128GB 石墨色5G手机",
            "小米10至尊纪念全网通版 8GB+256GB 陶瓷黑",
            "Apple iPhone12 ProMax 128GB 5G手机",
            "Apple Watch Series 6",
            " iPad A12 仿生芯片",
            "macbookpro M1 芯片的 8 核图形处理器",
            "华为P40",
            "华为Mate40"

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {8499, 5599, 9299, 3199,4999,9999,4299,7299};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone12_s, R.drawable.xiaomi10_s, R.drawable.pingguo12promax_s,
            R.drawable.applewatch6jpg_s,R.drawable.air4_s,R.drawable.macbookpro_s,R.drawable.huaweip40_s,R.drawable.mate40_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone12, R.drawable.xiaomi10, R.drawable.pingguo12promax_s,
            R.drawable.applewatch6jpg,R.drawable.air4,R.drawable.macbookpro,R.drawable.huaweip40,R.drawable.mate40};

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
