package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import com.cosmos.photon.push.util.NetUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ui20 {

    /* JADX INFO: renamed from: a */
    public static Uri f179074a = Uri.parse("content://telephony/carriers/preferapn");

    /* JADX INFO: renamed from: a */
    public static int m196133a() {
        Context context = jv0.f122755a;
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
    public static String m196134b() {
        NetworkInfo activeNetworkInfo;
        try {
            Context context = jv0.f122755a;
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return m196135c(activeNetworkInfo.getSubtype());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m196135c(int i) {
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

    /* JADX INFO: renamed from: d */
    public static boolean m196136d() {
        ConnectivityManager connectivityManager;
        Context context = jv0.f122755a;
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
            return m196137e(connectivityManager);
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m196137e(ConnectivityManager connectivityManager) {
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
