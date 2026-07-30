package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1997r;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.C2023a;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import java.io.IOException;
import java.util.ArrayList;
import p153l.dfj0;
import p153l.et5;
import p153l.ffj0;
import p153l.nke0;
import p153l.oj0;
import p153l.pgj0;
import p153l.t45;
import p153l.u9f;
import p153l.vtv;
import p153l.xwd0;
import p153l.zb5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2017c implements InterfaceC1976h, InterfaceC1997r.a<t45<InterfaceC2016b>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2016b.a f9039a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final pgj0 f9040b;

    /* JADX INFO: renamed from: c */
    public final vtv f9041c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1878c f9042d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1877b.a f9043e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2072c f9044f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1989j.a f9045g;

    /* JADX INFO: renamed from: h */
    public final oj0 f9046h;

    /* JADX INFO: renamed from: i */
    public final ffj0 f9047i;

    /* JADX INFO: renamed from: j */
    public final et5 f9048j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public InterfaceC1976h.a f9049k;

    /* JADX INFO: renamed from: l */
    public C2023a f9050l;

    /* JADX INFO: renamed from: m */
    public t45<InterfaceC2016b>[] f9051m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1997r f9052n;

    public C2017c(C2023a c2023a, InterfaceC2016b.a aVar, @Nullable pgj0 pgj0Var, et5 et5Var, @Nullable zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar2, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar3, vtv vtvVar, oj0 oj0Var) {
        this.f9050l = c2023a;
        this.f9039a = aVar;
        this.f9040b = pgj0Var;
        this.f9041c = vtvVar;
        this.f9042d = interfaceC1878c;
        this.f9043e = aVar2;
        this.f9044f = interfaceC2072c;
        this.f9045g = aVar3;
        this.f9046h = oj0Var;
        this.f9048j = et5Var;
        this.f9047i = m11749n(c2023a, interfaceC1878c);
        t45<InterfaceC2016b>[] t45VarArrM11750o = m11750o(0);
        this.f9051m = t45VarArrM11750o;
        this.f9052n = et5Var.mo122429a(t45VarArrM11750o);
    }

    /* JADX INFO: renamed from: n */
    public static ffj0 m11749n(C2023a c2023a, InterfaceC1878c interfaceC1878c) {
        dfj0[] dfj0VarArr = new dfj0[c2023a.f9090f.length];
        int i = 0;
        while (true) {
            C2023a.b[] bVarArr = c2023a.f9090f;
            if (i >= bVarArr.length) {
                return new ffj0(dfj0VarArr);
            }
            C1894k[] c1894kArr = bVarArr[i].f9105j;
            C1894k[] c1894kArr2 = new C1894k[c1894kArr.length];
            for (int i2 = 0; i2 < c1894kArr.length; i2++) {
                C1894k c1894k = c1894kArr[i2];
                c1894kArr2[i2] = c1894k.m10337c(interfaceC1878c.mo9930c(c1894k));
            }
            dfj0VarArr[i] = new dfj0(Integer.toString(i), c1894kArr2);
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    private static t45<InterfaceC2016b>[] m11750o(int i) {
        return new t45[i];
    }

    /* JADX INFO: renamed from: b */
    public final t45<InterfaceC2016b> m11751b(u9f u9fVar, long j) {
        int iM125388c = this.f9047i.m125388c(u9fVar.mo11361h());
        return new t45<>(this.f9050l.f9090f[iM125388c].f9096a, null, null, this.f9039a.mo11748a(this.f9041c, this.f9050l, iM125388c, u9fVar, this.f9040b, null), this, this.f9046h, j, this.f9042d, this.f9043e, this.f9044f, this.f9045g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        return this.f9052n.mo10977c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        return this.f9052n.mo10978d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        this.f9052n.mo10979e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return this.f9052n.mo10980f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        for (t45<InterfaceC2016b> t45Var : this.f9051m) {
            if (t45Var.f171977a == 2) {
                return t45Var.m189170g(j, nke0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) throws Throwable {
        for (t45<InterfaceC2016b> t45Var : this.f9051m) {
            t45Var.m189168R(j);
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
        return this.f9052n.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return this.f9047i;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f9049k = aVar;
        aVar.mo10275l(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo10270j(t45<InterfaceC2016b> t45Var) {
        this.f9049k.mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        u9f u9fVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < u9fVarArr.length; i++) {
            xwd0 xwd0Var = xwd0VarArr[i];
            if (xwd0Var != null) {
                t45 t45Var = (t45) xwd0Var;
                if (u9fVarArr[i] == null || !zArr[i]) {
                    t45Var.m189165O();
                    xwd0VarArr[i] = null;
                } else {
                    ((InterfaceC2016b) t45Var.m189154D()).mo11745b(u9fVarArr[i]);
                    arrayList.add(t45Var);
                }
            }
            if (xwd0VarArr[i] == null && (u9fVar = u9fVarArr[i]) != null) {
                t45<InterfaceC2016b> t45VarM11751b = m11751b(u9fVar, j);
                arrayList.add(t45VarM11751b);
                xwd0VarArr[i] = t45VarM11751b;
                zArr2[i] = true;
            }
        }
        t45<InterfaceC2016b>[] t45VarArrM11750o = m11750o(arrayList.size());
        this.f9051m = t45VarArrM11750o;
        arrayList.toArray(t45VarArrM11750o);
        this.f9052n = this.f9048j.mo122429a(this.f9051m);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        this.f9041c.mo11081a();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        for (t45<InterfaceC2016b> t45Var : this.f9051m) {
            t45Var.m189171t(j, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11753u() {
        for (t45<InterfaceC2016b> t45Var : this.f9051m) {
            t45Var.m189165O();
        }
        this.f9049k = null;
    }

    /* JADX INFO: renamed from: v */
    public void m11754v(C2023a c2023a) {
        this.f9050l = c2023a;
        for (t45<InterfaceC2016b> t45Var : this.f9051m) {
            ((InterfaceC2016b) t45Var.m189154D()).mo11746f(c2023a);
        }
        this.f9049k.mo10270j(this);
    }
}
