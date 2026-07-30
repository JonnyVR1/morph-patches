package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioCodecType {
    NONE(0),
    OPUS(1),
    AAC(2),
    AACLC(3),
    AACHEV1(4),
    AACHEV2(5),
    AACLCADTS(6);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.type.AudioCodecType$1 */
    public static /* synthetic */ class C136141 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType;

        static {
            int[] iArr = new int[AudioCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType = iArr;
            try {
                iArr[AudioCodecType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[AudioCodecType.OPUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[AudioCodecType.AAC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[AudioCodecType.AACLC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[AudioCodecType.AACHEV1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[AudioCodecType.AACHEV2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[AudioCodecType.AACLCADTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    AudioCodecType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioCodecType fromId(int i) {
        for (AudioCodecType audioCodecType : values()) {
            if (audioCodecType.value() == i) {
                return audioCodecType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C136141.$SwitchMap$com$ss$bytertc$engine$type$AudioCodecType[ordinal()]) {
            case 1:
                return "kAudioCodecTypeNone";
            case 2:
                return "kAudioCodecTypeOpus";
            case 3:
                return "kAudioCodecTypeAAC";
            case 4:
                return "kAudioCodecTypeAACLC";
            case 5:
                return "kAudioCodecTypeAACHEv1";
            case 6:
                return "kAudioCodecTypeAACHEv2";
            case 7:
                return "kAudioCodecTypeAACLCadts";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
