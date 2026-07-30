package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Locale;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class okg0 extends o3f {

    /* JADX INFO: renamed from: a */
    public final ugg0 f144425a = new ugg0();

    /* JADX INFO: renamed from: b */
    public long f144426b;

    /* JADX INFO: renamed from: c */
    public final tog0 f144427c;

    /* JADX INFO: renamed from: d */
    public long f144428d;

    /* JADX INFO: renamed from: e */
    public long f144429e;

    /* JADX INFO: renamed from: f */
    public long f144430f;

    /* JADX INFO: renamed from: g */
    public long f144431g;

    /* JADX INFO: renamed from: h */
    public long f144432h;

    /* JADX INFO: renamed from: i */
    public final o3f f144433i;

    public okg0(tog0 tog0Var, o3f o3fVar) {
        this.f144427c = tog0Var == null ? new tog0() : tog0Var;
        this.f144433i = o3fVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m164860b(String str) {
        long jNanoTime = (System.nanoTime() - this.f144426b) / 1000000;
        ugg0 ugg0Var = this.f144425a;
        Locale.getDefault();
        ugg0Var.m193562a("[" + jNanoTime + " ms] " + str);
    }

    @Override // p149l.o3f
    public final void callEnd(sx3 sx3Var) {
        super.callEnd(sx3Var);
        m164860b("callEnd");
        tog0 tog0Var = this.f144427c;
        System.nanoTime();
        tog0Var.getClass();
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.callEnd(sx3Var);
        }
    }

    @Override // p149l.o3f
    public final void callFailed(sx3 sx3Var, IOException iOException) {
        super.callFailed(sx3Var, iOException);
        m164860b("callFailed: " + iOException);
        tog0 tog0Var = this.f144427c;
        System.nanoTime();
        tog0Var.getClass();
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.callFailed(sx3Var, iOException);
        }
    }

    @Override // p149l.o3f
    public final void callStart(sx3 sx3Var) {
        super.callStart(sx3Var);
        this.f144426b = System.nanoTime();
        m164860b("callStart: ${call.request()}");
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.callStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public final void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        m164860b("connectEnd: " + protocol);
        this.f144427c.f171367b = (System.nanoTime() - this.f144429e) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // p149l.o3f
    public final void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
        m164860b("connectFailed: " + protocol + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + iOException);
        this.f144427c.f171367b = (System.nanoTime() - this.f144429e) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // p149l.o3f
    public final void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(sx3Var, inetSocketAddress, proxy);
        m164860b("connectStart: " + inetSocketAddress + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + proxy);
        this.f144429e = System.nanoTime();
        this.f144427c.f171372g = false;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.connectStart(sx3Var, inetSocketAddress, proxy);
        }
    }

    @Override // p149l.o3f
    public final void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
        super.connectionAcquired(sx3Var, wv5Var);
        m164860b("connectionAcquired: " + wv5Var);
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.connectionAcquired(sx3Var, wv5Var);
        }
    }

    @Override // p149l.o3f
    public final void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
        super.connectionReleased(sx3Var, wv5Var);
        m164860b("connectionReleased");
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.connectionReleased(sx3Var, wv5Var);
        }
    }

    @Override // p149l.o3f
    public final void dnsEnd(sx3 sx3Var, String str, List list) {
        super.dnsEnd(sx3Var, str, list);
        m164860b("dnsEnd: " + list);
        this.f144427c.f171366a = (System.nanoTime() - this.f144428d) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.dnsEnd(sx3Var, str, list);
        }
    }

    @Override // p149l.o3f
    public final void dnsStart(sx3 sx3Var, String str) {
        super.dnsStart(sx3Var, str);
        m164860b("dnsStart: $domainName" + str);
        this.f144428d = System.nanoTime();
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.dnsStart(sx3Var, str);
        }
    }

    @Override // p149l.o3f
    public final void requestBodyEnd(sx3 sx3Var, long j) {
        super.requestBodyEnd(sx3Var, j);
        m164860b("requestBodyEnd: byteCount=" + j);
        this.f144427c.f171369d = (System.nanoTime() - this.f144431g) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.requestBodyEnd(sx3Var, j);
        }
    }

    @Override // p149l.o3f
    public final void requestBodyStart(sx3 sx3Var) {
        super.requestBodyStart(sx3Var);
        m164860b("requestBodyStart");
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.requestBodyStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public final void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        super.requestHeadersEnd(sx3Var, stc0Var);
        m164860b("requestHeadersEnd");
        this.f144427c.f171369d = (System.nanoTime() - this.f144431g) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.requestHeadersEnd(sx3Var, stc0Var);
        }
    }

    @Override // p149l.o3f
    public final void requestHeadersStart(sx3 sx3Var) {
        super.requestHeadersStart(sx3Var);
        m164860b("requestHeadersStart");
        this.f144431g = System.nanoTime();
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.requestHeadersStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public final void responseBodyEnd(sx3 sx3Var, long j) {
        super.responseBodyEnd(sx3Var, j);
        m164860b("responseBodyEnd: byteCount=" + j);
        tog0 tog0Var = this.f144427c;
        long jNanoTime = System.nanoTime();
        long j2 = this.f144432h;
        tog0Var.f171370e = (jNanoTime - j2) / 1000000;
        tog0 tog0Var2 = this.f144427c;
        tog0Var2.f171371f = (j2 - (this.f144431g + tog0Var2.f171369d)) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.responseBodyEnd(sx3Var, j);
        }
    }

    @Override // p149l.o3f
    public final void responseBodyStart(sx3 sx3Var) {
        super.responseBodyStart(sx3Var);
        m164860b("responseBodyStart");
        if (this.f144432h == 0) {
            this.f144432h = System.nanoTime();
        }
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.responseBodyStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public final void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        super.responseHeadersEnd(sx3Var, exc0Var);
        m164860b("responseHeadersEnd: $response");
        this.f144427c.f171370e = (System.nanoTime() - this.f144432h) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.responseHeadersEnd(sx3Var, exc0Var);
        }
    }

    @Override // p149l.o3f
    public final void responseHeadersStart(sx3 sx3Var) {
        super.responseHeadersStart(sx3Var);
        m164860b("responseHeadersStart");
        this.f144432h = System.nanoTime();
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.responseHeadersStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public final void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        super.secureConnectEnd(sx3Var, dvkVar);
        m164860b("secureConnectEnd: " + dvkVar);
        this.f144427c.f171368c = (System.nanoTime() - this.f144430f) / 1000000;
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.secureConnectEnd(sx3Var, dvkVar);
        }
    }

    @Override // p149l.o3f
    public final void secureConnectStart(sx3 sx3Var) {
        super.secureConnectStart(sx3Var);
        m164860b("secureConnectStart");
        this.f144430f = System.nanoTime();
        o3f o3fVar = this.f144433i;
        if (o3fVar != null) {
            o3fVar.secureConnectStart(sx3Var);
        }
    }
}
