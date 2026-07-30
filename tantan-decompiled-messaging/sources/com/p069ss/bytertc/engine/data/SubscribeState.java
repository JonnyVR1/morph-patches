package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum SubscribeState {
    SUBSCRIBED(0),
    UNSUBSCRIBED(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.SubscribeState$1 */
    public static /* synthetic */ class C134371 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$SubscribeState;

        static {
            int[] iArr = new int[SubscribeState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$SubscribeState = iArr;
            try {
                iArr[SubscribeState.SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeState[SubscribeState.UNSUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    SubscribeState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SubscribeState fromId(int i) {
        for (SubscribeState subscribeState : values()) {
            if (subscribeState.value() == i) {
                return subscribeState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134371.$SwitchMap$com$ss$bytertc$engine$data$SubscribeState[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "kSubscribeStateUnsubscribed";
        }
        return "kSubscribeStateSubscribed";
    }

    public int value() {
        return this.value;
    }
}
