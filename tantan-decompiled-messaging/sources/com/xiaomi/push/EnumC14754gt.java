package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.gt */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14754gt {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* JADX INFO: renamed from: a */
    private final int f62197a;

    EnumC14754gt(int i) {
        this.f62197a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14754gt m85764a(int i) {
        if (i == 0) {
            return RegIdExpired;
        }
        if (i == 1) {
            return PackageUnregistered;
        }
        if (i != 2) {
            return null;
        }
        return Init;
    }

    /* JADX INFO: renamed from: a */
    public int m85765a() {
        return this.f62197a;
    }
}
