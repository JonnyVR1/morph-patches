package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.cosmos.photon.push.util.NetUtil;

/* JADX INFO: loaded from: classes11.dex */
public class ql20 {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static int m176979a(Context context) {
        ConnectivityManager connectivityManager;
        int networkType;
        NetworkInfo.State state;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return -6;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return -6;
            }
        } catch (Exception unused) {
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return -1;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return -6;
        }
        try {
            networkType = telephonyManager.getNetworkType();
        } catch (Exception unused2) {
            networkType = 0;
        }
        if (networkType == 20) {
            return -5;
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return -2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return -3;
            case 13:
                return -4;
            default:
                return networkType;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m176980b(Context context) {
        int iM176979a = m176979a(context);
        switch (iM176979a) {
            case -6:
                return "NotReachable";
            case -5:
                return "5g";
            case -4:
                return NetUtil.NETWORK_CLASS_4G;
            case -3:
                return NetUtil.NETWORK_CLASS_3G;
            case -2:
                return NetUtil.NETWORK_CLASS_2G;
            case -1:
                return "wifi";
            default:
                return "" + iM176979a;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public static String m176981c(Context context) {
        TelephonyManager telephonyManager;
        if (Build.VERSION.SDK_INT >= 29 || context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "";
        }
        String subscriberId = ns60.m164558a(context, "android.permission.READ_PHONE_STATE") ? telephonyManager.getSubscriberId() : "";
        if (!TextUtils.isEmpty(subscriberId)) {
            if (subscriberId.startsWith("46000") || subscriberId.startsWith("46002") || subscriberId.startsWith("46007")) {
                return "中国移动";
            }
            if (subscriberId.startsWith("46001") || subscriberId.startsWith("46006")) {
                return "中国联通";
            }
            if (subscriberId.startsWith("46003") || subscriberId.startsWith("46005")) {
                return "中国电信";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m176982d(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
        }
    }
}
