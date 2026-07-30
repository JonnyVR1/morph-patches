package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum LocalAudioStreamState {
    LOCAL_AUDIO_STREAM_STATE_STOPPED(0),
    LOCAL_AUDIO_STREAM_STATE_RECORDING(1),
    LOCAL_AUDIO_STREAM_STATE_ENCODING(2),
    LOCAL_AUDIO_STREAM_STATE_FAILED(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.LocalAudioStreamState$1 */
    public static /* synthetic */ class C134241 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState;

        static {
            int[] iArr = new int[LocalAudioStreamState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState = iArr;
            try {
                iArr[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[LocalAudioStreamState.LOCAL_AUDIO_STREAM_STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    LocalAudioStreamState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static LocalAudioStreamState fromId(int i) {
        for (LocalAudioStreamState localAudioStreamState : values()) {
            if (localAudioStreamState.value() == i) {
                return localAudioStreamState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134241.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamState[ordinal()];
        if (i == 1) {
            return "kLocalAudioStreamStateStopped";
        }
        if (i == 2) {
            return "kLocalAudioStreamStateRecording";
        }
        if (i != 3) {
            return i != 4 ? "" : "kLocalAudioStreamStateFailed";
        }
        return "kLocalAudioStreamStateEncoding";
    }

    public int value() {
        return this.value;
    }
}
