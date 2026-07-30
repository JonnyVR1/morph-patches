package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum RemoteAudioState {
    REMOTE_AUDIO_STATE_STOPPED(0),
    REMOTE_AUDIO_STATE_STARTING(1),
    REMOTE_AUDIO_STATE_DECODING(2),
    REMOTE_AUDIO_STATE_FROZEN(3),
    REMOTE_AUDIO_STATE_FAILED(4);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.RemoteAudioState$1 */
    public static /* synthetic */ class C135961 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState;

        static {
            int[] iArr = new int[RemoteAudioState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState = iArr;
            try {
                iArr[RemoteAudioState.REMOTE_AUDIO_STATE_STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_DECODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_FROZEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    RemoteAudioState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RemoteAudioState fromId(int i) {
        for (RemoteAudioState remoteAudioState : values()) {
            if (remoteAudioState.value() == i) {
                return remoteAudioState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135961.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[ordinal()];
        if (i == 1) {
            return "kRemoteAudioStateStopped";
        }
        if (i == 2) {
            return "kRemoteAudioStateStarting";
        }
        if (i == 3) {
            return "kRemoteAudioStateDecoding";
        }
        if (i != 4) {
            return i != 5 ? "" : "kRemoteAudioStateFailed";
        }
        return "kRemoteAudioStateFrozen";
    }

    public int value() {
        return this.value;
    }
}
