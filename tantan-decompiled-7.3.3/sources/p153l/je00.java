package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;

/* JADX INFO: loaded from: classes7.dex */
public class je00 {
    /* JADX INFO: renamed from: a */
    public static int m144505a(Context context, float f) {
        if (context != null) {
            try {
                return Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f);
            } catch (Throwable unused) {
            }
        }
        return (int) f;
    }

    /* JADX INFO: renamed from: b */
    public static String m144506b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: c */
    public static String m144507c(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return BLiveChatJailedType.None;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return "WIFI";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        switch ((telephonyManager == null || context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) ? 0 : telephonyManager.getNetworkType()) {
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
                return "Mobile";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m144508d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getSimOperatorName();
        } catch (Exception unused) {
            return "";
        }
    }
}
