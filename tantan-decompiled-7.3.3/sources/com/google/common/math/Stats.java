package com.google.common.math;

import com.clevertap.android.sdk.Constants;
import com.google.common.base.C2677a;
import com.google.common.primitives.Doubles;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p153l.i7e;
import p153l.k950;
import p153l.o4g0;
import p153l.xn80;

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
        xn80.m212111p(bArr);
        xn80.m212102g(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterator<? extends Number> it) {
        xn80.m212099d(it.hasNext());
        double dDoubleValue = it.next().doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            j++;
            dDoubleValue = (Doubles.m16461f(dDoubleValue2) && Doubles.m16461f(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j) : o4g0.m166002g(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16424of(Iterable<? extends Number> iterable) {
        o4g0 o4g0Var = new o4g0();
        o4g0Var.m166004b(iterable);
        return o4g0Var.m166009h();
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
        xn80.m212111p(byteBuffer);
        xn80.m212102g(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
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
        return k950.m148864b(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public double max() {
        xn80.m212117v(this.count != 0);
        return this.max;
    }

    public double mean() {
        xn80.m212117v(this.count != 0);
        return this.mean;
    }

    public double min() {
        xn80.m212117v(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        xn80.m212117v(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return this.count == 1 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : i7e.m138929a(this.sumOfSquaresOfDeltas) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        xn80.m212117v(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return i7e.m138929a(this.sumOfSquaresOfDeltas) / (this.count - 1);
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
        return count() > 0 ? C2677a.m15481b(this).m15485c("count", this.count).m15483a("mean", this.mean).m15483a("populationStandardDeviation", populationStandardDeviation()).m15483a("min", this.min).m15483a(Constants.PRIORITY_MAX, this.max).toString() : C2677a.m15481b(this).m15485c("count", this.count).toString();
    }

    public void writeTo(ByteBuffer byteBuffer) {
        xn80.m212111p(byteBuffer);
        xn80.m212102g(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16425of(Iterator<? extends Number> it) {
        o4g0 o4g0Var = new o4g0();
        o4g0Var.m166005c(it);
        return o4g0Var.m166009h();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16426of(double... dArr) {
        o4g0 o4g0Var = new o4g0();
        o4g0Var.m166006d(dArr);
        return o4g0Var.m166009h();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16427of(int... iArr) {
        o4g0 o4g0Var = new o4g0();
        o4g0Var.m166007e(iArr);
        return o4g0Var.m166009h();
    }

    /* JADX INFO: renamed from: of */
    public static Stats m16428of(long... jArr) {
        o4g0 o4g0Var = new o4g0();
        o4g0Var.m166008f(jArr);
        return o4g0Var.m166009h();
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static double meanOf(double... dArr) {
        xn80.m212099d(dArr.length > 0);
        double dM166002g = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d = dArr[i];
            dM166002g = (Doubles.m16461f(d) && Doubles.m16461f(dM166002g)) ? dM166002g + ((d - dM166002g) / ((double) (i + 1))) : o4g0.m166002g(dM166002g, d);
        }
        return dM166002g;
    }

    public static double meanOf(int... iArr) {
        xn80.m212099d(iArr.length > 0);
        double dM166002g = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d = iArr[i];
            dM166002g = (Doubles.m16461f(d) && Doubles.m16461f(dM166002g)) ? dM166002g + ((d - dM166002g) / ((double) (i + 1))) : o4g0.m166002g(dM166002g, d);
        }
        return dM166002g;
    }

    public static double meanOf(long... jArr) {
        xn80.m212099d(jArr.length > 0);
        double dM166002g = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d = jArr[i];
            dM166002g = (Doubles.m16461f(d) && Doubles.m16461f(dM166002g)) ? dM166002g + ((d - dM166002g) / ((double) (i + 1))) : o4g0.m166002g(dM166002g, d);
        }
        return dM166002g;
    }
}
