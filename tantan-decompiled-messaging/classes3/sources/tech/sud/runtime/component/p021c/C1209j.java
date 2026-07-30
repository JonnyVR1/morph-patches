package tech.sud.runtime.component.p021c;

import java.lang.reflect.Method;
import tech.sud.runtime.component.p026h.C1228f;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.j */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1209j {

    /* JADX INFO: renamed from: a */
    private static Method f11294a;

    /* JADX INFO: renamed from: b */
    private static C1209j f11295b;

    private C1209j() {
        f11294a = m10206a(m10208b("android.os.SystemProperties"));
    }

    /* JADX INFO: renamed from: a */
    public static C1209j m10207a() {
        if (f11295b == null) {
            synchronized (C1209j.class) {
                try {
                    if (f11295b == null) {
                        f11295b = new C1209j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11295b;
    }

    /* JADX INFO: renamed from: b */
    private Class m10208b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            C1228f.m10331e("SystemProperties", e.getMessage());
            try {
                return ClassLoader.getSystemClassLoader().loadClass(str);
            } catch (ClassNotFoundException e2) {
                C1228f.m10331e("SystemProperties", e2.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Method m10206a(Class cls) {
        if (cls != null) {
            try {
                return cls.getMethod("get", String.class);
            } catch (Exception e) {
                C1228f.m10331e("SystemProperties", e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m10209a(String str) {
        if (str == null) {
            return "";
        }
        try {
            Method method = f11294a;
            String str2 = (String) (method != null ? method.invoke(null, str) : null);
            return str2 != null ? str2.trim() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
