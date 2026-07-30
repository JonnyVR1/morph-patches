package com.google.common.primitives;

import java.math.BigInteger;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    private final int value;
    public static final UnsignedInteger ZERO = fromIntBits(0);
    public static final UnsignedInteger ONE = fromIntBits(1);
    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);

    private UnsignedInteger(int i) {
        this.value = i;
    }

    public static UnsignedInteger fromIntBits(int i) {
        return new UnsignedInteger(i);
    }

    public static UnsignedInteger valueOf(BigInteger bigInteger) {
        sf80.m183894p(bigInteger);
        sf80.m183889k(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return fromIntBits(bigInteger.intValue());
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedInteger unsignedInteger) {
        sf80.m183894p(unsignedInteger);
        return UnsignedInts.m16488a(this.value, unsignedInteger.value);
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
        return fromIntBits(UnsignedInts.m16489b(this.value, ((UnsignedInteger) sf80.m183894p(unsignedInteger)).value));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.value == ((UnsignedInteger) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.value;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return UnsignedInts.m16493f(this.value);
    }

    public UnsignedInteger minus(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value - ((UnsignedInteger) sf80.m183894p(unsignedInteger)).value);
    }

    public UnsignedInteger mod(UnsignedInteger unsignedInteger) {
        return fromIntBits(UnsignedInts.m16492e(this.value, ((UnsignedInteger) sf80.m183894p(unsignedInteger)).value));
    }

    public UnsignedInteger plus(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value + ((UnsignedInteger) sf80.m183894p(unsignedInteger)).value);
    }

    public UnsignedInteger times(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value * ((UnsignedInteger) sf80.m183894p(unsignedInteger)).value);
    }

    public String toString() {
        return toString(10);
    }

    public String toString(int i) {
        return UnsignedInts.m16494g(this.value, i);
    }

    public static UnsignedInteger valueOf(long j) {
        sf80.m183886h((4294967295L & j) == j, "value (%s) is outside the range for an unsigned integer value", j);
        return fromIntBits((int) j);
    }

    public static UnsignedInteger valueOf(String str) {
        return valueOf(str, 10);
    }

    public static UnsignedInteger valueOf(String str, int i) {
        return fromIntBits(UnsignedInts.m16491d(str, i));
    }
}
