package com.google.common.primitives;

import java.io.Serializable;
import java.math.BigInteger;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    private final long value;
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);

    private UnsignedLong(long j) {
        this.value = j;
    }

    public static UnsignedLong fromLongBits(long j) {
        return new UnsignedLong(j);
    }

    public static UnsignedLong valueOf(BigInteger bigInteger) {
        sf80.m183894p(bigInteger);
        sf80.m183889k(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    public BigInteger bigIntegerValue() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.value & UNSIGNED_MASK);
        return this.value < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedLong unsignedLong) {
        sf80.m183894p(unsignedLong);
        return UnsignedLongs.m16495a(this.value, unsignedLong.value);
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        return fromLongBits(UnsignedLongs.m16496b(this.value, ((UnsignedLong) sf80.m183894p(unsignedLong)).value));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j = this.value;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.value == ((UnsignedLong) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j = this.value;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0f;
    }

    public int hashCode() {
        return Longs.m16474e(this.value);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public UnsignedLong minus(UnsignedLong unsignedLong) {
        return fromLongBits(this.value - ((UnsignedLong) sf80.m183894p(unsignedLong)).value);
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
        return fromLongBits(UnsignedLongs.m16499e(this.value, ((UnsignedLong) sf80.m183894p(unsignedLong)).value));
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
        return fromLongBits(this.value + ((UnsignedLong) sf80.m183894p(unsignedLong)).value);
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
        return fromLongBits(this.value * ((UnsignedLong) sf80.m183894p(unsignedLong)).value);
    }

    public String toString() {
        return UnsignedLongs.m16500f(this.value);
    }

    public String toString(int i) {
        return UnsignedLongs.m16501g(this.value, i);
    }

    public static UnsignedLong valueOf(long j) {
        sf80.m183886h(j >= 0, "value (%s) is outside the range for an unsigned long value", j);
        return fromLongBits(j);
    }

    public static UnsignedLong valueOf(String str) {
        return valueOf(str, 10);
    }

    public static UnsignedLong valueOf(String str, int i) {
        return fromLongBits(UnsignedLongs.m16498d(str, i));
    }
}
