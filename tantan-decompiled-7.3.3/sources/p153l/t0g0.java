package p153l;

import android.content.Context;
import android.text.TextUtils;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecInitListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class t0g0 {

    /* JADX INFO: renamed from: a */
    public static int f171504a = 1981886512;

    /* JADX INFO: renamed from: b */
    public static int f171505b = -1773006078;

    /* JADX INFO: renamed from: c */
    private static String f171506c = "";

    /* JADX INFO: renamed from: d */
    private static boolean f171507d = false;

    /* JADX INFO: renamed from: e */
    private static Class<?> f171508e;

    /* JADX INFO: renamed from: f */
    private static Class<?> f171509f;

    /* JADX INFO: renamed from: g */
    private static Object f171510g;

    /* JADX INFO: renamed from: h */
    private static Method f171511h;

    /* JADX INFO: renamed from: i */
    private static Method f171512i;

    /* JADX INFO: renamed from: l.t0g0$a */
    public static class C20202a {

        /* JADX INFO: renamed from: a */
        public static int f171513a = 4;

        /* JADX INFO: renamed from: b */
        public static int f171514b = 7;

        /* JADX INFO: renamed from: c */
        public static int f171515c = 8;

        /* JADX INFO: renamed from: d */
        public static int f171516d = 9;

        /* JADX INFO: renamed from: e */
        public static int f171517e = 11;

        /* JADX INFO: renamed from: f */
        public static int f171518f = 12;

        /* JADX INFO: renamed from: g */
        public static int f171519g = 13;

        /* JADX INFO: renamed from: h */
        public static int f171520h = 14;

        /* JADX INFO: renamed from: i */
        public static int f171521i = 15;

        /* JADX INFO: renamed from: j */
        public static int f171522j = 16;
    }

    /* JADX INFO: renamed from: a */
    public static String m188738a(String str) {
        Class<?> cls = f171508e;
        if (cls == null || f171510g == null) {
            return "";
        }
        try {
            Object objInvoke = cls.getMethod("getDeviceToken", String.class).invoke(f171510g, str);
            if (objInvoke == null) {
                return "";
            }
            Class<?> cls2 = objInvoke.getClass();
            int iIntValue = ((Integer) cls2.getField("code").get(objInvoke)).intValue();
            String strValueOf = String.valueOf(cls2.getField("token").get(objInvoke));
            return (10000 == iIntValue || !strValueOf.isEmpty()) ? strValueOf : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m188739b() {
        return f171506c;
    }

    /* JADX INFO: renamed from: c */
    private static void m188740c() {
        Class<?> cls;
        Class<?> cls2;
        try {
            cls = FaceSecDevice.class;
            int i = FaceSecDevice.NO_UNIQUE_DEVICE_DATA;
            cls2 = FaceSecInitListener.class;
        } catch (ClassNotFoundException unused) {
            cls = null;
            try {
                cls = Class.forName("net.security.device.api.SecurityDevice");
                cls2 = Class.forName("net.security.device.api.SecurityInitListener");
            } catch (ClassNotFoundException unused2) {
                cls2 = null;
            }
        }
        f171508e = cls;
        f171509f = cls2;
        if (cls == null) {
            return;
        }
        try {
            f171510g = cls.getMethod("getInstance", null).invoke(null, null);
            f171512i = f171508e.getMethod("lx", null);
            f171511h = f171508e.getMethod("lp", Integer.TYPE, String.class);
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m188741d(Context context, boolean z, String str, String str2) {
        Class<?> cls;
        if (!f171507d) {
            m188740c();
            f171507d = true;
        }
        Class<?> cls2 = f171508e;
        if (cls2 == null || (cls = f171509f) == null || context == null || f171510g == null) {
            return;
        }
        try {
            try {
                Method method = cls2.getMethod("initWithOptions", Context.class, String.class, Map.class, cls);
                HashMap map = new HashMap();
                if (z) {
                    map.put("IPv6", "1");
                }
                if (str != null && !TextUtils.isEmpty(str)) {
                    map.put("CustomUrl", str);
                }
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    map.put("CustomHost", str2);
                }
                o6r0.m166282b("SsExt", "initFG, options: " + map);
                method.invoke(f171510g, context, "sg0d3d5c88gs63b9234b6c736741ac66", map, null);
            } catch (Throwable unused) {
                f171508e.getMethod("init", Context.class, String.class, f171509f).invoke(f171510g, context, "sg0d3d5c88gs63b9234b6c736741ac66", null);
            }
        } catch (Throwable unused2) {
        }
        try {
            f171506c = (String) f171508e.getMethod("getVersion", null).invoke(f171510g, null);
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m188742e(int i, String str) {
        Method method;
        Object obj = f171510g;
        if (obj == null || (method = f171511h) == null) {
            return;
        }
        try {
            method.invoke(obj, Integer.valueOf(i), str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m188743f() {
        Method method;
        Object obj = f171510g;
        if (obj == null || (method = f171512i) == null) {
            return;
        }
        try {
            method.invoke(obj, null);
        } catch (Throwable unused) {
        }
    }
}
