package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1974r;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.C2000a;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import java.io.IOException;
import java.util.ArrayList;
import p149l.as5;
import p149l.b6j0;
import p149l.ice0;
import p149l.l7j0;
import p149l.o8f;
import p149l.s35;
import p149l.sj0;
import p149l.urv;
import p149l.vod0;
import p149l.z5j0;
import p149l.za5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1994c implements InterfaceC1953h, InterfaceC1974r.a<s35<InterfaceC1993b>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1993b.a f9002a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final l7j0 f9003b;

    /* JADX INFO: renamed from: c */
    public final urv f9004c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1855c f9005d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1854b.a f9006e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2049c f9007f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1966j.a f9008g;

    /* JADX INFO: renamed from: h */
    public final sj0 f9009h;

    /* JADX INFO: renamed from: i */
    public final b6j0 f9010i;

    /* JADX INFO: renamed from: j */
    public final as5 f9011j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public InterfaceC1953h.a f9012k;

    /* JADX INFO: renamed from: l */
    public C2000a f9013l;

    /* JADX INFO: renamed from: m */
    public s35<InterfaceC1993b>[] f9014m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1974r f9015n;

    public C1994c(C2000a c2000a, InterfaceC1993b.a aVar, @Nullable l7j0 l7j0Var, as5 as5Var, @Nullable za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar2, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar3, urv urvVar, sj0 sj0Var) {
        this.f9013l = c2000a;
        this.f9002a = aVar;
        this.f9003b = l7j0Var;
        this.f9004c = urvVar;
        this.f9005d = interfaceC1855c;
        this.f9006e = aVar2;
        this.f9007f = interfaceC2049c;
        this.f9008g = aVar3;
        this.f9009h = sj0Var;
        this.f9011j = as5Var;
        this.f9010i = m11695n(c2000a, interfaceC1855c);
        s35<InterfaceC1993b>[] s35VarArrM11696o = m11696o(0);
        this.f9014m = s35VarArrM11696o;
        this.f9015n = as5Var.mo98579a(s35VarArrM11696o);
    }

    /* JADX INFO: renamed from: n */
    public static b6j0 m11695n(C2000a c2000a, InterfaceC1855c interfaceC1855c) {
        z5j0[] z5j0VarArr = new z5j0[c2000a.f9053f.length];
        int i = 0;
        while (true) {
            C2000a.b[] bVarArr = c2000a.f9053f;
            if (i >= bVarArr.length) {
                return new b6j0(z5j0VarArr);
            }
            C1871k[] c1871kArr = bVarArr[i].f9068j;
            C1871k[] c1871kArr2 = new C1871k[c1871kArr.length];
            for (int i2 = 0; i2 < c1871kArr.length; i2++) {
                C1871k c1871k = c1871kArr[i2];
                c1871kArr2[i2] = c1871k.m10283c(interfaceC1855c.mo9876c(c1871k));
            }
            z5j0VarArr[i] = new z5j0(Integer.toString(i), c1871kArr2);
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    private static s35<InterfaceC1993b>[] m11696o(int i) {
        return new s35[i];
    }

    /* JADX INFO: renamed from: b */
    public final s35<InterfaceC1993b> m11697b(o8f o8fVar, long j) {
        int iM100411c = this.f9010i.m100411c(o8fVar.mo11307h());
        return new s35<>(this.f9013l.f9053f[iM100411c].f9059a, null, null, this.f9002a.mo11694a(this.f9004c, this.f9013l, iM100411c, o8fVar, this.f9003b, null), this, this.f9009h, j, this.f9005d, this.f9006e, this.f9007f, this.f9008g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        return this.f9015n.mo10923c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        return this.f9015n.mo10924d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        this.f9015n.mo10925e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return this.f9015n.mo10926f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        for (s35<InterfaceC1993b> s35Var : this.f9014m) {
            if (s35Var.f162042a == 2) {
                return s35Var.m182117g(j, ice0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) throws Throwable {
        for (s35<InterfaceC1993b> s35Var : this.f9014m) {
            s35Var.m182115R(j);
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
        return this.f9015n.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        return this.f9010i;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f9012k = aVar;
        aVar.mo10221l(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo10216j(s35<InterfaceC1993b> s35Var) {
        this.f9012k.mo10216j(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        o8f o8fVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < o8fVarArr.length; i++) {
            vod0 vod0Var = vod0VarArr[i];
            if (vod0Var != null) {
                s35 s35Var = (s35) vod0Var;
                if (o8fVarArr[i] == null || !zArr[i]) {
                    s35Var.m182112O();
                    vod0VarArr[i] = null;
                } else {
                    ((InterfaceC1993b) s35Var.m182101D()).mo11691b(o8fVarArr[i]);
                    arrayList.add(s35Var);
                }
            }
            if (vod0VarArr[i] == null && (o8fVar = o8fVarArr[i]) != null) {
                s35<InterfaceC1993b> s35VarM11697b = m11697b(o8fVar, j);
                arrayList.add(s35VarM11697b);
                vod0VarArr[i] = s35VarM11697b;
                zArr2[i] = true;
            }
        }
        s35<InterfaceC1993b>[] s35VarArrM11696o = m11696o(arrayList.size());
        this.f9014m = s35VarArrM11696o;
        arrayList.toArray(s35VarArrM11696o);
        this.f9015n = this.f9011j.mo98579a(this.f9014m);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        this.f9004c.mo11027a();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        for (s35<InterfaceC1993b> s35Var : this.f9014m) {
            s35Var.m182118t(j, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11699u() {
        for (s35<InterfaceC1993b> s35Var : this.f9014m) {
            s35Var.m182112O();
        }
        this.f9012k = null;
    }

    /* JADX INFO: renamed from: v */
    public void m11700v(C2000a c2000a) {
        this.f9013l = c2000a;
        for (s35<InterfaceC1993b> s35Var : this.f9014m) {
            ((InterfaceC1993b) s35Var.m182101D()).mo11692f(c2000a);
        }
        this.f9012k.mo10216j(this);
    }
}
