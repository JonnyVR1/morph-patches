package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class uri {

    /* JADX INFO: renamed from: l.uri$a */
    public static final class C20647a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public xri f180655a;

        public C20647a(@Nullable xri xriVar) {
            this.f180655a = xriVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m197602a(asf asfVar) throws IOException {
        ig60 ig60Var = new ig60(4);
        asfVar.mo99900f(ig60Var.m139815e(), 0, 4);
        return ig60Var.m139797J() == 1716281667;
    }

    /* JADX INFO: renamed from: b */
    public static int m197603b(asf asfVar) throws IOException {
        asfVar.mo99902h();
        ig60 ig60Var = new ig60(2);
        asfVar.mo99900f(ig60Var.m139815e(), 0, 2);
        int iM139801N = ig60Var.m139801N();
        if ((iM139801N >> 2) == 16382) {
            asfVar.mo99902h();
            return iM139801N;
        }
        asfVar.mo99902h();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata m197604c(asf asfVar, boolean z) throws Throwable {
        Metadata metadataM153782a = new ldm().m153782a(asfVar, z ? null : kdm.f125258b);
        if (metadataM153782a == null || metadataM153782a.m10587e() == 0) {
            return null;
        }
        return metadataM153782a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Metadata m197605d(asf asfVar, boolean z) throws Throwable {
        asfVar.mo99902h();
        long jMo99903k = asfVar.mo99903k();
        Metadata metadataM197604c = m197604c(asfVar, z);
        asfVar.mo99905o((int) (asfVar.mo99903k() - jMo99903k));
        return metadataM197604c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m197606e(asf asfVar, C20647a c20647a) throws IOException {
        asfVar.mo99902h();
        hg60 hg60Var = new hg60(new byte[4]);
        asfVar.mo99900f(hg60Var.f109369a, 0, 4);
        boolean zM134904g = hg60Var.m134904g();
        int iM134905h = hg60Var.m134905h(7);
        int iM134905h2 = hg60Var.m134905h(24) + 4;
        if (iM134905h == 0) {
            c20647a.f180655a = m197609h(asfVar);
            return zM134904g;
        }
        xri xriVar = c20647a.f180655a;
        if (xriVar == null) {
            fig0.m125680a();
            return false;
        }
        if (iM134905h == 3) {
            c20647a.f180655a = xriVar.m212830b(m197607f(asfVar, iM134905h2));
            return zM134904g;
        }
        if (iM134905h == 4) {
            c20647a.f180655a = xriVar.m212831c(m197611j(asfVar, iM134905h2));
            return zM134904g;
        }
        if (iM134905h != 6) {
            asfVar.mo99905o(iM134905h2);
            return zM134904g;
        }
        ig60 ig60Var = new ig60(iM134905h2);
        asfVar.readFully(ig60Var.m139815e(), 0, iM134905h2);
        ig60Var.m139809V(4);
        c20647a.f180655a = xriVar.m212829a(ImmutableList.m15740of(PictureFrame.m10603a(ig60Var)));
        return zM134904g;
    }

    /* JADX INFO: renamed from: f */
    public static xri.C21431a m197607f(asf asfVar, int i) throws IOException {
        ig60 ig60Var = new ig60(i);
        asfVar.readFully(ig60Var.m139815e(), 0, i);
        return m197608g(ig60Var);
    }

    /* JADX INFO: renamed from: g */
    public static xri.C21431a m197608g(ig60 ig60Var) {
        ig60Var.m139809V(1);
        int iM139798K = ig60Var.m139798K();
        long jM139816f = ((long) ig60Var.m139816f()) + ((long) iM139798K);
        int i = iM139798K / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM139788A = ig60Var.m139788A();
            if (jM139788A == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM139788A;
            jArrCopyOf2[i2] = ig60Var.m139788A();
            ig60Var.m139809V(2);
        }
        ig60Var.m139809V((int) (jM139816f - ((long) ig60Var.m139816f())));
        return new xri.C21431a(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: h */
    public static xri m197609h(asf asfVar) throws IOException {
        byte[] bArr = new byte[38];
        asfVar.readFully(bArr, 0, 38);
        return new xri(bArr, 4);
    }

    /* JADX INFO: renamed from: i */
    public static void m197610i(asf asfVar) throws IOException {
        ig60 ig60Var = new ig60(4);
        asfVar.readFully(ig60Var.m139815e(), 0, 4);
        if (ig60Var.m139797J() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static List<String> m197611j(asf asfVar, int i) throws IOException {
        ig60 ig60Var = new ig60(i);
        asfVar.readFully(ig60Var.m139815e(), 0, i);
        ig60Var.m139809V(4);
        return Arrays.asList(cnp0.m111530i(ig60Var, false, false).f82740b);
    }
}
