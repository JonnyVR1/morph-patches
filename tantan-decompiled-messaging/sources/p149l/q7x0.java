package p149l;

import com.google.android.gms.internal.ads.C2174j5;
import com.google.android.gms.internal.ads.C2190l5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q7x0 {

    /* JADX INFO: renamed from: d */
    public static volatile int f153092d = 100;

    /* JADX INFO: renamed from: a */
    public int f153093a;

    /* JADX INFO: renamed from: b */
    public final int f153094b = f153092d;

    /* JADX INFO: renamed from: c */
    public r7x0 f153095c;

    public /* synthetic */ q7x0(p7x0 p7x0Var) {
    }

    /* JADX INFO: renamed from: e */
    public static int m173312e(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: f */
    public static long m173313f(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: g */
    public static q7x0 m173314g(InputStream inputStream, int i) {
        return new C2190l5(inputStream, 4096, null);
    }

    /* JADX INFO: renamed from: h */
    public static q7x0 m173315h(byte[] bArr, int i, int i2, boolean z) {
        C2174j5 c2174j5 = new C2174j5(bArr, i, i2, z, null);
        try {
            c2174j5.mo12798l(i2);
            return c2174j5;
        } catch (zzhag e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo12781A() throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract void mo12782B(int i) throws zzhag;

    /* JADX INFO: renamed from: a */
    public abstract void mo12791a(int i);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo12792b() throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract boolean mo12793c() throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract boolean mo12794d(int i) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract double mo12795i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract float mo12796j() throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract int mo12797k();

    /* JADX INFO: renamed from: l */
    public abstract int mo12798l(int i) throws zzhag;

    /* JADX INFO: renamed from: m */
    public abstract int mo12799m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract int mo12800n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract int mo12801o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract int mo12802p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo12803q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract int mo12804r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract int mo12805s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract long mo12806t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract long mo12807u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract long mo12808v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract long mo12809w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract long mo12810x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract zzgyl mo12811y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract String mo12812z() throws IOException;
}
