package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioTrackType {
    ORIGINAL(1),
    ACCOMPANY(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.AudioTrackType$1 */
    public static /* synthetic */ class C134651 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType;

        static {
            int[] iArr = new int[AudioTrackType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType = iArr;
            try {
                iArr[AudioTrackType.ACCOMPANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType[AudioTrackType.ORIGINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioTrackType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioTrackType fromId(int i) {
        for (AudioTrackType audioTrackType : values()) {
            if (audioTrackType.value() == i) {
                return audioTrackType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134651.$SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "AUDIO_TRACK_TYPE_ORIGINAL";
        }
        return "AUDIO_TRACK_TYPE_ACCOMPANY";
    }

    public int value() {
        return this.value;
    }
}
