package com.cosmos.photon.push.dns;

import android.text.TextUtils;
import android.util.LruCache;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.referee.Referee;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;
import p149l.exc0;
import p149l.o3f;
import p149l.sx3;

/* JADX INFO: loaded from: classes.dex */
public class RequestEventListener extends o3f {
    private LruCache<String, String> requestRecords = new LruCache<>(20);
    private final Object lock = new Object();

    private boolean isSupportDns(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Referee.getInstance().isSupportDns(str);
    }

    private void recordFailed(sx3 sx3Var, String str, String str2) {
        String strRemove;
        try {
            if (TextUtils.isEmpty(str)) {
                str = sx3Var.request().m185881k().m107522m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.lock) {
                        strRemove = this.requestRecords.remove(str + ":" + sx3Var.hashCode());
                    }
                    str2 = strRemove;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                Referee.getInstance().failed(str, str2);
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
        }
    }

    private void recordSuccess(sx3 sx3Var) {
        String strRemove;
        try {
            String strM107522m = sx3Var.request().m185881k().m107522m();
            if (isSupportDns(strM107522m)) {
                synchronized (this.lock) {
                    strRemove = this.requestRecords.remove(strM107522m + ":" + sx3Var.hashCode());
                }
                if (TextUtils.isEmpty(strRemove)) {
                    return;
                }
                Referee.getInstance().success(strM107522m, strRemove);
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
        }
    }

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        MDLog.m7396i(LogTag.DNS, "callFailed call %s exception:%s ", sx3Var, iOException);
        recordFailed(sx3Var);
    }

    @Override // p149l.o3f
    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        String strM107522m = sx3Var.request().m185881k().m107522m();
        MDLog.m7396i(LogTag.DNS, "connectFailed call %s address:%s", sx3Var, inetSocketAddress.getHostName());
        recordFailed(sx3Var, strM107522m, inetSocketAddress.getHostName());
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
        MDLog.m7396i(LogTag.DNS, "dnsEnd call %s domainName:%s AddressList:%s", sx3Var, str, list);
        if (!isSupportDns(str) || list == null || list.size() <= 0) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.lock) {
            this.requestRecords.put(str + ":" + sx3Var.hashCode(), hostAddress);
        }
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        int iM118609q = exc0Var.m118609q();
        MDLog.m7396i(LogTag.DNS, "responseHeadersEnd call %s code:%d ", sx3Var, Integer.valueOf(iM118609q));
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
