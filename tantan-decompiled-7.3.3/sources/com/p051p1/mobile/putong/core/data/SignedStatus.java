package com.p051p1.mobile.putong.core.data;

import com.p051p1.mobile.putong.core.data.SignedStatus;
import com.tantanapp.common.data.EnumJsonAdapter;
import com.tantanapp.common.data.EnumProtobufAdapter;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public enum SignedStatus {
    unknown_(-1),
    normal(0),
    finished(1),
    expired(2);

    private int ordinal;
    public static SignedStatus[] VALUES = values();
    public static String[] STRS = {"unknown_", "normal", "finished", "expired"};
    public static EnumJsonAdapter<SignedStatus> JSON_ADAPTER = new EnumJsonAdapter<>(STRS, VALUES);
    public static EnumProtobufAdapter<SignedStatus> PROTOBUF_ADAPTER = new EnumProtobufAdapter<>(VALUES, new qcj() { // from class: l.gnf0
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return Integer.valueOf(((SignedStatus) obj).getOrdinal());
        }
    });

    SignedStatus(int i) {
        this.ordinal = i;
    }

    public static SignedStatus fromString(String str) {
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
