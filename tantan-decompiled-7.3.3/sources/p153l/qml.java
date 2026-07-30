package p153l;

import android.text.TextUtils;
import com.immomo.hdata.android.MDevice;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes7.dex */
public class qml extends t4f {

    /* JADX INFO: renamed from: a */
    private final xgw<String, String> f158380a = new xgw<>(20);

    /* JADX INFO: renamed from: b */
    private final Object f158381b = new Object();

    private boolean isSupportDns(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (MDevice.config == null || MDevice.config.getDnsInstance() == null) {
            return true;
        }
        return MDevice.config.getDnsInstance().useDNS(str);
    }

    private void recordFailed(ry3 ry3Var, String str, String str2) {
        String strM210956f;
        try {
            if (TextUtils.isEmpty(str)) {
                str = ry3Var.request().m209026k().m182286m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.f158381b) {
                        strM210956f = this.f158380a.m210956f(str + riw.m181611a(new byte[]{10}) + ry3Var.hashCode());
                    }
                    str2 = strM210956f;
                }
                if (TextUtils.isEmpty(str2) || MDevice.config == null || MDevice.config.getDnsInstance() == null) {
                    return;
                }
                MDevice.config.getDnsInstance().requestFailedForDomain(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    private void recordSuccess(ry3 ry3Var) {
        String strM210956f;
        try {
            String strM182286m = ry3Var.request().m209026k().m182286m();
            if (isSupportDns(strM182286m)) {
                synchronized (this.f158381b) {
                    strM210956f = this.f158380a.m210956f(strM182286m + riw.m181611a(new byte[]{10}) + ry3Var.hashCode());
                }
                if (TextUtils.isEmpty(strM210956f) || MDevice.config == null || MDevice.config.getDnsInstance() == null) {
                    return;
                }
                MDevice.config.getDnsInstance().requestSucceedForDomain(strM182286m, strM210956f);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.t4f
    public void callFailed(ry3 ry3Var, IOException iOException) {
        recordFailed(ry3Var);
    }

    @Override // p153l.t4f
    public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        recordFailed(ry3Var, ry3Var.request().m209026k().m182286m(), inetSocketAddress.getAddress().getHostAddress());
    }

    @Override // p153l.t4f
    public void dnsEnd(ry3 ry3Var, String str, List<InetAddress> list) {
        if (!isSupportDns(str) || list == null || list.isEmpty()) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.f158381b) {
            this.f158380a.m210955e(str + riw.m181611a(new byte[]{10}) + ry3Var.hashCode(), hostAddress);
        }
    }

    @Override // p153l.t4f
    public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        int iM138673q = i5d0Var.m138673q();
        if (iM138673q != 404 && iM138673q >= 400 && iM138673q <= 599) {
            recordFailed(ry3Var);
        } else {
            if (iM138673q < 200 || iM138673q > 299) {
                return;
            }
            recordSuccess(ry3Var);
        }
    }

    private void recordFailed(ry3 ry3Var) {
        recordFailed(ry3Var, null, null);
    }
}
