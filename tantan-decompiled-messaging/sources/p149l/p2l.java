package p149l;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache;
import com.google.android.exoplayer2.source.hls.playlist.C1963b;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2047a;
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
public class p2l {

    /* JADX INFO: renamed from: a */
    public final r2l f146869a;

    /* JADX INFO: renamed from: b */
    public final a5c f146870b;

    /* JADX INFO: renamed from: c */
    public final a5c f146871c;

    /* JADX INFO: renamed from: d */
    public final fri0 f146872d;

    /* JADX INFO: renamed from: e */
    public final Uri[] f146873e;

    /* JADX INFO: renamed from: f */
    public final C1871k[] f146874f;

    /* JADX INFO: renamed from: g */
    public final HlsPlaylistTracker f146875g;

    /* JADX INFO: renamed from: h */
    public final z5j0 f146876h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final List<C1871k> f146877i;

    /* JADX INFO: renamed from: k */
    public final v680 f146879k;

    /* JADX INFO: renamed from: l */
    public final long f146880l;

    /* JADX INFO: renamed from: m */
    public boolean f146881m;

    /* JADX INFO: renamed from: o */
    @Nullable
    public IOException f146883o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Uri f146884p;

    /* JADX INFO: renamed from: q */
    public boolean f146885q;

    /* JADX INFO: renamed from: r */
    public o8f f146886r;

    /* JADX INFO: renamed from: t */
    public boolean f146888t;

    /* JADX INFO: renamed from: j */
    public final FullSegmentEncryptionKeyCache f146878j = new FullSegmentEncryptionKeyCache(4);

    /* JADX INFO: renamed from: n */
    public byte[] f146882n = vck0.f180953f;

    /* JADX INFO: renamed from: s */
    public long f146887s = -9223372036854775807L;

    /* JADX INFO: renamed from: l.p2l$a */
    public static final class C19117a extends j4c {

        /* JADX INFO: renamed from: l */
        public byte[] f146889l;

        public C19117a(a5c a5cVar, C2047a c2047a, C1871k c1871k, int i, @Nullable Object obj, byte[] bArr) {
            super(a5cVar, c2047a, 3, c1871k, i, obj, bArr);
        }

        @Override // p149l.j4c
        /* JADX INFO: renamed from: g */
        public void mo139640g(byte[] bArr, int i) {
            this.f146889l = Arrays.copyOf(bArr, i);
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public byte[] m167205j() {
            return this.f146889l;
        }
    }

    /* JADX INFO: renamed from: l.p2l$b */
    public static final class C19118b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public n35 f146890a;

        /* JADX INFO: renamed from: b */
        public boolean f146891b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Uri f146892c;

        public C19118b() {
            m167206a();
        }

        /* JADX INFO: renamed from: a */
        public void m167206a() {
            this.f146890a = null;
            this.f146891b = false;
            this.f146892c = null;
        }
    }

    /* JADX INFO: renamed from: l.p2l$c */
    @VisibleForTesting
    public static final class C19119c extends mp2 {

        /* JADX INFO: renamed from: e */
        public final List<C1963b.e> f146893e;

        /* JADX INFO: renamed from: f */
        public final long f146894f;

        /* JADX INFO: renamed from: g */
        public final String f146895g;

