package com.momo.mcamera.ThirdPartEffect.Pott.config;

import android.graphics.Bitmap;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PottParameter {
    public static final String MAP_TYPE_CHINA = "china";
    public static final String MAP_TYPE_WORLD = "world";
    public int chinaCityCnt;
    public int chinaProvinceCnt;
    public String configResourcePath;
    public int countryCnt;
    public String useLocationPath;
    public Bitmap userHeadIconBitmap;
    public String userHeadIcondPath;
    public Bitmap userIdBitmap;
    public String userIdPath;
    public Bitmap userNickNameBitmap;
    public String userNickNamePath;
    public int worldCityCnt;
    public List<PointF> traveledLocations = new ArrayList();
    public String mapType = MAP_TYPE_WORLD;
    public List<String> imageList = new ArrayList();
    public List<String> userLocationList = new ArrayList();
    public List<Bitmap> userLocationBmpList = new ArrayList();
}
