package com.immomo.medialog.util.utilcode.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p149l.mek0;

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
    private static NetworkInfo m18394a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mek0.m154241c().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18395b() {
        NetworkInfo networkInfoM18394a = m18394a();
        return networkInfoM18394a != null && networkInfoM18394a.isConnected();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18396c() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mek0.m154241c().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }
}
