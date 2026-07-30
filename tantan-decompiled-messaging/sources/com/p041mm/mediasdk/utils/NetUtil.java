package com.p041mm.mediasdk.utils;

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
import p149l.ii5;

/* JADX INFO: loaded from: classes7.dex */
public class NetUtil {

    /* JADX INFO: renamed from: a */
    public static Context f14232a = null;

    /* JADX INFO: renamed from: b */
    public static NetworkInfo f14233b = null;

    /* JADX INFO: renamed from: c */
    public static WifiInfo f14234c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f14235d = true;

    /* JADX INFO: renamed from: e */
    private static InterfaceC4004a f14236e;

    /* JADX INFO: renamed from: f */
    private static Set<InterfaceC4004a> f14237f = new HashSet();

    /* JADX INFO: renamed from: g */
    private static BroadcastReceiver f14238g = new BroadcastReceiver() { // from class: com.mm.mediasdk.utils.NetUtil.1
        /* JADX INFO: renamed from: a */
        private void m19634a(Context context, NetworkInfo networkInfo) {
            if (networkInfo == null) {
                NetUtil.f14233b = null;
                NetUtil.f14234c = null;
                m19636c();
            } else if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) {
                if (m19635b(context, networkInfo)) {
                    m19636c();
                }
                NetUtil.f14235d = true;
            } else {
                if (NetUtil.f14235d) {
                    NetUtil.f14233b = null;
                    NetUtil.f14234c = null;
                    m19636c();
                }
                NetUtil.f14235d = false;
            }
        }

        /* JADX INFO: renamed from: b */
        private boolean m19635b(Context context, NetworkInfo networkInfo) {
            WifiInfo wifiInfo;
            if (networkInfo.getType() == 1) {
                WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null && (wifiInfo = NetUtil.f14234c) != null && wifiInfo.getBSSID() != null && NetUtil.f14234c.getBSSID().equals(connectionInfo.getBSSID()) && NetUtil.f14234c.getSSID().equals(connectionInfo.getSSID()) && NetUtil.f14234c.getNetworkId() == connectionInfo.getNetworkId()) {
                    return false;
                }
                NetUtil.f14234c = connectionInfo;
            } else {
                NetworkInfo networkInfo2 = NetUtil.f14233b;
                if (networkInfo2 != null && networkInfo2.getExtraInfo() != null && networkInfo.getExtraInfo() != null && NetUtil.f14233b.getExtraInfo().equals(networkInfo.getExtraInfo()) && NetUtil.f14233b.getSubtype() == networkInfo.getSubtype() && NetUtil.f14233b.getType() == networkInfo.getType()) {
                    return false;
                }
                NetworkInfo networkInfo3 = NetUtil.f14233b;
                if (networkInfo3 != null && networkInfo3.getExtraInfo() == null && networkInfo.getExtraInfo() == null && NetUtil.f14233b.getSubtype() == networkInfo.getSubtype() && NetUtil.f14233b.getType() == networkInfo.getType()) {
                    return false;
                }
            }
            NetUtil.f14233b = networkInfo;
            return true;
        }

        /* JADX INFO: renamed from: c */
        private void m19636c() {
            Iterator it = NetUtil.f14237f.iterator();
            while (it.hasNext()) {
                ((InterfaceC4004a) it.next()).onNetworkChanged();
            }
            if (NetUtil.f14236e != null) {
                NetUtil.f14236e.onNetworkChanged();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (context == null || intent == null) {
                return;
            }
            NetUtil.m19628a();
            try {
                activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (Exception unused) {
                activeNetworkInfo = null;
            }
            m19634a(context, activeNetworkInfo);
        }
    };

    /* JADX INFO: renamed from: com.mm.mediasdk.utils.NetUtil$a */
    public interface InterfaceC4004a {
        void onNetworkChanged();
    }

    /* JADX INFO: renamed from: com.mm.mediasdk.utils.NetUtil$b */
    public interface InterfaceC4005b {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC4005b m19628a() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m19631d(Context context) {
        if (context == null || f14232a != null) {
            return;
        }
        f14232a = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(f14232a, f14238g, intentFilter);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19632e() {
        Context context = f14232a;
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
    public static void m19633f(InterfaceC4004a interfaceC4004a) {
        f14236e = interfaceC4004a;
    }
}
