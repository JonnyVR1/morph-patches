package com.cosmos.photon.baseim.p025im;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.jj5;

/* JADX INFO: loaded from: classes.dex */
public class NetUtil {
    private static final String TAG = "NetUtil";
    public static Context context = null;
    public static NetworkInfo lastActiveNetworkInfo = null;
    public static boolean lastConnected = true;
    public static WifiInfo lastWifiInfo;
    private static List<Long> receiverList = Collections.synchronizedList(new ArrayList());
    private static BroadcastReceiver netChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.cosmos.photon.baseim.im.NetUtil.1
        private void checkConnInfo(Context context2, NetworkInfo networkInfo) {
            if (networkInfo == null) {
                NetUtil.lastActiveNetworkInfo = null;
                NetUtil.lastWifiInfo = null;
                onNetworkChange();
            } else if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) {
                if (isNetworkChange(context2, networkInfo)) {
                    onNetworkChange();
                }
                NetUtil.lastConnected = true;
            } else {
                if (NetUtil.lastConnected) {
                    NetUtil.lastActiveNetworkInfo = null;
                    NetUtil.lastWifiInfo = null;
                    onNetworkChange();
                }
                NetUtil.lastConnected = false;
            }
        }

        private boolean isNetworkChange(Context context2, NetworkInfo networkInfo) {
            WifiInfo wifiInfo;
            if (networkInfo.getType() == 1) {
                WifiInfo connectionInfo = ((WifiManager) context2.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null && (wifiInfo = NetUtil.lastWifiInfo) != null && wifiInfo.getBSSID() != null && NetUtil.lastWifiInfo.getBSSID().equals(connectionInfo.getBSSID()) && NetUtil.lastWifiInfo.getSSID().equals(connectionInfo.getSSID()) && NetUtil.lastWifiInfo.getNetworkId() == connectionInfo.getNetworkId()) {
                    return false;
                }
                NetUtil.lastWifiInfo = connectionInfo;
            } else {
                NetworkInfo networkInfo2 = NetUtil.lastActiveNetworkInfo;
                if (networkInfo2 != null && networkInfo2.getExtraInfo() != null && networkInfo.getExtraInfo() != null && NetUtil.lastActiveNetworkInfo.getExtraInfo().equals(networkInfo.getExtraInfo()) && NetUtil.lastActiveNetworkInfo.getSubtype() == networkInfo.getSubtype() && NetUtil.lastActiveNetworkInfo.getType() == networkInfo.getType()) {
                    return false;
                }
                NetworkInfo networkInfo3 = NetUtil.lastActiveNetworkInfo;
                if (networkInfo3 != null && networkInfo3.getExtraInfo() == null && networkInfo.getExtraInfo() == null && NetUtil.lastActiveNetworkInfo.getSubtype() == networkInfo.getSubtype() && NetUtil.lastActiveNetworkInfo.getType() == networkInfo.getType()) {
                    return false;
                }
            }
            NetUtil.lastActiveNetworkInfo = networkInfo;
            return true;
        }

        private void onNetworkChange() {
            try {
                for (int size = NetUtil.receiverList.size() - 1; size >= 0; size--) {
                    NetUtil.nativeNotifyNetChanged(((Long) NetUtil.receiverList.get(size)).longValue());
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (context2 == null || intent == null) {
                return;
            }
            try {
                activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (Exception unused) {
                activeNetworkInfo = null;
            }
            checkConnInfo(context2, activeNetworkInfo);
        }
    };

    public static void clearAllReceivers() {
        receiverList.clear();
    }

    public static int getNetType() {
        Context context2 = context;
        if (context2 != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.getType() == 1) {
                        return 4;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 1;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 2;
                        case 13:
                            return 3;
                        default:
                            return 0;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static void init(Context context2) {
        if (context2 == null || context != null) {
            return;
        }
        context = context2.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context2, netChangeBroadcastReceiver, intentFilter);
    }

    public static boolean isNetworkAvailable() {
        Context context2 = context;
        if (context2 == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyNetChanged(long j);

    public static void registerNetChangeReceiver(long j) {
        receiverList.add(Long.valueOf(j));
    }

    public static void unregisterNetChangeReceiver(long j) {
        if (receiverList.contains(Long.valueOf(j))) {
            receiverList.remove(Long.valueOf(j));
        }
    }
}
