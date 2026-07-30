package p003l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import l.dvk;
import l.exc0;
import l.o3f;
import l.stc0;
import l.sx3;
import okhttp3.Protocol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tgg0 extends o3f {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7462a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f7463b;

    /* JADX INFO: renamed from: b */
    public final void m7741b(String str) {
        this.f7463b = str;
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tgg0) obj).m7741b(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7742c(tgg0 tgg0Var) {
        if (tgg0Var == null || this.f7462a.contains(tgg0Var)) {
            return;
        }
        this.f7462a.add(tgg0Var);
        tgg0Var.m7741b(this.f7463b);
    }

    public void callEnd(sx3 sx3Var) {
        super.callEnd(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).callEnd(sx3Var);
        }
    }

    public void callFailed(sx3 sx3Var, IOException iOException) {
        super.callFailed(sx3Var, iOException);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).callFailed(sx3Var, iOException);
        }
    }

    public void callStart(sx3 sx3Var) {
        super.callStart(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).callStart(sx3Var);
        }
    }

    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        }
    }

    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(sx3Var, inetSocketAddress, proxy);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).connectStart(sx3Var, inetSocketAddress, proxy);
        }
    }

    public void dnsEnd(sx3 sx3Var, String str, List list) {
        super.dnsEnd(sx3Var, str, list);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).dnsEnd(sx3Var, str, list);
        }
    }

    public void dnsStart(sx3 sx3Var, String str) {
        super.dnsStart(sx3Var, str);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).dnsStart(sx3Var, str);
        }
    }

    public void requestBodyEnd(sx3 sx3Var, long j) {
        super.requestBodyEnd(sx3Var, j);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestBodyEnd(sx3Var, j);
        }
    }

    public void requestBodyStart(sx3 sx3Var) {
        super.requestBodyStart(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestBodyStart(sx3Var);
        }
    }

    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        super.requestHeadersEnd(sx3Var, stc0Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestHeadersEnd(sx3Var, stc0Var);
        }
    }

    public void requestHeadersStart(sx3 sx3Var) {
        super.requestHeadersStart(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).requestHeadersStart(sx3Var);
        }
    }

    public void responseBodyEnd(sx3 sx3Var, long j) {
        super.responseBodyEnd(sx3Var, j);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseBodyEnd(sx3Var, j);
        }
    }

    public void responseBodyStart(sx3 sx3Var) {
        super.responseBodyStart(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseBodyStart(sx3Var);
        }
    }

    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        super.responseHeadersEnd(sx3Var, exc0Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseHeadersEnd(sx3Var, exc0Var);
        }
    }

    public void responseHeadersStart(sx3 sx3Var) {
        super.responseHeadersStart(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).responseHeadersStart(sx3Var);
        }
    }

    public void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        super.secureConnectEnd(sx3Var, dvkVar);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).secureConnectEnd(sx3Var, dvkVar);
        }
    }

    public void secureConnectStart(sx3 sx3Var) {
        super.secureConnectStart(sx3Var);
        ArrayList arrayList = this.f7462a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o3f) obj).secureConnectStart(sx3Var);
        }
    }
}
