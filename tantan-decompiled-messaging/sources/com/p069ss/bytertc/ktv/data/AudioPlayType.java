package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioPlayType {
    LOCAL(0),
    REMOTE(1),
    LOCAL_AND_REMOTE(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.AudioPlayType$1 */
    public static /* synthetic */ class C134641 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType;

        static {
            int[] iArr = new int[AudioPlayType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType = iArr;
            try {
                iArr[AudioPlayType.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType[AudioPlayType.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType[AudioPlayType.LOCAL_AND_REMOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioPlayType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioPlayType fromId(int i) {
        for (AudioPlayType audioPlayType : values()) {
            if (audioPlayType.value() == i) {
                return audioPlayType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134641.$SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType[ordinal()];
        if (i == 1) {
            return "AUDIO_PLAY_TYPE_LOCAL";
        }
        if (i != 2) {
            return i != 3 ? "" : "AUDIO_PLAY_TYPE_LOCAL_AND_REMOTE";
        }
        return "AUDIO_PLAY_TYPE_REMOTE";
    }

    public int value() {
        return this.value;
    }
}
