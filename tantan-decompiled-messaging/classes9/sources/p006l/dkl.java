package p006l;

import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.Nullable;
import com.immomo.mmdns.MDDNSEntrance;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import l.exc0;
import l.o3f;
import l.sx3;
import okhttp3.Protocol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dkl extends o3f {

    /* JADX INFO: renamed from: a */
    public LruCache<String, String> f10451a = new LruCache<>(300);

    /* JADX INFO: renamed from: b */
    public final Object f10452b = new Object();

    public void callFailed(sx3 sx3Var, IOException iOException) {
        recordFailed(sx3Var);
    }

    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol, @Nullable IOException iOException) {
        recordFailed(sx3Var, sx3Var.request().k().m(), inetSocketAddress.getAddress().getHostAddress());
    }

    public void dnsEnd(sx3 sx3Var, String str, @Nullable List<InetAddress> list) {
        if (!isSupportDns(str) || list == null || list.size() <= 0) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.f10452b) {
            this.f10451a.put(str + ":" + sx3Var.hashCode(), hostAddress);
        }
    }

    public final boolean isSupportDns(String str) {
        if (i0c.f14160a && !TextUtils.isEmpty(str)) {
            return MDDNSEntrance.getInstance().useDNS(str);
        }
        return false;
    }

    public final void recordFailed(sx3 sx3Var, String str, String str2) {
        String strRemove;
        try {
            if (TextUtils.isEmpty(str)) {
                str = sx3Var.request().k().m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.f10452b) {
                        strRemove = this.f10451a.remove(str + ":" + sx3Var.hashCode());
                    }
                    str2 = strRemove;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                MDDNSEntrance.getInstance().requestFailedForDomain(str, str2);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    public final void recordSuccess(sx3 sx3Var) {
        String strRemove;
        try {
            String strM = sx3Var.request().k().m();
            if (isSupportDns(strM)) {
                synchronized (this.f10452b) {
                    strRemove = this.f10451a.remove(strM + ":" + sx3Var.hashCode());
                }
                if (TextUtils.isEmpty(strRemove)) {
                    return;
                }
                MDDNSEntrance.getInstance().requestSucceedForDomain(strM, strRemove);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        int iQ = exc0Var.q();
        if (iQ != 404 && iQ >= 400 && iQ <= 599) {
            recordFailed(sx3Var);
        } else {
            if (iQ < 200 || iQ > 299) {
                return;
            }
            recordSuccess(sx3Var);
        }
    }

    public final void recordFailed(sx3 sx3Var) {
        recordFailed(sx3Var, null, null);
    }
}
