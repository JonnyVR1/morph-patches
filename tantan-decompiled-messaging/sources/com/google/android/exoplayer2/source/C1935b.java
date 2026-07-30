package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import p149l.b6j0;
import p149l.ice0;
import p149l.n200;
import p149l.o8f;
import p149l.p11;
import p149l.uyi;
import p149l.vck0;
import p149l.vod0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1935b implements InterfaceC1953h, InterfaceC1953h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1953h f8283a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC1953h.a f8284b;

    /* JADX INFO: renamed from: c */
    public a[] f8285c = new a[0];

    /* JADX INFO: renamed from: d */
    public long f8286d;

    /* JADX INFO: renamed from: e */
    public long f8287e;

    /* JADX INFO: renamed from: f */
    public long f8288f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ClippingMediaSource.IllegalClippingException f8289g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.b$a */
    public final class a implements vod0 {

        /* JADX INFO: renamed from: a */
        public final vod0 f8290a;

        /* JADX INFO: renamed from: b */
        public boolean f8291b;

        public a(vod0 vod0Var) {
            this.f8290a = vod0Var;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: a */
        public void mo10939a() throws IOException {
            this.f8290a.mo10939a();
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: b */
        public boolean mo10940b() {
            return !C1935b.this.m10931n() && this.f8290a.mo10940b();
        }

        /* JADX INFO: renamed from: c */
        public void m10941c() {
            this.f8291b = false;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: k */
        public int mo10942k(long j) {
            if (C1935b.this.m10931n()) {
                return -3;
            }
            return this.f8290a.mo10942k(j);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: l */
        public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (C1935b.this.m10931n()) {
                return -3;
            }
            if (this.f8291b) {
                decoderInputBuffer.m154499t(4);
                return -4;
            }
            long jMo10924d = C1935b.this.mo10924d();
            int iMo10943l = this.f8290a.mo10943l(uyiVar, decoderInputBuffer, i);
            if (iMo10943l == -5) {
                C1871k c1871k = (C1871k) p11.m167011e(uyiVar.f178866b);
                int i2 = c1871k.f7730B;
                if (i2 != 0 || c1871k.f7731C != 0) {
                    C1935b c1935b = C1935b.this;
                    if (c1935b.f8287e != 0) {
                        i2 = 0;
                    }
                    uyiVar.f178866b = c1871k.m10282b().m10329P(i2).m10330Q(c1935b.f8288f == Long.MIN_VALUE ? c1871k.f7731C : 0).m10320G();
                }
                return -5;
            }
            long j = C1935b.this.f8288f;
            if (j == Long.MIN_VALUE || ((iMo10943l != -4 || decoderInputBuffer.f7377e < j) && !(iMo10943l == -3 && jMo10924d == Long.MIN_VALUE && !decoderInputBuffer.f7376d))) {
                return iMo10943l;
            }
            decoderInputBuffer.mo9803i();
            decoderInputBuffer.m154499t(4);
            this.f8291b = true;
            return -4;
        }
    }

    public C1935b(InterfaceC1953h interfaceC1953h, boolean z, long j, long j2) {
        this.f8283a = interfaceC1953h;
        this.f8286d = z ? j : -9223372036854775807L;
        this.f8287e = j;
        this.f8288f = j2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10921u(long j, o8f[] o8fVarArr) {
        if (j != 0) {
            for (o8f o8fVar : o8fVarArr) {
                if (o8fVar != null) {
                    C1871k c1871kMo11310k = o8fVar.mo11310k();
                    if (!n200.m157519a(c1871kMo11310k.f7748l, c1871kMo11310k.f7745i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final ice0 m10922b(long j, ice0 ice0Var) {
        long jM197886r = vck0.m197886r(ice0Var.f112456a, 0L, j - this.f8287e);
        long j2 = ice0Var.f112457b;
        long j3 = this.f8288f;
        long jM197886r2 = vck0.m197886r(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jM197886r == ice0Var.f112456a && jM197886r2 == ice0Var.f112457b) ? ice0Var : new ice0(jM197886r, jM197886r2);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        return this.f8283a.mo10923c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        long jMo10924d = this.f8283a.mo10924d();
        if (jMo10924d != Long.MIN_VALUE) {
            long j = this.f8288f;
            if (j == Long.MIN_VALUE || jMo10924d < j) {
                return jMo10924d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        this.f8283a.mo10925e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        long jMo10926f = this.f8283a.mo10926f();
        if (jMo10926f != Long.MIN_VALUE) {
            long j = this.f8288f;
            if (j == Long.MIN_VALUE || jMo10926f < j) {
                return jMo10926f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        long j2 = this.f8287e;
        if (j == j2) {
            return j2;
        }
        return this.f8283a.mo10927g(j, m10922b(j, ice0Var));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) {
        this.f8286d = -9223372036854775807L;
        boolean z = false;
        for (a aVar : this.f8285c) {
            if (aVar != null) {
                aVar.m10941c();
            }
        }
        long jMo10928h = this.f8283a.mo10928h(j);
        if (jMo10928h == j) {
            z = true;
        } else if (jMo10928h >= this.f8287e) {
            long j2 = this.f8288f;
            if (j2 == Long.MIN_VALUE || jMo10928h <= j2) {
                z = true;
            }
        }
        p11.m167013g(z);
        return jMo10928h;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: i */
    public long mo10929i() {
        if (m10931n()) {
            long j = this.f8286d;
            this.f8286d = -9223372036854775807L;
            long jMo10929i = mo10929i();
            return jMo10929i != -9223372036854775807L ? jMo10929i : j;
        }
        long jMo10929i2 = this.f8283a.mo10929i();
        if (jMo10929i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        p11.m167013g(jMo10929i2 >= this.f8287e);
        long j2 = this.f8288f;
        p11.m167013g(j2 == Long.MIN_VALUE || jMo10929i2 <= j2);
        return jMo10929i2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return this.f8283a.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h.a
    /* JADX INFO: renamed from: l */
    public void mo10221l(InterfaceC1953h interfaceC1953h) {
        if (this.f8289g != null) {
            return;
        }
        ((InterfaceC1953h.a) p11.m167011e(this.f8284b)).mo10221l(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        return this.f8283a.mo10930m();
    }

    /* JADX INFO: renamed from: n */
    public boolean m10931n() {
        return this.f8286d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo10216j(InterfaceC1953h interfaceC1953h) {
        ((InterfaceC1953h.a) p11.m167011e(this.f8284b)).mo10216j(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f8284b = aVar;
        this.f8283a.mo10933p(this, j);
    }

    /* JADX INFO: renamed from: q */
    public void m10934q(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f8289g = illegalClippingException;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f8285c = new a[vod0VarArr.length];
        vod0[] vod0VarArr2 = new vod0[vod0VarArr.length];
        int i = 0;
        while (true) {
            vod0 vod0Var = null;
            if (i >= vod0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f8285c;
            a aVar = (a) vod0VarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                vod0Var = aVar.f8290a;
            }
            vod0VarArr2[i] = vod0Var;
            i++;
        }
        long jMo10935r = this.f8283a.mo10935r(o8fVarArr, zArr, vod0VarArr2, zArr2, j);
        if (m10931n()) {
            long j3 = this.f8287e;
            if (j == j3 && m10921u(j3, o8fVarArr)) {
                j2 = jMo10935r;
            } else {
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.f8286d = j2;
        if (jMo10935r != j) {
            if (jMo10935r >= this.f8287e) {
                long j4 = this.f8288f;
                z = j4 == Long.MIN_VALUE || jMo10935r <= j4;
            }
        }
        p11.m167013g(z);
        for (int i2 = 0; i2 < vod0VarArr.length; i2++) {
            vod0 vod0Var2 = vod0VarArr2[i2];
            a[] aVarArr2 = this.f8285c;
            if (vod0Var2 == null) {
                aVarArr2[i2] = null;
            } else {
                a aVar2 = aVarArr2[i2];
                if (aVar2 == null || aVar2.f8290a != vod0Var2) {
                    aVarArr2[i2] = new a(vod0Var2);
                }
            }
            vod0VarArr[i2] = this.f8285c[i2];
        }
        return jMo10935r;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f8289g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f8283a.mo10936s();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        this.f8283a.mo10937t(j, z);
    }

    /* JADX INFO: renamed from: v */
    public void m10938v(long j, long j2) {
        this.f8287e = j;
        this.f8288f = j2;
    }
}
