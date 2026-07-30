package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum PublishState {
    PUBLISHED(0),
    UNPUBLISHED(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.PublishState$1 */
    public static /* synthetic */ class C134311 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$PublishState;

        static {
            int[] iArr = new int[PublishState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$PublishState = iArr;
            try {
                iArr[PublishState.PUBLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishState[PublishState.UNPUBLISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    PublishState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static PublishState fromId(int i) {
        for (PublishState publishState : values()) {
            if (publishState.value() == i) {
                return publishState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134311.$SwitchMap$com$ss$bytertc$engine$data$PublishState[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "kPublishStateUnpublished";
        }
        return "kPublishStatePublished";
    }

    public int value() {
        return this.value;
    }
}
