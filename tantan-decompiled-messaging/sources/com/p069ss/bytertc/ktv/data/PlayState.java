package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum PlayState {
    PLAYING(1),
    PAUSED(2),
    STOPPED(3),
    FAILED(4),
    FINISHED(5);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.ktv.data.PlayState$1 */
    public static /* synthetic */ class C134721 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$PlayState;

        static {
            int[] iArr = new int[PlayState.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$PlayState = iArr;
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    PlayState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static PlayState fromId(int i) {
        for (PlayState playState : values()) {
            if (playState.value() == i) {
                return playState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134721.$SwitchMap$com$ss$bytertc$ktv$data$PlayState[ordinal()];
        if (i == 1) {
            return "PLAY_STATE_PLAYING";
        }
        if (i == 2) {
            return "PLAY_STATE_PAUSED";
        }
        if (i == 3) {
            return "PLAY_STATE_STOPPED";
        }
        if (i != 4) {
            return i != 5 ? "" : "PLAY_STATE_FINISHED";
        }
        return "PLAY_STATE_FAILED";
    }

    public int value() {
        return this.value;
    }
}
