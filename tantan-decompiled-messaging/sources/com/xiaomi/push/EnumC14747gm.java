package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.gm */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14747gm {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);


    /* JADX INFO: renamed from: a */
    private final int f62031a;

    EnumC14747gm(int i) {
        this.f62031a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14747gm m85649a(int i) {
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
