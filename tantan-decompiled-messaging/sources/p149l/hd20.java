package p149l;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.clevertap.android.sdk.Constants;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class hd20 {
    /* JADX INFO: renamed from: a */
    public static String m130566a(String str) {
        try {
            String host = new URI(str).getHost();
            return (host.startsWith("[") && host.endsWith(Constants.AES_SUFFIX)) ? host.substring(1, host.length() - 1) : host;
        } catch (Exception unused) {
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public static boolean m130567b(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            boolean z = networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(2) || networkCapabilities.hasTransport(5) || networkCapabilities.hasTransport(6);
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (z && zHasCapability) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m130568c(String str) {
        return Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m130569d(String str) {
        return m130568c(m130566a(str));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m130570e(String str) {
        return Pattern.compile("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:)(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m130571f(String str) {
        return m130570e(m130566a(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r2 = (android.net.ConnectivityManager) r2.getSystemService("connectivity");
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m130572g(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto Lf
            return r0
        Lf:
            boolean r2 = m130567b(r2)     // Catch: java.lang.RuntimeException -> L14 java.lang.NoSuchMethodError -> L15
            return r2
        L14:
            return r0
        L15:
            boolean r2 = m130573h(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.hd20.m130572g(android.content.Context):boolean");
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    private static boolean m130573h(ConnectivityManager connectivityManager) {
        try {
            for (NetworkInfo networkInfo : connectivityManager.getAllNetworkInfo()) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
