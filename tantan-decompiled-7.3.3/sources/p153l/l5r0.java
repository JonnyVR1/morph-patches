package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.lite.p010j.C0926e;
import com.cosmos.photon.push.util.NetUtil;
import com.p051p1.mobile.putong.data.Mobile;

/* JADX INFO: loaded from: classes.dex */
public final class l5r0 {

    /* JADX INFO: renamed from: l.l5r0$a */
    public static /* synthetic */ class C18355a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f130163a;

        static {
            int[] iArr = new int[C0926e.b.values().length];
            f130163a = iArr;
            try {
                iArr[C0926e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130163a[C0926e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130163a[C0926e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130163a[C0926e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130163a[C0926e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f130163a[C0926e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m152976a(Context context) {
        return m152977b(m152979d(context));
    }

    /* JADX INFO: renamed from: b */
    public static String m152977b(C0926e.b bVar) {
        try {
            switch (C18355a.f130163a[bVar.ordinal()]) {
                case 1:
                    return "wifi";
                case 2:
                    return NetUtil.NETWORK_CLASS_2G;
                case 3:
                    return NetUtil.NETWORK_CLASS_3G;
                case 4:
                    return NetUtil.NETWORK_CLASS_4G;
                case 5:
                    return Mobile.TYPE;
                case 6:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m152978c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static C0926e.b m152979d(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return C0926e.b.WIFI;
                }
                if (type == 0) {
                    int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    if (networkType != 3) {
                        if (networkType == 20) {
                            return C0926e.b.MOBILE_5G;
                        }
                        if (networkType != 5 && networkType != 6) {
                            switch (networkType) {
                                default:
                                    switch (networkType) {
                                        case 13:
                                            return C0926e.b.MOBILE_4G;
                                    }
                                case 8:
                                case 9:
                                case 10:
                                    return C0926e.b.MOBILE_3G;
                            }
                        }
                    }
                    return C0926e.b.MOBILE_3G;
                }
                return C0926e.b.MOBILE;
            }
            return C0926e.b.NONE;
        } catch (Throwable unused) {
            return C0926e.b.MOBILE;
        }
    }
}
