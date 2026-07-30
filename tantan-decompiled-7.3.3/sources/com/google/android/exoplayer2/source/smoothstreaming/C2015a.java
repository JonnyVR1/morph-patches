package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.C2023a;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import p153l.ac5;
import p153l.bgj0;
import p153l.crx;
import p153l.d6j;
import p153l.dq2;
import p153l.drx;
import p153l.ej3;
import p153l.g6c;
import p153l.h0j0;
import p153l.nke0;
import p153l.o45;
import p153l.p45;
import p153l.pgj0;
import p153l.q45;
import p153l.u9f;
import p153l.v16;
import p153l.vtv;
import p153l.w11;
import p153l.yej0;
import p153l.zb5;
import p153l.zej0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C2015a implements InterfaceC2016b {

    /* JADX INFO: renamed from: a */
    public final vtv f9028a;

    /* JADX INFO: renamed from: b */
    public final int f9029b;

    /* JADX INFO: renamed from: c */
    public final p45[] f9030c;

    /* JADX INFO: renamed from: d */
    public final g6c f9031d;

    /* JADX INFO: renamed from: e */
    public u9f f9032e;

    /* JADX INFO: renamed from: f */
    public C2023a f9033f;

    /* JADX INFO: renamed from: g */
    public int f9034g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public IOException f9035h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    public static final class a implements InterfaceC2016b.a {

        /* JADX INFO: renamed from: a */
        public final g6c.InterfaceC17163a f9036a;

        public a(g6c.InterfaceC17163a interfaceC17163a) {
            this.f9036a = interfaceC17163a;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC2016b.a
        /* JADX INFO: renamed from: a */
        public InterfaceC2016b mo11748a(vtv vtvVar, C2023a c2023a, int i, u9f u9fVar, @Nullable pgj0 pgj0Var, @Nullable zb5 zb5Var) {
            g6c g6cVarMo129219a = this.f9036a.mo129219a();
            if (pgj0Var != null) {
                g6cVarMo129219a.mo11177e(pgj0Var);
            }
            return new C2015a(vtvVar, c2023a, i, u9fVar, g6cVarMo129219a, zb5Var);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    public static final class b extends dq2 {

        /* JADX INFO: renamed from: e */
        public final C2023a.b f9037e;

        /* JADX INFO: renamed from: f */
        public final int f9038f;

        public b(C2023a.b bVar, int i, int i2) {
            super(i2, bVar.f9106k - 1);
            this.f9037e = bVar;
            this.f9038f = i;
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: a */
        public long mo11144a() {
            return mo11145b() + this.f9037e.m11784c((int) m117441d());
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: b */
        public long mo11145b() {
            m117440c();
            return this.f9037e.m11786e((int) m117441d());
        }
    }

    public C2015a(vtv vtvVar, C2023a c2023a, int i, u9f u9fVar, g6c g6cVar, @Nullable zb5 zb5Var) {
        h0j0 h0j0Var;
        zej0[] zej0VarArr;
        this.f9028a = vtvVar;
        this.f9033f = c2023a;
        this.f9029b = i;
        this.f9032e = u9fVar;
        this.f9031d = g6cVar;
        C2023a.b bVar = c2023a.f9090f[i];
        this.f9030c = new p45[u9fVar.length()];
        for (int i2 = 0; i2 < this.f9030c.length; i2++) {
            int iMo11356c = u9fVar.mo11356c(i2);
            C1894k c1894k = bVar.f9105j[iMo11356c];
            if (c1894k.f7788o != null) {
                zej0VarArr = ((C2023a.a) w11.m204369e(c2023a.f9089e)).f9095c;
                h0j0Var = null;
            } else {
                h0j0Var = null;
                zej0VarArr = null;
            }
            int i3 = bVar.f9096a;
            this.f9030c[i2] = new ej3(new d6j(3, h0j0Var, new yej0(iMo11356c, i3, bVar.f9098c, -9223372036854775807L, c2023a.f9091g, c1894k, 0, zej0VarArr, i3 == 2 ? 4 : 0, null, null)), bVar.f9096a, c1894k);
        }
    }

    /* JADX INFO: renamed from: k */
    public static crx m11744k(C1894k c1894k, g6c g6cVar, Uri uri, int i, long j, long j2, long j3, int i2, @Nullable Object obj, p45 p45Var, @Nullable ac5 ac5Var) {
        return new v16(g6cVar, new C2070a.b().m12170i(uri).m12166e(ImmutableMap.m15769of()).m12162a(), c1894k, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, p45Var);
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: a */
    public void mo11116a() throws IOException {
        IOException iOException = this.f9035h;
        if (iOException != null) {
            throw iOException;
        }
        this.f9028a.mo11081a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC2016b
    /* JADX INFO: renamed from: b */
    public void mo11745b(u9f u9fVar) {
        this.f9032e = u9fVar;
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: c */
    public boolean mo11117c(long j, o45 o45Var, List<? extends crx> list) {
        if (this.f9035h != null) {
            return false;
        }
        return this.f9032e.mo11369p(j, o45Var, list);
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: d */
    public int mo11118d(long j, List<? extends crx> list) {
        return (this.f9035h != null || this.f9032e.length() < 2) ? list.size() : this.f9032e.mo11362i(j, list);
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: e */
    public boolean mo11119e(o45 o45Var, boolean z, InterfaceC2072c.c cVar, InterfaceC2072c interfaceC2072c) {
        InterfaceC2072c.b bVarMo12173b = interfaceC2072c.mo12173b(bgj0.m104226c(this.f9032e), cVar);
        if (!z || bVarMo12173b == null || bVarMo12173b.f9555a != 2) {
            return false;
        }
        u9f u9fVar = this.f9032e;
        return u9fVar.mo11357d(u9fVar.mo11371r(o45Var.f144929d), bVarMo12173b.f9556b);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC2016b
    /* JADX INFO: renamed from: f */
    public void mo11746f(C2023a c2023a) {
        C2023a.b[] bVarArr = this.f9033f.f9090f;
        int i = this.f9029b;
        C2023a.b bVar = bVarArr[i];
        int i2 = bVar.f9106k;
        C2023a.b bVar2 = c2023a.f9090f[i];
        if (i2 == 0 || bVar2.f9106k == 0) {
            this.f9034g += i2;
        } else {
            int i3 = i2 - 1;
            long jM11786e = bVar.m11786e(i3) + bVar.m11784c(i3);
            long jM11786e2 = bVar2.m11786e(0);
            int i4 = this.f9034g;
            if (jM11786e <= jM11786e2) {
                this.f9034g = i4 + i2;
            } else {
                this.f9034g = i4 + bVar.m11785d(jM11786e2);
            }
        }
        this.f9033f = c2023a;
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: g */
    public long mo11120g(long j, nke0 nke0Var) {
        C2023a.b bVar = this.f9033f.f9090f[this.f9029b];
        int iM11785d = bVar.m11785d(j);
        long jM11786e = bVar.m11786e(iM11785d);
        return nke0Var.m163601a(j, jM11786e, (jM11786e >= j || iM11785d >= bVar.f9106k + (-1)) ? jM11786e : bVar.m11786e(iM11785d + 1));
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: h */
    public final void mo11121h(long j, long j2, List<? extends crx> list, q45 q45Var) {
        List<? extends crx> list2;
        int iMo112089g;
        u9f u9fVar;
        long j3 = j2;
        if (this.f9035h != null) {
            return;
        }
        C2023a c2023a = this.f9033f;
        C2023a.b bVar = c2023a.f9090f[this.f9029b];
        if (bVar.f9106k == 0) {
            q45Var.f155521b = !c2023a.f9088d;
            return;
        }
        if (list.isEmpty()) {
            iMo112089g = bVar.m11785d(j3);
            list2 = list;
        } else {
            list2 = list;
            iMo112089g = (int) (list2.get(list.size() - 1).mo112089g() - ((long) this.f9034g));
            if (iMo112089g < 0) {
                this.f9035h = new BehindLiveWindowException();
                return;
            }
        }
        if (iMo112089g >= bVar.f9106k) {
            q45Var.f155521b = !this.f9033f.f9088d;
            return;
        }
        long j4 = j3 - j;
        long jM11747l = m11747l(j);
        int length = this.f9032e.length();
        drx[] drxVarArr = new drx[length];
        int i = 0;
        while (true) {
            u9fVar = this.f9032e;
            if (i >= length) {
                break;
            }
            drxVarArr[i] = new b(bVar, u9fVar.mo11356c(i), iMo112089g);
            i++;
        }
        u9fVar.mo11360g(j, j4, jM11747l, list2, drxVarArr);
        long jM11786e = bVar.m11786e(iMo112089g);
        long jM11784c = jM11786e + bVar.m11784c(iMo112089g);
        if (!list.isEmpty()) {
            j3 = -9223372036854775807L;
        }
        long j5 = j3;
        int i2 = iMo112089g + this.f9034g;
        int iMo11355b = this.f9032e.mo11355b();
        q45Var.f155520a = m11744k(this.f9032e.mo11364k(), this.f9031d, bVar.m11782a(this.f9032e.mo11356c(iMo11355b), iMo112089g), i2, jM11786e, jM11784c, j5, this.f9032e.mo11372s(), this.f9032e.mo11368o(), this.f9030c[iMo11355b], null);
    }

    /* JADX INFO: renamed from: l */
    public final long m11747l(long j) {
        C2023a c2023a = this.f9033f;
        if (!c2023a.f9088d) {
            return -9223372036854775807L;
        }
        C2023a.b bVar = c2023a.f9090f[this.f9029b];
        int i = bVar.f9106k - 1;
        return (bVar.m11786e(i) + bVar.m11784c(i)) - j;
    }

    @Override // p153l.u45
    public void release() {
        for (p45 p45Var : this.f9030c) {
            p45Var.release();
        }
    }

    @Override // p153l.u45
    /* JADX INFO: renamed from: j */
    public void mo11122j(o45 o45Var) {
    }
}
