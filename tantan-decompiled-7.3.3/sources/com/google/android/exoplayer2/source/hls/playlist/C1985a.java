package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.hls.playlist.C1985a;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2073d;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.gms.common.api.Api;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.akq;
import p153l.bmk0;
import p153l.g5l;
import p153l.g6c;
import p153l.ktx;
import p153l.m5l;
import p153l.mtv;
import p153l.n5l;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1985a implements HlsPlaylistTracker, Loader.InterfaceC2064b<C2073d<m5l>> {

    /* JADX INFO: renamed from: p */
    public static final HlsPlaylistTracker.InterfaceC1982a f8593p = new HlsPlaylistTracker.InterfaceC1982a() { // from class: l.hpd
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1982a
        /* JADX INFO: renamed from: a */
        public final HlsPlaylistTracker mo11255a(g5l g5lVar, InterfaceC2072c interfaceC2072c, n5l n5lVar) {
            return new C1985a(g5lVar, interfaceC2072c, n5lVar);
        }
    };

    /* JADX INFO: renamed from: a */
    public final g5l f8594a;

    /* JADX INFO: renamed from: b */
    public final n5l f8595b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2072c f8596c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Uri, c> f8597d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.InterfaceC1983b> f8598e;

    /* JADX INFO: renamed from: f */
    public final double f8599f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC1989j.a f8600g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Loader f8601h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Handler f8602i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public HlsPlaylistTracker.InterfaceC1984c f8603j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C1987c f8604k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Uri f8605l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C1986b f8606m;

    /* JADX INFO: renamed from: n */
    public boolean f8607n;

    /* JADX INFO: renamed from: o */
    public long f8608o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$b */
    public class b implements HlsPlaylistTracker.InterfaceC1983b {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1983b
        /* JADX INFO: renamed from: a */
        public void mo11256a() {
            C1985a.this.f8598e.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1983b
        /* JADX INFO: renamed from: b */
        public boolean mo11257b(Uri uri, InterfaceC2072c.c cVar, boolean z) {
            C1985a c1985a;
            c cVar2;
            if (C1985a.this.f8606m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<C1987c.b> list = ((C1987c) bmk0.m105144j(C1985a.this.f8604k)).f8665e;
                int i = 0;
                int i2 = 0;
                while (true) {
                    int size = list.size();
                    c1985a = C1985a.this;
                    if (i >= size) {
                        break;
                    }
                    c cVar3 = (c) c1985a.f8597d.get(list.get(i).f8678a);
                    if (cVar3 != null && jElapsedRealtime < cVar3.f8617h) {
                        i2++;
                    }
                    i++;
                }
                InterfaceC2072c.b bVarMo12173b = C1985a.this.f8596c.mo12173b(new InterfaceC2072c.a(1, 0, c1985a.f8604k.f8665e.size(), i2), cVar);
                if (bVarMo12173b != null && bVarMo12173b.f9555a == 2 && (cVar2 = (c) C1985a.this.f8597d.get(uri)) != null) {
                    cVar2.m11294h(bVarMo12173b.f9556b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$c */
    public final class c implements Loader.InterfaceC2064b<C2073d<m5l>> {

        /* JADX INFO: renamed from: a */
        public final Uri f8610a;

        /* JADX INFO: renamed from: b */
        public final Loader f8611b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c */
        public final g6c f8612c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public C1986b f8613d;

        /* JADX INFO: renamed from: e */
        public long f8614e;

        /* JADX INFO: renamed from: f */
        public long f8615f;

        /* JADX INFO: renamed from: g */
        public long f8616g;

        /* JADX INFO: renamed from: h */
        public long f8617h;

        /* JADX INFO: renamed from: i */
        public boolean f8618i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public IOException f8619j;

        public c(Uri uri) {
            this.f8610a = uri;
            this.f8612c = C1985a.this.f8594a.mo121849a(4);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m11287a(c cVar, Uri uri) {
            cVar.f8618i = false;
            cVar.m11299m(uri);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m11294h(long j) {
            this.f8617h = SystemClock.elapsedRealtime() + j;
            return this.f8610a.equals(C1985a.this.f8605l) && !C1985a.this.m11280L();
        }

        /* JADX INFO: renamed from: i */
        public final Uri m11295i() {
            C1986b c1986b = this.f8613d;
            if (c1986b != null) {
                C1986b.f fVar = c1986b.f8639v;
                if (fVar.f8658a != -9223372036854775807L || fVar.f8662e) {
                    Uri.Builder builderBuildUpon = this.f8610a.buildUpon();
                    C1986b c1986b2 = this.f8613d;
                    if (c1986b2.f8639v.f8662e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1986b2.f8628k + ((long) c1986b2.f8635r.size())));
                        C1986b c1986b3 = this.f8613d;
                        if (c1986b3.f8631n != -9223372036854775807L) {
                            List<C1986b.b> list = c1986b3.f8636s;
                            int size = list.size();
                            if (!list.isEmpty() && ((C1986b.b) akq.m98599g(list)).f8641m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C1986b.f fVar2 = this.f8613d.f8639v;
                    if (fVar2.f8658a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", fVar2.f8659b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f8610a;
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public C1986b m11296j() {
            return this.f8613d;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11297k() {
            int i;
            if (this.f8613d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, bmk0.m105152l1(this.f8613d.f8638u));
            C1986b c1986b = this.f8613d;
            return c1986b.f8632o || (i = c1986b.f8621d) == 2 || i == 1 || this.f8614e + jMax > jElapsedRealtime;
        }

        /* JADX INFO: renamed from: l */
        public void m11298l() {
            m11300p(this.f8610a);
        }

        /* JADX INFO: renamed from: m */
        public final void m11299m(Uri uri) {
            C2073d c2073d = new C2073d(this.f8612c, uri, 4, C1985a.this.f8595b.mo131252a(C1985a.this.f8604k, this.f8613d));
            C1985a.this.f8600g.m11343s(new mtv(c2073d.f9561a, c2073d.f9562b, this.f8611b.m12146n(c2073d, this, C1985a.this.f8596c.mo12174d(c2073d.f9563c))), c2073d.f9563c);
        }

        /* JADX INFO: renamed from: p */
        public final void m11300p(final Uri uri) {
            this.f8617h = 0L;
            if (this.f8618i || this.f8611b.m12142j() || this.f8611b.m12141i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f8616g) {
                m11299m(uri);
            } else {
                this.f8618i = true;
                C1985a.this.f8602i.postDelayed(new Runnable() { // from class: l.ipd
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1985a.c.m11287a(this.f116269a, uri);
                    }
                }, this.f8616g - jElapsedRealtime);
            }
        }

        /* JADX INFO: renamed from: r */
        public void m11301r() throws IOException {
            this.f8611b.mo11081a();
            IOException iOException = this.f8619j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo11078n(C2073d<m5l> c2073d, long j, long j2, boolean z) {
            mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
            C1985a.this.f8596c.m12176c(c2073d.f9561a);
            C1985a.this.f8600g.m11334j(mtvVar, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo11079o(C2073d<m5l> c2073d, long j, long j2) {
            m5l m5lVarM12180e = c2073d.m12180e();
            mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
            if (m5lVarM12180e instanceof C1986b) {
                m11305v((C1986b) m5lVarM12180e, mtvVar);
                C1985a.this.f8600g.m11337m(mtvVar, 4);
            } else {
                this.f8619j = ParserException.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                C1985a.this.f8600g.m11341q(mtvVar, 4, this.f8619j, true);
            }
            C1985a.this.f8596c.m12176c(c2073d.f9561a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Loader.C2065c mo11080q(C2073d<m5l> c2073d, long j, long j2, IOException iOException, int i) {
            Loader.C2065c c2065cM12138h;
            mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
            boolean z = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((c2073d.m12181f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (z || i2 == 400 || i2 == 503) {
                    this.f8616g = SystemClock.elapsedRealtime();
                    m11298l();
                    ((InterfaceC1989j.a) bmk0.m105144j(C1985a.this.f8600g)).m11341q(mtvVar, c2073d.f9563c, iOException, true);
                    return Loader.f9495f;
                }
            }
            InterfaceC2072c.c cVar = new InterfaceC2072c.c(mtvVar, new ktx(c2073d.f9563c), iOException, i);
            if (C1985a.this.m11282N(this.f8610a, cVar, false)) {
                long jMo12172a = C1985a.this.f8596c.mo12172a(cVar);
                c2065cM12138h = jMo12172a != -9223372036854775807L ? Loader.m12138h(false, jMo12172a) : Loader.f9496g;
            } else {
                c2065cM12138h = Loader.f9495f;
            }
            boolean zM12149c = c2065cM12138h.m12149c();
            C1985a.this.f8600g.m11341q(mtvVar, c2073d.f9563c, iOException, !zM12149c);
            if (!zM12149c) {
                C1985a.this.f8596c.m12176c(c2073d.f9561a);
            }
            return c2065cM12138h;
        }

        /* JADX INFO: renamed from: v */
        public final void m11305v(C1986b c1986b, mtv mtvVar) {
            boolean z;
            long j;
            C1986b c1986b2 = this.f8613d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f8614e = jElapsedRealtime;
            C1986b c1986bM11275G = C1985a.this.m11275G(c1986b2, c1986b);
            this.f8613d = c1986bM11275G;
            IOException playlistStuckException = null;
            if (c1986bM11275G != c1986b2) {
                this.f8619j = null;
                this.f8615f = jElapsedRealtime;
                C1985a.this.m11286R(this.f8610a, c1986bM11275G);
            } else if (!c1986bM11275G.f8632o) {
                long size = c1986b.f8628k + ((long) c1986b.f8635r.size());
                C1986b c1986b3 = this.f8613d;
                if (size < c1986b3.f8628k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.f8610a);
                    z = true;
                } else {
                    z = false;
                    if (jElapsedRealtime - this.f8615f > bmk0.m105152l1(c1986b3.f8630m) * C1985a.this.f8599f) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(this.f8610a);
                    }
                }
                if (playlistStuckException != null) {
                    this.f8619j = playlistStuckException;
                    C1985a.this.m11282N(this.f8610a, new InterfaceC2072c.c(mtvVar, new ktx(4), playlistStuckException, 1), z);
                }
            }
            C1986b c1986b4 = this.f8613d;
            if (c1986b4.f8639v.f8662e) {
                j = 0;
            } else {
                j = c1986b4 != c1986b2 ? c1986b4.f8630m : c1986b4.f8630m / 2;
            }
            this.f8616g = jElapsedRealtime + bmk0.m105152l1(j);
            if ((this.f8613d.f8631n != -9223372036854775807L || this.f8610a.equals(C1985a.this.f8605l)) && !this.f8613d.f8632o) {
                m11300p(m11295i());
            }
        }

        /* JADX INFO: renamed from: w */
        public void m11306w() {
            this.f8611b.m12144l();
        }
    }

    public C1985a(g5l g5lVar, InterfaceC2072c interfaceC2072c, n5l n5lVar, double d) {
        this.f8594a = g5lVar;
        this.f8595b = n5lVar;
        this.f8596c = interfaceC2072c;
        this.f8599f = d;
        this.f8598e = new CopyOnWriteArrayList<>();
        this.f8597d = new HashMap<>();
        this.f8608o = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: F */
    public static C1986b.d m11262F(C1986b c1986b, C1986b c1986b2) {
        int i = (int) (c1986b2.f8628k - c1986b.f8628k);
        List<C1986b.d> list = c1986b.f8635r;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m11274E(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f8597d.put(uri, new c(uri));
        }
    }

    /* JADX INFO: renamed from: G */
    public final C1986b m11275G(@Nullable C1986b c1986b, C1986b c1986b2) {
        if (c1986b2.m11312f(c1986b)) {
            return c1986b2.m11309c(m11277I(c1986b, c1986b2), m11276H(c1986b, c1986b2));
        }
        return c1986b2.f8632o ? c1986b.m11310d() : c1986b;
    }

    /* JADX INFO: renamed from: H */
    public final int m11276H(@Nullable C1986b c1986b, C1986b c1986b2) {
        C1986b.d dVarM11262F;
        if (c1986b2.f8626i) {
            return c1986b2.f8627j;
        }
        C1986b c1986b3 = this.f8606m;
        int i = c1986b3 != null ? c1986b3.f8627j : 0;
        return (c1986b == null || (dVarM11262F = m11262F(c1986b, c1986b2)) == null) ? i : (c1986b.f8627j + dVarM11262F.f8650d) - c1986b2.f8635r.get(0).f8650d;
    }

    /* JADX INFO: renamed from: I */
    public final long m11277I(@Nullable C1986b c1986b, C1986b c1986b2) {
        if (c1986b2.f8633p) {
            return c1986b2.f8625h;
        }
        C1986b c1986b3 = this.f8606m;
        long j = c1986b3 != null ? c1986b3.f8625h : 0L;
        if (c1986b != null) {
            int size = c1986b.f8635r.size();
            C1986b.d dVarM11262F = m11262F(c1986b, c1986b2);
            if (dVarM11262F != null) {
                return c1986b.f8625h + dVarM11262F.f8651e;
            }
            if (size == c1986b2.f8628k - c1986b.f8628k) {
                return c1986b.m11311e();
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: J */
    public final Uri m11278J(Uri uri) {
        C1986b.c cVar;
        C1986b c1986b = this.f8606m;
        if (c1986b == null || !c1986b.f8639v.f8662e || (cVar = c1986b.f8637t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f8643b));
        int i = cVar.f8644c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m11279K(Uri uri) {
        List<C1987c.b> list = this.f8604k.f8665e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).f8678a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m11280L() {
        List<C1987c.b> list = this.f8604k.f8665e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            c cVar = (c) w11.m204369e(this.f8597d.get(list.get(i).f8678a));
            if (jElapsedRealtime > cVar.f8617h) {
                Uri uri = cVar.f8610a;
                this.f8605l = uri;
                cVar.m11300p(m11278J(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final void m11281M(Uri uri) {
        if (uri.equals(this.f8605l) || !m11279K(uri)) {
            return;
        }
        C1986b c1986b = this.f8606m;
        if (c1986b == null || !c1986b.f8632o) {
            this.f8605l = uri;
            c cVar = this.f8597d.get(uri);
            C1986b c1986b2 = cVar.f8613d;
            if (c1986b2 == null || !c1986b2.f8632o) {
                cVar.m11300p(m11278J(uri));
            } else {
                this.f8606m = c1986b2;
                this.f8603j.onPrimaryPlaylistRefreshed(c1986b2);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m11282N(Uri uri, InterfaceC2072c.c cVar, boolean z) {
        Iterator<HlsPlaylistTracker.InterfaceC1983b> it = this.f8598e.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().mo11257b(uri, cVar, z);
        }
        return z2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo11078n(C2073d<m5l> c2073d, long j, long j2, boolean z) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        this.f8596c.m12176c(c2073d.f9561a);
        this.f8600g.m11334j(mtvVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo11079o(C2073d<m5l> c2073d, long j, long j2) {
        m5l m5lVarM12180e = c2073d.m12180e();
        boolean z = m5lVarM12180e instanceof C1986b;
        C1987c c1987cM11318e = z ? C1987c.m11318e(m5lVarM12180e.f134910a) : (C1987c) m5lVarM12180e;
        this.f8604k = c1987cM11318e;
        this.f8605l = c1987cM11318e.f8665e.get(0).f8678a;
        this.f8598e.add(new b());
        m11274E(c1987cM11318e.f8664d);
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        c cVar = this.f8597d.get(this.f8605l);
        if (z) {
            cVar.m11305v((C1986b) m5lVarM12180e, mtvVar);
        } else {
            cVar.m11298l();
        }
        this.f8596c.m12176c(c2073d.f9561a);
        this.f8600g.m11337m(mtvVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Loader.C2065c mo11080q(C2073d<m5l> c2073d, long j, long j2, IOException iOException, int i) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        long jMo12172a = this.f8596c.mo12172a(new InterfaceC2072c.c(mtvVar, new ktx(c2073d.f9563c), iOException, i));
        boolean z = jMo12172a == -9223372036854775807L;
        this.f8600g.m11341q(mtvVar, c2073d.f9563c, iOException, z);
        if (z) {
            this.f8596c.m12176c(c2073d.f9561a);
        }
        return z ? Loader.f9496g : Loader.m12138h(false, jMo12172a);
    }

    /* JADX INFO: renamed from: R */
    public final void m11286R(Uri uri, C1986b c1986b) {
        if (uri.equals(this.f8605l)) {
            if (this.f8606m == null) {
                this.f8607n = !c1986b.f8632o;
                this.f8608o = c1986b.f8625h;
            }
            this.f8606m = c1986b;
            this.f8603j.onPrimaryPlaylistRefreshed(c1986b);
        }
        Iterator<HlsPlaylistTracker.InterfaceC1983b> it = this.f8598e.iterator();
        while (it.hasNext()) {
            it.next().mo11256a();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: a */
    public void mo11243a(HlsPlaylistTracker.InterfaceC1983b interfaceC1983b) {
        this.f8598e.remove(interfaceC1983b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: b */
    public long mo11244b() {
        return this.f8608o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: c */
    public void mo11245c(Uri uri, InterfaceC1989j.a aVar, HlsPlaylistTracker.InterfaceC1984c interfaceC1984c) {
        this.f8602i = bmk0.m105174w();
        this.f8600g = aVar;
        this.f8603j = interfaceC1984c;
        C2073d c2073d = new C2073d(this.f8594a.mo121849a(4), uri, 4, this.f8595b.mo131253b());
        w11.m204371g(this.f8601h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f8601h = loader;
        aVar.m11343s(new mtv(c2073d.f9561a, c2073d.f9562b, loader.m12146n(c2073d, this, this.f8596c.mo12174d(c2073d.f9563c))), c2073d.f9563c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: d */
    public void mo11246d(Uri uri) throws IOException {
        this.f8597d.get(uri).m11301r();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    /* JADX INFO: renamed from: e */
    public C1987c mo11247e() {
        return this.f8604k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: f */
    public void mo11248f(Uri uri) {
        this.f8597d.get(uri).m11298l();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: g */
    public void mo11249g(HlsPlaylistTracker.InterfaceC1983b interfaceC1983b) {
        w11.m204369e(interfaceC1983b);
        this.f8598e.add(interfaceC1983b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: h */
    public boolean mo11250h(Uri uri) {
        return this.f8597d.get(uri).m11297k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: i */
    public boolean mo11251i() {
        return this.f8607n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: j */
    public boolean mo11252j(Uri uri, long j) {
        c cVar = this.f8597d.get(uri);
        if (cVar != null) {
            return !cVar.m11294h(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: k */
    public void mo11253k() throws IOException {
        Loader loader = this.f8601h;
        if (loader != null) {
            loader.mo11081a();
        }
        Uri uri = this.f8605l;
        if (uri != null) {
            mo11246d(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    /* JADX INFO: renamed from: l */
    public C1986b mo11254l(Uri uri, boolean z) {
        C1986b c1986bM11296j = this.f8597d.get(uri).m11296j();
        if (c1986bM11296j != null && z) {
            m11281M(uri);
        }
        return c1986bM11296j;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f8605l = null;
        this.f8606m = null;
        this.f8604k = null;
        this.f8608o = -9223372036854775807L;
        this.f8601h.m12144l();
        this.f8601h = null;
        Iterator<c> it = this.f8597d.values().iterator();
        while (it.hasNext()) {
            it.next().m11306w();
        }
        this.f8602i.removeCallbacksAndMessages(null);
        this.f8602i = null;
        this.f8597d.clear();
    }

    public C1985a(g5l g5lVar, InterfaceC2072c interfaceC2072c, n5l n5lVar) {
        this(g5lVar, interfaceC2072c, n5lVar, 3.5d);
    }
}
