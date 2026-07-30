package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum WTNSubscribeStateChangeReason {
    SUBSCRIBE(0),
    UNSUBSCRIBE(1300),
    REMOTE_UNPUBLISH(1301),
    OVER_CLIENT_SUBSCRIBE_STREAM_LIMIT(1310),
    OVER_STREAM_SUBSCRIBE_USER_LIMIT(1311),
    OVER_STREAM_SUBSCRIBE_REQUEST_LIMIT(1312);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.WTNSubscribeStateChangeReason$1 */
    public static /* synthetic */ class C134421 {

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$engine$data$WTNSubscribeStateChangeReason */
        static final /* synthetic */ int[] f55630x6bc8b388;

        static {
            int[] iArr = new int[WTNSubscribeStateChangeReason.values().length];
            f55630x6bc8b388 = iArr;
            try {
                iArr[WTNSubscribeStateChangeReason.SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55630x6bc8b388[WTNSubscribeStateChangeReason.UNSUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55630x6bc8b388[WTNSubscribeStateChangeReason.REMOTE_UNPUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55630x6bc8b388[WTNSubscribeStateChangeReason.OVER_CLIENT_SUBSCRIBE_STREAM_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55630x6bc8b388[WTNSubscribeStateChangeReason.OVER_STREAM_SUBSCRIBE_USER_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55630x6bc8b388[WTNSubscribeStateChangeReason.OVER_STREAM_SUBSCRIBE_REQUEST_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    WTNSubscribeStateChangeReason(int i) {
        this.value = i;
    }

    @CalledByNative
    public static WTNSubscribeStateChangeReason fromId(int i) {
        for (WTNSubscribeStateChangeReason wTNSubscribeStateChangeReason : values()) {
            if (wTNSubscribeStateChangeReason.value() == i) {
                return wTNSubscribeStateChangeReason;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C134421.f55630x6bc8b388[ordinal()]) {
            case 1:
                return "kWTNSubscribeStateChangeReasonSubscribe";
            case 2:
                return "kWTNSubscribeStateChangeReasonUnsubscribe";
            case 3:
                return "kWTNSubscribeStateChangeReasonRemoteUnpublish";
            case 4:
                return "kWTNSubscribeStateChangeReasonOverClientSubscribeStreamLimit";
            case 5:
                return "kWTNSubscribeStateChangeReasonOverStreamSubscribeUserLimit";
            case 6:
                return "kWTNSubscribeStateChangeReasonOverStreamSubscribeRequestLimit";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
