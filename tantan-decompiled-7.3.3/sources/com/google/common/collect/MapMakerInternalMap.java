package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.InterfaceC2870h;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p153l.AbstractC18359l7;
import p153l.aqg0;
import p153l.m2j;
import p153l.mor;
import p153l.se5;
import p153l.wg3;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class MapMakerInternalMap<K, V, E extends InterfaceC2870h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final InterfaceC2884v<Object, Object, C2866d> UNSET_WEAK_VALUE_REFERENCE = new C2863a();
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient InterfaceC2871i<K, V, E, S> entryHelper;
    transient Set<Map.Entry<K, V>> entrySet;
    final Equivalence<Object> keyEquivalence;
    transient Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient Segment<K, V, E, S>[] segments;
    transient Collection<V> values;

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).m15999i();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$a */
    public class C2863a implements InterfaceC2884v<Object, Object, C2866d> {
        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2884v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2884v<Object, Object, C2866d> mo16004b(ReferenceQueue<Object> referenceQueue, C2866d c2866d) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2884v
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2884v
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2866d mo16003a() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2884v
        public Object get() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$b */
    public static abstract class AbstractC2864b<K, V, E extends InterfaceC2870h<K, V, E>> implements InterfaceC2870h<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final K f11054a;

        /* JADX INFO: renamed from: b */
        public final int f11055b;

        /* JADX INFO: renamed from: c */
        public final E f11056c;

        public AbstractC2864b(K k, int i, E e) {
            this.f11054a = k;
            this.f11055b = i;
            this.f11056c = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public int getHash() {
            return this.f11055b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public K getKey() {
            return this.f11054a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public E getNext() {
            return this.f11056c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$c */
    public static abstract class AbstractC2865c<K, V, E extends InterfaceC2870h<K, V, E>> extends WeakReference<K> implements InterfaceC2870h<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final int f11057a;

        /* JADX INFO: renamed from: b */
        public final E f11058b;

        public AbstractC2865c(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f11057a = i;
            this.f11058b = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public int getHash() {
            return this.f11057a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public E getNext() {
            return this.f11058b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$d */
    public static final class C2866d implements InterfaceC2870h<Object, Object, C2866d> {
        public C2866d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2866d getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$e */
    public final class C2867e extends MapMakerInternalMap<K, V, E, S>.AbstractC2869g<Map.Entry<K, V>> {
        public C2867e(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return m16011c();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$f */
    public final class C2868f extends AbstractC2874l<Map.Entry<K, V>> {
        public C2868f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.valueEquivalence().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2867e(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$g */
    public abstract class AbstractC2869g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f11060a;

        /* JADX INFO: renamed from: b */
        public int f11061b = -1;

        /* JADX INFO: renamed from: c */
        public Segment<K, V, E, S> f11062c;

        /* JADX INFO: renamed from: d */
        public AtomicReferenceArray<E> f11063d;

        /* JADX INFO: renamed from: e */
        public E f11064e;

        /* JADX INFO: renamed from: f */
        public MapMakerInternalMap<K, V, E, S>.C2886x f11065f;

        /* JADX INFO: renamed from: g */
        public MapMakerInternalMap<K, V, E, S>.C2886x f11066g;

        public AbstractC2869g() {
            this.f11060a = MapMakerInternalMap.this.segments.length - 1;
            m16009a();
        }

        /* JADX INFO: renamed from: a */
        public final void m16009a() {
            this.f11065f = null;
            if (m16012d() || m16013e()) {
                return;
            }
            while (true) {
                int i = this.f11060a;
                if (i < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.segments;
                this.f11060a = i - 1;
                Segment<K, V, E, S> segment = segmentArr[i];
                this.f11062c = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11062c.table;
                    this.f11063d = atomicReferenceArray;
                    this.f11061b = atomicReferenceArray.length() - 1;
                    if (m16013e()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m16010b(E e) {
            Segment<K, V, E, S> segment;
            try {
                Object key = e.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(e);
                if (liveValue == null) {
                    return false;
                }
                this.f11065f = new C2886x(key, liveValue);
                return true;
            } finally {
                this.f11062c.postReadCleanup();
            }
        }

        /* JADX INFO: renamed from: c */
        public MapMakerInternalMap<K, V, E, S>.C2886x m16011c() {
            MapMakerInternalMap<K, V, E, S>.C2886x c2886x = this.f11065f;
            if (c2886x == null) {
                mor.m159308a();
                return null;
            }
            this.f11066g = c2886x;
            m16009a();
            return this.f11066g;
        }

        /* JADX INFO: renamed from: d */
        public boolean m16012d() {
            E e = this.f11064e;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f11064e = (E) e.getNext();
                E e2 = this.f11064e;
                if (e2 == null) {
                    return false;
                }
                if (m16010b(e2)) {
                    return true;
                }
                e = this.f11064e;
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m16013e() {
            while (true) {
                int i = this.f11061b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11063d;
                this.f11061b = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f11064e = e;
                if (e != null && (m16010b(e) || m16012d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11065f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            se5.m185519e(this.f11066g != null);
            MapMakerInternalMap.this.remove(this.f11066g.getKey());
            this.f11066g = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$h */
    public interface InterfaceC2870h<K, V, E extends InterfaceC2870h<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$i */
    public interface InterfaceC2871i<K, V, E extends InterfaceC2870h<K, V, E>, S extends Segment<K, V, E, S>> {
        /* JADX INFO: renamed from: a */
        void mo16014a(S s, E e, V v2);

        /* JADX INFO: renamed from: b */
        Strength mo16015b();

        /* JADX INFO: renamed from: c */
        E mo16016c(S s, E e, E e2);

        /* JADX INFO: renamed from: d */
        Strength mo16017d();

        /* JADX INFO: renamed from: e */
        E mo16018e(S s, K k, int i, E e);

        /* JADX INFO: renamed from: f */
        S mo16019f(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$j */
    public final class C2872j extends MapMakerInternalMap<K, V, E, S>.AbstractC2869g<K> {
        public C2872j(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m16011c().getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$k */
    public final class C2873k extends AbstractC2874l<K> {
        public C2873k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C2872j(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$m */
    public static final class C2875m<K> extends AbstractC2864b<K, MapMaker.Dummy, C2875m<K>> implements InterfaceC2870h {

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$m$a */
        public static final class a<K> implements InterfaceC2871i<K, MapMaker.Dummy, C2875m<K>, StrongKeyDummyValueSegment<K>> {
            private static final a<?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K> a<K> m16022h() {
                return (a<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: b */
            public Strength mo16015b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: d */
            public Strength mo16017d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2875m<K> mo16016c(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, C2875m<K> c2875m, C2875m<K> c2875m2) {
                return c2875m.m16020a(c2875m2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2875m<K> mo16018e(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, C2875m<K> c2875m) {
                return new C2875m<>(k, i, c2875m);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyDummyValueSegment<K> mo16019f(MapMakerInternalMap<K, MapMaker.Dummy, C2875m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo16014a(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, C2875m<K> c2875m, MapMaker.Dummy dummy) {
            }
        }

        public C2875m(K k, int i, C2875m<K> c2875m) {
            super(k, i, c2875m);
        }

        /* JADX INFO: renamed from: a */
        public C2875m<K> m16020a(C2875m<K> c2875m) {
            return new C2875m<>(this.f11054a, this.f11055b, c2875m);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$n */
    public static final class C2876n<K, V> extends AbstractC2864b<K, V, C2876n<K, V>> implements InterfaceC2870h {

        /* JADX INFO: renamed from: d */
        public volatile V f11069d;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$n$a */
        public static final class a<K, V> implements InterfaceC2871i<K, V, C2876n<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m16029h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: b */
            public Strength mo16015b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: d */
            public Strength mo16017d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2876n<K, V> mo16016c(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, C2876n<K, V> c2876n, C2876n<K, V> c2876n2) {
                return c2876n.m16027a(c2876n2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2876n<K, V> mo16018e(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, C2876n<K, V> c2876n) {
                return new C2876n<>(k, i, c2876n);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyStrongValueSegment<K, V> mo16019f(MapMakerInternalMap<K, V, C2876n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo16014a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, C2876n<K, V> c2876n, V v2) {
                c2876n.m16028b(v2);
            }
        }

        public C2876n(K k, int i, C2876n<K, V> c2876n) {
            super(k, i, c2876n);
            this.f11069d = null;
        }

        /* JADX INFO: renamed from: a */
        public C2876n<K, V> m16027a(C2876n<K, V> c2876n) {
            C2876n<K, V> c2876n2 = new C2876n<>(this.f11054a, this.f11055b, c2876n);
            c2876n2.f11069d = this.f11069d;
            return c2876n2;
        }

        /* JADX INFO: renamed from: b */
        public void m16028b(V v2) {
            this.f11069d = v2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public V getValue() {
            return this.f11069d;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$o */
    public static final class C2877o<K, V> extends AbstractC2864b<K, V, C2877o<K, V>> implements InterfaceC2883u<K, V, C2877o<K, V>> {

        /* JADX INFO: renamed from: d */
        public volatile InterfaceC2884v<K, V, C2877o<K, V>> f11070d;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$o$a */
        public static final class a<K, V> implements InterfaceC2871i<K, V, C2877o<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m16038h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: b */
            public Strength mo16015b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: d */
            public Strength mo16017d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2877o<K, V> mo16016c(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, C2877o<K, V> c2877o, C2877o<K, V> c2877o2) {
                if (Segment.isCollected(c2877o)) {
                    return null;
                }
                return c2877o.m16036c(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, c2877o2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2877o<K, V> mo16018e(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, C2877o<K, V> c2877o) {
                return new C2877o<>(k, i, c2877o);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyWeakValueSegment<K, V> mo16019f(MapMakerInternalMap<K, V, C2877o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo16014a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, C2877o<K, V> c2877o, V v2) {
                c2877o.m16037d(v2, ((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues);
            }
        }

        public C2877o(K k, int i, C2877o<K, V> c2877o) {
            super(k, i, c2877o);
            this.f11070d = MapMakerInternalMap.unsetWeakValueReference();
        }

        /* JADX INFO: renamed from: c */
        public C2877o<K, V> m16036c(ReferenceQueue<V> referenceQueue, C2877o<K, V> c2877o) {
            C2877o<K, V> c2877o2 = new C2877o<>(this.f11054a, this.f11055b, c2877o);
            c2877o2.f11070d = this.f11070d.mo16004b(referenceQueue, c2877o2);
            return c2877o2;
        }

        /* JADX INFO: renamed from: d */
        public void m16037d(V v2, ReferenceQueue<V> referenceQueue) {
            InterfaceC2884v<K, V, C2877o<K, V>> interfaceC2884v = this.f11070d;
            this.f11070d = new C2885w(referenceQueue, v2, this);
            interfaceC2884v.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public V getValue() {
            return this.f11070d.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2883u
        public InterfaceC2884v<K, V, C2877o<K, V>> getValueReference() {
            return this.f11070d;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$p */
    public final class C2878p extends MapMakerInternalMap<K, V, E, S>.AbstractC2869g<V> {
        public C2878p(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m16011c().getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$r */
    public static final class C2880r<K> extends AbstractC2865c<K, MapMaker.Dummy, C2880r<K>> implements InterfaceC2870h {

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$r$a */
        public static final class a<K> implements InterfaceC2871i<K, MapMaker.Dummy, C2880r<K>, WeakKeyDummyValueSegment<K>> {
            private static final a<?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K> a<K> m16045h() {
                return (a<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: b */
            public Strength mo16015b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: d */
            public Strength mo16017d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2880r<K> mo16016c(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, C2880r<K> c2880r, C2880r<K> c2880r2) {
                if (c2880r.getKey() == null) {
                    return null;
                }
                return c2880r.m16043a(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, c2880r2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2880r<K> mo16018e(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, C2880r<K> c2880r) {
                return new C2880r<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k, i, c2880r);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyDummyValueSegment<K> mo16019f(MapMakerInternalMap<K, MapMaker.Dummy, C2880r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo16014a(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, C2880r<K> c2880r, MapMaker.Dummy dummy) {
            }
        }

        public C2880r(ReferenceQueue<K> referenceQueue, K k, int i, C2880r<K> c2880r) {
            super(referenceQueue, k, i, c2880r);
        }

        /* JADX INFO: renamed from: a */
        public C2880r<K> m16043a(ReferenceQueue<K> referenceQueue, C2880r<K> c2880r) {
            return new C2880r<>(referenceQueue, getKey(), this.f11057a, c2880r);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$s */
    public static final class C2881s<K, V> extends AbstractC2865c<K, V, C2881s<K, V>> implements InterfaceC2870h {

        /* JADX INFO: renamed from: c */
        public volatile V f11072c;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$s$a */
        public static final class a<K, V> implements InterfaceC2871i<K, V, C2881s<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m16052h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: b */
            public Strength mo16015b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: d */
            public Strength mo16017d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2881s<K, V> mo16016c(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, C2881s<K, V> c2881s, C2881s<K, V> c2881s2) {
                if (c2881s.getKey() == null) {
                    return null;
                }
                return c2881s.m16050a(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, c2881s2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2881s<K, V> mo16018e(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, C2881s<K, V> c2881s) {
                return new C2881s<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i, c2881s);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyStrongValueSegment<K, V> mo16019f(MapMakerInternalMap<K, V, C2881s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo16014a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, C2881s<K, V> c2881s, V v2) {
                c2881s.m16051b(v2);
            }
        }

        public C2881s(ReferenceQueue<K> referenceQueue, K k, int i, C2881s<K, V> c2881s) {
            super(referenceQueue, k, i, c2881s);
            this.f11072c = null;
        }

        /* JADX INFO: renamed from: a */
        public C2881s<K, V> m16050a(ReferenceQueue<K> referenceQueue, C2881s<K, V> c2881s) {
            C2881s<K, V> c2881s2 = new C2881s<>(referenceQueue, getKey(), this.f11057a, c2881s);
            c2881s2.m16051b(this.f11072c);
            return c2881s2;
        }

        /* JADX INFO: renamed from: b */
        public void m16051b(V v2) {
            this.f11072c = v2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public V getValue() {
            return this.f11072c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$t */
    public static final class C2882t<K, V> extends AbstractC2865c<K, V, C2882t<K, V>> implements InterfaceC2883u<K, V, C2882t<K, V>> {

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC2884v<K, V, C2882t<K, V>> f11073c;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$t$a */
        public static final class a<K, V> implements InterfaceC2871i<K, V, C2882t<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m16061h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: b */
            public Strength mo16015b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: d */
            public Strength mo16017d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2882t<K, V> mo16016c(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, C2882t<K, V> c2882t, C2882t<K, V> c2882t2) {
                if (c2882t.getKey() == null || Segment.isCollected(c2882t)) {
                    return null;
                }
                return c2882t.m16059c(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, c2882t2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2882t<K, V> mo16018e(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, C2882t<K, V> c2882t) {
                return new C2882t<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i, c2882t);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyWeakValueSegment<K, V> mo16019f(MapMakerInternalMap<K, V, C2882t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2871i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo16014a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, C2882t<K, V> c2882t, V v2) {
                c2882t.m16060d(v2, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues);
            }
        }

        public C2882t(ReferenceQueue<K> referenceQueue, K k, int i, C2882t<K, V> c2882t) {
            super(referenceQueue, k, i, c2882t);
            this.f11073c = MapMakerInternalMap.unsetWeakValueReference();
        }

        /* JADX INFO: renamed from: c */
        public C2882t<K, V> m16059c(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C2882t<K, V> c2882t) {
            C2882t<K, V> c2882t2 = new C2882t<>(referenceQueue, getKey(), this.f11057a, c2882t);
            c2882t2.f11073c = this.f11073c.mo16004b(referenceQueue2, c2882t2);
            return c2882t2;
        }

        /* JADX INFO: renamed from: d */
        public void m16060d(V v2, ReferenceQueue<V> referenceQueue) {
            InterfaceC2884v<K, V, C2882t<K, V>> interfaceC2884v = this.f11073c;
            this.f11073c = new C2885w(referenceQueue, v2, this);
            interfaceC2884v.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2870h
        public V getValue() {
            return this.f11073c.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2883u
        public InterfaceC2884v<K, V, C2882t<K, V>> getValueReference() {
            return this.f11073c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$u */
    public interface InterfaceC2883u<K, V, E extends InterfaceC2870h<K, V, E>> extends InterfaceC2870h<K, V, E> {
        InterfaceC2884v<K, V, E> getValueReference();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$v */
    public interface InterfaceC2884v<K, V, E extends InterfaceC2870h<K, V, E>> {
        /* JADX INFO: renamed from: a */
        E mo16003a();

        /* JADX INFO: renamed from: b */
        InterfaceC2884v<K, V, E> mo16004b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$w */
    public static final class C2885w<K, V, E extends InterfaceC2870h<K, V, E>> extends WeakReference<V> implements InterfaceC2884v<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final E f11074a;

        public C2885w(ReferenceQueue<V> referenceQueue, V v2, E e) {
            super(v2, referenceQueue);
            this.f11074a = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2884v
        /* JADX INFO: renamed from: a */
        public E mo16003a() {
            return this.f11074a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2884v
        /* JADX INFO: renamed from: b */
        public InterfaceC2884v<K, V, E> mo16004b(ReferenceQueue<V> referenceQueue, E e) {
            return new C2885w(referenceQueue, get(), e);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$x */
    public final class C2886x extends AbstractC18359l7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f11075a;

        /* JADX INFO: renamed from: b */
        public V f11076b;

        public C2886x(K k, V v2) {
            this.f11075a = k;
            this.f11076b = v2;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f11075a.equals(entry.getKey()) && this.f11076b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getKey() {
            return this.f11075a;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V getValue() {
            return this.f11076b;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public int hashCode() {
            return this.f11076b.hashCode() ^ this.f11075a.hashCode();
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = (V) MapMakerInternalMap.this.put(this.f11075a, v2);
            this.f11076b = v2;
            return v3;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InterfaceC2871i<K, V, E, S> interfaceC2871i) {
        this.concurrencyLevel = Math.min(mapMaker.m15992b(), 65536);
        this.keyEquivalence = mapMaker.m15994d();
        this.entryHelper = interfaceC2871i;
        int iMin = Math.min(mapMaker.m15993c(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.concurrencyLevel) {
            i3++;
            i4 <<= 1;
        }
        this.segmentShift = 32 - i3;
        this.segmentMask = i4 - 1;
        this.segments = newSegmentArray(i4);
        int i5 = iMin / i4;
        while (i2 < (i4 * i5 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i >= segmentArr.length) {
                return;
            }
            segmentArr[i] = createSegment(i2, -1);
            i++;
        }
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends InterfaceC2870h<K, V, ?>, ?> create(MapMaker mapMaker) {
        Strength strengthM15995e = mapMaker.m15995e();
        Strength strength = Strength.STRONG;
        if (strengthM15995e == strength && mapMaker.m15996f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2876n.a.m16029h());
        }
        if (mapMaker.m15995e() == strength && mapMaker.m15996f() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, C2877o.a.m16038h());
        }
        Strength strengthM15995e2 = mapMaker.m15995e();
        Strength strength2 = Strength.WEAK;
        if (strengthM15995e2 == strength2 && mapMaker.m15996f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2881s.a.m16052h());
        }
        if (mapMaker.m15995e() == strength2 && mapMaker.m15996f() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, C2882t.a.m16061h());
        }
        aqg0.m99478a();
        return null;
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends InterfaceC2870h<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
        Strength strengthM15995e = mapMaker.m15995e();
        Strength strength = Strength.STRONG;
        if (strengthM15995e == strength && mapMaker.m15996f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2875m.a.m16022h());
        }
        Strength strengthM15995e2 = mapMaker.m15995e();
        Strength strength2 = Strength.WEAK;
        if (strengthM15995e2 == strength2 && mapMaker.m15996f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2880r.a.m16045h());
        }
        if (mapMaker.m15996f() == strength2) {
            wg3.m206174a("Map cannot have both weak and dummy values");
            return null;
        }
        aqg0.m99478a();
        return null;
    }

    public static int rehash(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> toArrayList(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.m15925a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V, E extends InterfaceC2870h<K, V, E>> InterfaceC2884v<K, V, E> unsetWeakValueReference() {
        return (InterfaceC2884v<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i2 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    E next = atomicReferenceArray.get(r13);
                    while (next != null) {
                        V liveValue = segment.getLiveValue(next);
                        boolean z2 = z;
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = next.getNext();
                        z = z2;
                    }
                }
                j2 += (long) segment.modCount;
                z = z;
            }
            boolean z3 = z;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
        }
        return z;
    }

    public E copyEntry(E e, E e2) {
        return (E) segmentFor(e.getHash()).copyEntry(e, e2);
    }

    public Segment<K, V, E, S> createSegment(int i, int i2) {
        return this.entryHelper.mo16019f(this, i, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C2868f c2868f = new C2868f();
        this.entrySet = c2868f;
        return c2868f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    public E getEntry(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return (E) segmentFor(iHash).getEntry(obj, iHash);
    }

    public V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        return j == 0;
    }

    public boolean isLiveForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
        return segmentFor(interfaceC2870h.getHash()).getLiveValueForTesting(interfaceC2870h) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C2873k c2873k = new C2873k();
        this.keySet = c2873k;
        return c2873k;
    }

    public Strength keyStrength() {
        return this.entryHelper.mo16015b();
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        xn80.m212111p(k);
        xn80.m212111p(v2);
        int iHash = hash(k);
        return segmentFor(iHash).put(k, iHash, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v2) {
        xn80.m212111p(k);
        xn80.m212111p(v2);
        int iHash = hash(k);
        return segmentFor(iHash).put(k, iHash, v2, true);
    }

    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reclaimValue(InterfaceC2884v<K, V, E> interfaceC2884v) {
        InterfaceC2870h interfaceC2870hMo16003a = interfaceC2884v.mo16003a();
        int hash = interfaceC2870hMo16003a.getHash();
        segmentFor(hash).reclaimValue(interfaceC2870hMo16003a.getKey(), hash, interfaceC2884v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v2, V v3) {
        xn80.m212111p(k);
        xn80.m212111p(v3);
        if (v2 == null) {
            return false;
        }
        int iHash = hash(k);
        return segmentFor(iHash).replace(k, iHash, v2, v3);
    }

    public Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[this.segmentMask & (i >>> this.segmentShift)];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (Segment<K, V, E, S> segment : this.segments) {
            j += (long) segment.count;
        }
        return Ints.m16523m(j);
    }

    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.mo16017d().defaultEquivalence();
    }

    public Strength valueStrength() {
        return this.entryHelper.mo16017d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        C2879q c2879q = new C2879q();
        this.values = c2879q;
        return c2879q;
    }

    public Object writeReplace() {
        return new SerializationProxy(this.entryHelper.mo16015b(), this.entryHelper.mo16017d(), this.keyEquivalence, this.entryHelper.mo16017d().defaultEquivalence(), this.concurrencyLevel, this);
    }

    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        /* synthetic */ Strength(C2863a c2863a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$l */
    public static abstract class AbstractC2874l<E> extends AbstractSet<E> {
        public AbstractC2874l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.toArrayList(this).toArray();
        }

        public /* synthetic */ AbstractC2874l(C2863a c2863a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C2875m<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C2875m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2875m<K> castForTesting(InterfaceC2870h<K, MapMaker.Dummy, ?> interfaceC2870h) {
            return (C2875m) interfaceC2870h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, C2876n<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, C2876n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2876n<K, V> castForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return (C2876n) interfaceC2870h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C2877o<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, C2877o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC2884v<K, V, C2877o<K, V>> getWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return castForTesting((InterfaceC2870h) interfaceC2870h).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC2884v<K, V, C2877o<K, V>> newWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, V v2) {
            return new C2885w(this.queueForValues, v2, castForTesting((InterfaceC2870h) interfaceC2870h));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, InterfaceC2884v<K, V, ? extends InterfaceC2870h<K, V, ?>> interfaceC2884v) {
            C2877o<K, V> c2877oCastForTesting = castForTesting((InterfaceC2870h) interfaceC2870h);
            InterfaceC2884v interfaceC2884v2 = c2877oCastForTesting.f11070d;
            c2877oCastForTesting.f11070d = interfaceC2884v;
            interfaceC2884v2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2877o<K, V> castForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return (C2877o) interfaceC2870h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C2880r<K>, WeakKeyDummyValueSegment<K>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C2880r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2880r<K> castForTesting(InterfaceC2870h<K, MapMaker.Dummy, ?> interfaceC2870h) {
            return (C2880r) interfaceC2870h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, C2881s<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, C2881s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2881s<K, V> castForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return (C2881s) interfaceC2870h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C2882t<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, C2882t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC2884v<K, V, C2882t<K, V>> getWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return castForTesting((InterfaceC2870h) interfaceC2870h).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC2884v<K, V, C2882t<K, V>> newWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, V v2) {
            return new C2885w(this.queueForValues, v2, castForTesting((InterfaceC2870h) interfaceC2870h));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, InterfaceC2884v<K, V, ? extends InterfaceC2870h<K, V, ?>> interfaceC2884v) {
            C2882t<K, V> c2882tCastForTesting = castForTesting((InterfaceC2870h) interfaceC2870h);
            InterfaceC2884v interfaceC2884v2 = c2882tCastForTesting.f11073c;
            c2882tCastForTesting.f11073c = interfaceC2884v;
            interfaceC2884v2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2882t<K, V> castForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return (C2882t) interfaceC2870h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    public static abstract class AbstractSerializationProxy<K, V> extends m2j<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient ConcurrentMap<K, V> delegate;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        public void readEntries(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.delegate.put((K) object, (V) objectInputStream.readObject());
            }
        }

        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().m15997g(objectInputStream.readInt()).m16000j(this.keyStrength).m16001k(this.valueStrength).m15998h(this.keyEquivalence).m15991a(this.concurrencyLevel);
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        @Override // p153l.m2j, p153l.s2j, p153l.v2j
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$q */
    public final class C2879q extends AbstractCollection<V> {
        public C2879q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C2878p(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return MapMakerInternalMap.toArrayList(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v2) {
        xn80.m212111p(k);
        xn80.m212111p(v2);
        int iHash = hash(k);
        return segmentFor(iHash).replace(k, iHash, v2);
    }

    public static abstract class Segment<K, V, E extends InterfaceC2870h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            initTable(newEntryArray(i));
        }

        public static <K, V, E extends InterfaceC2870h<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        public abstract E castForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h);

        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        public boolean clearValueForTesting(K k, int i, InterfaceC2884v<K, V, ? extends InterfaceC2870h<K, V, ?>> interfaceC2884v) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((InterfaceC2883u) next).getValueReference() != interfaceC2884v) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) removeFromChain(e, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                InterfaceC2870h liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null && liveEntry.getValue() != null) {
                    z = true;
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next);
                            if (liveValue != null && this.map.valueEquivalence().equivalent(obj, liveValue)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        public E copyEntry(E e, E e2) {
            return (E) this.map.entryHelper.mo16016c(self(), e, e2);
        }

        public E copyForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, InterfaceC2870h<K, V, ?> interfaceC2870h2) {
            return (E) this.map.entryHelper.mo16016c(self(), castForTesting(interfaceC2870h), castForTesting(interfaceC2870h2));
        }

        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((InterfaceC2870h) referencePoll);
                i++;
            } while (i != 16);
        }

        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimValue((InterfaceC2884v) referencePoll);
                i++;
            } while (i != 16);
        }

        public void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<E> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E next = atomicReferenceArray.get(i2);
                if (next != null) {
                    InterfaceC2870h next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InterfaceC2870h interfaceC2870h = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC2870h = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, interfaceC2870h);
                        while (next != interfaceC2870h) {
                            int hash3 = next.getHash() & length2;
                            InterfaceC2870h interfaceC2870hCopyEntry = copyEntry(next, (InterfaceC2870h) atomicReferenceArrayNewEntryArray.get(hash3));
                            if (interfaceC2870hCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, interfaceC2870hCopyEntry);
                            } else {
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i;
        }

        public V get(Object obj, int i) {
            try {
                InterfaceC2870h liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    return null;
                }
                V v2 = (V) liveEntry.getValue();
                if (v2 == null) {
                    tryDrainReferenceQueues();
                }
                return v2;
            } finally {
                postReadCleanup();
            }
        }

        public E getEntry(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E e = (E) getFirst(i); e != null; e = (E) e.getNext()) {
                if (e.getHash() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        public E getFirst(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public E getLiveEntry(Object obj, int i) {
            return (E) getEntry(obj, i);
        }

        public V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v2 = (V) e.getValue();
            if (v2 != null) {
                return v2;
            }
            tryDrainReferenceQueues();
            return null;
        }

        public V getLiveValueForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return getLiveValue(castForTesting(interfaceC2870h));
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public InterfaceC2884v<K, V, E> getWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        public void maybeClearReferenceQueues() {
        }

        public void maybeDrainReferenceQueues() {
        }

        public AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public E newEntryForTesting(K k, int i, InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return (E) this.map.entryHelper.mo16018e(self(), k, i, castForTesting(interfaceC2870h));
        }

        public InterfaceC2884v<K, V, E> newWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, V v2) {
            throw new AssertionError();
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        public void preWriteCleanup() {
            runLockedCleanup();
        }

        public V put(K k, int i, V v2, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v3 = (V) next.getValue();
                        if (v3 == null) {
                            this.modCount++;
                            setValue(next, v2);
                            this.count = this.count;
                            return null;
                        }
                        if (z) {
                            return v3;
                        }
                        this.modCount++;
                        setValue(next, v2);
                        return v3;
                    }
                }
                this.modCount++;
                InterfaceC2870h interfaceC2870hMo16018e = this.map.entryHelper.mo16018e(self(), k, i, e);
                setValue(interfaceC2870hMo16018e, v2);
                atomicReferenceArray.set(length, (E) interfaceC2870hMo16018e);
                this.count = i2;
                return null;
            } finally {
                unlock();
            }
        }

        public boolean reclaimKey(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e2; next != null; next = next.getNext()) {
                    if (next == e) {
                        this.modCount++;
                        InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e2, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                        this.count = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean reclaimValue(K k, int i, InterfaceC2884v<K, V, E> interfaceC2884v) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((InterfaceC2883u) next).getValueReference() != interfaceC2884v) {
                            return false;
                        }
                        this.modCount++;
                        InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                        this.count = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean remove(Object obj, int i, Object obj2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                InterfaceC2870h next = e;
                while (true) {
                    boolean z = false;
                    if (next == null) {
                        return false;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        if (this.map.valueEquivalence().equivalent(obj2, next.getValue())) {
                            z = true;
                        } else if (!isCollected(next)) {
                            return false;
                        }
                        this.modCount++;
                        InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                        this.count = i2;
                        return z;
                    }
                    next = next.getNext();
                }
            } finally {
                unlock();
            }
        }

        public boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (InterfaceC2870h next = e2; next != null; next = next.getNext()) {
                if (next == e) {
                    this.modCount++;
                    InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e2, next);
                    int i = this.count - 1;
                    atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                    this.count = i;
                    return true;
                }
            }
            return false;
        }

        public E removeFromChain(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                InterfaceC2870h interfaceC2870hCopyEntry = copyEntry(e, e3);
                if (interfaceC2870hCopyEntry != null) {
                    e3 = (E) interfaceC2870hCopyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        public E removeFromChainForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, InterfaceC2870h<K, V, ?> interfaceC2870h2) {
            return (E) removeFromChain(castForTesting(interfaceC2870h), castForTesting(interfaceC2870h2));
        }

        public boolean removeTableEntryForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h) {
            return removeEntryForTesting(castForTesting(interfaceC2870h));
        }

        public boolean replace(K k, int i, V v2, V v3) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.map.valueEquivalence().equivalent(v2, value)) {
                                return false;
                            }
                            this.modCount++;
                            setValue(next, v3);
                            return true;
                        }
                        if (isCollected(next)) {
                            this.modCount++;
                            InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e, next);
                            int i2 = this.count - 1;
                            atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                            this.count = i2;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void runCleanup() {
            runLockedCleanup();
        }

        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        public void setTableEntryForTesting(int i, InterfaceC2870h<K, V, ?> interfaceC2870h) {
            this.table.set(i, (E) castForTesting(interfaceC2870h));
        }

        public void setValue(E e, V v2) {
            this.map.entryHelper.mo16014a(self(), e, v2);
        }

        public void setValueForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, V v2) {
            this.map.entryHelper.mo16014a(self(), castForTesting(interfaceC2870h), v2);
        }

        public void setWeakValueReferenceForTesting(InterfaceC2870h<K, V, ?> interfaceC2870h, InterfaceC2884v<K, V, ? extends InterfaceC2870h<K, V, ?>> interfaceC2884v) {
            throw new AssertionError();
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public V remove(Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null && !isCollected(next)) {
                            return null;
                        }
                        this.modCount++;
                        InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                        this.count = i2;
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public V replace(K k, int i, V v2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2870h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v3 = (V) next.getValue();
                        if (v3 == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                InterfaceC2870h interfaceC2870hRemoveFromChain = removeFromChain(e, next);
                                int i2 = this.count - 1;
                                atomicReferenceArray.set(length, (E) interfaceC2870hRemoveFromChain);
                                this.count = i2;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(next, v2);
                        return v3;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }
}
