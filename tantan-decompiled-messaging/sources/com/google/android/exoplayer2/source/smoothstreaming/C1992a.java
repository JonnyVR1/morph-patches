package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.C2000a;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import p149l.a5c;
import p149l.ab5;
import p149l.eri0;
import p149l.fix;
import p149l.gix;
import p149l.i3j;
import p149l.ice0;
import p149l.l7j0;
import p149l.mp2;
import p149l.n35;
import p149l.o35;
import p149l.o8f;
import p149l.p11;
import p149l.p35;
import p149l.q06;
import p149l.qi3;
import p149l.u5j0;
import p149l.urv;
import p149l.v5j0;
import p149l.x6j0;
import p149l.za5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1992a implements InterfaceC1993b {

    /* JADX INFO: renamed from: a */
    public final urv f8991a;

    /* JADX INFO: renamed from: b */
    public final int f8992b;

    /* JADX INFO: renamed from: c */
    public final o35[] f8993c;

    /* JADX INFO: renamed from: d */
    public final a5c f8994d;

    /* JADX INFO: renamed from: e */
    public o8f f8995e;

    /* JADX INFO: renamed from: f */
    public C2000a f8996f;

    /* JADX INFO: renamed from: g */
    public int f8997g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public IOException f8998h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    public static final class a implements InterfaceC1993b.a {

        /* JADX INFO: renamed from: a */
        public final a5c.InterfaceC15531a f8999a;

        public a(a5c.InterfaceC15531a interfaceC15531a) {
            this.f8999a = interfaceC15531a;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1993b.a
        /* JADX INFO: renamed from: a */
        public InterfaceC1993b mo11694a(urv urvVar, C2000a c2000a, int i, o8f o8fVar, @Nullable l7j0 l7j0Var, @Nullable za5 za5Var) {
            a5c a5cVarMo95019a = this.f8999a.mo95019a();
            if (l7j0Var != null) {
                a5cVarMo95019a.mo11123e(l7j0Var);
            }
            return new C1992a(urvVar, c2000a, i, o8fVar, a5cVarMo95019a, za5Var);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    public static final class b extends mp2 {

        /* JADX INFO: renamed from: e */
        public final C2000a.b f9000e;

        /* JADX INFO: renamed from: f */
        public final int f9001f;

        public b(C2000a.b bVar, int i, int i2) {
            super(i2, bVar.f9069k - 1);
            this.f9000e = bVar;
            this.f9001f = i;
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: a */
        public long mo11090a() {
            return mo11091b() + this.f9000e.m11730c((int) m155762d());
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: b */
        public long mo11091b() {
            m155761c();
            return this.f9000e.m11732e((int) m155762d());
        }
    }

    public C1992a(urv urvVar, C2000a c2000a, int i, o8f o8fVar, a5c a5cVar, @Nullable za5 za5Var) {
        eri0 eri0Var;
        v5j0[] v5j0VarArr;
        this.f8991a = urvVar;
        this.f8996f = c2000a;
        this.f8992b = i;
        this.f8995e = o8fVar;
        this.f8994d = a5cVar;
        C2000a.b bVar = c2000a.f9053f[i];
        this.f8993c = new o35[o8fVar.length()];
        for (int i2 = 0; i2 < this.f8993c.length; i2++) {
            int iMo11302c = o8fVar.mo11302c(i2);
            C1871k c1871k = bVar.f9068j[iMo11302c];
            if (c1871k.f7751o != null) {
                v5j0VarArr = ((C2000a.a) p11.m167011e(c2000a.f9052e)).f9058c;
                eri0Var = null;
            } else {
                eri0Var = null;
                v5j0VarArr = null;
            }
            int i3 = bVar.f9059a;
            this.f8993c[i2] = new qi3(new i3j(3, eri0Var, new u5j0(iMo11302c, i3, bVar.f9061c, -9223372036854775807L, c2000a.f9054g, c1871k, 0, v5j0VarArr, i3 == 2 ? 4 : 0, null, null)), bVar.f9059a, c1871k);
        }
    }

    /* JADX INFO: renamed from: k */
    public static fix m11690k(C1871k c1871k, a5c a5cVar, Uri uri, int i, long j, long j2, long j3, int i2, @Nullable Object obj, o35 o35Var, @Nullable ab5 ab5Var) {
        return new q06(a5cVar, new C2047a.b().m12116i(uri).m12112e(ImmutableMap.m15715of()).m12108a(), c1871k, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, o35Var);
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: a */
    public void mo11062a() throws IOException {
        IOException iOException = this.f8998h;
        if (iOException != null) {
            throw iOException;
        }
        this.f8991a.mo11027a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1993b
    /* JADX INFO: renamed from: b */
    public void mo11691b(o8f o8fVar) {
        this.f8995e = o8fVar;
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: c */
    public boolean mo11063c(long j, n35 n35Var, List<? extends fix> list) {
        if (this.f8998h != null) {
            return false;
        }
        return this.f8995e.mo11315p(j, n35Var, list);
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: d */
    public int mo11064d(long j, List<? extends fix> list) {
        return (this.f8998h != null || this.f8995e.length() < 2) ? list.size() : this.f8995e.mo11308i(j, list);
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: e */
    public boolean mo11065e(n35 n35Var, boolean z, InterfaceC2049c.c cVar, InterfaceC2049c interfaceC2049c) {
        InterfaceC2049c.b bVarMo12119b = interfaceC2049c.mo12119b(x6j0.m207178c(this.f8995e), cVar);
        if (!z || bVarMo12119b == null || bVarMo12119b.f9518a != 2) {
            return false;
        }
        o8f o8fVar = this.f8995e;
        return o8fVar.mo11303d(o8fVar.mo11317r(n35Var.f136914d), bVarMo12119b.f9519b);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1993b
    /* JADX INFO: renamed from: f */
    public void mo11692f(C2000a c2000a) {
        C2000a.b[] bVarArr = this.f8996f.f9053f;
        int i = this.f8992b;
        C2000a.b bVar = bVarArr[i];
        int i2 = bVar.f9069k;
        C2000a.b bVar2 = c2000a.f9053f[i];
        if (i2 == 0 || bVar2.f9069k == 0) {
            this.f8997g += i2;
        } else {
            int i3 = i2 - 1;
            long jM11732e = bVar.m11732e(i3) + bVar.m11730c(i3);
            long jM11732e2 = bVar2.m11732e(0);
            int i4 = this.f8997g;
            if (jM11732e <= jM11732e2) {
                this.f8997g = i4 + i2;
            } else {
                this.f8997g = i4 + bVar.m11731d(jM11732e2);
            }
        }
        this.f8996f = c2000a;
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: g */
    public long mo11066g(long j, ice0 ice0Var) {
        C2000a.b bVar = this.f8996f.f9053f[this.f8992b];
        int iM11731d = bVar.m11731d(j);
        long jM11732e = bVar.m11732e(iM11731d);
        return ice0Var.m135351a(j, jM11732e, (jM11732e >= j || iM11731d >= bVar.f9069k + (-1)) ? jM11732e : bVar.m11732e(iM11731d + 1));
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: h */
    public final void mo11067h(long j, long j2, List<? extends fix> list, p35 p35Var) {
        List<? extends fix> list2;
        int iMo121564g;
        o8f o8fVar;
        long j3 = j2;
        if (this.f8998h != null) {
            return;
        }
        C2000a c2000a = this.f8996f;
        C2000a.b bVar = c2000a.f9053f[this.f8992b];
        if (bVar.f9069k == 0) {
            p35Var.f146961b = !c2000a.f9051d;
            return;
        }
        if (list.isEmpty()) {
            iMo121564g = bVar.m11731d(j3);
            list2 = list;
        } else {
            list2 = list;
            iMo121564g = (int) (list2.get(list.size() - 1).mo121564g() - ((long) this.f8997g));
            if (iMo121564g < 0) {
                this.f8998h = new BehindLiveWindowException();
                return;
            }
        }
        if (iMo121564g >= bVar.f9069k) {
            p35Var.f146961b = !this.f8996f.f9051d;
            return;
        }
        long j4 = j3 - j;
        long jM11693l = m11693l(j);
        int length = this.f8995e.length();
        gix[] gixVarArr = new gix[length];
        int i = 0;
        while (true) {
            o8fVar = this.f8995e;
            if (i >= length) {
                break;
            }
            gixVarArr[i] = new b(bVar, o8fVar.mo11302c(i), iMo121564g);
            i++;
        }
        o8fVar.mo11306g(j, j4, jM11693l, list2, gixVarArr);
        long jM11732e = bVar.m11732e(iMo121564g);
        long jM11730c = jM11732e + bVar.m11730c(iMo121564g);
        if (!list.isEmpty()) {
            j3 = -9223372036854775807L;
        }
        long j5 = j3;
        int i2 = iMo121564g + this.f8997g;
        int iMo11301b = this.f8995e.mo11301b();
        p35Var.f146960a = m11690k(this.f8995e.mo11310k(), this.f8994d, bVar.m11728a(this.f8995e.mo11302c(iMo11301b), iMo121564g), i2, jM11732e, jM11730c, j5, this.f8995e.mo11318s(), this.f8995e.mo11314o(), this.f8993c[iMo11301b], null);
    }

    /* JADX INFO: renamed from: l */
    public final long m11693l(long j) {
        C2000a c2000a = this.f8996f;
        if (!c2000a.f9051d) {
            return -9223372036854775807L;
        }
        C2000a.b bVar = c2000a.f9053f[this.f8992b];
        int i = bVar.f9069k - 1;
        return (bVar.m11732e(i) + bVar.m11730c(i)) - j;
    }

    @Override // p149l.t35
    public void release() {
        for (o35 o35Var : this.f8993c) {
            o35Var.release();
        }
    }

    @Override // p149l.t35
    /* JADX INFO: renamed from: j */
    public void mo11068j(n35 n35Var) {
    }
}
