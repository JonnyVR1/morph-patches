package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import p149l.AbstractC17506i8;
import p149l.AbstractC18156l7;
import p149l.cwk;
import p149l.kwk;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
final class SipHashFunction extends AbstractC18156l7 implements Serializable {
    static final cwk SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private final int f11240c;

    /* JADX INFO: renamed from: d */
    private final int f11241d;

    /* JADX INFO: renamed from: k0 */
    private final long f11242k0;

    /* JADX INFO: renamed from: k1 */
    private final long f11243k1;

    /* JADX INFO: renamed from: com.google.common.hash.SipHashFunction$a */
    public static final class C3001a extends AbstractC17506i8 {

        /* JADX INFO: renamed from: d */
        public final int f11244d;

        /* JADX INFO: renamed from: e */
        public final int f11245e;

        /* JADX INFO: renamed from: f */
        public long f11246f;

        /* JADX INFO: renamed from: g */
        public long f11247g;

        /* JADX INFO: renamed from: h */
        public long f11248h;

        /* JADX INFO: renamed from: i */
        public long f11249i;

        /* JADX INFO: renamed from: j */
        public long f11250j;

        /* JADX INFO: renamed from: k */
        public long f11251k;

        public C3001a(int i, int i2, long j, long j2) {
            super(8);
            this.f11250j = 0L;
            this.f11251k = 0L;
            this.f11244d = i;
            this.f11245e = i2;
            this.f11246f = 8317987319222330741L ^ j;
            this.f11247g = 7237128888997146477L ^ j2;
            this.f11248h = 7816392313619706465L ^ j;
            this.f11249i = 8387220255154660723L ^ j2;
        }

        @Override // p149l.AbstractC17506i8
        /* JADX INFO: renamed from: k */
        public HashCode mo16344k() {
            long j = this.f11251k ^ (this.f11250j << 56);
            this.f11251k = j;
            m16356q(j);
            this.f11248h ^= 255;
            m16357r(this.f11245e);
            return HashCode.fromLong(((this.f11246f ^ this.f11247g) ^ this.f11248h) ^ this.f11249i);
        }

        @Override // p149l.AbstractC17506i8
        /* JADX INFO: renamed from: n */
        public void mo16345n(ByteBuffer byteBuffer) {
            this.f11250j += 8;
            m16356q(byteBuffer.getLong());
        }

        @Override // p149l.AbstractC17506i8
        /* JADX INFO: renamed from: o */
        public void mo16346o(ByteBuffer byteBuffer) {
            this.f11250j += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f11251k ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m16356q(long j) {
            this.f11249i ^= j;
            m16357r(this.f11244d);
            this.f11246f = j ^ this.f11246f;
        }

        /* JADX INFO: renamed from: r */
        public final void m16357r(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f11246f;
                long j2 = this.f11247g;
                this.f11246f = j + j2;
                this.f11248h += this.f11249i;
                this.f11247g = Long.rotateLeft(j2, 13);
                long jRotateLeft = Long.rotateLeft(this.f11249i, 16);
                long j3 = this.f11247g;
                long j4 = this.f11246f;
                this.f11247g = j3 ^ j4;
                this.f11249i = jRotateLeft ^ this.f11248h;
                long jRotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f11248h;
                long j6 = this.f11247g;
                this.f11248h = j5 + j6;
                this.f11246f = jRotateLeft2 + this.f11249i;
                this.f11247g = Long.rotateLeft(j6, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f11249i, 21);
                long j7 = this.f11247g;
                long j8 = this.f11248h;
                this.f11247g = j7 ^ j8;
                this.f11249i = jRotateLeft3 ^ this.f11246f;
                this.f11248h = Long.rotateLeft(j8, 32);
            }
        }
    }

    public SipHashFunction(int i, int i2, long j, long j2) {
        sf80.m183884f(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        sf80.m183884f(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f11240c = i;
        this.f11241d = i2;
        this.f11242k0 = j;
        this.f11243k1 = j2;
    }

    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f11240c == sipHashFunction.f11240c && this.f11241d == sipHashFunction.f11241d && this.f11242k0 == sipHashFunction.f11242k0 && this.f11243k1 == sipHashFunction.f11243k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f11240c) ^ this.f11241d)) ^ this.f11242k0) ^ this.f11243k1);
    }

    @Override // p149l.cwk
    public kwk newHasher() {
        return new C3001a(this.f11240c, this.f11241d, this.f11242k0, this.f11243k1);
    }

    public String toString() {
        int i = this.f11240c;
        int i2 = this.f11241d;
        long j = this.f11242k0;
        long j2 = this.f11243k1;
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
