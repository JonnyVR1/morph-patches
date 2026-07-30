package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioMixingType {
    AUDIO_MIXING_TYPE_PLAYOUT(0),
    AUDIO_MIXING_TYPE_PUBLISH(1),
    AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioMixingType$1 */
    public static /* synthetic */ class C135751 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType;

        static {
            int[] iArr = new int[AudioMixingType.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType = iArr;
            try {
                iArr[AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[AudioMixingType.AUDIO_MIXING_TYPE_PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioMixingType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioMixingType fromId(int i) {
        for (AudioMixingType audioMixingType : values()) {
            if (audioMixingType.value() == i) {
                return audioMixingType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135751.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[ordinal()];
        if (i == 1) {
            return "AUDIO_MIXING_TYPE_PLAYOUT";
        }
        if (i != 2) {
            return i != 3 ? "" : "AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH";
        }
        return "AUDIO_MIXING_TYPE_PUBLISH";
    }

    public int value() {
        return this.value;
    }
}
