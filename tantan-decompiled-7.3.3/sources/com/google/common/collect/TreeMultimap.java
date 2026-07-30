package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import p153l.ju10;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Comparator<? super K> keyComparator;
    private transient Comparator<? super V> valueComparator;

    public TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.keyComparator = comparator;
        this.valueComparator = comparator2;
    }

    public static <K, V> TreeMultimap<K, V> create(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new TreeMultimap<>((Comparator) xn80.m212111p(comparator), (Comparator) xn80.m212111p(comparator2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyComparator = (Comparator) xn80.m212111p((Comparator) objectInputStream.readObject());
        this.valueComparator = (Comparator) xn80.m212111p((Comparator) objectInputStream.readObject());
        setMap(new TreeMap(this.keyComparator));
        C2999o.m16361d(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(keyComparator());
        objectOutputStream.writeObject(valueComparator());
        C2999o.m16367j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
    public Map<K, Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> createCollection(K k) {
        if (k == 0) {
            keyComparator().compare(k, k);
        }
        return super.createCollection(k);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public NavigableSet<V> get(K k) {
        return (NavigableSet) super.get((Object) k);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public Comparator<? super K> keyComparator() {
        return this.keyComparator;
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ InterfaceC2995k keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ SortedSet removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ SortedSet replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, p153l.cuf0
    public Comparator<? super V> valueComparator() {
        return this.valueComparator;
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(ju10 ju10Var) {
        return super.putAll(ju10Var);
    }

    private TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2, ju10<? extends K, ? extends V> ju10Var) {
        this(comparator, comparator2);
        putAll(ju10Var);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public SortedSet<V> createCollection() {
        return new TreeSet(this.valueComparator);
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create() {
        return new TreeMultimap<>(Ordering.natural(), Ordering.natural());
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create(ju10<? extends K, ? extends V> ju10Var) {
        return new TreeMultimap<>(Ordering.natural(), Ordering.natural(), ju10Var);
    }
}
