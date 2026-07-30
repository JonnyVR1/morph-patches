package com.tencent.open.utils;

/* JADX INFO: renamed from: com.tencent.open.utils.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14561p implements Cloneable {

    /* JADX INFO: renamed from: a */
    private int f61209a;

    public C14561p(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] << 8) & 65280;
        this.f61209a = i2;
        this.f61209a = i2 + (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m85699a() {
        int i = this.f61209a;
        return new byte[]{(byte) (i & 255), (byte) ((i & 65280) >> 8)};
    }

    /* JADX INFO: renamed from: b */
    public int m85700b() {
        return this.f61209a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C14561p) && this.f61209a == ((C14561p) obj).m85700b();
    }

    public int hashCode() {
        return this.f61209a;
    }

    public C14561p(byte[] bArr) {
        this(bArr, 0);
    }

    public C14561p(int i) {
        this.f61209a = i;
    }
}
