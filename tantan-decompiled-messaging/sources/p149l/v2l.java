package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1974r;
import com.google.android.exoplayer2.source.hls.playlist.C1964c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.common.primitives.Ints;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
public final class v2l implements InterfaceC1953h, HlsPlaylistTracker.InterfaceC1960b {

    /* JADX INFO: renamed from: a */
    public final r2l f179558a;

    /* JADX INFO: renamed from: b */
    public final HlsPlaylistTracker f179559b;

    /* JADX INFO: renamed from: c */
    public final q2l f179560c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final l7j0 f179561d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1855c f179562e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1854b.a f179563f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2049c f179564g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1966j.a f179565h;

    /* JADX INFO: renamed from: i */
    public final sj0 f179566i;

    /* JADX INFO: renamed from: l */
    public final as5 f179569l;

    /* JADX INFO: renamed from: m */
    public final boolean f179570m;

    /* JADX INFO: renamed from: n */
    public final int f179571n;

    /* JADX INFO: renamed from: o */
    public final boolean f179572o;

    /* JADX INFO: renamed from: p */
    public final v680 f179573p;

    /* JADX INFO: renamed from: r */
    public final long f179575r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public InterfaceC1953h.a f179576s;

    /* JADX INFO: renamed from: t */
    public int f179577t;

    /* JADX INFO: renamed from: u */
    public b6j0 f179578u;

    /* JADX INFO: renamed from: y */
    public int f179582y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1974r f179583z;

    /* JADX INFO: renamed from: q */
    public final c3l.InterfaceC16052b f179574q = new C20572b();

    /* JADX INFO: renamed from: j */
    public final IdentityHashMap<vod0, Integer> f179567j = new IdentityHashMap<>();

    /* JADX INFO: renamed from: k */
    public final fri0 f179568k = new fri0();

    /* JADX INFO: renamed from: v */
    public c3l[] f179579v = new c3l[0];

    /* JADX INFO: renamed from: w */
    public c3l[] f179580w = new c3l[0];

    /* JADX INFO: renamed from: x */
    public int[][] f179581x = new int[0][];

    /* JADX INFO: renamed from: l.v2l$b */
    public class C20572b implements c3l.InterfaceC16052b {
        public C20572b() {
        }

