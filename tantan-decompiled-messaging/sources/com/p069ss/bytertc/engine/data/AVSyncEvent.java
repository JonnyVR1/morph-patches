package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AVSyncEvent {
    INVALID_UID_REPEATED(0);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AVSyncEvent$1 */
    public static /* synthetic */ class C134031 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AVSyncEvent;

        static {
            int[] iArr = new int[AVSyncEvent.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AVSyncEvent = iArr;
            try {
                iArr[AVSyncEvent.INVALID_UID_REPEATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    AVSyncEvent(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AVSyncEvent fromId(int i) {
        for (AVSyncEvent aVSyncEvent : values()) {
            if (aVSyncEvent.value() == i) {
                return aVSyncEvent;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C134031.$SwitchMap$com$ss$bytertc$engine$data$AVSyncEvent[ordinal()] != 1 ? "" : "kAVSyncEventInvalidUidRepeated";
    }

    public int value() {
        return this.value;
    }
}
