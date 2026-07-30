package p153l;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class l0e {
    /* JADX INFO: renamed from: a */
    public static boolean m152325a() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter != null && defaultAdapter.isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m152326b() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: c */
    public static String m152327c() {
        return "android";
    }

    /* JADX INFO: renamed from: d */
    public static String m152328d() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0);
        } catch (AssertionError unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m152329e() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: f */
    public static String m152330f(Context context) {
        if (context == null) {
            return "";
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: g */
    public static int m152331g(Context context) {
        int i = m152336l(context) ? 2 : 0;
        return ns60.m164559b(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? i + 1 : i;
    }

    /* JADX INFO: renamed from: h */
    public static String m152332h() {
        return Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
    }

    /* JADX INFO: renamed from: i */
    public static String m152333i() {
        return "android";
    }

    /* JADX INFO: renamed from: j */
    public static String m152334j() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: k */
    public static String m152335k() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m152336l(Context context) {
        LocationManager locationManager;
        if (context == null || (locationManager = (LocationManager) context.getSystemService("location")) == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        } catch (Exception unused) {
        }
    }
}
