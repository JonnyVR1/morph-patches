package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p153l.AbstractC16478d8;
import p153l.AbstractC17172g7;
import p153l.azk;
import p153l.gig0;
import p153l.myj0;
import p153l.syk;

/* JADX INFO: loaded from: classes7.dex */
final class Murmur3_128HashFunction extends AbstractC17172g7 implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final syk MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final syk GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.f11262a);

    /* JADX INFO: renamed from: com.google.common.hash.Murmur3_128HashFunction$a */
    public static final class C3022a extends AbstractC16478d8 {

        /* JADX INFO: renamed from: d */
        public long f11267d;

        /* JADX INFO: renamed from: e */
        public long f11268e;

        /* JADX INFO: renamed from: f */
        public int f11269f;

        public C3022a(int i) {
            super(16);
            long j = i;
            this.f11267d = j;
            this.f11268e = j;
            this.f11269f = 0;
        }

        /* JADX INFO: renamed from: s */
        public static long m16396s(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        /* JADX INFO: renamed from: t */
        public static long m16397t(long j) {
            return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        /* JADX INFO: renamed from: u */
        public static long m16398u(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // p153l.AbstractC16478d8
        /* JADX INFO: renamed from: l */
        public HashCode mo16399l() {
            long j = this.f11267d;
            int i = this.f11269f;
            long j2 = j ^ ((long) i);
            long j3 = this.f11268e ^ ((long) i);
            long j4 = j2 + j3;
            this.f11267d = j4;
            this.f11268e = j3 + j4;
            this.f11267d = m16396s(j4);
            long jM16396s = m16396s(this.f11268e);
            long j5 = this.f11267d + jM16396s;
            this.f11267d = j5;
            this.f11268e = jM16396s + j5;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f11267d).putLong(this.f11268e).array());
        }

        @Override // p153l.AbstractC16478d8
        /* JADX INFO: renamed from: o */
        public void mo16400o(ByteBuffer byteBuffer) {
            m16402r(byteBuffer.getLong(), byteBuffer.getLong());
            this.f11269f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p153l.AbstractC16478d8
        /* JADX INFO: renamed from: p */
        public void mo16401p(ByteBuffer byteBuffer) {
            long jM160799c;
            long jM160799c2;
            long jM160799c3;
            long jM160799c4;
            long jM160799c5;
            long jM160799c6;
            long jM160799c7;
            this.f11269f += byteBuffer.remaining();
            long jM160799c8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jM160799c = 0;
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 2:
                    jM160799c2 = 0;
                    jM160799c = jM160799c2 ^ (((long) myj0.m160799c(byteBuffer.get(1))) << 8);
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 3:
                    jM160799c3 = 0;
                    jM160799c2 = (((long) myj0.m160799c(byteBuffer.get(2))) << 16) ^ jM160799c3;
                    jM160799c = jM160799c2 ^ (((long) myj0.m160799c(byteBuffer.get(1))) << 8);
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 4:
                    jM160799c4 = 0;
                    jM160799c3 = jM160799c4 ^ (((long) myj0.m160799c(byteBuffer.get(3))) << 24);
                    jM160799c2 = (((long) myj0.m160799c(byteBuffer.get(2))) << 16) ^ jM160799c3;
                    jM160799c = jM160799c2 ^ (((long) myj0.m160799c(byteBuffer.get(1))) << 8);
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 5:
                    jM160799c5 = 0;
                    jM160799c4 = jM160799c5 ^ (((long) myj0.m160799c(byteBuffer.get(4))) << 32);
                    jM160799c3 = jM160799c4 ^ (((long) myj0.m160799c(byteBuffer.get(3))) << 24);
                    jM160799c2 = (((long) myj0.m160799c(byteBuffer.get(2))) << 16) ^ jM160799c3;
                    jM160799c = jM160799c2 ^ (((long) myj0.m160799c(byteBuffer.get(1))) << 8);
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 6:
                    jM160799c6 = 0;
                    jM160799c5 = (((long) myj0.m160799c(byteBuffer.get(5))) << 40) ^ jM160799c6;
                    jM160799c4 = jM160799c5 ^ (((long) myj0.m160799c(byteBuffer.get(4))) << 32);
                    jM160799c3 = jM160799c4 ^ (((long) myj0.m160799c(byteBuffer.get(3))) << 24);
                    jM160799c2 = (((long) myj0.m160799c(byteBuffer.get(2))) << 16) ^ jM160799c3;
                    jM160799c = jM160799c2 ^ (((long) myj0.m160799c(byteBuffer.get(1))) << 8);
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 7:
                    jM160799c6 = ((long) myj0.m160799c(byteBuffer.get(6))) << 48;
                    jM160799c5 = (((long) myj0.m160799c(byteBuffer.get(5))) << 40) ^ jM160799c6;
                    jM160799c4 = jM160799c5 ^ (((long) myj0.m160799c(byteBuffer.get(4))) << 32);
                    jM160799c3 = jM160799c4 ^ (((long) myj0.m160799c(byteBuffer.get(3))) << 24);
                    jM160799c2 = (((long) myj0.m160799c(byteBuffer.get(2))) << 16) ^ jM160799c3;
                    jM160799c = jM160799c2 ^ (((long) myj0.m160799c(byteBuffer.get(1))) << 8);
                    jM160799c7 = jM160799c ^ ((long) myj0.m160799c(byteBuffer.get(0)));
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 8:
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 9:
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 10:
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(9))) << 8;
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 11:
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(10))) << 16;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(9))) << 8;
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 12:
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(11))) << 24;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(10))) << 16;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(9))) << 8;
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 13:
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(12))) << 32;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(11))) << 24;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(10))) << 16;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(9))) << 8;
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 14:
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(13))) << 40;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(12))) << 32;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(11))) << 24;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(10))) << 16;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(9))) << 8;
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                case 15:
                    jM160799c8 = ((long) myj0.m160799c(byteBuffer.get(14))) << 48;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(13))) << 40;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(12))) << 32;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(11))) << 24;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(10))) << 16;
                    jM160799c8 ^= ((long) myj0.m160799c(byteBuffer.get(9))) << 8;
                    jM160799c8 ^= (long) myj0.m160799c(byteBuffer.get(8));
                    jM160799c7 = byteBuffer.getLong();
                    this.f11267d = m16397t(jM160799c7) ^ this.f11267d;
                    this.f11268e ^= m16398u(jM160799c8);
                    break;
                default:
                    gig0.m130323a("Should never get here.");
                    break;
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m16402r(long j, long j2) {
            long jM16397t = m16397t(j) ^ this.f11267d;
            this.f11267d = jM16397t;
            long jRotateLeft = Long.rotateLeft(jM16397t, 27);
            long j3 = this.f11268e;
            this.f11267d = ((jRotateLeft + j3) * 5) + 1390208809;
            long jM16398u = m16398u(j2) ^ j3;
            this.f11268e = jM16398u;
            this.f11268e = ((Long.rotateLeft(jM16398u, 31) + this.f11267d) * 5) + 944331445;
        }
    }

    public Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    public int bits() {
        return 128;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return this.seed ^ Murmur3_128HashFunction.class.hashCode();
    }

    @Override // p153l.syk
    public azk newHasher() {
        return new C3022a(this.seed);
    }

    public String toString() {
        int i = this.seed;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
