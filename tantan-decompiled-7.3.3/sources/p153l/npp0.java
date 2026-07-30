package p153l;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class npp0 {

    /* JADX INFO: renamed from: l.npp0$a */
    public static final class C18919a {

        /* JADX INFO: renamed from: a */
        public final int f143114a;

        /* JADX INFO: renamed from: b */
        public final long f143115b;

        public C18919a(int i, long j) {
            this.f143114a = i;
            this.f143115b = j;
        }

        /* JADX INFO: renamed from: a */
        public static C18919a m164235a(asf asfVar, ig60 ig60Var) throws IOException {
            asfVar.mo99900f(ig60Var.m139815e(), 0, 8);
            ig60Var.m139808U(0);
            return new C18919a(ig60Var.m139827q(), ig60Var.m139834x());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m164230a(asf asfVar) throws IOException {
        ig60 ig60Var = new ig60(8);
        int i = C18919a.m164235a(asfVar, ig60Var).f143114a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        asfVar.mo99900f(ig60Var.m139815e(), 0, 4);
        ig60Var.m139808U(0);
        int iM139827q = ig60Var.m139827q();
        if (iM139827q == 1463899717) {
            return true;
        }
        kyv.m152145c("WavHeaderReader", "Unsupported form type: " + iM139827q);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static mpp0 m164231b(asf asfVar) throws IOException {
        byte[] bArr;
        ig60 ig60Var = new ig60(16);
        C18919a c18919aM164233d = m164233d(1718449184, asfVar, ig60Var);
        w11.m204371g(c18919aM164233d.f143115b >= 16);
        asfVar.mo99900f(ig60Var.m139815e(), 0, 16);
        ig60Var.m139808U(0);
        int iM139836z = ig60Var.m139836z();
        int iM139836z2 = ig60Var.m139836z();
        int iM139835y = ig60Var.m139835y();
        int iM139835y2 = ig60Var.m139835y();
        int iM139836z3 = ig60Var.m139836z();
        int iM139836z4 = ig60Var.m139836z();
        int i = ((int) c18919aM164233d.f143115b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            asfVar.mo99900f(bArr, 0, i);
        } else {
            bArr = bmk0.f77318f;
        }
        byte[] bArr2 = bArr;
        asfVar.mo99905o((int) (asfVar.mo99903k() - asfVar.getPosition()));
        return new mpp0(iM139836z, iM139836z2, iM139835y, iM139835y2, iM139836z3, iM139836z4, bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static long m164232c(asf asfVar) throws IOException {
        ig60 ig60Var = new ig60(8);
        C18919a c18919aM164235a = C18919a.m164235a(asfVar, ig60Var);
        if (c18919aM164235a.f143114a != 1685272116) {
            asfVar.mo99902h();
            return -1L;
        }
        asfVar.mo99904m(8);
        ig60Var.m139808U(0);
        asfVar.mo99900f(ig60Var.m139815e(), 0, 8);
        long jM139832v = ig60Var.m139832v();
        asfVar.mo99905o(((int) c18919aM164235a.f143115b) + 8);
        return jM139832v;
    }

    /* JADX INFO: renamed from: d */
    public static C18919a m164233d(int i, asf asfVar, ig60 ig60Var) throws IOException {
        C18919a c18919aM164235a = C18919a.m164235a(asfVar, ig60Var);
        while (c18919aM164235a.f143114a != i) {
            kyv.m152151i("WavHeaderReader", "Ignoring unknown WAV chunk: " + c18919aM164235a.f143114a);
            long j = c18919aM164235a.f143115b + 8;
            if (j > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + c18919aM164235a.f143114a);
            }
            asfVar.mo99905o((int) j);
            c18919aM164235a = C18919a.m164235a(asfVar, ig60Var);
        }
        return c18919aM164235a;
    }

    /* JADX INFO: renamed from: e */
    public static Pair<Long, Long> m164234e(asf asfVar) throws IOException {
        asfVar.mo99902h();
        C18919a c18919aM164233d = m164233d(1684108385, asfVar, new ig60(8));
        asfVar.mo99905o(8);
        return Pair.create(Long.valueOf(asfVar.getPosition()), Long.valueOf(c18919aM164233d.f143115b));
    }
}
