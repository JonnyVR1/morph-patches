package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.InterfaceC2847h;
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
import p149l.AbstractC19437q7;
import p149l.ig3;
import p149l.lmr;
import p149l.rzi;
import p149l.sd5;
import p149l.sf80;
import p149l.shg0;

/* JADX INFO: loaded from: classes7.dex */
class MapMakerInternalMap<K, V, E extends InterfaceC2847h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final InterfaceC2861v<Object, Object, C2843d> UNSET_WEAK_VALUE_REFERENCE = new C2840a();
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient InterfaceC2848i<K, V, E, S> entryHelper;
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
            this.delegate = readMapMaker(objectInputStream).m15945i();
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
    public class C2840a implements InterfaceC2861v<Object, Object, C2843d> {
        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2861v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2861v<Object, Object, C2843d> mo15950b(ReferenceQueue<Object> referenceQueue, C2843d c2843d) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2861v
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2861v
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2843d mo15949a() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2861v
        public Object get() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$b */
    public static abstract class AbstractC2841b<K, V, E extends InterfaceC2847h<K, V, E>> implements InterfaceC2847h<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final K f11017a;

        /* JADX INFO: renamed from: b */
        public final int f11018b;

        /* JADX INFO: renamed from: c */
        public final E f11019c;

        public AbstractC2841b(K k, int i, E e) {
            this.f11017a = k;
            this.f11018b = i;
            this.f11019c = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public int getHash() {
            return this.f11018b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public K getKey() {
            return this.f11017a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public E getNext() {
            return this.f11019c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$c */
    public static abstract class AbstractC2842c<K, V, E extends InterfaceC2847h<K, V, E>> extends WeakReference<K> implements InterfaceC2847h<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final int f11020a;

        /* JADX INFO: renamed from: b */
        public final E f11021b;

        public AbstractC2842c(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f11020a = i;
            this.f11021b = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public int getHash() {
            return this.f11020a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public E getNext() {
            return this.f11021b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$d */
    public static final class C2843d implements InterfaceC2847h<Object, Object, C2843d> {
        public C2843d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2843d getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$e */
    public final class C2844e extends MapMakerInternalMap<K, V, E, S>.AbstractC2846g<Map.Entry<K, V>> {
        public C2844e(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return m15957c();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$f */
    public final class C2845f extends AbstractC2851l<Map.Entry<K, V>> {
        public C2845f() {
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
            return new C2844e(MapMakerInternalMap.this);
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
    public abstract class AbstractC2846g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f11023a;

        /* JADX INFO: renamed from: b */
        public int f11024b = -1;

        /* JADX INFO: renamed from: c */
        public Segment<K, V, E, S> f11025c;

        /* JADX INFO: renamed from: d */
        public AtomicReferenceArray<E> f11026d;

        /* JADX INFO: renamed from: e */
        public E f11027e;

        /* JADX INFO: renamed from: f */
        public MapMakerInternalMap<K, V, E, S>.C2863x f11028f;

        /* JADX INFO: renamed from: g */
        public MapMakerInternalMap<K, V, E, S>.C2863x f11029g;

        public AbstractC2846g() {
            this.f11023a = MapMakerInternalMap.this.segments.length - 1;
            m15955a();
        }

        /* JADX INFO: renamed from: a */
        public final void m15955a() {
            this.f11028f = null;
            if (m15958d() || m15959e()) {
                return;
            }
            while (true) {
                int i = this.f11023a;
                if (i < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.segments;
                this.f11023a = i - 1;
                Segment<K, V, E, S> segment = segmentArr[i];
                this.f11025c = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11025c.table;
                    this.f11026d = atomicReferenceArray;
                    this.f11024b = atomicReferenceArray.length() - 1;
                    if (m15959e()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m15956b(E e) {
            Segment<K, V, E, S> segment;
            try {
                Object key = e.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(e);
                if (liveValue == null) {
                    return false;
                }
                this.f11028f = new C2863x(key, liveValue);
                return true;
            } finally {
                this.f11025c.postReadCleanup();
            }
        }

        /* JADX INFO: renamed from: c */
        public MapMakerInternalMap<K, V, E, S>.C2863x m15957c() {
            MapMakerInternalMap<K, V, E, S>.C2863x c2863x = this.f11028f;
            if (c2863x == null) {
                lmr.m150601a();
                return null;
            }
            this.f11029g = c2863x;
            m15955a();
            return this.f11029g;
        }

        /* JADX INFO: renamed from: d */
        public boolean m15958d() {
            E e = this.f11027e;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f11027e = (E) e.getNext();
                E e2 = this.f11027e;
                if (e2 == null) {
                    return false;
                }
                if (m15956b(e2)) {
                    return true;
                }
                e = this.f11027e;
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m15959e() {
            while (true) {
                int i = this.f11024b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11026d;
                this.f11024b = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f11027e = e;
                if (e != null && (m15956b(e) || m15958d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11028f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            sd5.m183447e(this.f11029g != null);
            MapMakerInternalMap.this.remove(this.f11029g.getKey());
            this.f11029g = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$h */
    public interface InterfaceC2847h<K, V, E extends InterfaceC2847h<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$i */
    public interface InterfaceC2848i<K, V, E extends InterfaceC2847h<K, V, E>, S extends Segment<K, V, E, S>> {
        /* JADX INFO: renamed from: a */
        void mo15960a(S s, E e, V v2);

        /* JADX INFO: renamed from: b */
        Strength mo15961b();

        /* JADX INFO: renamed from: c */
        E mo15962c(S s, E e, E e2);

        /* JADX INFO: renamed from: d */
        Strength mo15963d();

        /* JADX INFO: renamed from: e */
        E mo15964e(S s, K k, int i, E e);

        /* JADX INFO: renamed from: f */
        S mo15965f(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$j */
    public final class C2849j extends MapMakerInternalMap<K, V, E, S>.AbstractC2846g<K> {
        public C2849j(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m15957c().getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$k */
    public final class C2850k extends AbstractC2851l<K> {
        public C2850k() {
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
            return new C2849j(MapMakerInternalMap.this);
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
    public static final class C2852m<K> extends AbstractC2841b<K, MapMaker.Dummy, C2852m<K>> implements InterfaceC2847h {

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$m$a */
        public static final class a<K> implements InterfaceC2848i<K, MapMaker.Dummy, C2852m<K>, StrongKeyDummyValueSegment<K>> {
            private static final a<?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K> a<K> m15968h() {
                return (a<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: b */
            public Strength mo15961b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: d */
            public Strength mo15963d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2852m<K> mo15962c(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, C2852m<K> c2852m, C2852m<K> c2852m2) {
                return c2852m.m15966a(c2852m2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2852m<K> mo15964e(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, C2852m<K> c2852m) {
                return new C2852m<>(k, i, c2852m);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyDummyValueSegment<K> mo15965f(MapMakerInternalMap<K, MapMaker.Dummy, C2852m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo15960a(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, C2852m<K> c2852m, MapMaker.Dummy dummy) {
            }
        }

        public C2852m(K k, int i, C2852m<K> c2852m) {
            super(k, i, c2852m);
        }

        /* JADX INFO: renamed from: a */
        public C2852m<K> m15966a(C2852m<K> c2852m) {
            return new C2852m<>(this.f11017a, this.f11018b, c2852m);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$n */
    public static final class C2853n<K, V> extends AbstractC2841b<K, V, C2853n<K, V>> implements InterfaceC2847h {

        /* JADX INFO: renamed from: d */
        public volatile V f11032d;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$n$a */
        public static final class a<K, V> implements InterfaceC2848i<K, V, C2853n<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m15975h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: b */
            public Strength mo15961b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: d */
            public Strength mo15963d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2853n<K, V> mo15962c(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, C2853n<K, V> c2853n, C2853n<K, V> c2853n2) {
                return c2853n.m15973a(c2853n2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2853n<K, V> mo15964e(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, C2853n<K, V> c2853n) {
                return new C2853n<>(k, i, c2853n);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyStrongValueSegment<K, V> mo15965f(MapMakerInternalMap<K, V, C2853n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo15960a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, C2853n<K, V> c2853n, V v2) {
                c2853n.m15974b(v2);
            }
        }

        public C2853n(K k, int i, C2853n<K, V> c2853n) {
            super(k, i, c2853n);
            this.f11032d = null;
        }

        /* JADX INFO: renamed from: a */
        public C2853n<K, V> m15973a(C2853n<K, V> c2853n) {
            C2853n<K, V> c2853n2 = new C2853n<>(this.f11017a, this.f11018b, c2853n);
            c2853n2.f11032d = this.f11032d;
            return c2853n2;
        }

        /* JADX INFO: renamed from: b */
        public void m15974b(V v2) {
            this.f11032d = v2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public V getValue() {
            return this.f11032d;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$o */
    public static final class C2854o<K, V> extends AbstractC2841b<K, V, C2854o<K, V>> implements InterfaceC2860u<K, V, C2854o<K, V>> {

        /* JADX INFO: renamed from: d */
        public volatile InterfaceC2861v<K, V, C2854o<K, V>> f11033d;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$o$a */
        public static final class a<K, V> implements InterfaceC2848i<K, V, C2854o<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m15984h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: b */
            public Strength mo15961b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: d */
            public Strength mo15963d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2854o<K, V> mo15962c(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, C2854o<K, V> c2854o, C2854o<K, V> c2854o2) {
                if (Segment.isCollected(c2854o)) {
                    return null;
                }
                return c2854o.m15982c(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues, c2854o2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2854o<K, V> mo15964e(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, C2854o<K, V> c2854o) {
                return new C2854o<>(k, i, c2854o);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyWeakValueSegment<K, V> mo15965f(MapMakerInternalMap<K, V, C2854o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo15960a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, C2854o<K, V> c2854o, V v2) {
                c2854o.m15983d(v2, ((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues);
            }
        }

        public C2854o(K k, int i, C2854o<K, V> c2854o) {
            super(k, i, c2854o);
            this.f11033d = MapMakerInternalMap.unsetWeakValueReference();
        }

        /* JADX INFO: renamed from: c */
        public C2854o<K, V> m15982c(ReferenceQueue<V> referenceQueue, C2854o<K, V> c2854o) {
            C2854o<K, V> c2854o2 = new C2854o<>(this.f11017a, this.f11018b, c2854o);
            c2854o2.f11033d = this.f11033d.mo15950b(referenceQueue, c2854o2);
            return c2854o2;
        }

        /* JADX INFO: renamed from: d */
        public void m15983d(V v2, ReferenceQueue<V> referenceQueue) {
            InterfaceC2861v<K, V, C2854o<K, V>> interfaceC2861v = this.f11033d;
            this.f11033d = new C2862w(referenceQueue, v2, this);
            interfaceC2861v.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public V getValue() {
            return this.f11033d.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2860u
        public InterfaceC2861v<K, V, C2854o<K, V>> getValueReference() {
            return this.f11033d;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$p */
    public final class C2855p extends MapMakerInternalMap<K, V, E, S>.AbstractC2846g<V> {
        public C2855p(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m15957c().getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$r */
    public static final class C2857r<K> extends AbstractC2842c<K, MapMaker.Dummy, C2857r<K>> implements InterfaceC2847h {

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$r$a */
        public static final class a<K> implements InterfaceC2848i<K, MapMaker.Dummy, C2857r<K>, WeakKeyDummyValueSegment<K>> {
            private static final a<?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K> a<K> m15991h() {
                return (a<K>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: b */
            public Strength mo15961b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: d */
            public Strength mo15963d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2857r<K> mo15962c(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, C2857r<K> c2857r, C2857r<K> c2857r2) {
                if (c2857r.getKey() == null) {
                    return null;
                }
                return c2857r.m15989a(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, c2857r2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2857r<K> mo15964e(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, C2857r<K> c2857r) {
                return new C2857r<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys, k, i, c2857r);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyDummyValueSegment<K> mo15965f(MapMakerInternalMap<K, MapMaker.Dummy, C2857r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo15960a(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, C2857r<K> c2857r, MapMaker.Dummy dummy) {
            }
        }

        public C2857r(ReferenceQueue<K> referenceQueue, K k, int i, C2857r<K> c2857r) {
            super(referenceQueue, k, i, c2857r);
        }

        /* JADX INFO: renamed from: a */
        public C2857r<K> m15989a(ReferenceQueue<K> referenceQueue, C2857r<K> c2857r) {
            return new C2857r<>(referenceQueue, getKey(), this.f11020a, c2857r);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$s */
    public static final class C2858s<K, V> extends AbstractC2842c<K, V, C2858s<K, V>> implements InterfaceC2847h {

        /* JADX INFO: renamed from: c */
        public volatile V f11035c;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$s$a */
        public static final class a<K, V> implements InterfaceC2848i<K, V, C2858s<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m15998h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: b */
            public Strength mo15961b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: d */
            public Strength mo15963d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2858s<K, V> mo15962c(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, C2858s<K, V> c2858s, C2858s<K, V> c2858s2) {
                if (c2858s.getKey() == null) {
                    return null;
                }
                return c2858s.m15996a(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, c2858s2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2858s<K, V> mo15964e(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, C2858s<K, V> c2858s) {
                return new C2858s<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i, c2858s);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyStrongValueSegment<K, V> mo15965f(MapMakerInternalMap<K, V, C2858s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo15960a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, C2858s<K, V> c2858s, V v2) {
                c2858s.m15997b(v2);
            }
        }

        public C2858s(ReferenceQueue<K> referenceQueue, K k, int i, C2858s<K, V> c2858s) {
            super(referenceQueue, k, i, c2858s);
            this.f11035c = null;
        }

        /* JADX INFO: renamed from: a */
        public C2858s<K, V> m15996a(ReferenceQueue<K> referenceQueue, C2858s<K, V> c2858s) {
            C2858s<K, V> c2858s2 = new C2858s<>(referenceQueue, getKey(), this.f11020a, c2858s);
            c2858s2.m15997b(this.f11035c);
            return c2858s2;
        }

        /* JADX INFO: renamed from: b */
        public void m15997b(V v2) {
            this.f11035c = v2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public V getValue() {
            return this.f11035c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$t */
    public static final class C2859t<K, V> extends AbstractC2842c<K, V, C2859t<K, V>> implements InterfaceC2860u<K, V, C2859t<K, V>> {

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC2861v<K, V, C2859t<K, V>> f11036c;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$t$a */
        public static final class a<K, V> implements InterfaceC2848i<K, V, C2859t<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static final a<?, ?> INSTANCE = new a<>();

            /* JADX INFO: renamed from: h */
            public static <K, V> a<K, V> m16007h() {
                return (a<K, V>) INSTANCE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: b */
            public Strength mo15961b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: d */
            public Strength mo15963d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C2859t<K, V> mo15962c(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, C2859t<K, V> c2859t, C2859t<K, V> c2859t2) {
                if (c2859t.getKey() == null || Segment.isCollected(c2859t)) {
                    return null;
                }
                return c2859t.m16005c(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues, c2859t2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C2859t<K, V> mo15964e(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, C2859t<K, V> c2859t) {
                return new C2859t<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i, c2859t);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyWeakValueSegment<K, V> mo15965f(MapMakerInternalMap<K, V, C2859t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2848i
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void mo15960a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, C2859t<K, V> c2859t, V v2) {
                c2859t.m16006d(v2, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForValues);
            }
        }

        public C2859t(ReferenceQueue<K> referenceQueue, K k, int i, C2859t<K, V> c2859t) {
            super(referenceQueue, k, i, c2859t);
            this.f11036c = MapMakerInternalMap.unsetWeakValueReference();
        }

        /* JADX INFO: renamed from: c */
        public C2859t<K, V> m16005c(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C2859t<K, V> c2859t) {
            C2859t<K, V> c2859t2 = new C2859t<>(referenceQueue, getKey(), this.f11020a, c2859t);
            c2859t2.f11036c = this.f11036c.mo15950b(referenceQueue2, c2859t2);
            return c2859t2;
        }

        /* JADX INFO: renamed from: d */
        public void m16006d(V v2, ReferenceQueue<V> referenceQueue) {
            InterfaceC2861v<K, V, C2859t<K, V>> interfaceC2861v = this.f11036c;
            this.f11036c = new C2862w(referenceQueue, v2, this);
            interfaceC2861v.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2847h
        public V getValue() {
            return this.f11036c.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2860u
        public InterfaceC2861v<K, V, C2859t<K, V>> getValueReference() {
            return this.f11036c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$u */
    public interface InterfaceC2860u<K, V, E extends InterfaceC2847h<K, V, E>> extends InterfaceC2847h<K, V, E> {
        InterfaceC2861v<K, V, E> getValueReference();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$v */
    public interface InterfaceC2861v<K, V, E extends InterfaceC2847h<K, V, E>> {
        /* JADX INFO: renamed from: a */
        E mo15949a();

        /* JADX INFO: renamed from: b */
        InterfaceC2861v<K, V, E> mo15950b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$w */
    public static final class C2862w<K, V, E extends InterfaceC2847h<K, V, E>> extends WeakReference<V> implements InterfaceC2861v<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final E f11037a;

        public C2862w(ReferenceQueue<V> referenceQueue, V v2, E e) {
            super(v2, referenceQueue);
            this.f11037a = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2861v
        /* JADX INFO: renamed from: a */
        public E mo15949a() {
            return this.f11037a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC2861v
        /* JADX INFO: renamed from: b */
        public InterfaceC2861v<K, V, E> mo15950b(ReferenceQueue<V> referenceQueue, E e) {
            return new C2862w(referenceQueue, get(), e);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$x */
    public final class C2863x extends AbstractC19437q7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f11038a;

        /* JADX INFO: renamed from: b */
        public V f11039b;

        public C2863x(K k, V v2) {
            this.f11038a = k;
            this.f11039b = v2;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f11038a.equals(entry.getKey()) && this.f11039b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K getKey() {
            return this.f11038a;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V getValue() {
            return this.f11039b;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public int hashCode() {
            return this.f11039b.hashCode() ^ this.f11038a.hashCode();
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = (V) MapMakerInternalMap.this.put(this.f11038a, v2);
            this.f11039b = v2;
            return v3;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InterfaceC2848i<K, V, E, S> interfaceC2848i) {
        this.concurrencyLevel = Math.min(mapMaker.m15938b(), 65536);
        this.keyEquivalence = mapMaker.m15940d();
        this.entryHelper = interfaceC2848i;
        int iMin = Math.min(mapMaker.m15939c(), 1073741824);
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

    public static <K, V> MapMakerInternalMap<K, V, ? extends InterfaceC2847h<K, V, ?>, ?> create(MapMaker mapMaker) {
        Strength strengthM15941e = mapMaker.m15941e();
        Strength strength = Strength.STRONG;
        if (strengthM15941e == strength && mapMaker.m15942f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2853n.a.m15975h());
        }
        if (mapMaker.m15941e() == strength && mapMaker.m15942f() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, C2854o.a.m15984h());
        }
        Strength strengthM15941e2 = mapMaker.m15941e();
        Strength strength2 = Strength.WEAK;
        if (strengthM15941e2 == strength2 && mapMaker.m15942f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2858s.a.m15998h());
        }
        if (mapMaker.m15941e() == strength2 && mapMaker.m15942f() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, C2859t.a.m16007h());
        }
        shg0.m184191a();
        return null;
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends InterfaceC2847h<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
        Strength strengthM15941e = mapMaker.m15941e();
        Strength strength = Strength.STRONG;
        if (strengthM15941e == strength && mapMaker.m15942f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2852m.a.m15968h());
        }
        Strength strengthM15941e2 = mapMaker.m15941e();
        Strength strength2 = Strength.WEAK;
        if (strengthM15941e2 == strength2 && mapMaker.m15942f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C2857r.a.m15991h());
        }
        if (mapMaker.m15942f() == strength2) {
            ig3.m135964a("Map cannot have both weak and dummy values");
            return null;
        }
        shg0.m184191a();
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
        Iterators.m15871a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V, E extends InterfaceC2847h<K, V, E>> InterfaceC2861v<K, V, E> unsetWeakValueReference() {
        return (InterfaceC2861v<K, V, E>) UNSET_WEAK_VALUE_REFERENCE;
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
        return this.entryHelper.mo15965f(this, i, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C2845f c2845f = new C2845f();
        this.entrySet = c2845f;
        return c2845f;
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

    public boolean isLiveForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
        return segmentFor(interfaceC2847h.getHash()).getLiveValueForTesting(interfaceC2847h) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C2850k c2850k = new C2850k();
        this.keySet = c2850k;
        return c2850k;
    }

    public Strength keyStrength() {
        return this.entryHelper.mo15961b();
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        sf80.m183894p(k);
        sf80.m183894p(v2);
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
        sf80.m183894p(k);
        sf80.m183894p(v2);
        int iHash = hash(k);
        return segmentFor(iHash).put(k, iHash, v2, true);
    }

    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reclaimValue(InterfaceC2861v<K, V, E> interfaceC2861v) {
        InterfaceC2847h interfaceC2847hMo15949a = interfaceC2861v.mo15949a();
        int hash = interfaceC2847hMo15949a.getHash();
        segmentFor(hash).reclaimValue(interfaceC2847hMo15949a.getKey(), hash, interfaceC2861v);
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
        sf80.m183894p(k);
        sf80.m183894p(v3);
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
        return Ints.m16468m(j);
    }

    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.mo15963d().defaultEquivalence();
    }

    public Strength valueStrength() {
        return this.entryHelper.mo15963d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        C2856q c2856q = new C2856q();
        this.values = c2856q;
        return c2856q;
    }

    public Object writeReplace() {
        return new SerializationProxy(this.entryHelper.mo15961b(), this.entryHelper.mo15963d(), this.keyEquivalence, this.entryHelper.mo15963d().defaultEquivalence(), this.concurrencyLevel, this);
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

        /* synthetic */ Strength(C2840a c2840a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$l */
    public static abstract class AbstractC2851l<E> extends AbstractSet<E> {
        public AbstractC2851l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.toArrayList(this).toArray();
        }

        public /* synthetic */ AbstractC2851l(C2840a c2840a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.toArrayList(this).toArray(tArr);
        }
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C2852m<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C2852m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2852m<K> castForTesting(InterfaceC2847h<K, MapMaker.Dummy, ?> interfaceC2847h) {
            return (C2852m) interfaceC2847h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, C2853n<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, C2853n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2853n<K, V> castForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return (C2853n) interfaceC2847h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C2854o<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, C2854o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC2861v<K, V, C2854o<K, V>> getWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return castForTesting((InterfaceC2847h) interfaceC2847h).getValueReference();
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
        public InterfaceC2861v<K, V, C2854o<K, V>> newWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, V v2) {
            return new C2862w(this.queueForValues, v2, castForTesting((InterfaceC2847h) interfaceC2847h));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, InterfaceC2861v<K, V, ? extends InterfaceC2847h<K, V, ?>> interfaceC2861v) {
            C2854o<K, V> c2854oCastForTesting = castForTesting((InterfaceC2847h) interfaceC2847h);
            InterfaceC2861v interfaceC2861v2 = c2854oCastForTesting.f11033d;
            c2854oCastForTesting.f11033d = interfaceC2861v;
            interfaceC2861v2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2854o<K, V> castForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return (C2854o) interfaceC2847h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C2857r<K>, WeakKeyDummyValueSegment<K>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C2857r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
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
        public C2857r<K> castForTesting(InterfaceC2847h<K, MapMaker.Dummy, ?> interfaceC2847h) {
            return (C2857r) interfaceC2847h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, C2858s<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, C2858s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
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
        public C2858s<K, V> castForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return (C2858s) interfaceC2847h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C2859t<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, C2859t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
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
        public InterfaceC2861v<K, V, C2859t<K, V>> getWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return castForTesting((InterfaceC2847h) interfaceC2847h).getValueReference();
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
        public InterfaceC2861v<K, V, C2859t<K, V>> newWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, V v2) {
            return new C2862w(this.queueForValues, v2, castForTesting((InterfaceC2847h) interfaceC2847h));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, InterfaceC2861v<K, V, ? extends InterfaceC2847h<K, V, ?>> interfaceC2861v) {
            C2859t<K, V> c2859tCastForTesting = castForTesting((InterfaceC2847h) interfaceC2847h);
            InterfaceC2861v interfaceC2861v2 = c2859tCastForTesting.f11036c;
            c2859tCastForTesting.f11036c = interfaceC2861v;
            interfaceC2861v2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C2859t<K, V> castForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return (C2859t) interfaceC2847h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }
    }

    public static abstract class AbstractSerializationProxy<K, V> extends rzi<K, V> implements Serializable {
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
            return new MapMaker().m15943g(objectInputStream.readInt()).m15946j(this.keyStrength).m15947k(this.valueStrength).m15944h(this.keyEquivalence).m15937a(this.concurrencyLevel);
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        @Override // p149l.rzi, p149l.xzi, p149l.a0j
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$q */
    public final class C2856q extends AbstractCollection<V> {
        public C2856q() {
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
            return new C2855p(MapMakerInternalMap.this);
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
        sf80.m183894p(k);
        sf80.m183894p(v2);
        int iHash = hash(k);
        return segmentFor(iHash).replace(k, iHash, v2);
    }

    public static abstract class Segment<K, V, E extends InterfaceC2847h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
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

        public static <K, V, E extends InterfaceC2847h<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        public abstract E castForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h);

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

        public boolean clearValueForTesting(K k, int i, InterfaceC2861v<K, V, ? extends InterfaceC2847h<K, V, ?>> interfaceC2861v) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2847h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((InterfaceC2860u) next).getValueReference() != interfaceC2861v) {
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
                InterfaceC2847h liveEntry = getLiveEntry(obj, i);
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
            return (E) this.map.entryHelper.mo15962c(self(), e, e2);
        }

        public E copyForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, InterfaceC2847h<K, V, ?> interfaceC2847h2) {
            return (E) this.map.entryHelper.mo15962c(self(), castForTesting(interfaceC2847h), castForTesting(interfaceC2847h2));
        }

        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.reclaimKey((InterfaceC2847h) referencePoll);
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
                this.map.reclaimValue((InterfaceC2861v) referencePoll);
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
                    InterfaceC2847h next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InterfaceC2847h interfaceC2847h = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC2847h = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, interfaceC2847h);
                        while (next != interfaceC2847h) {
                            int hash3 = next.getHash() & length2;
                            InterfaceC2847h interfaceC2847hCopyEntry = copyEntry(next, (InterfaceC2847h) atomicReferenceArrayNewEntryArray.get(hash3));
                            if (interfaceC2847hCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, interfaceC2847hCopyEntry);
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
                InterfaceC2847h liveEntry = getLiveEntry(obj, i);
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

        public V getLiveValueForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return getLiveValue(castForTesting(interfaceC2847h));
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public InterfaceC2861v<K, V, E> getWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
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

        public E newEntryForTesting(K k, int i, InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return (E) this.map.entryHelper.mo15964e(self(), k, i, castForTesting(interfaceC2847h));
        }

        public InterfaceC2861v<K, V, E> newWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, V v2) {
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
                for (InterfaceC2847h next = e; next != null; next = next.getNext()) {
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
                InterfaceC2847h interfaceC2847hMo15964e = this.map.entryHelper.mo15964e(self(), k, i, e);
                setValue(interfaceC2847hMo15964e, v2);
                atomicReferenceArray.set(length, (E) interfaceC2847hMo15964e);
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
                for (InterfaceC2847h next = e2; next != null; next = next.getNext()) {
                    if (next == e) {
                        this.modCount++;
                        InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e2, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
                        this.count = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean reclaimValue(K k, int i, InterfaceC2861v<K, V, E> interfaceC2861v) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2847h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((InterfaceC2860u) next).getValueReference() != interfaceC2861v) {
                            return false;
                        }
                        this.modCount++;
                        InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
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
                InterfaceC2847h next = e;
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
                        InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
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
            for (InterfaceC2847h next = e2; next != null; next = next.getNext()) {
                if (next == e) {
                    this.modCount++;
                    InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e2, next);
                    int i = this.count - 1;
                    atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
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
                InterfaceC2847h interfaceC2847hCopyEntry = copyEntry(e, e3);
                if (interfaceC2847hCopyEntry != null) {
                    e3 = (E) interfaceC2847hCopyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        public E removeFromChainForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, InterfaceC2847h<K, V, ?> interfaceC2847h2) {
            return (E) removeFromChain(castForTesting(interfaceC2847h), castForTesting(interfaceC2847h2));
        }

        public boolean removeTableEntryForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h) {
            return removeEntryForTesting(castForTesting(interfaceC2847h));
        }

        public boolean replace(K k, int i, V v2, V v3) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC2847h next = e; next != null; next = next.getNext()) {
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
                            InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e, next);
                            int i2 = this.count - 1;
                            atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
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

        public void setTableEntryForTesting(int i, InterfaceC2847h<K, V, ?> interfaceC2847h) {
            this.table.set(i, (E) castForTesting(interfaceC2847h));
        }

        public void setValue(E e, V v2) {
            this.map.entryHelper.mo15960a(self(), e, v2);
        }

        public void setValueForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, V v2) {
            this.map.entryHelper.mo15960a(self(), castForTesting(interfaceC2847h), v2);
        }

        public void setWeakValueReferenceForTesting(InterfaceC2847h<K, V, ?> interfaceC2847h, InterfaceC2861v<K, V, ? extends InterfaceC2847h<K, V, ?>> interfaceC2861v) {
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
                for (InterfaceC2847h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null && !isCollected(next)) {
                            return null;
                        }
                        this.modCount++;
                        InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
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
                for (InterfaceC2847h next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v3 = (V) next.getValue();
                        if (v3 == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                InterfaceC2847h interfaceC2847hRemoveFromChain = removeFromChain(e, next);
                                int i2 = this.count - 1;
                                atomicReferenceArray.set(length, (E) interfaceC2847hRemoveFromChain);
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
