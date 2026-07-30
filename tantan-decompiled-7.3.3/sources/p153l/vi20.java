package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import com.cosmos.photon.push.util.NetUtil;
import com.p051p1.mobile.putong.data.Mobile;

/* JADX INFO: loaded from: classes7.dex */
public class vi20 {

    /* JADX INFO: renamed from: a */
    public static Uri f184214a = Uri.parse("content://telephony/carriers/preferapn");

    /* JADX INFO: renamed from: a */
    public static String m201318a() {
        NetworkInfo activeNetworkInfo;
        try {
            Context context = l3d0.f129865g;
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return m201320c(activeNetworkInfo.getSubtype());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m201319b() {
        NetworkInfo activeNetworkInfo;
        Context context = l3d0.f129865g;
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

    /* JADX INFO: renamed from: c */
    private static String m201320c(int i) {
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
    public static boolean m201321d() {
        ConnectivityManager connectivityManager;
        Context context = l3d0.f129865g;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
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
            return false;
        } catch (NoSuchMethodError unused2) {
            return m201322e(connectivityManager);
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m201322e(ConnectivityManager connectivityManager) {
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

    /* JADX INFO: renamed from: f */
    public static boolean m201323f() {
        return "wifi".equals(m201319b());
    }
}
