package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.lite.p009j.C0922e;
import com.cosmos.photon.push.util.NetUtil;
import com.p046p1.mobile.putong.data.Mobile;

/* JADX INFO: loaded from: classes.dex */
public final class fwq0 {

    /* JADX INFO: renamed from: l.fwq0$a */
    public static /* synthetic */ class C16951a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f99679a;

        static {
            int[] iArr = new int[C0922e.b.values().length];
            f99679a = iArr;
            try {
                iArr[C0922e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99679a[C0922e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99679a[C0922e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99679a[C0922e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99679a[C0922e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99679a[C0922e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m123552a(Context context) {
        return m123553b(m123555d(context));
    }

    /* JADX INFO: renamed from: b */
    public static String m123553b(C0922e.b bVar) {
        try {
            switch (C16951a.f99679a[bVar.ordinal()]) {
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
    public static boolean m123554c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static C0922e.b m123555d(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return C0922e.b.WIFI;
                }
                if (type == 0) {
                    int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    if (networkType != 3) {
                        if (networkType == 20) {
                            return C0922e.b.MOBILE_5G;
                        }
                        if (networkType != 5 && networkType != 6) {
                            switch (networkType) {
                                default:
                                    switch (networkType) {
                                        case 13:
                                            return C0922e.b.MOBILE_4G;
                                    }
                                case 8:
                                case 9:
                                case 10:
                                    return C0922e.b.MOBILE_3G;
                            }
                        }
                    }
                    return C0922e.b.MOBILE_3G;
                }
                return C0922e.b.MOBILE;
            }
            return C0922e.b.NONE;
        } catch (Throwable unused) {
            return C0922e.b.MOBILE;
        }
    }
}
