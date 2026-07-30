package com.tencent.liteav.basic.util;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14050d {

    /* JADX INFO: renamed from: a */
    public int f58502a;

    /* JADX INFO: renamed from: b */
    public int f58503b;

    public C14050d(int i, int i2) {
        this.f58502a = i;
        this.f58503b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14050d)) {
            return false;
        }
        C14050d c14050d = (C14050d) obj;
        return c14050d.f58502a == this.f58502a && c14050d.f58503b == this.f58503b;
    }

    public int hashCode() {
        return (this.f58502a * 32713) + this.f58503b;
    }

    public String toString() {
        return "Size(" + this.f58502a + ", " + this.f58503b + ")";
    }

    public C14050d() {
    }
}
