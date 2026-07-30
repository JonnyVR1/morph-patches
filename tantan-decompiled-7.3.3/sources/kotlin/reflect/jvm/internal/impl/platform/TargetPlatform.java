package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class TargetPlatform implements Collection<SimplePlatform>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Set<SimplePlatform> f66286a;

    /* JADX INFO: renamed from: a */
    public boolean m92021a(@NotNull SimplePlatform simplePlatform) {
        simplePlatform.getClass();
        return this.f66286a.contains(simplePlatform);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(SimplePlatform simplePlatform) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<SimplePlatform> m92022c() {
        return this.f66286a;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return m92021a((SimplePlatform) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        collection.getClass();
        return this.f66286a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetPlatform) && Intrinsics.m88377d(this.f66286a, ((TargetPlatform) obj).f66286a);
    }

    /* JADX INFO: renamed from: f */
    public int m92023f() {
        return this.f66286a.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f66286a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f66286a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<SimplePlatform> iterator() {
        return this.f66286a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super SimplePlatform> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m92023f();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) CollectionToArray.m88367b(this, tArr);
    }

    @NotNull
    public String toString() {
        return PlatformUtilKt.m92018a(this);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m88366a(this);
    }
}
