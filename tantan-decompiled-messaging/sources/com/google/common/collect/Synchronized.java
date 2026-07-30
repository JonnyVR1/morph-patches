package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p149l.bm10;
import p149l.gaj;
import p149l.j050;
import p149l.rle0;
import p149l.s7j0;
import p149l.sf80;
import p149l.tlf0;
import p149l.tw2;
import p149l.ymr;
import p149l.yzi;

/* JADX INFO: loaded from: classes7.dex */
public final class Synchronized {

    public static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
        transient Collection<Collection<V>> asMapValues;

        public SynchronizedAsMap(Map<K, Collection<V>> map, Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.mutex) {
                try {
                    if (this.asMapEntrySet == null) {
                        this.asMapEntrySet = new SynchronizedAsMapEntries(delegate().entrySet(), this.mutex);
                    }
                    set = this.asMapEntrySet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collectionM16165q;
            synchronized (this.mutex) {
                Collection collection = (Collection) super.get(obj);
                collectionM16165q = collection == null ? null : Synchronized.m16165q(collection, this.mutex);
            }
            return collectionM16165q;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.mutex) {
                try {
                    if (this.asMapValues == null) {
                        this.asMapValues = new SynchronizedAsMapValues(delegate().values(), this.mutex);
                    }
                    collection = this.asMapValues;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapValues$a */
        public class C2941a extends s7j0<Collection<V>, Collection<V>> {
            public C2941a(Iterator it) {
                super(it);
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V> mo15897a(Collection<V> collection) {
                return Synchronized.m16165q(collection, SynchronizedAsMapValues.this.mutex);
            }
        }

        public SynchronizedAsMapValues(Collection<Collection<V>> collection, Object obj) {
            super(collection, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new C2941a(super.iterator());
        }
    }

    public static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements tw2<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        private transient tw2<V, K> inverse;
        private transient Set<V> valueSet;

        private SynchronizedBiMap(tw2<K, V> tw2Var, Object obj, tw2<V, K> tw2Var2) {
            super(tw2Var, obj);
            this.inverse = tw2Var2;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public tw2<K, V> delegate() {
            return (tw2) super.delegate();
        }

        @Override // p149l.tw2
        public V forcePut(K k, V v2) {
            V vForcePut;
            synchronized (this.mutex) {
                vForcePut = delegate().forcePut(k, v2);
            }
            return vForcePut;
        }

        @Override // p149l.tw2
        public tw2<V, K> inverse() {
            tw2<V, K> tw2Var;
            synchronized (this.mutex) {
                try {
                    if (this.inverse == null) {
                        this.inverse = new SynchronizedBiMap(delegate().inverse(), this.mutex, this);
                    }
                    tw2Var = this.inverse;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return tw2Var;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.mutex) {
                try {
                    if (this.valueSet == null) {
                        this.valueSet = Synchronized.m16162n(delegate().values(), this.mutex);
                    }
                    set = this.valueSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedDeque(Deque<E> deque, Object obj) {
            super(deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e) {
            synchronized (this.mutex) {
                delegate().addFirst(e);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e) {
            synchronized (this.mutex) {
                delegate().addLast(e);
            }
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Deque<E> delegate() {
            return (Deque) super.delegate();
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.mutex) {
                itDescendingIterator = delegate().descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.mutex) {
                first = delegate().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.mutex) {
                last = delegate().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e) {
            boolean zOfferFirst;
            synchronized (this.mutex) {
                zOfferFirst = delegate().offerFirst(e);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e) {
            boolean zOfferLast;
            synchronized (this.mutex) {
                zOfferLast = delegate().offerLast(e);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.mutex) {
                ePeekFirst = delegate().peekFirst();
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        public E peekLast() {
            E ePeekLast;
            synchronized (this.mutex) {
                ePeekLast = delegate().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.mutex) {
                ePollFirst = delegate().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        public E pollLast() {
            E ePollLast;
            synchronized (this.mutex) {
                ePollLast = delegate().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.mutex) {
                ePop = delegate().pop();
            }
            return ePop;
        }

        @Override // java.util.Deque
        public void push(E e) {
            synchronized (this.mutex) {
                delegate().push(e);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.mutex) {
                eRemoveFirst = delegate().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.mutex) {
                zRemoveFirstOccurrence = delegate().removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.mutex) {
                eRemoveLast = delegate().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.mutex) {
                zRemoveLastOccurrence = delegate().removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }
    }

    public static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedEntry(Map.Entry<K, V> entry, Object obj) {
            super(entry, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Map.Entry<K, V> delegate() {
            return (Map.Entry) super.delegate();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.mutex) {
                key = delegate().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.mutex) {
                value = delegate().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V value;
            synchronized (this.mutex) {
                value = delegate().setValue(v2);
            }
            return value;
        }
    }

    public static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ymr<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedListMultimap(ymr<K, V> ymrVar, Object obj) {
            super(ymrVar, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public ymr<K, V> delegate() {
            return (ymr) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public List<V> get(K k) {
            List<V> listM16156h;
            synchronized (this.mutex) {
                listM16156h = Synchronized.m16156h(delegate().get((Object) k), this.mutex);
            }
            return listM16156h;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public List<V> removeAll(Object obj) {
            List<V> listRemoveAll;
            synchronized (this.mutex) {
                listRemoveAll = delegate().removeAll(obj);
            }
            return listRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            List<V> listReplaceValues;
            synchronized (this.mutex) {
                listReplaceValues = delegate().replaceValues((Object) k, (Iterable) iterable);
            }
            return listReplaceValues;
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;
        transient Set<Map.Entry<K, V>> entrySet;
        transient Set<K> keySet;
        transient Collection<V> values;

        public SynchronizedMap(Map<K, V> map, Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.mutex) {
                zContainsKey = delegate().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Map<K, V> delegate() {
            return (Map) super.delegate();
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                try {
                    if (this.entrySet == null) {
                        this.entrySet = Synchronized.m16162n(delegate().entrySet(), this.mutex);
                    }
                    set = this.entrySet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        public V get(Object obj) {
            V v2;
            synchronized (this.mutex) {
                v2 = delegate().get(obj);
            }
            return v2;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                try {
                    if (this.keySet == null) {
                        this.keySet = Synchronized.m16162n(delegate().keySet(), this.mutex);
                    }
                    set = this.keySet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k, V v2) {
            V vPut;
            synchronized (this.mutex) {
                vPut = delegate().put(k, v2);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                delegate().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            V vRemove;
            synchronized (this.mutex) {
                vRemove = delegate().remove(obj);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                try {
                    if (this.values == null) {
                        this.values = Synchronized.m16155g(delegate().values(), this.mutex);
                    }
                    collection = this.values;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static class SynchronizedObject implements Serializable {
        private static final long serialVersionUID = 0;
        final Object delegate;
        final Object mutex;

        public SynchronizedObject(Object obj, Object obj2) {
            this.delegate = sf80.m183894p(obj);
            this.mutex = obj2 == null ? this : obj2;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public Object delegate() {
            return this.delegate;
        }

        public String toString() {
            String string;
            synchronized (this.mutex) {
                string = this.delegate.toString();
            }
            return string;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedQueue(Queue<E> queue, Object obj) {
            super(queue, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Queue<E> delegate() {
            return (Queue) super.delegate();
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.mutex) {
                eElement = delegate().element();
            }
            return eElement;
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
            boolean zOffer;
            synchronized (this.mutex) {
                zOffer = delegate().offer(e);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public E peek() {
            E ePeek;
            synchronized (this.mutex) {
                ePeek = delegate().peek();
            }
            return ePeek;
        }

        @Override // java.util.Queue
        public E poll() {
            E ePoll;
            synchronized (this.mutex) {
                ePoll = delegate().poll();
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.mutex) {
                eRemove = delegate().remove();
            }
            return eRemove;
        }
    }

    public static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public SynchronizedRandomAccessList(List<E> list, Object obj) {
            super(list, obj);
        }
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedSet(Set<E> set, Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Set<E> delegate() {
            return (Set) super.delegate();
        }

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements rle0<K, V> {
        private static final long serialVersionUID = 0;
        transient Set<Map.Entry<K, V>> entrySet;

        public SynchronizedSetMultimap(rle0<K, V> rle0Var, Object obj) {
            super(rle0Var, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public rle0<K, V> delegate() {
            return (rle0) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                try {
                    if (this.entrySet == null) {
                        this.entrySet = Synchronized.m16162n(delegate().entries(), this.mutex);
                    }
                    set = this.entrySet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public Set<V> get(K k) {
            Set<V> setM16162n;
            synchronized (this.mutex) {
                setM16162n = Synchronized.m16162n(delegate().get((Object) k), this.mutex);
            }
            return setM16162n;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public Set<V> removeAll(Object obj) {
            Set<V> setRemoveAll;
            synchronized (this.mutex) {
                setRemoveAll = delegate().removeAll(obj);
            }
            return setRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            Set<V> setReplaceValues;
            synchronized (this.mutex) {
                setReplaceValues = delegate().replaceValues((Object) k, (Iterable) iterable);
            }
            return setReplaceValues;
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedMap(SortedMap<K, V> sortedMap, Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public SortedMap<K, V> delegate() {
            return (SortedMap) super.delegate();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.mutex) {
                kFirstKey = delegate().firstKey();
            }
            return kFirstKey;
        }

        public SortedMap<K, V> headMap(K k) {
            SortedMap<K, V> sortedMapM16163o;
            synchronized (this.mutex) {
                sortedMapM16163o = Synchronized.m16163o(delegate().headMap(k), this.mutex);
            }
            return sortedMapM16163o;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.mutex) {
                kLastKey = delegate().lastKey();
            }
            return kLastKey;
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            SortedMap<K, V> sortedMapM16163o;
            synchronized (this.mutex) {
                sortedMapM16163o = Synchronized.m16163o(delegate().subMap(k, k2), this.mutex);
            }
            return sortedMapM16163o;
        }

        public SortedMap<K, V> tailMap(K k) {
            SortedMap<K, V> sortedMapM16163o;
            synchronized (this.mutex) {
                sortedMapM16163o = Synchronized.m16163o(delegate().tailMap(k), this.mutex);
            }
            return sortedMapM16163o;
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedSet(SortedSet<E> sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public SortedSet<E> delegate() {
            return (SortedSet) super.delegate();
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.mutex) {
                eFirst = delegate().first();
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E e) {
            SortedSet<E> sortedSetM16164p;
            synchronized (this.mutex) {
                sortedSetM16164p = Synchronized.m16164p(delegate().headSet(e), this.mutex);
            }
            return sortedSetM16164p;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.mutex) {
                eLast = delegate().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E e, E e2) {
            SortedSet<E> sortedSetM16164p;
            synchronized (this.mutex) {
                sortedSetM16164p = Synchronized.m16164p(delegate().subSet(e, e2), this.mutex);
            }
            return sortedSetM16164p;
        }

        public SortedSet<E> tailSet(E e) {
            SortedSet<E> sortedSetM16164p;
            synchronized (this.mutex) {
                sortedSetM16164p = Synchronized.m16164p(delegate().tailSet(e), this.mutex);
            }
            return sortedSetM16164p;
        }
    }

    public static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements tlf0<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedSetMultimap(tlf0<K, V> tlf0Var, Object obj) {
            super(tlf0Var, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public tlf0<K, V> delegate() {
            return (tlf0) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public SortedSet<V> get(K k) {
            SortedSet<V> sortedSetM16164p;
            synchronized (this.mutex) {
                sortedSetM16164p = Synchronized.m16164p(delegate().get((Object) k), this.mutex);
            }
            return sortedSetM16164p;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public SortedSet<V> removeAll(Object obj) {
            SortedSet<V> sortedSetRemoveAll;
            synchronized (this.mutex) {
                sortedSetRemoveAll = delegate().removeAll(obj);
            }
            return sortedSetRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, p149l.bm10, p149l.ymr
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            SortedSet<V> sortedSetReplaceValues;
            synchronized (this.mutex) {
                sortedSetReplaceValues = delegate().replaceValues((Object) k, (Iterable) iterable);
            }
            return sortedSetReplaceValues;
        }

        @Override // p149l.tlf0
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> comparatorValueComparator;
            synchronized (this.mutex) {
                comparatorValueComparator = delegate().valueComparator();
            }
            return comparatorValueComparator;
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements InterfaceC2979r<R, C, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedTable$a */
        public class C2942a implements gaj<Map<C, V>, Map<C, V>> {
            public C2942a() {
            }

            @Override // p149l.gaj
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> map) {
                return Synchronized.m16157i(map, SynchronizedTable.this.mutex);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedTable$b */
        public class C2943b implements gaj<Map<R, V>, Map<R, V>> {
            public C2943b() {
            }

            @Override // p149l.gaj
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> map) {
                return Synchronized.m16157i(map, SynchronizedTable.this.mutex);
            }
        }

        public SynchronizedTable(InterfaceC2979r<R, C, V> interfaceC2979r, Object obj) {
            super(interfaceC2979r, obj);
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Set<InterfaceC2979r.a<R, C, V>> cellSet() {
            Set<InterfaceC2979r.a<R, C, V>> setM16162n;
            synchronized (this.mutex) {
                setM16162n = Synchronized.m16162n(delegate().cellSet(), this.mutex);
            }
            return setM16162n;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Map<R, V> column(C c) {
            Map<R, V> mapM16157i;
            synchronized (this.mutex) {
                mapM16157i = Synchronized.m16157i(delegate().column(c), this.mutex);
            }
            return mapM16157i;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Set<C> columnKeySet() {
            Set<C> setM16162n;
            synchronized (this.mutex) {
                setM16162n = Synchronized.m16162n(delegate().columnKeySet(), this.mutex);
            }
            return setM16162n;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Map<C, Map<R, V>> columnMap() {
            Map<C, Map<R, V>> mapM16157i;
            synchronized (this.mutex) {
                mapM16157i = Synchronized.m16157i(Maps.m16015D(delegate().columnMap(), new C2943b()), this.mutex);
            }
            return mapM16157i;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public boolean contains(Object obj, Object obj2) {
            boolean zContains;
            synchronized (this.mutex) {
                zContains = delegate().contains(obj, obj2);
            }
            return zContains;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public boolean containsColumn(Object obj) {
            boolean zContainsColumn;
            synchronized (this.mutex) {
                zContainsColumn = delegate().containsColumn(obj);
            }
            return zContainsColumn;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public boolean containsRow(Object obj) {
            boolean zContainsRow;
            synchronized (this.mutex) {
                zContainsRow = delegate().containsRow(obj);
            }
            return zContainsRow;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public InterfaceC2979r<R, C, V> delegate() {
            return (InterfaceC2979r) super.delegate();
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public boolean equals(Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public V get(Object obj, Object obj2) {
            V v2;
            synchronized (this.mutex) {
                v2 = delegate().get(obj, obj2);
            }
            return v2;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public V put(R r, C c, V v2) {
            V vPut;
            synchronized (this.mutex) {
                vPut = delegate().put(r, c, v2);
            }
            return vPut;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public void putAll(InterfaceC2979r<? extends R, ? extends C, ? extends V> interfaceC2979r) {
            synchronized (this.mutex) {
                delegate().putAll(interfaceC2979r);
            }
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public V remove(Object obj, Object obj2) {
            V vRemove;
            synchronized (this.mutex) {
                vRemove = delegate().remove(obj, obj2);
            }
            return vRemove;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Map<C, V> row(R r) {
            Map<C, V> mapM16157i;
            synchronized (this.mutex) {
                mapM16157i = Synchronized.m16157i(delegate().row(r), this.mutex);
            }
            return mapM16157i;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Set<R> rowKeySet() {
            Set<R> setM16162n;
            synchronized (this.mutex) {
                setM16162n = Synchronized.m16162n(delegate().rowKeySet(), this.mutex);
            }
            return setM16162n;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Map<R, Map<C, V>> rowMap() {
            Map<R, Map<C, V>> mapM16157i;
            synchronized (this.mutex) {
                mapM16157i = Synchronized.m16157i(Maps.m16015D(delegate().rowMap(), new C2942a()), this.mutex);
            }
            return mapM16157i;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.InterfaceC2979r
        public Collection<V> values() {
            Collection<V> collectionM16155g;
            synchronized (this.mutex) {
                collectionM16155g = Synchronized.m16155g(delegate().values(), this.mutex);
            }
            return collectionM16155g;
        }
    }

    /* JADX INFO: renamed from: g */
    public static <E> Collection<E> m16155g(Collection<E> collection, Object obj) {
        return new SynchronizedCollection(collection, obj);
    }

    /* JADX INFO: renamed from: h */
    public static <E> List<E> m16156h(List<E> list, Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> Map<K, V> m16157i(Map<K, V> map, Object obj) {
        return new SynchronizedMap(map, obj);
    }

    /* JADX INFO: renamed from: j */
    public static <E> InterfaceC2972k<E> m16158j(InterfaceC2972k<E> interfaceC2972k, Object obj) {
        return ((interfaceC2972k instanceof SynchronizedMultiset) || (interfaceC2972k instanceof ImmutableMultiset)) ? interfaceC2972k : new SynchronizedMultiset(interfaceC2972k, obj);
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> NavigableMap<K, V> m16159k(NavigableMap<K, V> navigableMap, Object obj) {
        return new SynchronizedNavigableMap(navigableMap, obj);
    }

    /* JADX INFO: renamed from: l */
    public static <E> NavigableSet<E> m16160l(NavigableSet<E> navigableSet, Object obj) {
        return new SynchronizedNavigableSet(navigableSet, obj);
    }

    /* JADX INFO: renamed from: m */
    public static <K, V> Map.Entry<K, V> m16161m(Map.Entry<K, V> entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    /* JADX INFO: renamed from: n */
    public static <E> Set<E> m16162n(Set<E> set, Object obj) {
        return new SynchronizedSet(set, obj);
    }

    /* JADX INFO: renamed from: o */
    public static <K, V> SortedMap<K, V> m16163o(SortedMap<K, V> sortedMap, Object obj) {
        return new SynchronizedSortedMap(sortedMap, obj);
    }

    /* JADX INFO: renamed from: p */
    public static <E> SortedSet<E> m16164p(SortedSet<E> sortedSet, Object obj) {
        return new SynchronizedSortedSet(sortedSet, obj);
    }

    /* JADX INFO: renamed from: q */
    public static <E> Collection<E> m16165q(Collection<E> collection, Object obj) {
        if (collection instanceof SortedSet) {
            return m16164p((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return m16162n((Set) collection, obj);
        }
        return collection instanceof List ? m16156h((List) collection, obj) : m16155g(collection, obj);
    }

    /* JADX INFO: renamed from: r */
    public static <E> Set<E> m16166r(Set<E> set, Object obj) {
        return set instanceof SortedSet ? m16164p((SortedSet) set, obj) : m16162n(set, obj);
    }

    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e) {
            boolean zAdd;
            synchronized (this.mutex) {
                zAdd = delegate().add(e);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.mutex) {
                zAddAll = delegate().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.mutex) {
                zContains = delegate().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.mutex) {
                zContainsAll = delegate().containsAll(collection);
            }
            return zContainsAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Collection<E> delegate() {
            return (Collection) super.delegate();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return delegate().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.mutex) {
                zRemove = delegate().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.mutex) {
                zRemoveAll = delegate().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.mutex) {
                zRetainAll = delegate().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.mutex) {
                array = delegate().toArray();
            }
            return array;
        }

        private SynchronizedCollection(Collection<E> collection, Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) delegate().toArray(tArr);
            }
            return tArr2;
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedList(List<E> list, Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i, E e) {
            synchronized (this.mutex) {
                delegate().add(i, e);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.mutex) {
                zAddAll = delegate().addAll(i, collection);
            }
            return zAddAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public List<E> delegate() {
            return (List) super.delegate();
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int i) {
            E e;
            synchronized (this.mutex) {
                e = delegate().get(i);
            }
            return e;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.mutex) {
                iIndexOf = delegate().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.mutex) {
                iLastIndexOf = delegate().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return delegate().listIterator();
        }

        @Override // java.util.List
        public E remove(int i) {
            E eRemove;
            synchronized (this.mutex) {
                eRemove = delegate().remove(i);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int i, E e) {
            E e2;
            synchronized (this.mutex) {
                e2 = delegate().set(i, e);
            }
            return e2;
        }

        @Override // java.util.List
        public List<E> subList(int i, int i2) {
            List<E> listM16156h;
            synchronized (this.mutex) {
                listM16156h = Synchronized.m16156h(delegate().subList(i, i2), this.mutex);
            }
            return listM16156h;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i) {
            return delegate().listIterator(i);
        }
    }

    public static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$a */
        public class C2940a extends s7j0<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$a$a */
            public class a extends yzi<K, Collection<V>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f11133a;

                public a(Map.Entry entry) {
                    this.f11133a = entry;
                }

                @Override // p149l.a0j
                /* JADX INFO: renamed from: a */
                public Map.Entry<K, Collection<V>> delegate() {
                    return this.f11133a;
                }

                @Override // p149l.yzi, java.util.Map.Entry
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return Synchronized.m16165q((Collection) this.f11133a.getValue(), SynchronizedAsMapEntries.this.mutex);
                }
            }

            public C2940a(Iterator it) {
                super(it);
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> mo15897a(Map.Entry<K, Collection<V>> entry) {
                return new a(entry);
            }
        }

        public SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean zM16031f;
            synchronized (this.mutex) {
                zM16031f = Maps.m16031f(delegate(), obj);
            }
            return zM16031f;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean zM16258a;
            synchronized (this.mutex) {
                zM16258a = C2968g.m16258a(delegate(), collection);
            }
            return zM16258a;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zM16116a;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zM16116a = Sets.m16116a(delegate(), obj);
            }
            return zM16116a;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new C2940a(super.iterator());
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zM16047v;
            synchronized (this.mutex) {
                zM16047v = Maps.m16047v(delegate(), obj);
            }
            return zM16047v;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean zM15892v;
            synchronized (this.mutex) {
                zM15892v = Iterators.m15892v(delegate().iterator(), collection);
            }
            return zM15892v;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean zM15894x;
            synchronized (this.mutex) {
                zM15894x = Iterators.m15894x(delegate().iterator(), collection);
            }
            return zM15894x;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrM139134f;
            synchronized (this.mutex) {
                objArrM139134f = j050.m139134f(delegate());
            }
            return objArrM139134f;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) j050.m139135g(delegate(), tArr);
            }
            return tArr2;
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements bm10<K, V> {
        private static final long serialVersionUID = 0;
        transient Map<K, Collection<V>> asMap;
        transient Collection<Map.Entry<K, V>> entries;
        transient Set<K> keySet;
        transient InterfaceC2972k<K> keys;
        transient Collection<V> valuesCollection;

        public SynchronizedMultimap(bm10<K, V> bm10Var, Object obj) {
            super(bm10Var, obj);
        }

        @Override // p149l.bm10
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.mutex) {
                try {
                    if (this.asMap == null) {
                        this.asMap = new SynchronizedAsMap(delegate().asMap(), this.mutex);
                    }
                    map = this.asMap;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }

        @Override // p149l.bm10
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // p149l.bm10
        public boolean containsEntry(Object obj, Object obj2) {
            boolean zContainsEntry;
            synchronized (this.mutex) {
                zContainsEntry = delegate().containsEntry(obj, obj2);
            }
            return zContainsEntry;
        }

        @Override // p149l.bm10
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.mutex) {
                zContainsKey = delegate().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // p149l.bm10
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.mutex) {
                zContainsValue = delegate().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public bm10<K, V> delegate() {
            return (bm10) super.delegate();
        }

        @Override // p149l.bm10
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.mutex) {
                try {
                    if (this.entries == null) {
                        this.entries = Synchronized.m16165q(delegate().entries(), this.mutex);
                    }
                    collection = this.entries;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // p149l.bm10
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        public Collection<V> get(K k) {
            Collection<V> collectionM16165q;
            synchronized (this.mutex) {
                collectionM16165q = Synchronized.m16165q(delegate().get(k), this.mutex);
            }
            return collectionM16165q;
        }

        @Override // p149l.bm10
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // p149l.bm10
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.mutex) {
                zIsEmpty = delegate().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // p149l.bm10
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                try {
                    if (this.keySet == null) {
                        this.keySet = Synchronized.m16166r(delegate().keySet(), this.mutex);
                    }
                    set = this.keySet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // p149l.bm10
        public InterfaceC2972k<K> keys() {
            InterfaceC2972k<K> interfaceC2972k;
            synchronized (this.mutex) {
                try {
                    if (this.keys == null) {
                        this.keys = Synchronized.m16158j(delegate().keys(), this.mutex);
                    }
                    interfaceC2972k = this.keys;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC2972k;
        }

        @Override // p149l.bm10
        public boolean put(K k, V v2) {
            boolean zPut;
            synchronized (this.mutex) {
                zPut = delegate().put(k, v2);
            }
            return zPut;
        }

        @Override // p149l.bm10
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            boolean zPutAll;
            synchronized (this.mutex) {
                zPutAll = delegate().putAll(k, iterable);
            }
            return zPutAll;
        }

        @Override // p149l.bm10
        public boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.mutex) {
                zRemove = delegate().remove(obj, obj2);
            }
            return zRemove;
        }

        public Collection<V> removeAll(Object obj) {
            Collection<V> collectionRemoveAll;
            synchronized (this.mutex) {
                collectionRemoveAll = delegate().removeAll(obj);
            }
            return collectionRemoveAll;
        }

        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            Collection<V> collectionReplaceValues;
            synchronized (this.mutex) {
                collectionReplaceValues = delegate().replaceValues(k, iterable);
            }
            return collectionReplaceValues;
        }

        @Override // p149l.bm10
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // p149l.bm10
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                try {
                    if (this.valuesCollection == null) {
                        this.valuesCollection = Synchronized.m16155g(delegate().values(), this.mutex);
                    }
                    collection = this.valuesCollection;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // p149l.bm10
        public boolean putAll(bm10<? extends K, ? extends V> bm10Var) {
            boolean zPutAll;
            synchronized (this.mutex) {
                zPutAll = delegate().putAll(bm10Var);
            }
            return zPutAll;
        }
    }

    public static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements InterfaceC2972k<E> {
        private static final long serialVersionUID = 0;
        transient Set<E> elementSet;
        transient Set<InterfaceC2972k.a<E>> entrySet;

        public SynchronizedMultiset(InterfaceC2972k<E> interfaceC2972k, Object obj) {
            super(interfaceC2972k, obj);
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public int add(E e, int i) {
            int iAdd;
            synchronized (this.mutex) {
                iAdd = delegate().add(e, i);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public int count(Object obj) {
            int iCount;
            synchronized (this.mutex) {
                iCount = delegate().count(obj);
            }
            return iCount;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public InterfaceC2972k<E> delegate() {
            return (InterfaceC2972k) super.delegate();
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.mutex) {
                try {
                    if (this.elementSet == null) {
                        this.elementSet = Synchronized.m16166r(delegate().elementSet(), this.mutex);
                    }
                    set = this.elementSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public Set<InterfaceC2972k.a<E>> entrySet() {
            Set<InterfaceC2972k.a<E>> set;
            synchronized (this.mutex) {
                try {
                    if (this.entrySet == null) {
                        this.entrySet = Synchronized.m16166r(delegate().entrySet(), this.mutex);
                    }
                    set = this.entrySet;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.InterfaceC2972k
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                zEquals = delegate().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, com.google.common.collect.InterfaceC2972k
        public int hashCode() {
            int iHashCode;
            synchronized (this.mutex) {
                iHashCode = delegate().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public int remove(Object obj, int i) {
            int iRemove;
            synchronized (this.mutex) {
                iRemove = delegate().remove(obj, i);
            }
            return iRemove;
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public int setCount(E e, int i) {
            int count;
            synchronized (this.mutex) {
                count = delegate().setCount(e, i);
            }
            return count;
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public boolean setCount(E e, int i, int i2) {
            boolean count;
            synchronized (this.mutex) {
                count = delegate().setCount(e, i, i2);
            }
            return count;
        }
    }

    public static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        transient NavigableSet<K> descendingKeySet;
        transient NavigableMap<K, V> descendingMap;
        transient NavigableSet<K> navigableKeySet;

        public SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().ceilingEntry(k), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            K kCeilingKey;
            synchronized (this.mutex) {
                kCeilingKey = delegate().ceilingKey(k);
            }
            return kCeilingKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public NavigableMap<K, V> delegate() {
            return (NavigableMap) super.delegate();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.mutex) {
                try {
                    NavigableSet<K> navigableSet = this.descendingKeySet;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetM16160l = Synchronized.m16160l(delegate().descendingKeySet(), this.mutex);
                    this.descendingKeySet = navigableSetM16160l;
                    return navigableSetM16160l;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.mutex) {
                try {
                    NavigableMap<K, V> navigableMap = this.descendingMap;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<K, V> navigableMapM16159k = Synchronized.m16159k(delegate().descendingMap(), this.mutex);
                    this.descendingMap = navigableMapM16159k;
                    return navigableMapM16159k;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().firstEntry(), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().floorEntry(k), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            K kFloorKey;
            synchronized (this.mutex) {
                kFloorKey = delegate().floorKey(k);
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            NavigableMap<K, V> navigableMapM16159k;
            synchronized (this.mutex) {
                navigableMapM16159k = Synchronized.m16159k(delegate().headMap(k, z), this.mutex);
            }
            return navigableMapM16159k;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().higherEntry(k), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            K kHigherKey;
            synchronized (this.mutex) {
                kHigherKey = delegate().higherKey(k);
            }
            return kHigherKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().lastEntry(), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().lowerEntry(k), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            K kLowerKey;
            synchronized (this.mutex) {
                kLowerKey = delegate().lowerKey(k);
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.mutex) {
                try {
                    NavigableSet<K> navigableSet = this.navigableKeySet;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetM16160l = Synchronized.m16160l(delegate().navigableKeySet(), this.mutex);
                    this.navigableKeySet = navigableSetM16160l;
                    return navigableSetM16160l;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().pollFirstEntry(), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryM16161m;
            synchronized (this.mutex) {
                entryM16161m = Synchronized.m16161m(delegate().pollLastEntry(), this.mutex);
            }
            return entryM16161m;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            NavigableMap<K, V> navigableMapM16159k;
            synchronized (this.mutex) {
                navigableMapM16159k = Synchronized.m16159k(delegate().subMap(k, z, k2, z2), this.mutex);
            }
            return navigableMapM16159k;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            NavigableMap<K, V> navigableMapM16159k;
            synchronized (this.mutex) {
                navigableMapM16159k = Synchronized.m16159k(delegate().tailMap(k, z), this.mutex);
            }
            return navigableMapM16159k;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    public static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;
        transient NavigableSet<E> descendingSet;

        public SynchronizedNavigableSet(NavigableSet<E> navigableSet, Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            E eCeiling;
            synchronized (this.mutex) {
                eCeiling = delegate().ceiling(e);
            }
            return eCeiling;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public NavigableSet<E> delegate() {
            return (NavigableSet) super.delegate();
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return delegate().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.mutex) {
                try {
                    NavigableSet<E> navigableSet = this.descendingSet;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> navigableSetM16160l = Synchronized.m16160l(delegate().descendingSet(), this.mutex);
                    this.descendingSet = navigableSetM16160l;
                    return navigableSetM16160l;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            E eFloor;
            synchronized (this.mutex) {
                eFloor = delegate().floor(e);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            NavigableSet<E> navigableSetM16160l;
            synchronized (this.mutex) {
                navigableSetM16160l = Synchronized.m16160l(delegate().headSet(e, z), this.mutex);
            }
            return navigableSetM16160l;
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            E eHigher;
            synchronized (this.mutex) {
                eHigher = delegate().higher(e);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            E eLower;
            synchronized (this.mutex) {
                eLower = delegate().lower(e);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.mutex) {
                ePollFirst = delegate().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            E ePollLast;
            synchronized (this.mutex) {
                ePollLast = delegate().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            NavigableSet<E> navigableSetM16160l;
            synchronized (this.mutex) {
                navigableSetM16160l = Synchronized.m16160l(delegate().subSet(e, z, e2, z2), this.mutex);
            }
            return navigableSetM16160l;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            NavigableSet<E> navigableSetM16160l;
            synchronized (this.mutex) {
                navigableSetM16160l = Synchronized.m16160l(delegate().tailSet(e, z), this.mutex);
            }
            return navigableSetM16160l;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e) {
            return headSet(e, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e, E e2) {
            return subSet(e, true, e2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e) {
            return tailSet(e, true);
        }
    }
}
