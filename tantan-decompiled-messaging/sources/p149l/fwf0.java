package p149l;

import com.google.common.math.Stats;
import com.google.common.primitives.Doubles;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class fwf0 {

    /* JADX INFO: renamed from: a */
    public long f99649a = 0;

    /* JADX INFO: renamed from: b */
    public double f99650b = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: c */
    public double f99651c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: d */
    public double f99652d = Double.NaN;

    /* JADX INFO: renamed from: e */
    public double f99653e = Double.NaN;

    /* JADX INFO: renamed from: g */
    public static double m123518g(double d, double d2) {
        if (Doubles.m16406f(d)) {
            return d2;
        }
        if (Doubles.m16406f(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: a */
    public void m123519a(double d) {
        long j = this.f99649a;
        if (j == 0) {
            this.f99649a = 1L;
            this.f99650b = d;
            this.f99652d = d;
            this.f99653e = d;
            if (Doubles.m16406f(d)) {
                return;
            }
            this.f99651c = Double.NaN;
            return;
        }
        this.f99649a = j + 1;
        if (Doubles.m16406f(d) && Doubles.m16406f(this.f99650b)) {
            double d2 = this.f99650b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.f99649a);
            this.f99650b = d4;
            this.f99651c += d3 * (d - d4);
        } else {
            this.f99650b = m123518g(this.f99650b, d);
            this.f99651c = Double.NaN;
        }
        this.f99652d = Math.min(this.f99652d, d);
        this.f99653e = Math.max(this.f99653e, d);
    }

    /* JADX INFO: renamed from: b */
    public void m123520b(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            m123519a(it.next().doubleValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m123521c(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            m123519a(it.next().doubleValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m123522d(double... dArr) {
        for (double d : dArr) {
            m123519a(d);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m123523e(int... iArr) {
        for (int i : iArr) {
            m123519a(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m123524f(long... jArr) {
        for (long j : jArr) {
            m123519a(j);
        }
    }

    /* JADX INFO: renamed from: h */
    public Stats m123525h() {
        return new Stats(this.f99649a, this.f99650b, this.f99651c, this.f99652d, this.f99653e);
    }
}
