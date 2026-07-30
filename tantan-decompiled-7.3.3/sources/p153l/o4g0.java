package p153l;

import com.google.common.math.Stats;
import com.google.common.primitives.Doubles;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class o4g0 {

    /* JADX INFO: renamed from: a */
    public long f144977a = 0;

    /* JADX INFO: renamed from: b */
    public double f144978b = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: c */
    public double f144979c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: d */
    public double f144980d = Double.NaN;

    /* JADX INFO: renamed from: e */
    public double f144981e = Double.NaN;

    /* JADX INFO: renamed from: g */
    public static double m166002g(double d, double d2) {
        if (Doubles.m16461f(d)) {
            return d2;
        }
        if (Doubles.m16461f(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: a */
    public void m166003a(double d) {
        long j = this.f144977a;
        if (j == 0) {
            this.f144977a = 1L;
            this.f144978b = d;
            this.f144980d = d;
            this.f144981e = d;
            if (Doubles.m16461f(d)) {
                return;
            }
            this.f144979c = Double.NaN;
            return;
        }
        this.f144977a = j + 1;
        if (Doubles.m16461f(d) && Doubles.m16461f(this.f144978b)) {
            double d2 = this.f144978b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.f144977a);
            this.f144978b = d4;
            this.f144979c += d3 * (d - d4);
        } else {
            this.f144978b = m166002g(this.f144978b, d);
            this.f144979c = Double.NaN;
        }
        this.f144980d = Math.min(this.f144980d, d);
        this.f144981e = Math.max(this.f144981e, d);
    }

    /* JADX INFO: renamed from: b */
    public void m166004b(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            m166003a(it.next().doubleValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m166005c(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            m166003a(it.next().doubleValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m166006d(double... dArr) {
        for (double d : dArr) {
            m166003a(d);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m166007e(int... iArr) {
        for (int i : iArr) {
            m166003a(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m166008f(long... jArr) {
        for (long j : jArr) {
            m166003a(j);
        }
    }

    /* JADX INFO: renamed from: h */
    public Stats m166009h() {
        return new Stats(this.f144977a, this.f144978b, this.f144979c, this.f144980d, this.f144981e);
    }
}
