package p149l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hox0 {

    /* JADX INFO: renamed from: d */
    public static volatile int f108871d = 100;

    /* JADX INFO: renamed from: a */
    public int f108872a;

    /* JADX INFO: renamed from: b */
    public int f108873b;

    /* JADX INFO: renamed from: c */
    public upx0 f108874c;

    public hox0() {
        this.f108873b = f108871d;
    }

    /* JADX INFO: renamed from: b */
    public static int m132289b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m132290c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static hox0 m132291d(byte[] bArr, int i, int i2, boolean z) {
        yox0 yox0Var = new yox0(bArr, i2);
        try {
            yox0Var.mo132296f(i2);
            return yox0Var;
        } catch (zzkb e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo132292A() throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract boolean mo132293B() throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract double mo132294a() throws IOException;

    /* JADX INFO: renamed from: e */
    public abstract float mo132295e() throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract int mo132296f(int i) throws zzkb;

    /* JADX INFO: renamed from: g */
    public abstract int mo132297g();

    /* JADX INFO: renamed from: h */
    public abstract void mo132298h(int i) throws zzkb;

    /* JADX INFO: renamed from: i */
    public abstract int mo132299i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo132300j(int i);

    /* JADX INFO: renamed from: k */
    public abstract int mo132301k() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract boolean mo132302l(int i) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract int mo132303m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract int mo132304n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract int mo132305o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract int mo132306p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo132307q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract long mo132308r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract long mo132309s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract long mo132310t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract long mo132311u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract long mo132312v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract long mo132313w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract zzik mo132314x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract String mo132315y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract String mo132316z() throws IOException;
}
