package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p153l.bmk0;
import p153l.dfj0;
import p153l.ffj0;
import p153l.g6c;
import p153l.kb00;
import p153l.ktx;
import p153l.kyv;
import p153l.m6c;
import p153l.mtv;
import p153l.nke0;
import p153l.p1j;
import p153l.p4g0;
import p153l.pgj0;
import p153l.u9f;
import p153l.w11;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.s */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2013s implements InterfaceC1976h, Loader.InterfaceC2064b<c> {

    /* JADX INFO: renamed from: a */
    public final C2070a f8978a;

    /* JADX INFO: renamed from: b */
    public final g6c.InterfaceC17163a f8979b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final pgj0 f8980c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2072c f8981d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1989j.a f8982e;

    /* JADX INFO: renamed from: f */
    public final ffj0 f8983f;

    /* JADX INFO: renamed from: h */
    public final long f8985h;

    /* JADX INFO: renamed from: j */
    public final C1894k f8987j;

    /* JADX INFO: renamed from: k */
    public final boolean f8988k;

    /* JADX INFO: renamed from: l */
    public boolean f8989l;

    /* JADX INFO: renamed from: m */
    public byte[] f8990m;

    /* JADX INFO: renamed from: n */
    public int f8991n;

    /* JADX INFO: renamed from: g */
    public final ArrayList<b> f8984g = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public final Loader f8986i = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.s$b */
    public final class b implements xwd0 {

        /* JADX INFO: renamed from: a */
        public int f8992a;

        /* JADX INFO: renamed from: b */
        public boolean f8993b;

        public b() {
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: a */
        public void mo10993a() throws IOException {
            C2013s c2013s = C2013s.this;
            if (c2013s.f8988k) {
                return;
            }
            c2013s.f8986i.mo11081a();
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: b */
        public boolean mo10994b() {
            return C2013s.this.f8989l;
        }

        /* JADX INFO: renamed from: c */
        public final void m11729c() {
            if (this.f8993b) {
                return;
            }
            C2013s.this.f8982e.m11332h(kb00.m149010k(C2013s.this.f8987j.f7785l), C2013s.this.f8987j, 0, null, 0L);
            this.f8993b = true;
        }

        /* JADX INFO: renamed from: d */
        public void m11730d() {
            if (this.f8992a == 2) {
                this.f8992a = 1;
            }
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: k */
        public int mo10996k(long j) {
            m11729c();
            if (j <= 0 || this.f8992a == 2) {
                return 0;
            }
            this.f8992a = 2;
            return 1;
        }

        @Override // p153l.xwd0
        /* JADX INFO: renamed from: l */
        public int mo10997l(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
            m11729c();
            C2013s c2013s = C2013s.this;
            boolean z = c2013s.f8989l;
            if (z && c2013s.f8990m == null) {
                this.f8992a = 2;
            }
            int i2 = this.f8992a;
            if (i2 == 2) {
                decoderInputBuffer.m97774h(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                p1jVar.f150174b = c2013s.f8987j;
                this.f8992a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            w11.m204369e(c2013s.f8990m);
            decoderInputBuffer.m97774h(1);
            decoderInputBuffer.f7414e = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.m9859v(C2013s.this.f8991n);
                ByteBuffer byteBuffer = decoderInputBuffer.f7412c;
                C2013s c2013s2 = C2013s.this;
                byteBuffer.put(c2013s2.f8990m, 0, c2013s2.f8991n);
            }
            if ((i & 1) == 0) {
                this.f8992a = 2;
            }
            return -4;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.s$c */
    public static final class c implements Loader.InterfaceC2067e {

        /* JADX INFO: renamed from: a */
        public final long f8995a = mtv.m160053a();

        /* JADX INFO: renamed from: b */
        public final C2070a f8996b;

        /* JADX INFO: renamed from: c */
        public final p4g0 f8997c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public byte[] f8998d;

        public c(C2070a c2070a, g6c g6cVar) {
            this.f8996b = c2070a;
            this.f8997c = new p4g0(g6cVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: a */
        public void mo11431a() throws IOException {
            this.f8997c.m170568s();
            try {
                this.f8997c.mo11179n(this.f8996b);
                int i = 0;
                while (true) {
                    p4g0 p4g0Var = this.f8997c;
                    if (i == -1) {
                        return;
                    }
                    int iM170565j = (int) p4g0Var.m170565j();
                    byte[] bArr = this.f8998d;
                    if (bArr == null) {
                        this.f8998d = new byte[1024];
                    } else if (iM170565j == bArr.length) {
                        this.f8998d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    p4g0 p4g0Var2 = this.f8997c;
                    byte[] bArr2 = this.f8998d;
                    i = p4g0Var2.read(bArr2, iM170565j, bArr2.length - iM170565j);
                }
            } finally {
                m6c.m157209a(this.f8997c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: c */
        public void mo11432c() {
        }
    }

    public C2013s(C2070a c2070a, g6c.InterfaceC17163a interfaceC17163a, @Nullable pgj0 pgj0Var, C1894k c1894k, long j, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar, boolean z) {
        this.f8978a = c2070a;
        this.f8979b = interfaceC17163a;
        this.f8980c = pgj0Var;
        this.f8987j = c1894k;
        this.f8985h = j;
        this.f8981d = interfaceC2072c;
        this.f8982e = aVar;
        this.f8988k = z;
        this.f8983f = new ffj0(new dfj0(c1894k));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo11078n(c cVar, long j, long j2, boolean z) {
        p4g0 p4g0Var = cVar.f8997c;
        mtv mtvVar = new mtv(cVar.f8995a, cVar.f8996b, p4g0Var.m170566q(), p4g0Var.m170567r(), j, j2, p4g0Var.m170565j());
        this.f8981d.m12176c(cVar.f8995a);
        this.f8982e.m11335k(mtvVar, 1, -1, null, 0, null, 0L, this.f8985h);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        if (this.f8989l || this.f8986i.m12142j() || this.f8986i.m12141i()) {
            return false;
        }
        g6c g6cVarMo129219a = this.f8979b.mo129219a();
        pgj0 pgj0Var = this.f8980c;
        if (pgj0Var != null) {
            g6cVarMo129219a.mo11177e(pgj0Var);
        }
        c cVar = new c(this.f8978a, g6cVarMo129219a);
        this.f8982e.m11344t(new mtv(cVar.f8995a, this.f8978a, this.f8986i.m12146n(cVar, this, this.f8981d.mo12174d(1))), 1, -1, this.f8987j, 0, null, 0L, this.f8985h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        return this.f8989l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return (this.f8989l || this.f8986i.m12142j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        for (int i = 0; i < this.f8984g.size(); i++) {
            this.f8984g.get(i).m11730d();
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
        return this.f8986i.m12142j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo11079o(c cVar, long j, long j2) {
        this.f8991n = (int) cVar.f8997c.m170565j();
        this.f8990m = (byte[]) w11.m204369e(cVar.f8998d);
        this.f8989l = true;
        p4g0 p4g0Var = cVar.f8997c;
        mtv mtvVar = new mtv(cVar.f8995a, cVar.f8996b, p4g0Var.m170566q(), p4g0Var.m170567r(), j, j2, this.f8991n);
        this.f8981d.m12176c(cVar.f8995a);
        this.f8982e.m11338n(mtvVar, 1, -1, this.f8987j, 0, null, 0L, this.f8985h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Loader.C2065c mo11080q(c cVar, long j, long j2, IOException iOException, int i) {
        Loader.C2065c c2065cM12138h;
        p4g0 p4g0Var = cVar.f8997c;
        mtv mtvVar = new mtv(cVar.f8995a, cVar.f8996b, p4g0Var.m170566q(), p4g0Var.m170567r(), j, j2, p4g0Var.m170565j());
        long jMo12172a = this.f8981d.mo12172a(new InterfaceC2072c.c(mtvVar, new ktx(1, -1, this.f8987j, 0, null, 0L, bmk0.m105152l1(this.f8985h)), iOException, i));
        boolean z = jMo12172a == -9223372036854775807L || i >= this.f8981d.mo12174d(1);
        if (this.f8988k && z) {
            kyv.m152152j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f8989l = true;
            c2065cM12138h = Loader.f9495f;
        } else {
            c2065cM12138h = jMo12172a != -9223372036854775807L ? Loader.m12138h(false, jMo12172a) : Loader.f9496g;
        }
        Loader.C2065c c2065c = c2065cM12138h;
        boolean zM12149c = c2065c.m12149c();
        this.f8982e.m11340p(mtvVar, 1, -1, this.f8987j, 0, null, 0L, this.f8985h, iOException, !zM12149c);
        if (!zM12149c) {
            this.f8981d.m12176c(cVar.f8995a);
        }
        return c2065c;
    }

    /* JADX INFO: renamed from: l */
    public void m11728l() {
        this.f8986i.m12144l();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return this.f8983f;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        aVar.mo10275l(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < u9fVarArr.length; i++) {
            xwd0 xwd0Var = xwd0VarArr[i];
            if (xwd0Var != null && (u9fVarArr[i] == null || !zArr[i])) {
                this.f8984g.remove(xwd0Var);
                xwd0VarArr[i] = null;
            }
            if (xwd0VarArr[i] == null && u9fVarArr[i] != null) {
                b bVar = new b();
                this.f8984g.add(bVar);
                xwd0VarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        return j;
    }
}
