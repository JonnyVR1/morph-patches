package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class tl20 {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static int m191602a(Context context) {
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(hmw.m136007a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                    return 1;
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null) {
                    NetworkInfo.State state2 = networkInfo2.getState();
                    String subtypeName = networkInfo2.getSubtypeName();
                    if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                        int subtype = activeNetworkInfo.getSubtype();
                        if (subtype == 20) {
                            return 6;
                        }
                        switch (subtype) {
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
                                return (subtypeName.equalsIgnoreCase(hmw.m136007a(new byte[]{100, 34, 28, 100, 34, 34, 125, 39})) || subtypeName.equalsIgnoreCase(hmw.m136007a(new byte[]{103, 37, 117, 122, HttpTokens.SPACE})) || subtypeName.equalsIgnoreCase(hmw.m136007a(new byte[]{115, 34, 124, 118, 83, 86, 0, 86}))) ? 3 : 5;
                        }
                    }
                }
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public static boolean m191603b() {
        ConnectivityManager connectivityManager;
        if (fiw.f99272a == null || (connectivityManager = (ConnectivityManager) fiw.f99272a.getSystemService(hmw.m136007a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}))) == null) {
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
            return m191604c(connectivityManager);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    private static boolean m191604c(ConnectivityManager connectivityManager) {
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
