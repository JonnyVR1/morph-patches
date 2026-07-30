package p153l;

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
public class rml extends t4f {

    /* JADX INFO: renamed from: a */
    public LruCache<String, String> f163889a = new LruCache<>(300);

    /* JADX INFO: renamed from: b */
    public final Object f163890b = new Object();

    @Override // p153l.t4f
    public void callFailed(ry3 ry3Var, IOException iOException) {
        recordFailed(ry3Var);
    }

    @Override // p153l.t4f
    public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol, @Nullable IOException iOException) {
        recordFailed(ry3Var, ry3Var.request().m209026k().m182286m(), inetSocketAddress.getAddress().getHostAddress());
    }

    @Override // p153l.t4f
    public void dnsEnd(ry3 ry3Var, String str, @Nullable List<InetAddress> list) {
        if (!isSupportDns(str) || list == null || list.size() <= 0) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.f163890b) {
            this.f163889a.put(str + ":" + ry3Var.hashCode(), hostAddress);
        }
    }

    public final boolean isSupportDns(String str) {
        if (v1c.f181942a && !TextUtils.isEmpty(str)) {
            return MDDNSEntrance.getInstance().useDNS(str);
        }
        return false;
    }

    public final void recordFailed(ry3 ry3Var, String str, String str2) {
        String strRemove;
        try {
            if (TextUtils.isEmpty(str)) {
                str = ry3Var.request().m209026k().m182286m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.f163890b) {
                        strRemove = this.f163889a.remove(str + ":" + ry3Var.hashCode());
                    }
                    str2 = strRemove;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                MDDNSEntrance.getInstance().requestFailedForDomain(str, str2);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    public final void recordSuccess(ry3 ry3Var) {
        String strRemove;
        try {
            String strM182286m = ry3Var.request().m209026k().m182286m();
            if (isSupportDns(strM182286m)) {
                synchronized (this.f163890b) {
                    strRemove = this.f163889a.remove(strM182286m + ":" + ry3Var.hashCode());
                }
                if (TextUtils.isEmpty(strRemove)) {
                    return;
                }
                MDDNSEntrance.getInstance().requestSucceedForDomain(strM182286m, strRemove);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
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

    public final void recordFailed(ry3 ry3Var) {
        recordFailed(ry3Var, null, null);
    }
}
