package androidx.fragment.app;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import p153l.k5j;
import p153l.oof0;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public class C0422e {
    private static final oof0<ClassLoader, oof0<String, Class<?>>> sClassCacheMap = new oof0<>();

    public static boolean isFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> loadClass(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        oof0<ClassLoader, oof0<String, Class<?>>> oof0Var = sClassCacheMap;
        oof0<String, Class<?>> oof0Var2 = oof0Var.get(classLoader);
        if (oof0Var2 == null) {
            oof0Var2 = new oof0<>();
            oof0Var.put(classLoader, oof0Var2);
        }
        Class<?> cls = oof0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        oof0Var2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> loadFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e) {
            k5j.m148398a(str, ": make sure class is a valid subclass of Fragment", e);
            return null;
        } catch (ClassNotFoundException e2) {
            k5j.m148398a(str, ": make sure class name exists", e2);
            return null;
        }
    }

    @NonNull
    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            k5j.m148398a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (InstantiationException e2) {
            k5j.m148398a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            k5j.m148398a(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            k5j.m148398a(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }
}
