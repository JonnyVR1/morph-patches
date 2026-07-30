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
import p149l.aiq;
import p149l.eid0;
import p149l.iid0;
import p149l.jwv;
import p149l.k0g0;
import p149l.lid0;
import p149l.mid0;
import p149l.mke0;
import p149l.nid0;
import p149l.njx;
import p149l.oid0;
import p149l.p11;
import p149l.pid0;
import p149l.qid0;
import p149l.vck0;
import p149l.vnq;
import p149l.whd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1980d implements Closeable {

    /* JADX INFO: renamed from: a */
    public final f f8833a;

    /* JADX INFO: renamed from: b */
    public final e f8834b;

    /* JADX INFO: renamed from: c */
    public final String f8835c;

    /* JADX INFO: renamed from: d */
    public final SocketFactory f8836d;

    /* JADX INFO: renamed from: e */
    public final boolean f8837e;

    /* JADX INFO: renamed from: i */
    public Uri f8841i;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C1984h.a f8843k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f8844l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public b f8845m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public C1979c f8846n;

    /* JADX INFO: renamed from: p */
    public boolean f8848p;

    /* JADX INFO: renamed from: q */
    public boolean f8849q;

    /* JADX INFO: renamed from: r */
    public boolean f8850r;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<C1982f.d> f8838f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    public final SparseArray<nid0> f8839g = new SparseArray<>();

    /* JADX INFO: renamed from: h */
    public final d f8840h = new d();

    /* JADX INFO: renamed from: j */
    public C1983g f8842j = new C1983g(new c());

    /* JADX INFO: renamed from: s */
    public long f8851s = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public int f8847o = -1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$b */
    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: a */
        public final Handler f8852a = vck0.m197896w();

        /* JADX INFO: renamed from: b */
        public final long f8853b;

        /* JADX INFO: renamed from: c */
        public boolean f8854c;

        public b(long j) {
            this.f8853b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8854c = false;
            this.f8852a.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: k */
        public void m11529k() {
            if (this.f8854c) {
                return;
            }
            this.f8854c = true;
            this.f8852a.postDelayed(this, this.f8853b);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1980d.this.f8840h.m11544e(C1980d.this.f8841i, C1980d.this.f8844l);
            this.f8852a.postDelayed(this, this.f8853b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$c */
    public final class c implements C1983g.d {

        /* JADX INFO: renamed from: a */
        public final Handler f8856a = vck0.m197896w();

        public c() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1983g.d
        /* JADX INFO: renamed from: b */
        public void mo11531b(final List<String> list) {
            this.f8856a.post(new Runnable() { // from class: l.did0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86377a.m11532e(list);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        public final void m11532e(List<String> list) {
            C1980d.this.m11521m0(list);
            if (C1984h.m11653e(list)) {
                m11534g(list);
            } else {
                m11533f(list);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m11533f(List<String> list) {
            C1980d.this.f8840h.m11543d(Integer.parseInt((String) p11.m167011e(C1984h.m11659k(list).f139083c.m11559d("CSeq"))));
        }

        /* JADX INFO: renamed from: g */
        public final void m11534g(List<String> list) {
            ImmutableList<qid0> immutableListM15685of;
            oid0 oid0VarM11660l = C1984h.m11660l(list);
            int i = Integer.parseInt((String) p11.m167011e(oid0VarM11660l.f144108b.m11559d("CSeq")));
            nid0 nid0Var = (nid0) C1980d.this.f8839g.get(i);
            if (nid0Var == null) {
                return;
            }
            C1980d.this.f8839g.remove(i);
            int i2 = nid0Var.f139082b;
            try {
                try {
                    int i3 = oid0VarM11660l.f144107a;
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
                                m11535h(new eid0(oid0VarM11660l.f144108b, i3, mke0.m155001b(oid0VarM11660l.f144109c)));
                                return;
                            case 4:
                                m11536i(new lid0(i3, C1984h.m11658j(oid0VarM11660l.f144108b.m11559d("Public"))));
                                return;
                            case 5:
                                m11537j();
                                return;
                            case 6:
                                String strM11559d = oid0VarM11660l.f144108b.m11559d("Range");
                                pid0 pid0VarM169593d = strM11559d == null ? pid0.f149541c : pid0.m169593d(strM11559d);
                                try {
                                    String strM11559d2 = oid0VarM11660l.f144108b.m11559d("RTP-Info");
                                    immutableListM15685of = strM11559d2 == null ? ImmutableList.m15685of() : qid0.m174864a(strM11559d2, C1980d.this.f8841i);
                                } catch (ParserException unused) {
                                    immutableListM15685of = ImmutableList.m15685of();
                                }
                                m11538k(new mid0(oid0VarM11660l.f144107a, pid0VarM169593d, immutableListM15685of));
                                return;
                            case 10:
                                String strM11559d3 = oid0VarM11660l.f144108b.m11559d("Session");
                                String strM11559d4 = oid0VarM11660l.f144108b.m11559d("Transport");
                                if (strM11559d3 == null || strM11559d4 == null) {
                                    throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                                }
                                m11539l(new C1985i(oid0VarM11660l.f144107a, C1984h.m11661m(strM11559d3), strM11559d4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i3 == 401) {
                        if (C1980d.this.f8843k == null || C1980d.this.f8849q) {
                            C1980d.this.m11518j0(new RtspMediaSource.RtspPlaybackException(C1984h.m11668t(i2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + oid0VarM11660l.f144107a));
                            return;
                        }
                        ImmutableList<String> immutableListM11560e = oid0VarM11660l.f144108b.m11560e(HttpHeaders.WWW_AUTHENTICATE);
                        if (immutableListM11560e.isEmpty()) {
                            throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i4 = 0; i4 < immutableListM11560e.size(); i4++) {
                            C1980d.this.f8846n = C1984h.m11663o(immutableListM11560e.get(i4));
                            if (C1980d.this.f8846n.f8829a == 2) {
                                break;
                            }
                        }
                        C1980d.this.f8840h.m11541b();
                        C1980d.this.f8849q = true;
                        return;
                    }
                    if (i3 == 461) {
                        String str = C1984h.m11668t(i2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + oid0VarM11660l.f144107a;
                        C1980d.this.m11518j0((i2 != 10 || ((String) p11.m167011e(nid0Var.f139083c.m11559d("Transport"))).contains("TCP")) ? new RtspMediaSource.RtspPlaybackException(str) : new RtspMediaSource.RtspUdpUnsupportedTransportException(str));
                        return;
                    }
                    if (i3 != 301 && i3 != 302) {
                        C1980d.this.m11518j0(new RtspMediaSource.RtspPlaybackException(C1984h.m11668t(i2) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + oid0VarM11660l.f144107a));
                        return;
                    }
                    if (C1980d.this.f8847o != -1) {
                        C1980d.this.f8847o = 0;
                    }
                    String strM11559d5 = oid0VarM11660l.f144108b.m11559d("Location");
                    if (strM11559d5 == null) {
                        C1980d.this.f8833a.mo11554c("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(strM11559d5);
                    C1980d.this.f8841i = C1984h.m11664p(uri);
                    C1980d.this.f8843k = C1984h.m11662n(uri);
                    C1980d.this.f8840h.m11542c(C1980d.this.f8841i, C1980d.this.f8844l);
                } catch (IllegalArgumentException e) {
                    e = e;
                    C1980d.this.m11518j0(new RtspMediaSource.RtspPlaybackException(e));
                }
            } catch (ParserException e2) {
                e = e2;
                C1980d.this.m11518j0(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m11535h(eid0 eid0Var) {
            pid0 pid0VarM169593d = pid0.f149541c;
            String str = eid0Var.f91594c.f128467a.get("range");
            if (str != null) {
                try {
                    pid0VarM169593d = pid0.m169593d(str);
                } catch (ParserException e) {
                    C1980d.this.f8833a.mo11554c("SDP format error.", e);
                    return;
                }
            }
            ImmutableList<iid0> immutableListM11506h0 = C1980d.m11506h0(eid0Var, C1980d.this.f8841i);
            boolean zIsEmpty = immutableListM11506h0.isEmpty();
            C1980d c1980d = C1980d.this;
            if (zIsEmpty) {
                c1980d.f8833a.mo11554c("No playable track.", null);
            } else {
                c1980d.f8833a.mo11555f(pid0VarM169593d, immutableListM11506h0);
                C1980d.this.f8848p = true;
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m11536i(lid0 lid0Var) {
            if (C1980d.this.f8845m != null) {
                return;
            }
            boolean zM11513q0 = C1980d.m11513q0(lid0Var.f128185b);
            C1980d c1980d = C1980d.this;
            if (zM11513q0) {
                c1980d.f8840h.m11542c(C1980d.this.f8841i, C1980d.this.f8844l);
            } else {
                c1980d.f8833a.mo11554c("DESCRIBE not supported.", null);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m11537j() {
            p11.m167013g(C1980d.this.f8847o == 2);
            C1980d.this.f8847o = 1;
            C1980d.this.f8850r = false;
            if (C1980d.this.f8851s != -9223372036854775807L) {
                C1980d c1980d = C1980d.this;
                c1980d.m11528u0(vck0.m197874l1(c1980d.f8851s));
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m11538k(mid0 mid0Var) {
            boolean z = true;
            if (C1980d.this.f8847o != 1 && C1980d.this.f8847o != 2) {
                z = false;
            }
            p11.m167013g(z);
            C1980d.this.f8847o = 2;
            if (C1980d.this.f8845m == null) {
                C1980d c1980d = C1980d.this;
                c1980d.f8845m = c1980d.new b(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
                C1980d.this.f8845m.m11529k();
            }
            C1980d.this.f8851s = -9223372036854775807L;
            C1980d.this.f8834b.mo11552e(vck0.m197806J0(mid0Var.f133965b.f149543a), mid0Var.f133966c);
        }

        /* JADX INFO: renamed from: l */
        public final void m11539l(C1985i c1985i) {
            p11.m167013g(C1980d.this.f8847o != -1);
            C1980d.this.f8847o = 1;
            C1980d.this.f8844l = c1985i.f8931b.f8928a;
            C1980d.this.m11517i0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public int f8858a;

        /* JADX INFO: renamed from: b */
        public nid0 f8859b;

        public d() {
        }

        /* JADX INFO: renamed from: a */
        public final nid0 m11540a(int i, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = C1980d.this.f8835c;
            int i2 = this.f8858a;
            this.f8858a = i2 + 1;
            C1981e.b bVar = new C1981e.b(str2, str, i2);
            if (C1980d.this.f8846n != null) {
                p11.m167015i(C1980d.this.f8843k);
                try {
                    bVar.m11562b("Authorization", C1980d.this.f8846n.m11483a(C1980d.this.f8843k, uri, i));
                } catch (ParserException e) {
                    C1980d.this.m11518j0(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            bVar.m11564d(map);
            return new nid0(uri, i, bVar.m11565e(), "");
        }

        /* JADX INFO: renamed from: b */
        public void m11541b() {
            p11.m167015i(this.f8859b);
            ImmutableListMultimap<String, String> immutableListMultimapM11558b = this.f8859b.f139083c.m11558b();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapM11558b.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) aiq.m96881g(immutableListMultimapM11558b.get(str)));
                }
            }
            m11547h(m11540a(this.f8859b.f139082b, C1980d.this.f8844l, map, this.f8859b.f139081a));
        }

        /* JADX INFO: renamed from: c */
        public void m11542c(Uri uri, @Nullable String str) {
            m11547h(m11540a(2, str, ImmutableMap.m15715of(), uri));
        }

        /* JADX INFO: renamed from: d */
        public void m11543d(int i) {
            m11548i(new oid0(HttpStatus.METHOD_NOT_ALLOWED_405, new C1981e.b(C1980d.this.f8835c, C1980d.this.f8844l, i).m11565e()));
            this.f8858a = Math.max(this.f8858a, i + 1);
        }

        /* JADX INFO: renamed from: e */
        public void m11544e(Uri uri, @Nullable String str) {
            m11547h(m11540a(4, str, ImmutableMap.m15715of(), uri));
        }

        /* JADX INFO: renamed from: f */
        public void m11545f(Uri uri, String str) {
            p11.m167013g(C1980d.this.f8847o == 2);
            m11547h(m11540a(5, str, ImmutableMap.m15715of(), uri));
            C1980d.this.f8850r = true;
        }

        /* JADX INFO: renamed from: g */
        public void m11546g(Uri uri, long j, String str) {
            boolean z = true;
            if (C1980d.this.f8847o != 1 && C1980d.this.f8847o != 2) {
                z = false;
            }
            p11.m167013g(z);
            m11547h(m11540a(6, str, ImmutableMap.m15716of("Range", pid0.m169592b(j)), uri));
        }

        /* JADX INFO: renamed from: h */
        public final void m11547h(nid0 nid0Var) {
            int i = Integer.parseInt((String) p11.m167011e(nid0Var.f139083c.m11559d("CSeq")));
            p11.m167013g(C1980d.this.f8839g.get(i) == null);
            C1980d.this.f8839g.append(i, nid0Var);
            ImmutableList<String> immutableListM11665q = C1984h.m11665q(nid0Var);
            C1980d.this.m11521m0(immutableListM11665q);
            C1980d.this.f8842j.m11633i(immutableListM11665q);
            this.f8859b = nid0Var;
        }

        /* JADX INFO: renamed from: i */
        public final void m11548i(oid0 oid0Var) {
            ImmutableList<String> immutableListM11666r = C1984h.m11666r(oid0Var);
            C1980d.this.m11521m0(immutableListM11666r);
            C1980d.this.f8842j.m11633i(immutableListM11666r);
        }

        /* JADX INFO: renamed from: j */
        public void m11549j(Uri uri, String str, @Nullable String str2) {
            C1980d.this.f8847o = 0;
            m11547h(m11540a(10, str2, ImmutableMap.m15716of("Transport", str), uri));
        }

        /* JADX INFO: renamed from: k */
        public void m11550k(Uri uri, String str) {
            if (C1980d.this.f8847o == -1 || C1980d.this.f8847o == 0) {
                return;
            }
            C1980d.this.f8847o = 0;
            m11547h(m11540a(12, str, ImmutableMap.m15715of(), uri));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$e */
    public interface e {
        /* JADX INFO: renamed from: d */
        void mo11551d();

        /* JADX INFO: renamed from: e */
        void mo11552e(long j, ImmutableList<qid0> immutableList);

        /* JADX INFO: renamed from: g */
        void mo11553g(RtspMediaSource.RtspPlaybackException rtspPlaybackException);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$f */
    public interface f {
        /* JADX INFO: renamed from: c */
        void mo11554c(String str, @Nullable Throwable th);

        /* JADX INFO: renamed from: f */
        void mo11555f(pid0 pid0Var, ImmutableList<iid0> immutableList);
    }

    public C1980d(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.f8833a = fVar;
        this.f8834b = eVar;
        this.f8835c = str;
        this.f8836d = socketFactory;
        this.f8837e = z;
        this.f8841i = C1984h.m11664p(uri);
        this.f8843k = C1984h.m11662n(uri);
    }

    /* JADX INFO: renamed from: h0 */
    public static ImmutableList<iid0> m11506h0(eid0 eid0Var, Uri uri) {
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        for (int i = 0; i < eid0Var.f91594c.f128468b.size(); i++) {
            njx njxVar = eid0Var.f91594c.f128468b.get(i);
            if (whd0.m203124c(njxVar)) {
                c2781a.mo15683a(new iid0(eid0Var.f91592a, njxVar, uri));
            }
        }
        return c2781a.m15702m();
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m11513q0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f8845m;
        if (bVar != null) {
            bVar.close();
            this.f8845m = null;
            this.f8840h.m11550k(this.f8841i, (String) p11.m167011e(this.f8844l));
        }
        this.f8842j.close();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11517i0() {
        C1982f.d dVarPollFirst = this.f8838f.pollFirst();
        if (dVarPollFirst == null) {
            this.f8834b.mo11551d();
        } else {
            this.f8840h.m11549j(dVarPollFirst.m11614c(), dVarPollFirst.m11615d(), this.f8844l);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m11518j0(Throwable th) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th : new RtspMediaSource.RtspPlaybackException(th);
        if (this.f8848p) {
            this.f8834b.mo11553g(rtspPlaybackException);
        } else {
            this.f8833a.mo11554c(k0g0.m144051e(th.getMessage()), th);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final Socket m11519k0(Uri uri) throws IOException {
        p11.m167007a(uri.getHost() != null);
        return this.f8836d.createSocket((String) p11.m167011e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* JADX INFO: renamed from: l0 */
    public int m11520l0() {
        return this.f8847o;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m11521m0(List<String> list) {
        if (this.f8837e) {
            jwv.m143682b("RtspClient", vnq.m199040h(SignParameters.NEW_LINE).m199044d(list));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11522n0(int i, C1983g.b bVar) {
        this.f8842j.m11632h(i, bVar);
    }

    /* JADX INFO: renamed from: o0 */
    public void m11523o0() {
        try {
            close();
            C1983g c1983g = new C1983g(new c());
            this.f8842j = c1983g;
            c1983g.m11631g(m11519k0(this.f8841i));
            this.f8844l = null;
            this.f8849q = false;
            this.f8846n = null;
        } catch (IOException e2) {
            this.f8834b.mo11553g(new RtspMediaSource.RtspPlaybackException(e2));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m11524p0(long j) {
        if (this.f8847o == 2 && !this.f8850r) {
            this.f8840h.m11545f(this.f8841i, (String) p11.m167011e(this.f8844l));
        }
        this.f8851s = j;
    }

    /* JADX INFO: renamed from: r0 */
    public void m11525r0(List<C1982f.d> list) {
        this.f8838f.addAll(list);
        m11517i0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m11526s0() {
        this.f8847o = 1;
    }

    /* JADX INFO: renamed from: t0 */
    public void m11527t0() throws IOException {
        try {
            this.f8842j.m11631g(m11519k0(this.f8841i));
            this.f8840h.m11544e(this.f8841i, this.f8844l);
        } catch (IOException e2) {
            vck0.m197878n(this.f8842j);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m11528u0(long j) {
        this.f8840h.m11546g(this.f8841i, j, (String) p11.m167011e(this.f8844l));
    }
}
