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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.jj5;
import p153l.k26;
import p153l.kmk0;
import p153l.ms60;
import p153l.r1j0;
import p153l.tu2;

/* JADX INFO: loaded from: classes11.dex */
public class ConnectivityReceiver {

    /* JADX INFO: renamed from: b */
    public static boolean f56908b;

    /* JADX INFO: renamed from: d */
    public static NetworkInfo f56910d;

    /* JADX INFO: renamed from: a */
    public static final ConnectivityInterReceiver f56907a = new ConnectivityInterReceiver();

    /* JADX INFO: renamed from: c */
    public static C22507a<NetworkInfo> f56909c = C22507a.m222758b();

    public static class ConnectivityInterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityReceiver.m82476p();
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.common.utils.ConnectivityReceiver$a */
    public class C13796a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            ConnectivityReceiver.m82476p();
            String str = kmk0.f127508a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            String str = kmk0.f127508a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            String str = kmk0.f127508a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            super.onLosing(network, i);
            String str = kmk0.f127508a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            ConnectivityReceiver.m82476p();
            String str = kmk0.f127508a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            ConnectivityReceiver.m82476p();
            String str = kmk0.f127508a;
        }
    }

    static {
        m82476p();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82461a() {
        m82463c();
        f56909c.onNext(f56910d);
    }

    /* JADX INFO: renamed from: c */
    public static void m82463c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) k26.m147943a().getSystemService("connectivity");
        if (connectivityManager != null && ms60.m159753a(k26.m147943a(), "android.permission.ACCESS_NETWORK_STATE")) {
            f56910d = connectivityManager.getActiveNetworkInfo();
            return;
        }
        f56910d = null;
        if (kmk0.f127510c) {
            r1j0.m179415b("acquire network info fail,Reason:ConnectivityManager is null or no ACCESS_NETWORK_STATE permission");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m82464d() {
        NetworkInfo networkInfo;
        if (m82472l()) {
            return "wifi";
        }
        if (!m82470j() || (networkInfo = f56910d) == null) {
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
    public static String m82465e() {
        NetworkInfo networkInfo;
        if (m82472l()) {
            return "WiFi";
        }
        if (!m82470j() || (networkInfo = f56910d) == null) {
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
    public static String m82466f() {
        NetworkInfo networkInfo;
        if (m82472l()) {
            return "wifi";
        }
        if (!m82470j() || (networkInfo = f56910d) == null) {
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
    public static boolean m82467g() {
        m82463c();
        NetworkInfo networkInfo = f56910d;
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m82468h(int i, int i2) {
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
    public static boolean m82469i() {
        NetworkInfo networkInfo = f56910d;
        return networkInfo != null && networkInfo.isConnected() && m82468h(networkInfo.getType(), networkInfo.getSubtype());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m82470j() {
        NetworkInfo networkInfo = f56910d;
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m82471k() {
        WifiManager wifiManager;
        NetworkInfo networkInfo = f56910d;
        if (networkInfo == null) {
            return true;
        }
        if (networkInfo.getType() != 1 || (wifiManager = (WifiManager) k26.m147943a().getApplicationContext().getSystemService("wifi")) == null) {
            return !m82469i();
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            return true;
        }
        int rssi = connectionInfo.getRssi();
        return rssi < -70 && rssi >= -100;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m82472l() {
        NetworkInfo networkInfo = f56910d;
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<NetworkInfo> m82473m() {
        return f56909c;
    }

    /* JADX INFO: renamed from: n */
    public static void m82474n(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) k26.m147943a().getSystemService("connectivity");
        if (connectivityManager == null) {
            m82475o(context);
        } else {
            jj5.m145016j(connectivityManager, new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), new C13796a());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m82475o(Context context) {
        f56908b = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context, f56907a, intentFilter);
    }

    /* JADX INFO: renamed from: p */
    public static void m82476p() {
        tu2.m192703a("[common][network]", "network changed : " + m82464d());
        ThreadUtil.m82497i(new Runnable() { // from class: l.px5
            @Override // java.lang.Runnable
            public final void run() {
                ConnectivityReceiver.m82461a();
            }
        });
    }
}
