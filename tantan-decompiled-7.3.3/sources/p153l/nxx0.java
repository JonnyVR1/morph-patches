package p153l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nxx0 {

    /* JADX INFO: renamed from: d */
    public static volatile int f144274d = 100;

    /* JADX INFO: renamed from: a */
    public int f144275a;

    /* JADX INFO: renamed from: b */
    public int f144276b;

    /* JADX INFO: renamed from: c */
    public azx0 f144277c;

    public nxx0() {
        this.f144276b = f144274d;
    }

    /* JADX INFO: renamed from: b */
    public static int m165303b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m165304c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static nxx0 m165305d(byte[] bArr, int i, int i2, boolean z) {
        eyx0 eyx0Var = new eyx0(bArr, i2);
        try {
            eyx0Var.mo123311f(i2);
            return eyx0Var;
        } catch (zzkb e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo123300A() throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract boolean mo123301B() throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract double mo123309a() throws IOException;

    /* JADX INFO: renamed from: e */
    public abstract float mo123310e() throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract int mo123311f(int i) throws zzkb;

    /* JADX INFO: renamed from: g */
    public abstract int mo123312g();

    /* JADX INFO: renamed from: h */
    public abstract void mo123313h(int i) throws zzkb;

    /* JADX INFO: renamed from: i */
    public abstract int mo123314i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo123315j(int i);

    /* JADX INFO: renamed from: k */
    public abstract int mo123316k() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract boolean mo123317l(int i) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract int mo123318m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract int mo123319n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract int mo123320o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract int mo123321p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo123322q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract long mo123323r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract long mo123324s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract long mo123325t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract long mo123326u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract long mo123327v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract long mo123328w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract zzik mo123329x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract String mo123330y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract String mo123331z() throws IOException;
}
