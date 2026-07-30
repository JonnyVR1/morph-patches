package com.google.common.math;

import com.google.common.base.C2677a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p153l.k950;
import p153l.xn80;

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
        xn80.m212111p(bArr);
        xn80.m212102g(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
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
        return k950.m148864b(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public AbstractC3035a leastSquaresFit() {
        xn80.m212117v(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return AbstractC3035a.m16429a();
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        Stats stats = this.yStats;
        if (dSumOfSquaresOfDeltas > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return stats.sumOfSquaresOfDeltas() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? AbstractC3035a.m16431c(this.xStats.mean(), this.yStats.mean()).m16433a(this.sumOfProductsOfDeltas / dSumOfSquaresOfDeltas) : AbstractC3035a.m16430b(this.yStats.mean());
        }
        xn80.m212117v(stats.sumOfSquaresOfDeltas() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        return AbstractC3035a.m16432d(this.xStats.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        xn80.m212117v(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        xn80.m212117v(dSumOfSquaresOfDeltas > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        xn80.m212117v(dSumOfSquaresOfDeltas2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public double populationCovariance() {
        xn80.m212117v(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        xn80.m212117v(count() > 1);
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
        return count() > 0 ? C2677a.m15481b(this).m15486d("xStats", this.xStats).m15486d("yStats", this.yStats).m15483a("populationCovariance", populationCovariance()).toString() : C2677a.m15481b(this).m15486d("xStats", this.xStats).m15486d("yStats", this.yStats).toString();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }
}
