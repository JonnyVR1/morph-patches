package com.tantanapp.beatles;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.cosmos.photon.push.util.NetUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.jj5;

/* JADX INFO: loaded from: classes11.dex */
public class NetConnectivityReceiver extends BroadcastReceiver {
    private static boolean sNetConnected = false;
    private static List<InterfaceC13702a> sCallBacks = new ArrayList();
    private static final NetConnectivityReceiver instance = new NetConnectivityReceiver();
    private static String sNetType = "";

    /* JADX INFO: renamed from: com.tantanapp.beatles.NetConnectivityReceiver$a */
    public interface InterfaceC13702a {
        /* JADX INFO: renamed from: a */
        void mo82230a(boolean z);
    }

    private boolean getNetStatus(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
            return false;
        }
        if (activeNetworkInfo.getType() == 1) {
            sNetType = "wifi";
        } else if (activeNetworkInfo.getType() == 0) {
            sNetType = getNetworkType(activeNetworkInfo);
        }
        return true;
    }

    public static String getNetType() {
        return sNetType;
    }

    private String getNetworkType(NetworkInfo networkInfo) {
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
                return "unknown";
        }
    }

    public static void registerCallBack(InterfaceC13702a interfaceC13702a) {
        if (sNetConnected) {
            interfaceC13702a.mo82230a(true);
        }
        sCallBacks.add(interfaceC13702a);
    }

    public static void registerConnectivityReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context, instance, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean netStatus;
        if (sCallBacks == null || sNetConnected == (netStatus = getNetStatus(context))) {
            return;
        }
        sNetConnected = netStatus;
        Iterator<InterfaceC13702a> it = sCallBacks.iterator();
        while (it.hasNext()) {
            it.next().mo82230a(sNetConnected);
        }
    }
}
