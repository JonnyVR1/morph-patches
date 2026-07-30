package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p149l.a5c;
import p149l.b6j0;
import p149l.g5c;
import p149l.gwf0;
import p149l.ice0;
import p149l.jwv;
import p149l.l7j0;
import p149l.lrv;
import p149l.n200;
import p149l.nkx;
import p149l.o8f;
import p149l.p11;
import p149l.uyi;
import p149l.vck0;
import p149l.vod0;
import p149l.z5j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.s */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1990s implements InterfaceC1953h, Loader.InterfaceC2041b<c> {

    /* JADX INFO: renamed from: a */
    public final C2047a f8941a;

    /* JADX INFO: renamed from: b */
    public final a5c.InterfaceC15531a f8942b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final l7j0 f8943c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2049c f8944d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1966j.a f8945e;

    /* JADX INFO: renamed from: f */
    public final b6j0 f8946f;

    /* JADX INFO: renamed from: h */
    public final long f8948h;

    /* JADX INFO: renamed from: j */
    public final C1871k f8950j;

    /* JADX INFO: renamed from: k */
    public final boolean f8951k;

    /* JADX INFO: renamed from: l */
    public boolean f8952l;

    /* JADX INFO: renamed from: m */
    public byte[] f8953m;

    /* JADX INFO: renamed from: n */
    public int f8954n;

    /* JADX INFO: renamed from: g */
    public final ArrayList<b> f8947g = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public final Loader f8949i = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.s$b */
    public final class b implements vod0 {

        /* JADX INFO: renamed from: a */
        public int f8955a;

        /* JADX INFO: renamed from: b */
        public boolean f8956b;

        public b() {
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: a */
        public void mo10939a() throws IOException {
            C1990s c1990s = C1990s.this;
            if (c1990s.f8951k) {
                return;
            }
            c1990s.f8949i.mo11027a();
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: b */
        public boolean mo10940b() {
            return C1990s.this.f8952l;
        }

        /* JADX INFO: renamed from: c */
        public final void m11675c() {
            if (this.f8956b) {
                return;
            }
            C1990s.this.f8945e.m11278h(n200.m157529k(C1990s.this.f8950j.f7748l), C1990s.this.f8950j, 0, null, 0L);
            this.f8956b = true;
        }

        /* JADX INFO: renamed from: d */
        public void m11676d() {
            if (this.f8955a == 2) {
                this.f8955a = 1;
            }
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: k */
        public int mo10942k(long j) {
            m11675c();
            if (j <= 0 || this.f8955a == 2) {
                return 0;
            }
            this.f8955a = 2;
            return 1;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: l */
        public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
            m11675c();
            C1990s c1990s = C1990s.this;
            boolean z = c1990s.f8952l;
            if (z && c1990s.f8953m == null) {
                this.f8955a = 2;
            }
            int i2 = this.f8955a;
            if (i2 == 2) {
                decoderInputBuffer.m154490h(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                uyiVar.f178866b = c1990s.f8950j;
                this.f8955a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            p11.m167011e(c1990s.f8953m);
            decoderInputBuffer.m154490h(1);
            decoderInputBuffer.f7377e = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.m9805v(C1990s.this.f8954n);
                ByteBuffer byteBuffer = decoderInputBuffer.f7375c;
                C1990s c1990s2 = C1990s.this;
                byteBuffer.put(c1990s2.f8953m, 0, c1990s2.f8954n);
            }
            if ((i & 1) == 0) {
                this.f8955a = 2;
            }
            return -4;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.s$c */
    public static final class c implements Loader.InterfaceC2044e {

        /* JADX INFO: renamed from: a */
        public final long f8958a = lrv.m151512a();

        /* JADX INFO: renamed from: b */
        public final C2047a f8959b;

        /* JADX INFO: renamed from: c */
        public final gwf0 f8960c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public byte[] f8961d;

        public c(C2047a c2047a, a5c a5cVar) {
            this.f8959b = c2047a;
            this.f8960c = new gwf0(a5cVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: a */
        public void mo11377a() throws IOException {
            this.f8960c.m128405s();
            try {
                this.f8960c.mo11125n(this.f8959b);
                int i = 0;
                while (true) {
                    gwf0 gwf0Var = this.f8960c;
                    if (i == -1) {
                        return;
                    }
                    int iM128402j = (int) gwf0Var.m128402j();
                    byte[] bArr = this.f8961d;
                    if (bArr == null) {
                        this.f8961d = new byte[1024];
                    } else if (iM128402j == bArr.length) {
                        this.f8961d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    gwf0 gwf0Var2 = this.f8960c;
                    byte[] bArr2 = this.f8961d;
                    i = gwf0Var2.read(bArr2, iM128402j, bArr2.length - iM128402j);
                }
            } finally {
                g5c.m124484a(this.f8960c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: c */
        public void mo11378c() {
        }
    }

    public C1990s(C2047a c2047a, a5c.InterfaceC15531a interfaceC15531a, @Nullable l7j0 l7j0Var, C1871k c1871k, long j, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar, boolean z) {
        this.f8941a = c2047a;
        this.f8942b = interfaceC15531a;
        this.f8943c = l7j0Var;
        this.f8950j = c1871k;
        this.f8948h = j;
        this.f8944d = interfaceC2049c;
        this.f8945e = aVar;
        this.f8951k = z;
        this.f8946f = new b6j0(new z5j0(c1871k));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo11024n(c cVar, long j, long j2, boolean z) {
        gwf0 gwf0Var = cVar.f8960c;
        lrv lrvVar = new lrv(cVar.f8958a, cVar.f8959b, gwf0Var.m128403q(), gwf0Var.m128404r(), j, j2, gwf0Var.m128402j());
        this.f8944d.m12122c(cVar.f8958a);
        this.f8945e.m11281k(lrvVar, 1, -1, null, 0, null, 0L, this.f8948h);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        if (this.f8952l || this.f8949i.m12088j() || this.f8949i.m12087i()) {
            return false;
        }
        a5c a5cVarMo95019a = this.f8942b.mo95019a();
        l7j0 l7j0Var = this.f8943c;
        if (l7j0Var != null) {
            a5cVarMo95019a.mo11123e(l7j0Var);
        }
        c cVar = new c(this.f8941a, a5cVarMo95019a);
        this.f8945e.m11290t(new lrv(cVar.f8958a, this.f8941a, this.f8949i.m12092n(cVar, this, this.f8944d.mo12120d(1))), 1, -1, this.f8950j, 0, null, 0L, this.f8948h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        return this.f8952l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return (this.f8952l || this.f8949i.m12088j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) {
        for (int i = 0; i < this.f8947g.size(); i++) {
            this.f8947g.get(i).m11676d();
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
        return this.f8949i.m12088j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo11025o(c cVar, long j, long j2) {
        this.f8954n = (int) cVar.f8960c.m128402j();
        this.f8953m = (byte[]) p11.m167011e(cVar.f8961d);
        this.f8952l = true;
        gwf0 gwf0Var = cVar.f8960c;
        lrv lrvVar = new lrv(cVar.f8958a, cVar.f8959b, gwf0Var.m128403q(), gwf0Var.m128404r(), j, j2, this.f8954n);
        this.f8944d.m12122c(cVar.f8958a);
        this.f8945e.m11284n(lrvVar, 1, -1, this.f8950j, 0, null, 0L, this.f8948h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Loader.C2042c mo11026q(c cVar, long j, long j2, IOException iOException, int i) {
        Loader.C2042c c2042cM12084h;
        gwf0 gwf0Var = cVar.f8960c;
        lrv lrvVar = new lrv(cVar.f8958a, cVar.f8959b, gwf0Var.m128403q(), gwf0Var.m128404r(), j, j2, gwf0Var.m128402j());
        long jMo12118a = this.f8944d.mo12118a(new InterfaceC2049c.c(lrvVar, new nkx(1, -1, this.f8950j, 0, null, 0L, vck0.m197874l1(this.f8948h)), iOException, i));
        boolean z = jMo12118a == -9223372036854775807L || i >= this.f8944d.mo12120d(1);
        if (this.f8951k && z) {
            jwv.m143690j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f8952l = true;
            c2042cM12084h = Loader.f9458f;
        } else {
            c2042cM12084h = jMo12118a != -9223372036854775807L ? Loader.m12084h(false, jMo12118a) : Loader.f9459g;
        }
        Loader.C2042c c2042c = c2042cM12084h;
        boolean zM12095c = c2042c.m12095c();
        this.f8945e.m11286p(lrvVar, 1, -1, this.f8950j, 0, null, 0L, this.f8948h, iOException, !zM12095c);
        if (!zM12095c) {
            this.f8944d.m12122c(cVar.f8958a);
        }
        return c2042c;
    }

    /* JADX INFO: renamed from: l */
    public void m11674l() {
        this.f8949i.m12090l();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        return this.f8946f;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        aVar.mo10221l(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < o8fVarArr.length; i++) {
            vod0 vod0Var = vod0VarArr[i];
            if (vod0Var != null && (o8fVarArr[i] == null || !zArr[i])) {
                this.f8947g.remove(vod0Var);
                vod0VarArr[i] = null;
            }
            if (vod0VarArr[i] == null && o8fVarArr[i] != null) {
                b bVar = new b();
                this.f8947g.add(bVar);
                vod0VarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        return j;
    }
}
