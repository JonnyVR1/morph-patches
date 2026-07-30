package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import com.cosmos.photon.push.util.NetUtil;
import com.p046p1.mobile.putong.data.Mobile;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class na20 {

    /* JADX INFO: renamed from: a */
    public static Uri f137857a = Uri.parse("content://telephony/carriers/preferapn");

    /* JADX INFO: renamed from: a */
    public static int m158570a() {
        Context context = ev0.f93300a;
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
    public static String m158571b() {
        NetworkInfo activeNetworkInfo;
        try {
            Context context = ev0.f93300a;
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return m158573d(activeNetworkInfo.getSubtype());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m158572c() {
        NetworkInfo activeNetworkInfo;
        Context context = ev0.f93300a;
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo.getType() == 0) {
            return Mobile.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m158573d(int i) {
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

    /* JADX INFO: renamed from: e */
    public static boolean m158574e(String str) {
        return Pattern.compile("(?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))").matcher(str).matches();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m158575f() {
        ConnectivityManager connectivityManager;
        Context context = ev0.f93300a;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            try {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                if (allNetworks != null) {
                    NetworkInfo networkInfo = null;
                    for (Network network : allNetworks) {
                        try {
                            networkInfo = connectivityManager.getNetworkInfo(network);
                        } catch (Exception unused) {
                        }
                        if (networkInfo != null && NetworkInfo.State.CONNECTED.equals(networkInfo.getState())) {
                            return true;
                        }
                    }
                }
            } catch (RuntimeException unused2) {
            }
            return false;
        } catch (NoSuchMethodError unused3) {
            return m158576g(connectivityManager);
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m158576g(ConnectivityManager connectivityManager) {
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

    /* JADX INFO: renamed from: h */
    public static boolean m158577h() {
        return "wifi".equals(m158572c());
    }
}
