package com.immomo.momomediaext.filter.beauty;

/* JADX INFO: loaded from: classes7.dex */
public interface IBeautyAdapter {
    public static final int BEAUTY_VERSION_BYTE_DANCE = 2;
    public static final int BEAUTY_VERSION_DOKI = 1;
    public static final int BEAUTY_VERSION_ENGINE = 3;
    public static final int BEAUTY_VERSION_NONE = -1;
    public static final int BEAUTY_VERSION_OLD = 0;

    void changeFaceWarp(int i, float f, float f2);

    void changeLookupFilter(String str);

    void changeWarpScaleFactor(float f);

    void enableDraw(boolean z);

    void forbidBeauty(boolean z);

    boolean isBeautyEnable();

    boolean isEnableDraw();

    void release();

    boolean removeMakeup(String str);

    boolean removeMakeupStyle(String str, String str2);

    void setOnDetectCompleteListener(ByteDanceHelper.IFaceDetectCompleteListener iFaceDetectCompleteListener);

    void switchBeauty(int i);

    void switchSmoothFilter(boolean z);

    boolean updateByteDanceFaceBeautyValue(String str, String str2, float f);

    boolean updateFaceBeautyValue(String str, float f);

    void updateLookupFilterIntensity(float f);

    boolean updateMakeupStyleValue(String str, String str2, float f);

    boolean updateMakeupValue(String str, String str2, float f);
}
