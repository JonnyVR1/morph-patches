package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum SubscribeStateChangeReason {
    SUBSCRIBE(0),
    UNSUBSCRIBE(1),
    REMOTE_PUBLISH(2),
    REMOTE_UNPUBLISH(3),
    STREAM_FAILED_5XX(4),
    STREAM_FAILED_404(5),
    OVER_STREAM_SUBSCRIBE_LIMIT(6),
    NO_SUBSCRIBE_PERMISSION(7);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.SubscribeStateChangeReason$1 */
    public static /* synthetic */ class C136011 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason;

        static {
            int[] iArr = new int[SubscribeStateChangeReason.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason = iArr;
            try {
                iArr[SubscribeStateChangeReason.SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.UNSUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.REMOTE_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.REMOTE_UNPUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.STREAM_FAILED_5XX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.STREAM_FAILED_404.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.OVER_STREAM_SUBSCRIBE_LIMIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[SubscribeStateChangeReason.NO_SUBSCRIBE_PERMISSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    SubscribeStateChangeReason(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SubscribeStateChangeReason fromId(int i) {
        for (SubscribeStateChangeReason subscribeStateChangeReason : values()) {
            if (subscribeStateChangeReason.value() == i) {
                return subscribeStateChangeReason;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C136011.$SwitchMap$com$ss$bytertc$engine$data$SubscribeStateChangeReason[ordinal()]) {
            case 1:
                return "kSubscribeStateChangeReasonSubscribe";
            case 2:
                return "kSubscribeStateChangeReasonUnsubscribe";
            case 3:
                return "kSubscribeStateChangeReasonRemotePublish";
            case 4:
                return "kSubscribeStateChangeReasonRemoteUnpublish";
            case 5:
                return "kSubscribeStateChangeReasonStreamFailed5xx";
            case 6:
                return "kSubscribeStateChangeReasonStreamFailed404";
            case 7:
                return "kSubscribeStateChangeReasonOverStreamSubscribeLimit";
            case 8:
                return "kSubscribeStateChangeReasonNoSubscribePermission";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
