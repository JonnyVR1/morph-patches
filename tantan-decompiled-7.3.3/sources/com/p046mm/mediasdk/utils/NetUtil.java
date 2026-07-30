package com.p046mm.mediasdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p153l.jj5;

/* JADX INFO: loaded from: classes6.dex */
public class NetUtil {

    /* JADX INFO: renamed from: a */
    public static Context f14951a = null;

    /* JADX INFO: renamed from: b */
    public static NetworkInfo f14952b = null;

    /* JADX INFO: renamed from: c */
    public static WifiInfo f14953c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f14954d = true;

    /* JADX INFO: renamed from: e */
    private static InterfaceC4155a f14955e;

    /* JADX INFO: renamed from: f */
    private static Set<InterfaceC4155a> f14956f = new HashSet();

    /* JADX INFO: renamed from: g */
    private static BroadcastReceiver f14957g = new BroadcastReceiver() { // from class: com.mm.mediasdk.utils.NetUtil.1
        /* JADX INFO: renamed from: a */
        private void m20633a(Context context, NetworkInfo networkInfo) {
            if (networkInfo == null) {
                NetUtil.f14952b = null;
                NetUtil.f14953c = null;
                m20635c();
            } else if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) {
                if (m20634b(context, networkInfo)) {
                    m20635c();
                }
                NetUtil.f14954d = true;
            } else {
                if (NetUtil.f14954d) {
                    NetUtil.f14952b = null;
                    NetUtil.f14953c = null;
                    m20635c();
                }
                NetUtil.f14954d = false;
            }
        }

        /* JADX INFO: renamed from: b */
        private boolean m20634b(Context context, NetworkInfo networkInfo) {
            WifiInfo wifiInfo;
            if (networkInfo.getType() == 1) {
                WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null && (wifiInfo = NetUtil.f14953c) != null && wifiInfo.getBSSID() != null && NetUtil.f14953c.getBSSID().equals(connectionInfo.getBSSID()) && NetUtil.f14953c.getSSID().equals(connectionInfo.getSSID()) && NetUtil.f14953c.getNetworkId() == connectionInfo.getNetworkId()) {
                    return false;
                }
                NetUtil.f14953c = connectionInfo;
            } else {
                NetworkInfo networkInfo2 = NetUtil.f14952b;
                if (networkInfo2 != null && networkInfo2.getExtraInfo() != null && networkInfo.getExtraInfo() != null && NetUtil.f14952b.getExtraInfo().equals(networkInfo.getExtraInfo()) && NetUtil.f14952b.getSubtype() == networkInfo.getSubtype() && NetUtil.f14952b.getType() == networkInfo.getType()) {
                    return false;
                }
                NetworkInfo networkInfo3 = NetUtil.f14952b;
                if (networkInfo3 != null && networkInfo3.getExtraInfo() == null && networkInfo.getExtraInfo() == null && NetUtil.f14952b.getSubtype() == networkInfo.getSubtype() && NetUtil.f14952b.getType() == networkInfo.getType()) {
                    return false;
                }
            }
            NetUtil.f14952b = networkInfo;
            return true;
        }

        /* JADX INFO: renamed from: c */
        private void m20635c() {
            Iterator it = NetUtil.f14956f.iterator();
            while (it.hasNext()) {
                ((InterfaceC4155a) it.next()).onNetworkChanged();
            }
            if (NetUtil.f14955e != null) {
                NetUtil.f14955e.onNetworkChanged();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (context == null || intent == null) {
                return;
            }
            NetUtil.m20627a();
            try {
                activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (Exception unused) {
                activeNetworkInfo = null;
            }
            m20633a(context, activeNetworkInfo);
        }
    };

    /* JADX INFO: renamed from: com.mm.mediasdk.utils.NetUtil$a */
    public interface InterfaceC4155a {
        void onNetworkChanged();
    }

    /* JADX INFO: renamed from: com.mm.mediasdk.utils.NetUtil$b */
    public interface InterfaceC4156b {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC4156b m20627a() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m20630d(Context context) {
        if (context == null || f14951a != null) {
            return;
        }
        f14951a = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(f14951a, f14957g, intentFilter);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20631e() {
        Context context = f14951a;
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: f */
    public static void m20632f(InterfaceC4155a interfaceC4155a) {
        f14955e = interfaceC4155a;
    }
}
