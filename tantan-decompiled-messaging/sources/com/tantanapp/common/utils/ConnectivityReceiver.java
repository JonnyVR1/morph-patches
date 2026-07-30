package com.tantanapp.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.cosmos.photon.push.util.NetUtil;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.du2;
import p149l.edk0;
import p149l.f16;
import p149l.gk60;
import p149l.ii5;
import p149l.osi0;

/* JADX INFO: loaded from: classes13.dex */
public class ConnectivityReceiver {

    /* JADX INFO: renamed from: b */
    public static boolean f56060b;

    /* JADX INFO: renamed from: d */
    public static NetworkInfo f56062d;

    /* JADX INFO: renamed from: a */
    public static final ConnectivityInterReceiver f56059a = new ConnectivityInterReceiver();

    /* JADX INFO: renamed from: c */
    public static C22392a<NetworkInfo> f56061c = C22392a.m221512b();

    public static class ConnectivityInterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityReceiver.m81293p();
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.common.utils.ConnectivityReceiver$a */
    public class C13633a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            ConnectivityReceiver.m81293p();
            String str = edk0.f90611a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            String str = edk0.f90611a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            String str = edk0.f90611a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            super.onLosing(network, i);
            String str = edk0.f90611a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            ConnectivityReceiver.m81293p();
            String str = edk0.f90611a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            ConnectivityReceiver.m81293p();
            String str = edk0.f90611a;
        }
    }

    static {
        m81293p();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m81278a() {
        m81280c();
        f56061c.onNext(f56062d);
    }

    /* JADX INFO: renamed from: c */
    public static void m81280c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) f16.m119092a().getSystemService("connectivity");
        if (connectivityManager != null && gk60.m126589a(f16.m119092a(), "android.permission.ACCESS_NETWORK_STATE")) {
            f56062d = connectivityManager.getActiveNetworkInfo();
            return;
        }
        f56062d = null;
        if (edk0.f90613c) {
            osi0.m165778b("acquire network info fail,Reason:ConnectivityManager is null or no ACCESS_NETWORK_STATE permission");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m81281d() {
        NetworkInfo networkInfo;
        if (m81289l()) {
            return "wifi";
        }
        if (!m81287j() || (networkInfo = f56062d) == null) {
            return "unknown";
        }
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "cellular(2g)";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "cellular(3g)";
            case 13:
                return "cellular(4g)";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m81282e() {
        NetworkInfo networkInfo;
        if (m81289l()) {
            return "WiFi";
        }
        if (!m81287j() || (networkInfo = f56062d) == null) {
            return "";
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return NetUtil.NETWORK_CLASS_5G;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m81283f() {
        NetworkInfo networkInfo;
        if (m81289l()) {
            return "wifi";
        }
        if (!m81287j() || (networkInfo = f56062d) == null) {
            return "unknown";
        }
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m81284g() {
        m81280c();
        NetworkInfo networkInfo = f56062d;
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m81285h(int i, int i2) {
        if (i == 1) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        switch (i2) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m81286i() {
        NetworkInfo networkInfo = f56062d;
        return networkInfo != null && networkInfo.isConnected() && m81285h(networkInfo.getType(), networkInfo.getSubtype());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m81287j() {
        NetworkInfo networkInfo = f56062d;
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m81288k() {
        WifiManager wifiManager;
        NetworkInfo networkInfo = f56062d;
        if (networkInfo == null) {
            return true;
        }
        if (networkInfo.getType() != 1 || (wifiManager = (WifiManager) f16.m119092a().getApplicationContext().getSystemService("wifi")) == null) {
            return !m81286i();
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            return true;
        }
        int rssi = connectionInfo.getRssi();
        return rssi < -70 && rssi >= -100;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m81289l() {
        NetworkInfo networkInfo = f56062d;
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<NetworkInfo> m81290m() {
        return f56061c;
    }

    /* JADX INFO: renamed from: n */
    public static void m81291n(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) f16.m119092a().getSystemService("connectivity");
        if (connectivityManager == null) {
            m81292o(context);
        } else {
            ii5.m136340j(connectivityManager, new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), new C13633a());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m81292o(Context context) {
        f56060b = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(context, f56059a, intentFilter);
    }

    /* JADX INFO: renamed from: p */
    public static void m81293p() {
        du2.m113670a("[common][network]", "network changed : " + m81281d());
        ThreadUtil.m81314i(new Runnable() { // from class: l.kw5
            @Override // java.lang.Runnable
            public final void run() {
                ConnectivityReceiver.m81278a();
            }
        });
    }
}
