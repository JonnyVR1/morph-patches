package com.google.common.hash;

import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import p153l.f1w;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C3008a c3008a) {
            long jM16378b = c3008a.m16378b();
            long jAsLong = Hashing.m16388a().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!c3008a.m16380d(((long) i5) % jM16378b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C3008a c3008a) {
            long jM16378b = c3008a.m16378b();
            long jAsLong = Hashing.m16388a().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            boolean zM16383g = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                zM16383g |= c3008a.m16383g(((long) i5) % jM16378b);
            }
            return zM16383g;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.m16528d(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.m16528d(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C3008a c3008a) {
            long jM16378b = c3008a.m16378b();
            byte[] bytesInternal = Hashing.m16388a().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i2 = 0; i2 < i; i2++) {
                if (!c3008a.m16380d((Long.MAX_VALUE & jLowerEight) % jM16378b)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C3008a c3008a) {
            long jM16378b = c3008a.m16378b();
            byte[] bytesInternal = Hashing.m16388a().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            long j = jLowerEight;
            boolean zM16383g = false;
            for (int i2 = 0; i2 < i; i2++) {
                zM16383g |= c3008a.m16383g((Long.MAX_VALUE & j) % jM16378b);
                j += jUpperEight;
            }
            return zM16383g;
        }
    };

    /* JADX INFO: renamed from: com.google.common.hash.BloomFilterStrategies$a */
    public static final class C3008a {

        /* JADX INFO: renamed from: a */
        public final AtomicLongArray f11258a;

        /* JADX INFO: renamed from: b */
        public final f1w f11259b;

        public C3008a(long[] jArr) {
            xn80.m212100e(jArr.length > 0, "data length is zero!");
            this.f11258a = new AtomicLongArray(jArr);
            this.f11259b = LongAddables.m16390a();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.f11259b.add(jBitCount);
        }

        /* JADX INFO: renamed from: h */
        public static long[] m16376h(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* JADX INFO: renamed from: a */
        public long m16377a() {
            return this.f11259b.sum();
        }

        /* JADX INFO: renamed from: b */
        public long m16378b() {
            return ((long) this.f11258a.length()) * 64;
        }

        /* JADX INFO: renamed from: c */
        public C3008a m16379c() {
            return new C3008a(m16376h(this.f11258a));
        }

        /* JADX INFO: renamed from: d */
        public boolean m16380d(long j) {
            return ((1 << ((int) j)) & this.f11258a.get((int) (j >>> 6))) != 0;
        }

        /* JADX INFO: renamed from: e */
        public void m16381e(C3008a c3008a) {
            xn80.m212102g(this.f11258a.length() == c3008a.f11258a.length(), "BitArrays must be of equal length (%s != %s)", this.f11258a.length(), c3008a.f11258a.length());
            for (int i = 0; i < this.f11258a.length(); i++) {
                m16382f(i, c3008a.f11258a.get(i));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3008a) {
                return Arrays.equals(m16376h(this.f11258a), m16376h(((C3008a) obj).f11258a));
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m16382f(int i, long j) {
            while (true) {
                long j2 = this.f11258a.get(i);
                long j3 = j2 | j;
                if (j2 == j3) {
                    return;
                }
                int i2 = i;
                if (this.f11258a.compareAndSet(i2, j2, j3)) {
                    this.f11259b.add(Long.bitCount(j3) - Long.bitCount(j2));
                    return;
                }
                i = i2;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m16383g(long j) {
            long j2;
            long j3;
            if (m16380d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f11258a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f11258a.compareAndSet(i, j2, j3));
            this.f11259b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(m16376h(this.f11258a));
        }

        public C3008a(long j) {
            xn80.m212100e(j > 0, "data length is zero!");
            this.f11258a = new AtomicLongArray(Ints.m16514d(LongMath.m16423b(j, 64L, RoundingMode.CEILING)));
            this.f11259b = LongAddables.m16390a();
        }
    }
}
