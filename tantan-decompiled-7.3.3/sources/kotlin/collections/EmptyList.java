package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.yze;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0011\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u0011\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0010H\u0096\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0096\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m88121d2 = {"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "serialVersionUID", "", "equals", "", "other", "", "hashCode", "", "toString", "", "size", "getSize", "()I", "isEmpty", "contains", "element", "containsAll", "elements", "", "get", FirebaseAnalytics.Param.INDEX, "indexOf", "lastIndexOf", "iterator", "", "listIterator", "", "subList", "fromIndex", "toIndex", "readResolve", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class EmptyList implements List, Serializable, RandomAccess, KMappedMarker {

    @NotNull
    public static final EmptyList INSTANCE = new EmptyList();
    private static final long serialVersionUID = -7390468764508069838L;

    private EmptyList() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return contains((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection elements) {
        elements.getClass();
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object other) {
        return (other instanceof List) && ((List) other).isEmpty();
    }

    @Override // java.util.List
    @NotNull
    public Void get(int index) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + index + '.');
    }

    public int getSize() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return indexOf((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return lastIndexOf((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator listIterator(int index) {
        if (index == 0) {
            return EmptyIterator.INSTANCE;
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == 0) {
            return this;
        }
        yze.m218021a("fromIndex: ", fromIndex, ", toIndex: ", toIndex);
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) CollectionToArray.m88367b(this, tArr);
    }

    @NotNull
    public String toString() {
        return WeJson.EMPTY_ARR;
    }

    public void add(int i, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Void remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void set(int i, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m88366a(this);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Void element) {
        element.getClass();
        return false;
    }

    public int indexOf(@NotNull Void element) {
        element.getClass();
        return -1;
    }

    public int lastIndexOf(@NotNull Void element) {
        element.getClass();
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator listIterator() {
        return EmptyIterator.INSTANCE;
    }
}
