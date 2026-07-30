package p149l;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jgp0 {

    /* JADX INFO: renamed from: l.jgp0$a */
    public static final class C17769a {

        /* JADX INFO: renamed from: a */
        public final int f117816a;

        /* JADX INFO: renamed from: b */
        public final long f117817b;

        public C17769a(int i, long j) {
            this.f117816a = i;
            this.f117817b = j;
        }

        /* JADX INFO: renamed from: a */
        public static C17769a m141330a(tqf tqfVar, d860 d860Var) throws IOException {
            tqfVar.mo150655f(d860Var.m110299e(), 0, 8);
            d860Var.m110292U(0);
            return new C17769a(d860Var.m110311q(), d860Var.m110318x());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m141325a(tqf tqfVar) throws IOException {
        d860 d860Var = new d860(8);
        int i = C17769a.m141330a(tqfVar, d860Var).f117816a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        tqfVar.mo150655f(d860Var.m110299e(), 0, 4);
        d860Var.m110292U(0);
        int iM110311q = d860Var.m110311q();
        if (iM110311q == 1463899717) {
            return true;
        }
        jwv.m143683c("WavHeaderReader", "Unsupported form type: " + iM110311q);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static igp0 m141326b(tqf tqfVar) throws IOException {
        byte[] bArr;
        d860 d860Var = new d860(16);
        C17769a c17769aM141328d = m141328d(1718449184, tqfVar, d860Var);
        p11.m167013g(c17769aM141328d.f117817b >= 16);
        tqfVar.mo150655f(d860Var.m110299e(), 0, 16);
        d860Var.m110292U(0);
        int iM110320z = d860Var.m110320z();
        int iM110320z2 = d860Var.m110320z();
        int iM110319y = d860Var.m110319y();
        int iM110319y2 = d860Var.m110319y();
        int iM110320z3 = d860Var.m110320z();
        int iM110320z4 = d860Var.m110320z();
        int i = ((int) c17769aM141328d.f117817b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            tqfVar.mo150655f(bArr, 0, i);
        } else {
            bArr = vck0.f180953f;
        }
        byte[] bArr2 = bArr;
        tqfVar.mo150661o((int) (tqfVar.mo150659k() - tqfVar.getPosition()));
        return new igp0(iM110320z, iM110320z2, iM110319y, iM110319y2, iM110320z3, iM110320z4, bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static long m141327c(tqf tqfVar) throws IOException {
        d860 d860Var = new d860(8);
        C17769a c17769aM141330a = C17769a.m141330a(tqfVar, d860Var);
        if (c17769aM141330a.f117816a != 1685272116) {
            tqfVar.mo150657h();
            return -1L;
        }
        tqfVar.mo150660m(8);
        d860Var.m110292U(0);
        tqfVar.mo150655f(d860Var.m110299e(), 0, 8);
        long jM110316v = d860Var.m110316v();
        tqfVar.mo150661o(((int) c17769aM141330a.f117817b) + 8);
        return jM110316v;
    }

    /* JADX INFO: renamed from: d */
    public static C17769a m141328d(int i, tqf tqfVar, d860 d860Var) throws IOException {
        C17769a c17769aM141330a = C17769a.m141330a(tqfVar, d860Var);
        while (c17769aM141330a.f117816a != i) {
            jwv.m143689i("WavHeaderReader", "Ignoring unknown WAV chunk: " + c17769aM141330a.f117816a);
            long j = c17769aM141330a.f117817b + 8;
            if (j > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + c17769aM141330a.f117816a);
            }
            tqfVar.mo150661o((int) j);
            c17769aM141330a = C17769a.m141330a(tqfVar, d860Var);
        }
        return c17769aM141330a;
    }

    /* JADX INFO: renamed from: e */
    public static Pair<Long, Long> m141329e(tqf tqfVar) throws IOException {
        tqfVar.mo150657h();
        C17769a c17769aM141328d = m141328d(1684108385, tqfVar, new d860(8));
        tqfVar.mo150661o(8);
        return Pair.create(Long.valueOf(tqfVar.getPosition()), Long.valueOf(c17769aM141328d.f117817b));
    }
}
