package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bnp0 extends v7g0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public C16068a f77570n;

    /* JADX INFO: renamed from: o */
    public int f77571o;

    /* JADX INFO: renamed from: p */
    public boolean f77572p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public cnp0.C16321c f77573q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public cnp0.C16319a f77574r;

    /* JADX INFO: renamed from: l.bnp0$a */
    public static final class C16068a {

        /* JADX INFO: renamed from: a */
        public final cnp0.C16321c f77575a;

        /* JADX INFO: renamed from: b */
        public final cnp0.C16319a f77576b;

        /* JADX INFO: renamed from: c */
        public final byte[] f77577c;

        /* JADX INFO: renamed from: d */
        public final cnp0.C16320b[] f77578d;

        /* JADX INFO: renamed from: e */
        public final int f77579e;

        public C16068a(cnp0.C16321c c16321c, cnp0.C16319a c16319a, byte[] bArr, cnp0.C16320b[] c16320bArr, int i) {
            this.f77575a = c16321c;
            this.f77576b = c16319a;
            this.f77577c = bArr;
            this.f77578d = c16320bArr;
            this.f77579e = i;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public static void m105599n(ig60 ig60Var, long j) {
        if (ig60Var.m139812b() < ig60Var.m139817g() + 4) {
            ig60Var.m139805R(Arrays.copyOf(ig60Var.m139815e(), ig60Var.m139817g() + 4));
        } else {
            ig60Var.m139807T(ig60Var.m139817g() + 4);
        }
        byte[] bArrM139815e = ig60Var.m139815e();
        bArrM139815e[ig60Var.m139817g() - 4] = (byte) (j & 255);
        bArrM139815e[ig60Var.m139817g() - 3] = (byte) ((j >>> 8) & 255);
        bArrM139815e[ig60Var.m139817g() - 2] = (byte) ((j >>> 16) & 255);
        bArrM139815e[ig60Var.m139817g() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* JADX INFO: renamed from: o */
    public static int m105600o(byte b, C16068a c16068a) {
        boolean z = c16068a.f77578d[m105601p(b, c16068a.f77579e, 1)].f82742a;
        cnp0.C16321c c16321c = c16068a.f77575a;
        return !z ? c16321c.f82752g : c16321c.f82753h;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p */
    public static int m105601p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m105602r(ig60 ig60Var) {
        try {
            return cnp0.m111534m(1, ig60Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: e */
    public void mo105603e(long j) {
        super.mo105603e(j);
        this.f77572p = j != 0;
        cnp0.C16321c c16321c = this.f77573q;
        this.f77571o = c16321c != null ? c16321c.f82752g : 0;
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: f */
    public long mo105604f(ig60 ig60Var) {
        if ((ig60Var.m139815e()[0] & 1) == 1) {
            return -1L;
        }
        int iM105600o = m105600o(ig60Var.m139815e()[0], (C16068a) w11.m204373i(this.f77570n));
        long j = this.f77572p ? (this.f77571o + iM105600o) / 4 : 0;
        m105599n(ig60Var, j);
        this.f77572p = true;
        this.f77571o = iM105600o;
        return j;
    }

    @Override // p153l.v7g0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public boolean mo105605i(ig60 ig60Var, long j, v7g0.C20782b c20782b) throws IOException {
        if (this.f77570n != null) {
            w11.m204369e(c20782b.f182771a);
            return false;
        }
        C16068a c16068aM105607q = m105607q(ig60Var);
        this.f77570n = c16068aM105607q;
        if (c16068aM105607q == null) {
            return true;
        }
        cnp0.C16321c c16321c = c16068aM105607q.f77575a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c16321c.f82755j);
        arrayList.add(c16068aM105607q.f77577c);
        c20782b.f182771a = new C1894k.b().m10400g0("audio/vorbis").m10376I(c16321c.f82750e).m10395b0(c16321c.f82749d).m10377J(c16321c.f82747b).m10401h0(c16321c.f82748c).m10389V(arrayList).m10393Z(cnp0.m111524c(ImmutableList.copyOf(c16068aM105607q.f77576b.f82740b))).m10374G();
        return true;
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: l */
    public void mo105606l(boolean z) {
        super.mo105606l(z);
        if (z) {
            this.f77570n = null;
            this.f77573q = null;
            this.f77574r = null;
        }
        this.f77571o = 0;
        this.f77572p = false;
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public C16068a m105607q(ig60 ig60Var) throws IOException {
        cnp0.C16321c c16321c = this.f77573q;
        if (c16321c == null) {
            this.f77573q = cnp0.m111531j(ig60Var);
            return null;
        }
        cnp0.C16319a c16319a = this.f77574r;
        if (c16319a == null) {
            this.f77574r = cnp0.m111529h(ig60Var);
            return null;
        }
        byte[] bArr = new byte[ig60Var.m139817g()];
        System.arraycopy(ig60Var.m139815e(), 0, bArr, 0, ig60Var.m139817g());
        cnp0.C16320b[] c16320bArrM111532k = cnp0.m111532k(ig60Var, c16321c.f82747b);
        return new C16068a(c16321c, c16319a, bArr, c16320bArrM111532k, cnp0.m111522a(c16320bArrM111532k.length - 1));
    }
}
