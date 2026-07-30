package p149l;

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
public final class yoi {

    /* JADX INFO: renamed from: l.yoi$a */
    public static final class C21450a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public bpi f199294a;

        public C21450a(@Nullable bpi bpiVar) {
            this.f199294a = bpiVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m215503a(tqf tqfVar) throws IOException {
        d860 d860Var = new d860(4);
        tqfVar.mo150655f(d860Var.m110299e(), 0, 4);
        return d860Var.m110281J() == 1716281667;
    }

    /* JADX INFO: renamed from: b */
    public static int m215504b(tqf tqfVar) throws IOException {
        tqfVar.mo150657h();
        d860 d860Var = new d860(2);
        tqfVar.mo150655f(d860Var.m110299e(), 0, 2);
        int iM110285N = d860Var.m110285N();
        if ((iM110285N >> 2) == 16382) {
            tqfVar.mo150657h();
            return iM110285N;
        }
        tqfVar.mo150657h();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata m215505c(tqf tqfVar, boolean z) throws Throwable {
        Metadata metadataM197643a = new vam().m197643a(tqfVar, z ? null : uam.f175607b);
        if (metadataM197643a == null || metadataM197643a.m10533e() == 0) {
            return null;
        }
        return metadataM197643a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Metadata m215506d(tqf tqfVar, boolean z) throws Throwable {
        tqfVar.mo150657h();
        long jMo150659k = tqfVar.mo150659k();
        Metadata metadataM215505c = m215505c(tqfVar, z);
        tqfVar.mo150661o((int) (tqfVar.mo150659k() - jMo150659k));
        return metadataM215505c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m215507e(tqf tqfVar, C21450a c21450a) throws IOException {
        tqfVar.mo150657h();
        c860 c860Var = new c860(new byte[4]);
        tqfVar.mo150655f(c860Var.f79701a, 0, 4);
        boolean zM105663g = c860Var.m105663g();
        int iM105664h = c860Var.m105664h(7);
        int iM105664h2 = c860Var.m105664h(24) + 4;
        if (iM105664h == 0) {
            c21450a.f199294a = m215510h(tqfVar);
            return zM105663g;
        }
        bpi bpiVar = c21450a.f199294a;
        if (bpiVar == null) {
            x9g0.m207497a();
            return false;
        }
        if (iM105664h == 3) {
            c21450a.f199294a = bpiVar.m103060b(m215508f(tqfVar, iM105664h2));
            return zM105663g;
        }
        if (iM105664h == 4) {
            c21450a.f199294a = bpiVar.m103061c(m215512j(tqfVar, iM105664h2));
            return zM105663g;
        }
        if (iM105664h != 6) {
            tqfVar.mo150661o(iM105664h2);
            return zM105663g;
        }
        d860 d860Var = new d860(iM105664h2);
        tqfVar.readFully(d860Var.m110299e(), 0, iM105664h2);
        d860Var.m110293V(4);
        c21450a.f199294a = bpiVar.m103059a(ImmutableList.m15686of(PictureFrame.m10549a(d860Var)));
        return zM105663g;
    }

    /* JADX INFO: renamed from: f */
    public static bpi.C15925a m215508f(tqf tqfVar, int i) throws IOException {
        d860 d860Var = new d860(i);
        tqfVar.readFully(d860Var.m110299e(), 0, i);
        return m215509g(d860Var);
    }

    /* JADX INFO: renamed from: g */
    public static bpi.C15925a m215509g(d860 d860Var) {
        d860Var.m110293V(1);
        int iM110282K = d860Var.m110282K();
        long jM110300f = ((long) d860Var.m110300f()) + ((long) iM110282K);
        int i = iM110282K / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM110272A = d860Var.m110272A();
            if (jM110272A == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM110272A;
            jArrCopyOf2[i2] = d860Var.m110272A();
            d860Var.m110293V(2);
        }
        d860Var.m110293V((int) (jM110300f - ((long) d860Var.m110300f())));
        return new bpi.C15925a(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: h */
    public static bpi m215510h(tqf tqfVar) throws IOException {
        byte[] bArr = new byte[38];
        tqfVar.readFully(bArr, 0, 38);
        return new bpi(bArr, 4);
    }

    /* JADX INFO: renamed from: i */
    public static void m215511i(tqf tqfVar) throws IOException {
        d860 d860Var = new d860(4);
        tqfVar.readFully(d860Var.m110299e(), 0, 4);
        if (d860Var.m110281J() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static List<String> m215512j(tqf tqfVar, int i) throws IOException {
        d860 d860Var = new d860(i);
        tqfVar.readFully(d860Var.m110299e(), 0, i);
        d860Var.m110293V(4);
        return Arrays.asList(ydp0.m214319i(d860Var, false, false).f197578b);
    }
}
