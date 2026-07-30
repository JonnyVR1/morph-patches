package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import p153l.AbstractC16478d8;
import p153l.AbstractC17172g7;
import p153l.azk;
import p153l.syk;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class SipHashFunction extends AbstractC17172g7 implements Serializable {
    static final syk SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private final int f11277c;

    /* JADX INFO: renamed from: d */
    private final int f11278d;

    /* JADX INFO: renamed from: k0 */
    private final long f11279k0;

    /* JADX INFO: renamed from: k1 */
    private final long f11280k1;

    /* JADX INFO: renamed from: com.google.common.hash.SipHashFunction$a */
    public static final class C3024a extends AbstractC16478d8 {

        /* JADX INFO: renamed from: d */
        public final int f11281d;

        /* JADX INFO: renamed from: e */
        public final int f11282e;

        /* JADX INFO: renamed from: f */
        public long f11283f;

        /* JADX INFO: renamed from: g */
        public long f11284g;

        /* JADX INFO: renamed from: h */
        public long f11285h;

        /* JADX INFO: renamed from: i */
        public long f11286i;

        /* JADX INFO: renamed from: j */
        public long f11287j;

        /* JADX INFO: renamed from: k */
        public long f11288k;

        public C3024a(int i, int i2, long j, long j2) {
            super(8);
            this.f11287j = 0L;
            this.f11288k = 0L;
            this.f11281d = i;
            this.f11282e = i2;
            this.f11283f = 8317987319222330741L ^ j;
            this.f11284g = 7237128888997146477L ^ j2;
            this.f11285h = 7816392313619706465L ^ j;
            this.f11286i = 8387220255154660723L ^ j2;
        }

        @Override // p153l.AbstractC16478d8
        /* JADX INFO: renamed from: l */
        public HashCode mo16399l() {
            long j = this.f11288k ^ (this.f11287j << 56);
            this.f11288k = j;
            m16411r(j);
            this.f11285h ^= 255;
            m16412s(this.f11282e);
            return HashCode.fromLong(((this.f11283f ^ this.f11284g) ^ this.f11285h) ^ this.f11286i);
        }

        @Override // p153l.AbstractC16478d8
        /* JADX INFO: renamed from: o */
        public void mo16400o(ByteBuffer byteBuffer) {
            this.f11287j += 8;
            m16411r(byteBuffer.getLong());
        }

        @Override // p153l.AbstractC16478d8
        /* JADX INFO: renamed from: p */
        public void mo16401p(ByteBuffer byteBuffer) {
            this.f11287j += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f11288k ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m16411r(long j) {
            this.f11286i ^= j;
            m16412s(this.f11281d);
            this.f11283f = j ^ this.f11283f;
        }

        /* JADX INFO: renamed from: s */
        public final void m16412s(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f11283f;
                long j2 = this.f11284g;
                this.f11283f = j + j2;
                this.f11285h += this.f11286i;
                this.f11284g = Long.rotateLeft(j2, 13);
                long jRotateLeft = Long.rotateLeft(this.f11286i, 16);
                long j3 = this.f11284g;
                long j4 = this.f11283f;
                this.f11284g = j3 ^ j4;
                this.f11286i = jRotateLeft ^ this.f11285h;
                long jRotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f11285h;
                long j6 = this.f11284g;
                this.f11285h = j5 + j6;
                this.f11283f = jRotateLeft2 + this.f11286i;
                this.f11284g = Long.rotateLeft(j6, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f11286i, 21);
                long j7 = this.f11284g;
                long j8 = this.f11285h;
                this.f11284g = j7 ^ j8;
                this.f11286i = jRotateLeft3 ^ this.f11283f;
                this.f11285h = Long.rotateLeft(j8, 32);
            }
        }
    }

    public SipHashFunction(int i, int i2, long j, long j2) {
        xn80.m212101f(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        xn80.m212101f(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f11277c = i;
        this.f11278d = i2;
        this.f11279k0 = j;
        this.f11280k1 = j2;
    }

    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f11277c == sipHashFunction.f11277c && this.f11278d == sipHashFunction.f11278d && this.f11279k0 == sipHashFunction.f11279k0 && this.f11280k1 == sipHashFunction.f11280k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f11277c) ^ this.f11278d)) ^ this.f11279k0) ^ this.f11280k1);
    }

    @Override // p153l.syk
    public azk newHasher() {
        return new C3024a(this.f11277c, this.f11278d, this.f11279k0, this.f11280k1);
    }

    public String toString() {
        int i = this.f11277c;
        int i2 = this.f11278d;
        long j = this.f11279k0;
        long j2 = this.f11280k1;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i);
        sb.append(i2);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
