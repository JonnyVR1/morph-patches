package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.playlist.C1963b;
import com.google.android.exoplayer2.upstream.C2047a;
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
public final class t2l extends fix {

    /* JADX INFO: renamed from: N */
    public static final AtomicInteger f167487N = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public final boolean f167488A;

    /* JADX INFO: renamed from: B */
    public final boolean f167489B;

    /* JADX INFO: renamed from: C */
    public final v680 f167490C;

    /* JADX INFO: renamed from: D */
    public final long f167491D;

    /* JADX INFO: renamed from: E */
    public u2l f167492E;

    /* JADX INFO: renamed from: F */
    public c3l f167493F;

    /* JADX INFO: renamed from: G */
    public int f167494G;

    /* JADX INFO: renamed from: H */
    public boolean f167495H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f167496I;

    /* JADX INFO: renamed from: J */
    public boolean f167497J;

    /* JADX INFO: renamed from: K */
    public ImmutableList<Integer> f167498K;

    /* JADX INFO: renamed from: L */
    public boolean f167499L;

    /* JADX INFO: renamed from: M */
    public boolean f167500M;

    /* JADX INFO: renamed from: k */
    public final int f167501k;

    /* JADX INFO: renamed from: l */
    public final int f167502l;

    /* JADX INFO: renamed from: m */
    public final Uri f167503m;

    /* JADX INFO: renamed from: n */
    public final boolean f167504n;

    /* JADX INFO: renamed from: o */
    public final int f167505o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final a5c f167506p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C2047a f167507q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final u2l f167508r;

    /* JADX INFO: renamed from: s */
    public final boolean f167509s;

    /* JADX INFO: renamed from: t */
    public final boolean f167510t;

    /* JADX INFO: renamed from: u */
    public final eri0 f167511u;

    /* JADX INFO: renamed from: v */
    public final r2l f167512v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public final List<C1871k> f167513w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final DrmInitData f167514x;

    /* JADX INFO: renamed from: y */
    public final uam f167515y;

    /* JADX INFO: renamed from: z */
    public final d860 f167516z;

    public t2l(r2l r2lVar, a5c a5cVar, C2047a c2047a, C1871k c1871k, boolean z, @Nullable a5c a5cVar2, @Nullable C2047a c2047a2, boolean z2, Uri uri, @Nullable List<C1871k> list, int i, @Nullable Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, eri0 eri0Var, long j4, @Nullable DrmInitData drmInitData, @Nullable u2l u2lVar, uam uamVar, d860 d860Var, boolean z6, v680 v680Var) {
        super(a5cVar, c2047a, c1871k, i, obj, j, j2, j3);
        this.f167488A = z;
        this.f167505o = i2;
        this.f167500M = z3;
        this.f167502l = i3;
        this.f167507q = c2047a2;
        this.f167506p = a5cVar2;
        this.f167495H = c2047a2 != null;
        this.f167489B = z2;
        this.f167503m = uri;
        this.f167509s = z5;
        this.f167511u = eri0Var;
        this.f167491D = j4;
        this.f167510t = z4;
        this.f167512v = r2lVar;
        this.f167513w = list;
        this.f167514x = drmInitData;
        this.f167508r = u2lVar;
        this.f167515y = uamVar;
        this.f167516z = d860Var;
        this.f167504n = z6;
        this.f167490C = v680Var;
        this.f167498K = ImmutableList.m15685of();
        this.f167501k = f167487N.getAndIncrement();
    }

