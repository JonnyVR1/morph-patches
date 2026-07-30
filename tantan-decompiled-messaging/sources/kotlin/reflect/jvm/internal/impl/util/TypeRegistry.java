package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import p149l.rej0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, Integer> f66430a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicInteger f66431b = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static final int m93164g(TypeRegistry typeRegistry, String str) {
        str.getClass();
        return typeRegistry.f66431b.getAndIncrement();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, Integer> m93165b() {
        return this.f66430a;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo92707c(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> m93166d(@NotNull KClass<KK> kClass) {
        kClass.getClass();
        return new NullableArrayMapAccessor<>(m93168f(kClass));
    }

    /* JADX INFO: renamed from: e */
    public final int m93167e(@NotNull String str) {
        str.getClass();
        return mo92707c(this.f66430a, str, new rej0(this));
    }

    /* JADX INFO: renamed from: f */
    public final <T extends K> int m93168f(@NotNull KClass<T> kClass) {
        kClass.getClass();
        String strMo87470r = kClass.mo87470r();
        strMo87470r.getClass();
        return m93167e(strMo87470r);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Collection<Integer> m93169h() {
        Collection<Integer> collectionValues = this.f66430a.values();
        collectionValues.getClass();
        return collectionValues;
    }
}
