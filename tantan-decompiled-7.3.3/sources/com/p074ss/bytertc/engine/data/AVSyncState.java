package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum AVSyncState {
    AV_SYNC_STATE_STREAM_SYNC_BEGIN(0),
    AV_SYNC_STATE_AUDIO_STREAM_REMOVE(1),
    AV_SYNC_STATE_VIDEO_STREAM_REMOVE(2),
    AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AVSyncState$1 */
    public static /* synthetic */ class C135671 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AVSyncState;

        static {
            int[] iArr = new int[AVSyncState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AVSyncState = iArr;
            try {
                iArr[AVSyncState.AV_SYNC_STATE_STREAM_SYNC_BEGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_AUDIO_STREAM_REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_VIDEO_STREAM_REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AVSyncState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AVSyncState fromId(int i) {
        for (AVSyncState aVSyncState : values()) {
            if (aVSyncState.value() == i) {
                return aVSyncState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C135671.$SwitchMap$com$ss$bytertc$engine$data$AVSyncState[ordinal()];
        if (i == 1) {
            return "AV_SYNC_STATE_STREAM_SYNC_BEGIN";
        }
        if (i == 2) {
            return "AV_SYNC_STATE_AUDIO_STREAM_REMOVE";
        }
        if (i != 3) {
            return i != 4 ? "" : "AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID";
        }
        return "AV_SYNC_STATE_VIDEO_STREAM_REMOVE";
    }

    public int value() {
        return this.value;
    }
}
