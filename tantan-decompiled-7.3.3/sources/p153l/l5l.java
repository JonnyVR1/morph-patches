package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1997r;
import com.google.android.exoplayer2.source.hls.playlist.C1987c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.common.primitives.Ints;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class l5l implements InterfaceC1976h, HlsPlaylistTracker.InterfaceC1983b {

    /* JADX INFO: renamed from: a */
    public final h5l f130126a;

    /* JADX INFO: renamed from: b */
    public final HlsPlaylistTracker f130127b;

    /* JADX INFO: renamed from: c */
    public final g5l f130128c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final pgj0 f130129d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1878c f130130e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1877b.a f130131f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2072c f130132g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1989j.a f130133h;

    /* JADX INFO: renamed from: i */
    public final oj0 f130134i;

    /* JADX INFO: renamed from: l */
    public final et5 f130137l;

    /* JADX INFO: renamed from: m */
    public final boolean f130138m;

    /* JADX INFO: renamed from: n */
    public final int f130139n;

    /* JADX INFO: renamed from: o */
    public final boolean f130140o;

    /* JADX INFO: renamed from: p */
    public final bf80 f130141p;

    /* JADX INFO: renamed from: r */
    public final long f130143r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public InterfaceC1976h.a f130144s;

    /* JADX INFO: renamed from: t */
    public int f130145t;

    /* JADX INFO: renamed from: u */
    public ffj0 f130146u;

    /* JADX INFO: renamed from: y */
    public int f130150y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1997r f130151z;

    /* JADX INFO: renamed from: q */
    public final s5l.InterfaceC19986b f130142q = new C18354b();

    /* JADX INFO: renamed from: j */
    public final IdentityHashMap<xwd0, Integer> f130135j = new IdentityHashMap<>();

    /* JADX INFO: renamed from: k */
    public final i0j0 f130136k = new i0j0();

    /* JADX INFO: renamed from: v */
    public s5l[] f130147v = new s5l[0];

    /* JADX INFO: renamed from: w */
    public s5l[] f130148w = new s5l[0];

    /* JADX INFO: renamed from: x */
    public int[][] f130149x = new int[0][];

    /* JADX INFO: renamed from: l.l5l$b */
    public class C18354b implements s5l.InterfaceC19986b {
        public C18354b() {
        }

        @Override // p153l.s5l.InterfaceC19986b
        /* JADX INFO: renamed from: a */
        public void mo152971a() {
            if (l5l.m152958j(l5l.this) > 0) {
                return;
            }
            int i = 0;
            for (s5l s5lVar : l5l.this.f130147v) {
                i += s5lVar.m184721m().f98785a;
            }
            dfj0[] dfj0VarArr = new dfj0[i];
            int i2 = 0;
            for (s5l s5lVar2 : l5l.this.f130147v) {
                int i3 = s5lVar2.m184721m().f98785a;
                int i4 = 0;
                while (i4 < i3) {
                    dfj0VarArr[i2] = s5lVar2.m184721m().m125387b(i4);
                    i4++;
                    i2++;
                }
            }
            l5l.this.f130146u = new ffj0(dfj0VarArr);
            l5l.this.f130144s.mo10275l(l5l.this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo10270j(s5l s5lVar) {
            l5l.this.f130144s.mo10270j(l5l.this);
        }

        @Override // p153l.s5l.InterfaceC19986b
        /* JADX INFO: renamed from: k */
        public void mo152973k(Uri uri) {
            l5l.this.f130127b.mo11248f(uri);
        }
    }

    public l5l(h5l h5lVar, HlsPlaylistTracker hlsPlaylistTracker, g5l g5lVar, @Nullable pgj0 pgj0Var, @Nullable zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar2, oj0 oj0Var, et5 et5Var, boolean z, int i, boolean z2, bf80 bf80Var, long j) {
        this.f130126a = h5lVar;
        this.f130127b = hlsPlaylistTracker;
        this.f130128c = g5lVar;
        this.f130129d = pgj0Var;
        this.f130130e = interfaceC1878c;
        this.f130131f = aVar;
        this.f130132g = interfaceC2072c;
        this.f130133h = aVar2;
        this.f130134i = oj0Var;
        this.f130137l = et5Var;
        this.f130138m = z;
        this.f130139n = i;
        this.f130140o = z2;
        this.f130141p = bf80Var;
        this.f130143r = j;
        this.f130151z = et5Var.mo122429a(new InterfaceC1997r[0]);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m152958j(l5l l5lVar) {
        int i = l5lVar.f130145t - 1;
        l5lVar.f130145t = i;
        return i;
    }

    /* JADX INFO: renamed from: x */
    public static C1894k m152963x(C1894k c1894k, @Nullable C1894k c1894k2, boolean z) {
        String strM105089M;
        Metadata metadata;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        if (c1894k2 != null) {
            strM105089M = c1894k2.f7782i;
            metadata = c1894k2.f7783j;
            i2 = c1894k2.f7798y;
            i = c1894k2.f7777d;
            i3 = c1894k2.f7778e;
            str = c1894k2.f7776c;
            str2 = c1894k2.f7775b;
        } else {
            strM105089M = bmk0.m105089M(c1894k.f7782i, 1);
            metadata = c1894k.f7783j;
            if (z) {
                i2 = c1894k.f7798y;
                i = c1894k.f7777d;
                i3 = c1894k.f7778e;
                str = c1894k.f7776c;
                str2 = c1894k.f7775b;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        return new C1894k.b().m10388U(c1894k.f7774a).m10390W(str2).m10380M(c1894k.f7784k).m10400g0(kb00.m149006g(strM105089M)).m10378K(strM105089M).m10393Z(metadata).m10376I(z ? c1894k.f7779f : -1).m10395b0(z ? c1894k.f7780g : -1).m10377J(i2).m10402i0(i).m10398e0(i3).m10391X(str).m10374G();
    }

    /* JADX INFO: renamed from: y */
    public static Map<String, DrmInitData> m152964y(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataM9954f = list.get(i);
            String str = drmInitDataM9954f.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataM9954f = drmInitDataM9954f.m9954f(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataM9954f);
        }
        return map;
    }

    /* JADX INFO: renamed from: z */
    public static C1894k m152965z(C1894k c1894k) {
        String strM105089M = bmk0.m105089M(c1894k.f7782i, 2);
        return new C1894k.b().m10388U(c1894k.f7774a).m10390W(c1894k.f7775b).m10380M(c1894k.f7784k).m10400g0(kb00.m149006g(strM105089M)).m10378K(strM105089M).m10393Z(c1894k.f7783j).m10376I(c1894k.f7779f).m10395b0(c1894k.f7780g).m10407n0(c1894k.f7790q).m10386S(c1894k.f7791r).m10385R(c1894k.f7792s).m10402i0(c1894k.f7777d).m10398e0(c1894k.f7778e).m10374G();
    }

    /* JADX INFO: renamed from: A */
    public void m152966A() {
        this.f130127b.mo11243a(this);
        for (s5l s5lVar : this.f130147v) {
            s5lVar.m184713e0();
        }
        this.f130144s = null;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1983b
    /* JADX INFO: renamed from: a */
    public void mo11256a() {
        for (s5l s5lVar : this.f130147v) {
            s5lVar.m184709a0();
        }
        this.f130144s.mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1983b
    /* JADX INFO: renamed from: b */
    public boolean mo11257b(Uri uri, InterfaceC2072c.c cVar, boolean z) {
        boolean zM184708Z = true;
        for (s5l s5lVar : this.f130147v) {
            zM184708Z &= s5lVar.m184708Z(uri, cVar, z);
        }
        this.f130144s.mo10270j(this);
        return zM184708Z;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        if (this.f130146u != null) {
            return this.f130151z.mo10977c(j);
        }
        for (s5l s5lVar : this.f130147v) {
            s5lVar.m184691A();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        return this.f130151z.mo10978d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        this.f130151z.mo10979e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return this.f130151z.mo10980f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        for (s5l s5lVar : this.f130148w) {
            if (s5lVar.m184700Q()) {
                return s5lVar.m184714g(j, nke0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        s5l[] s5lVarArr = this.f130148w;
        if (s5lVarArr.length > 0) {
            boolean zM184716h0 = s5lVarArr[0].m184716h0(j, false);
            int i = 1;
            while (true) {
                s5l[] s5lVarArr2 = this.f130148w;
                if (i >= s5lVarArr2.length) {
                    break;
                }
                s5lVarArr2[i].m184716h0(j, zM184716h0);
                i++;
            }
            if (zM184716h0) {
                this.f130136k.m137973b();
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f130151z.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return (ffj0) w11.m204369e(this.f130146u);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f130144s = aVar;
        this.f130127b.mo11249g(this);
        m152969v(j);
    }

    /* JADX INFO: renamed from: q */
    public final void m152967q(long j, List<C1987c.a> list, List<s5l> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f8677d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (bmk0.m105123c(str, list.get(i2).f8677d)) {
                        C1987c.a aVar = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f8674a);
                        arrayList2.add(aVar.f8675b);
                        z &= bmk0.m105087L(aVar.f8675b.f7782i, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                s5l s5lVarM152970w = m152970w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) bmk0.m105147k(new Uri[0])), (C1894k[]) arrayList2.toArray(new C1894k[0]), null, Collections.EMPTY_LIST, map, j);
                list3.add(Ints.m16524n(arrayList3));
                list2.add(s5lVarM152970w);
                if (this.f130138m && z) {
                    s5lVarM152970w.m184711c0(new dfj0[]{new dfj0(str2, (C1894k[]) arrayList2.toArray(new C1894k[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[u9fVarArr.length];
        int[] iArr2 = new int[u9fVarArr.length];
        for (int i = 0; i < u9fVarArr.length; i++) {
            xwd0 xwd0Var = xwd0VarArr[i];
            iArr[i] = xwd0Var == null ? -1 : this.f130135j.get(xwd0Var).intValue();
            iArr2[i] = -1;
            u9f u9fVar = u9fVarArr[i];
            if (u9fVar != null) {
                dfj0 dfj0VarMo11361h = u9fVar.mo11361h();
                int i2 = 0;
                while (true) {
                    s5l[] s5lVarArr = this.f130147v;
                    if (i2 >= s5lVarArr.length) {
                        break;
                    }
                    if (s5lVarArr[i2].m184721m().m125388c(dfj0VarMo11361h) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.f130135j.clear();
        int length = u9fVarArr.length;
        xwd0[] xwd0VarArr2 = new xwd0[length];
        xwd0[] xwd0VarArr3 = new xwd0[u9fVarArr.length];
        u9f[] u9fVarArr2 = new u9f[u9fVarArr.length];
        s5l[] s5lVarArr2 = new s5l[this.f130147v.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < this.f130147v.length) {
            for (int i5 = 0; i5 < u9fVarArr.length; i5++) {
                u9f u9fVar2 = null;
                xwd0VarArr3[i5] = iArr[i5] == i3 ? xwd0VarArr[i5] : null;
                if (iArr2[i5] == i3) {
                    u9fVar2 = u9fVarArr[i5];
                }
                u9fVarArr2[i5] = u9fVar2;
            }
            s5l s5lVar = this.f130147v[i3];
            int[] iArr3 = iArr;
            int i6 = i3;
            int i7 = i4;
            boolean zM184717i0 = s5lVar.m184717i0(u9fVarArr2, zArr, xwd0VarArr3, zArr2, j, z);
            boolean z2 = false;
            for (int i8 = 0; i8 < u9fVarArr.length; i8++) {
                xwd0 xwd0Var2 = xwd0VarArr3[i8];
                if (iArr2[i8] == i6) {
                    w11.m204369e(xwd0Var2);
                    xwd0VarArr2[i8] = xwd0Var2;
                    this.f130135j.put(xwd0Var2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr3[i8] == i6) {
                    w11.m204371g(xwd0Var2 == null);
                }
            }
            if (z2) {
                s5lVarArr2[i7] = s5lVar;
                i4 = i7 + 1;
                if (i7 == 0) {
                    s5lVar.m184720l0(true);
                    if (zM184717i0) {
                        this.f130136k.m137973b();
                        z = true;
                    } else {
                        s5l[] s5lVarArr3 = this.f130148w;
                        if (s5lVarArr3.length == 0 || s5lVar != s5lVarArr3[0]) {
                            this.f130136k.m137973b();
                            z = true;
                        }
                    }
                } else {
                    s5lVar.m184720l0(i6 < this.f130150y);
                }
            } else {
                i4 = i7;
            }
            i3 = i6 + 1;
            iArr = iArr3;
        }
        System.arraycopy(xwd0VarArr2, 0, xwd0VarArr, 0, length);
        s5l[] s5lVarArr4 = (s5l[]) bmk0.m105094O0(s5lVarArr2, i4);
        this.f130148w = s5lVarArr4;
        this.f130151z = this.f130137l.mo122429a(s5lVarArr4);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        for (s5l s5lVar : this.f130147v) {
            s5lVar.m184726s();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        for (s5l s5lVar : this.f130148w) {
            s5lVar.m184727t(j, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m152968u(C1987c c1987c, long j, List<s5l> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z;
        boolean z2;
        int size = c1987c.f8665e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < c1987c.f8665e.size(); i3++) {
            C1894k c1894k = c1987c.f8665e.get(i3).f8679b;
            if (c1894k.f7791r > 0 || bmk0.m105089M(c1894k.f7782i, 2) != null) {
                iArr[i3] = 2;
                i++;
            } else if (bmk0.m105089M(c1894k.f7782i, 1) != null) {
                iArr[i3] = 1;
                i2++;
            } else {
                iArr[i3] = -1;
            }
        }
        if (i > 0) {
            size = i;
            z = true;
            z2 = false;
        } else if (i2 < size) {
            size -= i2;
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[size];
        C1894k[] c1894kArr = new C1894k[size];
        int[] iArr2 = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < c1987c.f8665e.size(); i5++) {
            if ((!z || iArr[i5] == 2) && (!z2 || iArr[i5] != 1)) {
                C1987c.b bVar = c1987c.f8665e.get(i5);
                uriArr[i4] = bVar.f8678a;
                c1894kArr[i4] = bVar.f8679b;
                iArr2[i4] = i5;
                i4++;
            }
        }
        String str = c1894kArr[0].f7782i;
        int iM105087L = bmk0.m105087L(str, 2);
        int iM105087L2 = bmk0.m105087L(str, 1);
        boolean z3 = (iM105087L2 == 1 || (iM105087L2 == 0 && c1987c.f8667g.isEmpty())) && iM105087L <= 1 && iM105087L2 + iM105087L > 0;
        s5l s5lVarM152970w = m152970w(BLiveTraceServerLocation.main, (z || iM105087L2 <= 0) ? 0 : 1, uriArr, c1894kArr, c1987c.f8670j, c1987c.f8671k, map, j);
        list.add(s5lVarM152970w);
        list2.add(iArr2);
        if (this.f130138m && z3) {
            ArrayList arrayList = new ArrayList();
            if (iM105087L > 0) {
                C1894k[] c1894kArr2 = new C1894k[size];
                for (int i6 = 0; i6 < size; i6++) {
                    c1894kArr2[i6] = m152965z(c1894kArr[i6]);
                }
                arrayList.add(new dfj0(BLiveTraceServerLocation.main, c1894kArr2));
                if (iM105087L2 > 0 && (c1987c.f8670j != null || c1987c.f8667g.isEmpty())) {
                    arrayList.add(new dfj0("main:audio", m152963x(c1894kArr[0], c1987c.f8670j, false)));
                }
                List<C1894k> list3 = c1987c.f8671k;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new dfj0("main:cc:" + i7, list3.get(i7)));
                    }
                }
            } else {
                C1894k[] c1894kArr3 = new C1894k[size];
                for (int i8 = 0; i8 < size; i8++) {
                    c1894kArr3[i8] = m152963x(c1894kArr[i8], c1987c.f8670j, true);
                }
                arrayList.add(new dfj0(BLiveTraceServerLocation.main, c1894kArr3));
            }
            dfj0 dfj0Var = new dfj0("main:id3", new C1894k.b().m10388U("ID3").m10400g0("application/id3").m10374G());
            arrayList.add(dfj0Var);
            s5lVarM152970w.m184711c0((dfj0[]) arrayList.toArray(new dfj0[0]), 0, arrayList.indexOf(dfj0Var));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m152969v(long j) {
        s5l[] s5lVarArr;
        C1987c c1987c = (C1987c) w11.m204369e(this.f130127b.mo11247e());
        Map<String, DrmInitData> mapM152964y = this.f130140o ? m152964y(c1987c.f8673m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = c1987c.f8665e.isEmpty();
        List<C1987c.a> list = c1987c.f8667g;
        List<C1987c.a> list2 = c1987c.f8668h;
        this.f130145t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            m152968u(c1987c, j, arrayList, arrayList2, mapM152964y);
        }
        m152967q(j, list, arrayList, arrayList2, mapM152964y);
        this.f130150y = arrayList.size();
        for (int i = 0; i < list2.size(); i++) {
            C1987c.a aVar = list2.get(i);
            String str = "subtitle:" + i + ":" + aVar.f8677d;
            Map<String, DrmInitData> map = mapM152964y;
            s5l s5lVarM152970w = m152970w(str, 3, new Uri[]{aVar.f8674a}, new C1894k[]{aVar.f8675b}, null, Collections.EMPTY_LIST, map, j);
            mapM152964y = map;
            arrayList2.add(new int[]{i});
            arrayList.add(s5lVarM152970w);
            s5lVarM152970w.m184711c0(new dfj0[]{new dfj0(str, aVar.f8675b)}, 0, new int[0]);
        }
        this.f130147v = (s5l[]) arrayList.toArray(new s5l[0]);
        this.f130149x = (int[][]) arrayList2.toArray(new int[0][]);
        this.f130145t = this.f130147v.length;
        int i2 = 0;
        while (true) {
            int i3 = this.f130150y;
            s5lVarArr = this.f130147v;
            if (i2 >= i3) {
                break;
            }
            s5lVarArr[i2].m184720l0(true);
            i2++;
        }
        for (s5l s5lVar : s5lVarArr) {
            s5lVar.m184691A();
        }
        this.f130148w = this.f130147v;
    }

    /* JADX INFO: renamed from: w */
    public final s5l m152970w(String str, int i, Uri[] uriArr, C1894k[] c1894kArr, @Nullable C1894k c1894k, @Nullable List<C1894k> list, Map<String, DrmInitData> map, long j) {
        return new s5l(str, i, this.f130142q, new f5l(this.f130126a, this.f130127b, uriArr, c1894kArr, this.f130128c, this.f130129d, this.f130136k, this.f130143r, list, this.f130141p, null), map, this.f130134i, j, c1894k, this.f130130e, this.f130131f, this.f130132g, this.f130133h, this.f130139n);
    }
}
