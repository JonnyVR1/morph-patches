package com.tencent.liteav.basic.util;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14213d {

    /* JADX INFO: renamed from: a */
    public int f59350a;

    /* JADX INFO: renamed from: b */
    public int f59351b;

    public C14213d(int i, int i2) {
        this.f59350a = i;
        this.f59351b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14213d)) {
            return false;
        }
        C14213d c14213d = (C14213d) obj;
        return c14213d.f59350a == this.f59350a && c14213d.f59351b == this.f59351b;
    }

    public int hashCode() {
        return (this.f59350a * 32713) + this.f59351b;
    }

    public String toString() {
        return "Size(" + this.f59350a + ", " + this.f59351b + ")";
    }

    public C14213d() {
    }
}
