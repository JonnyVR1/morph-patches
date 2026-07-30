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
        public final int f67024a;

        public AbstractArrayMapAccessor(int i) {
            this.f67024a = i;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final T m94016c(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner) {
            abstractArrayMapOwner.getClass();
            return abstractArrayMapOwner.mo94013a().get(this.f67024a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract ArrayMap<V> mo94013a();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract TypeRegistry<K, V> mo93591c();

    /* JADX INFO: renamed from: f */
    public abstract void mo94014f(@NotNull String str, @NotNull V v2);

    /* JADX INFO: renamed from: g */
    public final void m94015g(@NotNull KClass<? extends K> kClass, @NotNull V v2) {
        kClass.getClass();
        v2.getClass();
        String strMo88359r = kClass.mo88359r();
        strMo88359r.getClass();
        mo94014f(strMo88359r, v2);
    }

    public final boolean isEmpty() {
        return mo94013a().mo94019a() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return mo94013a().iterator();
    }
}
