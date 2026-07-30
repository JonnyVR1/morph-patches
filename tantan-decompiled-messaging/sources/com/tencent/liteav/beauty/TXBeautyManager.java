package com.tencent.liteav.beauty;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public interface TXBeautyManager {
    void enableSharpnessEnhancement(boolean z);

    void setBeautyLevel(int i);

    void setBeautyStyle(int i);

    void setChinLevel(int i);

    void setEyeAngleLevel(int i);

    void setEyeDistanceLevel(int i);

    void setEyeLightenLevel(int i);

    void setEyeScaleLevel(int i);

    void setFaceBeautyLevel(int i);

    void setFaceShortLevel(int i);

    void setFaceSlimLevel(int i);

    void setFaceVLevel(int i);

    void setFilter(Bitmap bitmap);

    void setFilterStrength(float f);

    void setForeheadLevel(int i);

    void setGreenScreenFile(String str);

    void setLipsThicknessLevel(int i);

    void setMotionMute(boolean z);

    void setMotionTmpl(String str);

    void setMouthShapeLevel(int i);

    void setNosePositionLevel(int i);

    void setNoseSlimLevel(int i);

    void setNoseWingLevel(int i);

    void setPounchRemoveLevel(int i);

    void setPreprocessor(C14100d c14100d);

    void setRuddyLevel(int i);

    void setSmileLinesRemoveLevel(int i);

    void setToothWhitenLevel(int i);

    void setWhitenessLevel(int i);

    void setWrinkleRemoveLevel(int i);
}
