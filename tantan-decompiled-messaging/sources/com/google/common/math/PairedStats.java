package com.google.common.math;

import com.google.common.base.C2654a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public PairedStats(Stats stats, Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }

    private static double ensureInUnitRange(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private static double ensurePositive(double d) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        sf80.m183894p(bArr);
        sf80.m183885g(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(byteBufferOrder), Stats.readFrom(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public long count() {
        return this.xStats.count();
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    public int hashCode() {
        return v050.m196471b(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public AbstractC3012a leastSquaresFit() {
        sf80.m183900v(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return AbstractC3012a.m16374a();
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        Stats stats = this.yStats;
        if (dSumOfSquaresOfDeltas > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return stats.sumOfSquaresOfDeltas() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? AbstractC3012a.m16376c(this.xStats.mean(), this.yStats.mean()).m16378a(this.sumOfProductsOfDeltas / dSumOfSquaresOfDeltas) : AbstractC3012a.m16375b(this.yStats.mean());
        }
        sf80.m183900v(stats.sumOfSquaresOfDeltas() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        return AbstractC3012a.m16377d(this.xStats.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        sf80.m183900v(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        sf80.m183900v(dSumOfSquaresOfDeltas > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        sf80.m183900v(dSumOfSquaresOfDeltas2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public double populationCovariance() {
        sf80.m183900v(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        sf80.m183900v(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(byteBufferOrder);
        this.yStats.writeTo(byteBufferOrder);
        byteBufferOrder.putDouble(this.sumOfProductsOfDeltas);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? C2654a.m15427b(this).m15432d("xStats", this.xStats).m15432d("yStats", this.yStats).m15429a("populationCovariance", populationCovariance()).toString() : C2654a.m15427b(this).m15432d("xStats", this.xStats).m15432d("yStats", this.yStats).toString();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }
}
