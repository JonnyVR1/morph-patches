package com.google.common.math;

import com.clevertap.android.sdk.Constants;
import com.google.common.base.C2654a;
import com.google.common.primitives.Doubles;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p149l.fwf0;
import p149l.sf80;
import p149l.t5e;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class Stats implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }

    public static Stats fromByteArray(byte[] bArr) {
        sf80.m183894p(bArr);
        sf80.m183885g(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterator<? extends Number> it) {
        sf80.m183882d(it.hasNext());
        double dDoubleValue = it.next().doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            j++;
            dDoubleValue = (Doubles.m16406f(dDoubleValue2) && Doubles.m16406f(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j) : fwf0.m123518g(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16369of(Iterable<? extends Number> iterable) {
        fwf0 fwf0Var = new fwf0();
        fwf0Var.m123520b(iterable);
        return fwf0Var.m123525h();
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
        sf80.m183894p(byteBuffer);
        sf80.m183885g(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long count() {
        return this.count;
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
    }

    public int hashCode() {
        return v050.m196471b(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public double max() {
        sf80.m183900v(this.count != 0);
        return this.max;
    }

    public double mean() {
        sf80.m183900v(this.count != 0);
        return this.mean;
    }

    public double min() {
        sf80.m183900v(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        sf80.m183900v(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return this.count == 1 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : t5e.m187293a(this.sumOfSquaresOfDeltas) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        sf80.m183900v(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return t5e.m187293a(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? C2654a.m15427b(this).m15431c("count", this.count).m15429a("mean", this.mean).m15429a("populationStandardDeviation", populationStandardDeviation()).m15429a("min", this.min).m15429a(Constants.PRIORITY_MAX, this.max).toString() : C2654a.m15427b(this).m15431c("count", this.count).toString();
    }

    public void writeTo(ByteBuffer byteBuffer) {
        sf80.m183894p(byteBuffer);
        sf80.m183885g(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16370of(Iterator<? extends Number> it) {
        fwf0 fwf0Var = new fwf0();
        fwf0Var.m123521c(it);
        return fwf0Var.m123525h();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16371of(double... dArr) {
        fwf0 fwf0Var = new fwf0();
        fwf0Var.m123522d(dArr);
        return fwf0Var.m123525h();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16372of(int... iArr) {
        fwf0 fwf0Var = new fwf0();
        fwf0Var.m123523e(iArr);
        return fwf0Var.m123525h();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16373of(long... jArr) {
        fwf0 fwf0Var = new fwf0();
        fwf0Var.m123524f(jArr);
        return fwf0Var.m123525h();
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static double meanOf(double... dArr) {
        sf80.m183882d(dArr.length > 0);
        double dM123518g = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d = dArr[i];
            dM123518g = (Doubles.m16406f(d) && Doubles.m16406f(dM123518g)) ? dM123518g + ((d - dM123518g) / ((double) (i + 1))) : fwf0.m123518g(dM123518g, d);
        }
        return dM123518g;
    }

    public static double meanOf(int... iArr) {
        sf80.m183882d(iArr.length > 0);
        double dM123518g = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d = iArr[i];
            dM123518g = (Doubles.m16406f(d) && Doubles.m16406f(dM123518g)) ? dM123518g + ((d - dM123518g) / ((double) (i + 1))) : fwf0.m123518g(dM123518g, d);
        }
        return dM123518g;
    }

    public static double meanOf(long... jArr) {
        sf80.m183882d(jArr.length > 0);
        double dM123518g = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d = jArr[i];
            dM123518g = (Doubles.m16406f(d) && Doubles.m16406f(dM123518g)) ? dM123518g + ((d - dM123518g) / ((double) (i + 1))) : fwf0.m123518g(dM123518g, d);
        }
        return dM123518g;
    }
}
