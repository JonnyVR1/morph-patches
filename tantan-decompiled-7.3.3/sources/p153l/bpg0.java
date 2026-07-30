package p153l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public class bpg0 extends t4f {

    /* JADX INFO: renamed from: a */
    public final ArrayList f77779a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f77780b;

    /* JADX INFO: renamed from: b */
    public final void m105841b(String str) {
        this.f77780b = str;
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bpg0) obj).m105841b(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m105842c(bpg0 bpg0Var) {
        if (bpg0Var == null || this.f77779a.contains(bpg0Var)) {
            return;
        }
        this.f77779a.add(bpg0Var);
        bpg0Var.m105841b(this.f77780b);
    }

    @Override // p153l.t4f
    public void callEnd(ry3 ry3Var) {
        super.callEnd(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).callEnd(ry3Var);
        }
    }

    @Override // p153l.t4f
    public void callFailed(ry3 ry3Var, IOException iOException) {
        super.callFailed(ry3Var, iOException);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).callFailed(ry3Var, iOException);
        }
    }

    @Override // p153l.t4f
    public void callStart(ry3 ry3Var) {
        super.callStart(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).callStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public void connectEnd(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // p153l.t4f
    public void connectStart(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(ry3Var, inetSocketAddress, proxy);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).connectStart(ry3Var, inetSocketAddress, proxy);
        }
    }

    @Override // p153l.t4f
    public void dnsEnd(ry3 ry3Var, String str, List list) {
        super.dnsEnd(ry3Var, str, list);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).dnsEnd(ry3Var, str, list);
        }
    }

    @Override // p153l.t4f
    public void dnsStart(ry3 ry3Var, String str) {
        super.dnsStart(ry3Var, str);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).dnsStart(ry3Var, str);
        }
    }

    @Override // p153l.t4f
    public void requestBodyEnd(ry3 ry3Var, long j) {
        super.requestBodyEnd(ry3Var, j);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).requestBodyEnd(ry3Var, j);
        }
    }

    @Override // p153l.t4f
    public void requestBodyStart(ry3 ry3Var) {
        super.requestBodyStart(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).requestBodyStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public void requestHeadersEnd(ry3 ry3Var, x1d0 x1d0Var) {
        super.requestHeadersEnd(ry3Var, x1d0Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).requestHeadersEnd(ry3Var, x1d0Var);
        }
    }

    @Override // p153l.t4f
    public void requestHeadersStart(ry3 ry3Var) {
        super.requestHeadersStart(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).requestHeadersStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public void responseBodyEnd(ry3 ry3Var, long j) {
        super.responseBodyEnd(ry3Var, j);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).responseBodyEnd(ry3Var, j);
        }
    }

    @Override // p153l.t4f
    public void responseBodyStart(ry3 ry3Var) {
        super.responseBodyStart(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).responseBodyStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        super.responseHeadersEnd(ry3Var, i5d0Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).responseHeadersEnd(ry3Var, i5d0Var);
        }
    }

    @Override // p153l.t4f
    public void responseHeadersStart(ry3 ry3Var) {
        super.responseHeadersStart(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).responseHeadersStart(ry3Var);
        }
    }

    @Override // p153l.t4f
    public void secureConnectEnd(ry3 ry3Var, txk txkVar) {
        super.secureConnectEnd(ry3Var, txkVar);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).secureConnectEnd(ry3Var, txkVar);
        }
    }

    @Override // p153l.t4f
    public void secureConnectStart(ry3 ry3Var) {
        super.secureConnectStart(ry3Var);
        ArrayList arrayList = this.f77779a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((t4f) obj).secureConnectStart(ry3Var);
        }
    }
}
