package com.google.common.hash;

import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import p149l.jpj0;
import p149l.oh80;
import p149l.s5e;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class BloomFilter<T> implements oh80<T>, Serializable {
    private final BloomFilterStrategies.C2985a bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final Funnel<? super T> funnel;
        final int numHashFunctions;
        final Strategy strategy;

        public SerialForm(BloomFilter<T> bloomFilter) {
            this.data = BloomFilterStrategies.C2985a.m16322h(((BloomFilter) bloomFilter).bits.f11221a);
            this.numHashFunctions = ((BloomFilter) bloomFilter).numHashFunctions;
            this.funnel = ((BloomFilter) bloomFilter).funnel;
            this.strategy = ((BloomFilter) bloomFilter).strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.C2985a(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    public interface Strategy extends Serializable {
        <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.C2985a c2985a);

        int ordinal();

        <T> boolean put(T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.C2985a c2985a);
    }

    private BloomFilter(BloomFilterStrategies.C2985a c2985a, int i, Funnel<? super T> funnel, Strategy strategy) {
        sf80.m183884f(i > 0, "numHashFunctions (%s) must be > 0", i);
        sf80.m183884f(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.bits = (BloomFilterStrategies.C2985a) sf80.m183894p(c2985a);
        this.numHashFunctions = i;
        this.funnel = (Funnel) sf80.m183894p(funnel);
        this.strategy = (Strategy) sf80.m183894p(strategy);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d, Strategy strategy) {
        sf80.m183894p(funnel);
        sf80.m183886h(j >= 0, "Expected insertions (%s) must be >= 0", j);
        sf80.m183889k(d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        sf80.m183889k(d < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        sf80.m183894p(strategy);
        if (j == 0) {
            j = 1;
        }
        long jOptimalNumOfBits = optimalNumOfBits(j, d);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.C2985a(jOptimalNumOfBits), optimalNumOfHashFunctions(j, jOptimalNumOfBits), funnel, strategy);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Could not create BloomFilter of ");
            sb.append(jOptimalNumOfBits);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public static long optimalNumOfBits(long j, double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = Double.MIN_VALUE;
        }
        return (long) (((-j) * Math.log(d)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    public static int optimalNumOfHashFunctions(long j, long j2) {
        return Math.max(1, (int) Math.round((j2 / j) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i;
        int iM142746c;
        sf80.m183895q(inputStream, "InputStream");
        sf80.m183895q(funnel, "Funnel");
        int i2 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte b = dataInputStream.readByte();
            try {
                iM142746c = jpj0.m142746c(dataInputStream.readByte());
                try {
                    i2 = dataInputStream.readInt();
                    BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[b];
                    BloomFilterStrategies.C2985a c2985a = new BloomFilterStrategies.C2985a(LongMath.m16367a(i2, 64L));
                    for (int i3 = 0; i3 < i2; i3++) {
                        c2985a.m16328f(i3, dataInputStream.readLong());
                    }
                    return new BloomFilter<>(c2985a, iM142746c, funnel, bloomFilterStrategies);
                } catch (RuntimeException e) {
                    e = e;
                    int i4 = i2;
                    i2 = b;
                    i = i4;
                    StringBuilder sb = new StringBuilder(134);
                    sb.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                    sb.append(i2);
                    sb.append(" numHashFunctions: ");
                    sb.append(iM142746c);
                    sb.append(" dataLength: ");
                    sb.append(i);
                    throw new IOException(sb.toString(), e);
                }
            } catch (RuntimeException e2) {
                e = e2;
                iM142746c = -1;
                i2 = b;
                i = -1;
            }
        } catch (RuntimeException e3) {
            e = e3;
            i = -1;
            iM142746c = -1;
        }
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // p149l.oh80
    @Deprecated
    public boolean apply(T t) {
        return mightContain(t);
    }

    public long approximateElementCount() {
        double dM16324b = this.bits.m16324b();
        return s5e.m182342c(((-Math.log1p(-(this.bits.m16323a() / dM16324b))) * dM16324b) / ((double) this.numHashFunctions), RoundingMode.HALF_UP);
    }

    public long bitSize() {
        return this.bits.m16324b();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.m16325c(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // p149l.oh80
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) obj;
            if (this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy)) {
                return true;
            }
        }
        return false;
    }

    public double expectedFpp() {
        return Math.pow(this.bits.m16323a() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return v050.m196471b(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        sf80.m183894p(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(T t) {
        return this.strategy.mightContain(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public boolean put(T t) {
        return this.strategy.put(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        sf80.m183894p(bloomFilter);
        sf80.m183883e(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i = this.numHashFunctions;
        int i2 = bloomFilter.numHashFunctions;
        sf80.m183885g(i == i2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        sf80.m183887i(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        sf80.m183890l(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        sf80.m183890l(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.m16327e(bloomFilter.bits);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.m16485a(this.strategy.ordinal()));
        dataOutputStream.writeByte(jpj0.m142744a(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.f11221a.length());
        for (int i = 0; i < this.bits.f11221a.length(); i++) {
            dataOutputStream.writeLong(this.bits.f11221a.get(i));
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d) {
        return create(funnel, j, d, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i, double d) {
        return create(funnel, i, d);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i) {
        return create(funnel, i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j) {
        return create(funnel, j, 0.03d);
    }
}
