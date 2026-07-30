package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioVADType {
    NO_SPEECH(0),
    SPEECH(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioVADType$1 */
    public static /* synthetic */ class C135831 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioVADType;

        static {
            int[] iArr = new int[AudioVADType.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioVADType = iArr;
            try {
                iArr[AudioVADType.NO_SPEECH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioVADType[AudioVADType.SPEECH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioVADType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioVADType fromId(int i) {
        for (AudioVADType audioVADType : values()) {
            if (audioVADType.value() == i) {
                return audioVADType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135831.$SwitchMap$com$ss$bytertc$engine$data$AudioVADType[ordinal()];
        if (i != 1) {
            return i != 2 ? BLiveRightItem.PERIOD_VALID : "kAudioVADTypeSpeech";
        }
        return "kAudioVADTypeNoSpeech";
    }

    public int value() {
        return this.value;
    }
}
