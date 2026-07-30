package p003l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Locale;
import l.dvk;
import l.exc0;
import l.o3f;
import l.stc0;
import l.sx3;
import l.wv5;
import okhttp3.Protocol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class okg0 extends o3f {

    /* JADX INFO: renamed from: a */
    public final ugg0 f6169a = new ugg0();

    /* JADX INFO: renamed from: b */
    public long f6170b;

    /* JADX INFO: renamed from: c */
    public final tog0 f6171c;

    /* JADX INFO: renamed from: d */
    public long f6172d;

    /* JADX INFO: renamed from: e */
    public long f6173e;

    /* JADX INFO: renamed from: f */
    public long f6174f;

    /* JADX INFO: renamed from: g */
    public long f6175g;

    /* JADX INFO: renamed from: h */
    public long f6176h;

    /* JADX INFO: renamed from: i */
    public final o3f f6177i;

    public okg0(tog0 tog0Var, o3f o3fVar) {
        this.f6171c = tog0Var == null ? new tog0() : tog0Var;
        this.f6177i = o3fVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m6721b(String str) {
        long jNanoTime = (System.nanoTime() - this.f6170b) / 1000000;
        ugg0 ugg0Var = this.f6169a;
        Locale.getDefault();
        ugg0Var.m8143a("[" + jNanoTime + " ms] " + str);
    }

    public final void callEnd(sx3 sx3Var) {
        super.callEnd(sx3Var);
        m6721b("callEnd");
        tog0 tog0Var = this.f6171c;
        System.nanoTime();
        tog0Var.getClass();
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.callEnd(sx3Var);
        }
    }

    public final void callFailed(sx3 sx3Var, IOException iOException) {
        super.callFailed(sx3Var, iOException);
        m6721b("callFailed: " + iOException);
        tog0 tog0Var = this.f6171c;
        System.nanoTime();
        tog0Var.getClass();
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.callFailed(sx3Var, iOException);
        }
    }

    public final void callStart(sx3 sx3Var) {
        super.callStart(sx3Var);
        this.f6170b = System.nanoTime();
        m6721b("callStart: ${call.request()}");
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.callStart(sx3Var);
        }
    }

    public final void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        m6721b("connectEnd: " + protocol);
        this.f6171c.f7568b = (System.nanoTime() - this.f6173e) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        }
    }

    public final void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
        m6721b("connectFailed: " + protocol + " " + iOException);
        this.f6171c.f7568b = (System.nanoTime() - this.f6173e) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    public final void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(sx3Var, inetSocketAddress, proxy);
        m6721b("connectStart: " + inetSocketAddress + " " + proxy);
        this.f6173e = System.nanoTime();
        this.f6171c.f7573g = false;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.connectStart(sx3Var, inetSocketAddress, proxy);
        }
    }

    public final void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
        super.connectionAcquired(sx3Var, wv5Var);
        m6721b("connectionAcquired: " + wv5Var);
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.connectionAcquired(sx3Var, wv5Var);
        }
    }

    public final void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
        super.connectionReleased(sx3Var, wv5Var);
        m6721b("connectionReleased");
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.connectionReleased(sx3Var, wv5Var);
        }
    }

    public final void dnsEnd(sx3 sx3Var, String str, List list) {
        super.dnsEnd(sx3Var, str, list);
        m6721b("dnsEnd: " + list);
        this.f6171c.f7567a = (System.nanoTime() - this.f6172d) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.dnsEnd(sx3Var, str, list);
        }
    }

    public final void dnsStart(sx3 sx3Var, String str) {
        super.dnsStart(sx3Var, str);
        m6721b("dnsStart: $domainName" + str);
        this.f6172d = System.nanoTime();
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.dnsStart(sx3Var, str);
        }
    }

    public final void requestBodyEnd(sx3 sx3Var, long j) {
        super.requestBodyEnd(sx3Var, j);
        m6721b("requestBodyEnd: byteCount=" + j);
        this.f6171c.f7570d = (System.nanoTime() - this.f6175g) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.requestBodyEnd(sx3Var, j);
        }
    }

    public final void requestBodyStart(sx3 sx3Var) {
        super.requestBodyStart(sx3Var);
        m6721b("requestBodyStart");
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.requestBodyStart(sx3Var);
        }
    }

    public final void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        super.requestHeadersEnd(sx3Var, stc0Var);
        m6721b("requestHeadersEnd");
        this.f6171c.f7570d = (System.nanoTime() - this.f6175g) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.requestHeadersEnd(sx3Var, stc0Var);
        }
    }

    public final void requestHeadersStart(sx3 sx3Var) {
        super.requestHeadersStart(sx3Var);
        m6721b("requestHeadersStart");
        this.f6175g = System.nanoTime();
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.requestHeadersStart(sx3Var);
        }
    }

    public final void responseBodyEnd(sx3 sx3Var, long j) {
        super.responseBodyEnd(sx3Var, j);
        m6721b("responseBodyEnd: byteCount=" + j);
        tog0 tog0Var = this.f6171c;
        long jNanoTime = System.nanoTime();
        long j2 = this.f6176h;
        tog0Var.f7571e = (jNanoTime - j2) / 1000000;
        tog0 tog0Var2 = this.f6171c;
        tog0Var2.f7572f = (j2 - (this.f6175g + tog0Var2.f7570d)) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.responseBodyEnd(sx3Var, j);
        }
    }

    public final void responseBodyStart(sx3 sx3Var) {
        super.responseBodyStart(sx3Var);
        m6721b("responseBodyStart");
        if (this.f6176h == 0) {
            this.f6176h = System.nanoTime();
        }
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.responseBodyStart(sx3Var);
        }
    }

    public final void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        super.responseHeadersEnd(sx3Var, exc0Var);
        m6721b("responseHeadersEnd: $response");
        this.f6171c.f7571e = (System.nanoTime() - this.f6176h) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.responseHeadersEnd(sx3Var, exc0Var);
        }
    }

    public final void responseHeadersStart(sx3 sx3Var) {
        super.responseHeadersStart(sx3Var);
        m6721b("responseHeadersStart");
        this.f6176h = System.nanoTime();
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.responseHeadersStart(sx3Var);
        }
    }

    public final void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        super.secureConnectEnd(sx3Var, dvkVar);
        m6721b("secureConnectEnd: " + dvkVar);
        this.f6171c.f7569c = (System.nanoTime() - this.f6174f) / 1000000;
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.secureConnectEnd(sx3Var, dvkVar);
        }
    }

    public final void secureConnectStart(sx3 sx3Var) {
        super.secureConnectStart(sx3Var);
        m6721b("secureConnectStart");
        this.f6174f = System.nanoTime();
        o3f o3fVar = this.f6177i;
        if (o3fVar != null) {
            o3fVar.secureConnectStart(sx3Var);
        }
    }
}
