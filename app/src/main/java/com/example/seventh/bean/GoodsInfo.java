package com.example.seventh.bean;

import com.example.seventh.R;

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
            "iPhone7", "Mate20", "小米6plus", "OPPO R15", "vivo X9S", "魅族Pro6"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 7 256GB 玫瑰金",
            "华为 HUAWEI Mate20 （香槟金）",
            "小米 MI6PLUS  亮白色",
            "OPPO R15  4G+64G  玫瑰金",
            "vivo X9s 4GB+64GB  玫瑰金",
            "魅族 PRO6 4GB+64GB  星空黑"
    };
    // 声明一个手机商品的价格数组
    private static double[] mPriceArray = {5888, 4988, 2899, 1899, 3799, 4099};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.apple_s, R.drawable.huawei_s, R.drawable.vivo_s,
            R.drawable.oppo_s, R.drawable.meizu_s, R.drawable.xaiomi_s,

    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.apple, R.drawable.huawei, R.drawable.vivo,
            R.drawable.oppo, R.drawable.meizu, R.drawable.xaiomi,
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = (float) mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
