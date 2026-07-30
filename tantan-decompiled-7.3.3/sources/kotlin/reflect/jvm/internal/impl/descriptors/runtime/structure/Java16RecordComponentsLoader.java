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
    public static Cache f65004a;

    public static final class Cache {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Method f65005a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Method f65006b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f65005a = method;
            this.f65006b = method2;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Method m89862a() {
            return this.f65006b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Method m89863b() {
            return this.f65005a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Cache m89858a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Cache m89859b(Object obj) {
        Cache cache = f65004a;
        if (cache != null) {
            return cache;
        }
        Cache cacheM89858a = m89858a(obj);
        f65004a = cacheM89858a;
        return cacheM89858a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Method m89860c(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method methodM89862a = m89859b(obj).m89862a();
        if (methodM89862a == null) {
            return null;
        }
        Object objInvoke = methodM89862a.invoke(obj, null);
        objInvoke.getClass();
        return (Method) objInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Class<?> m89861d(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method methodM89863b = m89859b(obj).m89863b();
        if (methodM89863b == null) {
            return null;
        }
        Object objInvoke = methodM89863b.invoke(obj, null);
        objInvoke.getClass();
        return (Class) objInvoke;
    }
}
