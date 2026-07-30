package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes2.dex */
public class BeautyOptions {
    public static final int LIGHTENING_CONTRAST_HIGH = 2;
    public static final int LIGHTENING_CONTRAST_LOW = 0;
    public static final int LIGHTENING_CONTRAST_NORMAL = 1;
    public int lighteningContrastLevel;
    public float lighteningLevel;
    public float rednessLevel;
    public float sharpnessLevel;
    public float smoothnessLevel;

    public BeautyOptions() {
        this.lighteningContrastLevel = 1;
        this.lighteningLevel = 0.6f;
        this.smoothnessLevel = 0.5f;
        this.rednessLevel = 0.1f;
        this.sharpnessLevel = 0.3f;
    }

    public BeautyOptions(int i, float f, float f2, float f3, float f4) {
        this.lighteningContrastLevel = i;
        this.lighteningLevel = f;
        this.smoothnessLevel = f2;
        this.rednessLevel = f3;
        this.sharpnessLevel = f4;
    }
}
