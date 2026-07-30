package com.p074ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum SingleStreamTaskErrorCode {
    OK(0),
    BASE(1090),
    UNKNOWN_BY_SERVER(1091),
    SIGNAL_REQUEST_TIMEOUT(1092),
    INVALID_PARAM_BY_SERVER(1093),
    REMOTE_KICKED(1094),
    JOIN_DEST_ROOM_FAIED(1095),
    RECEIVE_SRC_STREAM_TIMEOUT(1096),
    NOT_SURPORT_CODEC(1097);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.SingleStreamTaskErrorCode$1 */
    public static /* synthetic */ class C136111 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode;

        static {
            int[] iArr = new int[SingleStreamTaskErrorCode.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode = iArr;
            try {
                iArr[SingleStreamTaskErrorCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.BASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.UNKNOWN_BY_SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.SIGNAL_REQUEST_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.INVALID_PARAM_BY_SERVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.REMOTE_KICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.JOIN_DEST_ROOM_FAIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.RECEIVE_SRC_STREAM_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[SingleStreamTaskErrorCode.NOT_SURPORT_CODEC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    SingleStreamTaskErrorCode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static SingleStreamTaskErrorCode fromId(int i) {
        for (SingleStreamTaskErrorCode singleStreamTaskErrorCode : values()) {
            if (singleStreamTaskErrorCode.value() == i) {
                return singleStreamTaskErrorCode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C136111.$SwitchMap$com$ss$bytertc$engine$live$SingleStreamTaskErrorCode[ordinal()]) {
            case 1:
                return "OK";
            case 2:
                return "BASE";
            case 3:
                return "UNKNOWN_BY_SERVER";
            case 4:
                return "SIGNAL_REQUEST_TIMEOUT";
            case 5:
                return "INVALID_PARAM_BY_SERVER";
            case 6:
                return "REMOTE_KICKED";
            case 7:
                return "JOIN_DEST_ROOM_FAIED";
            case 8:
                return "RECEIVE_SRC_STREAM_TIMEOUT";
            case 9:
                return "NOT_SURPORT_CODEC";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}
