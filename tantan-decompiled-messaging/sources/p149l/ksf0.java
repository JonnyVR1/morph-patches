package p149l;

import android.content.Context;
import android.text.TextUtils;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecInitListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ksf0 {

    /* JADX INFO: renamed from: a */
    public static int f124454a = 1981886512;

    /* JADX INFO: renamed from: b */
    public static int f124455b = -1773006078;

    /* JADX INFO: renamed from: c */
    private static String f124456c = "";

    /* JADX INFO: renamed from: d */
    private static boolean f124457d = false;

    /* JADX INFO: renamed from: e */
    private static Class<?> f124458e;

    /* JADX INFO: renamed from: f */
    private static Class<?> f124459f;

    /* JADX INFO: renamed from: g */
    private static Object f124460g;

    /* JADX INFO: renamed from: h */
    private static Method f124461h;

    /* JADX INFO: renamed from: i */
    private static Method f124462i;

    /* JADX INFO: renamed from: l.ksf0$a */
    public static class C18071a {

        /* JADX INFO: renamed from: a */
        public static int f124463a = 4;

        /* JADX INFO: renamed from: b */
        public static int f124464b = 7;

        /* JADX INFO: renamed from: c */
        public static int f124465c = 8;

        /* JADX INFO: renamed from: d */
        public static int f124466d = 9;

        /* JADX INFO: renamed from: e */
        public static int f124467e = 11;

        /* JADX INFO: renamed from: f */
        public static int f124468f = 12;

        /* JADX INFO: renamed from: g */
        public static int f124469g = 13;

        /* JADX INFO: renamed from: h */
        public static int f124470h = 14;

        /* JADX INFO: renamed from: i */
        public static int f124471i = 15;

        /* JADX INFO: renamed from: j */
        public static int f124472j = 16;
    }

    /* JADX INFO: renamed from: a */
    public static String m147067a(String str) {
        Class<?> cls = f124458e;
        if (cls == null || f124460g == null) {
            return "";
        }
        try {
            Object objInvoke = cls.getMethod("getDeviceToken", String.class).invoke(f124460g, str);
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
    public static String m147068b() {
        return f124456c;
    }

    /* JADX INFO: renamed from: c */
    private static void m147069c() {
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
        f124458e = cls;
        f124459f = cls2;
        if (cls == null) {
            return;
        }
        try {
            f124460g = cls.getMethod("getInstance", null).invoke(null, null);
            f124462i = f124458e.getMethod("lx", null);
            f124461h = f124458e.getMethod("lp", Integer.TYPE, String.class);
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m147070d(Context context, boolean z, String str, String str2) {
        Class<?> cls;
        if (!f124457d) {
            m147069c();
            f124457d = true;
        }
        Class<?> cls2 = f124458e;
        if (cls2 == null || (cls = f124459f) == null || context == null || f124460g == null) {
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
                ixq0.m138885b("SsExt", "initFG, options: " + map);
                method.invoke(f124460g, context, "sg0d3d5c88gs63b9234b6c736741ac66", map, null);
            } catch (Throwable unused) {
                f124458e.getMethod("init", Context.class, String.class, f124459f).invoke(f124460g, context, "sg0d3d5c88gs63b9234b6c736741ac66", null);
            }
        } catch (Throwable unused2) {
        }
        try {
            f124456c = (String) f124458e.getMethod("getVersion", null).invoke(f124460g, null);
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m147071e(int i, String str) {
        Method method;
        Object obj = f124460g;
        if (obj == null || (method = f124461h) == null) {
            return;
        }
        try {
            method.invoke(obj, Integer.valueOf(i), str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m147072f() {
        Method method;
        Object obj = f124460g;
        if (obj == null || (method = f124462i) == null) {
            return;
        }
        try {
            method.invoke(obj, null);
        } catch (Throwable unused) {
        }
    }
}
