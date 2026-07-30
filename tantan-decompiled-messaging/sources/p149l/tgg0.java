package p149l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
public class tgg0 extends o3f {

    /* JADX INFO: renamed from: a */
    public final ArrayList f170095a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f170096b;

    /* JADX INFO: renamed from: b */
    public final void m188812b(String str) {
        this.f170096b = str;
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tgg0) obj).m188812b(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m188813c(tgg0 tgg0Var) {
        if (tgg0Var == null || this.f170095a.contains(tgg0Var)) {
            return;
        }
        this.f170095a.add(tgg0Var);
        tgg0Var.m188812b(this.f170096b);
    }

    @Override // p149l.o3f
    public void callEnd(sx3 sx3Var) {
        super.callEnd(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).callEnd(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        super.callFailed(sx3Var, iOException);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).callFailed(sx3Var, iOException);
        }
    }

    @Override // p149l.o3f
    public void callStart(sx3 sx3Var) {
        super.callStart(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).callStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // p149l.o3f
    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(sx3Var, inetSocketAddress, proxy);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).connectStart(sx3Var, inetSocketAddress, proxy);
        }
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, List list) {
        super.dnsEnd(sx3Var, str, list);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).dnsEnd(sx3Var, str, list);
        }
    }

    @Override // p149l.o3f
    public void dnsStart(sx3 sx3Var, String str) {
        super.dnsStart(sx3Var, str);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).dnsStart(sx3Var, str);
        }
    }

    @Override // p149l.o3f
    public void requestBodyEnd(sx3 sx3Var, long j) {
        super.requestBodyEnd(sx3Var, j);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestBodyEnd(sx3Var, j);
        }
    }

    @Override // p149l.o3f
    public void requestBodyStart(sx3 sx3Var) {
        super.requestBodyStart(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestBodyStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        super.requestHeadersEnd(sx3Var, stc0Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestHeadersEnd(sx3Var, stc0Var);
        }
    }

    @Override // p149l.o3f
    public void requestHeadersStart(sx3 sx3Var) {
        super.requestHeadersStart(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestHeadersStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void responseBodyEnd(sx3 sx3Var, long j) {
        super.responseBodyEnd(sx3Var, j);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseBodyEnd(sx3Var, j);
        }
    }

    @Override // p149l.o3f
    public void responseBodyStart(sx3 sx3Var) {
        super.responseBodyStart(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseBodyStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        super.responseHeadersEnd(sx3Var, exc0Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseHeadersEnd(sx3Var, exc0Var);
        }
    }

    @Override // p149l.o3f
    public void responseHeadersStart(sx3 sx3Var) {
        super.responseHeadersStart(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseHeadersStart(sx3Var);
        }
    }

    @Override // p149l.o3f
    public void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        super.secureConnectEnd(sx3Var, dvkVar);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).secureConnectEnd(sx3Var, dvkVar);
        }
    }

    @Override // p149l.o3f
    public void secureConnectStart(sx3 sx3Var) {
        super.secureConnectStart(sx3Var);
        ArrayList arrayList = this.f170095a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).secureConnectStart(sx3Var);
        }
    }
}