        @Override // p149l.c3l.InterfaceC16052b
        /* JADX INFO: renamed from: a */
        public void mo105084a() {
            if (v2l.m196793j(v2l.this) > 0) {
                return;
            }
            int i = 0;
            for (c3l c3lVar : v2l.this.f179579v) {
                i += c3lVar.m105073m().f73826a;
            }
            z5j0[] z5j0VarArr = new z5j0[i];
            int i2 = 0;
            for (c3l c3lVar2 : v2l.this.f179579v) {
                int i3 = c3lVar2.m105073m().f73826a;
                int i4 = 0;
                while (i4 < i3) {
                    z5j0VarArr[i2] = c3lVar2.m105073m().m100410b(i4);
                    i4++;
                    i2++;
                }
            }
            v2l.this.f179578u = new b6j0(z5j0VarArr);
            v2l.this.f179576s.mo10221l(v2l.this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1974r.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo10216j(c3l c3lVar) {
            v2l.this.f179576s.mo10216j(v2l.this);
        }

        @Override // p149l.c3l.InterfaceC16052b
        /* JADX INFO: renamed from: k */
        public void mo105085k(Uri uri) {
            v2l.this.f179559b.mo11194f(uri);
        }
    }

    public v2l(r2l r2lVar, HlsPlaylistTracker hlsPlaylistTracker, q2l q2lVar, @Nullable l7j0 l7j0Var, @Nullable za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar2, sj0 sj0Var, as5 as5Var, boolean z, int i, boolean z2, v680 v680Var, long j) {
        this.f179558a = r2lVar;
        this.f179559b = hlsPlaylistTracker;
        this.f179560c = q2lVar;
        this.f179561d = l7j0Var;
        this.f179562e = interfaceC1855c;
        this.f179563f = aVar;
        this.f179564g = interfaceC2049c;
        this.f179565h = aVar2;
        this.f179566i = sj0Var;
        this.f179569l = as5Var;
        this.f179570m = z;
        this.f179571n = i;
        this.f179572o = z2;
        this.f179573p = v680Var;
        this.f179575r = j;
        this.f179583z = as5Var.mo98579a(new InterfaceC1974r[0]);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m196793j(v2l v2lVar) {
        int i = v2lVar.f179577t - 1;
        v2lVar.f179577t = i;
        return i;
    }

    /* JADX INFO: renamed from: x */
    public static C1871k m196798x(C1871k c1871k, @Nullable C1871k c1871k2, boolean z) {
        String strM197811M;
        Metadata metadata;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        if (c1871k2 != null) {
            strM197811M = c1871k2.f7745i;
            metadata = c1871k2.f7746j;
            i2 = c1871k2.f7761y;
            i = c1871k2.f7740d;
            i3 = c1871k2.f7741e;
            str = c1871k2.f7739c;
            str2 = c1871k2.f7738b;
        } else {
            strM197811M = vck0.m197811M(c1871k.f7745i, 1);
            metadata = c1871k.f7746j;
            if (z) {
                i2 = c1871k.f7761y;
                i = c1871k.f7740d;
                i3 = c1871k.f7741e;
                str = c1871k.f7739c;
                str2 = c1871k.f7738b;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        return new C1871k.b().m10334U(c1871k.f7737a).m10336W(str2).m10326M(c1871k.f7747k).m10346g0(n200.m157525g(strM197811M)).m10324K(strM197811M).m10339Z(metadata).m10322I(z ? c1871k.f7742f : -1).m10341b0(z ? c1871k.f7743g : -1).m10323J(i2).m10348i0(i).m10344e0(i3).m10337X(str).m10320G();
    }

    /* JADX INFO: renamed from: y */
    public static Map<String, DrmInitData> m196799y(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataM9900f = list.get(i);
            String str = drmInitDataM9900f.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataM9900f = drmInitDataM9900f.m9900f(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataM9900f);
        }
        return map;
    }

    /* JADX INFO: renamed from: z */
    public static C1871k m196800z(C1871k c1871k) {
        String strM197811M = vck0.m197811M(c1871k.f7745i, 2);
        return new C1871k.b().m10334U(c1871k.f7737a).m10336W(c1871k.f7738b).m10326M(c1871k.f7747k).m10346g0(n200.m157525g(strM197811M)).m10324K(strM197811M).m10339Z(c1871k.f7746j).m10322I(c1871k.f7742f).m10341b0(c1871k.f7743g).m10353n0(c1871k.f7753q).m10332S(c1871k.f7754r).m10331R(c1871k.f7755s).m10348i0(c1871k.f7740d).m10344e0(c1871k.f7741e).m10320G();
    }

    /* JADX INFO: renamed from: A */
    public void m196801A() {
        this.f179559b.mo11189a(this);
        for (c3l c3lVar : this.f179579v) {
            c3lVar.m105065e0();
        }
        this.f179576s = null;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1960b
    /* JADX INFO: renamed from: a */
    public void mo11202a() {
        for (c3l c3lVar : this.f179579v) {
            c3lVar.m105061a0();
        }
        this.f179576s.mo10216j(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1960b
    /* JADX INFO: renamed from: b */
    public boolean mo11203b(Uri uri, InterfaceC2049c.c cVar, boolean z) {
        boolean zM105060Z = true;
        for (c3l c3lVar : this.f179579v) {
            zM105060Z &= c3lVar.m105060Z(uri, cVar, z);
        }
        this.f179576s.mo10216j(this);
        return zM105060Z;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        if (this.f179578u != null) {
            return this.f179583z.mo10923c(j);
        }
        for (c3l c3lVar : this.f179579v) {
            c3lVar.m105043A();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        return this.f179583z.mo10924d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        this.f179583z.mo10925e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return this.f179583z.mo10926f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        for (c3l c3lVar : this.f179580w) {
            if (c3lVar.m105052Q()) {
                return c3lVar.m105066g(j, ice0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) {
        c3l[] c3lVarArr = this.f179580w;
        if (c3lVarArr.length > 0) {
            boolean zM105068h0 = c3lVarArr[0].m105068h0(j, false);
            int i = 1;
            while (true) {
                c3l[] c3lVarArr2 = this.f179580w;
                if (i >= c3lVarArr2.length) {
                    break;
                }
                c3lVarArr2[i].m105068h0(j, zM105068h0);
                i++;
            }
            if (zM105068h0) {
                this.f179568k.m122875b();
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: i */
    public long mo10929i() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return this.f179583z.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        return (b6j0) p11.m167011e(this.f179578u);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f179576s = aVar;
        this.f179559b.mo11195g(this);
        m196804v(j);
    }

    /* JADX INFO: renamed from: q */
    public final void m196802q(long j, List<C1964c.a> list, List<c3l> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f8640d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (vck0.m197845c(str, list.get(i2).f8640d)) {
                        C1964c.a aVar = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f8637a);
                        arrayList2.add(aVar.f8638b);
                        z &= vck0.m197809L(aVar.f8638b.f7745i, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                c3l c3lVarM196805w = m196805w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) vck0.m197869k(new Uri[0])), (C1871k[]) arrayList2.toArray(new C1871k[0]), null, Collections.EMPTY_LIST, map, j);
                list3.add(Ints.m16469n(arrayList3));
                list2.add(c3lVarM196805w);
                if (this.f179570m && z) {
                    c3lVarM196805w.m105063c0(new z5j0[]{new z5j0(str2, (C1871k[]) arrayList2.toArray(new C1871k[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[o8fVarArr.length];
        int[] iArr2 = new int[o8fVarArr.length];
        for (int i = 0; i < o8fVarArr.length; i++) {
            vod0 vod0Var = vod0VarArr[i];
            iArr[i] = vod0Var == null ? -1 : this.f179567j.get(vod0Var).intValue();
            iArr2[i] = -1;
            o8f o8fVar = o8fVarArr[i];
            if (o8fVar != null) {
                z5j0 z5j0VarMo11307h = o8fVar.mo11307h();
                int i2 = 0;
                while (true) {
                    c3l[] c3lVarArr = this.f179579v;
                    if (i2 >= c3lVarArr.length) {
                        break;
                    }
                    if (c3lVarArr[i2].m105073m().m100411c(z5j0VarMo11307h) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.f179567j.clear();
        int length = o8fVarArr.length;
        vod0[] vod0VarArr2 = new vod0[length];
        vod0[] vod0VarArr3 = new vod0[o8fVarArr.length];
        o8f[] o8fVarArr2 = new o8f[o8fVarArr.length];
        c3l[] c3lVarArr2 = new c3l[this.f179579v.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < this.f179579v.length) {
            for (int i5 = 0; i5 < o8fVarArr.length; i5++) {
                o8f o8fVar2 = null;
                vod0VarArr3[i5] = iArr[i5] == i3 ? vod0VarArr[i5] : null;
                if (iArr2[i5] == i3) {
                    o8fVar2 = o8fVarArr[i5];
                }
                o8fVarArr2[i5] = o8fVar2;
            }
            c3l c3lVar = this.f179579v[i3];
            int[] iArr3 = iArr;
            int i6 = i3;
            int i7 = i4;
            boolean zM105069i0 = c3lVar.m105069i0(o8fVarArr2, zArr, vod0VarArr3, zArr2, j, z);
            boolean z2 = false;
            for (int i8 = 0; i8 < o8fVarArr.length; i8++) {
                vod0 vod0Var2 = vod0VarArr3[i8];
                if (iArr2[i8] == i6) {
                    p11.m167011e(vod0Var2);
                    vod0VarArr2[i8] = vod0Var2;
                    this.f179567j.put(vod0Var2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr3[i8] == i6) {
                    p11.m167013g(vod0Var2 == null);
                }
            }
            if (z2) {
                c3lVarArr2[i7] = c3lVar;
                i4 = i7 + 1;
                if (i7 == 0) {
                    c3lVar.m105072l0(true);
                    if (zM105069i0) {
                        this.f179568k.m122875b();
                        z = true;
                    } else {
                        c3l[] c3lVarArr3 = this.f179580w;
                        if (c3lVarArr3.length == 0 || c3lVar != c3lVarArr3[0]) {
                            this.f179568k.m122875b();
                            z = true;
                        }
                    }
                } else {
                    c3lVar.m105072l0(i6 < this.f179582y);
                }
            } else {
                i4 = i7;
            }
            i3 = i6 + 1;
            iArr = iArr3;
        }
        System.arraycopy(vod0VarArr2, 0, vod0VarArr, 0, length);
        c3l[] c3lVarArr4 = (c3l[]) vck0.m197816O0(c3lVarArr2, i4);
        this.f179580w = c3lVarArr4;
        this.f179583z = this.f179569l.mo98579a(c3lVarArr4);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        for (c3l c3lVar : this.f179579v) {
            c3lVar.m105078s();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        for (c3l c3lVar : this.f179580w) {
            c3lVar.m105079t(j, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m196803u(C1964c c1964c, long j, List<c3l> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z;
        boolean z2;
        int size = c1964c.f8628e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < c1964c.f8628e.size(); i3++) {
            C1871k c1871k = c1964c.f8628e.get(i3).f8642b;
            if (c1871k.f7754r > 0 || vck0.m197811M(c1871k.f7745i, 2) != null) {
                iArr[i3] = 2;
                i++;
            } else if (vck0.m197811M(c1871k.f7745i, 1) != null) {
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
        C1871k[] c1871kArr = new C1871k[size];
        int[] iArr2 = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < c1964c.f8628e.size(); i5++) {
            if ((!z || iArr[i5] == 2) && (!z2 || iArr[i5] != 1)) {
                C1964c.b bVar = c1964c.f8628e.get(i5);
                uriArr[i4] = bVar.f8641a;
                c1871kArr[i4] = bVar.f8642b;
                iArr2[i4] = i5;
                i4++;
            }
        }
        String str = c1871kArr[0].f7745i;
        int iM197809L = vck0.m197809L(str, 2);
        int iM197809L2 = vck0.m197809L(str, 1);
        boolean z3 = (iM197809L2 == 1 || (iM197809L2 == 0 && c1964c.f8630g.isEmpty())) && iM197809L <= 1 && iM197809L2 + iM197809L > 0;
        c3l c3lVarM196805w = m196805w(BLiveTraceServerLocation.main, (z || iM197809L2 <= 0) ? 0 : 1, uriArr, c1871kArr, c1964c.f8633j, c1964c.f8634k, map, j);
        list.add(c3lVarM196805w);
        list2.add(iArr2);
        if (this.f179570m && z3) {
            ArrayList arrayList = new ArrayList();
            if (iM197809L > 0) {
                C1871k[] c1871kArr2 = new C1871k[size];
                for (int i6 = 0; i6 < size; i6++) {
                    c1871kArr2[i6] = m196800z(c1871kArr[i6]);
                }
                arrayList.add(new z5j0(BLiveTraceServerLocation.main, c1871kArr2));
                if (iM197809L2 > 0 && (c1964c.f8633j != null || c1964c.f8630g.isEmpty())) {
                    arrayList.add(new z5j0("main:audio", m196798x(c1871kArr[0], c1964c.f8633j, false)));
                }
                List<C1871k> list3 = c1964c.f8634k;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new z5j0("main:cc:" + i7, list3.get(i7)));
                    }
                }
            } else {
                C1871k[] c1871kArr3 = new C1871k[size];
                for (int i8 = 0; i8 < size; i8++) {
                    c1871kArr3[i8] = m196798x(c1871kArr[i8], c1964c.f8633j, true);
                }
                arrayList.add(new z5j0(BLiveTraceServerLocation.main, c1871kArr3));
            }
            z5j0 z5j0Var = new z5j0("main:id3", new C1871k.b().m10334U("ID3").m10346g0("application/id3").m10320G());
            arrayList.add(z5j0Var);
            c3lVarM196805w.m105063c0((z5j0[]) arrayList.toArray(new z5j0[0]), 0, arrayList.indexOf(z5j0Var));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m196804v(long j) {
        c3l[] c3lVarArr;
        C1964c c1964c = (C1964c) p11.m167011e(this.f179559b.mo11193e());
        Map<String, DrmInitData> mapM196799y = this.f179572o ? m196799y(c1964c.f8636m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = c1964c.f8628e.isEmpty();
        List<C1964c.a> list = c1964c.f8630g;
        List<C1964c.a> list2 = c1964c.f8631h;
        this.f179577t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            m196803u(c1964c, j, arrayList, arrayList2, mapM196799y);
        }
        m196802q(j, list, arrayList, arrayList2, mapM196799y);
        this.f179582y = arrayList.size();
        for (int i = 0; i < list2.size(); i++) {
            C1964c.a aVar = list2.get(i);
            String str = "subtitle:" + i + ":" + aVar.f8640d;
            Map<String, DrmInitData> map = mapM196799y;
            c3l c3lVarM196805w = m196805w(str, 3, new Uri[]{aVar.f8637a}, new C1871k[]{aVar.f8638b}, null, Collections.EMPTY_LIST, map, j);
            mapM196799y = map;
            arrayList2.add(new int[]{i});
            arrayList.add(c3lVarM196805w);
            c3lVarM196805w.m105063c0(new z5j0[]{new z5j0(str, aVar.f8638b)}, 0, new int[0]);
        }
        this.f179579v = (c3l[]) arrayList.toArray(new c3l[0]);
        this.f179581x = (int[][]) arrayList2.toArray(new int[0][]);
        this.f179577t = this.f179579v.length;
        int i2 = 0;
        while (true) {
            int i3 = this.f179582y;
            c3lVarArr = this.f179579v;
            if (i2 >= i3) {
                break;
            }
            c3lVarArr[i2].m105072l0(true);
            i2++;
        }
        for (c3l c3lVar : c3lVarArr) {
            c3lVar.m105043A();
        }
        this.f179580w = this.f179579v;
    }

    /* JADX INFO: renamed from: w */
    public final c3l m196805w(String str, int i, Uri[] uriArr, C1871k[] c1871kArr, @Nullable C1871k c1871k, @Nullable List<C1871k> list, Map<String, DrmInitData> map, long j) {
        return new c3l(str, i, this.f179574q, new p2l(this.f179558a, this.f179559b, uriArr, c1871kArr, this.f179560c, this.f179561d, this.f179568k, this.f179575r, list, this.f179573p, null), map, this.f179566i, j, c1871k, this.f179562e, this.f179563f, this.f179564g, this.f179565h, this.f179571n);
    }
}
