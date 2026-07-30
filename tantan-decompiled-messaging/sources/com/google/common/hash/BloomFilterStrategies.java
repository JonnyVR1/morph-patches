package com.google.common.hash;

import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import p149l.hzv;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C2985a c2985a) {
            long jM16324b = c2985a.m16324b();
            long jAsLong = Hashing.m16333a().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!c2985a.m16326d(((long) i5) % jM16324b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C2985a c2985a) {
            long jM16324b = c2985a.m16324b();
            long jAsLong = Hashing.m16333a().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            boolean zM16329g = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                zM16329g |= c2985a.m16329g(((long) i5) % jM16324b);
            }
            return zM16329g;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.m16473d(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.m16473d(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C2985a c2985a) {
            long jM16324b = c2985a.m16324b();
            byte[] bytesInternal = Hashing.m16333a().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i2 = 0; i2 < i; i2++) {
                if (!c2985a.m16326d((Long.MAX_VALUE & jLowerEight) % jM16324b)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C2985a c2985a) {
            long jM16324b = c2985a.m16324b();
            byte[] bytesInternal = Hashing.m16333a().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            long j = jLowerEight;
            boolean zM16329g = false;
            for (int i2 = 0; i2 < i; i2++) {
                zM16329g |= c2985a.m16329g((Long.MAX_VALUE & j) % jM16324b);
                j += jUpperEight;
            }
            return zM16329g;
        }
    };

    /* JADX INFO: renamed from: com.google.common.hash.BloomFilterStrategies$a */
    public static final class C2985a {

        /* JADX INFO: renamed from: a */
        public final AtomicLongArray f11221a;

        /* JADX INFO: renamed from: b */
        public final hzv f11222b;

        public C2985a(long[] jArr) {
            sf80.m183883e(jArr.length > 0, "data length is zero!");
            this.f11221a = new AtomicLongArray(jArr);
            this.f11222b = LongAddables.m16335a();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.f11222b.add(jBitCount);
        }

        /* JADX INFO: renamed from: h */
        public static long[] m16322h(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* JADX INFO: renamed from: a */
        public long m16323a() {
            return this.f11222b.sum();
        }

        /* JADX INFO: renamed from: b */
        public long m16324b() {
            return ((long) this.f11221a.length()) * 64;
        }

        /* JADX INFO: renamed from: c */
        public C2985a m16325c() {
            return new C2985a(m16322h(this.f11221a));
        }

        /* JADX INFO: renamed from: d */
        public boolean m16326d(long j) {
            return ((1 << ((int) j)) & this.f11221a.get((int) (j >>> 6))) != 0;
        }

        /* JADX INFO: renamed from: e */
        public void m16327e(C2985a c2985a) {
            sf80.m183885g(this.f11221a.length() == c2985a.f11221a.length(), "BitArrays must be of equal length (%s != %s)", this.f11221a.length(), c2985a.f11221a.length());
            for (int i = 0; i < this.f11221a.length(); i++) {
                m16328f(i, c2985a.f11221a.get(i));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2985a) {
                return Arrays.equals(m16322h(this.f11221a), m16322h(((C2985a) obj).f11221a));
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m16328f(int i, long j) {
            while (true) {
                long j2 = this.f11221a.get(i);
                long j3 = j2 | j;
                if (j2 == j3) {
                    return;
                }
                int i2 = i;
                if (this.f11221a.compareAndSet(i2, j2, j3)) {
                    this.f11222b.add(Long.bitCount(j3) - Long.bitCount(j2));
                    return;
                }
                i = i2;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m16329g(long j) {
            long j2;
            long j3;
            if (m16326d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f11221a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f11221a.compareAndSet(i, j2, j3));
            this.f11222b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(m16322h(this.f11221a));
        }

        public C2985a(long j) {
            sf80.m183883e(j > 0, "data length is zero!");
            this.f11221a = new AtomicLongArray(Ints.m16459d(LongMath.m16368b(j, 64L, RoundingMode.CEILING)));
            this.f11222b = LongAddables.m16335a();
        }
    }
}
