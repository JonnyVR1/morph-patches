package com.p069ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum SingleStreamPushType {
    SINGLE_STREAM_PUSH_TYPE_TO_CDN(1),
    SINGLE_STREAM_PUSH_TYPE_TO_RTC(2);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.SingleStreamPushType$1 */
    public static /* synthetic */ class C134471 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$SingleStreamPushType;

        static {
            int[] iArr = new int[SingleStreamPushType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$SingleStreamPushType = iArr;
            try {
                iArr[SingleStreamPushType.SINGLE_STREAM_PUSH_TYPE_TO_CDN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamPushType[SingleStreamPushType.SINGLE_STREAM_PUSH_TYPE_TO_RTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    SingleStreamPushType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SingleStreamPushType fromId(int i) {
        for (SingleStreamPushType singleStreamPushType : values()) {
            if (singleStreamPushType.value() == i) {
                return singleStreamPushType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134471.$SwitchMap$com$ss$bytertc$engine$live$SingleStreamPushType[ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "SINGLE_STREAM_PUSH_TYPE_TO_RTC";
        }
        return "SINGLE_STREAM_PUSH_TYPE_TO_CDN";
    }

    public int value() {
        return this.value;
    }
}
