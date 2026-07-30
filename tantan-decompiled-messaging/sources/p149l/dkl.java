package p149l;

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
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes9.dex */
public class dkl extends o3f {

    /* JADX INFO: renamed from: a */
    public LruCache<String, String> f86666a = new LruCache<>(300);

    /* JADX INFO: renamed from: b */
    public final Object f86667b = new Object();

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        recordFailed(sx3Var);
    }

    @Override // p149l.o3f
    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol, @Nullable IOException iOException) {
        recordFailed(sx3Var, sx3Var.request().m185881k().m107522m(), inetSocketAddress.getAddress().getHostAddress());
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, @Nullable List<InetAddress> list) {
        if (!isSupportDns(str) || list == null || list.size() <= 0) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.f86667b) {
            this.f86666a.put(str + ":" + sx3Var.hashCode(), hostAddress);
        }
    }

    public final boolean isSupportDns(String str) {
        if (i0c.f110273a && !TextUtils.isEmpty(str)) {
            return MDDNSEntrance.getInstance().useDNS(str);
        }
        return false;
    }

    public final void recordFailed(sx3 sx3Var, String str, String str2) {
        String strRemove;
        try {
            if (TextUtils.isEmpty(str)) {
                str = sx3Var.request().m185881k().m107522m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.f86667b) {
                        strRemove = this.f86666a.remove(str + ":" + sx3Var.hashCode());
                    }
                    str2 = strRemove;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                MDDNSEntrance.getInstance().requestFailedForDomain(str, str2);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    public final void recordSuccess(sx3 sx3Var) {
        String strRemove;
        try {
            String strM107522m = sx3Var.request().m185881k().m107522m();
            if (isSupportDns(strM107522m)) {
                synchronized (this.f86667b) {
                    strRemove = this.f86666a.remove(strM107522m + ":" + sx3Var.hashCode());
                }
                if (TextUtils.isEmpty(strRemove)) {
                    return;
                }
                MDDNSEntrance.getInstance().requestSucceedForDomain(strM107522m, strRemove);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
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

    public final void recordFailed(sx3 sx3Var) {
        recordFailed(sx3Var, null, null);
    }
}
