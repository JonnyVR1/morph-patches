package com.p046p1.mobile.putong.data;

import com.p046p1.mobile.putong.data.PaymentStatus;
import com.tantanapp.common.data.EnumJsonAdapter;
import com.tantanapp.common.data.EnumProtobufAdapter;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public enum PaymentStatus {
    unknown_(-1),
    pending(0),
    success(1),
    closed(2);

    private int ordinal;
    public static PaymentStatus[] VALUES = values();
    public static String[] STRS = {"unknown_", "pending", "success", "closed"};
    public static EnumJsonAdapter<PaymentStatus> JSON_ADAPTER = new EnumJsonAdapter<>(STRS, VALUES);
    public static EnumProtobufAdapter<PaymentStatus> PROTOBUF_ADAPTER = new EnumProtobufAdapter<>(VALUES, new w9j() { // from class: l.hh60
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return Integer.valueOf(((PaymentStatus) obj).getOrdinal());
        }
    });

    PaymentStatus(int i) {
        this.ordinal = i;
    }

    public static PaymentStatus fromString(String str) {
        int i = 0;
        while (true) {
            String[] strArr = STRS;
            if (i >= strArr.length) {
                return VALUES[0];
            }
            if (strArr[i].equals(str)) {
                return VALUES[i];
            }
            i++;
        }
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // java.lang.Enum
    public String toString() {
        return STRS[getOrdinal() + 1];
    }
}
