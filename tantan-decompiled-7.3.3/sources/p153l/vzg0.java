package p153l;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.ProxyInfo;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes.dex */
public abstract class vzg0 {
    /* JADX INFO: renamed from: a */
    public static int m204092a(Application application) {
        ConnectivityManager connectivityManager;
        ConnectivityManager connectivityManager2;
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        if (hgg0.m134937a(application) && (connectivityManager2 = (ConnectivityManager) application.getApplicationContext().getSystemService("connectivity")) != null && (networkInfo = connectivityManager2.getNetworkInfo(9)) != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return 1;
        }
        NetworkInfo activeNetworkInfo = (!hgg0.m134937a(application) || (connectivityManager = (ConnectivityManager) application.getApplicationContext().getSystemService("connectivity")) == null) ? null : connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return RoomDatabase.MAX_BIND_PARAMETER_CNT;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 100;
        }
        if (activeNetworkInfo.getType() != 0) {
            return 0;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
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
            case 17:
                return 3;
            case 13:
            case 18:
                return 4;
            case 19:
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? 3 : 0;
            case 20:
                return 5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m204093b(Application application) {
        ConnectivityManager connectivityManager;
        if (hgg0.m134937a(application) && (connectivityManager = (ConnectivityManager) application.getSystemService("connectivity")) != null) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m204094c(Application application) {
        int i;
        ProxyInfo defaultProxy;
        ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (hgg0.m134937a(application)) {
            if (connectivityManager.getActiveNetwork() != null && (defaultProxy = connectivityManager.getDefaultProxy()) != null) {
                String host = defaultProxy.getHost();
                int port = defaultProxy.getPort();
                String string = defaultProxy.getPacFileUrl() != null ? defaultProxy.getPacFileUrl().toString() : null;
                if ((!TextUtils.isEmpty(host) && port != -1) || !TextUtils.isEmpty(string)) {
                    return true;
                }
            }
            return false;
        }
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        String str = User.ID_TEAM_ACCOUNT;
        if (property2 == null) {
            property2 = User.ID_TEAM_ACCOUNT;
        }
        try {
            i = Integer.parseInt(property2);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (TextUtils.isEmpty(property)) {
            property = System.getProperty("https.proxyHost");
            String property3 = System.getProperty("https.proxyPort");
            if (property3 != null) {
                str = property3;
            }
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        return (TextUtils.isEmpty(property) || i == -1) ? false : true;
    }
}
