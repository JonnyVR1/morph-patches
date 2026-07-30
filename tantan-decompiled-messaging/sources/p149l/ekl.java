package p149l;

import android.text.TextUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes7.dex */
public class ekl extends o3f {

    /* JADX INFO: renamed from: a */
    private final zew<String, String> f91993a = new zew<>(20);

    /* JADX INFO: renamed from: b */
    private final Object f91994b = new Object();

    private boolean isSupportDns(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (sjw.f164921a == null || sjw.f164921a.getDnsInstance() == null) {
            return true;
        }
        return sjw.f164921a.getDnsInstance().useDNS(str);
    }

    private void recordFailed(sx3 sx3Var, String str, String str2) {
        String strM218422f;
        try {
            if (TextUtils.isEmpty(str)) {
                str = sx3Var.request().m185881k().m107522m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.f91994b) {
                        strM218422f = this.f91993a.m218422f(str + rjw.m179664a(new byte[]{10}) + sx3Var.hashCode());
                    }
                    str2 = strM218422f;
                }
                if (TextUtils.isEmpty(str2) || sjw.f164921a == null || sjw.f164921a.getDnsInstance() == null) {
                    return;
                }
                sjw.f164921a.getDnsInstance().requestFailedForDomain(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    private void recordSuccess(sx3 sx3Var) {
        String strM218422f;
        try {
            String strM107522m = sx3Var.request().m185881k().m107522m();
            if (isSupportDns(strM107522m)) {
                synchronized (this.f91994b) {
                    strM218422f = this.f91993a.m218422f(strM107522m + rjw.m179664a(new byte[]{10}) + sx3Var.hashCode());
                }
                if (TextUtils.isEmpty(strM218422f) || sjw.f164921a == null || sjw.f164921a.getDnsInstance() == null) {
                    return;
                }
                sjw.f164921a.getDnsInstance().requestSucceedForDomain(strM107522m, strM218422f);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        recordFailed(sx3Var);
    }

    @Override // p149l.o3f
    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        recordFailed(sx3Var, sx3Var.request().m185881k().m107522m(), inetSocketAddress.getAddress().getHostAddress());
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
        if (!isSupportDns(str) || list == null || list.isEmpty()) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.f91994b) {
            this.f91993a.m218421e(str + rjw.m179664a(new byte[]{10}) + sx3Var.hashCode(), hostAddress);
        }
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        int iM118609q = exc0Var.m118609q();
        if (iM118609q != 404 && iM118609q >= 400 && iM118609q <= 599) {
            recordFailed(sx3Var);
        } else {
            if (iM118609q < 200 || iM118609q > 299) {
                return;
            }
            recordSuccess(sx3Var);
        }
    }

    private void recordFailed(sx3 sx3Var) {
        recordFailed(sx3Var, null, null);
    }
}
