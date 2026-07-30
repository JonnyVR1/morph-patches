package com.cosmos.photon.push.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.referee.Referee;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.ii5;
import p149l.j0c;

/* JADX INFO: loaded from: classes.dex */
public class NetUtil {
    public static final String NETWORK_CLASS_2G = "2g";
    public static final String NETWORK_CLASS_3G = "3g";
    public static final String NETWORK_CLASS_4G = "4g";
    public static final String NETWORK_CLASS_5G = "5G";
    public static final String NETWORK_CLASS_UNKNOWN = "unknown";
    public static final String NETWORK_TYPE_WIFI = "wifi";
    private static final String TAG = "NetUtil";
    public static Context context = null;
    public static NetworkInfo lastActiveNetworkInfo = null;
    public static boolean lastConnected = true;
    public static WifiInfo lastWifiInfo;
    private static List<NetChangeReceiver> receiverList = Collections.synchronizedList(new ArrayList());
    private static BroadcastReceiver netChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.cosmos.photon.push.util.NetUtil.1
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
            try {
                if (networkInfo.getType() == 1) {
                    WifiInfo connectionInfo = ((WifiManager) context2.getSystemService("wifi")).getConnectionInfo();
                    if (connectionInfo != null && (wifiInfo = NetUtil.lastWifiInfo) != null && wifiInfo.getBSSID() != null && NetUtil.lastWifiInfo.getBSSID().equals(connectionInfo.getBSSID()) && NetUtil.lastWifiInfo.getSSID() != null && NetUtil.lastWifiInfo.getSSID().equals(connectionInfo.getSSID()) && NetUtil.lastWifiInfo.getNetworkId() == connectionInfo.getNetworkId()) {
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
            } catch (Exception e) {
                MDLog.printErrStackTrace("net", e);
                return false;
            }
        }

        private void onNetworkChange() {
            j0c.m139158b(Referee.APP_ID).mo105301a();
            for (int size = NetUtil.receiverList.size() - 1; size >= 0; size--) {
                ((NetChangeReceiver) NetUtil.receiverList.get(size)).onNetworkChanged();
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

    public interface NetChangeReceiver {
        void onNetworkChanged();
    }

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

    public static String getNetTypeContent() {
        int netType = getNetType();
        if (netType == 1) {
            return NETWORK_CLASS_2G;
        }
        if (netType == 2) {
            return NETWORK_CLASS_3G;
        }
        if (netType != 3) {
            return netType != 4 ? CardButtonsShowAndHideType.unknow : "wifi";
        }
        return NETWORK_CLASS_4G;
    }

    public static String getNetWorkClass() {
        NetworkInfo activeNetworkInfo;
        try {
            Context context2 = AppContext.sContext;
            if (context2 == null || (activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return getNetworkClass(activeNetworkInfo.getSubtype());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String getNetworkClass(int i) {
        if (i == 20) {
            return NETWORK_CLASS_5G;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return NETWORK_CLASS_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return NETWORK_CLASS_3G;
            case 13:
                return NETWORK_CLASS_4G;
            default:
                return "unknown";
        }
    }

    public static void init(Context context2) {
        if (context2 == null || context != null) {
            return;
        }
        context = context2.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(context, netChangeBroadcastReceiver, intentFilter);
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

    public static void registerNetChangeReceiver(NetChangeReceiver netChangeReceiver) {
        receiverList.add(netChangeReceiver);
    }

    public static void unregisterNetChangeReceiver(NetChangeReceiver netChangeReceiver) {
        if (receiverList.contains(netChangeReceiver)) {
            receiverList.remove(netChangeReceiver);
        }
    }
}
