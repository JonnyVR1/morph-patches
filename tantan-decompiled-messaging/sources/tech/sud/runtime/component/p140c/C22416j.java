package tech.sud.runtime.component.p140c;

import java.lang.reflect.Method;
import tech.sud.runtime.component.p145h.C22435f;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.j */
/* JADX INFO: loaded from: classes3.dex */
public class C22416j {

    /* JADX INFO: renamed from: a */
    private static Method f207669a;

    /* JADX INFO: renamed from: b */
    private static C22416j f207670b;

    private C22416j() {
        f207669a = m221735a(m221737b("android.os.SystemProperties"));
    }

    /* JADX INFO: renamed from: a */
    public static C22416j m221736a() {
        if (f207670b == null) {
            synchronized (C22416j.class) {
                try {
                    if (f207670b == null) {
                        f207670b = new C22416j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f207670b;
    }

    /* JADX INFO: renamed from: b */
    private Class m221737b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            C22435f.m221860e("SystemProperties", e.getMessage());
            try {
                return ClassLoader.getSystemClassLoader().loadClass(str);
            } catch (ClassNotFoundException e2) {
                C22435f.m221860e("SystemProperties", e2.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Method m221735a(Class cls) {
        if (cls != null) {
            try {
                return cls.getMethod("get", String.class);
            } catch (Exception e) {
                C22435f.m221860e("SystemProperties", e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m221738a(String str) {
        if (str == null) {
            return "";
        }
        try {
            Method method = f207669a;
            String str2 = (String) (method != null ? method.invoke(null, str) : null);
            return str2 != null ? str2.trim() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
