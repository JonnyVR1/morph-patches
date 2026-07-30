package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.hls.playlist.C1962a;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2050d;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.gms.common.api.Api;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.a5c;
import p149l.aiq;
import p149l.lrv;
import p149l.nkx;
import p149l.p11;
import p149l.q2l;
import p149l.vck0;
import p149l.w2l;
import p149l.x2l;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1962a implements HlsPlaylistTracker, Loader.InterfaceC2041b<C2050d<w2l>> {

    /* JADX INFO: renamed from: p */
    public static final HlsPlaylistTracker.InterfaceC1959a f8556p = new HlsPlaylistTracker.InterfaceC1959a() { // from class: l.cod
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1959a
        /* JADX INFO: renamed from: a */
        public final HlsPlaylistTracker mo11201a(q2l q2lVar, InterfaceC2049c interfaceC2049c, x2l x2lVar) {
            return new C1962a(q2lVar, interfaceC2049c, x2lVar);
        }
    };

    /* JADX INFO: renamed from: a */
    public final q2l f8557a;

    /* JADX INFO: renamed from: b */
    public final x2l f8558b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2049c f8559c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Uri, c> f8560d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.InterfaceC1960b> f8561e;

    /* JADX INFO: renamed from: f */
    public final double f8562f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC1966j.a f8563g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Loader f8564h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Handler f8565i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public HlsPlaylistTracker.InterfaceC1961c f8566j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C1964c f8567k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Uri f8568l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C1963b f8569m;

    /* JADX INFO: renamed from: n */
    public boolean f8570n;

    /* JADX INFO: renamed from: o */
    public long f8571o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$b */
    public class b implements HlsPlaylistTracker.InterfaceC1960b {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1960b
        /* JADX INFO: renamed from: a */
        public void mo11202a() {
            C1962a.this.f8561e.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1960b
        /* JADX INFO: renamed from: b */
        public boolean mo11203b(Uri uri, InterfaceC2049c.c cVar, boolean z) {
            C1962a c1962a;
            c cVar2;
            if (C1962a.this.f8569m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<C1964c.b> list = ((C1964c) vck0.m197866j(C1962a.this.f8567k)).f8628e;
                int i = 0;
                int i2 = 0;
                while (true) {
                    int size = list.size();
                    c1962a = C1962a.this;
                    if (i >= size) {
                        break;
                    }
                    c cVar3 = (c) c1962a.f8560d.get(list.get(i).f8641a);
                    if (cVar3 != null && jElapsedRealtime < cVar3.f8580h) {
                        i2++;
                    }
                    i++;
                }
                InterfaceC2049c.b bVarMo12119b = C1962a.this.f8559c.mo12119b(new InterfaceC2049c.a(1, 0, c1962a.f8567k.f8628e.size(), i2), cVar);
                if (bVarMo12119b != null && bVarMo12119b.f9518a == 2 && (cVar2 = (c) C1962a.this.f8560d.get(uri)) != null) {
                    cVar2.m11240h(bVarMo12119b.f9519b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$c */
    public final class c implements Loader.InterfaceC2041b<C2050d<w2l>> {

        /* JADX INFO: renamed from: a */
        public final Uri f8573a;

        /* JADX INFO: renamed from: b */
        public final Loader f8574b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c */
        public final a5c f8575c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public C1963b f8576d;

        /* JADX INFO: renamed from: e */
        public long f8577e;

        /* JADX INFO: renamed from: f */
        public long f8578f;

        /* JADX INFO: renamed from: g */
        public long f8579g;

        /* JADX INFO: renamed from: h */
        public long f8580h;

        /* JADX INFO: renamed from: i */
        public boolean f8581i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public IOException f8582j;

        public c(Uri uri) {
            this.f8573a = uri;
            this.f8575c = C1962a.this.f8557a.mo172471a(4);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m11233a(c cVar, Uri uri) {
            cVar.f8581i = false;
            cVar.m11245m(uri);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m11240h(long j) {
            this.f8580h = SystemClock.elapsedRealtime() + j;
            return this.f8573a.equals(C1962a.this.f8568l) && !C1962a.this.m11226L();
        }

        /* JADX INFO: renamed from: i */
        public final Uri m11241i() {
            C1963b c1963b = this.f8576d;
            if (c1963b != null) {
                C1963b.f fVar = c1963b.f8602v;
                if (fVar.f8621a != -9223372036854775807L || fVar.f8625e) {
                    Uri.Builder builderBuildUpon = this.f8573a.buildUpon();
                    C1963b c1963b2 = this.f8576d;
                    if (c1963b2.f8602v.f8625e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1963b2.f8591k + ((long) c1963b2.f8598r.size())));
                        C1963b c1963b3 = this.f8576d;
                        if (c1963b3.f8594n != -9223372036854775807L) {
                            List<C1963b.b> list = c1963b3.f8599s;
                            int size = list.size();
                            if (!list.isEmpty() && ((C1963b.b) aiq.m96881g(list)).f8604m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C1963b.f fVar2 = this.f8576d.f8602v;
                    if (fVar2.f8621a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", fVar2.f8622b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f8573a;
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public C1963b m11242j() {
            return this.f8576d;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11243k() {
            int i;
            if (this.f8576d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, vck0.m197874l1(this.f8576d.f8601u));
            C1963b c1963b = this.f8576d;
            return c1963b.f8595o || (i = c1963b.f8584d) == 2 || i == 1 || this.f8577e + jMax > jElapsedRealtime;
        }

        /* JADX INFO: renamed from: l */
        public void m11244l() {
            m11246p(this.f8573a);
        }

        /* JADX INFO: renamed from: m */
        public final void m11245m(Uri uri) {
            C2050d c2050d = new C2050d(this.f8575c, uri, 4, C1962a.this.f8558b.mo102938a(C1962a.this.f8567k, this.f8576d));
            C1962a.this.f8563g.m11289s(new lrv(c2050d.f9524a, c2050d.f9525b, this.f8574b.m12092n(c2050d, this, C1962a.this.f8559c.mo12120d(c2050d.f9526c))), c2050d.f9526c);
        }

        /* JADX INFO: renamed from: p */
        public final void m11246p(final Uri uri) {
            this.f8580h = 0L;
            if (this.f8581i || this.f8574b.m12088j() || this.f8574b.m12087i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f8579g) {
                m11245m(uri);
            } else {
                this.f8581i = true;
                C1962a.this.f8565i.postDelayed(new Runnable() { // from class: l.dod
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1962a.c.m11233a(this.f87160a, uri);
                    }
                }, this.f8579g - jElapsedRealtime);
            }
        }

        /* JADX INFO: renamed from: r */
        public void m11247r() throws IOException {
            this.f8574b.mo11027a();
            IOException iOException = this.f8582j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo11024n(C2050d<w2l> c2050d, long j, long j2, boolean z) {
            lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
            C1962a.this.f8559c.m12122c(c2050d.f9524a);
            C1962a.this.f8563g.m11280j(lrvVar, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo11025o(C2050d<w2l> c2050d, long j, long j2) {
            w2l w2lVarM12126e = c2050d.m12126e();
            lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
            if (w2lVarM12126e instanceof C1963b) {
                m11251v((C1963b) w2lVarM12126e, lrvVar);
                C1962a.this.f8563g.m11283m(lrvVar, 4);
            } else {
                this.f8582j = ParserException.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                C1962a.this.f8563g.m11287q(lrvVar, 4, this.f8582j, true);
            }
            C1962a.this.f8559c.m12122c(c2050d.f9524a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Loader.C2042c mo11026q(C2050d<w2l> c2050d, long j, long j2, IOException iOException, int i) {
            Loader.C2042c c2042cM12084h;
            lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
            boolean z = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((c2050d.m12127f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (z || i2 == 400 || i2 == 503) {
                    this.f8579g = SystemClock.elapsedRealtime();
                    m11244l();
                    ((InterfaceC1966j.a) vck0.m197866j(C1962a.this.f8563g)).m11287q(lrvVar, c2050d.f9526c, iOException, true);
                    return Loader.f9458f;
                }
            }
            InterfaceC2049c.c cVar = new InterfaceC2049c.c(lrvVar, new nkx(c2050d.f9526c), iOException, i);
            if (C1962a.this.m11228N(this.f8573a, cVar, false)) {
                long jMo12118a = C1962a.this.f8559c.mo12118a(cVar);
                c2042cM12084h = jMo12118a != -9223372036854775807L ? Loader.m12084h(false, jMo12118a) : Loader.f9459g;
            } else {
                c2042cM12084h = Loader.f9458f;
            }
            boolean zM12095c = c2042cM12084h.m12095c();
            C1962a.this.f8563g.m11287q(lrvVar, c2050d.f9526c, iOException, !zM12095c);
            if (!zM12095c) {
                C1962a.this.f8559c.m12122c(c2050d.f9524a);
            }
            return c2042cM12084h;
        }

        /* JADX INFO: renamed from: v */
        public final void m11251v(C1963b c1963b, lrv lrvVar) {
            boolean z;
            long j;
            C1963b c1963b2 = this.f8576d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f8577e = jElapsedRealtime;
            C1963b c1963bM11221G = C1962a.this.m11221G(c1963b2, c1963b);
            this.f8576d = c1963bM11221G;
            IOException playlistStuckException = null;
            if (c1963bM11221G != c1963b2) {
                this.f8582j = null;
                this.f8578f = jElapsedRealtime;
                C1962a.this.m11232R(this.f8573a, c1963bM11221G);
            } else if (!c1963bM11221G.f8595o) {
                long size = c1963b.f8591k + ((long) c1963b.f8598r.size());
                C1963b c1963b3 = this.f8576d;
                if (size < c1963b3.f8591k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.f8573a);
                    z = true;
                } else {
                    z = false;
                    if (jElapsedRealtime - this.f8578f > vck0.m197874l1(c1963b3.f8593m) * C1962a.this.f8562f) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(this.f8573a);
                    }
                }
                if (playlistStuckException != null) {
                    this.f8582j = playlistStuckException;
                    C1962a.this.m11228N(this.f8573a, new InterfaceC2049c.c(lrvVar, new nkx(4), playlistStuckException, 1), z);
                }
            }
            C1963b c1963b4 = this.f8576d;
            if (c1963b4.f8602v.f8625e) {
                j = 0;
            } else {
                j = c1963b4 != c1963b2 ? c1963b4.f8593m : c1963b4.f8593m / 2;
            }
            this.f8579g = jElapsedRealtime + vck0.m197874l1(j);
            if ((this.f8576d.f8594n != -9223372036854775807L || this.f8573a.equals(C1962a.this.f8568l)) && !this.f8576d.f8595o) {
                m11246p(m11241i());
            }
        }

        /* JADX INFO: renamed from: w */
        public void m11252w() {
            this.f8574b.m12090l();
        }
    }

    public C1962a(q2l q2lVar, InterfaceC2049c interfaceC2049c, x2l x2lVar, double d) {
        this.f8557a = q2lVar;
        this.f8558b = x2lVar;
        this.f8559c = interfaceC2049c;
        this.f8562f = d;
        this.f8561e = new CopyOnWriteArrayList<>();
        this.f8560d = new HashMap<>();
        this.f8571o = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: F */
    public static C1963b.d m11208F(C1963b c1963b, C1963b c1963b2) {
        int i = (int) (c1963b2.f8591k - c1963b.f8591k);
        List<C1963b.d> list = c1963b.f8598r;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m11220E(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f8560d.put(uri, new c(uri));
        }
    }

    /* JADX INFO: renamed from: G */
    public final C1963b m11221G(@Nullable C1963b c1963b, C1963b c1963b2) {
        if (c1963b2.m11258f(c1963b)) {
            return c1963b2.m11255c(m11223I(c1963b, c1963b2), m11222H(c1963b, c1963b2));
        }
        return c1963b2.f8595o ? c1963b.m11256d() : c1963b;
    }

    /* JADX INFO: renamed from: H */
    public final int m11222H(@Nullable C1963b c1963b, C1963b c1963b2) {
        C1963b.d dVarM11208F;
        if (c1963b2.f8589i) {
            return c1963b2.f8590j;
        }
        C1963b c1963b3 = this.f8569m;
        int i = c1963b3 != null ? c1963b3.f8590j : 0;
        return (c1963b == null || (dVarM11208F = m11208F(c1963b, c1963b2)) == null) ? i : (c1963b.f8590j + dVarM11208F.f8613d) - c1963b2.f8598r.get(0).f8613d;
    }

    /* JADX INFO: renamed from: I */
    public final long m11223I(@Nullable C1963b c1963b, C1963b c1963b2) {
        if (c1963b2.f8596p) {
            return c1963b2.f8588h;
        }
        C1963b c1963b3 = this.f8569m;
        long j = c1963b3 != null ? c1963b3.f8588h : 0L;
        if (c1963b != null) {
            int size = c1963b.f8598r.size();
            C1963b.d dVarM11208F = m11208F(c1963b, c1963b2);
            if (dVarM11208F != null) {
                return c1963b.f8588h + dVarM11208F.f8614e;
            }
            if (size == c1963b2.f8591k - c1963b.f8591k) {
                return c1963b.m11257e();
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: J */
    public final Uri m11224J(Uri uri) {
        C1963b.c cVar;
        C1963b c1963b = this.f8569m;
        if (c1963b == null || !c1963b.f8602v.f8625e || (cVar = c1963b.f8600t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f8606b));
        int i = cVar.f8607c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m11225K(Uri uri) {
        List<C1964c.b> list = this.f8567k.f8628e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).f8641a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m11226L() {
        List<C1964c.b> list = this.f8567k.f8628e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            c cVar = (c) p11.m167011e(this.f8560d.get(list.get(i).f8641a));
            if (jElapsedRealtime > cVar.f8580h) {
                Uri uri = cVar.f8573a;
                this.f8568l = uri;
                cVar.m11246p(m11224J(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final void m11227M(Uri uri) {
        if (uri.equals(this.f8568l) || !m11225K(uri)) {
            return;
        }
        C1963b c1963b = this.f8569m;
        if (c1963b == null || !c1963b.f8595o) {
            this.f8568l = uri;
            c cVar = this.f8560d.get(uri);
            C1963b c1963b2 = cVar.f8576d;
            if (c1963b2 == null || !c1963b2.f8595o) {
                cVar.m11246p(m11224J(uri));
            } else {
                this.f8569m = c1963b2;
                this.f8566j.onPrimaryPlaylistRefreshed(c1963b2);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m11228N(Uri uri, InterfaceC2049c.c cVar, boolean z) {
        Iterator<HlsPlaylistTracker.InterfaceC1960b> it = this.f8561e.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().mo11203b(uri, cVar, z);
        }
        return z2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo11024n(C2050d<w2l> c2050d, long j, long j2, boolean z) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        this.f8559c.m12122c(c2050d.f9524a);
        this.f8563g.m11280j(lrvVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo11025o(C2050d<w2l> c2050d, long j, long j2) {
        w2l w2lVarM12126e = c2050d.m12126e();
        boolean z = w2lVarM12126e instanceof C1963b;
        C1964c c1964cM11264e = z ? C1964c.m11264e(w2lVarM12126e.f184248a) : (C1964c) w2lVarM12126e;
        this.f8567k = c1964cM11264e;
        this.f8568l = c1964cM11264e.f8628e.get(0).f8641a;
        this.f8561e.add(new b());
        m11220E(c1964cM11264e.f8627d);
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        c cVar = this.f8560d.get(this.f8568l);
        if (z) {
            cVar.m11251v((C1963b) w2lVarM12126e, lrvVar);
        } else {
            cVar.m11244l();
        }
        this.f8559c.m12122c(c2050d.f9524a);
        this.f8563g.m11283m(lrvVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Loader.C2042c mo11026q(C2050d<w2l> c2050d, long j, long j2, IOException iOException, int i) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        long jMo12118a = this.f8559c.mo12118a(new InterfaceC2049c.c(lrvVar, new nkx(c2050d.f9526c), iOException, i));
        boolean z = jMo12118a == -9223372036854775807L;
        this.f8563g.m11287q(lrvVar, c2050d.f9526c, iOException, z);
        if (z) {
            this.f8559c.m12122c(c2050d.f9524a);
        }
        return z ? Loader.f9459g : Loader.m12084h(false, jMo12118a);
    }

    /* JADX INFO: renamed from: R */
    public final void m11232R(Uri uri, C1963b c1963b) {
        if (uri.equals(this.f8568l)) {
            if (this.f8569m == null) {
                this.f8570n = !c1963b.f8595o;
                this.f8571o = c1963b.f8588h;
            }
            this.f8569m = c1963b;
            this.f8566j.onPrimaryPlaylistRefreshed(c1963b);
        }
        Iterator<HlsPlaylistTracker.InterfaceC1960b> it = this.f8561e.iterator();
        while (it.hasNext()) {
            it.next().mo11202a();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: a */
    public void mo11189a(HlsPlaylistTracker.InterfaceC1960b interfaceC1960b) {
        this.f8561e.remove(interfaceC1960b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: b */
    public long mo11190b() {
        return this.f8571o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: c */
    public void mo11191c(Uri uri, InterfaceC1966j.a aVar, HlsPlaylistTracker.InterfaceC1961c interfaceC1961c) {
        this.f8565i = vck0.m197896w();
        this.f8563g = aVar;
        this.f8566j = interfaceC1961c;
        C2050d c2050d = new C2050d(this.f8557a.mo172471a(4), uri, 4, this.f8558b.mo102939b());
        p11.m167013g(this.f8564h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f8564h = loader;
        aVar.m11289s(new lrv(c2050d.f9524a, c2050d.f9525b, loader.m12092n(c2050d, this, this.f8559c.mo12120d(c2050d.f9526c))), c2050d.f9526c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: d */
    public void mo11192d(Uri uri) throws IOException {
        this.f8560d.get(uri).m11247r();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    /* JADX INFO: renamed from: e */
    public C1964c mo11193e() {
        return this.f8567k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: f */
    public void mo11194f(Uri uri) {
        this.f8560d.get(uri).m11244l();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: g */
    public void mo11195g(HlsPlaylistTracker.InterfaceC1960b interfaceC1960b) {
        p11.m167011e(interfaceC1960b);
        this.f8561e.add(interfaceC1960b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: h */
    public boolean mo11196h(Uri uri) {
        return this.f8560d.get(uri).m11243k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: i */
    public boolean mo11197i() {
        return this.f8570n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: j */
    public boolean mo11198j(Uri uri, long j) {
        c cVar = this.f8560d.get(uri);
        if (cVar != null) {
            return !cVar.m11240h(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: k */
    public void mo11199k() throws IOException {
        Loader loader = this.f8564h;
        if (loader != null) {
            loader.mo11027a();
        }
        Uri uri = this.f8568l;
        if (uri != null) {
            mo11192d(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    /* JADX INFO: renamed from: l */
    public C1963b mo11200l(Uri uri, boolean z) {
        C1963b c1963bM11242j = this.f8560d.get(uri).m11242j();
        if (c1963bM11242j != null && z) {
            m11227M(uri);
        }
        return c1963bM11242j;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f8568l = null;
        this.f8569m = null;
        this.f8567k = null;
        this.f8571o = -9223372036854775807L;
        this.f8564h.m12090l();
        this.f8564h = null;
        Iterator<c> it = this.f8560d.values().iterator();
        while (it.hasNext()) {
            it.next().m11252w();
        }
        this.f8565i.removeCallbacksAndMessages(null);
        this.f8565i = null;
        this.f8560d.clear();
    }

    public C1962a(q2l q2lVar, InterfaceC2049c interfaceC2049c, x2l x2lVar) {
        this(q2lVar, interfaceC2049c, x2lVar, 3.5d);
    }
}
