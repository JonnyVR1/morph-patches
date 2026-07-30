package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.gt */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14902gt {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* JADX INFO: renamed from: a */
    private final int f63044a;

    EnumC14902gt(int i) {
        this.f63044a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14902gt m86935a(int i) {
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
    public int m86936a() {
        return this.f63044a;
    }
}