        public C19119c(String str, long j, List<C1963b.e> list) {
            super(0L, list.size() - 1);
            this.f146895g = str;
            this.f146894f = j;
            this.f146893e = list;
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: a */
        public long mo11090a() {
            m155761c();
            C1963b.e eVar = this.f146893e.get((int) m155762d());
            return this.f146894f + eVar.f8614e + eVar.f8612c;
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: b */
        public long mo11091b() {
            m155761c();
            return this.f146894f + this.f146893e.get((int) m155762d()).f8614e;
        }
    }

    /* JADX INFO: renamed from: l.p2l$d */
    public static final class C19120d extends or2 {

        /* JADX INFO: renamed from: h */
        public int f146896h;

        public C19120d(z5j0 z5j0Var, int[] iArr) {
            super(z5j0Var, iArr);
            this.f146896h = mo11317r(z5j0Var.m217358c(iArr[0]));
        }

        @Override // p149l.o8f
        /* JADX INFO: renamed from: b */
        public int mo11301b() {
            return this.f146896h;
        }

        @Override // p149l.o8f
        /* JADX INFO: renamed from: g */
        public void mo11306g(long j, long j2, long j3, List<? extends fix> list, gix[] gixVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (mo11300a(this.f146896h, jElapsedRealtime)) {
                for (int i = this.f145214b - 1; i >= 0; i--) {
                    if (!mo11300a(i, jElapsedRealtime)) {
                        this.f146896h = i;
                        return;
                    }
                }
                ohg0.m164364a();
            }
        }

        @Override // p149l.o8f
        @Nullable
        /* JADX INFO: renamed from: o */
        public Object mo11314o() {
            return null;
        }

        @Override // p149l.o8f
        /* JADX INFO: renamed from: s */
        public int mo11318s() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l.p2l$e */
    public static final class C19121e {

        /* JADX INFO: renamed from: a */
        public final C1963b.e f146897a;

        /* JADX INFO: renamed from: b */
        public final long f146898b;

        /* JADX INFO: renamed from: c */
        public final int f146899c;

        /* JADX INFO: renamed from: d */
        public final boolean f146900d;

        public C19121e(C1963b.e eVar, long j, int i) {
            this.f146897a = eVar;
            this.f146898b = j;
            this.f146899c = i;
            this.f146900d = (eVar instanceof C1963b.b) && ((C1963b.b) eVar).f8604m;
        }
    }

    public p2l(r2l r2lVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, C1871k[] c1871kArr, q2l q2lVar, @Nullable l7j0 l7j0Var, fri0 fri0Var, long j, @Nullable List<C1871k> list, v680 v680Var, @Nullable za5 za5Var) {
        this.f146869a = r2lVar;
        this.f146875g = hlsPlaylistTracker;
        this.f146873e = uriArr;
        this.f146874f = c1871kArr;
        this.f146872d = fri0Var;
        this.f146880l = j;
        this.f146877i = list;
        this.f146879k = v680Var;
        a5c a5cVarMo172471a = q2lVar.mo172471a(1);
        this.f146870b = a5cVarMo172471a;
        if (l7j0Var != null) {
            a5cVarMo172471a.mo11123e(l7j0Var);
        }
        this.f146871c = q2lVar.mo172471a(3);
        this.f146876h = new z5j0(c1871kArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c1871kArr[i].f7741e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f146886r = new C19120d(this.f146876h, Ints.m16469n(arrayList));
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Uri m167182d(C1963b c1963b, @Nullable C1963b.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f8616g) == null) {
            return null;
        }
        return evj0.m118284e(c1963b.f184248a, str);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static C19121e m167183g(C1963b c1963b, long j, int i) {
        int i2 = (int) (j - c1963b.f8591k);
        if (i2 == c1963b.f8598r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < c1963b.f8599s.size()) {
                return new C19121e(c1963b.f8599s.get(i), j, i);
            }
            return null;
        }
        C1963b.d dVar = c1963b.f8598r.get(i2);
        if (i == -1) {
            return new C19121e(dVar, j, -1);
        }
        if (i < dVar.f8609m.size()) {
            return new C19121e(dVar.f8609m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < c1963b.f8598r.size()) {
            return new C19121e(c1963b.f8598r.get(i3), j + 1, -1);
        }
        if (c1963b.f8599s.isEmpty()) {
            return null;
        }
        return new C19121e(c1963b.f8599s.get(0), j + 1, 0);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public static List<C1963b.e> m167184i(C1963b c1963b, long j, int i) {
        int i2 = (int) (j - c1963b.f8591k);
        if (i2 < 0 || c1963b.f8598r.size() < i2) {
            return ImmutableList.m15685of();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < c1963b.f8598r.size()) {
            if (i != -1) {
                C1963b.d dVar = c1963b.f8598r.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.f8609m.size()) {
                    List<C1963b.b> list = dVar.f8609m;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<C1963b.d> list2 = c1963b.f8598r;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (c1963b.f8594n != -9223372036854775807L) {
            int i3 = i != -1 ? i : 0;
            if (i3 < c1963b.f8599s.size()) {
                List<C1963b.b> list3 = c1963b.f8599s;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public gix[] m167185a(@Nullable t2l t2lVar, long j) {
        int iM217359d = t2lVar == null ? -1 : this.f146876h.m217359d(t2lVar.f136914d);
        int length = this.f146886r.length();
        gix[] gixVarArr = new gix[length];
        for (int i = 0; i < length; i++) {
            int iMo11302c = this.f146886r.mo11302c(i);
            Uri uri = this.f146873e[iMo11302c];
            if (this.f146875g.mo11196h(uri)) {
                C1963b c1963bMo11200l = this.f146875g.mo11200l(uri, false);
                p11.m167011e(c1963bMo11200l);
                long jMo11190b = c1963bMo11200l.f8588h - this.f146875g.mo11190b();
                Pair<Long, Integer> pairM167189f = m167189f(t2lVar, iMo11302c != iM217359d, c1963bMo11200l, jMo11190b, j);
                gixVarArr[i] = new C19119c(c1963bMo11200l.f184248a, jMo11190b, m167184i(c1963bMo11200l, ((Long) pairM167189f.first).longValue(), ((Integer) pairM167189f.second).intValue()));
            } else {
                gixVarArr[i] = gix.f102980a;
            }
        }
        return gixVarArr;
    }

    /* JADX INFO: renamed from: b */
    public long m167186b(long j, ice0 ice0Var) {
        int iMo11301b = this.f146886r.mo11301b();
        Uri[] uriArr = this.f146873e;
        C1963b c1963bMo11200l = (iMo11301b >= uriArr.length || iMo11301b == -1) ? null : this.f146875g.mo11200l(uriArr[this.f146886r.mo11309j()], true);
        if (c1963bMo11200l == null || c1963bMo11200l.f8598r.isEmpty() || !c1963bMo11200l.f184250c) {
            return j;
        }
        long jMo11190b = c1963bMo11200l.f8588h - this.f146875g.mo11190b();
        long j2 = j - jMo11190b;
        int iM197854f = vck0.m197854f(c1963bMo11200l.f8598r, Long.valueOf(j2), true, true);
        long j3 = c1963bMo11200l.f8598r.get(iM197854f).f8614e;
        return ice0Var.m135351a(j2, j3, iM197854f != c1963bMo11200l.f8598r.size() - 1 ? c1963bMo11200l.f8598r.get(iM197854f + 1).f8614e : j3) + jMo11190b;
    }

    /* JADX INFO: renamed from: c */
    public int m167187c(t2l t2lVar) {
        if (t2lVar.f167505o == -1) {
            return 1;
        }
        C1963b c1963b = (C1963b) p11.m167011e(this.f146875g.mo11200l(this.f146873e[this.f146876h.m217359d(t2lVar.f136914d)], false));
        int i = (int) (t2lVar.f97730j - c1963b.f8591k);
        if (i < 0) {
            return 1;
        }
        List<C1963b.b> list = i < c1963b.f8598r.size() ? c1963b.f8598r.get(i).f8609m : c1963b.f8599s;
        if (t2lVar.f167505o >= list.size()) {
            return 2;
        }
        C1963b.b bVar = list.get(t2lVar.f167505o);
        if (bVar.f8604m) {
            return 0;
        }
        return vck0.m197845c(Uri.parse(evj0.m118283d(c1963b.f184248a, bVar.f8610a)), t2lVar.f136912b.f9492a) ? 1 : 2;
    }

    /* JADX INFO: renamed from: e */
    public void m167188e(long j, long j2, List<t2l> list, boolean z, C19118b c19118b) {
        int i;
        t2l t2lVar = list.isEmpty() ? null : (t2l) aiq.m96881g(list);
        int iM217359d = t2lVar == null ? -1 : this.f146876h.m217359d(t2lVar.f136914d);
        long jMax = j2 - j;
        long jM167200s = m167200s(j);
        if (t2lVar != null && !this.f146885q) {
            long jM157725d = t2lVar.m157725d();
            jMax = Math.max(0L, jMax - jM157725d);
            if (jM167200s != -9223372036854775807L) {
                jM167200s = Math.max(0L, jM167200s - jM157725d);
            }
        }
        this.f146886r.mo11306g(j, jMax, jM167200s, list, m167185a(t2lVar, j2));
        int iMo11309j = this.f146886r.mo11309j();
        boolean z2 = iM217359d != iMo11309j;
        Uri uri = this.f146873e[iMo11309j];
        if (!this.f146875g.mo11196h(uri)) {
            c19118b.f146892c = uri;
            this.f146888t &= uri.equals(this.f146884p);
            this.f146884p = uri;
            return;
        }
        C1963b c1963bMo11200l = this.f146875g.mo11200l(uri, true);
        p11.m167011e(c1963bMo11200l);
        this.f146885q = c1963bMo11200l.f184250c;
        m167204w(c1963bMo11200l);
        long jMo11190b = c1963bMo11200l.f8588h - this.f146875g.mo11190b();
        Pair<Long, Integer> pairM167189f = m167189f(t2lVar, z2, c1963bMo11200l, jMo11190b, j2);
        long jLongValue = ((Long) pairM167189f.first).longValue();
        int iIntValue = ((Integer) pairM167189f.second).intValue();
        int i2 = iM217359d;
        if (jLongValue >= c1963bMo11200l.f8591k || t2lVar == null || !z2) {
            i = iMo11309j;
        } else {
            uri = this.f146873e[i2];
            c1963bMo11200l = this.f146875g.mo11200l(uri, true);
            p11.m167011e(c1963bMo11200l);
            jMo11190b = c1963bMo11200l.f8588h - this.f146875g.mo11190b();
            Pair<Long, Integer> pairM167189f2 = m167189f(t2lVar, false, c1963bMo11200l, jMo11190b, j2);
            jLongValue = ((Long) pairM167189f2.first).longValue();
            iIntValue = ((Integer) pairM167189f2.second).intValue();
            i = i2;
        }
        Uri uri2 = uri;
        C1963b c1963b = c1963bMo11200l;
        if (jLongValue < c1963b.f8591k) {
            this.f146883o = new BehindLiveWindowException();
            return;
        }
        C19121e c19121eM167183g = m167183g(c1963b, jLongValue, iIntValue);
        if (c19121eM167183g == null) {
            if (!c1963b.f8595o) {
                c19118b.f146892c = uri2;
                this.f146888t &= uri2.equals(this.f146884p);
                this.f146884p = uri2;
                return;
            } else {
                if (z || c1963b.f8598r.isEmpty()) {
                    c19118b.f146891b = true;
                    return;
                }
                c19121eM167183g = new C19121e((C1963b.e) aiq.m96881g(c1963b.f8598r), (c1963b.f8591k + ((long) c1963b.f8598r.size())) - 1, -1);
            }
        }
        this.f146888t = false;
        this.f146884p = null;
        Uri uriM167182d = m167182d(c1963b, c19121eM167183g.f146897a.f8611b);
        n35 n35VarM167193l = m167193l(uriM167182d, i, true, null);
        c19118b.f146890a = n35VarM167193l;
        if (n35VarM167193l != null) {
            return;
        }
        Uri uriM167182d2 = m167182d(c1963b, c19121eM167183g.f146897a);
        n35 n35VarM167193l2 = m167193l(uriM167182d2, i, false, null);
        c19118b.f146890a = n35VarM167193l2;
        if (n35VarM167193l2 != null) {
            return;
        }
        long j3 = jMo11190b;
        boolean zM187001w = t2l.m187001w(t2lVar, uri2, c1963b, c19121eM167183g, j3);
        if (zM187001w && c19121eM167183g.f146900d) {
            return;
        }
        c19118b.f146890a = t2l.m186998j(this.f146869a, this.f146870b, this.f146874f[i], j3, c1963b, c19121eM167183g, uri2, this.f146877i, this.f146886r.mo11318s(), this.f146886r.mo11314o(), this.f146881m, this.f146872d, this.f146880l, t2lVar, this.f146878j.m11148a(uriM167182d2), this.f146878j.m11148a(uriM167182d), zM187001w, this.f146879k, null);
    }

    /* JADX INFO: renamed from: f */
    public final Pair<Long, Integer> m167189f(@Nullable t2l t2lVar, boolean z, C1963b c1963b, long j, long j2) {
        int i = -1;
        if (t2lVar != null && !z) {
            if (!t2lVar.mo111872h()) {
                return new Pair<>(Long.valueOf(t2lVar.f97730j), Integer.valueOf(t2lVar.f167505o));
            }
            Long lValueOf = Long.valueOf(t2lVar.f167505o == -1 ? t2lVar.mo121564g() : t2lVar.f97730j);
            int i2 = t2lVar.f167505o;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j3 = c1963b.f8601u + j;
        if (t2lVar != null && !this.f146885q) {
            j2 = t2lVar.f136917g;
        }
        if (!c1963b.f8595o && j2 >= j3) {
            return new Pair<>(Long.valueOf(c1963b.f8591k + ((long) c1963b.f8598r.size())), -1);
        }
        long j4 = j2 - j;
        int iM197854f = vck0.m197854f(c1963b.f8598r, Long.valueOf(j4), true, !this.f146875g.mo11197i() || t2lVar == null);
        long j5 = ((long) iM197854f) + c1963b.f8591k;
        if (iM197854f >= 0) {
            C1963b.d dVar = c1963b.f8598r.get(iM197854f);
            List<C1963b.b> list = j4 < dVar.f8614e + dVar.f8612c ? dVar.f8609m : c1963b.f8599s;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C1963b.b bVar = list.get(i3);
                if (j4 < bVar.f8614e + bVar.f8612c) {
                    if (!bVar.f8603l) {
                        break;
                    }
                    j5 += list == c1963b.f8599s ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j5), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public int m167190h(long j, List<? extends fix> list) {
        return (this.f146883o != null || this.f146886r.length() < 2) ? list.size() : this.f146886r.mo11308i(j, list);
    }

    /* JADX INFO: renamed from: j */
    public z5j0 m167191j() {
        return this.f146876h;
    }

    /* JADX INFO: renamed from: k */
    public o8f m167192k() {
        return this.f146886r;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final n35 m167193l(@Nullable Uri uri, int i, boolean z, @Nullable ab5 ab5Var) {
        if (uri == null) {
            return null;
        }
        byte[] bArrM11150c = this.f146878j.m11150c(uri);
        if (bArrM11150c != null) {
            this.f146878j.m11149b(uri, bArrM11150c);
            return null;
        }
        return new C19117a(this.f146871c, new C2047a.b().m12116i(uri).m12109b(1).m12112e(ImmutableMap.m15715of()).m12108a(), this.f146874f[i], this.f146886r.mo11318s(), this.f146886r.mo11314o(), this.f146882n);
    }

    /* JADX INFO: renamed from: m */
    public boolean m167194m(n35 n35Var, long j) {
        o8f o8fVar = this.f146886r;
        return o8fVar.mo11303d(o8fVar.mo11305f(this.f146876h.m217359d(n35Var.f136914d)), j);
    }

    /* JADX INFO: renamed from: n */
    public void m167195n() throws IOException {
        IOException iOException = this.f146883o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f146884p;
        if (uri == null || !this.f146888t) {
            return;
        }
        this.f146875g.mo11192d(uri);
    }

    /* JADX INFO: renamed from: o */
    public boolean m167196o(Uri uri) {
        return vck0.m197888s(this.f146873e, uri);
    }

    /* JADX INFO: renamed from: p */
    public void m167197p(n35 n35Var) {
        if (n35Var instanceof C19117a) {
            C19117a c19117a = (C19117a) n35Var;
            this.f146882n = c19117a.m139641h();
            this.f146878j.m11149b(c19117a.f136912b.f9492a, (byte[]) p11.m167011e(c19117a.m167205j()));
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m167198q(Uri uri, long j) {
        int iMo11305f;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f146873e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iMo11305f = this.f146886r.mo11305f(i)) == -1) {
            return true;
        }
        this.f146888t |= uri.equals(this.f146884p);
        return j == -9223372036854775807L || (this.f146886r.mo11303d(iMo11305f, j) && this.f146875g.mo11198j(uri, j));
    }

    /* JADX INFO: renamed from: r */
    public void m167199r() {
        this.f146883o = null;
    }

    /* JADX INFO: renamed from: s */
    public final long m167200s(long j) {
        long j2 = this.f146887s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: t */
    public void m167201t(boolean z) {
        this.f146881m = z;
    }

    /* JADX INFO: renamed from: u */
    public void m167202u(o8f o8fVar) {
        this.f146886r = o8fVar;
    }

    /* JADX INFO: renamed from: v */
    public boolean m167203v(long j, n35 n35Var, List<? extends fix> list) {
        if (this.f146883o != null) {
            return false;
        }
        return this.f146886r.mo11315p(j, n35Var, list);
    }

    /* JADX INFO: renamed from: w */
    public final void m167204w(C1963b c1963b) {
        this.f146887s = c1963b.f8595o ? -9223372036854775807L : c1963b.m11257e() - this.f146875g.mo11190b();
    }
}
