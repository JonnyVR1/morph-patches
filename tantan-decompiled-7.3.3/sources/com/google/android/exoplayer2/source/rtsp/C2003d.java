package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;
import p153l.akq;
import p153l.bmk0;
import p153l.hqd0;
import p153l.ksx;
import p153l.kyv;
import p153l.lqd0;
import p153l.oqd0;
import p153l.pqd0;
import p153l.qqd0;
import p153l.r8g0;
import p153l.rqd0;
import p153l.rse0;
import p153l.sqd0;
import p153l.tqd0;
import p153l.upq;
import p153l.w11;
import p153l.zpd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2003d implements Closeable {

    /* JADX INFO: renamed from: a */
    public final f f8870a;

    /* JADX INFO: renamed from: b */
    public final e f8871b;

    /* JADX INFO: renamed from: c */
    public final String f8872c;

    /* JADX INFO: renamed from: d */
    public final SocketFactory f8873d;

    /* JADX INFO: renamed from: e */
    public final boolean f8874e;

    /* JADX INFO: renamed from: i */
    public Uri f8878i;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C2007h.a f8880k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f8881l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public b f8882m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public C2002c f8883n;

    /* JADX INFO: renamed from: p */
    public boolean f8885p;

    /* JADX INFO: renamed from: q */
    public boolean f8886q;

    /* JADX INFO: renamed from: r */
    public boolean f8887r;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<C2005f.d> f8875f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    public final SparseArray<qqd0> f8876g = new SparseArray<>();

    /* JADX INFO: renamed from: h */
    public final d f8877h = new d();

    /* JADX INFO: renamed from: j */
    public C2006g f8879j = new C2006g(new c());

    /* JADX INFO: renamed from: s */
    public long f8888s = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public int f8884o = -1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$b */
    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: a */
        public final Handler f8889a = bmk0.m105174w();

        /* JADX INFO: renamed from: b */
        public final long f8890b;

        /* JADX INFO: renamed from: c */
        public boolean f8891c;

        public b(long j) {
            this.f8890b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8891c = false;
            this.f8889a.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: k */
        public void m11583k() {
            if (this.f8891c) {
                return;
            }
            this.f8891c = true;
            this.f8889a.postDelayed(this, this.f8890b);
        }

        @Override // java.lang.Runnable
        public void run() {
            C2003d.this.f8877h.m11598e(C2003d.this.f8878i, C2003d.this.f8881l);
            this.f8889a.postDelayed(this, this.f8890b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$c */
    public final class c implements C2006g.d {

        /* JADX INFO: renamed from: a */
        public final Handler f8893a = bmk0.m105174w();

        public c() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2006g.d
        /* JADX INFO: renamed from: b */
        public void mo11585b(final List<String> list) {
            this.f8893a.post(new Runnable() { // from class: l.gqd0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105675a.m11586e(list);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        public final void m11586e(List<String> list) {
            C2003d.this.m11575n0(list);
            if (C2007h.m11707e(list)) {
                m11588g(list);
            } else {
                m11587f(list);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m11587f(List<String> list) {
            C2003d.this.f8877h.m11597d(Integer.parseInt((String) w11.m204369e(C2007h.m11713k(list).f158993c.m11613d("CSeq"))));
        }

        /* JADX INFO: renamed from: g */
        public final void m11588g(List<String> list) {
            ImmutableList<tqd0> immutableListM15739of;
            rqd0 rqd0VarM11714l = C2007h.m11714l(list);
            int i = Integer.parseInt((String) w11.m204369e(rqd0VarM11714l.f164472b.m11613d("CSeq")));
            qqd0 qqd0Var = (qqd0) C2003d.this.f8876g.get(i);
            if (qqd0Var == null) {
                return;
            }
            C2003d.this.f8876g.remove(i);
            int i2 = qqd0Var.f158992b;
            try {
                try {
                    int i3 = rqd0VarM11714l.f164471a;
                    if (i3 == 200) {
                        switch (i2) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                m11589h(new hqd0(rqd0VarM11714l.f164472b, i3, rse0.m182953b(rqd0VarM11714l.f164473c)));
                                return;
                            case 4:
                                m11590i(new oqd0(i3, C2007h.m11712j(rqd0VarM11714l.f164472b.m11613d("Public"))));
                                return;
                            case 5:
                                m11591j();
                                return;
                            case 6:
                                String strM11613d = rqd0VarM11714l.f164472b.m11613d("Range");
                                sqd0 sqd0VarM187514d = strM11613d == null ? sqd0.f170157c : sqd0.m187514d(strM11613d);
                                try {
                                    String strM11613d2 = rqd0VarM11714l.f164472b.m11613d("RTP-Info");
                                    immutableListM15739of = strM11613d2 == null ? ImmutableList.m15739of() : tqd0.m192277a(strM11613d2, C2003d.this.f8878i);
                                } catch (ParserException unused) {
                                    immutableListM15739of = ImmutableList.m15739of();
                                }
                                m11592k(new pqd0(rqd0VarM11714l.f164471a, sqd0VarM187514d, immutableListM15739of));
                                return;
                            case 10:
                                String strM11613d3 = rqd0VarM11714l.f164472b.m11613d("Session");
                                String strM11613d4 = rqd0VarM11714l.f164472b.m11613d("Transport");
                                if (strM11613d3 == null || strM11613d4 == null) {
                                    throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                                }
                                m11593l(new C2008i(rqd0VarM11714l.f164471a, C2007h.m11715m(strM11613d3), strM11613d4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i3 == 401) {
                        if (C2003d.this.f8880k == null || C2003d.this.f8886q) {
                            C2003d.this.m11572k0(new RtspMediaSource.RtspPlaybackException(C2007h.m11722t(i2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rqd0VarM11714l.f164471a));
                            return;
                        }
                        ImmutableList<String> immutableListM11614e = rqd0VarM11714l.f164472b.m11614e(HttpHeaders.WWW_AUTHENTICATE);
                        if (immutableListM11614e.isEmpty()) {
                            throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i4 = 0; i4 < immutableListM11614e.size(); i4++) {
                            C2003d.this.f8883n = C2007h.m11717o(immutableListM11614e.get(i4));
                            if (C2003d.this.f8883n.f8866a == 2) {
                                break;
                            }
                        }
                        C2003d.this.f8877h.m11595b();
                        C2003d.this.f8886q = true;
                        return;
                    }
                    if (i3 == 461) {
                        String str = C2007h.m11722t(i2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rqd0VarM11714l.f164471a;
                        C2003d.this.m11572k0((i2 != 10 || ((String) w11.m204369e(qqd0Var.f158993c.m11613d("Transport"))).contains("TCP")) ? new RtspMediaSource.RtspPlaybackException(str) : new RtspMediaSource.RtspUdpUnsupportedTransportException(str));
                        return;
                    }
                    if (i3 != 301 && i3 != 302) {
                        C2003d.this.m11572k0(new RtspMediaSource.RtspPlaybackException(C2007h.m11722t(i2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rqd0VarM11714l.f164471a));
                        return;
                    }
                    if (C2003d.this.f8884o != -1) {
                        C2003d.this.f8884o = 0;
                    }
                    String strM11613d5 = rqd0VarM11714l.f164472b.m11613d("Location");
                    if (strM11613d5 == null) {
                        C2003d.this.f8870a.mo11608c("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(strM11613d5);
                    C2003d.this.f8878i = C2007h.m11718p(uri);
                    C2003d.this.f8880k = C2007h.m11716n(uri);
                    C2003d.this.f8877h.m11596c(C2003d.this.f8878i, C2003d.this.f8881l);
                } catch (IllegalArgumentException e) {
                    e = e;
                    C2003d.this.m11572k0(new RtspMediaSource.RtspPlaybackException(e));
                }
            } catch (ParserException e2) {
                e = e2;
                C2003d.this.m11572k0(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m11589h(hqd0 hqd0Var) {
            sqd0 sqd0VarM187514d = sqd0.f170157c;
            String str = hqd0Var.f111115c.f159289a.get("range");
            if (str != null) {
                try {
                    sqd0VarM187514d = sqd0.m187514d(str);
                } catch (ParserException e) {
                    C2003d.this.f8870a.mo11608c("SDP format error.", e);
                    return;
                }
            }
            ImmutableList<lqd0> immutableListM11561i0 = C2003d.m11561i0(hqd0Var, C2003d.this.f8878i);
            boolean zIsEmpty = immutableListM11561i0.isEmpty();
            C2003d c2003d = C2003d.this;
            if (zIsEmpty) {
                c2003d.f8870a.mo11608c("No playable track.", null);
            } else {
                c2003d.f8870a.mo11609f(sqd0VarM187514d, immutableListM11561i0);
                C2003d.this.f8885p = true;
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m11590i(oqd0 oqd0Var) {
            if (C2003d.this.f8882m != null) {
                return;
            }
            boolean zM11567r0 = C2003d.m11567r0(oqd0Var.f148584b);
            C2003d c2003d = C2003d.this;
            if (zM11567r0) {
                c2003d.f8877h.m11596c(C2003d.this.f8878i, C2003d.this.f8881l);
            } else {
                c2003d.f8870a.mo11608c("DESCRIBE not supported.", null);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m11591j() {
            w11.m204371g(C2003d.this.f8884o == 2);
            C2003d.this.f8884o = 1;
            C2003d.this.f8887r = false;
            if (C2003d.this.f8888s != -9223372036854775807L) {
                C2003d c2003d = C2003d.this;
                c2003d.m11582v0(bmk0.m105152l1(c2003d.f8888s));
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m11592k(pqd0 pqd0Var) {
            boolean z = true;
            if (C2003d.this.f8884o != 1 && C2003d.this.f8884o != 2) {
                z = false;
            }
            w11.m204371g(z);
            C2003d.this.f8884o = 2;
            if (C2003d.this.f8882m == null) {
                C2003d c2003d = C2003d.this;
                c2003d.f8882m = c2003d.new b(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
                C2003d.this.f8882m.m11583k();
            }
            C2003d.this.f8888s = -9223372036854775807L;
            C2003d.this.f8871b.mo11606e(bmk0.m105084J0(pqd0Var.f153666b.f170159a), pqd0Var.f153667c);
        }

        /* JADX INFO: renamed from: l */
        public final void m11593l(C2008i c2008i) {
            w11.m204371g(C2003d.this.f8884o != -1);
            C2003d.this.f8884o = 1;
            C2003d.this.f8881l = c2008i.f8968b.f8965a;
            C2003d.this.m11571j0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public int f8895a;

        /* JADX INFO: renamed from: b */
        public qqd0 f8896b;

        public d() {
        }

        /* JADX INFO: renamed from: a */
        public final qqd0 m11594a(int i, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = C2003d.this.f8872c;
            int i2 = this.f8895a;
            this.f8895a = i2 + 1;
            C2004e.b bVar = new C2004e.b(str2, str, i2);
            if (C2003d.this.f8883n != null) {
                w11.m204373i(C2003d.this.f8880k);
                try {
                    bVar.m11616b("Authorization", C2003d.this.f8883n.m11537a(C2003d.this.f8880k, uri, i));
                } catch (ParserException e) {
                    C2003d.this.m11572k0(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            bVar.m11618d(map);
            return new qqd0(uri, i, bVar.m11619e(), "");
        }

        /* JADX INFO: renamed from: b */
        public void m11595b() {
            w11.m204373i(this.f8896b);
            ImmutableListMultimap<String, String> immutableListMultimapM11612b = this.f8896b.f158993c.m11612b();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapM11612b.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) akq.m98599g(immutableListMultimapM11612b.get(str)));
                }
            }
            m11601h(m11594a(this.f8896b.f158992b, C2003d.this.f8881l, map, this.f8896b.f158991a));
        }

        /* JADX INFO: renamed from: c */
        public void m11596c(Uri uri, @Nullable String str) {
            m11601h(m11594a(2, str, ImmutableMap.m15769of(), uri));
        }

        /* JADX INFO: renamed from: d */
        public void m11597d(int i) {
            m11602i(new rqd0(HttpStatus.METHOD_NOT_ALLOWED_405, new C2004e.b(C2003d.this.f8872c, C2003d.this.f8881l, i).m11619e()));
            this.f8895a = Math.max(this.f8895a, i + 1);
        }

        /* JADX INFO: renamed from: e */
        public void m11598e(Uri uri, @Nullable String str) {
            m11601h(m11594a(4, str, ImmutableMap.m15769of(), uri));
        }

        /* JADX INFO: renamed from: f */
        public void m11599f(Uri uri, String str) {
            w11.m204371g(C2003d.this.f8884o == 2);
            m11601h(m11594a(5, str, ImmutableMap.m15769of(), uri));
            C2003d.this.f8887r = true;
        }

        /* JADX INFO: renamed from: g */
        public void m11600g(Uri uri, long j, String str) {
            boolean z = true;
            if (C2003d.this.f8884o != 1 && C2003d.this.f8884o != 2) {
                z = false;
            }
            w11.m204371g(z);
            m11601h(m11594a(6, str, ImmutableMap.m15770of("Range", sqd0.m187513b(j)), uri));
        }

        /* JADX INFO: renamed from: h */
        public final void m11601h(qqd0 qqd0Var) {
            int i = Integer.parseInt((String) w11.m204369e(qqd0Var.f158993c.m11613d("CSeq")));
            w11.m204371g(C2003d.this.f8876g.get(i) == null);
            C2003d.this.f8876g.append(i, qqd0Var);
            ImmutableList<String> immutableListM11719q = C2007h.m11719q(qqd0Var);
            C2003d.this.m11575n0(immutableListM11719q);
            C2003d.this.f8879j.m11687i(immutableListM11719q);
            this.f8896b = qqd0Var;
        }

        /* JADX INFO: renamed from: i */
        public final void m11602i(rqd0 rqd0Var) {
            ImmutableList<String> immutableListM11720r = C2007h.m11720r(rqd0Var);
            C2003d.this.m11575n0(immutableListM11720r);
            C2003d.this.f8879j.m11687i(immutableListM11720r);
        }

        /* JADX INFO: renamed from: j */
        public void m11603j(Uri uri, String str, @Nullable String str2) {
            C2003d.this.f8884o = 0;
            m11601h(m11594a(10, str2, ImmutableMap.m15770of("Transport", str), uri));
        }

        /* JADX INFO: renamed from: k */
        public void m11604k(Uri uri, String str) {
            if (C2003d.this.f8884o == -1 || C2003d.this.f8884o == 0) {
                return;
            }
            C2003d.this.f8884o = 0;
            m11601h(m11594a(12, str, ImmutableMap.m15769of(), uri));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$e */
    public interface e {
        /* JADX INFO: renamed from: d */
        void mo11605d();

        /* JADX INFO: renamed from: e */
        void mo11606e(long j, ImmutableList<tqd0> immutableList);

        /* JADX INFO: renamed from: g */
        void mo11607g(RtspMediaSource.RtspPlaybackException rtspPlaybackException);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$f */
    public interface f {
        /* JADX INFO: renamed from: c */
        void mo11608c(String str, @Nullable Throwable th);

        /* JADX INFO: renamed from: f */
        void mo11609f(sqd0 sqd0Var, ImmutableList<lqd0> immutableList);
    }

    public C2003d(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.f8870a = fVar;
        this.f8871b = eVar;
        this.f8872c = str;
        this.f8873d = socketFactory;
        this.f8874e = z;
        this.f8878i = C2007h.m11718p(uri);
        this.f8880k = C2007h.m11716n(uri);
    }

    /* JADX INFO: renamed from: i0 */
    public static ImmutableList<lqd0> m11561i0(hqd0 hqd0Var, Uri uri) {
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        for (int i = 0; i < hqd0Var.f111115c.f159290b.size(); i++) {
            ksx ksxVar = hqd0Var.f111115c.f159290b.get(i);
            if (zpd0.m220833c(ksxVar)) {
                c2804a.mo15737a(new lqd0(hqd0Var.f111113a, ksxVar, uri));
            }
        }
        return c2804a.m15756m();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m11567r0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f8882m;
        if (bVar != null) {
            bVar.close();
            this.f8882m = null;
            this.f8877h.m11604k(this.f8878i, (String) w11.m204369e(this.f8881l));
        }
        this.f8879j.close();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m11571j0() {
        C2005f.d dVarPollFirst = this.f8875f.pollFirst();
        if (dVarPollFirst == null) {
            this.f8871b.mo11605d();
        } else {
            this.f8877h.m11603j(dVarPollFirst.m11668c(), dVarPollFirst.m11669d(), this.f8881l);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m11572k0(Throwable th) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th : new RtspMediaSource.RtspPlaybackException(th);
        if (this.f8885p) {
            this.f8871b.mo11607g(rtspPlaybackException);
        } else {
            this.f8870a.mo11608c(r8g0.m180206e(th.getMessage()), th);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final Socket m11573l0(Uri uri) throws IOException {
        w11.m204365a(uri.getHost() != null);
        return this.f8873d.createSocket((String) w11.m204369e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* JADX INFO: renamed from: m0 */
    public int m11574m0() {
        return this.f8884o;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m11575n0(List<String> list) {
        if (this.f8874e) {
            kyv.m152144b("RtspClient", upq.m197175h(SignParameters.NEW_LINE).m197179d(list));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m11576o0(int i, C2006g.b bVar) {
        this.f8879j.m11686h(i, bVar);
    }

    /* JADX INFO: renamed from: p0 */
    public void m11577p0() {
        try {
            close();
            C2006g c2006g = new C2006g(new c());
            this.f8879j = c2006g;
            c2006g.m11685g(m11573l0(this.f8878i));
            this.f8881l = null;
            this.f8886q = false;
            this.f8883n = null;
        } catch (IOException e2) {
            this.f8871b.mo11607g(new RtspMediaSource.RtspPlaybackException(e2));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m11578q0(long j) {
        if (this.f8884o == 2 && !this.f8887r) {
            this.f8877h.m11599f(this.f8878i, (String) w11.m204369e(this.f8881l));
        }
        this.f8888s = j;
    }

    /* JADX INFO: renamed from: s0 */
    public void m11579s0(List<C2005f.d> list) {
        this.f8875f.addAll(list);
        m11571j0();
    }

    /* JADX INFO: renamed from: t0 */
    public void m11580t0() {
        this.f8884o = 1;
    }

    /* JADX INFO: renamed from: u0 */
    public void m11581u0() throws IOException {
        try {
            this.f8879j.m11685g(m11573l0(this.f8878i));
            this.f8877h.m11598e(this.f8878i, this.f8881l);
        } catch (IOException e2) {
            bmk0.m105156n(this.f8879j);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m11582v0(long j) {
        this.f8877h.m11600g(this.f8878i, j, (String) w11.m204369e(this.f8881l));
    }
}
