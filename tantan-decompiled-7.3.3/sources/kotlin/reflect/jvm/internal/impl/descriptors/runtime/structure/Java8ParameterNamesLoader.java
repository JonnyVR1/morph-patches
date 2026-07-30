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
    public static Cache f65012a;

    public static final class Cache {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Method f65013a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Method f65014b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f65013a = method;
            this.f65014b = method2;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Method m89876a() {
            return this.f65014b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Method m89877b() {
            return this.f65013a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Cache m89874a(@NotNull Member member) {
        member.getClass();
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", null), ReflectClassUtilKt.m89887j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<String> m89875b(@NotNull Member member) {
        Method methodM89876a;
        member.getClass();
        Cache cacheM89874a = f65012a;
        if (cacheM89874a == null) {
            synchronized (this) {
                cacheM89874a = f65012a;
                if (cacheM89874a == null) {
                    cacheM89874a = INSTANCE.m89874a(member);
                    f65012a = cacheM89874a;
                }
            }
        }
        Method methodM89877b = cacheM89874a.m89877b();
        if (methodM89877b == null || (methodM89876a = cacheM89874a.m89876a()) == null) {
            return null;
        }
        Object objInvoke = methodM89877b.invoke(member, null);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodM89876a.invoke(obj, null);
            objInvoke2.getClass();
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
