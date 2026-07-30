package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioFrameSource {
    AUDIO_FRAME_SOURCE_MIC(0),
    AUDIO_FRAME_SOURCE_PLAYBACK(1),
    AUDIO_FRAME_SOURCE_MIXED(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioFrameSource$1 */
    public static /* synthetic */ class C134081 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource;

        static {
            int[] iArr = new int[AudioFrameSource.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource = iArr;
            try {
                iArr[AudioFrameSource.AUDIO_FRAME_SOURCE_MIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioFrameSource(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioFrameSource fromId(int i) {
        for (AudioFrameSource audioFrameSource : values()) {
            if (audioFrameSource.value() == i) {
                return audioFrameSource;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134081.$SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[ordinal()];
        if (i == 1) {
            return "kAudioFrameSourceMic";
        }
        if (i != 2) {
            return i != 3 ? "" : "kAudioFrameSourceMixed";
        }
        return "kAudioFrameSourcePlayback";
    }

    public int value() {
        return this.value;
    }
}
