package com.google.common.primitives;

import java.math.BigInteger;
import p153l.xn80;

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
        xn80.m212111p(bigInteger);
        xn80.m212106k(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return fromIntBits(bigInteger.intValue());
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedInteger unsignedInteger) {
        xn80.m212111p(unsignedInteger);
        return UnsignedInts.m16543a(this.value, unsignedInteger.value);
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
        return fromIntBits(UnsignedInts.m16544b(this.value, ((UnsignedInteger) xn80.m212111p(unsignedInteger)).value));
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
        return UnsignedInts.m16548f(this.value);
    }

    public UnsignedInteger minus(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value - ((UnsignedInteger) xn80.m212111p(unsignedInteger)).value);
    }

    public UnsignedInteger mod(UnsignedInteger unsignedInteger) {
        return fromIntBits(UnsignedInts.m16547e(this.value, ((UnsignedInteger) xn80.m212111p(unsignedInteger)).value));
    }

    public UnsignedInteger plus(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value + ((UnsignedInteger) xn80.m212111p(unsignedInteger)).value);
    }

    public UnsignedInteger times(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value * ((UnsignedInteger) xn80.m212111p(unsignedInteger)).value);
    }

    public String toString() {
        return toString(10);
    }

    public String toString(int i) {
        return UnsignedInts.m16549g(this.value, i);
    }

    public static UnsignedInteger valueOf(long j) {
        xn80.m212103h((4294967295L & j) == j, "value (%s) is outside the range for an unsigned integer value", j);
        return fromIntBits((int) j);
    }

    public static UnsignedInteger valueOf(String str) {
        return valueOf(str, 10);
    }

    public static UnsignedInteger valueOf(String str, int i) {
        return fromIntBits(UnsignedInts.m16546d(str, i));
    }
}
