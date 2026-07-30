package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import p153l.bmk0;
import p153l.ffj0;
import p153l.kb00;
import p153l.nke0;
import p153l.p1j;
import p153l.u9f;
import p153l.w11;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1958b implements InterfaceC1976h, InterfaceC1976h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1976h f8320a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC1976h.a f8321b;

    /* JADX INFO: renamed from: c */
    public a[] f8322c = new a[0];

    /* JADX INFO: renamed from: d */
    public long f8323d;

    /* JADX INFO: renamed from: e */
    public long f8324e;

    /* JADX INFO: renamed from: f */
    public long f8325f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ClippingMediaSource.IllegalClippingException f8326g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.b$a */
    public final class a implements xwd0 {

        /* JADX INFO: renamed from: a */
        public final xwd0 f8327a;

        /* JADX INFO: renamed from: b */
        public boolean f8328b;

        public a(xwd0 xwd0Var) {
            this.f8327a = xwd0Var;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: a */
        public void mo10993a() throws IOException {
            this.f8327a.mo10993a();
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: b */
        public boolean mo10994b() {
            return !C1958b.this.m10985n() && this.f8327a.mo10994b();
        }

        /* JADX INFO: renamed from: c */
        public void m10995c() {
            this.f8328b = false;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: k */
        public int mo10996k(long j) {
            if (C1958b.this.m10985n()) {
                return -3;
            }
            return this.f8327a.mo10996k(j);
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: l */
        public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (C1958b.this.m10985n()) {
                return -3;
            }
            if (this.f8328b) {
                decoderInputBuffer.m97783t(4);
                return -4;
            }
            long jMo10978d = C1958b.this.mo10978d();
            int iMo10997l = this.f8327a.mo10997l(p1jVar, decoderInputBuffer, i);
            if (iMo10997l == -5) {
                C1894k c1894k = (C1894k) w11.m204369e(p1jVar.f150174b);
                int i2 = c1894k.f7767B;
                if (i2 != 0 || c1894k.f7768C != 0) {
                    C1958b c1958b = C1958b.this;
                    if (c1958b.f8324e != 0) {
                        i2 = 0;
                    }
                    p1jVar.f150174b = c1894k.m10336b().m10383P(i2).m10384Q(c1958b.f8325f == Long.MIN_VALUE ? c1894k.f7768C : 0).m10374G();
                }
                return -5;
            }
            long j = C1958b.this.f8325f;
            if (j == Long.MIN_VALUE || ((iMo10997l != -4 || decoderInputBuffer.f7414e < j) && !(iMo10997l == -3 && jMo10978d == Long.MIN_VALUE && !decoderInputBuffer.f7413d))) {
                return iMo10997l;
            }
            decoderInputBuffer.mo9857i();
            decoderInputBuffer.m97783t(4);
            this.f8328b = true;
            return -4;
        }
    }

    public C1958b(InterfaceC1976h interfaceC1976h, boolean z, long j, long j2) {
        this.f8320a = interfaceC1976h;
        this.f8323d = z ? j : -9223372036854775807L;
        this.f8324e = j;
        this.f8325f = j2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10975u(long j, u9f[] u9fVarArr) {
        if (j != 0) {
            for (u9f u9fVar : u9fVarArr) {
                if (u9fVar != null) {
                    C1894k c1894kMo11364k = u9fVar.mo11364k();
                    if (!kb00.m149000a(c1894kMo11364k.f7785l, c1894kMo11364k.f7782i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final nke0 m10976b(long j, nke0 nke0Var) {
        long jM105164r = bmk0.m105164r(nke0Var.f142454a, 0L, j - this.f8324e);
        long j2 = nke0Var.f142455b;
        long j3 = this.f8325f;
        long jM105164r2 = bmk0.m105164r(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jM105164r == nke0Var.f142454a && jM105164r2 == nke0Var.f142455b) ? nke0Var : new nke0(jM105164r, jM105164r2);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        return this.f8320a.mo10977c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        long jMo10978d = this.f8320a.mo10978d();
        if (jMo10978d != Long.MIN_VALUE) {
            long j = this.f8325f;
            if (j == Long.MIN_VALUE || jMo10978d < j) {
                return jMo10978d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        this.f8320a.mo10979e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        long jMo10980f = this.f8320a.mo10980f();
        if (jMo10980f != Long.MIN_VALUE) {
            long j = this.f8325f;
            if (j == Long.MIN_VALUE || jMo10980f < j) {
                return jMo10980f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        long j2 = this.f8324e;
        if (j == j2) {
            return j2;
        }
        return this.f8320a.mo10981g(j, m10976b(j, nke0Var));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        this.f8323d = -9223372036854775807L;
        boolean z = false;
        for (a aVar : this.f8322c) {
            if (aVar != null) {
                aVar.m10995c();
            }
        }
        long jMo10982h = this.f8320a.mo10982h(j);
        if (jMo10982h == j) {
            z = true;
        } else if (jMo10982h >= this.f8324e) {
            long j2 = this.f8325f;
            if (j2 == Long.MIN_VALUE || jMo10982h <= j2) {
                z = true;
            }
        }
        w11.m204371g(z);
        return jMo10982h;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        if (m10985n()) {
            long j = this.f8323d;
            this.f8323d = -9223372036854775807L;
            long jMo10983i = mo10983i();
            return jMo10983i != -9223372036854775807L ? jMo10983i : j;
        }
        long jMo10983i2 = this.f8320a.mo10983i();
        if (jMo10983i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        w11.m204371g(jMo10983i2 >= this.f8324e);
        long j2 = this.f8325f;
        w11.m204371g(j2 == Long.MIN_VALUE || jMo10983i2 <= j2);
        return jMo10983i2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f8320a.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h.a
    /* JADX INFO: renamed from: l */
    public void mo10275l(InterfaceC1976h interfaceC1976h) {
        if (this.f8326g != null) {
            return;
        }
        ((InterfaceC1976h.a) w11.m204369e(this.f8321b)).mo10275l(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return this.f8320a.mo10984m();
    }

    /* JADX INFO: renamed from: n */
    public boolean m10985n() {
        return this.f8323d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo10270j(InterfaceC1976h interfaceC1976h) {
        ((InterfaceC1976h.a) w11.m204369e(this.f8321b)).mo10270j(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f8321b = aVar;
        this.f8320a.mo10987p(this, j);
    }

    /* JADX INFO: renamed from: q */
    public void m10988q(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f8326g = illegalClippingException;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f8322c = new a[xwd0VarArr.length];
        xwd0[] xwd0VarArr2 = new xwd0[xwd0VarArr.length];
        int i = 0;
        while (true) {
            xwd0 xwd0Var = null;
            if (i >= xwd0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f8322c;
            a aVar = (a) xwd0VarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                xwd0Var = aVar.f8327a;
            }
            xwd0VarArr2[i] = xwd0Var;
            i++;
        }
        long jMo10989r = this.f8320a.mo10989r(u9fVarArr, zArr, xwd0VarArr2, zArr2, j);
        if (m10985n()) {
            long j3 = this.f8324e;
            if (j == j3 && m10975u(j3, u9fVarArr)) {
                j2 = jMo10989r;
            } else {
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.f8323d = j2;
        if (jMo10989r != j) {
            if (jMo10989r >= this.f8324e) {
                long j4 = this.f8325f;
                z = j4 == Long.MIN_VALUE || jMo10989r <= j4;
            }
        }
        w11.m204371g(z);
        for (int i2 = 0; i2 < xwd0VarArr.length; i2++) {
            xwd0 xwd0Var2 = xwd0VarArr2[i2];
            a[] aVarArr2 = this.f8322c;
            if (xwd0Var2 == null) {
                aVarArr2[i2] = null;
            } else {
                a aVar2 = aVarArr2[i2];
                if (aVar2 == null || aVar2.f8327a != xwd0Var2) {
                    aVarArr2[i2] = new a(xwd0Var2);
                }
            }
            xwd0VarArr[i2] = this.f8322c[i2];
        }
        return jMo10989r;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f8326g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f8320a.mo10990s();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        this.f8320a.mo10991t(j, z);
    }

    /* JADX INFO: renamed from: v */
    public void m10992v(long j, long j2) {
        this.f8324e = j;
        this.f8325f = j2;
    }
}
