package com.immomo.medialog.util.utilcode.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p153l.snk0;

/* JADX INFO: loaded from: classes7.dex */
public final class NetworkUtils {

    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN
    }

    /* JADX INFO: renamed from: a */
    private static NetworkInfo m19403a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) snk0.m186955c().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19404b() {
        NetworkInfo networkInfoM19403a = m19403a();
        return networkInfoM19403a != null && networkInfoM19403a.isConnected();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m19405c() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) snk0.m186955c().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }
}
