package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioAEDType {
    NO_MUSIC(0),
    MUSIC(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.type.AudioAEDType$1 */
    public static /* synthetic */ class C136131 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$AudioAEDType;

        static {
            int[] iArr = new int[AudioAEDType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$AudioAEDType = iArr;
            try {
                iArr[AudioAEDType.NO_MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioAEDType[AudioAEDType.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioAEDType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioAEDType fromId(int i) {
        for (AudioAEDType audioAEDType : values()) {
            if (audioAEDType.value() == i) {
                return audioAEDType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C136131.$SwitchMap$com$ss$bytertc$engine$type$AudioAEDType[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "kAudioAEDTypeMusic";
        }
        return "kAudioAEDTypeNoMusic";
    }

    public int value() {
        return this.value;
    }
}
