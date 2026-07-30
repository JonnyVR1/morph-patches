package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum PublishStateChangeReason {
    PUBLISH(0),
    UNPUBLISH(1),
    NO_PUBLISH_PERMISSION(2),
    OVER_STREAM_PUBLISH_LIMIT(3),
    MULTIROOM_UNPUBLISH_FAILED(4),
    PUBLISH_STREAM_FAILED(5),
    PUBLISH_STREAM_FORBIDEN(6),
    USER_IN_PUBLISH(7);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.PublishStateChangeReason$1 */
    public static /* synthetic */ class C135951 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason;

        static {
            int[] iArr = new int[PublishStateChangeReason.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason = iArr;
            try {
                iArr[PublishStateChangeReason.PUBLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.UNPUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.NO_PUBLISH_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.OVER_STREAM_PUBLISH_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.MULTIROOM_UNPUBLISH_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.PUBLISH_STREAM_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.PUBLISH_STREAM_FORBIDEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[PublishStateChangeReason.USER_IN_PUBLISH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    PublishStateChangeReason(int i) {
        this.value = i;
    }

    @CalledByNative
    public static PublishStateChangeReason fromId(int i) {
        for (PublishStateChangeReason publishStateChangeReason : values()) {
            if (publishStateChangeReason.value() == i) {
                return publishStateChangeReason;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C135951.$SwitchMap$com$ss$bytertc$engine$data$PublishStateChangeReason[ordinal()]) {
            case 1:
                return "kPublishStateChangeReasonPublish";
            case 2:
                return "kPublishStateChangeReasonUnpublish";
            case 3:
                return "kPublishStateChangeReasonNoPublishPermission";
            case 4:
                return "kPublishStateChangeReasonOverStreamPublishLimit";
            case 5:
                return "kPublishStateChangeReasonMultiRoomUnpublishFailed";
            case 6:
                return "kPublishStateChangeReasonPublishStreamFailed";
            case 7:
                return "kPublishStateChangeReasonPublishStreamForbidden";
            case 8:
                return "kPublishStateChangeReasonUserInPublish";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
