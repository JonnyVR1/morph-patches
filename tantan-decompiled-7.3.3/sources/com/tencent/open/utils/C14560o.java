package com.tencent.open.utils;

/* JADX INFO: renamed from: com.tencent.open.utils.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C14560o implements Cloneable {

    /* JADX INFO: renamed from: a */
    private long f61208a;

    public C14560o(long j) {
        this.f61208a = j;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m85697a() {
        long j = this.f61208a;
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((j & 4278190080L) >> 24)};
    }

    /* JADX INFO: renamed from: b */
    public long m85698b() {
        return this.f61208a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C14560o) && this.f61208a == ((C14560o) obj).m85698b();
    }

    public int hashCode() {
        return (int) this.f61208a;
    }
}
