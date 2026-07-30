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
    public final Set<SimplePlatform> f65612a;

    /* JADX INFO: renamed from: a */
    public boolean m91130a(@NotNull SimplePlatform simplePlatform) {
        simplePlatform.getClass();
        return this.f65612a.contains(simplePlatform);
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
    public final Set<SimplePlatform> m91131c() {
        return this.f65612a;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return m91130a((SimplePlatform) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        collection.getClass();
        return this.f65612a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetPlatform) && Intrinsics.m87488d(this.f65612a, ((TargetPlatform) obj).f65612a);
    }

    /* JADX INFO: renamed from: f */
    public int m91132f() {
        return this.f65612a.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f65612a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f65612a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<SimplePlatform> iterator() {
        return this.f65612a.iterator();
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
        return m91132f();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) CollectionToArray.m87478b(this, tArr);
    }

    @NotNull
    public String toString() {
        return PlatformUtilKt.m91127a(this);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m87477a(this);
    }
}
