package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioChannel {
    AUDIO_CHANNEL_AUTO(-1),
    AUDIO_CHANNEL_MONO(1),
    AUDIO_CHANNEL_STEREO(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioChannel$1 */
    public static /* synthetic */ class C134071 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioChannel;

        static {
            int[] iArr = new int[AudioChannel.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioChannel = iArr;
            try {
                iArr[AudioChannel.AUDIO_CHANNEL_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_MONO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_STEREO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    AudioChannel(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioChannel fromId(int i) {
        for (AudioChannel audioChannel : values()) {
            if (audioChannel.value() == i) {
                return audioChannel;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134071.$SwitchMap$com$ss$bytertc$engine$data$AudioChannel[ordinal()];
        if (i == 1) {
            return "kAudioChannelAuto";
        }
        if (i != 2) {
            return i != 3 ? "kAudioChannelUnknown" : "kAudioChannelStereo";
        }
        return "kAudioChannelMono";
    }

    public int value() {
        return this.value;
    }
}
