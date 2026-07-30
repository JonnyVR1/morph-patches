package com.immomo.push.p040pb;

import com.google.protobuf.C3414l;

/* JADX INFO: loaded from: classes7.dex */
public enum BodyType implements C3414l.c {
    RET(0),
    SAUTH(1),
    SAUTH_RET(2),
    MSG_PSH(3),
    MSG_SYN(4),
    MSG_ACK(5),
    MSG_FIN(6),
    DISCONNECT(7),
    MSG(8),
    NOTIFY(9),
    MSGV2(10),
    NOTIFYV2(11),
    UNRECOGNIZED(-1);

    public static final int DISCONNECT_VALUE = 7;
    public static final int MSGV2_VALUE = 10;
    public static final int MSG_ACK_VALUE = 5;
    public static final int MSG_FIN_VALUE = 6;
    public static final int MSG_PSH_VALUE = 3;
    public static final int MSG_SYN_VALUE = 4;
    public static final int MSG_VALUE = 8;
    public static final int NOTIFYV2_VALUE = 11;
    public static final int NOTIFY_VALUE = 9;
    public static final int RET_VALUE = 0;
    public static final int SAUTH_RET_VALUE = 2;
    public static final int SAUTH_VALUE = 1;
    private static final C3414l.d<BodyType> internalValueMap = new C3414l.d<BodyType>() { // from class: com.immomo.push.pb.BodyType.a
        @Override // com.google.protobuf.C3414l.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BodyType findValueByNumber(int i) {
            return BodyType.forNumber(i);
        }
    };
    private final int value;

    BodyType(int i) {
        this.value = i;
    }

    public static BodyType forNumber(int i) {
        switch (i) {
            case 0:
                return RET;
            case 1:
                return SAUTH;
            case 2:
                return SAUTH_RET;
            case 3:
                return MSG_PSH;
            case 4:
                return MSG_SYN;
            case 5:
                return MSG_ACK;
            case 6:
                return MSG_FIN;
            case 7:
                return DISCONNECT;
            case 8:
                return MSG;
            case 9:
                return NOTIFY;
            case 10:
                return MSGV2;
            case 11:
                return NOTIFYV2;
            default:
                return null;
        }
    }

    public static C3414l.d<BodyType> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.C3414l.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static BodyType valueOf(int i) {
        return forNumber(i);
    }
}
