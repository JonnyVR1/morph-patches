package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import p153l.vnj0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, Integer> f67104a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicInteger f67105b = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static final int m94055g(TypeRegistry typeRegistry, String str) {
        str.getClass();
        return typeRegistry.f67105b.getAndIncrement();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, Integer> m94056b() {
        return this.f67104a;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo93598c(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> m94057d(@NotNull KClass<KK> kClass) {
        kClass.getClass();
        return new NullableArrayMapAccessor<>(m94059f(kClass));
    }

    /* JADX INFO: renamed from: e */
    public final int m94058e(@NotNull String str) {
        str.getClass();
        return mo93598c(this.f67104a, str, new vnj0(this));
    }

    /* JADX INFO: renamed from: f */
    public final <T extends K> int m94059f(@NotNull KClass<T> kClass) {
        kClass.getClass();
        String strMo88359r = kClass.mo88359r();
        strMo88359r.getClass();
        return m94058e(strMo88359r);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Collection<Integer> m94060h() {
        Collection<Integer> collectionValues = this.f67104a.values();
        collectionValues.getClass();
        return collectionValues;
    }
}
