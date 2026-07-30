package io.agora.utils2.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Connectivity {
    public static final int Network_2G = 3;
    public static final int Network_3G = 4;
    public static final int Network_4G = 5;
    public static final int Network_5G = 6;
    public static final int Network_DISCONNECTED = 0;
    public static final int Network_LAN = 1;
    public static final int Network_SubType_WIFI_2P4G = 100;
    public static final int Network_SubType_WIFI_5G = 101;
    public static final int Network_UNKNOWN = -1;
    public static final int Network_WIFI = 2;
    private static final String TAG = "Connectivity";

    public static int VPNBehindAddress(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            Logging.m88105d(TAG, "VPNBehindAddress NetworkCapabilities is null");
            return 0;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(4);
        Logging.m88105d(TAG, "VPNBehindAddress vpnInUse is " + zHasTransport);
        return zHasTransport ? 1 : 0;
    }

    public static ArrayList<String> getDnsList() {
        Logging.m88105d(TAG, "getDnsList()");
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            ArrayList<String> arrayList = new ArrayList<>();
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i = 0; i < 4; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (str != null && !"".equals(str) && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        if (context != null && CommonUtility.checkAccessNetworkState(context)) {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        return null;
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        int type = networkInfo.getType();
        if (type == 1) {
            return 2;
        }
        if (type != 0) {
            return -1;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return 6;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return -1;
        }
    }

    public static boolean isConnected(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static int getNetworkType(Context context) {
        return getNetworkType(getNetworkInfo(context));
    }
}
