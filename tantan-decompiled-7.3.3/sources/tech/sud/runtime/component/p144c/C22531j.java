package tech.sud.runtime.component.p144c;

import java.lang.reflect.Method;
import tech.sud.runtime.component.p149h.C22550f;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.j */
/* JADX INFO: loaded from: classes3.dex */
public class C22531j {

    /* JADX INFO: renamed from: a */
    private static Method f208591a;

    /* JADX INFO: renamed from: b */
    private static C22531j f208592b;

    private C22531j() {
        f208591a = m222981a(m222983b("android.os.SystemProperties"));
    }

    /* JADX INFO: renamed from: a */
    public static C22531j m222982a() {
        if (f208592b == null) {
            synchronized (C22531j.class) {
                try {
                    if (f208592b == null) {
                        f208592b = new C22531j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f208592b;
    }

    /* JADX INFO: renamed from: b */
    private Class m222983b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            C22550f.m223106e("SystemProperties", e.getMessage());
            try {
                return ClassLoader.getSystemClassLoader().loadClass(str);
            } catch (ClassNotFoundException e2) {
                C22550f.m223106e("SystemProperties", e2.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Method m222981a(Class cls) {
        if (cls != null) {
            try {
                return cls.getMethod("get", String.class);
            } catch (Exception e) {
                C22550f.m223106e("SystemProperties", e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m222984a(String str) {
        if (str == null) {
            return "";
        }
        try {
            Method method = f208591a;
            String str2 = (String) (method != null ? method.invoke(null, str) : null);
            return str2 != null ? str2.trim() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
