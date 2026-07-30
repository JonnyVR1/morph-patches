package p149l;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class yyd {
    /* JADX INFO: renamed from: a */
    public static boolean m216514a() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter != null && defaultAdapter.isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m216515b() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: c */
    public static String m216516c() {
        return "android";
    }

    /* JADX INFO: renamed from: d */
    public static String m216517d() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0);
        } catch (AssertionError unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m216518e() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: f */
    public static String m216519f(Context context) {
        if (context == null) {
            return "";
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: g */
    public static int m216520g(Context context) {
        int i = m216525l(context) ? 2 : 0;
        return hk60.m131459b(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? i + 1 : i;
    }

    /* JADX INFO: renamed from: h */
    public static String m216521h() {
        return Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
    }

    /* JADX INFO: renamed from: i */
    public static String m216522i() {
        return "android";
    }

    /* JADX INFO: renamed from: j */
    public static String m216523j() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: k */
    public static String m216524k() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m216525l(Context context) {
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
