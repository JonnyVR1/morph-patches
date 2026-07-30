package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.C1973q;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.rtsp.C1982f;
import com.google.android.exoplayer2.source.rtsp.InterfaceC1977a;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import p149l.b6j0;
import p149l.hce0;
import p149l.ice0;
import p149l.iid0;
import p149l.m6j0;
import p149l.o8f;
import p149l.ohg0;
import p149l.p11;
import p149l.pid0;
import p149l.qid0;
import p149l.sj0;
import p149l.uqf;
import p149l.uyi;
import p149l.vck0;
import p149l.vod0;
import p149l.z5j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1982f implements InterfaceC1953h {

    /* JADX INFO: renamed from: a */
    public final sj0 f8864a;

    /* JADX INFO: renamed from: b */
    public final Handler f8865b = vck0.m197896w();

    /* JADX INFO: renamed from: c */
    public final b f8866c;

    /* JADX INFO: renamed from: d */
    public final C1980d f8867d;

    /* JADX INFO: renamed from: e */
    public final List<e> f8868e;

    /* JADX INFO: renamed from: f */
    public final List<d> f8869f;

    /* JADX INFO: renamed from: g */
    public final c f8870g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1977a.a f8871h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1953h.a f8872i;

    /* JADX INFO: renamed from: j */
    public ImmutableList<z5j0> f8873j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public IOException f8874k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public RtspMediaSource.RtspPlaybackException f8875l;

    /* JADX INFO: renamed from: m */
    public long f8876m;

    /* JADX INFO: renamed from: n */
    public long f8877n;

    /* JADX INFO: renamed from: o */
    public long f8878o;

    /* JADX INFO: renamed from: p */
    public boolean f8879p;

    /* JADX INFO: renamed from: q */
    public boolean f8880q;

    /* JADX INFO: renamed from: r */
    public boolean f8881r;

    /* JADX INFO: renamed from: s */
    public boolean f8882s;

    /* JADX INFO: renamed from: t */
    public boolean f8883t;

    /* JADX INFO: renamed from: u */
    public int f8884u;

    /* JADX INFO: renamed from: v */
    public boolean f8885v;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        default void mo11471a() {
        }

        /* JADX INFO: renamed from: b */
        void mo11472b(pid0 pid0Var);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final iid0 f8887a;

        /* JADX INFO: renamed from: b */
        public final C1978b f8888b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f8889c;

        public d(iid0 iid0Var, int i, InterfaceC1977a.a aVar) {
            this.f8887a = iid0Var;
            this.f8888b = new C1978b(i, iid0Var, new C1978b.a() { // from class: l.hid0
                @Override // com.google.android.exoplayer2.source.rtsp.C1978b.a
                /* JADX INFO: renamed from: a */
                public final void mo11482a(String str, InterfaceC1977a interfaceC1977a) {
                    C1982f.d.m11612a(this.f107920a, str, interfaceC1977a);
                }
            }, C1982f.this.f8866c, aVar);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m11612a(d dVar, String str, InterfaceC1977a interfaceC1977a) {
            dVar.f8889c = str;
            C1983g.b bVarMo11474l = interfaceC1977a.mo11474l();
            if (bVarMo11474l != null) {
                C1982f.this.f8867d.m11522n0(interfaceC1977a.getLocalPort(), bVarMo11474l);
                C1982f.this.f8885v = true;
            }
            C1982f.this.m11601T();
        }

        /* JADX INFO: renamed from: c */
        public Uri m11614c() {
            return this.f8888b.f8818b.f113398b;
        }

        /* JADX INFO: renamed from: d */
        public String m11615d() {
            p11.m167015i(this.f8889c);
            return this.f8889c;
        }

        /* JADX INFO: renamed from: e */
        public boolean m11616e() {
            return this.f8889c != null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final d f8891a;

        /* JADX INFO: renamed from: b */
        public final Loader f8892b;

        /* JADX INFO: renamed from: c */
        public final C1973q f8893c;

        /* JADX INFO: renamed from: d */
        public boolean f8894d;

        /* JADX INFO: renamed from: e */
        public boolean f8895e;

        public e(iid0 iid0Var, int i, InterfaceC1977a.a aVar) {
            this.f8891a = C1982f.this.new d(iid0Var, i, aVar);
            this.f8892b = new Loader("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i);
            C1973q c1973qM11412l = C1973q.m11412l(C1982f.this.f8864a);
            this.f8893c = c1973qM11412l;
            c1973qM11412l.m11441c0(C1982f.this.f8866c);
        }

        /* JADX INFO: renamed from: c */
        public void m11619c() {
            if (this.f8894d) {
                return;
            }
            this.f8891a.f8888b.mo11378c();
            this.f8894d = true;
            C1982f.this.m11606a0();
        }

        /* JADX INFO: renamed from: d */
        public long m11620d() {
            return this.f8893c.m11461z();
        }

        /* JADX INFO: renamed from: e */
        public boolean m11621e() {
            return this.f8893c.m11423K(this.f8894d);
        }

        /* JADX INFO: renamed from: f */
        public int m11622f(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return this.f8893c.m11430R(uyiVar, decoderInputBuffer, i, this.f8894d);
        }

        /* JADX INFO: renamed from: g */
        public void m11623g() {
            if (this.f8895e) {
                return;
            }
            this.f8892b.m12090l();
            this.f8893c.m11431S();
            this.f8895e = true;
        }

        /* JADX INFO: renamed from: h */
        public void m11624h() {
            p11.m167013g(this.f8894d);
            this.f8894d = false;
            C1982f.this.m11606a0();
            m11627k();
        }

        /* JADX INFO: renamed from: i */
        public void m11625i(long j) {
            if (this.f8894d) {
                return;
            }
            this.f8891a.f8888b.m11478d();
            this.f8893c.m11433U();
            this.f8893c.m11439a0(j);
        }

        /* JADX INFO: renamed from: j */
        public int m11626j(long j) throws Throwable {
            int iM11417E = this.f8893c.m11417E(j, this.f8894d);
            this.f8893c.m11442d0(iM11417E);
            return iM11417E;
        }

        /* JADX INFO: renamed from: k */
        public void m11627k() {
            this.f8892b.m12092n(this.f8891a.f8888b, C1982f.this.f8866c, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$f */
    public final class f implements vod0 {

        /* JADX INFO: renamed from: a */
        public final int f8897a;

        public f(int i) {
            this.f8897a = i;
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: a */
        public void mo10939a() throws RtspMediaSource.RtspPlaybackException {
            if (C1982f.this.f8875l != null) {
                throw C1982f.this.f8875l;
            }
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: b */
        public boolean mo10940b() {
            return C1982f.this.m11599Q(this.f8897a);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: k */
        public int mo10942k(long j) {
            return C1982f.this.m11605Y(this.f8897a, j);
        }

        @Override // p149l.vod0
        /* JADX INFO: renamed from: l */
        public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return C1982f.this.m11602U(this.f8897a, uyiVar, decoderInputBuffer, i);
        }
    }

    public C1982f(sj0 sj0Var, InterfaceC1977a.a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z) {
        this.f8864a = sj0Var;
        this.f8871h = aVar;
        this.f8870g = cVar;
        b bVar = new b();
        this.f8866c = bVar;
        this.f8867d = new C1980d(bVar, bVar, str, uri, socketFactory, z);
        this.f8868e = new ArrayList();
        this.f8869f = new ArrayList();
        this.f8877n = -9223372036854775807L;
        this.f8876m = -9223372036854775807L;
        this.f8878o = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: O */
    public static ImmutableList<z5j0> m11580O(ImmutableList<e> immutableList) {
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        for (int i = 0; i < immutableList.size(); i++) {
            c2781a.mo15683a(new z5j0(Integer.toString(i), (C1871k) p11.m167011e(immutableList.get(i).f8893c.m11418F())));
        }
        return c2781a.m15702m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m11581S() {
        if (this.f8881r || this.f8882s) {
            return;
        }
        for (int i = 0; i < this.f8868e.size(); i++) {
            if (this.f8868e.get(i).f8893c.m11418F() == null) {
                return;
            }
        }
        this.f8882s = true;
        this.f8873j = m11580O(ImmutableList.copyOf((Collection) this.f8868e));
        ((InterfaceC1953h.a) p11.m167011e(this.f8872i)).mo10221l(this);
    }

    /* JADX INFO: renamed from: X */
    private boolean m11582X(long j) {
        for (int i = 0; i < this.f8868e.size(); i++) {
            if (!this.f8868e.get(i).f8893c.m11437Y(j, false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    private boolean m11583Z() {
        return this.f8880q;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m11585b(C1982f c1982f) {
        int i = c1982f.f8884u;
        c1982f.f8884u = i + 1;
        return i;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public final C1978b m11598P(Uri uri) {
        for (int i = 0; i < this.f8868e.size(); i++) {
            if (!this.f8868e.get(i).f8894d) {
                d dVar = this.f8868e.get(i).f8891a;
                if (dVar.m11614c().equals(uri)) {
                    return dVar.f8888b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m11599Q(int i) {
        return !m11583Z() && this.f8868e.get(i).m11621e();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m11600R() {
        return this.f8877n != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: T */
    public final void m11601T() {
        boolean zM11616e = true;
        for (int i = 0; i < this.f8869f.size(); i++) {
            zM11616e &= this.f8869f.get(i).m11616e();
        }
        if (zM11616e && this.f8883t) {
            this.f8867d.m11525r0(this.f8869f);
        }
    }

    /* JADX INFO: renamed from: U */
    public int m11602U(int i, uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m11583Z()) {
            return -3;
        }
        return this.f8868e.get(i).m11622f(uyiVar, decoderInputBuffer, i2);
    }

    /* JADX INFO: renamed from: V */
    public void m11603V() {
        for (int i = 0; i < this.f8868e.size(); i++) {
            this.f8868e.get(i).m11623g();
        }
        vck0.m197878n(this.f8867d);
        this.f8881r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final void m11604W() {
        List<e> list;
        this.f8885v = true;
        this.f8867d.m11523o0();
        InterfaceC1977a.a aVarMo11475a = this.f8871h.mo11475a();
        if (aVarMo11475a == null) {
            this.f8875l = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8868e.size());
        ArrayList arrayList2 = new ArrayList(this.f8869f.size());
        int i = 0;
        while (true) {
            int size = this.f8868e.size();
            list = this.f8868e;
            if (i >= size) {
                break;
            }
            e eVar = list.get(i);
            if (eVar.f8894d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f8891a.f8887a, i, aVarMo11475a);
                arrayList.add(eVar2);
                eVar2.m11627k();
                if (this.f8869f.contains(eVar.f8891a)) {
                    arrayList2.add(eVar2.f8891a);
                }
            }
            i++;
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.f8868e.clear();
        this.f8868e.addAll(arrayList);
        this.f8869f.clear();
        this.f8869f.addAll(arrayList2);
        for (int i2 = 0; i2 < immutableListCopyOf.size(); i2++) {
            ((e) immutableListCopyOf.get(i2)).m11619c();
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m11605Y(int i, long j) {
        if (m11583Z()) {
            return -3;
        }
        return this.f8868e.get(i).m11626j(j);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11606a0() {
        this.f8879p = true;
        for (int i = 0; i < this.f8868e.size(); i++) {
            this.f8879p &= this.f8868e.get(i).f8894d;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        return isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        if (this.f8879p || this.f8868e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j = this.f8876m;
        if (j != -9223372036854775807L) {
            return j;
        }
        boolean z = true;
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.f8868e.size(); i++) {
            e eVar = this.f8868e.get(i);
            if (!eVar.f8894d) {
                jMin = Math.min(jMin, eVar.m11620d());
                z = false;
            }
        }
        if (z || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return mo10924d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) {
        if (mo10924d() == 0 && !this.f8885v) {
            this.f8878o = j;
            return j;
        }
        mo10937t(j, false);
        this.f8876m = j;
        if (m11600R()) {
            int iM11520l0 = this.f8867d.m11520l0();
            if (iM11520l0 != 1) {
                if (iM11520l0 != 2) {
                    ohg0.m164364a();
                    return 0L;
                }
                this.f8877n = j;
                this.f8867d.m11524p0(j);
                return j;
            }
        } else if (!m11582X(j)) {
            this.f8877n = j;
            if (this.f8879p) {
                for (int i = 0; i < this.f8868e.size(); i++) {
                    this.f8868e.get(i).m11624h();
                }
                boolean z = this.f8885v;
                C1980d c1980d = this.f8867d;
                if (z) {
                    c1980d.m11528u0(vck0.m197874l1(j));
                } else {
                    c1980d.m11524p0(j);
                }
            } else {
                this.f8867d.m11524p0(j);
            }
            for (int i2 = 0; i2 < this.f8868e.size(); i2++) {
                this.f8868e.get(i2).m11625i(j);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: i */
    public long mo10929i() {
        if (!this.f8880q) {
            return -9223372036854775807L;
        }
        this.f8880q = false;
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return !this.f8879p;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        p11.m167013g(this.f8882s);
        return new b6j0((z5j0[]) ((ImmutableList) p11.m167011e(this.f8873j)).toArray(new z5j0[0]));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f8872i = aVar;
        try {
            this.f8867d.m11527t0();
        } catch (IOException e2) {
            this.f8874k = e2;
            vck0.m197878n(this.f8867d);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < o8fVarArr.length; i++) {
            if (vod0VarArr[i] != null && (o8fVarArr[i] == null || !zArr[i])) {
                vod0VarArr[i] = null;
            }
        }
        this.f8869f.clear();
        for (int i2 = 0; i2 < o8fVarArr.length; i2++) {
            o8f o8fVar = o8fVarArr[i2];
            if (o8fVar != null) {
                z5j0 z5j0VarMo11307h = o8fVar.mo11307h();
                int iIndexOf = ((ImmutableList) p11.m167011e(this.f8873j)).indexOf(z5j0VarMo11307h);
                this.f8869f.add(((e) p11.m167011e(this.f8868e.get(iIndexOf))).f8891a);
                if (this.f8873j.contains(z5j0VarMo11307h) && vod0VarArr[i2] == null) {
                    vod0VarArr[i2] = new f(iIndexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.f8868e.size(); i3++) {
            e eVar = this.f8868e.get(i3);
            if (!this.f8869f.contains(eVar.f8891a)) {
                eVar.m11619c();
            }
        }
        this.f8883t = true;
        if (j != 0) {
            this.f8876m = j;
            this.f8877n = j;
            this.f8878o = j;
        }
        m11601T();
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        IOException iOException = this.f8874k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        if (m11600R()) {
            return;
        }
        for (int i = 0; i < this.f8868e.size(); i++) {
            e eVar = this.f8868e.get(i);
            if (!eVar.f8894d) {
                eVar.f8893c.m11452q(j, z, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$b */
    public final class b implements uqf, Loader.InterfaceC2041b<C1978b>, C1973q.d, C1980d.f, C1980d.e {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.C1973q.d
        /* JADX INFO: renamed from: a */
        public void mo11360a(C1871k c1871k) {
            Handler handler = C1982f.this.f8865b;
            final C1982f c1982f = C1982f.this;
            handler.post(new Runnable() { // from class: l.gid0
                @Override // java.lang.Runnable
                public final void run() {
                    c1982f.m11581S();
                }
            });
        }

        @Override // p149l.uqf
        /* JADX INFO: renamed from: b */
        public m6j0 mo11362b(int i, int i2) {
            return ((e) p11.m167011e((e) C1982f.this.f8868e.get(i))).f8893c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1980d.f
        /* JADX INFO: renamed from: c */
        public void mo11554c(String str, @Nullable Throwable th) {
            C1982f.this.f8874k = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1980d.e
        /* JADX INFO: renamed from: d */
        public void mo11551d() {
            long jM197874l1;
            long j = C1982f.this.f8877n;
            C1982f c1982f = C1982f.this;
            if (j != -9223372036854775807L) {
                jM197874l1 = vck0.m197874l1(c1982f.f8877n);
            } else {
                jM197874l1 = c1982f.f8878o != -9223372036854775807L ? vck0.m197874l1(C1982f.this.f8878o) : 0L;
            }
            C1982f.this.f8867d.m11528u0(jM197874l1);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1980d.e
        /* JADX INFO: renamed from: e */
        public void mo11552e(long j, ImmutableList<qid0> immutableList) {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i = 0; i < immutableList.size(); i++) {
                arrayList.add((String) p11.m167011e(immutableList.get(i).f154755c.getPath()));
            }
            for (int i2 = 0; i2 < C1982f.this.f8869f.size(); i2++) {
                if (!arrayList.contains(((d) C1982f.this.f8869f.get(i2)).m11614c().getPath())) {
                    C1982f.this.f8870g.mo11471a();
                    if (C1982f.this.m11600R()) {
                        C1982f.this.f8880q = true;
                        C1982f.this.f8877n = -9223372036854775807L;
                        C1982f.this.f8876m = -9223372036854775807L;
                        C1982f.this.f8878o = -9223372036854775807L;
                    }
                }
            }
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                qid0 qid0Var = immutableList.get(i3);
                C1978b c1978bM11598P = C1982f.this.m11598P(qid0Var.f154755c);
                if (c1978bM11598P != null) {
                    c1978bM11598P.m11481g(qid0Var.f154753a);
                    c1978bM11598P.m11480f(qid0Var.f154754b);
                    if (C1982f.this.m11600R() && C1982f.this.f8877n == C1982f.this.f8876m) {
                        c1978bM11598P.m11479e(j, qid0Var.f154753a);
                    }
                }
            }
            boolean zM11600R = C1982f.this.m11600R();
            C1982f c1982f = C1982f.this;
            if (!zM11600R) {
                if (c1982f.f8878o == -9223372036854775807L || !C1982f.this.f8885v) {
                    return;
                }
                C1982f c1982f2 = C1982f.this;
                c1982f2.mo10928h(c1982f2.f8878o);
                C1982f.this.f8878o = -9223372036854775807L;
                return;
            }
            long j2 = c1982f.f8877n;
            long j3 = C1982f.this.f8876m;
            C1982f c1982f3 = C1982f.this;
            if (j2 == j3) {
                c1982f3.f8877n = -9223372036854775807L;
                C1982f.this.f8876m = -9223372036854775807L;
            } else {
                c1982f3.f8877n = -9223372036854775807L;
                C1982f c1982f4 = C1982f.this;
                c1982f4.mo10928h(c1982f4.f8876m);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1980d.f
        /* JADX INFO: renamed from: f */
        public void mo11555f(pid0 pid0Var, ImmutableList<iid0> immutableList) {
            for (int i = 0; i < immutableList.size(); i++) {
                iid0 iid0Var = immutableList.get(i);
                C1982f c1982f = C1982f.this;
                e eVar = c1982f.new e(iid0Var, i, c1982f.f8871h);
                C1982f.this.f8868e.add(eVar);
                eVar.m11627k();
            }
            C1982f.this.f8870g.mo11472b(pid0Var);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1980d.e
        /* JADX INFO: renamed from: g */
        public void mo11553g(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            if (!(rtspPlaybackException instanceof RtspMediaSource.RtspUdpUnsupportedTransportException) || C1982f.this.f8885v) {
                C1982f.this.f8875l = rtspPlaybackException;
            } else {
                C1982f.this.m11604W();
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo11024n(C1978b c1978b, long j, long j2, boolean z) {
        }

        @Override // p149l.uqf
        /* JADX INFO: renamed from: l */
        public void mo11371l() {
            Handler handler = C1982f.this.f8865b;
            final C1982f c1982f = C1982f.this;
            handler.post(new Runnable() { // from class: l.fid0
                @Override // java.lang.Runnable
                public final void run() {
                    c1982f.m11581S();
                }
            });
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo11025o(C1978b c1978b, long j, long j2) {
            if (C1982f.this.mo10924d() == 0) {
                if (C1982f.this.f8885v) {
                    return;
                }
                C1982f.this.m11604W();
                return;
            }
            for (int i = 0; i < C1982f.this.f8868e.size(); i++) {
                e eVar = (e) C1982f.this.f8868e.get(i);
                if (eVar.f8891a.f8888b == c1978b) {
                    eVar.m11619c();
                    break;
                }
            }
            C1982f.this.f8867d.m11526s0();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Loader.C2042c mo11026q(C1978b c1978b, long j, long j2, IOException iOException, int i) {
            if (C1982f.this.f8882s) {
                boolean z = iOException.getCause() instanceof BindException;
                C1982f c1982f = C1982f.this;
                if (!z) {
                    c1982f.f8875l = new RtspMediaSource.RtspPlaybackException(c1978b.f8818b.f113398b.toString(), iOException);
                } else if (C1982f.m11585b(c1982f) < 3) {
                    return Loader.f9456d;
                }
            } else {
                C1982f.this.f8874k = iOException;
            }
            return Loader.f9458f;
        }

        @Override // p149l.uqf
        /* JADX INFO: renamed from: k */
        public void mo11370k(hce0 hce0Var) {
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        return j;
    }
}
