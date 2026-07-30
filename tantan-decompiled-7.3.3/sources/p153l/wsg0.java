package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Locale;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public final class wsg0 extends t4f {

    /* JADX INFO: renamed from: a */
    public final cpg0 f190641a = new cpg0();

    /* JADX INFO: renamed from: b */
    public long f190642b;

    /* JADX INFO: renamed from: c */
    public final bxg0 f190643c;

    /* JADX INFO: renamed from: d */
    public long f190644d;

    /* JADX INFO: renamed from: e */
    public long f190645e;

    /* JADX INFO: renamed from: f */
    public long f190646f;

    /* JADX INFO: renamed from: g */
    public long f190647g;

    /* JADX INFO: renamed from: h */
    public long f190648h;

    /* JADX INFO: renamed from: i */
    public final t4f f190649i;

    public wsg0(bxg0 bxg0Var, t4f t4fVar) {
        this.f190643c = bxg0Var == null ? new bxg0() : bxg0Var;
        this.f190649i = t4fVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m207784b(String str) {
        long jNanoTime = (System.nanoTime() - this.f190642b) / 1000000;
        cpg0 cpg0Var = this.f190641a;
        Locale.getDefault();
        cpg0Var.m111758a("[" + jNanoTime + " ms] " + str);
    }

    @Override // p153l.t4f
    public final void callEnd(ry3 ry3Var) {
        super.callEnd(ry3Var);
        m207784b("callEnd");
        bxg0 bxg0Var = this.f190643c;
        System.nanoTime();
        bxg0Var.getClass();
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.callEnd(ry3Var);
        }
    }

    @Override // p153l.t4f
    public final void callFailed(ry3 ry3Var, IOException iOException) {
        super.callFailed(ry3Var, iOException);
        m207784b("callFailed: " + iOException);
        bxg0 bxg0Var = this.f190643c;
        System.nanoTime();
        bxg0Var.getClass();
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.callFailed(ry3Var, iOException);
        }
    }

    @Override // p153l.t4f
    public final void callStart(ry3 ry3Var) {
        super.callStart(ry3Var);
        this.f190642b = System.nanoTime();
        m207784b("callStart: ${call.request()}");
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.callStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public final void connectEnd(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
        m207784b("connectEnd: " + protocol);
        this.f190643c.f78869b = (System.nanoTime() - this.f190645e) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // p153l.t4f
    public final void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(ry3Var, inetSocketAddress, proxy, protocol, iOException);
        m207784b("connectFailed: " + protocol + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + iOException);
        this.f190643c.f78869b = (System.nanoTime() - this.f190645e) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.connectFailed(ry3Var, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // p153l.t4f
    public final void connectStart(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(ry3Var, inetSocketAddress, proxy);
        m207784b("connectStart: " + inetSocketAddress + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + proxy);
        this.f190645e = System.nanoTime();
        this.f190643c.f78874g = false;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.connectStart(ry3Var, inetSocketAddress, proxy);
        }
    }

    @Override // p153l.t4f
    public final void connectionAcquired(ry3 ry3Var, bx5 bx5Var) {
        super.connectionAcquired(ry3Var, bx5Var);
        m207784b("connectionAcquired: " + bx5Var);
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.connectionAcquired(ry3Var, bx5Var);
        }
    }

    @Override // p153l.t4f
    public final void connectionReleased(ry3 ry3Var, bx5 bx5Var) {
        super.connectionReleased(ry3Var, bx5Var);
        m207784b("connectionReleased");
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.connectionReleased(ry3Var, bx5Var);
        }
    }

    @Override // p153l.t4f
    public final void dnsEnd(ry3 ry3Var, String str, List list) {
        super.dnsEnd(ry3Var, str, list);
        m207784b("dnsEnd: " + list);
        this.f190643c.f78868a = (System.nanoTime() - this.f190644d) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.dnsEnd(ry3Var, str, list);
        }
    }

    @Override // p153l.t4f
    public final void dnsStart(ry3 ry3Var, String str) {
        super.dnsStart(ry3Var, str);
        m207784b("dnsStart: $domainName" + str);
        this.f190644d = System.nanoTime();
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.dnsStart(ry3Var, str);
        }
    }

    @Override // p153l.t4f
    public final void requestBodyEnd(ry3 ry3Var, long j) {
        super.requestBodyEnd(ry3Var, j);
        m207784b("requestBodyEnd: byteCount=" + j);
        this.f190643c.f78871d = (System.nanoTime() - this.f190647g) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.requestBodyEnd(ry3Var, j);
        }
    }

    @Override // p153l.t4f
    public final void requestBodyStart(ry3 ry3Var) {
        super.requestBodyStart(ry3Var);
        m207784b("requestBodyStart");
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.requestBodyStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public final void requestHeadersEnd(ry3 ry3Var, x1d0 x1d0Var) {
        super.requestHeadersEnd(ry3Var, x1d0Var);
        m207784b("requestHeadersEnd");
        this.f190643c.f78871d = (System.nanoTime() - this.f190647g) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.requestHeadersEnd(ry3Var, x1d0Var);
        }
    }

    @Override // p153l.t4f
    public final void requestHeadersStart(ry3 ry3Var) {
        super.requestHeadersStart(ry3Var);
        m207784b("requestHeadersStart");
        this.f190647g = System.nanoTime();
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.requestHeadersStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public final void responseBodyEnd(ry3 ry3Var, long j) {
        super.responseBodyEnd(ry3Var, j);
        m207784b("responseBodyEnd: byteCount=" + j);
        bxg0 bxg0Var = this.f190643c;
        long jNanoTime = System.nanoTime();
        long j2 = this.f190648h;
        bxg0Var.f78872e = (jNanoTime - j2) / 1000000;
        bxg0 bxg0Var2 = this.f190643c;
        bxg0Var2.f78873f = (j2 - (this.f190647g + bxg0Var2.f78871d)) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.responseBodyEnd(ry3Var, j);
        }
    }

    @Override // p153l.t4f
    public final void responseBodyStart(ry3 ry3Var) {
        super.responseBodyStart(ry3Var);
        m207784b("responseBodyStart");
        if (this.f190648h == 0) {
            this.f190648h = System.nanoTime();
        }
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.responseBodyStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public final void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        super.responseHeadersEnd(ry3Var, i5d0Var);
        m207784b("responseHeadersEnd: $response");
        this.f190643c.f78872e = (System.nanoTime() - this.f190648h) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.responseHeadersEnd(ry3Var, i5d0Var);
        }
    }

    @Override // p153l.t4f
    public final void responseHeadersStart(ry3 ry3Var) {
        super.responseHeadersStart(ry3Var);
        m207784b("responseHeadersStart");
        this.f190648h = System.nanoTime();
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.responseHeadersStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public final void secureConnectEnd(ry3 ry3Var, txk txkVar) {
        super.secureConnectEnd(ry3Var, txkVar);
        m207784b("secureConnectEnd: " + txkVar);
        this.f190643c.f78870c = (System.nanoTime() - this.f190646f) / 1000000;
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.secureConnectEnd(ry3Var, txkVar);
        }
    }

    @Override // p153l.t4f
    public final void secureConnectStart(ry3 ry3Var) {
        super.secureConnectStart(ry3Var);
        m207784b("secureConnectStart");
        this.f190646f = System.nanoTime();
        t4f t4fVar = this.f190649i;
        if (t4fVar != null) {
            t4fVar.secureConnectStart(ry3Var);
        }
    }
}
