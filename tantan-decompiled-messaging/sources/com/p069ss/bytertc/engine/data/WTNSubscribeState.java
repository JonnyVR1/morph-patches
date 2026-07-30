package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum WTNSubscribeState {
    SUBSCRIBED(0),
    UNSUBSCRIBED(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.WTNSubscribeState$1 */
    public static /* synthetic */ class C134411 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$WTNSubscribeState;

        static {
            int[] iArr = new int[WTNSubscribeState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$WTNSubscribeState = iArr;
            try {
                iArr[WTNSubscribeState.SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$WTNSubscribeState[WTNSubscribeState.UNSUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    WTNSubscribeState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static WTNSubscribeState fromId(int i) {
        for (WTNSubscribeState wTNSubscribeState : values()) {
            if (wTNSubscribeState.value() == i) {
                return wTNSubscribeState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134411.$SwitchMap$com$ss$bytertc$engine$data$WTNSubscribeState[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "kWTNSubscribeStateUnsubscribed";
        }
        return "kWTNSubscribeStateSubscribed";
    }

    public int value() {
        return this.value;
    }
}
