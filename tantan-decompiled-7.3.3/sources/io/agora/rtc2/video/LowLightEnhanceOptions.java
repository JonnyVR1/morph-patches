package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes2.dex */
public class LowLightEnhanceOptions {
    public static final int LOW_LIGHT_ENHANCE_AUTO = 0;
    public static final int LOW_LIGHT_ENHANCE_LEVEL_FAST = 1;
    public static final int LOW_LIGHT_ENHANCE_LEVEL_HIGH_QUALITY = 0;
    public static final int LOW_LIGHT_ENHANCE_MANUAL = 1;
    public int lowlightEnhanceLevel;
    public int lowlightEnhanceMode;

    public LowLightEnhanceOptions() {
        this.lowlightEnhanceMode = 0;
        this.lowlightEnhanceLevel = 0;
    }

    public LowLightEnhanceOptions(int i, int i2) {
        this.lowlightEnhanceMode = i;
        this.lowlightEnhanceLevel = i2;
    }
}
