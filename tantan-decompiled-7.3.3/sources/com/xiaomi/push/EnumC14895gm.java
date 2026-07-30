package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.gm */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14895gm {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);


    /* JADX INFO: renamed from: a */
    private final int f62878a;

    EnumC14895gm(int i) {
        this.f62878a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14895gm m86820a(int i) {
        if (i == 1) {
            return INT;
        }
        if (i == 2) {
            return LONG;
        }
        if (i == 3) {
            return STRING;
        }
        if (i != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
