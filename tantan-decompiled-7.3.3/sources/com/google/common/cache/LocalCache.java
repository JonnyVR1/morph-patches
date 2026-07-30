package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.C3103e;
import com.google.common.util.concurrent.C3105g;
import com.google.common.util.concurrent.C3106h;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.AbstractC20777v7;
import p153l.C21256x6;
import p153l.InterfaceC21523y6;
import p153l.adj;
import p153l.aqg0;
import p153l.azc0;
import p153l.fzi0;
import p153l.hpr;
import p153l.hy3;
import p153l.k2j;
import p153l.mor;
import p153l.qwp0;
import p153l.qxj0;
import p153l.s5g0;
import p153l.ux3;
import p153l.wtv;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: w */
    public static final Logger f10699w = Logger.getLogger(LocalCache.class.getName());

    /* JADX INFO: renamed from: x */
    public static final InterfaceC2718s<Object, Object> f10700x = new C2696a();

    /* JADX INFO: renamed from: y */
    public static final Queue<?> f10701y = new C2698b();

    /* JADX INFO: renamed from: a */
    public final int f10702a;

    /* JADX INFO: renamed from: b */
    public final int f10703b;

    /* JADX INFO: renamed from: c */
    public final Segment<K, V>[] f10704c;

    /* JADX INFO: renamed from: d */
    public final int f10705d;

    /* JADX INFO: renamed from: e */
    public final Equivalence<Object> f10706e;

    /* JADX INFO: renamed from: f */
    public final Equivalence<Object> f10707f;

    /* JADX INFO: renamed from: g */
    public final Strength f10708g;

    /* JADX INFO: renamed from: h */
    public final Strength f10709h;

    /* JADX INFO: renamed from: i */
    public final long f10710i;

    /* JADX INFO: renamed from: j */
    public final qwp0<K, V> f10711j;

    /* JADX INFO: renamed from: k */
    public final long f10712k;

    /* JADX INFO: renamed from: l */
    public final long f10713l;

    /* JADX INFO: renamed from: m */
    public final long f10714m;

    /* JADX INFO: renamed from: n */
    public final Queue<RemovalNotification<K, V>> f10715n;

    /* JADX INFO: renamed from: o */
    public final azc0<K, V> f10716o;

    /* JADX INFO: renamed from: p */
    public final fzi0 f10717p;

    /* JADX INFO: renamed from: q */
    public final EntryFactory f10718q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC21523y6 f10719r;

    /* JADX INFO: renamed from: s */
    public final CacheLoader<? super K, V> f10720s;

    /* JADX INFO: renamed from: t */
    public Set<K> f10721t;

    /* JADX INFO: renamed from: u */
    public Collection<V> f10722u;

    /* JADX INFO: renamed from: v */
    public Set<Map.Entry<K, V>> f10723v;

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements wtv<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        transient wtv<K, V> autoDelegate;

        public LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (wtv<K, V>) recreateCacheBuilder().m15509b(this.loader);
        }

        private Object readResolve() {
            return this.autoDelegate;
        }

        @Override // p153l.wtv, p153l.adj
        public final V apply(K k) {
            return this.autoDelegate.apply(k);
        }

        @Override // p153l.wtv
        public V get(K k) throws ExecutionException {
            return this.autoDelegate.get(k);
        }

        @Override // p153l.wtv
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // p153l.wtv
        public V getUnchecked(K k) {
            return this.autoDelegate.getUnchecked(k);
        }

        @Override // p153l.wtv
        public void refresh(K k) {
            this.autoDelegate.refresh(k);
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements wtv<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) xn80.m212111p(cacheLoader)), null);
        }

        @Override // p153l.wtv, p153l.adj
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // p153l.wtv
        public V get(K k) throws ExecutionException {
            return this.localCache.m15576p(k);
        }

        @Override // p153l.wtv
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.localCache.m15572l(iterable);
        }

        @Override // p153l.wtv
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // p153l.wtv
        public void refresh(K k) {
            this.localCache.m15556F(k);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    public enum NullEntry implements InterfaceC2735a<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.InterfaceC2735a
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2718s<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setNextInAccessQueue(InterfaceC2735a<Object, Object> interfaceC2735a) {
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setNextInWriteQueue(InterfaceC2735a<Object, Object> interfaceC2735a) {
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setPreviousInAccessQueue(InterfaceC2735a<Object, Object> interfaceC2735a) {
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setPreviousInWriteQueue(InterfaceC2735a<Object, Object> interfaceC2735a) {
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setValueReference(InterfaceC2718s<Object, Object> interfaceC2718s) {
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setWriteTime(long j) {
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$a */
    public class C2696a implements InterfaceC2718s<Object, Object> {
        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: a */
        public InterfaceC2735a<Object, Object> mo15584a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: b */
        public void mo15585b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: d */
        public Object mo15587d() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<Object, Object> mo15588e(ReferenceQueue<Object> referenceQueue, Object obj, InterfaceC2735a<Object, Object> interfaceC2735a) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: k */
        public boolean mo15589k() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$a0 */
    public static final class C2697a0<K, V> extends C2715p<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f10730b;

        public C2697a0(V v2, int i) {
            super(v2);
            this.f10730b = i;
        }

        @Override // com.google.common.cache.LocalCache.C2715p, com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return this.f10730b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$b */
    public class C2698b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.m15822of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$b0 */
    public static final class C2699b0<K, V> extends C2723x<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f10731b;

        public C2699b0(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a, int i) {
            super(referenceQueue, v2, interfaceC2735a);
            this.f10731b = i;
        }

        @Override // com.google.common.cache.LocalCache.C2723x, com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return this.f10731b;
        }

        @Override // com.google.common.cache.LocalCache.C2723x, com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            return new C2699b0(referenceQueue, v2, interfaceC2735a, this.f10731b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c0 */
    public static final class C2701c0<K, V> extends AbstractQueue<InterfaceC2735a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2735a<K, V> f10733a = new a(this);

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c0$a */
        public class a extends AbstractC2702d<K, V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC2735a<K, V> f10734a = this;

            /* JADX INFO: renamed from: b */
            public InterfaceC2735a<K, V> f10735b = this;

            public a(C2701c0 c2701c0) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public InterfaceC2735a<K, V> getNextInWriteQueue() {
                return this.f10734a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
                return this.f10735b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
                this.f10734a = interfaceC2735a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
                this.f10735b = interfaceC2735a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public void setWriteTime(long j) {
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c0$b */
        public class b extends AbstractC20777v7<InterfaceC2735a<K, V>> {
            public b(InterfaceC2735a interfaceC2735a) {
                super(interfaceC2735a);
            }

            @Override // p153l.AbstractC20777v7
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC2735a<K, V> mo15593a(InterfaceC2735a<K, V> interfaceC2735a) {
                InterfaceC2735a<K, V> nextInWriteQueue = interfaceC2735a.getNextInWriteQueue();
                if (nextInWriteQueue == C2701c0.this.f10733a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(InterfaceC2735a<K, V> interfaceC2735a) {
            LocalCache.m15546d(interfaceC2735a.getPreviousInWriteQueue(), interfaceC2735a.getNextInWriteQueue());
            LocalCache.m15546d(this.f10733a.getPreviousInWriteQueue(), interfaceC2735a);
            LocalCache.m15546d(interfaceC2735a, this.f10733a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2735a<K, V> peek() {
            InterfaceC2735a<K, V> nextInWriteQueue = this.f10733a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f10733a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            InterfaceC2735a<K, V> nextInWriteQueue = this.f10733a.getNextInWriteQueue();
            while (true) {
                InterfaceC2735a<K, V> interfaceC2735a = this.f10733a;
                if (nextInWriteQueue == interfaceC2735a) {
                    interfaceC2735a.setNextInWriteQueue(interfaceC2735a);
                    InterfaceC2735a<K, V> interfaceC2735a2 = this.f10733a;
                    interfaceC2735a2.setPreviousInWriteQueue(interfaceC2735a2);
                    return;
                } else {
                    InterfaceC2735a<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.m15550y(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((InterfaceC2735a) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC2735a<K, V> poll() {
            InterfaceC2735a<K, V> nextInWriteQueue = this.f10733a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f10733a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f10733a.getNextInWriteQueue() == this.f10733a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<InterfaceC2735a<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            InterfaceC2735a interfaceC2735a = (InterfaceC2735a) obj;
            InterfaceC2735a<K, V> previousInWriteQueue = interfaceC2735a.getPreviousInWriteQueue();
            InterfaceC2735a<K, V> nextInWriteQueue = interfaceC2735a.getNextInWriteQueue();
            LocalCache.m15546d(previousInWriteQueue, nextInWriteQueue);
            LocalCache.m15550y(interfaceC2735a);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (InterfaceC2735a<K, V> nextInWriteQueue = this.f10733a.getNextInWriteQueue(); nextInWriteQueue != this.f10733a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$d */
    public static abstract class AbstractC2702d<K, V> implements InterfaceC2735a<K, V> {
        @Override // com.google.common.cache.InterfaceC2735a
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2718s<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setValueReference(InterfaceC2718s<K, V> interfaceC2718s) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$d0 */
    public final class C2703d0 implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10737a;

        /* JADX INFO: renamed from: b */
        public V f10738b;

        public C2703d0(K k, V v2) {
            this.f10737a = k;
            this.f10738b = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f10737a.equals(entry.getKey()) && this.f10738b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10737a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10738b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10738b.hashCode() ^ this.f10737a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = (V) LocalCache.this.put(this.f10737a, v2);
            this.f10738b = v2;
            return v3;
        }

        public String toString() {
            String strValueOf = String.valueOf(getKey());
            String strValueOf2 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$e */
    public static final class C2704e<K, V> extends AbstractQueue<InterfaceC2735a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2735a<K, V> f10740a = new a(this);

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$e$a */
        public class a extends AbstractC2702d<K, V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC2735a<K, V> f10741a = this;

            /* JADX INFO: renamed from: b */
            public InterfaceC2735a<K, V> f10742b = this;

            public a(C2704e c2704e) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public InterfaceC2735a<K, V> getNextInAccessQueue() {
                return this.f10741a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
                return this.f10742b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public void setAccessTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
                this.f10741a = interfaceC2735a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
            public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
                this.f10742b = interfaceC2735a;
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$e$b */
        public class b extends AbstractC20777v7<InterfaceC2735a<K, V>> {
            public b(InterfaceC2735a interfaceC2735a) {
                super(interfaceC2735a);
            }

            @Override // p153l.AbstractC20777v7
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC2735a<K, V> mo15593a(InterfaceC2735a<K, V> interfaceC2735a) {
                InterfaceC2735a<K, V> nextInAccessQueue = interfaceC2735a.getNextInAccessQueue();
                if (nextInAccessQueue == C2704e.this.f10740a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(InterfaceC2735a<K, V> interfaceC2735a) {
            LocalCache.m15545c(interfaceC2735a.getPreviousInAccessQueue(), interfaceC2735a.getNextInAccessQueue());
            LocalCache.m15545c(this.f10740a.getPreviousInAccessQueue(), interfaceC2735a);
            LocalCache.m15545c(interfaceC2735a, this.f10740a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2735a<K, V> peek() {
            InterfaceC2735a<K, V> nextInAccessQueue = this.f10740a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f10740a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            InterfaceC2735a<K, V> nextInAccessQueue = this.f10740a.getNextInAccessQueue();
            while (true) {
                InterfaceC2735a<K, V> interfaceC2735a = this.f10740a;
                if (nextInAccessQueue == interfaceC2735a) {
                    interfaceC2735a.setNextInAccessQueue(interfaceC2735a);
                    InterfaceC2735a<K, V> interfaceC2735a2 = this.f10740a;
                    interfaceC2735a2.setPreviousInAccessQueue(interfaceC2735a2);
                    return;
                } else {
                    InterfaceC2735a<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.m15549x(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((InterfaceC2735a) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC2735a<K, V> poll() {
            InterfaceC2735a<K, V> nextInAccessQueue = this.f10740a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f10740a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f10740a.getNextInAccessQueue() == this.f10740a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<InterfaceC2735a<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            InterfaceC2735a interfaceC2735a = (InterfaceC2735a) obj;
            InterfaceC2735a<K, V> previousInAccessQueue = interfaceC2735a.getPreviousInAccessQueue();
            InterfaceC2735a<K, V> nextInAccessQueue = interfaceC2735a.getNextInAccessQueue();
            LocalCache.m15545c(previousInAccessQueue, nextInAccessQueue);
            LocalCache.m15549x(interfaceC2735a);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (InterfaceC2735a<K, V> nextInAccessQueue = this.f10740a.getNextInAccessQueue(); nextInAccessQueue != this.f10740a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$f */
    public final class C2705f extends LocalCache<K, V>.AbstractC2707h<Map.Entry<K, V>> {
        public C2705f(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return m15602c();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$g */
    public final class C2706g extends LocalCache<K, V>.AbstractC2700c<Map.Entry<K, V>> {
        public C2706g() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.f10707f.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2705f(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$h */
    public abstract class AbstractC2707h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f10745a;

        /* JADX INFO: renamed from: b */
        public int f10746b = -1;

        /* JADX INFO: renamed from: c */
        public Segment<K, V> f10747c;

        /* JADX INFO: renamed from: d */
        public AtomicReferenceArray<InterfaceC2735a<K, V>> f10748d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2735a<K, V> f10749e;

        /* JADX INFO: renamed from: f */
        public LocalCache<K, V>.C2703d0 f10750f;

        /* JADX INFO: renamed from: g */
        public LocalCache<K, V>.C2703d0 f10751g;

        public AbstractC2707h() {
            this.f10745a = LocalCache.this.f10704c.length - 1;
            m15600a();
        }

        /* JADX INFO: renamed from: a */
        public final void m15600a() {
            this.f10750f = null;
            if (m15603d() || m15604e()) {
                return;
            }
            while (true) {
                int i = this.f10745a;
                if (i < 0) {
                    return;
                }
                Segment<K, V>[] segmentArr = LocalCache.this.f10704c;
                this.f10745a = i - 1;
                Segment<K, V> segment = segmentArr[i];
                this.f10747c = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.f10747c.table;
                    this.f10748d = atomicReferenceArray;
                    this.f10746b = atomicReferenceArray.length() - 1;
                    if (m15604e()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m15601b(InterfaceC2735a<K, V> interfaceC2735a) {
            Segment<K, V> segment;
            try {
                long jMo15540a = LocalCache.this.f10717p.mo15540a();
                K key = interfaceC2735a.getKey();
                Object objM15575o = LocalCache.this.m15575o(interfaceC2735a, jMo15540a);
                if (objM15575o == null) {
                    return false;
                }
                this.f10750f = new C2703d0(key, objM15575o);
                return true;
            } finally {
                this.f10747c.postReadCleanup();
            }
        }

        /* JADX INFO: renamed from: c */
        public LocalCache<K, V>.C2703d0 m15602c() {
            LocalCache<K, V>.C2703d0 c2703d0 = this.f10750f;
            if (c2703d0 == null) {
                mor.m159308a();
                return null;
            }
            this.f10751g = c2703d0;
            m15600a();
            return this.f10751g;
        }

        /* JADX INFO: renamed from: d */
        public boolean m15603d() {
            InterfaceC2735a<K, V> interfaceC2735a = this.f10749e;
            if (interfaceC2735a == null) {
                return false;
            }
            while (true) {
                this.f10749e = interfaceC2735a.getNext();
                InterfaceC2735a<K, V> interfaceC2735a2 = this.f10749e;
                if (interfaceC2735a2 == null) {
                    return false;
                }
                if (m15601b(interfaceC2735a2)) {
                    return true;
                }
                interfaceC2735a = this.f10749e;
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m15604e() {
            while (true) {
                int i = this.f10746b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.f10748d;
                this.f10746b = i - 1;
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(i);
                this.f10749e = interfaceC2735a;
                if (interfaceC2735a != null && (m15601b(interfaceC2735a) || m15603d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10750f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            xn80.m212117v(this.f10751g != null);
            LocalCache.this.remove(this.f10751g.getKey());
            this.f10751g = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$i */
    public final class C2708i extends LocalCache<K, V>.AbstractC2707h<K> {
        public C2708i(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m15602c().getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$j */
    public final class C2709j extends LocalCache<K, V>.AbstractC2700c<K> {
        public C2709j() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C2708i(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$l */
    public static class C2711l<K, V> extends SoftReference<V> implements InterfaceC2718s<K, V> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2735a<K, V> f10758a;

        public C2711l(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            super(v2, referenceQueue);
            this.f10758a = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: a */
        public InterfaceC2735a<K, V> mo15584a() {
            return this.f10758a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: b */
        public void mo15585b(V v2) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: d */
        public V mo15587d() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            return new C2711l(referenceQueue, v2, interfaceC2735a);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: k */
        public boolean mo15589k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$m */
    public static final class C2712m<K, V> extends C2714o<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f10759e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2735a<K, V> f10760f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2735a<K, V> f10761g;

        public C2712m(K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(k, i, interfaceC2735a);
            this.f10759e = Long.MAX_VALUE;
            this.f10760f = LocalCache.m15548w();
            this.f10761g = LocalCache.m15548w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public long getAccessTime() {
            return this.f10759e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInAccessQueue() {
            return this.f10760f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
            return this.f10761g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setAccessTime(long j) {
            this.f10759e = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10760f = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10761g = interfaceC2735a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$n */
    public static final class C2713n<K, V> extends C2714o<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f10762e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2735a<K, V> f10763f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2735a<K, V> f10764g;

        /* JADX INFO: renamed from: h */
        public volatile long f10765h;

        /* JADX INFO: renamed from: i */
        public InterfaceC2735a<K, V> f10766i;

        /* JADX INFO: renamed from: j */
        public InterfaceC2735a<K, V> f10767j;

        public C2713n(K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(k, i, interfaceC2735a);
            this.f10762e = Long.MAX_VALUE;
            this.f10763f = LocalCache.m15548w();
            this.f10764g = LocalCache.m15548w();
            this.f10765h = Long.MAX_VALUE;
            this.f10766i = LocalCache.m15548w();
            this.f10767j = LocalCache.m15548w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public long getAccessTime() {
            return this.f10762e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInAccessQueue() {
            return this.f10763f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInWriteQueue() {
            return this.f10766i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
            return this.f10764g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
            return this.f10767j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public long getWriteTime() {
            return this.f10765h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setAccessTime(long j) {
            this.f10762e = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10763f = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10766i = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10764g = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10767j = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setWriteTime(long j) {
            this.f10765h = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$o */
    public static class C2714o<K, V> extends AbstractC2702d<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10768a;

        /* JADX INFO: renamed from: b */
        public final int f10769b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2735a<K, V> f10770c;

        /* JADX INFO: renamed from: d */
        public volatile InterfaceC2718s<K, V> f10771d = LocalCache.m15543K();

        public C2714o(K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10768a = k;
            this.f10769b = i;
            this.f10770c = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public int getHash() {
            return this.f10769b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public K getKey() {
            return this.f10768a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNext() {
            return this.f10770c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2718s<K, V> getValueReference() {
            return this.f10771d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setValueReference(InterfaceC2718s<K, V> interfaceC2718s) {
            this.f10771d = interfaceC2718s;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$p */
    public static class C2715p<K, V> implements InterfaceC2718s<K, V> {

        /* JADX INFO: renamed from: a */
        public final V f10772a;

        public C2715p(V v2) {
            this.f10772a = v2;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: a */
        public InterfaceC2735a<K, V> mo15584a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: b */
        public void mo15585b(V v2) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: d */
        public V mo15587d() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public V get() {
            return this.f10772a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: k */
        public boolean mo15589k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$q */
    public static final class C2716q<K, V> extends C2714o<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f10773e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2735a<K, V> f10774f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2735a<K, V> f10775g;

        public C2716q(K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(k, i, interfaceC2735a);
            this.f10773e = Long.MAX_VALUE;
            this.f10774f = LocalCache.m15548w();
            this.f10775g = LocalCache.m15548w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInWriteQueue() {
            return this.f10774f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
            return this.f10775g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public long getWriteTime() {
            return this.f10773e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10774f = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10775g = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2702d, com.google.common.cache.InterfaceC2735a
        public void setWriteTime(long j) {
            this.f10773e = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$r */
    public final class C2717r extends LocalCache<K, V>.AbstractC2707h<V> {
        public C2717r(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m15602c().getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$s */
    public interface InterfaceC2718s<K, V> {
        /* JADX INFO: renamed from: a */
        InterfaceC2735a<K, V> mo15584a();

        /* JADX INFO: renamed from: b */
        void mo15585b(V v2);

        /* JADX INFO: renamed from: c */
        int mo15586c();

        /* JADX INFO: renamed from: d */
        V mo15587d() throws ExecutionException;

        /* JADX INFO: renamed from: e */
        InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a);

        V get();

        boolean isLoading();

        /* JADX INFO: renamed from: k */
        boolean mo15589k();
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$u */
    public static final class C2720u<K, V> extends C2722w<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f10777d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2735a<K, V> f10778e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2735a<K, V> f10779f;

        public C2720u(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(referenceQueue, k, i, interfaceC2735a);
            this.f10777d = Long.MAX_VALUE;
            this.f10778e = LocalCache.m15548w();
            this.f10779f = LocalCache.m15548w();
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public long getAccessTime() {
            return this.f10777d;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInAccessQueue() {
            return this.f10778e;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
            return this.f10779f;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setAccessTime(long j) {
            this.f10777d = j;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10778e = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10779f = interfaceC2735a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$v */
    public static final class C2721v<K, V> extends C2722w<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f10780d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2735a<K, V> f10781e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2735a<K, V> f10782f;

        /* JADX INFO: renamed from: g */
        public volatile long f10783g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2735a<K, V> f10784h;

        /* JADX INFO: renamed from: i */
        public InterfaceC2735a<K, V> f10785i;

        public C2721v(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(referenceQueue, k, i, interfaceC2735a);
            this.f10780d = Long.MAX_VALUE;
            this.f10781e = LocalCache.m15548w();
            this.f10782f = LocalCache.m15548w();
            this.f10783g = Long.MAX_VALUE;
            this.f10784h = LocalCache.m15548w();
            this.f10785i = LocalCache.m15548w();
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public long getAccessTime() {
            return this.f10780d;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInAccessQueue() {
            return this.f10781e;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInWriteQueue() {
            return this.f10784h;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
            return this.f10782f;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
            return this.f10785i;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public long getWriteTime() {
            return this.f10783g;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setAccessTime(long j) {
            this.f10780d = j;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10781e = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10784h = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10782f = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10785i = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setWriteTime(long j) {
            this.f10783g = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$w */
    public static class C2722w<K, V> extends WeakReference<K> implements InterfaceC2735a<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f10786a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2735a<K, V> f10787b;

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC2718s<K, V> f10788c;

        public C2722w(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(k, referenceQueue);
            this.f10788c = LocalCache.m15543K();
            this.f10786a = i;
            this.f10787b = interfaceC2735a;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public int getHash() {
            return this.f10786a;
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNext() {
            return this.f10787b;
        }

        public InterfaceC2735a<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC2735a<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC2735a<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public InterfaceC2718s<K, V> getValueReference() {
            return this.f10788c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2735a
        public void setValueReference(InterfaceC2718s<K, V> interfaceC2718s) {
            this.f10788c = interfaceC2718s;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$x */
    public static class C2723x<K, V> extends WeakReference<V> implements InterfaceC2718s<K, V> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2735a<K, V> f10789a;

        public C2723x(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            super(v2, referenceQueue);
            this.f10789a = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: a */
        public InterfaceC2735a<K, V> mo15584a() {
            return this.f10789a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: b */
        public void mo15585b(V v2) {
        }

        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: d */
        public V mo15587d() {
            return get();
        }

        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            return new C2723x(referenceQueue, v2, interfaceC2735a);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: k */
        public boolean mo15589k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$y */
    public static final class C2724y<K, V> extends C2722w<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f10790d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2735a<K, V> f10791e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2735a<K, V> f10792f;

        public C2724y(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            super(referenceQueue, k, i, interfaceC2735a);
            this.f10790d = Long.MAX_VALUE;
            this.f10791e = LocalCache.m15548w();
            this.f10792f = LocalCache.m15548w();
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getNextInWriteQueue() {
            return this.f10791e;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public InterfaceC2735a<K, V> getPreviousInWriteQueue() {
            return this.f10792f;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public long getWriteTime() {
            return this.f10790d;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setNextInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10791e = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setPreviousInWriteQueue(InterfaceC2735a<K, V> interfaceC2735a) {
            this.f10792f = interfaceC2735a;
        }

        @Override // com.google.common.cache.LocalCache.C2722w, com.google.common.cache.InterfaceC2735a
        public void setWriteTime(long j) {
            this.f10790d = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$z */
    public static final class C2725z<K, V> extends C2711l<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f10793b;

        public C2725z(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a, int i) {
            super(referenceQueue, v2, interfaceC2735a);
            this.f10793b = i;
        }

        @Override // com.google.common.cache.LocalCache.C2711l, com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return this.f10793b;
        }

        @Override // com.google.common.cache.LocalCache.C2711l, com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            return new C2725z(referenceQueue, v2, interfaceC2735a, this.f10793b);
        }
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        this.f10705d = Math.min(cacheBuilder.m15515h(), 65536);
        Strength strengthM15520m = cacheBuilder.m15520m();
        this.f10708g = strengthM15520m;
        this.f10709h = cacheBuilder.m15527t();
        this.f10706e = cacheBuilder.m15519l();
        this.f10707f = cacheBuilder.m15526s();
        long jM15521n = cacheBuilder.m15521n();
        this.f10710i = jM15521n;
        this.f10711j = (qwp0<K, V>) cacheBuilder.m15528u();
        this.f10712k = cacheBuilder.m15516i();
        this.f10713l = cacheBuilder.m15517j();
        this.f10714m = cacheBuilder.m15522o();
        CacheBuilder.NullListener nullListener = (azc0<K, V>) cacheBuilder.m15523p();
        this.f10716o = nullListener;
        this.f10715n = nullListener == CacheBuilder.NullListener.INSTANCE ? m15547g() : new ConcurrentLinkedQueue<>();
        this.f10717p = cacheBuilder.m15525r(m15554D());
        this.f10718q = EntryFactory.getFactory(strengthM15520m, m15559L(), m15563P());
        this.f10719r = cacheBuilder.m15524q().get();
        this.f10720s = cacheLoader;
        int iMin = Math.min(cacheBuilder.m15518k(), 1073741824);
        if (m15568h() && !m15567f()) {
            iMin = (int) Math.min(iMin, jM15521n);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f10705d && (!m15568h() || i4 * 20 <= this.f10710i)) {
            i3++;
            i4 <<= 1;
        }
        this.f10703b = 32 - i3;
        this.f10702a = i4 - 1;
        this.f10704c = m15582v(i4);
        int i5 = iMin / i4;
        while (i2 < (i5 * i4 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (m15568h()) {
            long j = this.f10710i;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                Segment<K, V>[] segmentArr = this.f10704c;
                if (i >= segmentArr.length) {
                    return;
                }
                if (i == j4) {
                    j3--;
                }
                segmentArr[i] = m15566e(i2, j3, cacheBuilder.m15524q().get());
                i++;
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f10704c;
                if (i >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i] = m15566e(i2, -1L, cacheBuilder.m15524q().get());
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m15541H(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX INFO: renamed from: J */
    public static <E> ArrayList<E> m15542J(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.m15925a(arrayList, collection.iterator());
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static <K, V> InterfaceC2718s<K, V> m15543K() {
        return (InterfaceC2718s<K, V>) f10700x;
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> void m15545c(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
        interfaceC2735a.setNextInAccessQueue(interfaceC2735a2);
        interfaceC2735a2.setPreviousInAccessQueue(interfaceC2735a);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> void m15546d(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
        interfaceC2735a.setNextInWriteQueue(interfaceC2735a2);
        interfaceC2735a2.setPreviousInWriteQueue(interfaceC2735a);
    }

    /* JADX INFO: renamed from: g */
    public static <E> Queue<E> m15547g() {
        return (Queue<E>) f10701y;
    }

    /* JADX INFO: renamed from: w */
    public static <K, V> InterfaceC2735a<K, V> m15548w() {
        return NullEntry.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static <K, V> void m15549x(InterfaceC2735a<K, V> interfaceC2735a) {
        InterfaceC2735a<K, V> interfaceC2735aM15548w = m15548w();
        interfaceC2735a.setNextInAccessQueue(interfaceC2735aM15548w);
        interfaceC2735a.setPreviousInAccessQueue(interfaceC2735aM15548w);
    }

    /* JADX INFO: renamed from: y */
    public static <K, V> void m15550y(InterfaceC2735a<K, V> interfaceC2735a) {
        InterfaceC2735a<K, V> interfaceC2735aM15548w = m15548w();
        interfaceC2735a.setNextInWriteQueue(interfaceC2735aM15548w);
        interfaceC2735a.setPreviousInWriteQueue(interfaceC2735aM15548w);
    }

    /* JADX INFO: renamed from: A */
    public void m15551A(InterfaceC2735a<K, V> interfaceC2735a) throws Throwable {
        int hash = interfaceC2735a.getHash();
        m15558I(hash).reclaimKey(interfaceC2735a, hash);
    }

    /* JADX INFO: renamed from: B */
    public void m15552B(InterfaceC2718s<K, V> interfaceC2718s) throws Throwable {
        InterfaceC2735a<K, V> interfaceC2735aMo15584a = interfaceC2718s.mo15584a();
        int hash = interfaceC2735aMo15584a.getHash();
        m15558I(hash).reclaimValue(interfaceC2735aMo15584a.getKey(), hash, interfaceC2718s);
    }

    /* JADX INFO: renamed from: C */
    public boolean m15553C() {
        return m15569i();
    }

    /* JADX INFO: renamed from: D */
    public boolean m15554D() {
        return m15555E() || m15553C();
    }

    /* JADX INFO: renamed from: E */
    public boolean m15555E() {
        return m15570j() || m15557G();
    }

    /* JADX INFO: renamed from: F */
    public void m15556F(K k) {
        int iM15577q = m15577q(xn80.m212111p(k));
        m15558I(iM15577q).refresh(k, iM15577q, this.f10720s, false);
    }

    /* JADX INFO: renamed from: G */
    public boolean m15557G() {
        return this.f10714m > 0;
    }

    /* JADX INFO: renamed from: I */
    public Segment<K, V> m15558I(int i) {
        return this.f10704c[this.f10702a & (i >>> this.f10703b)];
    }

    /* JADX INFO: renamed from: L */
    public boolean m15559L() {
        return m15560M() || m15553C();
    }

    /* JADX INFO: renamed from: M */
    public boolean m15560M() {
        return m15569i() || m15568h();
    }

    /* JADX INFO: renamed from: N */
    public boolean m15561N() {
        return this.f10708g != Strength.STRONG;
    }

    /* JADX INFO: renamed from: O */
    public boolean m15562O() {
        return this.f10709h != Strength.STRONG;
    }

    /* JADX INFO: renamed from: P */
    public boolean m15563P() {
        return m15564Q() || m15555E();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m15564Q() {
        return m15570j();
    }

    /* JADX INFO: renamed from: b */
    public void m15565b() {
        for (Segment<K, V> segment : this.f10704c) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (Segment<K, V> segment : this.f10704c) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM15577q = m15577q(obj);
        return m15558I(iM15577q).containsKey(obj, iM15577q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        int i = 0;
        if (obj == null) {
            return false;
        }
        long jMo15540a = this.f10717p.mo15540a();
        Segment<K, V>[] segmentArr = this.f10704c;
        long j = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            int i3 = i == true ? 1 : 0;
            while (i3 < length) {
                Segment<K, V> segment = segmentArr[i3];
                int i4 = segment.count;
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = segment.table;
                int i5 = i;
                while (i5 < atomicReferenceArray.length()) {
                    InterfaceC2735a<K, V> next = atomicReferenceArray.get(i5);
                    while (next != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(next, jMo15540a);
                        InterfaceC2735a<K, V> interfaceC2735a = next;
                        if (liveValue != null && this.f10707f.equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = interfaceC2735a.getNext();
                        segmentArr = segmentArr2;
                    }
                    i5++;
                }
                j2 += (long) segment.modCount;
                i3++;
                i = i5;
            }
            boolean z = i;
            Segment<K, V>[] segmentArr3 = segmentArr;
            if (j2 == j) {
                return z;
            }
            i2++;
            j = j2;
            i = z ? 1 : 0;
            segmentArr = segmentArr3;
        }
        return i == true ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public Segment<K, V> m15566e(int i, long j, InterfaceC21523y6 interfaceC21523y6) {
        return new Segment<>(this, i, j, interfaceC21523y6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f10723v;
        if (set != null) {
            return set;
        }
        C2706g c2706g = new C2706g();
        this.f10723v = c2706g;
        return c2706g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m15567f() {
        return this.f10711j != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM15577q = m15577q(obj);
        return m15558I(iM15577q).get(obj, iM15577q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    /* JADX INFO: renamed from: h */
    public boolean m15568h() {
        return this.f10710i >= 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15569i() {
        return this.f10712k > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f10704c;
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

    /* JADX INFO: renamed from: j */
    public boolean m15570j() {
        return this.f10713l > 0;
    }

    /* JADX INFO: renamed from: k */
    public V m15571k(K k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iM15577q = m15577q(xn80.m212111p(k));
        return m15558I(iM15577q).get(k, iM15577q, cacheLoader);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f10721t;
        if (set != null) {
            return set;
        }
        C2709j c2709j = new C2709j();
        this.f10721t = c2709j;
        return c2709j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public ImmutableMap<K, V> m15572l(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapM16098s = Maps.m16098s();
        LinkedHashSet linkedHashSetM16178i = Sets.m16178i();
        int i = 0;
        int i2 = 0;
        for (K k : iterable) {
            Object obj = get(k);
            if (!linkedHashMapM16098s.containsKey(k)) {
                linkedHashMapM16098s.put(k, obj);
                if (obj == null) {
                    i2++;
                    linkedHashSetM16178i.add(k);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!linkedHashSetM16178i.isEmpty()) {
                try {
                    Map mapM15580t = m15580t(Collections.unmodifiableSet(linkedHashSetM16178i), this.f10720s);
                    for (Object obj2 : linkedHashSetM16178i) {
                        Object obj3 = mapM15580t.get(obj2);
                        if (obj3 == null) {
                            String strValueOf = String.valueOf(obj2);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                            sb.append("loadAll failed to return a value for ");
                            sb.append(strValueOf);
                            throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                        }
                        linkedHashMapM16098s.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetM16178i) {
                        i2--;
                        linkedHashMapM16098s.put(obj4, m15571k(obj4, this.f10720s));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapM16098s);
            this.f10719r.mo15533a(i);
            this.f10719r.mo15536d(i2);
            return immutableMapCopyOf;
        } catch (Throwable th) {
            this.f10719r.mo15533a(i);
            this.f10719r.mo15536d(i2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public ImmutableMap<K, V> m15573m(Iterable<?> iterable) {
        ImmutableMap.C2809b c2809bBuilder = ImmutableMap.builder();
        int i = 0;
        int i2 = 0;
        for (Object obj : iterable) {
            V v2 = get(obj);
            if (v2 == null) {
                i2++;
            } else {
                c2809bBuilder.mo15715g(obj, v2);
                i++;
            }
        }
        this.f10719r.mo15533a(i);
        this.f10719r.mo15536d(i2);
        return c2809bBuilder.mo15713c();
    }

    /* JADX INFO: renamed from: n */
    public V m15574n(Object obj) throws Throwable {
        int iM15577q = m15577q(xn80.m212111p(obj));
        V v2 = m15558I(iM15577q).get(obj, iM15577q);
        InterfaceC21523y6 interfaceC21523y6 = this.f10719r;
        if (v2 == null) {
            interfaceC21523y6.mo15536d(1);
            return v2;
        }
        interfaceC21523y6.mo15533a(1);
        return v2;
    }

    /* JADX INFO: renamed from: o */
    public V m15575o(InterfaceC2735a<K, V> interfaceC2735a, long j) {
        V v2;
        if (interfaceC2735a.getKey() == null || (v2 = interfaceC2735a.getValueReference().get()) == null || m15579s(interfaceC2735a, j)) {
            return null;
        }
        return v2;
    }

    /* JADX INFO: renamed from: p */
    public V m15576p(K k) throws ExecutionException {
        return m15571k(k, this.f10720s);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        xn80.m212111p(k);
        xn80.m212111p(v2);
        int iM15577q = m15577q(k);
        return m15558I(iM15577q).put(k, iM15577q, v2, false);
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
        int iM15577q = m15577q(k);
        return m15558I(iM15577q).put(k, iM15577q, v2, true);
    }

    /* JADX INFO: renamed from: q */
    public int m15577q(Object obj) {
        return m15541H(this.f10706e.hash(obj));
    }

    /* JADX INFO: renamed from: r */
    public void m15578r(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM15577q = m15577q(obj);
        return m15558I(iM15577q).remove(obj, iM15577q, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v2, V v3) {
        xn80.m212111p(k);
        xn80.m212111p(v3);
        if (v2 == null) {
            return false;
        }
        int iM15577q = m15577q(k);
        return m15558I(iM15577q).replace(k, iM15577q, v2, v3);
    }

    /* JADX INFO: renamed from: s */
    public boolean m15579s(InterfaceC2735a<K, V> interfaceC2735a, long j) {
        xn80.m212111p(interfaceC2735a);
        if (!m15569i() || j - interfaceC2735a.getAccessTime() < this.f10712k) {
            return m15570j() && j - interfaceC2735a.getWriteTime() >= this.f10713l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.m16523m(m15581u());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX INFO: renamed from: t */
    public Map<K, V> m15580t(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        xn80.m212111p(cacheLoader);
        xn80.m212111p(set);
        s5g0 s5g0VarM184668c = s5g0.m184668c();
        boolean z = true;
        boolean z2 = false;
        try {
            try {
                try {
                    Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                    if (mapLoadAll == null) {
                        this.f10719r.mo15537e(s5g0VarM184668c.m184670e(timeUnit));
                        String strValueOf = String.valueOf(cacheLoader);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31);
                        sb.append(strValueOf);
                        sb.append(" returned null map from loadAll");
                        throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                    }
                    s5g0VarM184668c.m184673h();
                    for (Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                        K key = entry.getKey();
                        V value = entry.getValue();
                        if (key == null || value == null) {
                            z2 = true;
                        } else {
                            put(key, value);
                        }
                    }
                    InterfaceC21523y6 interfaceC21523y6 = this.f10719r;
                    if (!z2) {
                        interfaceC21523y6.mo15535c(s5g0VarM184668c.m184670e(timeUnit));
                        return mapLoadAll;
                    }
                    interfaceC21523y6.mo15537e(s5g0VarM184668c.m184670e(timeUnit));
                    String strValueOf2 = String.valueOf(cacheLoader);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 42);
                    sb2.append(strValueOf2);
                    sb2.append(" returned null keys or values from loadAll");
                    throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                } catch (RuntimeException e) {
                    throw new UncheckedExecutionException(e);
                } catch (Exception e2) {
                    throw new ExecutionException(e2);
                }
            } catch (CacheLoader.UnsupportedLoadingOperationException e3) {
                try {
                    throw e3;
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        this.f10719r.mo15537e(s5g0VarM184668c.m184670e(timeUnit));
                    }
                    throw th;
                }
            } catch (Error e4) {
                throw new ExecutionError(e4);
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new ExecutionException(e5);
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                this.f10719r.mo15537e(s5g0VarM184668c.m184670e(timeUnit));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public long m15581u() {
        long jMax = 0;
        for (Segment<K, V> segment : this.f10704c) {
            jMax += (long) Math.max(0, segment.count);
        }
        return jMax;
    }

    /* JADX INFO: renamed from: v */
    public final Segment<K, V>[] m15582v(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f10722u;
        if (collection != null) {
            return collection;
        }
        C2719t c2719t = new C2719t();
        this.f10722u = c2719t;
        return c2719t;
    }

    /* JADX INFO: renamed from: z */
    public void m15583z() {
        while (true) {
            RemovalNotification<K, V> removalNotificationPoll = this.f10715n.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.f10716o.onRemoval(removalNotificationPoll);
            } catch (Throwable th) {
                f10699w.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
      (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x005a: FILLED_NEW_ARRAY 
      (r0v0 com.google.common.cache.LocalCache$EntryFactory)
      (r1v1 com.google.common.cache.LocalCache$EntryFactory)
      (r3v1 com.google.common.cache.LocalCache$EntryFactory)
      (r5v1 com.google.common.cache.LocalCache$EntryFactory)
      (r7v1 com.google.common.cache.LocalCache$EntryFactory)
      (r9v1 com.google.common.cache.LocalCache$EntryFactory)
      (r11v1 com.google.common.cache.LocalCache$EntryFactory)
      (r13v1 com.google.common.cache.LocalCache$EntryFactory)
     A[WRAPPED] (LINE:91) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2714o(k, i, interfaceC2735a);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2712m(k, i, interfaceC2735a);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2716q(k, i, interfaceC2735a);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2713n(k, i, interfaceC2735a);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2722w(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2720u(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2724y(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2721v(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2714o(k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2712m(k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2716q(k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2713n(k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2722w(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2720u(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2724y(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = super.copyEntry(segment, interfaceC2735a, interfaceC2735a2);
                copyAccessEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                copyWriteEntry(interfaceC2735a, interfaceC2735aCopyEntry);
                return interfaceC2735aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
                return new C2721v(segment.keyReferenceQueue, k, i, interfaceC2735a);
            }
        }};

        static {
        }

        private EntryFactory(String str, int i) {
            super(str, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            return factories[((strength == Strength.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) $VALUES.clone();
        }

        public <K, V> void copyAccessEntry(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
            interfaceC2735a2.setAccessTime(interfaceC2735a.getAccessTime());
            LocalCache.m15545c(interfaceC2735a.getPreviousInAccessQueue(), interfaceC2735a2);
            LocalCache.m15545c(interfaceC2735a2, interfaceC2735a.getNextInAccessQueue());
            LocalCache.m15549x(interfaceC2735a);
        }

        public <K, V> InterfaceC2735a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
            return newEntry(segment, interfaceC2735a.getKey(), interfaceC2735a.getHash(), interfaceC2735a2);
        }

        public <K, V> void copyWriteEntry(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
            interfaceC2735a2.setWriteTime(interfaceC2735a.getWriteTime());
            LocalCache.m15546d(interfaceC2735a.getPreviousInWriteQueue(), interfaceC2735a2);
            LocalCache.m15546d(interfaceC2735a2, interfaceC2735a.getNextInWriteQueue());
            LocalCache.m15550y(interfaceC2735a);
        }

        public abstract <K, V> InterfaceC2735a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2735a<K, V> interfaceC2735a);

        public /* synthetic */ EntryFactory(String str, int i, C2696a c2696a) {
            this(str, i);
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC2718s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, V v2, int i) {
                return i == 1 ? new C2715p(v2) : new C2697a0(v2, i);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC2718s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, V v2, int i) {
                return i == 1 ? new C2711l(segment.valueReferenceQueue, v2, interfaceC2735a) : new C2725z(segment.valueReferenceQueue, v2, interfaceC2735a, i);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC2718s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, V v2, int i) {
                return i == 1 ? new C2723x(segment.valueReferenceQueue, v2, interfaceC2735a) : new C2699b0(segment.valueReferenceQueue, v2, interfaceC2735a, i);
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> InterfaceC2718s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2735a<K, V> interfaceC2735a, V v2, int i);

        /* synthetic */ Strength(C2696a c2696a) {
            this();
        }
    }

    public static class ManualSerializationProxy<K, V> extends k2j<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;
        transient ux3<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final azc0<? super K, ? super V> removalListener;
        final fzi0 ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final qwp0<K, V> weigher;

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, qwp0<K, V> qwp0Var, int i, azc0<? super K, ? super V> azc0Var, fzi0 fzi0Var, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = qwp0Var;
            this.concurrencyLevel = i;
            this.removalListener = azc0Var;
            this.ticker = (fzi0Var == fzi0.m128190b() || fzi0Var == CacheBuilder.f10676t) ? null : fzi0Var;
            this.loader = cacheLoader;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = (ux3<K, V>) recreateCacheBuilder().m15508a();
        }

        private Object readResolve() {
            return this.delegate;
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.m15502y().m15503A(this.keyStrength).m15504B(this.valueStrength).m15529v(this.keyEquivalence).m15506D(this.valueEquivalence).m15512e(this.concurrencyLevel).m15532z(this.removalListener);
            cacheBuilder.f10678a = false;
            long j = this.expireAfterWriteNanos;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (j > 0) {
                cacheBuilder.m15514g(j, timeUnit);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                cacheBuilder.m15513f(j2, timeUnit);
            }
            qwp0 qwp0Var = this.weigher;
            if (qwp0Var != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.m15507E(qwp0Var);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    cacheBuilder.m15531x(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    cacheBuilder.m15530w(j4);
                }
            }
            fzi0 fzi0Var = this.ticker;
            if (fzi0Var != null) {
                cacheBuilder.m15505C(fzi0Var);
            }
            return cacheBuilder;
        }

        @Override // p153l.k2j, p153l.v2j
        public ux3<K, V> delegate() {
            return this.delegate;
        }

        public ManualSerializationProxy(LocalCache<K, V> localCache) {
            this(localCache.f10708g, localCache.f10709h, localCache.f10706e, localCache.f10707f, localCache.f10713l, localCache.f10712k, localCache.f10710i, localCache.f10711j, localCache.f10705d, localCache.f10716o, localCache.f10717p, localCache.f10720s);
        }
    }

    public static class LocalManualCache<K, V> implements ux3<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$LocalManualCache$a */
        public class C2691a extends CacheLoader<Object, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callable f10724a;

            public C2691a(LocalManualCache localManualCache, Callable callable) {
                this.f10724a = callable;
            }

            @Override // com.google.common.cache.CacheLoader
            public V load(Object obj) throws Exception {
                return (V) this.f10724a.call();
            }
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        @Override // p153l.ux3
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // p153l.ux3
        public void cleanUp() {
            this.localCache.m15565b();
        }

        @Override // p153l.ux3
        public V get(K k, Callable<? extends V> callable) throws ExecutionException {
            xn80.m212111p(callable);
            return this.localCache.m15571k(k, new C2691a(this, callable));
        }

        @Override // p153l.ux3
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.localCache.m15573m(iterable);
        }

        @Override // p153l.ux3
        public V getIfPresent(Object obj) {
            return this.localCache.m15574n(obj);
        }

        @Override // p153l.ux3
        public void invalidate(Object obj) {
            xn80.m212111p(obj);
            this.localCache.remove(obj);
        }

        @Override // p153l.ux3
        public void invalidateAll(Iterable<?> iterable) {
            this.localCache.m15578r(iterable);
        }

        @Override // p153l.ux3
        public void put(K k, V v2) {
            this.localCache.put(k, v2);
        }

        @Override // p153l.ux3
        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // p153l.ux3
        public long size() {
            return this.localCache.m15581u();
        }

        @Override // p153l.ux3
        public hy3 stats() {
            C21256x6 c21256x6 = new C21256x6();
            c21256x6.m209437g(this.localCache.f10719r);
            for (Segment<K, V> segment : this.localCache.f10704c) {
                c21256x6.m209437g(segment.statsCounter);
            }
            return c21256x6.mo15538f();
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        @Override // p153l.ux3
        public void invalidateAll() throws Throwable {
            this.localCache.clear();
        }

        public /* synthetic */ LocalManualCache(LocalCache localCache, C2696a c2696a) {
            this(localCache);
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c */
    public abstract class AbstractC2700c<T> extends AbstractSet<T> {
        public AbstractC2700c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.m15542J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m15542J(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$t */
    public final class C2719t extends AbstractCollection<V> {
        public C2719t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() throws Throwable {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C2717r(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.m15542J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m15542J(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$k */
    public static class C2710k<K, V> implements InterfaceC2718s<K, V> {

        /* JADX INFO: renamed from: a */
        public volatile InterfaceC2718s<K, V> f10754a;

        /* JADX INFO: renamed from: b */
        public final C3106h<V> f10755b;

        /* JADX INFO: renamed from: c */
        public final s5g0 f10756c;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$k$a */
        public class a implements adj<V, V> {
            public a() {
            }

            @Override // p153l.adj
            public V apply(V v2) {
                C2710k.this.m15609j(v2);
                return v2;
            }
        }

        public C2710k(InterfaceC2718s<K, V> interfaceC2718s) {
            this.f10755b = C3106h.m16716G();
            this.f10756c = s5g0.m184669d();
            this.f10754a = interfaceC2718s;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: a */
        public InterfaceC2735a<K, V> mo15584a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: b */
        public void mo15585b(V v2) {
            if (v2 != null) {
                m15609j(v2);
            } else {
                this.f10754a = LocalCache.m15543K();
            }
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: c */
        public int mo15586c() {
            return this.f10754a.mo15586c();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: d */
        public V mo15587d() throws ExecutionException {
            return (V) qxj0.m178604a(this.f10755b);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: e */
        public InterfaceC2718s<K, V> mo15588e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2735a<K, V> interfaceC2735a) {
            return this;
        }

        /* JADX INFO: renamed from: f */
        public long m15605f() {
            return this.f10756c.m184670e(TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: g */
        public final hpr<V> m15606g(Throwable th) {
            return C3103e.m16711c(th);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public V get() {
            return this.f10754a.get();
        }

        /* JADX INFO: renamed from: h */
        public InterfaceC2718s<K, V> m15607h() {
            return this.f10754a;
        }

        /* JADX INFO: renamed from: i */
        public hpr<V> m15608i(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f10756c.m184672g();
                V v2 = this.f10754a.get();
                if (v2 == null) {
                    V vLoad = cacheLoader.load(k);
                    return m15609j(vLoad) ? this.f10755b : C3103e.m16712d(vLoad);
                }
                hpr<V> hprVarReload = cacheLoader.reload(k, v2);
                return hprVarReload == null ? C3103e.m16712d(null) : C3103e.m16713e(hprVarReload, new a(), C3105g.m16714a());
            } catch (Throwable th) {
                hpr<V> hprVarM15606g = m15610l(th) ? this.f10755b : m15606g(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return hprVarM15606g;
            }
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        public boolean isLoading() {
            return true;
        }

        /* JADX INFO: renamed from: j */
        public boolean m15609j(V v2) {
            return this.f10755b.mo16651C(v2);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2718s
        /* JADX INFO: renamed from: k */
        public boolean mo15589k() {
            return this.f10754a.mo15589k();
        }

        /* JADX INFO: renamed from: l */
        public boolean m15610l(Throwable th) {
            return this.f10755b.mo16652D(th);
        }

        public C2710k() {
            this(LocalCache.m15543K());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM15577q = m15577q(obj);
        return m15558I(iM15577q).remove(obj, iM15577q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v2) {
        xn80.m212111p(k);
        xn80.m212111p(v2);
        int iM15577q = m15577q(k);
        return m15558I(iM15577q).replace(k, iM15577q, v2);
    }

    public static class Segment<K, V> extends ReentrantLock {
        final Queue<InterfaceC2735a<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<InterfaceC2735a<K, V>> recencyQueue;
        final InterfaceC21523y6 statsCounter;
        volatile AtomicReferenceArray<InterfaceC2735a<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<InterfaceC2735a<K, V>> writeQueue;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$Segment$a */
        public class RunnableC2692a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f10725a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f10726b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C2710k f10727c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ hpr f10728d;

            public RunnableC2692a(Object obj, int i, C2710k c2710k, hpr hprVar) {
                this.f10725a = obj;
                this.f10726b = i;
                this.f10727c = c2710k;
                this.f10728d = hprVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Segment.this.getAndRecordStats(this.f10725a, this.f10726b, this.f10727c, this.f10728d);
                } catch (Throwable th) {
                    LocalCache.f10699w.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f10727c.m15610l(th);
                }
            }
        }

        public Segment(LocalCache<K, V> localCache, int i, long j, InterfaceC21523y6 interfaceC21523y6) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (InterfaceC21523y6) xn80.m212111p(interfaceC21523y6);
            initTable(newEntryArray(i));
            this.keyReferenceQueue = localCache.m15561N() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.m15562O() ? new ReferenceQueue<>() : null;
            this.recencyQueue = localCache.m15560M() ? new ConcurrentLinkedQueue<>() : LocalCache.m15547g();
            this.writeQueue = localCache.m15564Q() ? new C2701c0<>() : LocalCache.m15547g();
            this.accessQueue = localCache.m15560M() ? new C2704e<>() : LocalCache.m15547g();
        }

        public void cleanUp() {
            runLockedCleanup(this.map.f10717p.mo15540a());
            runUnlockedCleanup();
        }

        public void clear() throws Throwable {
            Segment<K, V> segment;
            if (this.count == 0) {
                return;
            }
            lock();
            try {
                preWriteCleanup(this.map.f10717p.mo15540a());
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                for (int i = 0; i < atomicReferenceArray.length(); i++) {
                    InterfaceC2735a<K, V> next = atomicReferenceArray.get(i);
                    while (next != null) {
                        if (next.getValueReference().mo15589k()) {
                            K key = next.getKey();
                            V v2 = next.getValueReference().get();
                            segment = this;
                            try {
                                segment.enqueueNotification(key, next.getHash(), v2, next.getValueReference().mo15586c(), (key == null || v2 == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            } catch (Throwable th) {
                                th = th;
                                segment.unlock();
                                segment.postWriteCleanup();
                                throw th;
                            }
                        } else {
                            segment = this;
                        }
                        next = next.getNext();
                        this = segment;
                    }
                }
                segment = this;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    atomicReferenceArray.set(i2, null);
                }
                segment.clearReferenceQueues();
                segment.writeQueue.clear();
                segment.accessQueue.clear();
                segment.readCount.set(0);
                segment.modCount++;
                segment.count = 0;
                segment.unlock();
                segment.postWriteCleanup();
            } catch (Throwable th2) {
                th = th2;
                segment = this;
            }
        }

        public void clearKeyReferenceQueue() {
            while (this.keyReferenceQueue.poll() != null) {
            }
        }

        public void clearReferenceQueues() {
            if (this.map.m15561N()) {
                clearKeyReferenceQueue();
            }
            if (this.map.m15562O()) {
                clearValueReferenceQueue();
            }
        }

        public void clearValueReferenceQueue() {
            while (this.valueReferenceQueue.poll() != null) {
            }
        }

        public boolean containsKey(Object obj, int i) {
            try {
                if (this.count == 0) {
                    return false;
                }
                InterfaceC2735a<K, V> liveEntry = getLiveEntry(obj, i, this.map.f10717p.mo15540a());
                if (liveEntry == null) {
                    return false;
                }
                return liveEntry.getValueReference().get() != null;
            } finally {
                postReadCleanup();
            }
        }

        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    long jMo15540a = this.map.f10717p.mo15540a();
                    AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (InterfaceC2735a<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next, jMo15540a);
                            if (liveValue != null && this.map.f10707f.equivalent(obj, liveValue)) {
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

        public InterfaceC2735a<K, V> copyEntry(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
            if (interfaceC2735a.getKey() == null) {
                return null;
            }
            InterfaceC2718s<K, V> valueReference = interfaceC2735a.getValueReference();
            V v2 = valueReference.get();
            if (v2 == null && valueReference.mo15589k()) {
                return null;
            }
            InterfaceC2735a<K, V> interfaceC2735aCopyEntry = this.map.f10718q.copyEntry(this, interfaceC2735a, interfaceC2735a2);
            interfaceC2735aCopyEntry.setValueReference(valueReference.mo15588e(this.valueReferenceQueue, v2, interfaceC2735aCopyEntry));
            return interfaceC2735aCopyEntry;
        }

        public void drainKeyReferenceQueue() throws Throwable {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.m15551A((InterfaceC2735a) referencePoll);
                i++;
            } while (i != 16);
        }

        public void drainRecencyQueue() {
            while (true) {
                InterfaceC2735a<K, V> interfaceC2735aPoll = this.recencyQueue.poll();
                if (interfaceC2735aPoll == null) {
                    return;
                }
                if (this.accessQueue.contains(interfaceC2735aPoll)) {
                    this.accessQueue.add(interfaceC2735aPoll);
                }
            }
        }

        public void drainReferenceQueues() throws Throwable {
            if (this.map.m15561N()) {
                drainKeyReferenceQueue();
            }
            if (this.map.m15562O()) {
                drainValueReferenceQueue();
            }
        }

        public void drainValueReferenceQueue() throws Throwable {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = this.valueReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.m15552B((InterfaceC2718s) referencePoll);
                i++;
            } while (i != 16);
        }

        public void enqueueNotification(K k, int i, V v2, int i2, RemovalCause removalCause) {
            this.totalWeight -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.mo15534b();
            }
            if (this.map.f10715n != LocalCache.f10701y) {
                this.map.f10715n.offer(RemovalNotification.create(k, v2, removalCause));
            }
        }

        public void evictEntries(InterfaceC2735a<K, V> interfaceC2735a) {
            if (this.map.m15568h()) {
                drainRecencyQueue();
                if (interfaceC2735a.getValueReference().mo15586c() > this.maxSegmentWeight && !removeEntry(interfaceC2735a, interfaceC2735a.getHash(), RemovalCause.SIZE)) {
                    aqg0.m99478a();
                    return;
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    InterfaceC2735a<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                        aqg0.m99478a();
                        return;
                    }
                }
            }
        }

        public void expand() {
            AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC2735a<K, V> next = atomicReferenceArray.get(i2);
                if (next != null) {
                    InterfaceC2735a<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InterfaceC2735a<K, V> interfaceC2735a = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC2735a = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, interfaceC2735a);
                        while (next != interfaceC2735a) {
                            int hash3 = next.getHash() & length2;
                            InterfaceC2735a<K, V> interfaceC2735aCopyEntry = copyEntry(next, atomicReferenceArrayNewEntryArray.get(hash3));
                            if (interfaceC2735aCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, interfaceC2735aCopyEntry);
                            } else {
                                removeCollectedEntry(next);
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

        public void expireEntries(long j) {
            InterfaceC2735a<K, V> interfaceC2735aPeek;
            InterfaceC2735a<K, V> interfaceC2735aPeek2;
            drainRecencyQueue();
            do {
                interfaceC2735aPeek = this.writeQueue.peek();
                if (interfaceC2735aPeek == null || !this.map.m15579s(interfaceC2735aPeek, j)) {
                    do {
                        interfaceC2735aPeek2 = this.accessQueue.peek();
                        if (interfaceC2735aPeek2 == null || !this.map.m15579s(interfaceC2735aPeek2, j)) {
                            return;
                        }
                    } while (removeEntry(interfaceC2735aPeek2, interfaceC2735aPeek2.getHash(), RemovalCause.EXPIRED));
                    aqg0.m99478a();
                    return;
                }
            } while (removeEntry(interfaceC2735aPeek, interfaceC2735aPeek.getHash(), RemovalCause.EXPIRED));
            aqg0.m99478a();
        }

        public V get(K k, int i, CacheLoader<? super K, V> cacheLoader) throws Throwable {
            Segment<K, V> segment;
            K k2;
            InterfaceC2735a<K, V> entry;
            xn80.m212111p(k);
            xn80.m212111p(cacheLoader);
            try {
                try {
                    try {
                        if (this.count != 0 && (entry = getEntry(k, i)) != null) {
                            long jMo15540a = this.map.f10717p.mo15540a();
                            V liveValue = getLiveValue(entry, jMo15540a);
                            if (liveValue != null) {
                                recordRead(entry, jMo15540a);
                                this.statsCounter.mo15533a(1);
                                V vScheduleRefresh = scheduleRefresh(entry, k, i, liveValue, jMo15540a, cacheLoader);
                                postReadCleanup();
                                return vScheduleRefresh;
                            }
                            segment = this;
                            k2 = k;
                            InterfaceC2718s<K, V> valueReference = entry.getValueReference();
                            if (valueReference.isLoading()) {
                                V vWaitForLoadingValue = segment.waitForLoadingValue(entry, k2, valueReference);
                                segment.postReadCleanup();
                                return vWaitForLoadingValue;
                            }
                            ExecutionException executionException = e;
                            Throwable cause = executionException.getCause();
                            if (cause instanceof Error) {
                                throw new ExecutionError((Error) cause);
                            }
                            if (cause instanceof RuntimeException) {
                                throw new UncheckedExecutionException(cause);
                            }
                            throw executionException;
                        }
                        segment = this;
                        k2 = k;
                        V vLockedGetOrLoad = segment.lockedGetOrLoad(k2, i, cacheLoader);
                        segment.postReadCleanup();
                        return vLockedGetOrLoad;
                    } catch (ExecutionException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    postReadCleanup();
                    throw th2;
                }
            } catch (ExecutionException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                postReadCleanup();
                throw th4;
            }
        }

        public V getAndRecordStats(K k, int i, C2710k<K, V> c2710k, hpr<V> hprVar) throws Throwable {
            V v2;
            try {
                v2 = (V) qxj0.m178604a(hprVar);
                try {
                    if (v2 != null) {
                        this.statsCounter.mo15535c(c2710k.m15605f());
                        storeLoadedValue(k, i, c2710k, v2);
                        return v2;
                    }
                    String strValueOf = String.valueOf(k);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
                    sb.append("CacheLoader returned null for key ");
                    sb.append(strValueOf);
                    sb.append(".");
                    throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                } catch (Throwable th) {
                    th = th;
                    if (v2 == null) {
                        this.statsCounter.mo15537e(c2710k.m15605f());
                        removeLoadingValue(k, i, c2710k);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v2 = null;
            }
        }

        public InterfaceC2735a<K, V> getEntry(Object obj, int i) {
            for (InterfaceC2735a<K, V> first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.f10706e.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public InterfaceC2735a<K, V> getFirst(int i) {
            AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public InterfaceC2735a<K, V> getLiveEntry(Object obj, int i, long j) {
            InterfaceC2735a<K, V> entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (!this.map.m15579s(entry, j)) {
                return entry;
            }
            tryExpireEntries(j);
            return null;
        }

        public V getLiveValue(InterfaceC2735a<K, V> interfaceC2735a, long j) {
            if (interfaceC2735a.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v2 = interfaceC2735a.getValueReference().get();
            if (v2 == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (!this.map.m15579s(interfaceC2735a, j)) {
                return v2;
            }
            tryExpireEntries(j);
            return null;
        }

        public InterfaceC2735a<K, V> getNextEvictable() {
            for (InterfaceC2735a<K, V> interfaceC2735a : this.accessQueue) {
                if (interfaceC2735a.getValueReference().mo15586c() > 0) {
                    return interfaceC2735a;
                }
            }
            aqg0.m99478a();
            return null;
        }

        public void initTable(AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.m15567f()) {
                int i = this.threshold;
                if (i == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        public C2710k<K, V> insertLoadingValueReference(K k, int i, boolean z) {
            lock();
            try {
                long jMo15540a = this.map.f10717p.mo15540a();
                preWriteCleanup(jMo15540a);
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2735a<K, V> interfaceC2735a = (InterfaceC2735a) atomicReferenceArray.get(length);
                for (InterfaceC2735a next = interfaceC2735a; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(k, key)) {
                        InterfaceC2718s<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z || jMo15540a - next.getWriteTime() >= this.map.f10714m)) {
                            this.modCount++;
                            C2710k<K, V> c2710k = new C2710k<>(valueReference);
                            next.setValueReference(c2710k);
                            return c2710k;
                        }
                        return null;
                    }
                }
                this.modCount++;
                C2710k<K, V> c2710k2 = new C2710k<>();
                InterfaceC2735a<K, V> interfaceC2735aNewEntry = newEntry(k, i, interfaceC2735a);
                interfaceC2735aNewEntry.setValueReference(c2710k2);
                atomicReferenceArray.set(length, interfaceC2735aNewEntry);
                return c2710k2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public hpr<V> loadAsync(K k, int i, C2710k<K, V> c2710k, CacheLoader<? super K, V> cacheLoader) {
            hpr<V> hprVarM15608i = c2710k.m15608i(k, cacheLoader);
            hprVarM15608i.addListener(new RunnableC2692a(k, i, c2710k, hprVarM15608i), C3105g.m16714a());
            return hprVarM15608i;
        }

        public V loadSync(K k, int i, C2710k<K, V> c2710k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return getAndRecordStats(k, i, c2710k, c2710k.m15608i(k, cacheLoader));
        }

        public V lockedGetOrLoad(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C2710k<K, V> c2710k;
            boolean z;
            InterfaceC2718s<K, V> valueReference;
            V vLoadSync;
            int i2 = i;
            lock();
            try {
                long jMo15540a = this.map.f10717p.mo15540a();
                preWriteCleanup(jMo15540a);
                int i3 = this.count - 1;
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> interfaceC2735aNewEntry = interfaceC2735a;
                while (true) {
                    c2710k = null;
                    if (interfaceC2735aNewEntry == null) {
                        z = true;
                        valueReference = null;
                        break;
                    }
                    long j = jMo15540a;
                    K key = interfaceC2735aNewEntry.getKey();
                    if (interfaceC2735aNewEntry.getHash() == i2 && key != null && this.map.f10706e.equivalent(k, key)) {
                        valueReference = interfaceC2735aNewEntry.getValueReference();
                        if (!valueReference.isLoading()) {
                            V v2 = valueReference.get();
                            if (v2 == null) {
                                enqueueNotification(key, i2, v2, valueReference.mo15586c(), RemovalCause.COLLECTED);
                                i2 = i;
                            } else {
                                if (!this.map.m15579s(interfaceC2735aNewEntry, j)) {
                                    recordLockedRead(interfaceC2735aNewEntry, j);
                                    this.statsCounter.mo15533a(1);
                                    unlock();
                                    postWriteCleanup();
                                    return v2;
                                }
                                i2 = i;
                                enqueueNotification(key, i2, v2, valueReference.mo15586c(), RemovalCause.EXPIRED);
                            }
                            this.writeQueue.remove(interfaceC2735aNewEntry);
                            this.accessQueue.remove(interfaceC2735aNewEntry);
                            this.count = i3;
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    interfaceC2735aNewEntry = interfaceC2735aNewEntry.getNext();
                    jMo15540a = j;
                }
                if (z) {
                    c2710k = new C2710k<>();
                    if (interfaceC2735aNewEntry == null) {
                        interfaceC2735aNewEntry = newEntry(k, i2, interfaceC2735a);
                        interfaceC2735aNewEntry.setValueReference(c2710k);
                        atomicReferenceArray.set(length, interfaceC2735aNewEntry);
                    } else {
                        interfaceC2735aNewEntry.setValueReference(c2710k);
                    }
                }
                unlock();
                postWriteCleanup();
                if (!z) {
                    return waitForLoadingValue(interfaceC2735aNewEntry, k, valueReference);
                }
                try {
                    synchronized (interfaceC2735aNewEntry) {
                        vLoadSync = loadSync(k, i2, c2710k, cacheLoader);
                    }
                    this.statsCounter.mo15536d(1);
                    return vLoadSync;
                } catch (Throwable th) {
                    this.statsCounter.mo15536d(1);
                    throw th;
                }
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public InterfaceC2735a<K, V> newEntry(K k, int i, InterfaceC2735a<K, V> interfaceC2735a) {
            return this.map.f10718q.newEntry(this, xn80.m212111p(k), i, interfaceC2735a);
        }

        public AtomicReferenceArray<InterfaceC2735a<K, V>> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        public void postWriteCleanup() {
            runUnlockedCleanup();
        }

        public void preWriteCleanup(long j) {
            runLockedCleanup(j);
        }

        public V put(K k, int i, V v2, boolean z) {
            InterfaceC2735a<K, V> interfaceC2735a;
            int i2;
            lock();
            try {
                long jMo15540a = this.map.f10717p.mo15540a();
                preWriteCleanup(jMo15540a);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC2735a<K, V> interfaceC2735a2 = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a2;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(k, key)) {
                        InterfaceC2718s<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (v3 != null) {
                            long j = jMo15540a;
                            InterfaceC2735a<K, V> interfaceC2735a3 = next;
                            if (z) {
                                recordLockedRead(interfaceC2735a3, j);
                                return v3;
                            }
                            this.modCount++;
                            enqueueNotification(k, i, v3, valueReference.mo15586c(), RemovalCause.REPLACED);
                            setValue(interfaceC2735a3, k, v2, j);
                            evictEntries(interfaceC2735a3);
                            return v3;
                        }
                        this.modCount++;
                        if (valueReference.mo15589k()) {
                            enqueueNotification(k, i, v3, valueReference.mo15586c(), RemovalCause.COLLECTED);
                            InterfaceC2735a<K, V> interfaceC2735a4 = next;
                            setValue(interfaceC2735a4, k, v2, jMo15540a);
                            i2 = this.count;
                            interfaceC2735a = interfaceC2735a4;
                        } else {
                            InterfaceC2735a<K, V> interfaceC2735a5 = next;
                            setValue(interfaceC2735a5, k, v2, jMo15540a);
                            interfaceC2735a = interfaceC2735a5;
                            i2 = this.count + 1;
                        }
                        this.count = i2;
                        evictEntries(interfaceC2735a);
                        return null;
                    }
                    long j2 = jMo15540a;
                    next = next.getNext();
                    jMo15540a = j2;
                }
                this.modCount++;
                InterfaceC2735a<K, V> interfaceC2735aNewEntry = newEntry(k, i, interfaceC2735a2);
                setValue(interfaceC2735aNewEntry, k, v2, jMo15540a);
                atomicReferenceArray.set(length, interfaceC2735aNewEntry);
                this.count++;
                evictEntries(interfaceC2735aNewEntry);
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public boolean reclaimKey(InterfaceC2735a<K, V> interfaceC2735a, int i) throws Throwable {
            Segment<K, V> segment;
            lock();
            try {
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2735a<K, V> interfaceC2735a2 = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a2;
                while (next != null) {
                    if (next == interfaceC2735a) {
                        this.modCount++;
                        segment = this;
                        InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2735a2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                        segment.count = i2;
                        segment.unlock();
                        segment.postWriteCleanup();
                        return true;
                    }
                    segment = this;
                    int i3 = i;
                    try {
                        next = next.getNext();
                        this = segment;
                        i = i3;
                    } catch (Throwable th) {
                        th = th;
                    }
                    th = th;
                    Throwable th2 = th;
                    segment.unlock();
                    segment.postWriteCleanup();
                    throw th2;
                }
                Segment<K, V> segment2 = this;
                segment2.unlock();
                segment2.postWriteCleanup();
                return false;
            } catch (Throwable th3) {
                th = th3;
                segment = this;
            }
        }

        public boolean reclaimValue(K k, int i, InterfaceC2718s<K, V> interfaceC2718s) throws Throwable {
            Segment<K, V> segment;
            lock();
            try {
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(k, key)) {
                        if (next.getValueReference() != interfaceC2718s) {
                            Segment<K, V> segment2 = this;
                            segment2.unlock();
                            if (!segment2.isHeldByCurrentThread()) {
                                segment2.postWriteCleanup();
                            }
                            return false;
                        }
                        this.modCount++;
                        segment = this;
                        InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2735a, next, key, i, interfaceC2718s.get(), interfaceC2718s, RemovalCause.COLLECTED);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                        segment.count = i2;
                        segment.unlock();
                        if (!segment.isHeldByCurrentThread()) {
                            segment.postWriteCleanup();
                        }
                        return true;
                    }
                    segment = this;
                    int i3 = i;
                    InterfaceC2718s<K, V> interfaceC2718s2 = interfaceC2718s;
                    try {
                        next = next.getNext();
                        this = segment;
                        i = i3;
                        interfaceC2718s = interfaceC2718s2;
                    } catch (Throwable th) {
                        th = th;
                    }
                    th = th;
                    Throwable th2 = th;
                    segment.unlock();
                    if (segment.isHeldByCurrentThread()) {
                        throw th2;
                    }
                    segment.postWriteCleanup();
                    throw th2;
                }
                Segment<K, V> segment3 = this;
                segment3.unlock();
                if (!segment3.isHeldByCurrentThread()) {
                    segment3.postWriteCleanup();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                segment = this;
            }
        }

        public void recordLockedRead(InterfaceC2735a<K, V> interfaceC2735a, long j) {
            if (this.map.m15553C()) {
                interfaceC2735a.setAccessTime(j);
            }
            this.accessQueue.add(interfaceC2735a);
        }

        public void recordRead(InterfaceC2735a<K, V> interfaceC2735a, long j) {
            if (this.map.m15553C()) {
                interfaceC2735a.setAccessTime(j);
            }
            this.recencyQueue.add(interfaceC2735a);
        }

        public void recordWrite(InterfaceC2735a<K, V> interfaceC2735a, int i, long j) {
            drainRecencyQueue();
            this.totalWeight += (long) i;
            if (this.map.m15553C()) {
                interfaceC2735a.setAccessTime(j);
            }
            if (this.map.m15555E()) {
                interfaceC2735a.setWriteTime(j);
            }
            this.accessQueue.add(interfaceC2735a);
            this.writeQueue.add(interfaceC2735a);
        }

        public V refresh(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            C2710k<K, V> c2710kInsertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (c2710kInsertLoadingValueReference == null) {
                return null;
            }
            hpr<V> hprVarLoadAsync = loadAsync(k, i, c2710kInsertLoadingValueReference, cacheLoader);
            if (hprVarLoadAsync.isDone()) {
                try {
                    return (V) qxj0.m178604a(hprVarLoadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        public boolean remove(Object obj, int i, Object obj2) throws Throwable {
            Segment<K, V> segment;
            Throwable th;
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.f10717p.mo15540a());
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(obj, key)) {
                        InterfaceC2718s<K, V> valueReference = next.getValueReference();
                        V v2 = valueReference.get();
                        if (!this.map.f10707f.equivalent(obj2, v2)) {
                            if (v2 != null || !valueReference.mo15589k()) {
                                break;
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th2) {
                                th = th2;
                                segment = this;
                            }
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        segment = this;
                        InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2735a, next, key, i, v2, valueReference, removalCause2);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                        segment.count = i2;
                        boolean z = removalCause2 == RemovalCause.EXPLICIT;
                        segment.unlock();
                        segment.postWriteCleanup();
                        return z;
                    }
                    segment = this;
                    int i3 = i;
                    try {
                        next = next.getNext();
                        this = segment;
                        i = i3;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    th = th3;
                    th = th;
                    segment.unlock();
                    segment.postWriteCleanup();
                    throw th;
                }
                Segment<K, V> segment2 = this;
                segment2.unlock();
                segment2.postWriteCleanup();
                return false;
            } catch (Throwable th4) {
                th = th4;
                segment = this;
            }
        }

        public void removeCollectedEntry(InterfaceC2735a<K, V> interfaceC2735a) {
            enqueueNotification(interfaceC2735a.getKey(), interfaceC2735a.getHash(), interfaceC2735a.getValueReference().get(), interfaceC2735a.getValueReference().mo15586c(), RemovalCause.COLLECTED);
            this.writeQueue.remove(interfaceC2735a);
            this.accessQueue.remove(interfaceC2735a);
        }

        public boolean removeEntry(InterfaceC2735a<K, V> interfaceC2735a, int i, RemovalCause removalCause) {
            AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC2735a<K, V> interfaceC2735a2 = atomicReferenceArray.get(length);
            for (InterfaceC2735a<K, V> next = interfaceC2735a2; next != null; next = next.getNext()) {
                if (next == interfaceC2735a) {
                    this.modCount++;
                    InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = removeValueFromChain(interfaceC2735a2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                    this.count = i2;
                    return true;
                }
            }
            return false;
        }

        public InterfaceC2735a<K, V> removeEntryFromChain(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2) {
            int i = this.count;
            InterfaceC2735a<K, V> next = interfaceC2735a2.getNext();
            while (interfaceC2735a != interfaceC2735a2) {
                InterfaceC2735a<K, V> interfaceC2735aCopyEntry = copyEntry(interfaceC2735a, next);
                if (interfaceC2735aCopyEntry != null) {
                    next = interfaceC2735aCopyEntry;
                } else {
                    removeCollectedEntry(interfaceC2735a);
                    i--;
                }
                interfaceC2735a = interfaceC2735a.getNext();
            }
            this.count = i;
            return next;
        }

        public boolean removeLoadingValue(K k, int i, C2710k<K, V> c2710k) {
            lock();
            try {
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                for (InterfaceC2735a<K, V> next = interfaceC2735a; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(k, key)) {
                        if (next.getValueReference() != c2710k) {
                            break;
                        }
                        if (c2710k.mo15589k()) {
                            next.setValueReference(c2710k.m15607h());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(interfaceC2735a, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public InterfaceC2735a<K, V> removeValueFromChain(InterfaceC2735a<K, V> interfaceC2735a, InterfaceC2735a<K, V> interfaceC2735a2, K k, int i, V v2, InterfaceC2718s<K, V> interfaceC2718s, RemovalCause removalCause) {
            enqueueNotification(k, i, v2, interfaceC2718s.mo15586c(), removalCause);
            this.writeQueue.remove(interfaceC2735a2);
            this.accessQueue.remove(interfaceC2735a2);
            if (!interfaceC2718s.isLoading()) {
                return removeEntryFromChain(interfaceC2735a, interfaceC2735a2);
            }
            interfaceC2718s.mo15585b(null);
            return interfaceC2735a;
        }

        public boolean replace(K k, int i, V v2, V v3) {
            int i2 = i;
            lock();
            try {
                long jMo15540a = this.map.f10717p.mo15540a();
                preWriteCleanup(jMo15540a);
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a;
                while (next != null) {
                    InterfaceC2735a<K, V> interfaceC2735a2 = next;
                    K key = interfaceC2735a2.getKey();
                    if (interfaceC2735a2.getHash() == i2 && key != null && this.map.f10706e.equivalent(k, key)) {
                        long j = jMo15540a;
                        InterfaceC2718s<K, V> valueReference = interfaceC2735a2.getValueReference();
                        V v4 = valueReference.get();
                        if (v4 != null) {
                            if (!this.map.f10707f.equivalent(v2, v4)) {
                                recordLockedRead(interfaceC2735a2, j);
                                break;
                            }
                            this.modCount++;
                            enqueueNotification(k, i, v4, valueReference.mo15586c(), RemovalCause.REPLACED);
                            setValue(interfaceC2735a2, k, v3, j);
                            evictEntries(interfaceC2735a2);
                            unlock();
                            postWriteCleanup();
                            return true;
                        }
                        if (!valueReference.mo15589k()) {
                            break;
                        }
                        this.modCount++;
                        InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = removeValueFromChain(interfaceC2735a, interfaceC2735a2, key, i2, v4, valueReference, RemovalCause.COLLECTED);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                        this.count = i3;
                        break;
                    }
                    InterfaceC2735a<K, V> interfaceC2735a3 = interfaceC2735a;
                    long j2 = jMo15540a;
                    next = interfaceC2735a2.getNext();
                    interfaceC2735a = interfaceC2735a3;
                    i2 = i;
                    jMo15540a = j2;
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        public void runLockedCleanup(long j) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void runUnlockedCleanup() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.map.m15583z();
        }

        public V scheduleRefresh(InterfaceC2735a<K, V> interfaceC2735a, K k, int i, V v2, long j, CacheLoader<? super K, V> cacheLoader) {
            V vRefresh;
            return (!this.map.m15557G() || j - interfaceC2735a.getWriteTime() <= this.map.f10714m || interfaceC2735a.getValueReference().isLoading() || (vRefresh = refresh(k, i, cacheLoader, true)) == null) ? v2 : vRefresh;
        }

        public void setValue(InterfaceC2735a<K, V> interfaceC2735a, K k, V v2, long j) {
            InterfaceC2718s<K, V> valueReference = interfaceC2735a.getValueReference();
            int iWeigh = this.map.f10711j.weigh(k, v2);
            xn80.m212118w(iWeigh >= 0, "Weights must be non-negative");
            interfaceC2735a.setValueReference(this.map.f10709h.referenceValue(this, interfaceC2735a, v2, iWeigh));
            recordWrite(interfaceC2735a, iWeigh, j);
            valueReference.mo15585b(v2);
        }

        public boolean storeLoadedValue(K k, int i, C2710k<K, V> c2710k, V v2) {
            lock();
            try {
                long jMo15540a = this.map.f10717p.mo15540a();
                preWriteCleanup(jMo15540a);
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                for (InterfaceC2735a<K, V> next = interfaceC2735a; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(k, key)) {
                        InterfaceC2718s<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (c2710k != valueReference && (v3 != null || valueReference == LocalCache.f10700x)) {
                            enqueueNotification(k, i, v2, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.modCount++;
                        if (c2710k.mo15589k()) {
                            enqueueNotification(k, i, v3, c2710k.mo15586c(), v3 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i2--;
                        }
                        InterfaceC2735a<K, V> interfaceC2735a2 = next;
                        setValue(interfaceC2735a2, k, v2, jMo15540a);
                        this.count = i2;
                        evictEntries(interfaceC2735a2);
                        return true;
                    }
                }
                this.modCount++;
                InterfaceC2735a<K, V> interfaceC2735aNewEntry = newEntry(k, i, interfaceC2735a);
                setValue(interfaceC2735aNewEntry, k, v2, jMo15540a);
                atomicReferenceArray.set(length, interfaceC2735aNewEntry);
                this.count = i2;
                evictEntries(interfaceC2735aNewEntry);
                return true;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public void tryExpireEntries(long j) {
            if (tryLock()) {
                try {
                    expireEntries(j);
                } finally {
                    unlock();
                }
            }
        }

        public V waitForLoadingValue(InterfaceC2735a<K, V> interfaceC2735a, K k, InterfaceC2718s<K, V> interfaceC2718s) throws ExecutionException {
            if (!interfaceC2718s.isLoading()) {
                aqg0.m99478a();
                return null;
            }
            xn80.m212121z(!Thread.holdsLock(interfaceC2735a), "Recursive load of: %s", k);
            try {
                V vMo15587d = interfaceC2718s.mo15587d();
                if (vMo15587d != null) {
                    recordRead(interfaceC2735a, this.map.f10717p.mo15540a());
                    this.statsCounter.mo15536d(1);
                    return vMo15587d;
                }
                String strValueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(strValueOf);
                sb.append(".");
                throw new CacheLoader.InvalidCacheLoadException(sb.toString());
            } catch (Throwable th) {
                this.statsCounter.mo15536d(1);
                throw th;
            }
        }

        public V get(Object obj, int i) throws Throwable {
            Segment<K, V> segment;
            try {
                if (this.count != 0) {
                    long jMo15540a = this.map.f10717p.mo15540a();
                    InterfaceC2735a<K, V> liveEntry = getLiveEntry(obj, i, jMo15540a);
                    if (liveEntry == null) {
                        postReadCleanup();
                        return null;
                    }
                    V v2 = liveEntry.getValueReference().get();
                    try {
                        if (v2 != null) {
                            recordRead(liveEntry, jMo15540a);
                            V vScheduleRefresh = scheduleRefresh(liveEntry, liveEntry.getKey(), i, v2, jMo15540a, this.map.f10720s);
                            postReadCleanup();
                            return vScheduleRefresh;
                        }
                        segment = this;
                        segment.tryDrainReferenceQueues();
                    } catch (Throwable th) {
                        th = th;
                    }
                    Throwable th2 = th;
                    postReadCleanup();
                    throw th2;
                }
                segment = this;
                segment.postReadCleanup();
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public V remove(Object obj, int i) throws Throwable {
            Segment<K, V> segment;
            Throwable th;
            RemovalCause removalCause;
            lock();
            try {
                preWriteCleanup(this.map.f10717p.mo15540a());
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(obj, key)) {
                        InterfaceC2718s<K, V> valueReference = next.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 != null) {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th2) {
                                th = th2;
                                segment = this;
                            }
                        } else {
                            if (!valueReference.mo15589k()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        segment = this;
                        InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2735a, next, key, i, v2, valueReference, removalCause2);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                        segment.count = i2;
                        segment.unlock();
                        segment.postWriteCleanup();
                        return v2;
                    }
                    segment = this;
                    int i3 = i;
                    try {
                        next = next.getNext();
                        this = segment;
                        i = i3;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    th = th3;
                    th = th;
                    segment.unlock();
                    segment.postWriteCleanup();
                    throw th;
                }
                Segment<K, V> segment2 = this;
                segment2.unlock();
                segment2.postWriteCleanup();
                return null;
            } catch (Throwable th4) {
                th = th4;
                segment = this;
            }
        }

        public V replace(K k, int i, V v2) {
            lock();
            try {
                long jMo15540a = this.map.f10717p.mo15540a();
                preWriteCleanup(jMo15540a);
                AtomicReferenceArray<InterfaceC2735a<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC2735a<K, V> interfaceC2735a = atomicReferenceArray.get(length);
                InterfaceC2735a<K, V> next = interfaceC2735a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10706e.equivalent(k, key)) {
                        long j = jMo15540a;
                        InterfaceC2718s<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (v3 == null) {
                            if (!valueReference.mo15589k()) {
                                break;
                            }
                            this.modCount++;
                            InterfaceC2735a<K, V> interfaceC2735aRemoveValueFromChain = removeValueFromChain(interfaceC2735a, next, key, i, v3, valueReference, RemovalCause.COLLECTED);
                            int i2 = this.count - 1;
                            atomicReferenceArray.set(length, interfaceC2735aRemoveValueFromChain);
                            this.count = i2;
                            break;
                        }
                        InterfaceC2735a<K, V> interfaceC2735a2 = next;
                        this.modCount++;
                        enqueueNotification(k, i, v3, valueReference.mo15586c(), RemovalCause.REPLACED);
                        setValue(interfaceC2735a2, k, v2, j);
                        evictEntries(interfaceC2735a2);
                        unlock();
                        postWriteCleanup();
                        return v3;
                    }
                    InterfaceC2735a<K, V> interfaceC2735a3 = interfaceC2735a;
                    long j2 = jMo15540a;
                    next = next.getNext();
                    interfaceC2735a = interfaceC2735a3;
                    jMo15540a = j2;
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }
    }
}
