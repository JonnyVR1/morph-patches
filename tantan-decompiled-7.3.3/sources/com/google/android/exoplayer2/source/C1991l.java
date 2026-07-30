package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p153l.crx;
import p153l.dfj0;
import p153l.drx;
import p153l.et5;
import p153l.ffj0;
import p153l.nke0;
import p153l.o45;
import p153l.p1j;
import p153l.u9f;
import p153l.w11;
import p153l.wtq0;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1991l implements InterfaceC1976h, InterfaceC1976h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1976h[] f8691a;

    /* JADX INFO: renamed from: c */
    public final et5 f8693c;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC1976h.a f8696f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ffj0 f8697g;

    /* JADX INFO: renamed from: i */
    public InterfaceC1997r f8699i;

    /* JADX INFO: renamed from: d */
    public final ArrayList<InterfaceC1976h> f8694d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<dfj0, dfj0> f8695e = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap<xwd0, Integer> f8692b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h */
    public InterfaceC1976h[] f8698h = new InterfaceC1976h[0];

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.l$a */
    public static final class a implements u9f {

        /* JADX INFO: renamed from: a */
        public final u9f f8700a;

        /* JADX INFO: renamed from: b */
        public final dfj0 f8701b;

        public a(u9f u9fVar, dfj0 dfj0Var) {
            this.f8700a = u9fVar;
            this.f8701b = dfj0Var;
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: a */
        public boolean mo11354a(int i, long j) {
            return this.f8700a.mo11354a(i, j);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: b */
        public int mo11355b() {
            return this.f8700a.mo11355b();
        }

        @Override // p153l.vfj0
        /* JADX INFO: renamed from: c */
        public int mo11356c(int i) {
            return this.f8700a.mo11356c(i);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: d */
        public boolean mo11357d(int i, long j) {
            return this.f8700a.mo11357d(i, j);
        }

        @Override // p153l.u9f
        public void disable() {
            this.f8700a.disable();
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: e */
        public void mo11358e() {
            this.f8700a.mo11358e();
        }

        @Override // p153l.u9f
        public void enable() {
            this.f8700a.enable();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8700a.equals(aVar.f8700a) && this.f8701b.equals(aVar.f8701b);
        }

        @Override // p153l.vfj0
        /* JADX INFO: renamed from: f */
        public int mo11359f(int i) {
            return this.f8700a.mo11359f(i);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: g */
        public void mo11360g(long j, long j2, long j3, List<? extends crx> list, drx[] drxVarArr) {
            this.f8700a.mo11360g(j, j2, j3, list, drxVarArr);
        }

        @Override // p153l.vfj0
        /* JADX INFO: renamed from: h */
        public dfj0 mo11361h() {
            return this.f8701b;
        }

        public int hashCode() {
            return ((527 + this.f8701b.hashCode()) * 31) + this.f8700a.hashCode();
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: i */
        public int mo11362i(long j, List<? extends crx> list) {
            return this.f8700a.mo11362i(j, list);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: j */
        public int mo11363j() {
            return this.f8700a.mo11363j();
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: k */
        public C1894k mo11364k() {
            return this.f8700a.mo11364k();
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: l */
        public void mo11365l() {
            this.f8700a.mo11365l();
        }

        @Override // p153l.vfj0
        public int length() {
            return this.f8700a.length();
        }

        @Override // p153l.vfj0
        /* JADX INFO: renamed from: m */
        public C1894k mo11366m(int i) {
            return this.f8700a.mo11366m(i);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: n */
        public void mo11367n(float f) {
            this.f8700a.mo11367n(f);
        }

        @Override // p153l.u9f
        @Nullable
        /* JADX INFO: renamed from: o */
        public Object mo11368o() {
            return this.f8700a.mo11368o();
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: p */
        public boolean mo11369p(long j, o45 o45Var, List<? extends crx> list) {
            return this.f8700a.mo11369p(j, o45Var, list);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: q */
        public void mo11370q(boolean z) {
            this.f8700a.mo11370q(z);
        }

        @Override // p153l.vfj0
        /* JADX INFO: renamed from: r */
        public int mo11371r(C1894k c1894k) {
            return this.f8700a.mo11371r(c1894k);
        }

        @Override // p153l.u9f
        /* JADX INFO: renamed from: s */
        public int mo11372s() {
            return this.f8700a.mo11372s();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.l$b */
    public static final class b implements InterfaceC1976h, InterfaceC1976h.a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1976h f8702a;

        /* JADX INFO: renamed from: b */
        public final long f8703b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1976h.a f8704c;

        public b(InterfaceC1976h interfaceC1976h, long j) {
            this.f8702a = interfaceC1976h;
            this.f8703b = j;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
        /* JADX INFO: renamed from: c */
        public boolean mo10977c(long j) {
            return this.f8702a.mo10977c(j - this.f8703b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
        /* JADX INFO: renamed from: d */
        public long mo10978d() {
            long jMo10978d = this.f8702a.mo10978d();
            if (jMo10978d == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return jMo10978d + this.f8703b;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
        /* JADX INFO: renamed from: e */
        public void mo10979e(long j) {
            this.f8702a.mo10979e(j - this.f8703b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
        /* JADX INFO: renamed from: f */
        public long mo10980f() {
            long jMo10980f = this.f8702a.mo10980f();
            if (jMo10980f == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return jMo10980f + this.f8703b;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: g */
        public long mo10981g(long j, nke0 nke0Var) {
            return this.f8702a.mo10981g(j - this.f8703b, nke0Var) + this.f8703b;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: h */
        public long mo10982h(long j) {
            return this.f8702a.mo10982h(j - this.f8703b) + this.f8703b;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: i */
        public long mo10983i() {
            long jMo10983i = this.f8702a.mo10983i();
            if (jMo10983i == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return jMo10983i + this.f8703b;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
        public boolean isLoading() {
            return this.f8702a.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h.a
        /* JADX INFO: renamed from: l */
        public void mo10275l(InterfaceC1976h interfaceC1976h) {
            ((InterfaceC1976h.a) w11.m204369e(this.f8704c)).mo10275l(this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: m */
        public ffj0 mo10984m() {
            return this.f8702a.mo10984m();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo10270j(InterfaceC1976h interfaceC1976h) {
            ((InterfaceC1976h.a) w11.m204369e(this.f8704c)).mo10270j(this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: p */
        public void mo10987p(InterfaceC1976h.a aVar, long j) {
            this.f8704c = aVar;
            this.f8702a.mo10987p(this, j - this.f8703b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: r */
        public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
            xwd0[] xwd0VarArr2 = new xwd0[xwd0VarArr.length];
            int i = 0;
            while (true) {
                xwd0 xwd0VarM11375c = null;
                if (i >= xwd0VarArr.length) {
                    break;
                }
                c cVar = (c) xwd0VarArr[i];
                if (cVar != null) {
                    xwd0VarM11375c = cVar.m11375c();
                }
                xwd0VarArr2[i] = xwd0VarM11375c;
                i++;
            }
            long jMo10989r = this.f8702a.mo10989r(u9fVarArr, zArr, xwd0VarArr2, zArr2, j - this.f8703b);
            for (int i2 = 0; i2 < xwd0VarArr.length; i2++) {
                xwd0 xwd0Var = xwd0VarArr2[i2];
                if (xwd0Var == null) {
                    xwd0VarArr[i2] = null;
                } else {
                    xwd0 xwd0Var2 = xwd0VarArr[i2];
                    if (xwd0Var2 == null || ((c) xwd0Var2).m11375c() != xwd0Var) {
                        xwd0VarArr[i2] = new c(xwd0Var, this.f8703b);
                    }
                }
            }
            return jMo10989r + this.f8703b;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: s */
        public void mo10990s() throws IOException {
            this.f8702a.mo10990s();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1976h
        /* JADX INFO: renamed from: t */
        public void mo10991t(long j, boolean z) {
            this.f8702a.mo10991t(j - this.f8703b, z);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.l$c */
    public static final class c implements xwd0 {

        /* JADX INFO: renamed from: a */
        public final xwd0 f8705a;

        /* JADX INFO: renamed from: b */
        public final long f8706b;

        public c(xwd0 xwd0Var, long j) {
            this.f8705a = xwd0Var;
            this.f8706b = j;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: a */
        public void mo10993a() throws IOException {
            this.f8705a.mo10993a();
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: b */
        public boolean mo10994b() {
            return this.f8705a.mo10994b();
        }

        /* JADX INFO: renamed from: c */
        public xwd0 m11375c() {
            return this.f8705a;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: k */
        public int mo10996k(long j) {
            return this.f8705a.mo10996k(j - this.f8706b);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: l */
        public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            int iMo10997l = this.f8705a.mo10997l(p1jVar, decoderInputBuffer, i);
            if (iMo10997l == -4) {
                decoderInputBuffer.f7414e = Math.max(0L, decoderInputBuffer.f7414e + this.f8706b);
            }
            return iMo10997l;
        }
    }

    public C1991l(et5 et5Var, long[] jArr, InterfaceC1976h... interfaceC1976hArr) {
        this.f8693c = et5Var;
        this.f8691a = interfaceC1976hArr;
        this.f8699i = et5Var.mo122429a(new InterfaceC1997r[0]);
        for (int i = 0; i < interfaceC1976hArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f8691a[i] = new b(interfaceC1976hArr[i], j);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1976h m11352b(int i) {
        InterfaceC1976h interfaceC1976h = this.f8691a[i];
        return interfaceC1976h instanceof b ? ((b) interfaceC1976h).f8702a : interfaceC1976h;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        if (this.f8694d.isEmpty()) {
            return this.f8699i.mo10977c(j);
        }
        int size = this.f8694d.size();
        for (int i = 0; i < size; i++) {
            this.f8694d.get(i).mo10977c(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        return this.f8699i.mo10978d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        this.f8699i.mo10979e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return this.f8699i.mo10980f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        InterfaceC1976h[] interfaceC1976hArr = this.f8698h;
        return (interfaceC1976hArr.length > 0 ? interfaceC1976hArr[0] : this.f8691a[0]).mo10981g(j, nke0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        long jMo10982h = this.f8698h[0].mo10982h(j);
        int i = 1;
        while (true) {
            InterfaceC1976h[] interfaceC1976hArr = this.f8698h;
            if (i >= interfaceC1976hArr.length) {
                return jMo10982h;
            }
            if (interfaceC1976hArr[i].mo10982h(jMo10982h) != jMo10982h) {
                wtq0.m207906a("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        long j;
        InterfaceC1976h interfaceC1976h;
        InterfaceC1976h[] interfaceC1976hArr = this.f8698h;
        int length = interfaceC1976hArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            InterfaceC1976h interfaceC1976h2 = interfaceC1976hArr[i];
            long jMo10983i = interfaceC1976h2.mo10983i();
            if (jMo10983i == j2) {
                j = j2;
                if (j3 != j && interfaceC1976h2.mo10982h(j3) != j3) {
                    wtq0.m207906a("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                InterfaceC1976h[] interfaceC1976hArr2 = this.f8698h;
                int length2 = interfaceC1976hArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (interfaceC1976h = interfaceC1976hArr2[i2]) == interfaceC1976h2) {
                        break;
                    }
                    if (interfaceC1976h.mo10982h(jMo10983i) != jMo10983i) {
                        wtq0.m207906a("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jMo10983i;
            } else {
                j = j2;
                if (jMo10983i != j3) {
                    wtq0.m207906a("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f8699i.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h.a
    /* JADX INFO: renamed from: l */
    public void mo10275l(InterfaceC1976h interfaceC1976h) {
        this.f8694d.remove(interfaceC1976h);
        if (!this.f8694d.isEmpty()) {
            return;
        }
        int i = 0;
        for (InterfaceC1976h interfaceC1976h2 : this.f8691a) {
            i += interfaceC1976h2.mo10984m().f98785a;
        }
        dfj0[] dfj0VarArr = new dfj0[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            InterfaceC1976h[] interfaceC1976hArr = this.f8691a;
            if (i2 >= interfaceC1976hArr.length) {
                this.f8697g = new ffj0(dfj0VarArr);
                ((InterfaceC1976h.a) w11.m204369e(this.f8696f)).mo10275l(this);
                return;
            }
            ffj0 ffj0VarMo10984m = interfaceC1976hArr[i2].mo10984m();
            int i4 = ffj0VarMo10984m.f98785a;
            int i5 = 0;
            while (i5 < i4) {
                dfj0 dfj0VarM125387b = ffj0VarMo10984m.m125387b(i5);
                dfj0 dfj0VarM115518b = dfj0VarM125387b.m115518b(i2 + ":" + dfj0VarM125387b.f88160b);
                this.f8695e.put(dfj0VarM115518b, dfj0VarM125387b);
                dfj0VarArr[i3] = dfj0VarM115518b;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return (ffj0) w11.m204369e(this.f8697g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo10270j(InterfaceC1976h interfaceC1976h) {
        ((InterfaceC1976h.a) w11.m204369e(this.f8696f)).mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f8696f = aVar;
        Collections.addAll(this.f8694d, this.f8691a);
        for (InterfaceC1976h interfaceC1976h : this.f8691a) {
            interfaceC1976h.mo10987p(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[u9fVarArr.length];
        int[] iArr2 = new int[u9fVarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < u9fVarArr.length; i2++) {
            xwd0 xwd0Var = xwd0VarArr[i2];
            Integer num = xwd0Var == null ? null : this.f8692b.get(xwd0Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            u9f u9fVar = u9fVarArr[i2];
            if (u9fVar != null) {
                String str = u9fVar.mo11361h().f88160b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
        }
        this.f8692b.clear();
        int length = u9fVarArr.length;
        xwd0[] xwd0VarArr2 = new xwd0[length];
        xwd0[] xwd0VarArr3 = new xwd0[u9fVarArr.length];
        u9f[] u9fVarArr2 = new u9f[u9fVarArr.length];
        ArrayList arrayList = new ArrayList(this.f8691a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f8691a.length) {
            for (int i4 = i; i4 < u9fVarArr.length; i4++) {
                xwd0VarArr3[i4] = iArr[i4] == i3 ? xwd0VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    u9f u9fVar2 = (u9f) w11.m204369e(u9fVarArr[i4]);
                    u9fVarArr2[i4] = new a(u9fVar2, (dfj0) w11.m204369e(this.f8695e.get(u9fVar2.mo11361h())));
                } else {
                    u9fVarArr2[i4] = null;
                }
            }
            int i5 = i3;
            long jMo10989r = this.f8691a[i3].mo10989r(u9fVarArr2, zArr, xwd0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jMo10989r;
            } else if (jMo10989r != j2) {
                wtq0.m207906a("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < u9fVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    xwd0 xwd0Var2 = (xwd0) w11.m204369e(xwd0VarArr3[i6]);
                    xwd0VarArr2[i6] = xwd0VarArr3[i6];
                    this.f8692b.put(xwd0Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    w11.m204371g(xwd0VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(this.f8691a[i5]);
            }
            i3 = i5 + 1;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(xwd0VarArr2, i7, xwd0VarArr, i7, length);
        InterfaceC1976h[] interfaceC1976hArr = (InterfaceC1976h[]) arrayList.toArray(new InterfaceC1976h[i7]);
        this.f8698h = interfaceC1976hArr;
        this.f8699i = this.f8693c.mo122429a(interfaceC1976hArr);
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        for (InterfaceC1976h interfaceC1976h : this.f8691a) {
            interfaceC1976h.mo10990s();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        for (InterfaceC1976h interfaceC1976h : this.f8698h) {
            interfaceC1976h.mo10991t(j, z);
        }
    }
}