    /* JADX INFO: renamed from: i */
    public static a5c m186997i(a5c a5cVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return a5cVar;
        }
        p11.m167011e(bArr2);
        return new lb0(a5cVar, bArr, bArr2);
    }

    /* JADX INFO: renamed from: j */
    public static t2l m186998j(r2l r2lVar, a5c a5cVar, C1871k c1871k, long j, C1963b c1963b, p2l.C19121e c19121e, Uri uri, @Nullable List<C1871k> list, int i, @Nullable Object obj, boolean z, fri0 fri0Var, long j2, @Nullable t2l t2lVar, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z2, v680 v680Var, @Nullable ab5 ab5Var) {
        boolean z3;
        C2047a c2047aM12108a;
        a5c a5cVarM186997i;
        boolean z4;
        Uri uri2;
        uam uamVar;
        d860 d860Var;
        u2l u2lVar;
        C1963b.e eVar = c19121e.f146897a;
        C2047a c2047aM12108a2 = new C2047a.b().m12116i(evj0.m118284e(c1963b.f184248a, eVar.f8610a)).m12115h(eVar.f8618i).m12114g(eVar.f8619j).m12109b(c19121e.f146900d ? 8 : 0).m12112e(ImmutableMap.m15715of()).m12108a();
        boolean z5 = bArr != null;
        a5c a5cVarM186997i2 = m186997i(a5cVar, bArr, z5 ? m186999l((String) p11.m167011e(eVar.f8617h)) : null);
        C1963b.d dVar = eVar.f8611b;
        if (dVar != null) {
            boolean z6 = bArr2 != null;
            byte[] bArrM186999l = z6 ? m186999l((String) p11.m167011e(dVar.f8617h)) : null;
            z3 = true;
            c2047aM12108a = new C2047a.b().m12116i(evj0.m118284e(c1963b.f184248a, dVar.f8610a)).m12115h(dVar.f8618i).m12114g(dVar.f8619j).m12112e(ImmutableMap.m15715of()).m12108a();
            z4 = z6;
            a5cVarM186997i = m186997i(a5cVar, bArr2, bArrM186999l);
        } else {
            z3 = true;
            c2047aM12108a = null;
            a5cVarM186997i = null;
            z4 = false;
        }
        long j3 = j + eVar.f8614e;
        long j4 = j3 + eVar.f8612c;
        int i2 = c1963b.f8590j + eVar.f8613d;
        if (t2lVar != null) {
            C2047a c2047a = t2lVar.f167507q;
            boolean z7 = (c2047aM12108a == c2047a || (c2047aM12108a != null && c2047a != null && c2047aM12108a.f9492a.equals(c2047a.f9492a) && c2047aM12108a.f9498g == t2lVar.f167507q.f9498g)) ? z3 : false;
            uri2 = uri;
            boolean z8 = (uri2.equals(t2lVar.f167503m) && t2lVar.f167497J) ? z3 : false;
            uamVar = t2lVar.f167515y;
            d860Var = t2lVar.f167516z;
            u2lVar = (z7 && z8 && !t2lVar.f167499L && t2lVar.f167502l == i2) ? t2lVar.f167492E : null;
        } else {
            uri2 = uri;
            uamVar = new uam();
            d860Var = new d860(10);
            u2lVar = null;
        }
        return new t2l(r2lVar, a5cVarM186997i2, c2047aM12108a2, c1871k, z5, a5cVarM186997i, c2047aM12108a, z4, uri2, list, i, obj, j3, j4, c19121e.f146898b, c19121e.f146899c, !c19121e.f146900d, i2, eVar.f8620k, z, fri0Var.m122874a(i2), j2, eVar.f8615f, u2lVar, uamVar, d860Var, z2, v680Var);
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m186999l(String str) {
        if (b11.m99804e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m187000p(p2l.C19121e c19121e, C1963b c1963b) {
        C1963b.e eVar = c19121e.f146897a;
        if (!(eVar instanceof C1963b.b)) {
            return c1963b.f184250c;
        }
        if (((C1963b.b) eVar).f8603l) {
            return true;
        }
        return c19121e.f146899c == 0 && c1963b.f184250c;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m187001w(@Nullable t2l t2lVar, Uri uri, C1963b c1963b, p2l.C19121e c19121e, long j) {
        if (t2lVar == null) {
            return false;
        }
        if (uri.equals(t2lVar.f167503m) && t2lVar.f167497J) {
            return false;
        }
        return !m187000p(c19121e, c1963b) || j + c19121e.f146897a.f8614e < t2lVar.f136918h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public void mo11377a() throws IOException {
        u2l u2lVar;
        p11.m167011e(this.f167493F);
        if (this.f167492E == null && (u2lVar = this.f167508r) != null && u2lVar.mo184317d()) {
            this.f167492E = this.f167508r;
            this.f167495H = false;
        }
        m187008s();
        if (this.f167496I) {
            return;
        }
        if (!this.f167510t) {
            m187007r();
        }
        this.f167497J = !this.f167496I;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public void mo11378c() {
        this.f167496I = true;
    }

    @Override // p149l.fix
    /* JADX INFO: renamed from: h */
    public boolean mo111872h() {
        return this.f167497J;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: k */
    public final void m187002k(a5c a5cVar, C2047a c2047a, boolean z, boolean z2) throws IOException {
        C2047a c2047aM12106e;
        long position;
        int i = this.f167494G;
        boolean z3 = false;
        if (z) {
            z3 = i != 0;
            c2047aM12106e = c2047a;
        } else {
            c2047aM12106e = c2047a.m12106e(i);
        }
        try {
            lnd lndVarM187010u = m187010u(a5cVar, c2047aM12106e, z2);
            if (z3) {
                lndVarM187010u.mo150661o(this.f167494G);
            }
            do {
                try {
                    try {
                        if (this.f167496I) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.f136914d.f7741e & 16384) == 0) {
                            throw e;
                        }
                        this.f167492E.mo184316c();
                        position = lndVarM187010u.getPosition();
                    }
                } catch (Throwable th) {
                    this.f167494G = (int) (lndVarM187010u.getPosition() - c2047a.f9498g);
                    throw th;
                }
            } while (this.f167492E.mo184314a(lndVarM187010u));
            position = lndVarM187010u.getPosition();
            this.f167494G = (int) (position - c2047a.f9498g);
            g5c.m124484a(a5cVar);
        } catch (Throwable th2) {
            g5c.m124484a(a5cVar);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m187003m(int i) {
        p11.m167013g(!this.f167504n);
        if (i >= this.f167498K.size()) {
            return 0;
        }
        return this.f167498K.get(i).intValue();
    }

    /* JADX INFO: renamed from: n */
    public void m187004n(c3l c3lVar, ImmutableList<Integer> immutableList) {
        this.f167493F = c3lVar;
        this.f167498K = immutableList;
    }

    /* JADX INFO: renamed from: o */
    public void m187005o() {
        this.f167499L = true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m187006q() {
        return this.f167500M;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: r */
    public final void m187007r() throws IOException {
        m187002k(this.f136919i, this.f136912b, this.f167488A, true);
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: s */
    public final void m187008s() throws IOException {
        if (this.f167495H) {
            p11.m167011e(this.f167506p);
            p11.m167011e(this.f167507q);
            m187002k(this.f167506p, this.f167507q, this.f167489B, false);
            this.f167494G = 0;
            this.f167495H = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m187009t(tqf tqfVar) throws Throwable {
        tqfVar.mo150657h();
        try {
            this.f167516z.m110288Q(10);
            tqfVar.mo150655f(this.f167516z.m110299e(), 0, 10);
            if (this.f167516z.m110282K() != 4801587) {
                return -9223372036854775807L;
            }
            this.f167516z.m110293V(3);
            int iM110278G = this.f167516z.m110278G();
            int i = iM110278G + 10;
            if (i > this.f167516z.m110296b()) {
                byte[] bArrM110299e = this.f167516z.m110299e();
                this.f167516z.m110288Q(i);
                System.arraycopy(bArrM110299e, 0, this.f167516z.m110299e(), 0, 10);
            }
            tqfVar.mo150655f(this.f167516z.m110299e(), 10, iM110278G);
            Metadata metadataM192787e = this.f167515y.m192787e(this.f167516z.m110299e(), iM110278G);
            if (metadataM192787e == null) {
                return -9223372036854775807L;
            }
            int iM10533e = metadataM192787e.m10533e();
            for (int i2 = 0; i2 < iM10533e; i2++) {
                Metadata.Entry entryM10532d = metadataM192787e.m10532d(i2);
                if (entryM10532d instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entryM10532d;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.f167516z.m110299e(), 0, 8);
                        this.f167516z.m110292U(0);
                        this.f167516z.m110291T(8);
                        return this.f167516z.m110272A() & 8589934591L;
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
    public final lnd m187010u(a5c a5cVar, C2047a c2047a, boolean z) throws Throwable {
        u2l u2lVarMo97889a;
        long jMo11125n = a5cVar.mo11125n(c2047a);
        if (z) {
            try {
                this.f167511u.m117843i(this.f167509s, this.f136917g, this.f167491D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        lnd lndVar = new lnd(a5cVar, c2047a.f9498g, jMo11125n);
        if (this.f167492E == null) {
            long jM187009t = m187009t(lndVar);
            lndVar.mo150657h();
            u2l u2lVar = this.f167508r;
            if (u2lVar != null) {
                u2lVarMo97889a = u2lVar.mo184319f();
            } else {
                u2lVarMo97889a = this.f167512v.mo97889a(c2047a.f9492a, this.f136914d, this.f167513w, this.f167511u, a5cVar.mo11122b(), lndVar, this.f167490C);
                lndVar = lndVar;
            }
            this.f167492E = u2lVarMo97889a;
            boolean zMo184318e = u2lVarMo97889a.mo184318e();
            c3l c3lVar = this.f167493F;
            if (zMo184318e) {
                c3lVar.m105074m0(jM187009t != -9223372036854775807L ? this.f167511u.m117837b(jM187009t) : this.f136917g);
            } else {
                c3lVar.m105074m0(0L);
            }
            this.f167493F.m105059Y();
            this.f167492E.mo184315b(this.f167493F);
        }
        this.f167493F.m105070j0(this.f167514x);
        return lndVar;
    }

    /* JADX INFO: renamed from: v */
    public void m187011v() {
        this.f167500M = true;
    }
}
