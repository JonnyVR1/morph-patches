package kotlin.collections.builders;

import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0016\u0010\u001c\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u0016\u0010\u001d\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016R\u001b\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m88121d2 = {"Lkotlin/collections/builders/MapBuilderValues;", p7f.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlin/collections/AbstractMutableCollection;", "backing", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "size", "", "getSize", "()I", "isEmpty", "", "contains", "element", "(Ljava/lang/Object;)Z", "add", "addAll", "elements", "", BLiveResOperation.clear, "", "iterator", "", Action.remove, "removeAll", "retainAll", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MapBuilderValues<V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {

    @NotNull
    private final MapBuilder<?, V> backing;

    public MapBuilderValues(@NotNull MapBuilder<?, V> mapBuilder) {
        mapBuilder.getClass();
        this.backing = mapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean add(V element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> elements) {
        elements.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object element) {
        return this.backing.containsValue(element);
    }

    @NotNull
    public final MapBuilder<?, V> getBacking() {
        return this.backing;
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return this.backing.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object element) {
        return this.backing.removeValue$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        elements.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        elements.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
