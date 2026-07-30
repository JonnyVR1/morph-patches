package androidx.fragment.app;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import p149l.hgf0;
import p149l.p2j;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public class C0421e {
    private static final hgf0<ClassLoader, hgf0<String, Class<?>>> sClassCacheMap = new hgf0<>();

    public static boolean isFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> loadClass(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        hgf0<ClassLoader, hgf0<String, Class<?>>> hgf0Var = sClassCacheMap;
        hgf0<String, Class<?>> hgf0Var2 = hgf0Var.get(classLoader);
        if (hgf0Var2 == null) {
            hgf0Var2 = new hgf0<>();
            hgf0Var.put(classLoader, hgf0Var2);
        }
        Class<?> cls = hgf0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        hgf0Var2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> loadFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e) {
            p2j.m167181a(str, ": make sure class is a valid subclass of Fragment", e);
            return null;
        } catch (ClassNotFoundException e2) {
            p2j.m167181a(str, ": make sure class name exists", e2);
            return null;
        }
    }

    @NonNull
    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            p2j.m167181a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (InstantiationException e2) {
            p2j.m167181a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            p2j.m167181a(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            p2j.m167181a(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }
}
