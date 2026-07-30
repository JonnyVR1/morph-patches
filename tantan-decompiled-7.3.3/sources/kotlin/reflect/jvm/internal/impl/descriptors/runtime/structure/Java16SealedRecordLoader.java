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
    public static Cache f65007a;

    public static final class Cache {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Method f65008a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Method f65009b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Method f65010c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final Method f65011d;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.f65008a = method;
            this.f65009b = method2;
            this.f65010c = method3;
            this.f65011d = method4;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Method m89870a() {
            return this.f65009b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Method m89871b() {
            return this.f65011d;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Method m89872c() {
            return this.f65010c;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Method m89873d() {
            return this.f65008a;
        }
    }

    private Java16SealedRecordLoader() {
    }

    /* JADX INFO: renamed from: a */
    public final Cache m89864a() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Cache m89865b() {
        Cache cache = f65007a;
        if (cache != null) {
            return cache;
        }
        Cache cacheM89864a = m89864a();
        f65007a = cacheM89864a;
        return cacheM89864a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Class<?>[] m89866c(@NotNull Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM89870a = m89865b().m89870a();
        if (methodM89870a == null) {
            return null;
        }
        Object objInvoke = methodM89870a.invoke(cls, null);
        objInvoke.getClass();
        return (Class[]) objInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object[] m89867d(@NotNull Class<?> cls) {
        cls.getClass();
        Method methodM89871b = m89865b().m89871b();
        if (methodM89871b == null) {
            return null;
        }
        return (Object[]) methodM89871b.invoke(cls, null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Boolean m89868e(@NotNull Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM89872c = m89865b().m89872c();
        if (methodM89872c == null) {
            return null;
        }
        Object objInvoke = methodM89872c.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Boolean m89869f(@NotNull Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method methodM89873d = m89865b().m89873d();
        if (methodM89873d == null) {
            return null;
        }
        Object objInvoke = methodM89873d.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }
}
