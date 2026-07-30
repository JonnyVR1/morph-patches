package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.CoinActionType;
import com.tantanapp.common.data.EnumJsonAdapter;
import com.tantanapp.common.data.EnumProtobufAdapter;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public enum CoinActionType {
    unknown_(-1),
    add(0),
    minus(1);

    private int ordinal;
    public static CoinActionType[] VALUES = values();
    public static String[] STRS = {"unknown_", "add", "minus"};
    public static EnumJsonAdapter<CoinActionType> JSON_ADAPTER = new EnumJsonAdapter<>(STRS, VALUES);
    public static EnumProtobufAdapter<CoinActionType> PROTOBUF_ADAPTER = new EnumProtobufAdapter<>(VALUES, new w9j() { // from class: l.xb5
        public final Object call(Object obj) {
            return Integer.valueOf(((CoinActionType) obj).getOrdinal());
        }
    });

    CoinActionType(int i) {
        this.ordinal = i;
    }

    public static CoinActionType fromString(String str) {
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
