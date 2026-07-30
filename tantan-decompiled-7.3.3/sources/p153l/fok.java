package p153l;

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
import p153l.mqk;
import p153l.ztf0;

/* JADX INFO: loaded from: classes13.dex */
public class fok<E extends mqk & ztf0> implements List<E> {

    /* JADX INFO: renamed from: a */
    public List<E> f100066a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m126465a(Map map, String str, String str2) {
        return ((mqk) map.get(str)).mo113884X1() - ((mqk) map.get(str2)).mo113884X1();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m126466c(mqk mqkVar, mqk mqkVar2) {
        if (mqkVar.isFirst()) {
            return -1;
        }
        if (mqkVar2.isFirst()) {
            return 1;
        }
        return ((ztf0) mqkVar).getOrder() - ((ztf0) mqkVar2).getOrder();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m126467f(Map map, Map map2, mqk mqkVar) {
        if (map.containsKey(mqkVar.mo113886r1())) {
            mqk mqkVar2 = (mqk) map.get(mqkVar.mo113886r1());
            if (((ztf0) mqkVar2).getOrder() > ((ztf0) mqkVar).getOrder()) {
                mqkVar2.mo113892z0(false);
                mqkVar.mo113892z0(true);
                map.put(mqkVar.mo113886r1(), mqkVar);
            }
        } else {
            map.put(mqkVar.mo113886r1(), mqkVar);
            mqkVar.mo113892z0(true);
        }
        if (map2.containsKey(mqkVar.mo113886r1())) {
            ((List) map2.get(mqkVar.mo113886r1())).add(mqkVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(mqkVar);
        map2.put(mqkVar.mo113886r1(), arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        boolean zAddAll = this.f100066a.addAll(collection);
        m126472l();
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f100066a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        return this.f100066a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f100066a.containsAll(collection);
    }

    @Override // java.lang.Iterable
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public void forEach(Consumer<? super E> consumer) {
        this.f100066a.forEach(consumer);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void add(int i, E e) {
        this.f100066a.add(i, e);
        m126472l();
    }

    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(E e) {
        boolean zAdd = this.f100066a.add(e);
        m126472l();
        return zAdd;
    }

    @Override // java.util.List
    public int indexOf(@Nullable Object obj) {
        return this.f100066a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f100066a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    public Iterator<E> iterator() {
        return this.f100066a.iterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public E get(int i) {
        return this.f100066a.get(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m126472l() {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        jyb.m147537z(this.f100066a, new y20() { // from class: l.bok
            @Override // p153l.y20
            public final void call(Object obj) {
                fok.m126467f(map2, map, (mqk) obj);
            }
        });
        this.f100066a.clear();
        ArrayList arrayList = new ArrayList(map2.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: l.cok
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fok.m126465a(map2, (String) obj, (String) obj2);
            }
        });
        jyb.m147537z(arrayList, new y20() { // from class: l.dok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89966a.m126473o(map, (String) obj);
            }
        });
    }

    @Override // java.util.List
    public int lastIndexOf(@Nullable Object obj) {
        return this.f100066a.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NonNull
    public ListIterator<E> listIterator() {
        return this.f100066a.listIterator();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m126473o(Map map, String str) {
        List list = (List) map.get(str);
        Collections.sort(list, new Comparator() { // from class: l.eok
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fok.m126466c((mqk) obj, (mqk) obj2);
            }
        });
        this.f100066a.addAll(list);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public E remove(int i) {
        E eRemove = this.f100066a.remove(i);
        m126472l();
        return eRemove;
    }

    @Override // java.util.Collection
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public Stream<E> parallelStream() {
        return this.f100066a.parallelStream();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public E set(int i, E e) {
        E e2 = this.f100066a.set(i, e);
        m126472l();
        return e2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        boolean zRemove = this.f100066a.remove(obj);
        m126472l();
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f100066a.removeAll(collection);
    }

    @Override // java.util.Collection
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public boolean removeIf(Predicate<? super E> predicate) {
        boolean zRemoveIf = this.f100066a.removeIf(predicate);
        m126472l();
        return zRemoveIf;
    }

    @Override // java.util.List
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public void replaceAll(@NonNull UnaryOperator<E> unaryOperator) {
        this.f100066a.replaceAll(unaryOperator);
        m126472l();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean zRetainAll = this.f100066a.retainAll(collection);
        m126472l();
        return zRetainAll;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f100066a.size();
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
        return this.f100066a.spliterator();
    }

    @Override // java.util.Collection
    @RequiresApi(api = 24)
    @SuppressLint({"NewApi"})
    public Stream<E> stream() {
        return this.f100066a.stream();
    }

    @Override // java.util.List
    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f100066a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    @Nullable
    public Object[] toArray() {
        return this.f100066a.toArray();
    }

    @Override // java.util.List
    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f100066a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(@Nullable T[] tArr) {
        return (T[]) this.f100066a.toArray(tArr);
    }

    @Override // java.util.List
    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        boolean zAddAll = this.f100066a.addAll(i, collection);
        m126472l();
        return zAddAll;
    }
}
