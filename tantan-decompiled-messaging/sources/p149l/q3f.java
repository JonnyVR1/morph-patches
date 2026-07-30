package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes7.dex */
public class q3f extends o3f {

    /* JADX INFO: renamed from: a */
    @NonNull
    private List<o3f> f152428a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private o3f.InterfaceC18833b f152429b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private o3f f152430c;

    /* JADX INFO: renamed from: l.q3f$b */
    public static class C19421b implements o3f.InterfaceC18833b {

        /* JADX INFO: renamed from: a */
        private List<o3f> f152431a;

        /* JADX INFO: renamed from: b */
        o3f.InterfaceC18833b f152432b;

        public C19421b(List<o3f> list, o3f.InterfaceC18833b interfaceC18833b) {
            this.f152431a = list;
            this.f152432b = interfaceC18833b;
        }

        @Override // p149l.o3f.InterfaceC18833b
        @NonNull
        public o3f create(@NonNull sx3 sx3Var) {
            return new q3f(this.f152431a, this.f152432b);
        }
    }

    private q3f(@NonNull List<o3f> list, @Nullable o3f.InterfaceC18833b interfaceC18833b) {
        this.f152428a = list;
        this.f152429b = interfaceC18833b;
    }

    @Override // p149l.o3f
    public void callEnd(sx3 sx3Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().callEnd(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.callEnd(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().callFailed(sx3Var, iOException);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.callFailed(sx3Var, iOException);
        }
    }

    @Override // p149l.o3f
    public void callStart(sx3 sx3Var) {
        o3f.InterfaceC18833b interfaceC18833b = this.f152429b;
        if (interfaceC18833b != null) {
            this.f152430c = interfaceC18833b.create(sx3Var);
        }
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().callStart(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.callStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // p149l.o3f
    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // p149l.o3f
    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().connectStart(sx3Var, inetSocketAddress, proxy);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.connectStart(sx3Var, inetSocketAddress, proxy);
        }
    }

    @Override // p149l.o3f
    public void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().connectionAcquired(sx3Var, wv5Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.connectionAcquired(sx3Var, wv5Var);
        }
    }

    @Override // p149l.o3f
    public void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().connectionReleased(sx3Var, wv5Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.connectionReleased(sx3Var, wv5Var);
        }
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().dnsEnd(sx3Var, str, list);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.dnsEnd(sx3Var, str, list);
        }
    }

    @Override // p149l.o3f
    public void dnsStart(sx3 sx3Var, String str) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().dnsStart(sx3Var, str);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.dnsStart(sx3Var, str);
        }
    }

    @Override // p149l.o3f
    public void requestBodyEnd(sx3 sx3Var, long j) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().requestBodyEnd(sx3Var, j);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.requestBodyEnd(sx3Var, j);
        }
    }

    @Override // p149l.o3f
    public void requestBodyStart(sx3 sx3Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().requestBodyStart(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.requestBodyStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().requestHeadersEnd(sx3Var, stc0Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.requestHeadersEnd(sx3Var, stc0Var);
        }
    }

    @Override // p149l.o3f
    public void requestHeadersStart(sx3 sx3Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().requestHeadersStart(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.requestHeadersStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void responseBodyEnd(sx3 sx3Var, long j) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().responseBodyEnd(sx3Var, j);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.responseBodyEnd(sx3Var, j);
        }
    }

    @Override // p149l.o3f
    public void responseBodyStart(sx3 sx3Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().responseBodyStart(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.responseBodyStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().responseHeadersEnd(sx3Var, exc0Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.responseHeadersEnd(sx3Var, exc0Var);
        }
    }

    @Override // p149l.o3f
    public void responseHeadersStart(sx3 sx3Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().responseHeadersStart(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.responseHeadersStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().secureConnectEnd(sx3Var, dvkVar);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.secureConnectEnd(sx3Var, dvkVar);
        }
    }

    @Override // p149l.o3f
    public void secureConnectStart(sx3 sx3Var) {
        Iterator<o3f> it = this.f152428a.iterator();
        while (it.hasNext()) {
            it.next().secureConnectStart(sx3Var);
        }
        o3f o3fVar = this.f152430c;
        if (o3fVar != null) {
            o3fVar.secureConnectStart(sx3Var);
        }
    }
}
