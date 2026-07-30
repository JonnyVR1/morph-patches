package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.playlist.C1986b;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class j5l extends crx {

    /* JADX INFO: renamed from: N */
    public static final AtomicInteger f118447N = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public final boolean f118448A;

    /* JADX INFO: renamed from: B */
    public final boolean f118449B;

    /* JADX INFO: renamed from: C */
    public final bf80 f118450C;

    /* JADX INFO: renamed from: D */
    public final long f118451D;

    /* JADX INFO: renamed from: E */
    public k5l f118452E;

    /* JADX INFO: renamed from: F */
    public s5l f118453F;

    /* JADX INFO: renamed from: G */
    public int f118454G;

    /* JADX INFO: renamed from: H */
    public boolean f118455H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f118456I;

    /* JADX INFO: renamed from: J */
    public boolean f118457J;

    /* JADX INFO: renamed from: K */
    public ImmutableList<Integer> f118458K;

    /* JADX INFO: renamed from: L */
    public boolean f118459L;

    /* JADX INFO: renamed from: M */
    public boolean f118460M;

    /* JADX INFO: renamed from: k */
    public final int f118461k;

    /* JADX INFO: renamed from: l */
    public final int f118462l;

    /* JADX INFO: renamed from: m */
    public final Uri f118463m;

    /* JADX INFO: renamed from: n */
    public final boolean f118464n;

    /* JADX INFO: renamed from: o */
    public final int f118465o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final g6c f118466p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C2070a f118467q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final k5l f118468r;

    /* JADX INFO: renamed from: s */
    public final boolean f118469s;

    /* JADX INFO: renamed from: t */
    public final boolean f118470t;

    /* JADX INFO: renamed from: u */
    public final h0j0 f118471u;

    /* JADX INFO: renamed from: v */
    public final h5l f118472v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public final List<C1894k> f118473w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final DrmInitData f118474x;

    /* JADX INFO: renamed from: y */
    public final kdm f118475y;

    /* JADX INFO: renamed from: z */
    public final ig60 f118476z;

    public j5l(h5l h5lVar, g6c g6cVar, C2070a c2070a, C1894k c1894k, boolean z, @Nullable g6c g6cVar2, @Nullable C2070a c2070a2, boolean z2, Uri uri, @Nullable List<C1894k> list, int i, @Nullable Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, h0j0 h0j0Var, long j4, @Nullable DrmInitData drmInitData, @Nullable k5l k5lVar, kdm kdmVar, ig60 ig60Var, boolean z6, bf80 bf80Var) {
        super(g6cVar, c2070a, c1894k, i, obj, j, j2, j3);
        this.f118448A = z;
        this.f118465o = i2;
        this.f118460M = z3;
        this.f118462l = i3;
        this.f118467q = c2070a2;
        this.f118466p = g6cVar2;
        this.f118455H = c2070a2 != null;
        this.f118449B = z2;
        this.f118463m = uri;
        this.f118469s = z5;
        this.f118471u = h0j0Var;
        this.f118451D = j4;
        this.f118470t = z4;
        this.f118472v = h5lVar;
        this.f118473w = list;
        this.f118474x = drmInitData;
        this.f118468r = k5lVar;
        this.f118475y = kdmVar;
        this.f118476z = ig60Var;
        this.f118464n = z6;
        this.f118450C = bf80Var;
        this.f118458K = ImmutableList.m15739of();
        this.f118461k = f118447N.getAndIncrement();
    }

    /* JADX INFO: renamed from: i */
    public static g6c m143528i(g6c g6cVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return g6cVar;
        }
        w11.m204369e(bArr2);
        return new hb0(g6cVar, bArr, bArr2);
    }

    /* JADX INFO: renamed from: j */
    public static j5l m143529j(h5l h5lVar, g6c g6cVar, C1894k c1894k, long j, C1986b c1986b, f5l.C16905e c16905e, Uri uri, @Nullable List<C1894k> list, int i, @Nullable Object obj, boolean z, i0j0 i0j0Var, long j2, @Nullable j5l j5lVar, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z2, bf80 bf80Var, @Nullable ac5 ac5Var) {
        boolean z3;
        C2070a c2070aM12162a;
        g6c g6cVarM143528i;
        boolean z4;
        Uri uri2;
        kdm kdmVar;
        ig60 ig60Var;
        k5l k5lVar;
        C1986b.e eVar = c16905e.f97264a;
        C2070a c2070aM12162a2 = new C2070a.b().m12170i(h4k0.m133582e(c1986b.f134910a, eVar.f8647a)).m12169h(eVar.f8655i).m12168g(eVar.f8656j).m12163b(c16905e.f97267d ? 8 : 0).m12166e(ImmutableMap.m15769of()).m12162a();
        boolean z5 = bArr != null;
        g6c g6cVarM143528i2 = m143528i(g6cVar, bArr, z5 ? m143530l((String) w11.m204369e(eVar.f8654h)) : null);
        C1986b.d dVar = eVar.f8648b;
        if (dVar != null) {
            boolean z6 = bArr2 != null;
            byte[] bArrM143530l = z6 ? m143530l((String) w11.m204369e(dVar.f8654h)) : null;
            z3 = true;
            c2070aM12162a = new C2070a.b().m12170i(h4k0.m133582e(c1986b.f134910a, dVar.f8647a)).m12169h(dVar.f8655i).m12168g(dVar.f8656j).m12166e(ImmutableMap.m15769of()).m12162a();
            z4 = z6;
            g6cVarM143528i = m143528i(g6cVar, bArr2, bArrM143530l);
        } else {
            z3 = true;
            c2070aM12162a = null;
            g6cVarM143528i = null;
            z4 = false;
        }
        long j3 = j + eVar.f8651e;
        long j4 = j3 + eVar.f8649c;
        int i2 = c1986b.f8627j + eVar.f8650d;
        if (j5lVar != null) {
            C2070a c2070a = j5lVar.f118467q;
            boolean z7 = (c2070aM12162a == c2070a || (c2070aM12162a != null && c2070a != null && c2070aM12162a.f9529a.equals(c2070a.f9529a) && c2070aM12162a.f9535g == j5lVar.f118467q.f9535g)) ? z3 : false;
            uri2 = uri;
            boolean z8 = (uri2.equals(j5lVar.f118463m) && j5lVar.f118457J) ? z3 : false;
            kdmVar = j5lVar.f118475y;
            ig60Var = j5lVar.f118476z;
            k5lVar = (z7 && z8 && !j5lVar.f118459L && j5lVar.f118462l == i2) ? j5lVar.f118452E : null;
        } else {
            uri2 = uri;
            kdmVar = new kdm();
            ig60Var = new ig60(10);
            k5lVar = null;
        }
        return new j5l(h5lVar, g6cVarM143528i2, c2070aM12162a2, c1894k, z5, g6cVarM143528i, c2070aM12162a, z4, uri2, list, i, obj, j3, j4, c16905e.f97265b, c16905e.f97266c, !c16905e.f97267d, i2, eVar.f8657k, z, i0j0Var.m137972a(i2), j2, eVar.f8652f, k5lVar, kdmVar, ig60Var, z2, bf80Var);
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m143530l(String str) {
        if (i11.m138051e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m143531p(f5l.C16905e c16905e, C1986b c1986b) {
        C1986b.e eVar = c16905e.f97264a;
        if (!(eVar instanceof C1986b.b)) {
            return c1986b.f134912c;
        }
        if (((C1986b.b) eVar).f8640l) {
            return true;
        }
        return c16905e.f97266c == 0 && c1986b.f134912c;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m143532w(@Nullable j5l j5lVar, Uri uri, C1986b c1986b, f5l.C16905e c16905e, long j) {
        if (j5lVar == null) {
            return false;
        }
        if (uri.equals(j5lVar.f118463m) && j5lVar.f118457J) {
            return false;
        }
        return !m143531p(c16905e, c1986b) || j + c16905e.f97264a.f8651e < j5lVar.f144933h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public void mo11431a() throws IOException {
        k5l k5lVar;
        w11.m204369e(this.f118453F);
        if (this.f118452E == null && (k5lVar = this.f118468r) != null && k5lVar.mo130405d()) {
            this.f118452E = this.f118468r;
            this.f118455H = false;
        }
        m143539s();
        if (this.f118456I) {
            return;
        }
        if (!this.f118470t) {
            m143538r();
        }
        this.f118457J = !this.f118456I;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public void mo11432c() {
        this.f118456I = true;
    }

    @Override // p153l.crx
    /* JADX INFO: renamed from: h */
    public boolean mo112090h() {
        return this.f118457J;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: k */
    public final void m143533k(g6c g6cVar, C2070a c2070a, boolean z, boolean z2) throws IOException {
        C2070a c2070aM12160e;
        long position;
        int i = this.f118454G;
        boolean z3 = false;
        if (z) {
            z3 = i != 0;
            c2070aM12160e = c2070a;
        } else {
            c2070aM12160e = c2070a.m12160e(i);
        }
        try {
            qod qodVarM143541u = m143541u(g6cVar, c2070aM12160e, z2);
            if (z3) {
                qodVarM143541u.mo99905o(this.f118454G);
            }
            do {
                try {
                    try {
                        if (this.f118456I) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.f144929d.f7778e & 16384) == 0) {
                            throw e;
                        }
                        this.f118452E.mo130404c();
                        position = qodVarM143541u.getPosition();
                    }
                } catch (Throwable th) {
                    this.f118454G = (int) (qodVarM143541u.getPosition() - c2070a.f9535g);
                    throw th;
                }
            } while (this.f118452E.mo130402a(qodVarM143541u));
            position = qodVarM143541u.getPosition();
            this.f118454G = (int) (position - c2070a.f9535g);
            m6c.m157209a(g6cVar);
        } catch (Throwable th2) {
            m6c.m157209a(g6cVar);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m143534m(int i) {
        w11.m204371g(!this.f118464n);
        if (i >= this.f118458K.size()) {
            return 0;
        }
        return this.f118458K.get(i).intValue();
    }

    /* JADX INFO: renamed from: n */
    public void m143535n(s5l s5lVar, ImmutableList<Integer> immutableList) {
        this.f118453F = s5lVar;
        this.f118458K = immutableList;
    }

    /* JADX INFO: renamed from: o */
    public void m143536o() {
        this.f118459L = true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m143537q() {
        return this.f118460M;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: r */
    public final void m143538r() throws IOException {
        m143533k(this.f144934i, this.f144927b, this.f118448A, true);
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: s */
    public final void m143539s() throws IOException {
        if (this.f118455H) {
            w11.m204369e(this.f118466p);
            w11.m204369e(this.f118467q);
            m143533k(this.f118466p, this.f118467q, this.f118449B, false);
            this.f118454G = 0;
            this.f118455H = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m143540t(asf asfVar) throws Throwable {
        asfVar.mo99902h();
        try {
            this.f118476z.m139804Q(10);
            asfVar.mo99900f(this.f118476z.m139815e(), 0, 10);
            if (this.f118476z.m139798K() != 4801587) {
                return -9223372036854775807L;
            }
            this.f118476z.m139809V(3);
            int iM139794G = this.f118476z.m139794G();
            int i = iM139794G + 10;
            if (i > this.f118476z.m139812b()) {
                byte[] bArrM139815e = this.f118476z.m139815e();
                this.f118476z.m139804Q(i);
                System.arraycopy(bArrM139815e, 0, this.f118476z.m139815e(), 0, 10);
            }
            asfVar.mo99900f(this.f118476z.m139815e(), 10, iM139794G);
            Metadata metadataM149237e = this.f118475y.m149237e(this.f118476z.m139815e(), iM139794G);
            if (metadataM149237e == null) {
                return -9223372036854775807L;
            }
            int iM10587e = metadataM149237e.m10587e();
            for (int i2 = 0; i2 < iM10587e; i2++) {
                Metadata.Entry entryM10586d = metadataM149237e.m10586d(i2);
                if (entryM10586d instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entryM10586d;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.f118476z.m139815e(), 0, 8);
                        this.f118476z.m139808U(0);
                        this.f118476z.m139807T(8);
                        return this.f118476z.m139788A() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: u */
    public final qod m143541u(g6c g6cVar, C2070a c2070a, boolean z) throws Throwable {
        k5l k5lVarMo126582a;
        long jMo11179n = g6cVar.mo11179n(c2070a);
        if (z) {
            try {
                this.f118471u.m133180i(this.f118469s, this.f144932g, this.f118451D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        qod qodVar = new qod(g6cVar, c2070a.f9535g, jMo11179n);
        if (this.f118452E == null) {
            long jM143540t = m143540t(qodVar);
            qodVar.mo99902h();
            k5l k5lVar = this.f118468r;
            if (k5lVar != null) {
                k5lVarMo126582a = k5lVar.mo130407f();
            } else {
                k5lVarMo126582a = this.f118472v.mo126582a(c2070a.f9529a, this.f144929d, this.f118473w, this.f118471u, g6cVar.mo11175a(), qodVar, this.f118450C);
                qodVar = qodVar;
            }
            this.f118452E = k5lVarMo126582a;
            boolean zMo130406e = k5lVarMo126582a.mo130406e();
            s5l s5lVar = this.f118453F;
            if (zMo130406e) {
                s5lVar.m184722m0(jM143540t != -9223372036854775807L ? this.f118471u.m133174b(jM143540t) : this.f144932g);
            } else {
                s5lVar.m184722m0(0L);
            }
            this.f118453F.m184707Y();
            this.f118452E.mo130403b(this.f118453F);
        }
        this.f118453F.m184718j0(this.f118474x);
        return qodVar;
    }

    /* JADX INFO: renamed from: v */
    public void m143542v() {
        this.f118460M = true;
    }
}
