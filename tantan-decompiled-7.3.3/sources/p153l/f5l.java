package p153l;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache;
import com.google.android.exoplayer2.source.hls.playlist.C1986b;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class f5l {

    /* JADX INFO: renamed from: a */
    public final h5l f97236a;

    /* JADX INFO: renamed from: b */
    public final g6c f97237b;

    /* JADX INFO: renamed from: c */
    public final g6c f97238c;

    /* JADX INFO: renamed from: d */
    public final i0j0 f97239d;

    /* JADX INFO: renamed from: e */
    public final Uri[] f97240e;

    /* JADX INFO: renamed from: f */
    public final C1894k[] f97241f;

    /* JADX INFO: renamed from: g */
    public final HlsPlaylistTracker f97242g;

    /* JADX INFO: renamed from: h */
    public final dfj0 f97243h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final List<C1894k> f97244i;

    /* JADX INFO: renamed from: k */
    public final bf80 f97246k;

    /* JADX INFO: renamed from: l */
    public final long f97247l;

    /* JADX INFO: renamed from: m */
    public boolean f97248m;

    /* JADX INFO: renamed from: o */
    @Nullable
    public IOException f97250o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Uri f97251p;

    /* JADX INFO: renamed from: q */
    public boolean f97252q;

    /* JADX INFO: renamed from: r */
    public u9f f97253r;

    /* JADX INFO: renamed from: t */
    public boolean f97255t;

    /* JADX INFO: renamed from: j */
    public final FullSegmentEncryptionKeyCache f97245j = new FullSegmentEncryptionKeyCache(4);

    /* JADX INFO: renamed from: n */
    public byte[] f97249n = bmk0.f77318f;

    /* JADX INFO: renamed from: s */
    public long f97254s = -9223372036854775807L;

    /* JADX INFO: renamed from: l.f5l$a */
    public static final class C16901a extends r5c {

        /* JADX INFO: renamed from: l */
        public byte[] f97256l;

        public C16901a(g6c g6cVar, C2070a c2070a, C1894k c1894k, int i, @Nullable Object obj, byte[] bArr) {
            super(g6cVar, c2070a, 3, c1894k, i, obj, bArr);
        }

        @Override // p153l.r5c
        /* JADX INFO: renamed from: g */
        public void mo124155g(byte[] bArr, int i) {
            this.f97256l = Arrays.copyOf(bArr, i);
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public byte[] m124156j() {
            return this.f97256l;
        }
    }

    /* JADX INFO: renamed from: l.f5l$b */
    public static final class C16902b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public o45 f97257a;

        /* JADX INFO: renamed from: b */
        public boolean f97258b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Uri f97259c;

        public C16902b() {
            m124157a();
        }

        /* JADX INFO: renamed from: a */
        public void m124157a() {
            this.f97257a = null;
            this.f97258b = false;
            this.f97259c = null;
        }
    }

    /* JADX INFO: renamed from: l.f5l$c */
    @VisibleForTesting
    public static final class C16903c extends dq2 {

        /* JADX INFO: renamed from: e */
        public final List<C1986b.e> f97260e;

        /* JADX INFO: renamed from: f */
        public final long f97261f;

        /* JADX INFO: renamed from: g */
        public final String f97262g;

        public C16903c(String str, long j, List<C1986b.e> list) {
            super(0L, list.size() - 1);
            this.f97262g = str;
            this.f97261f = j;
            this.f97260e = list;
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: a */
        public long mo11144a() {
            m117440c();
            C1986b.e eVar = this.f97260e.get((int) m117441d());
            return this.f97261f + eVar.f8651e + eVar.f8649c;
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: b */
        public long mo11145b() {
            m117440c();
            return this.f97261f + this.f97260e.get((int) m117441d()).f8651e;
        }
    }

    /* JADX INFO: renamed from: l.f5l$d */
    public static final class C16904d extends es2 {

        /* JADX INFO: renamed from: h */
        public int f97263h;

        public C16904d(dfj0 dfj0Var, int[] iArr) {
            super(dfj0Var, iArr);
            this.f97263h = mo11371r(dfj0Var.m115519c(iArr[0]));
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: b */
        public int mo11355b() {
            return this.f97263h;
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: g */
        public void mo11360g(long j, long j2, long j3, List<? extends crx> list, drx[] drxVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (mo11354a(this.f97263h, jElapsedRealtime)) {
                for (int i = this.f95556b - 1; i >= 0; i--) {
                    if (!mo11354a(i, jElapsedRealtime)) {
                        this.f97263h = i;
                        return;
                    }
                }
                wpg0.m207458a();
            }
        }

        @Override // p153l.u9f
        @Nullable
        /* JADX INFO: renamed from: o */
        public Object mo11368o() {
            return null;
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: s */
        public int mo11372s() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l.f5l$e */
    public static final class C16905e {

        /* JADX INFO: renamed from: a */
        public final C1986b.e f97264a;

        /* JADX INFO: renamed from: b */
        public final long f97265b;

        /* JADX INFO: renamed from: c */
        public final int f97266c;

        /* JADX INFO: renamed from: d */
        public final boolean f97267d;

        public C16905e(C1986b.e eVar, long j, int i) {
            this.f97264a = eVar;
            this.f97265b = j;
            this.f97266c = i;
            this.f97267d = (eVar instanceof C1986b.b) && ((C1986b.b) eVar).f8641m;
        }
    }

    public f5l(h5l h5lVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, C1894k[] c1894kArr, g5l g5lVar, @Nullable pgj0 pgj0Var, i0j0 i0j0Var, long j, @Nullable List<C1894k> list, bf80 bf80Var, @Nullable zb5 zb5Var) {
        this.f97236a = h5lVar;
        this.f97242g = hlsPlaylistTracker;
        this.f97240e = uriArr;
        this.f97241f = c1894kArr;
        this.f97239d = i0j0Var;
        this.f97247l = j;
        this.f97244i = list;
        this.f97246k = bf80Var;
        g6c g6cVarMo121849a = g5lVar.mo121849a(1);
        this.f97237b = g6cVarMo121849a;
        if (pgj0Var != null) {
            g6cVarMo121849a.mo11177e(pgj0Var);
        }
        this.f97238c = g5lVar.mo121849a(3);
        this.f97243h = new dfj0(c1894kArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c1894kArr[i].f7778e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f97253r = new C16904d(this.f97243h, Ints.m16524n(arrayList));
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Uri m124132d(C1986b c1986b, @Nullable C1986b.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f8653g) == null) {
            return null;
        }
        return h4k0.m133582e(c1986b.f134910a, str);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static C16905e m124133g(C1986b c1986b, long j, int i) {
        int i2 = (int) (j - c1986b.f8628k);
        if (i2 == c1986b.f8635r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < c1986b.f8636s.size()) {
                return new C16905e(c1986b.f8636s.get(i), j, i);
            }
            return null;
        }
        C1986b.d dVar = c1986b.f8635r.get(i2);
        if (i == -1) {
            return new C16905e(dVar, j, -1);
        }
        if (i < dVar.f8646m.size()) {
            return new C16905e(dVar.f8646m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < c1986b.f8635r.size()) {
            return new C16905e(c1986b.f8635r.get(i3), j + 1, -1);
        }
        if (c1986b.f8636s.isEmpty()) {
            return null;
        }
        return new C16905e(c1986b.f8636s.get(0), j + 1, 0);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public static List<C1986b.e> m124134i(C1986b c1986b, long j, int i) {
        int i2 = (int) (j - c1986b.f8628k);
        if (i2 < 0 || c1986b.f8635r.size() < i2) {
            return ImmutableList.m15739of();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < c1986b.f8635r.size()) {
            if (i != -1) {
                C1986b.d dVar = c1986b.f8635r.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.f8646m.size()) {
                    List<C1986b.b> list = dVar.f8646m;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<C1986b.d> list2 = c1986b.f8635r;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (c1986b.f8631n != -9223372036854775807L) {
            int i3 = i != -1 ? i : 0;
            if (i3 < c1986b.f8636s.size()) {
                List<C1986b.b> list3 = c1986b.f8636s;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public drx[] m124135a(@Nullable j5l j5lVar, long j) {
        int iM115520d = j5lVar == null ? -1 : this.f97243h.m115520d(j5lVar.f144929d);
        int length = this.f97253r.length();
        drx[] drxVarArr = new drx[length];
        for (int i = 0; i < length; i++) {
            int iMo11356c = this.f97253r.mo11356c(i);
            Uri uri = this.f97240e[iMo11356c];
            if (this.f97242g.mo11250h(uri)) {
                C1986b c1986bMo11254l = this.f97242g.mo11254l(uri, false);
                w11.m204369e(c1986bMo11254l);
                long jMo11244b = c1986bMo11254l.f8625h - this.f97242g.mo11244b();
                Pair<Long, Integer> pairM124139f = m124139f(j5lVar, iMo11356c != iM115520d, c1986bMo11254l, jMo11244b, j);
                drxVarArr[i] = new C16903c(c1986bMo11254l.f134910a, jMo11244b, m124134i(c1986bMo11254l, ((Long) pairM124139f.first).longValue(), ((Integer) pairM124139f.second).intValue()));
            } else {
                drxVarArr[i] = drx.f90441a;
            }
        }
        return drxVarArr;
    }

    /* JADX INFO: renamed from: b */
    public long m124136b(long j, nke0 nke0Var) {
        int iMo11355b = this.f97253r.mo11355b();
        Uri[] uriArr = this.f97240e;
        C1986b c1986bMo11254l = (iMo11355b >= uriArr.length || iMo11355b == -1) ? null : this.f97242g.mo11254l(uriArr[this.f97253r.mo11363j()], true);
        if (c1986bMo11254l == null || c1986bMo11254l.f8635r.isEmpty() || !c1986bMo11254l.f134912c) {
            return j;
        }
        long jMo11244b = c1986bMo11254l.f8625h - this.f97242g.mo11244b();
        long j2 = j - jMo11244b;
        int iM105132f = bmk0.m105132f(c1986bMo11254l.f8635r, Long.valueOf(j2), true, true);
        long j3 = c1986bMo11254l.f8635r.get(iM105132f).f8651e;
        return nke0Var.m163601a(j2, j3, iM105132f != c1986bMo11254l.f8635r.size() - 1 ? c1986bMo11254l.f8635r.get(iM105132f + 1).f8651e : j3) + jMo11244b;
    }

    /* JADX INFO: renamed from: c */
    public int m124137c(j5l j5lVar) {
        if (j5lVar.f118465o == -1) {
            return 1;
        }
        C1986b c1986b = (C1986b) w11.m204369e(this.f97242g.mo11254l(this.f97240e[this.f97243h.m115520d(j5lVar.f144929d)], false));
        int i = (int) (j5lVar.f83373j - c1986b.f8628k);
        if (i < 0) {
            return 1;
        }
        List<C1986b.b> list = i < c1986b.f8635r.size() ? c1986b.f8635r.get(i).f8646m : c1986b.f8636s;
        if (j5lVar.f118465o >= list.size()) {
            return 2;
        }
        C1986b.b bVar = list.get(j5lVar.f118465o);
        if (bVar.f8641m) {
            return 0;
        }
        return bmk0.m105123c(Uri.parse(h4k0.m133581d(c1986b.f134910a, bVar.f8647a)), j5lVar.f144927b.f9529a) ? 1 : 2;
    }

    /* JADX INFO: renamed from: e */
    public void m124138e(long j, long j2, List<j5l> list, boolean z, C16902b c16902b) {
        int i;
        j5l j5lVar = list.isEmpty() ? null : (j5l) akq.m98599g(list);
        int iM115520d = j5lVar == null ? -1 : this.f97243h.m115520d(j5lVar.f144929d);
        long jMax = j2 - j;
        long jM124150s = m124150s(j);
        if (j5lVar != null && !this.f97252q) {
            long jM165970d = j5lVar.m165970d();
            jMax = Math.max(0L, jMax - jM165970d);
            if (jM124150s != -9223372036854775807L) {
                jM124150s = Math.max(0L, jM124150s - jM165970d);
            }
        }
        this.f97253r.mo11360g(j, jMax, jM124150s, list, m124135a(j5lVar, j2));
        int iMo11363j = this.f97253r.mo11363j();
        boolean z2 = iM115520d != iMo11363j;
        Uri uri = this.f97240e[iMo11363j];
        if (!this.f97242g.mo11250h(uri)) {
            c16902b.f97259c = uri;
            this.f97255t &= uri.equals(this.f97251p);
            this.f97251p = uri;
            return;
        }
        C1986b c1986bMo11254l = this.f97242g.mo11254l(uri, true);
        w11.m204369e(c1986bMo11254l);
        this.f97252q = c1986bMo11254l.f134912c;
        m124154w(c1986bMo11254l);
        long jMo11244b = c1986bMo11254l.f8625h - this.f97242g.mo11244b();
        Pair<Long, Integer> pairM124139f = m124139f(j5lVar, z2, c1986bMo11254l, jMo11244b, j2);
        long jLongValue = ((Long) pairM124139f.first).longValue();
        int iIntValue = ((Integer) pairM124139f.second).intValue();
        int i2 = iM115520d;
        if (jLongValue >= c1986bMo11254l.f8628k || j5lVar == null || !z2) {
            i = iMo11363j;
        } else {
            uri = this.f97240e[i2];
            c1986bMo11254l = this.f97242g.mo11254l(uri, true);
            w11.m204369e(c1986bMo11254l);
            jMo11244b = c1986bMo11254l.f8625h - this.f97242g.mo11244b();
            Pair<Long, Integer> pairM124139f2 = m124139f(j5lVar, false, c1986bMo11254l, jMo11244b, j2);
            jLongValue = ((Long) pairM124139f2.first).longValue();
            iIntValue = ((Integer) pairM124139f2.second).intValue();
            i = i2;
        }
        Uri uri2 = uri;
        C1986b c1986b = c1986bMo11254l;
        if (jLongValue < c1986b.f8628k) {
            this.f97250o = new BehindLiveWindowException();
            return;
        }
        C16905e c16905eM124133g = m124133g(c1986b, jLongValue, iIntValue);
        if (c16905eM124133g == null) {
            if (!c1986b.f8632o) {
                c16902b.f97259c = uri2;
                this.f97255t &= uri2.equals(this.f97251p);
                this.f97251p = uri2;
                return;
            } else {
                if (z || c1986b.f8635r.isEmpty()) {
                    c16902b.f97258b = true;
                    return;
                }
                c16905eM124133g = new C16905e((C1986b.e) akq.m98599g(c1986b.f8635r), (c1986b.f8628k + ((long) c1986b.f8635r.size())) - 1, -1);
            }
        }
        this.f97255t = false;
        this.f97251p = null;
        Uri uriM124132d = m124132d(c1986b, c16905eM124133g.f97264a.f8648b);
        o45 o45VarM124143l = m124143l(uriM124132d, i, true, null);
        c16902b.f97257a = o45VarM124143l;
        if (o45VarM124143l != null) {
            return;
        }
        Uri uriM124132d2 = m124132d(c1986b, c16905eM124133g.f97264a);
        o45 o45VarM124143l2 = m124143l(uriM124132d2, i, false, null);
        c16902b.f97257a = o45VarM124143l2;
        if (o45VarM124143l2 != null) {
            return;
        }
        long j3 = jMo11244b;
        boolean zM143532w = j5l.m143532w(j5lVar, uri2, c1986b, c16905eM124133g, j3);
        if (zM143532w && c16905eM124133g.f97267d) {
            return;
        }
        c16902b.f97257a = j5l.m143529j(this.f97236a, this.f97237b, this.f97241f[i], j3, c1986b, c16905eM124133g, uri2, this.f97244i, this.f97253r.mo11372s(), this.f97253r.mo11368o(), this.f97248m, this.f97239d, this.f97247l, j5lVar, this.f97245j.m11202a(uriM124132d2), this.f97245j.m11202a(uriM124132d), zM143532w, this.f97246k, null);
    }

    /* JADX INFO: renamed from: f */
    public final Pair<Long, Integer> m124139f(@Nullable j5l j5lVar, boolean z, C1986b c1986b, long j, long j2) {
        int i = -1;
        if (j5lVar != null && !z) {
            if (!j5lVar.mo112090h()) {
                return new Pair<>(Long.valueOf(j5lVar.f83373j), Integer.valueOf(j5lVar.f118465o));
            }
            Long lValueOf = Long.valueOf(j5lVar.f118465o == -1 ? j5lVar.mo112089g() : j5lVar.f83373j);
            int i2 = j5lVar.f118465o;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j3 = c1986b.f8638u + j;
        if (j5lVar != null && !this.f97252q) {
            j2 = j5lVar.f144932g;
        }
        if (!c1986b.f8632o && j2 >= j3) {
            return new Pair<>(Long.valueOf(c1986b.f8628k + ((long) c1986b.f8635r.size())), -1);
        }
        long j4 = j2 - j;
        int iM105132f = bmk0.m105132f(c1986b.f8635r, Long.valueOf(j4), true, !this.f97242g.mo11251i() || j5lVar == null);
        long j5 = ((long) iM105132f) + c1986b.f8628k;
        if (iM105132f >= 0) {
            C1986b.d dVar = c1986b.f8635r.get(iM105132f);
            List<C1986b.b> list = j4 < dVar.f8651e + dVar.f8649c ? dVar.f8646m : c1986b.f8636s;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C1986b.b bVar = list.get(i3);
                if (j4 < bVar.f8651e + bVar.f8649c) {
                    if (!bVar.f8640l) {
                        break;
                    }
                    j5 += list == c1986b.f8636s ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j5), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public int m124140h(long j, List<? extends crx> list) {
        return (this.f97250o != null || this.f97253r.length() < 2) ? list.size() : this.f97253r.mo11362i(j, list);
    }

    /* JADX INFO: renamed from: j */
    public dfj0 m124141j() {
        return this.f97243h;
    }

    /* JADX INFO: renamed from: k */
    public u9f m124142k() {
        return this.f97253r;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final o45 m124143l(@Nullable Uri uri, int i, boolean z, @Nullable ac5 ac5Var) {
        if (uri == null) {
            return null;
        }
        byte[] bArrM11204c = this.f97245j.m11204c(uri);
        if (bArrM11204c != null) {
            this.f97245j.m11203b(uri, bArrM11204c);
            return null;
        }
        return new C16901a(this.f97238c, new C2070a.b().m12170i(uri).m12163b(1).m12166e(ImmutableMap.m15769of()).m12162a(), this.f97241f[i], this.f97253r.mo11372s(), this.f97253r.mo11368o(), this.f97249n);
    }

    /* JADX INFO: renamed from: m */
    public boolean m124144m(o45 o45Var, long j) {
        u9f u9fVar = this.f97253r;
        return u9fVar.mo11357d(u9fVar.mo11359f(this.f97243h.m115520d(o45Var.f144929d)), j);
    }

    /* JADX INFO: renamed from: n */
    public void m124145n() throws IOException {
        IOException iOException = this.f97250o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f97251p;
        if (uri == null || !this.f97255t) {
            return;
        }
        this.f97242g.mo11246d(uri);
    }

    /* JADX INFO: renamed from: o */
    public boolean m124146o(Uri uri) {
        return bmk0.m105166s(this.f97240e, uri);
    }

    /* JADX INFO: renamed from: p */
    public void m124147p(o45 o45Var) {
        if (o45Var instanceof C16901a) {
            C16901a c16901a = (C16901a) o45Var;
            this.f97249n = c16901a.m179850h();
            this.f97245j.m11203b(c16901a.f144927b.f9529a, (byte[]) w11.m204369e(c16901a.m124156j()));
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m124148q(Uri uri, long j) {
        int iMo11359f;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f97240e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iMo11359f = this.f97253r.mo11359f(i)) == -1) {
            return true;
        }
        this.f97255t |= uri.equals(this.f97251p);
        return j == -9223372036854775807L || (this.f97253r.mo11357d(iMo11359f, j) && this.f97242g.mo11252j(uri, j));
    }

    /* JADX INFO: renamed from: r */
    public void m124149r() {
        this.f97250o = null;
    }

    /* JADX INFO: renamed from: s */
    public final long m124150s(long j) {
        long j2 = this.f97254s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: t */
    public void m124151t(boolean z) {
        this.f97248m = z;
    }

    /* JADX INFO: renamed from: u */
    public void m124152u(u9f u9fVar) {
        this.f97253r = u9fVar;
    }

    /* JADX INFO: renamed from: v */
    public boolean m124153v(long j, o45 o45Var, List<? extends crx> list) {
        if (this.f97250o != null) {
            return false;
        }
        return this.f97253r.mo11369p(j, o45Var, list);
    }

    /* JADX INFO: renamed from: w */
    public final void m124154w(C1986b c1986b) {
        this.f97254s = c1986b.f8632o ? -9223372036854775807L : c1986b.m11311e() - this.f97242g.mo11244b();
    }
}
