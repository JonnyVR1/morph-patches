package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioQuality {
    AUDIO_QUALITY_LOW(0),
    AUDIO_QUALITY_MEDIUM(1),
    AUDIO_QUALITY_HIGH(2),
    AUDIO_QUALITY_ULTRA_HIGH(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioQuality$1 */
    public static /* synthetic */ class C135791 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioQuality;

        static {
            int[] iArr = new int[AudioQuality.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioQuality = iArr;
            try {
                iArr[AudioQuality.AUDIO_QUALITY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_ULTRA_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AudioQuality(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioQuality fromId(int i) {
        for (AudioQuality audioQuality : values()) {
            if (audioQuality.value() == i) {
                return audioQuality;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135791.$SwitchMap$com$ss$bytertc$engine$data$AudioQuality[ordinal()];
        if (i == 1) {
            return "kAudioQualityLow";
        }
        if (i == 2) {
            return "kAudioQualityMedium";
        }
        if (i != 3) {
            return i != 4 ? "" : "kAudioQualityUltraHigh";
        }
        return "kAudioQualityHigh";
    }

    public int value() {
        return this.value;
    }
}
