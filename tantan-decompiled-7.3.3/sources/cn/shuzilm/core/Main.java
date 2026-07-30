package cn.shuzilm.core;

import android.content.Context;
import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Main {

    /* JADX INFO: renamed from: a */
    private static String f3759a;

    public static void getDeviceLabel(int i, Listener listener) {
        DUHelper.f2c071(i, listener);
    }

    public static void getHMSOpenAnmsID(Context context, Listener listener) {
        DUHelper.ZVTFJRA(context, listener, 1, true);
    }

    public static void getNetCode(Context context, Listener listener) {
        DUHelper.m4753m(context, 2, listener);
    }

    public static void getOpenAnmsID(Context context, Listener listener) {
        DUHelper.ZVTFJRA(context, listener, 0, true);
    }

    @Deprecated
    public static void getQueryID(Context context, String str, String str2, int i, Listener listener) {
        f3759a = str;
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        DUHelper.getQueryID(context, str, str2, true, i, listener, 2);
    }

    public static String getSupplementalID(Context context, int i) {
        return DUHelper.m4757s(context, i);
    }

    public static String getTraceInfo(Context context) {
        return DUHelper.m4754n(context);
    }

    public static String getVersion() {
        return "v8.8.4";
    }

    @Deprecated
    public static void init(Context context, String str) {
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        DUHelper.init(context, str, true);
    }

    public static Map onEvent(Context context, String str, String str2, int i, Listener listener) {
        try {
            return DUHelper.onEvent(context, str, str2, i, listener);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void report(Context context, String str, String str2) {
        try {
            DUHelper.report(context, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int setConfig(String str, String str2) {
        try {
            return DUHelper.setConfig(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int setData(String str, String str2) {
        try {
            return DUHelper.setData(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void init(Context context, String str, boolean z) {
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        DUHelper.init(context, str, z);
    }

    public static String getQueryID(Context context, String str, String str2, boolean z) {
        try {
            f3759a = str;
            return DUHelper.getQueryID(context, str, str2, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static String getQueryID(Context context, String str, String str2) {
        try {
            f3759a = str;
            return DUHelper.getQueryID(context, str, str2, true);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void getQueryID(Context context, String str, String str2, boolean z, Listener listener) {
        f3759a = str;
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        DUHelper.getQueryID(context, str, str2, z, 1, listener, 2);
    }
}
