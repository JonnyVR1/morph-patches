package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xdp0 extends ozf0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public C21105a f192437n;

    /* JADX INFO: renamed from: o */
    public int f192438o;

    /* JADX INFO: renamed from: p */
    public boolean f192439p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public ydp0.C21379c f192440q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public ydp0.C21377a f192441r;

    /* JADX INFO: renamed from: l.xdp0$a */
    public static final class C21105a {

        /* JADX INFO: renamed from: a */
        public final ydp0.C21379c f192442a;

        /* JADX INFO: renamed from: b */
        public final ydp0.C21377a f192443b;

        /* JADX INFO: renamed from: c */
        public final byte[] f192444c;

        /* JADX INFO: renamed from: d */
        public final ydp0.C21378b[] f192445d;

        /* JADX INFO: renamed from: e */
        public final int f192446e;

        public C21105a(ydp0.C21379c c21379c, ydp0.C21377a c21377a, byte[] bArr, ydp0.C21378b[] c21378bArr, int i) {
            this.f192442a = c21379c;
            this.f192443b = c21377a;
            this.f192444c = bArr;
            this.f192445d = c21378bArr;
            this.f192446e = i;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public static void m208419n(d860 d860Var, long j) {
        if (d860Var.m110296b() < d860Var.m110301g() + 4) {
            d860Var.m110289R(Arrays.copyOf(d860Var.m110299e(), d860Var.m110301g() + 4));
        } else {
            d860Var.m110291T(d860Var.m110301g() + 4);
        }
        byte[] bArrM110299e = d860Var.m110299e();
        bArrM110299e[d860Var.m110301g() - 4] = (byte) (j & 255);
        bArrM110299e[d860Var.m110301g() - 3] = (byte) ((j >>> 8) & 255);
        bArrM110299e[d860Var.m110301g() - 2] = (byte) ((j >>> 16) & 255);
        bArrM110299e[d860Var.m110301g() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* JADX INFO: renamed from: o */
    public static int m208420o(byte b, C21105a c21105a) {
        boolean z = c21105a.f192445d[m208421p(b, c21105a.f192446e, 1)].f197580a;
        ydp0.C21379c c21379c = c21105a.f192442a;
        return !z ? c21379c.f197590g : c21379c.f197591h;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p */
    public static int m208421p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m208422r(d860 d860Var) {
        try {
            return ydp0.m214323m(1, d860Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: e */
    public void mo166762e(long j) {
        super.mo166762e(j);
        this.f192439p = j != 0;
        ydp0.C21379c c21379c = this.f192440q;
        this.f192438o = c21379c != null ? c21379c.f197590g : 0;
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: f */
    public long mo166763f(d860 d860Var) {
        if ((d860Var.m110299e()[0] & 1) == 1) {
            return -1L;
        }
        int iM208420o = m208420o(d860Var.m110299e()[0], (C21105a) p11.m167015i(this.f192437n));
        long j = this.f192439p ? (this.f192438o + iM208420o) / 4 : 0;
        m208419n(d860Var, j);
        this.f192439p = true;
        this.f192438o = iM208420o;
        return j;
    }

    @Override // p149l.ozf0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public boolean mo166766i(d860 d860Var, long j, ozf0.C19085b c19085b) throws IOException {
        if (this.f192437n != null) {
            p11.m167011e(c19085b.f146435a);
            return false;
        }
        C21105a c21105aM208423q = m208423q(d860Var);
        this.f192437n = c21105aM208423q;
        if (c21105aM208423q == null) {
            return true;
        }
        ydp0.C21379c c21379c = c21105aM208423q.f192442a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c21379c.f197593j);
        arrayList.add(c21105aM208423q.f192444c);
        c19085b.f146435a = new C1871k.b().m10346g0("audio/vorbis").m10322I(c21379c.f197588e).m10341b0(c21379c.f197587d).m10323J(c21379c.f197585b).m10347h0(c21379c.f197586c).m10335V(arrayList).m10339Z(ydp0.m214313c(ImmutableList.copyOf(c21105aM208423q.f192443b.f197578b))).m10320G();
        return true;
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: l */
    public void mo166769l(boolean z) {
        super.mo166769l(z);
        if (z) {
            this.f192437n = null;
            this.f192440q = null;
            this.f192441r = null;
        }
        this.f192438o = 0;
        this.f192439p = false;
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public C21105a m208423q(d860 d860Var) throws IOException {
        ydp0.C21379c c21379c = this.f192440q;
        if (c21379c == null) {
            this.f192440q = ydp0.m214320j(d860Var);
            return null;
        }
        ydp0.C21377a c21377a = this.f192441r;
        if (c21377a == null) {
            this.f192441r = ydp0.m214318h(d860Var);
            return null;
        }
        byte[] bArr = new byte[d860Var.m110301g()];
        System.arraycopy(d860Var.m110299e(), 0, bArr, 0, d860Var.m110301g());
        ydp0.C21378b[] c21378bArrM214321k = ydp0.m214321k(d860Var, c21379c.f197585b);
        return new C21105a(c21379c, c21377a, bArr, c21378bArrM214321k, ydp0.m214311a(c21378bArrM214321k.length - 1));
    }
}
