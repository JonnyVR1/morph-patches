package com.tencent.open.utils;

/* JADX INFO: renamed from: com.tencent.open.utils.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14398p implements Cloneable {

    /* JADX INFO: renamed from: a */
    private int f60361a;

    public C14398p(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] << 8) & 65280;
        this.f60361a = i2;
        this.f60361a = i2 + (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m84516a() {
        int i = this.f60361a;
        return new byte[]{(byte) (i & 255), (byte) ((i & 65280) >> 8)};
    }

    /* JADX INFO: renamed from: b */
    public int m84517b() {
        return this.f60361a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C14398p) && this.f60361a == ((C14398p) obj).m84517b();
    }

    public int hashCode() {
        return this.f60361a;
    }

    public C14398p(byte[] bArr) {
        this(bArr, 0);
    }

    public C14398p(int i) {
        this.f60361a = i;
    }
}
