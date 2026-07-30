package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.annotation.RequiresPermission;
import com.cosmos.photon.push.util.NetUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class wi20 {

    /* JADX INFO: renamed from: a */
    public static Uri f189333a = Uri.parse("content://telephony/carriers/preferapn");

    /* JADX INFO: renamed from: a */
    public static int m206537a() {
        Context context = lv0.f133670a;
        if (context == null) {
            return -1;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m206538b() {
        NetworkInfo activeNetworkInfo;
        try {
            Context context = lv0.f133670a;
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return m206541e(activeNetworkInfo.getSubtype());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m206539c() {
        NetworkInfo activeNetworkInfo;
        try {
            Context context = lv0.f133670a;
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                return m206540d(activeNetworkInfo.getSubtype());
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m206540d(int i) {
        if (i == 20) {
            return 5;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m206541e(int i) {
        if (i == 20) {
            return NetUtil.NETWORK_CLASS_5G;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return NetUtil.NETWORK_CLASS_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return NetUtil.NETWORK_CLASS_3G;
            case 13:
                return NetUtil.NETWORK_CLASS_4G;
            default:
                return "unknown";
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: f */
    public static boolean m206542f(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(2) || networkCapabilities.hasTransport(5) || networkCapabilities.hasTransport(6);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m206543g(String str) {
        return Pattern.compile("(?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))").matcher(str).matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
    
        r0 = (android.net.ConnectivityManager) r0.getSystemService("connectivity");
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m206544h() {
        ConnectivityManager connectivityManager;
        Context context = lv0.f133670a;
        if (context == null || connectivityManager == null) {
            return false;
        }
        try {
            return m206542f(connectivityManager);
        } catch (NoSuchMethodError unused) {
            return m206545i(connectivityManager);
        } catch (RuntimeException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m206545i(ConnectivityManager connectivityManager) {
        try {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
