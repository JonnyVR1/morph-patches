package p149l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o3f {
    public static final o3f NONE = new C18832a();

    /* JADX INFO: renamed from: l.o3f$a */
    public static class C18832a extends o3f {
    }

    /* JADX INFO: renamed from: l.o3f$b */
    public interface InterfaceC18833b {
        o3f create(sx3 sx3Var);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ o3f m162418a(o3f o3fVar, sx3 sx3Var) {
        return o3fVar;
    }

    public static InterfaceC18833b factory(final o3f o3fVar) {
        return new InterfaceC18833b() { // from class: l.n3f
            @Override // p149l.o3f.InterfaceC18833b
            public final o3f create(sx3 sx3Var) {
                return o3f.m162418a(this.f136990a, sx3Var);
            }
        };
    }

    public void callEnd(sx3 sx3Var) {
    }

    public void callStart(sx3 sx3Var) {
    }

    public void requestBodyStart(sx3 sx3Var) {
    }

    public void requestHeadersStart(sx3 sx3Var) {
    }

    public void responseBodyStart(sx3 sx3Var) {
    }

    public void responseHeadersStart(sx3 sx3Var) {
    }

    public void secureConnectStart(sx3 sx3Var) {
    }

    public void callFailed(sx3 sx3Var, IOException iOException) {
    }

    public void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
    }

    public void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
    }

    public void dnsStart(sx3 sx3Var, String str) {
    }

    public void requestBodyEnd(sx3 sx3Var, long j) {
    }

    public void requestFailed(sx3 sx3Var, IOException iOException) {
    }

    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
    }

    public void responseBodyEnd(sx3 sx3Var, long j) {
    }

    public void responseFailed(sx3 sx3Var, IOException iOException) {
    }

    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
    }

    public void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
    }

    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
    }

    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
    }
}
