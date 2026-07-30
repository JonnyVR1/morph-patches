package p153l;

import com.google.android.gms.internal.ads.C2197j5;
import com.google.android.gms.internal.ads.C2213l5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wgx0 {

    /* JADX INFO: renamed from: d */
    public static volatile int f189068d = 100;

    /* JADX INFO: renamed from: a */
    public int f189069a;

    /* JADX INFO: renamed from: b */
    public final int f189070b = f189068d;

    /* JADX INFO: renamed from: c */
    public xgx0 f189071c;

    public /* synthetic */ wgx0(vgx0 vgx0Var) {
    }

    /* JADX INFO: renamed from: e */
    public static int m206326e(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: f */
    public static long m206327f(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: g */
    public static wgx0 m206328g(InputStream inputStream, int i) {
        return new C2213l5(inputStream, 4096, null);
    }

    /* JADX INFO: renamed from: h */
    public static wgx0 m206329h(byte[] bArr, int i, int i2, boolean z) {
        C2197j5 c2197j5 = new C2197j5(bArr, i, i2, z, null);
        try {
            c2197j5.mo12852l(i2);
            return c2197j5;
        } catch (zzhag e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo12835A() throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract void mo12836B(int i) throws zzhag;

    /* JADX INFO: renamed from: a */
    public abstract void mo12845a(int i);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo12846b() throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract boolean mo12847c() throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract boolean mo12848d(int i) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract double mo12849i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract float mo12850j() throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract int mo12851k();

    /* JADX INFO: renamed from: l */
    public abstract int mo12852l(int i) throws zzhag;

    /* JADX INFO: renamed from: m */
    public abstract int mo12853m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract int mo12854n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract int mo12855o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract int mo12856p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo12857q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract int mo12858r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract int mo12859s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract long mo12860t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract long mo12861u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract long mo12862v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract long mo12863w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract long mo12864x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract zzgyl mo12865y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract String mo12866z() throws IOException;
}
