package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Java16RecordComponentsLoader {

    @NotNull
    public static final Java16RecordComponentsLoader INSTANCE = new Java16RecordComponentsLoader();

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Cache f64330a;

    public static final class Cache {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Method f64331a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Method f64332b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f64331a = method;
            this.f64332b = method2;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Method m88971a() {
            return this.f64332b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Method m88972b() {
            return this.f64331a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Cache m88967a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Cache m88968b(Object obj) {
        Cache cache = f64330a;
        if (cache != null) {
            return cache;
        }
        Cache cacheM88967a = m88967a(obj);
        f64330a = cacheM88967a;
        return cacheM88967a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Method m88969c(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method methodM88971a = m88968b(obj).m88971a();
        if (methodM88971a == null) {
            return null;
        }
        Object objInvoke = methodM88971a.invoke(obj, null);
        objInvoke.getClass();
        return (Method) objInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Class<?> m88970d(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method methodM88972b = m88968b(obj).m88972b();
        if (methodM88972b == null) {
            return null;
        }
        Object objInvoke = methodM88972b.invoke(obj, null);
        objInvoke.getClass();
        return (Class) objInvoke;
    }
}
