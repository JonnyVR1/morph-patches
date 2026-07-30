package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a */
        public final int f66350a;

        public AbstractArrayMapAccessor(int i) {
            this.f66350a = i;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final T m93125c(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner) {
            abstractArrayMapOwner.getClass();
            return abstractArrayMapOwner.mo93122a().get(this.f66350a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract ArrayMap<V> mo93122a();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract TypeRegistry<K, V> mo92700c();

    /* JADX INFO: renamed from: f */
    public abstract void mo93123f(@NotNull String str, @NotNull V v2);

    /* JADX INFO: renamed from: g */
    public final void m93124g(@NotNull KClass<? extends K> kClass, @NotNull V v2) {
        kClass.getClass();
        v2.getClass();
        String strMo87470r = kClass.mo87470r();
        strMo87470r.getClass();
        mo93123f(strMo87470r, v2);
    }

    public final boolean isEmpty() {
        return mo93122a().mo93128a() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return mo93122a().iterator();
    }
}
