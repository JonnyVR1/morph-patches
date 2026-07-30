package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p149l.AbstractC17506i8;
import p149l.AbstractC18156l7;
import p149l.cwk;
import p149l.jpj0;
import p149l.kwk;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
final class Murmur3_128HashFunction extends AbstractC18156l7 implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final cwk MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final cwk GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.f11225a);

    /* JADX INFO: renamed from: com.google.common.hash.Murmur3_128HashFunction$a */
    public static final class C2999a extends AbstractC17506i8 {

        /* JADX INFO: renamed from: d */
        public long f11230d;

        /* JADX INFO: renamed from: e */
        public long f11231e;

        /* JADX INFO: renamed from: f */
        public int f11232f;

        public C2999a(int i) {
            super(16);
            long j = i;
            this.f11230d = j;
            this.f11231e = j;
            this.f11232f = 0;
        }

        /* JADX INFO: renamed from: r */
        public static long m16341r(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        /* JADX INFO: renamed from: s */
        public static long m16342s(long j) {
            return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        /* JADX INFO: renamed from: t */
        public static long m16343t(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // p149l.AbstractC17506i8
        /* JADX INFO: renamed from: k */
        public HashCode mo16344k() {
            long j = this.f11230d;
            int i = this.f11232f;
            long j2 = j ^ ((long) i);
            long j3 = this.f11231e ^ ((long) i);
            long j4 = j2 + j3;
            this.f11230d = j4;
            this.f11231e = j3 + j4;
            this.f11230d = m16341r(j4);
            long jM16341r = m16341r(this.f11231e);
            long j5 = this.f11230d + jM16341r;
            this.f11230d = j5;
            this.f11231e = jM16341r + j5;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f11230d).putLong(this.f11231e).array());
        }

        @Override // p149l.AbstractC17506i8
        /* JADX INFO: renamed from: n */
        public void mo16345n(ByteBuffer byteBuffer) {
            m16347q(byteBuffer.getLong(), byteBuffer.getLong());
            this.f11232f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p149l.AbstractC17506i8
        /* JADX INFO: renamed from: o */
        public void mo16346o(ByteBuffer byteBuffer) {
            long jM142746c;
            long jM142746c2;
            long jM142746c3;
            long jM142746c4;
            long jM142746c5;
            long jM142746c6;
            long jM142746c7;
            this.f11232f += byteBuffer.remaining();
            long jM142746c8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jM142746c = 0;
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 2:
                    jM142746c2 = 0;
                    jM142746c = jM142746c2 ^ (((long) jpj0.m142746c(byteBuffer.get(1))) << 8);
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 3:
                    jM142746c3 = 0;
                    jM142746c2 = (((long) jpj0.m142746c(byteBuffer.get(2))) << 16) ^ jM142746c3;
                    jM142746c = jM142746c2 ^ (((long) jpj0.m142746c(byteBuffer.get(1))) << 8);
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 4:
                    jM142746c4 = 0;
                    jM142746c3 = jM142746c4 ^ (((long) jpj0.m142746c(byteBuffer.get(3))) << 24);
                    jM142746c2 = (((long) jpj0.m142746c(byteBuffer.get(2))) << 16) ^ jM142746c3;
                    jM142746c = jM142746c2 ^ (((long) jpj0.m142746c(byteBuffer.get(1))) << 8);
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 5:
                    jM142746c5 = 0;
                    jM142746c4 = jM142746c5 ^ (((long) jpj0.m142746c(byteBuffer.get(4))) << 32);
                    jM142746c3 = jM142746c4 ^ (((long) jpj0.m142746c(byteBuffer.get(3))) << 24);
                    jM142746c2 = (((long) jpj0.m142746c(byteBuffer.get(2))) << 16) ^ jM142746c3;
                    jM142746c = jM142746c2 ^ (((long) jpj0.m142746c(byteBuffer.get(1))) << 8);
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 6:
                    jM142746c6 = 0;
                    jM142746c5 = (((long) jpj0.m142746c(byteBuffer.get(5))) << 40) ^ jM142746c6;
                    jM142746c4 = jM142746c5 ^ (((long) jpj0.m142746c(byteBuffer.get(4))) << 32);
                    jM142746c3 = jM142746c4 ^ (((long) jpj0.m142746c(byteBuffer.get(3))) << 24);
                    jM142746c2 = (((long) jpj0.m142746c(byteBuffer.get(2))) << 16) ^ jM142746c3;
                    jM142746c = jM142746c2 ^ (((long) jpj0.m142746c(byteBuffer.get(1))) << 8);
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 7:
                    jM142746c6 = ((long) jpj0.m142746c(byteBuffer.get(6))) << 48;
                    jM142746c5 = (((long) jpj0.m142746c(byteBuffer.get(5))) << 40) ^ jM142746c6;
                    jM142746c4 = jM142746c5 ^ (((long) jpj0.m142746c(byteBuffer.get(4))) << 32);
                    jM142746c3 = jM142746c4 ^ (((long) jpj0.m142746c(byteBuffer.get(3))) << 24);
                    jM142746c2 = (((long) jpj0.m142746c(byteBuffer.get(2))) << 16) ^ jM142746c3;
                    jM142746c = jM142746c2 ^ (((long) jpj0.m142746c(byteBuffer.get(1))) << 8);
                    jM142746c7 = jM142746c ^ ((long) jpj0.m142746c(byteBuffer.get(0)));
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 8:
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 9:
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 10:
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(9))) << 8;
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 11:
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(10))) << 16;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(9))) << 8;
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 12:
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(11))) << 24;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(10))) << 16;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(9))) << 8;
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 13:
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(12))) << 32;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(11))) << 24;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(10))) << 16;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(9))) << 8;
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 14:
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(13))) << 40;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(12))) << 32;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(11))) << 24;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(10))) << 16;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(9))) << 8;
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                case 15:
                    jM142746c8 = ((long) jpj0.m142746c(byteBuffer.get(14))) << 48;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(13))) << 40;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(12))) << 32;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(11))) << 24;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(10))) << 16;
                    jM142746c8 ^= ((long) jpj0.m142746c(byteBuffer.get(9))) << 8;
                    jM142746c8 ^= (long) jpj0.m142746c(byteBuffer.get(8));
                    jM142746c7 = byteBuffer.getLong();
                    this.f11230d = m16342s(jM142746c7) ^ this.f11230d;
                    this.f11231e ^= m16343t(jM142746c8);
                    break;
                default:
                    y9g0.m213537a("Should never get here.");
                    break;
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m16347q(long j, long j2) {
            long jM16342s = m16342s(j) ^ this.f11230d;
            this.f11230d = jM16342s;
            long jRotateLeft = Long.rotateLeft(jM16342s, 27);
            long j3 = this.f11231e;
            this.f11230d = ((jRotateLeft + j3) * 5) + 1390208809;
            long jM16343t = m16343t(j2) ^ j3;
            this.f11231e = jM16343t;
            this.f11231e = ((Long.rotateLeft(jM16343t, 31) + this.f11230d) * 5) + 944331445;
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

    @Override // p149l.cwk
    public kwk newHasher() {
        return new C2999a(this.seed);
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
