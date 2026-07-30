package p153l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t4f {
    public static final t4f NONE = new C20234a();

    /* JADX INFO: renamed from: l.t4f$a */
    public static class C20234a extends t4f {
    }

    /* JADX INFO: renamed from: l.t4f$b */
    public interface InterfaceC20235b {
        t4f create(ry3 ry3Var);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ t4f m189260a(t4f t4fVar, ry3 ry3Var) {
        return t4fVar;
    }

    public static InterfaceC20235b factory(final t4f t4fVar) {
        return new InterfaceC20235b() { // from class: l.s4f
            @Override // p153l.t4f.InterfaceC20235b
            public final t4f create(ry3 ry3Var) {
                return t4f.m189260a(this.f166230a, ry3Var);
            }
        };
    }

    public void callEnd(ry3 ry3Var) {
    }

    public void callStart(ry3 ry3Var) {
    }

    public void requestBodyStart(ry3 ry3Var) {
    }

    public void requestHeadersStart(ry3 ry3Var) {
    }

    public void responseBodyStart(ry3 ry3Var) {
    }

    public void responseHeadersStart(ry3 ry3Var) {
    }

    public void secureConnectStart(ry3 ry3Var) {
    }

    public void callFailed(ry3 ry3Var, IOException iOException) {
    }

    public void connectionAcquired(ry3 ry3Var, bx5 bx5Var) {
    }

    public void connectionReleased(ry3 ry3Var, bx5 bx5Var) {
    }

    public void dnsStart(ry3 ry3Var, String str) {
    }

    public void requestBodyEnd(ry3 ry3Var, long j) {
    }

    public void requestFailed(ry3 ry3Var, IOException iOException) {
    }

    public void requestHeadersEnd(ry3 ry3Var, x1d0 x1d0Var) {
    }

    public void responseBodyEnd(ry3 ry3Var, long j) {
    }

    public void responseFailed(ry3 ry3Var, IOException iOException) {
    }

    public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
    }

    public void secureConnectEnd(ry3 ry3Var, txk txkVar) {
    }

    public void connectStart(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void dnsEnd(ry3 ry3Var, String str, List<InetAddress> list) {
    }

    public void connectEnd(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
    }
}
