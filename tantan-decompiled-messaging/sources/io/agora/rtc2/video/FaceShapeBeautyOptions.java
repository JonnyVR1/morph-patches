package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class FaceShapeBeautyOptions {
    public static final int FACE_SHAPE_BEAUTY_STYLE_FEMALE = 0;
    public static final int FACE_SHAPE_BEAUTY_STYLE_MALE = 1;
    public int shapeStyle;
    public int styleIntensity;

    public FaceShapeBeautyOptions() {
        this.shapeStyle = 0;
        this.styleIntensity = 50;
    }

    @CalledByNative
    public FaceShapeBeautyOptions(int i, int i2) {
        this.shapeStyle = i;
        this.styleIntensity = i2;
    }
}
