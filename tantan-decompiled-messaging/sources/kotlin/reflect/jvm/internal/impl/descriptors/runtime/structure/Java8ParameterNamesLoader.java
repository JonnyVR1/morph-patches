package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class Java8ParameterNamesLoader {

    @NotNull
    public static final Java8ParameterNamesLoader INSTANCE = new Java8ParameterNamesLoader();

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Cache f64338a;

    public static final class Cache {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Method f64339a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Method f64340b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f64339a = method;
            this.f64340b = method2;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Method m88985a() {
            return this.f64340b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Method m88986b() {
            return this.f64339a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Cache m88983a(@NotNull Member member) {
        member.getClass();
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", null), ReflectClassUtilKt.m88996j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<String> m88984b(@NotNull Member member) {
        Method methodM88985a;
        member.getClass();
        Cache cacheM88983a = f64338a;
        if (cacheM88983a == null) {
            synchronized (this) {
                cacheM88983a = f64338a;
                if (cacheM88983a == null) {
                    cacheM88983a = INSTANCE.m88983a(member);
                    f64338a = cacheM88983a;
                }
            }
        }
        Method methodM88986b = cacheM88983a.m88986b();
        if (methodM88986b == null || (methodM88985a = cacheM88983a.m88985a()) == null) {
            return null;
        }
        Object objInvoke = methodM88986b.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodM88985a.invoke(obj, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
