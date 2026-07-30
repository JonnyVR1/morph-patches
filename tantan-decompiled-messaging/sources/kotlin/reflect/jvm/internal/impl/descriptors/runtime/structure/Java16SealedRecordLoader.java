package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Java16SealedRecordLoader {

    @NotNull
    public static final Java16SealedRecordLoader INSTANCE = new Java16SealedRecordLoader();

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Cache f64333a;

    public static final class Cache {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Method f64334a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Method f64335b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Method f64336c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final Method f64337d;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.f64334a = method;
            this.f64335b = method2;
            this.f64336c = method3;
            this.f64337d = method4;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Method m88979a() {
            return this.f64335b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Method m88980b() {
            return this.f64337d;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Method m88981c() {
            return this.f64336c;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Method m88982d() {
            return this.f64334a;
        }
    }

    private Java16SealedRecordLoader() {
    }

    /* JADX INFO: renamed from: a */
    public final Cache m88973a() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Cache m88974b() {
        Cache cache = f64333a;
        if (cache != null) {
            return cache;
        }
        Cache cacheM88973a = m88973a();
        f64333a = cacheM88973a;
        return cacheM88973a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Class<?>[] m88975c(@NotNull Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM88979a = m88974b().m88979a();
        if (methodM88979a == null) {
            return null;
        }
        Object objInvoke = methodM88979a.invoke(cls, null);
        objInvoke.getClass();
        return (Class[]) objInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object[] m88976d(@NotNull Class<?> cls) {
        cls.getClass();
        Method methodM88980b = m88974b().m88980b();
        if (methodM88980b == null) {
            return null;
        }
        return (Object[]) methodM88980b.invoke(cls, null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Boolean m88977e(@NotNull Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM88981c = m88974b().m88981c();
        if (methodM88981c == null) {
            return null;
        }
        Object objInvoke = methodM88981c.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Boolean m88978f(@NotNull Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM88982d = m88974b().m88982d();
        if (methodM88982d == null) {
            return null;
        }
        Object objInvoke = methodM88982d.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }
}
