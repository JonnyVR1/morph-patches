package p149l;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import p149l.qlf0;
import p149l.wnk;

/* JADX INFO: loaded from: classes13.dex */
public class plk<E extends wnk & qlf0> implements List<E> {

    /* JADX INFO: renamed from: a */
    public List<E> f150147a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m170222a(Map map, String str, String str2) {
        return ((wnk) map.get(str)).mo109665X1() - ((wnk) map.get(str2)).mo109665X1();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m170223c(wnk wnkVar, wnk wnkVar2) {
        if (wnkVar.isFirst()) {
            return -1;
        }
        if (wnkVar2.isFirst()) {
            return 1;
        }
        return ((qlf0) wnkVar).getOrder() - ((qlf0) wnkVar2).getOrder();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m170224f(Map map, Map map2, wnk wnkVar) {
        if (map.containsKey(wnkVar.mo109668r1())) {
            wnk wnkVar2 = (wnk) map.get(wnkVar.mo109668r1());
            if (((qlf0) wnkVar2).getOrder() > ((qlf0) wnkVar).getOrder()) {
                wnkVar2.mo109674z0(false);
                wnkVar.mo109674z0(true);
                map.put(wnkVar.mo109668r1(), wnkVar);
            }
        } else {
            map.put(wnkVar.mo109668r1(), wnkVar);
            wnkVar.mo109674z0(true);
        }
        if (map2.containsKey(wnkVar.mo109668r1())) {
            ((List) map2.get(wnkVar.mo109668r1())).add(wnkVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(wnkVar);
        map2.put(wnkVar.mo109668r1(), arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        boolean zAddAll = this.f150147a.addAll(collection);
        m170229l();
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f150147a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        return this.f150147a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f150147a.containsAll(collection);
    }

    @Override // java.lang.Iterable
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public void forEach(Consumer<? super E> consumer) {
        this.f150147a.forEach(consumer);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void add(int i, E e) {
        this.f150147a.add(i, e);
        m170229l();
    }

    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(E e) {
        boolean zAdd = this.f150147a.add(e);
        m170229l();
        return zAdd;
    }

    @Override // java.util.List
    public int indexOf(@Nullable Object obj) {
        return this.f150147a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f150147a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    public Iterator<E> iterator() {
        return this.f150147a.iterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public E get(int i) {
        return this.f150147a.get(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m170229l() {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        vwb.m200354z(this.f150147a, new e30() { // from class: l.llk
            @Override // p149l.e30
            public final void call(Object obj) {
                plk.m170224f(map2, map, (wnk) obj);
            }
        });
        this.f150147a.clear();
        ArrayList arrayList = new ArrayList(map2.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: l.mlk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return plk.m170222a(map2, (String) obj, (String) obj2);
            }
        });
        vwb.m200354z(arrayList, new e30() { // from class: l.nlk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139558a.m170230o(map, (String) obj);
            }
        });
    }

    @Override // java.util.List
    public int lastIndexOf(@Nullable Object obj) {
        return this.f150147a.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NonNull
    public ListIterator<E> listIterator() {
        return this.f150147a.listIterator();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m170230o(Map map, String str) {
        List list = (List) map.get(str);
        Collections.sort(list, new Comparator() { // from class: l.olk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return plk.m170223c((wnk) obj, (wnk) obj2);
            }
        });
        this.f150147a.addAll(list);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public E remove(int i) {
        E eRemove = this.f150147a.remove(i);
        m170229l();
        return eRemove;
    }

    @Override // java.util.Collection
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public Stream<E> parallelStream() {
        return this.f150147a.parallelStream();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public E set(int i, E e) {
        E e2 = this.f150147a.set(i, e);
        m170229l();
        return e2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        boolean zRemove = this.f150147a.remove(obj);
        m170229l();
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f150147a.removeAll(collection);
    }

    @Override // java.util.Collection
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public boolean removeIf(Predicate<? super E> predicate) {
        boolean zRemoveIf = this.f150147a.removeIf(predicate);
        m170229l();
        return zRemoveIf;
    }

    @Override // java.util.List
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public void replaceAll(@NonNull UnaryOperator<E> unaryOperator) {
        this.f150147a.replaceAll(unaryOperator);
        m170229l();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean zRetainAll = this.f150147a.retainAll(collection);
        m170229l();
        return zRetainAll;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f150147a.size();
    }

    @Override // java.util.List
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public void sort(@Nullable Comparator<? super E> comparator) {
        throw new IllegalStateException("GroupSortList sort elements by self");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public Spliterator<E> spliterator() {
        return this.f150147a.spliterator();
    }

    @Override // java.util.Collection
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public Stream<E> stream() {
        return this.f150147a.stream();
    }

    @Override // java.util.List
    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f150147a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    @Nullable
    public Object[] toArray() {
        return this.f150147a.toArray();
    }

    @Override // java.util.List
    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f150147a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(@Nullable T[] tArr) {
        return (T[]) this.f150147a.toArray(tArr);
    }

    @Override // java.util.List
    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        boolean zAddAll = this.f150147a.addAll(i, collection);
        m170229l();
        return zAddAll;
    }
}
