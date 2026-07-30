package com.tencent.open.utils;

/* JADX INFO: renamed from: com.tencent.open.utils.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C14397o implements Cloneable {

    /* JADX INFO: renamed from: a */
    private long f60360a;

    public C14397o(long j) {
        this.f60360a = j;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m84514a() {
        long j = this.f60360a;
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((j & 4278190080L) >> 24)};
    }

    /* JADX INFO: renamed from: b */
    public long m84515b() {
        return this.f60360a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C14397o) && this.f60360a == ((C14397o) obj).m84515b();
    }

    public int hashCode() {
        return (int) this.f60360a;
    }
}
