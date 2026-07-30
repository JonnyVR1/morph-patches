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
import p153l.i5d0;
import p153l.ry3;
import p153l.t4f;

/* JADX INFO: loaded from: classes.dex */
public class RequestEventListener extends t4f {
    private LruCache<String, String> requestRecords = new LruCache<>(20);
    private final Object lock = new Object();

    private boolean isSupportDns(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Referee.getInstance().isSupportDns(str);
    }

    private void recordFailed(ry3 ry3Var, String str, String str2) {
        String strRemove;
        try {
            if (TextUtils.isEmpty(str)) {
                str = ry3Var.request().m209026k().m182286m();
            }
            if (isSupportDns(str)) {
                if (TextUtils.isEmpty(str2)) {
                    synchronized (this.lock) {
                        strRemove = this.requestRecords.remove(str + ":" + ry3Var.hashCode());
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

    private void recordSuccess(ry3 ry3Var) {
        String strRemove;
        try {
            String strM182286m = ry3Var.request().m209026k().m182286m();
            if (isSupportDns(strM182286m)) {
                synchronized (this.lock) {
                    strRemove = this.requestRecords.remove(strM182286m + ":" + ry3Var.hashCode());
                }
                if (TextUtils.isEmpty(strRemove)) {
                    return;
                }
                Referee.getInstance().success(strM182286m, strRemove);
            }
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
        }
    }

    @Override // p153l.t4f
    public void callFailed(ry3 ry3Var, IOException iOException) {
        MDLog.m7450i(LogTag.DNS, "callFailed call %s exception:%s ", ry3Var, iOException);
        recordFailed(ry3Var);
    }

    @Override // p153l.t4f
    public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        String strM182286m = ry3Var.request().m209026k().m182286m();
        MDLog.m7450i(LogTag.DNS, "connectFailed call %s address:%s", ry3Var, inetSocketAddress.getHostName());
        recordFailed(ry3Var, strM182286m, inetSocketAddress.getHostName());
    }

    @Override // p153l.t4f
    public void dnsEnd(ry3 ry3Var, String str, List<InetAddress> list) {
        MDLog.m7450i(LogTag.DNS, "dnsEnd call %s domainName:%s AddressList:%s", ry3Var, str, list);
        if (!isSupportDns(str) || list == null || list.size() <= 0) {
            return;
        }
        String hostAddress = list.get(0).getHostAddress();
        synchronized (this.lock) {
            this.requestRecords.put(str + ":" + ry3Var.hashCode(), hostAddress);
        }
    }

    @Override // p153l.t4f
    public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        int iM138673q = i5d0Var.m138673q();
        MDLog.m7450i(LogTag.DNS, "responseHeadersEnd call %s code:%d ", ry3Var, Integer.valueOf(iM138673q));
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
