package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.C3080e;
import com.google.common.util.concurrent.C3082g;
import com.google.common.util.concurrent.C3083h;
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
import p149l.AbstractC15537a8;
import p149l.C15535a7;
import p149l.InterfaceC15818b7;
import p149l.cqi0;
import p149l.gaj;
import p149l.gnr;
import p149l.ix3;
import p149l.ixf0;
import p149l.lmr;
import p149l.mnp0;
import p149l.noj0;
import p149l.pzi;
import p149l.sf80;
import p149l.shg0;
import p149l.vqc0;
import p149l.vrv;
import p149l.vw3;

/* JADX INFO: loaded from: classes7.dex */
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: w */
    public static final Logger f10662w = Logger.getLogger(LocalCache.class.getName());

    /* JADX INFO: renamed from: x */
    public static final InterfaceC2695s<Object, Object> f10663x = new C2673a();

    /* JADX INFO: renamed from: y */
    public static final Queue<?> f10664y = new C2675b();

    /* JADX INFO: renamed from: a */
    public final int f10665a;

    /* JADX INFO: renamed from: b */
    public final int f10666b;

    /* JADX INFO: renamed from: c */
    public final Segment<K, V>[] f10667c;

    /* JADX INFO: renamed from: d */
    public final int f10668d;

    /* JADX INFO: renamed from: e */
    public final Equivalence<Object> f10669e;

    /* JADX INFO: renamed from: f */
    public final Equivalence<Object> f10670f;

    /* JADX INFO: renamed from: g */
    public final Strength f10671g;

    /* JADX INFO: renamed from: h */
    public final Strength f10672h;

    /* JADX INFO: renamed from: i */
    public final long f10673i;

    /* JADX INFO: renamed from: j */
    public final mnp0<K, V> f10674j;

    /* JADX INFO: renamed from: k */
    public final long f10675k;

    /* JADX INFO: renamed from: l */
    public final long f10676l;

    /* JADX INFO: renamed from: m */
    public final long f10677m;

    /* JADX INFO: renamed from: n */
    public final Queue<RemovalNotification<K, V>> f10678n;

    /* JADX INFO: renamed from: o */
    public final vqc0<K, V> f10679o;

    /* JADX INFO: renamed from: p */
    public final cqi0 f10680p;

    /* JADX INFO: renamed from: q */
    public final EntryFactory f10681q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC15818b7 f10682r;

    /* JADX INFO: renamed from: s */
    public final CacheLoader<? super K, V> f10683s;

    /* JADX INFO: renamed from: t */
    public Set<K> f10684t;

    /* JADX INFO: renamed from: u */
    public Collection<V> f10685u;

    /* JADX INFO: renamed from: v */
    public Set<Map.Entry<K, V>> f10686v;

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements vrv<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        transient vrv<K, V> autoDelegate;

        public LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (vrv<K, V>) recreateCacheBuilder().m15455b(this.loader);
        }

        private Object readResolve() {
            return this.autoDelegate;
        }

        @Override // p149l.vrv, p149l.gaj
        public final V apply(K k) {
            return this.autoDelegate.apply(k);
        }

        @Override // p149l.vrv
        public V get(K k) throws ExecutionException {
            return this.autoDelegate.get(k);
        }

        @Override // p149l.vrv
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // p149l.vrv
        public V getUnchecked(K k) {
            return this.autoDelegate.getUnchecked(k);
        }

        @Override // p149l.vrv
        public void refresh(K k) {
            this.autoDelegate.refresh(k);
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements vrv<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) sf80.m183894p(cacheLoader)), null);
        }

        @Override // p149l.vrv, p149l.gaj
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // p149l.vrv
        public V get(K k) throws ExecutionException {
            return this.localCache.m15522p(k);
        }

        @Override // p149l.vrv
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.localCache.m15518l(iterable);
        }

        @Override // p149l.vrv
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // p149l.vrv
        public void refresh(K k) {
            this.localCache.m15502F(k);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    public enum NullEntry implements InterfaceC2712a<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.InterfaceC2712a
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2695s<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setNextInAccessQueue(InterfaceC2712a<Object, Object> interfaceC2712a) {
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setNextInWriteQueue(InterfaceC2712a<Object, Object> interfaceC2712a) {
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setPreviousInAccessQueue(InterfaceC2712a<Object, Object> interfaceC2712a) {
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setPreviousInWriteQueue(InterfaceC2712a<Object, Object> interfaceC2712a) {
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setValueReference(InterfaceC2695s<Object, Object> interfaceC2695s) {
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setWriteTime(long j) {
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$a */
    public class C2673a implements InterfaceC2695s<Object, Object> {
        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: a */
        public InterfaceC2712a<Object, Object> mo15530a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: b */
        public void mo15531b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: d */
        public Object mo15533d() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<Object, Object> mo15534e(ReferenceQueue<Object> referenceQueue, Object obj, InterfaceC2712a<Object, Object> interfaceC2712a) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: k */
        public boolean mo15535k() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$a0 */
    public static final class C2674a0<K, V> extends C2692p<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f10693b;

        public C2674a0(V v2, int i) {
            super(v2);
            this.f10693b = i;
        }

        @Override // com.google.common.cache.LocalCache.C2692p, com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return this.f10693b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$b */
    public class C2675b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.m15768of().iterator();
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
    public static final class C2676b0<K, V> extends C2700x<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f10694b;

        public C2676b0(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a, int i) {
            super(referenceQueue, v2, interfaceC2712a);
            this.f10694b = i;
        }

        @Override // com.google.common.cache.LocalCache.C2700x, com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return this.f10694b;
        }

        @Override // com.google.common.cache.LocalCache.C2700x, com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            return new C2676b0(referenceQueue, v2, interfaceC2712a, this.f10694b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c0 */
    public static final class C2678c0<K, V> extends AbstractQueue<InterfaceC2712a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2712a<K, V> f10696a = new a(this);

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c0$a */
        public class a extends AbstractC2679d<K, V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC2712a<K, V> f10697a = this;

            /* JADX INFO: renamed from: b */
            public InterfaceC2712a<K, V> f10698b = this;

            public a(C2678c0 c2678c0) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public InterfaceC2712a<K, V> getNextInWriteQueue() {
                return this.f10697a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
                return this.f10698b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
                this.f10697a = interfaceC2712a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
                this.f10698b = interfaceC2712a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public void setWriteTime(long j) {
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c0$b */
        public class b extends AbstractC15537a8<InterfaceC2712a<K, V>> {
            public b(InterfaceC2712a interfaceC2712a) {
                super(interfaceC2712a);
            }

            @Override // p149l.AbstractC15537a8
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC2712a<K, V> mo15539a(InterfaceC2712a<K, V> interfaceC2712a) {
                InterfaceC2712a<K, V> nextInWriteQueue = interfaceC2712a.getNextInWriteQueue();
                if (nextInWriteQueue == C2678c0.this.f10696a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(InterfaceC2712a<K, V> interfaceC2712a) {
            LocalCache.m15492d(interfaceC2712a.getPreviousInWriteQueue(), interfaceC2712a.getNextInWriteQueue());
            LocalCache.m15492d(this.f10696a.getPreviousInWriteQueue(), interfaceC2712a);
            LocalCache.m15492d(interfaceC2712a, this.f10696a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2712a<K, V> peek() {
            InterfaceC2712a<K, V> nextInWriteQueue = this.f10696a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f10696a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            InterfaceC2712a<K, V> nextInWriteQueue = this.f10696a.getNextInWriteQueue();
            while (true) {
                InterfaceC2712a<K, V> interfaceC2712a = this.f10696a;
                if (nextInWriteQueue == interfaceC2712a) {
                    interfaceC2712a.setNextInWriteQueue(interfaceC2712a);
                    InterfaceC2712a<K, V> interfaceC2712a2 = this.f10696a;
                    interfaceC2712a2.setPreviousInWriteQueue(interfaceC2712a2);
                    return;
                } else {
                    InterfaceC2712a<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.m15496y(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((InterfaceC2712a) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC2712a<K, V> poll() {
            InterfaceC2712a<K, V> nextInWriteQueue = this.f10696a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f10696a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f10696a.getNextInWriteQueue() == this.f10696a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<InterfaceC2712a<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            InterfaceC2712a interfaceC2712a = (InterfaceC2712a) obj;
            InterfaceC2712a<K, V> previousInWriteQueue = interfaceC2712a.getPreviousInWriteQueue();
            InterfaceC2712a<K, V> nextInWriteQueue = interfaceC2712a.getNextInWriteQueue();
            LocalCache.m15492d(previousInWriteQueue, nextInWriteQueue);
            LocalCache.m15496y(interfaceC2712a);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (InterfaceC2712a<K, V> nextInWriteQueue = this.f10696a.getNextInWriteQueue(); nextInWriteQueue != this.f10696a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$d */
    public static abstract class AbstractC2679d<K, V> implements InterfaceC2712a<K, V> {
        @Override // com.google.common.cache.InterfaceC2712a
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2695s<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setValueReference(InterfaceC2695s<K, V> interfaceC2695s) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$d0 */
    public final class C2680d0 implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10700a;

        /* JADX INFO: renamed from: b */
        public V f10701b;

        public C2680d0(K k, V v2) {
            this.f10700a = k;
            this.f10701b = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f10700a.equals(entry.getKey()) && this.f10701b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10700a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10701b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10701b.hashCode() ^ this.f10700a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = (V) LocalCache.this.put(this.f10700a, v2);
            this.f10701b = v2;
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
    public static final class C2681e<K, V> extends AbstractQueue<InterfaceC2712a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2712a<K, V> f10703a = new a(this);

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$e$a */
        public class a extends AbstractC2679d<K, V> {

            /* JADX INFO: renamed from: a */
            public InterfaceC2712a<K, V> f10704a = this;

            /* JADX INFO: renamed from: b */
            public InterfaceC2712a<K, V> f10705b = this;

            public a(C2681e c2681e) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public InterfaceC2712a<K, V> getNextInAccessQueue() {
                return this.f10704a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
                return this.f10705b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public void setAccessTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
                this.f10704a = interfaceC2712a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
            public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
                this.f10705b = interfaceC2712a;
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$e$b */
        public class b extends AbstractC15537a8<InterfaceC2712a<K, V>> {
            public b(InterfaceC2712a interfaceC2712a) {
                super(interfaceC2712a);
            }

            @Override // p149l.AbstractC15537a8
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC2712a<K, V> mo15539a(InterfaceC2712a<K, V> interfaceC2712a) {
                InterfaceC2712a<K, V> nextInAccessQueue = interfaceC2712a.getNextInAccessQueue();
                if (nextInAccessQueue == C2681e.this.f10703a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(InterfaceC2712a<K, V> interfaceC2712a) {
            LocalCache.m15491c(interfaceC2712a.getPreviousInAccessQueue(), interfaceC2712a.getNextInAccessQueue());
            LocalCache.m15491c(this.f10703a.getPreviousInAccessQueue(), interfaceC2712a);
            LocalCache.m15491c(interfaceC2712a, this.f10703a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2712a<K, V> peek() {
            InterfaceC2712a<K, V> nextInAccessQueue = this.f10703a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f10703a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            InterfaceC2712a<K, V> nextInAccessQueue = this.f10703a.getNextInAccessQueue();
            while (true) {
                InterfaceC2712a<K, V> interfaceC2712a = this.f10703a;
                if (nextInAccessQueue == interfaceC2712a) {
                    interfaceC2712a.setNextInAccessQueue(interfaceC2712a);
                    InterfaceC2712a<K, V> interfaceC2712a2 = this.f10703a;
                    interfaceC2712a2.setPreviousInAccessQueue(interfaceC2712a2);
                    return;
                } else {
                    InterfaceC2712a<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.m15495x(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((InterfaceC2712a) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC2712a<K, V> poll() {
            InterfaceC2712a<K, V> nextInAccessQueue = this.f10703a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f10703a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f10703a.getNextInAccessQueue() == this.f10703a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<InterfaceC2712a<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            InterfaceC2712a interfaceC2712a = (InterfaceC2712a) obj;
            InterfaceC2712a<K, V> previousInAccessQueue = interfaceC2712a.getPreviousInAccessQueue();
            InterfaceC2712a<K, V> nextInAccessQueue = interfaceC2712a.getNextInAccessQueue();
            LocalCache.m15491c(previousInAccessQueue, nextInAccessQueue);
            LocalCache.m15495x(interfaceC2712a);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (InterfaceC2712a<K, V> nextInAccessQueue = this.f10703a.getNextInAccessQueue(); nextInAccessQueue != this.f10703a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$f */
    public final class C2682f extends LocalCache<K, V>.AbstractC2684h<Map.Entry<K, V>> {
        public C2682f(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return m15548c();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$g */
    public final class C2683g extends LocalCache<K, V>.AbstractC2677c<Map.Entry<K, V>> {
        public C2683g() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.f10670f.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2682f(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$h */
    public abstract class AbstractC2684h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f10708a;

        /* JADX INFO: renamed from: b */
        public int f10709b = -1;

        /* JADX INFO: renamed from: c */
        public Segment<K, V> f10710c;

        /* JADX INFO: renamed from: d */
        public AtomicReferenceArray<InterfaceC2712a<K, V>> f10711d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2712a<K, V> f10712e;

        /* JADX INFO: renamed from: f */
        public LocalCache<K, V>.C2680d0 f10713f;

        /* JADX INFO: renamed from: g */
        public LocalCache<K, V>.C2680d0 f10714g;

        public AbstractC2684h() {
            this.f10708a = LocalCache.this.f10667c.length - 1;
            m15546a();
        }

        /* JADX INFO: renamed from: a */
        public final void m15546a() {
            this.f10713f = null;
            if (m15549d() || m15550e()) {
                return;
            }
            while (true) {
                int i = this.f10708a;
                if (i < 0) {
                    return;
                }
                Segment<K, V>[] segmentArr = LocalCache.this.f10667c;
                this.f10708a = i - 1;
                Segment<K, V> segment = segmentArr[i];
                this.f10710c = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.f10710c.table;
                    this.f10711d = atomicReferenceArray;
                    this.f10709b = atomicReferenceArray.length() - 1;
                    if (m15550e()) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m15547b(InterfaceC2712a<K, V> interfaceC2712a) {
            Segment<K, V> segment;
            try {
                long jMo15486a = LocalCache.this.f10680p.mo15486a();
                K key = interfaceC2712a.getKey();
                Object objM15521o = LocalCache.this.m15521o(interfaceC2712a, jMo15486a);
                if (objM15521o == null) {
                    return false;
                }
                this.f10713f = new C2680d0(key, objM15521o);
                return true;
            } finally {
                this.f10710c.postReadCleanup();
            }
        }

        /* JADX INFO: renamed from: c */
        public LocalCache<K, V>.C2680d0 m15548c() {
            LocalCache<K, V>.C2680d0 c2680d0 = this.f10713f;
            if (c2680d0 == null) {
                lmr.m150601a();
                return null;
            }
            this.f10714g = c2680d0;
            m15546a();
            return this.f10714g;
        }

        /* JADX INFO: renamed from: d */
        public boolean m15549d() {
            InterfaceC2712a<K, V> interfaceC2712a = this.f10712e;
            if (interfaceC2712a == null) {
                return false;
            }
            while (true) {
                this.f10712e = interfaceC2712a.getNext();
                InterfaceC2712a<K, V> interfaceC2712a2 = this.f10712e;
                if (interfaceC2712a2 == null) {
                    return false;
                }
                if (m15547b(interfaceC2712a2)) {
                    return true;
                }
                interfaceC2712a = this.f10712e;
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m15550e() {
            while (true) {
                int i = this.f10709b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.f10711d;
                this.f10709b = i - 1;
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(i);
                this.f10712e = interfaceC2712a;
                if (interfaceC2712a != null && (m15547b(interfaceC2712a) || m15549d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10713f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            sf80.m183900v(this.f10714g != null);
            LocalCache.this.remove(this.f10714g.getKey());
            this.f10714g = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$i */
    public final class C2685i extends LocalCache<K, V>.AbstractC2684h<K> {
        public C2685i(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m15548c().getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$j */
    public final class C2686j extends LocalCache<K, V>.AbstractC2677c<K> {
        public C2686j() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C2685i(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$l */
    public static class C2688l<K, V> extends SoftReference<V> implements InterfaceC2695s<K, V> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2712a<K, V> f10721a;

        public C2688l(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            super(v2, referenceQueue);
            this.f10721a = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: a */
        public InterfaceC2712a<K, V> mo15530a() {
            return this.f10721a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: b */
        public void mo15531b(V v2) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: d */
        public V mo15533d() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            return new C2688l(referenceQueue, v2, interfaceC2712a);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: k */
        public boolean mo15535k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$m */
    public static final class C2689m<K, V> extends C2691o<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f10722e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2712a<K, V> f10723f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2712a<K, V> f10724g;

        public C2689m(K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(k, i, interfaceC2712a);
            this.f10722e = Long.MAX_VALUE;
            this.f10723f = LocalCache.m15494w();
            this.f10724g = LocalCache.m15494w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public long getAccessTime() {
            return this.f10722e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInAccessQueue() {
            return this.f10723f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
            return this.f10724g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setAccessTime(long j) {
            this.f10722e = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10723f = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10724g = interfaceC2712a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$n */
    public static final class C2690n<K, V> extends C2691o<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f10725e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2712a<K, V> f10726f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2712a<K, V> f10727g;

        /* JADX INFO: renamed from: h */
        public volatile long f10728h;

        /* JADX INFO: renamed from: i */
        public InterfaceC2712a<K, V> f10729i;

        /* JADX INFO: renamed from: j */
        public InterfaceC2712a<K, V> f10730j;

        public C2690n(K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(k, i, interfaceC2712a);
            this.f10725e = Long.MAX_VALUE;
            this.f10726f = LocalCache.m15494w();
            this.f10727g = LocalCache.m15494w();
            this.f10728h = Long.MAX_VALUE;
            this.f10729i = LocalCache.m15494w();
            this.f10730j = LocalCache.m15494w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public long getAccessTime() {
            return this.f10725e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInAccessQueue() {
            return this.f10726f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInWriteQueue() {
            return this.f10729i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
            return this.f10727g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
            return this.f10730j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public long getWriteTime() {
            return this.f10728h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setAccessTime(long j) {
            this.f10725e = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10726f = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10729i = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10727g = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10730j = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setWriteTime(long j) {
            this.f10728h = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$o */
    public static class C2691o<K, V> extends AbstractC2679d<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10731a;

        /* JADX INFO: renamed from: b */
        public final int f10732b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2712a<K, V> f10733c;

        /* JADX INFO: renamed from: d */
        public volatile InterfaceC2695s<K, V> f10734d = LocalCache.m15489K();

        public C2691o(K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10731a = k;
            this.f10732b = i;
            this.f10733c = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public int getHash() {
            return this.f10732b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public K getKey() {
            return this.f10731a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNext() {
            return this.f10733c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2695s<K, V> getValueReference() {
            return this.f10734d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setValueReference(InterfaceC2695s<K, V> interfaceC2695s) {
            this.f10734d = interfaceC2695s;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$p */
    public static class C2692p<K, V> implements InterfaceC2695s<K, V> {

        /* JADX INFO: renamed from: a */
        public final V f10735a;

        public C2692p(V v2) {
            this.f10735a = v2;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: a */
        public InterfaceC2712a<K, V> mo15530a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: b */
        public void mo15531b(V v2) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: d */
        public V mo15533d() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public V get() {
            return this.f10735a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: k */
        public boolean mo15535k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$q */
    public static final class C2693q<K, V> extends C2691o<K, V> {

        /* JADX INFO: renamed from: e */
        public volatile long f10736e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2712a<K, V> f10737f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2712a<K, V> f10738g;

        public C2693q(K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(k, i, interfaceC2712a);
            this.f10736e = Long.MAX_VALUE;
            this.f10737f = LocalCache.m15494w();
            this.f10738g = LocalCache.m15494w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInWriteQueue() {
            return this.f10737f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
            return this.f10738g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public long getWriteTime() {
            return this.f10736e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10737f = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10738g = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC2679d, com.google.common.cache.InterfaceC2712a
        public void setWriteTime(long j) {
            this.f10736e = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$r */
    public final class C2694r extends LocalCache<K, V>.AbstractC2684h<V> {
        public C2694r(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m15548c().getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$s */
    public interface InterfaceC2695s<K, V> {
        /* JADX INFO: renamed from: a */
        InterfaceC2712a<K, V> mo15530a();

        /* JADX INFO: renamed from: b */
        void mo15531b(V v2);

        /* JADX INFO: renamed from: c */
        int mo15532c();

        /* JADX INFO: renamed from: d */
        V mo15533d() throws ExecutionException;

        /* JADX INFO: renamed from: e */
        InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a);

        V get();

        boolean isLoading();

        /* JADX INFO: renamed from: k */
        boolean mo15535k();
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$u */
    public static final class C2697u<K, V> extends C2699w<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f10740d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2712a<K, V> f10741e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2712a<K, V> f10742f;

        public C2697u(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(referenceQueue, k, i, interfaceC2712a);
            this.f10740d = Long.MAX_VALUE;
            this.f10741e = LocalCache.m15494w();
            this.f10742f = LocalCache.m15494w();
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public long getAccessTime() {
            return this.f10740d;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInAccessQueue() {
            return this.f10741e;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
            return this.f10742f;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setAccessTime(long j) {
            this.f10740d = j;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10741e = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10742f = interfaceC2712a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$v */
    public static final class C2698v<K, V> extends C2699w<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f10743d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2712a<K, V> f10744e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2712a<K, V> f10745f;

        /* JADX INFO: renamed from: g */
        public volatile long f10746g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2712a<K, V> f10747h;

        /* JADX INFO: renamed from: i */
        public InterfaceC2712a<K, V> f10748i;

        public C2698v(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(referenceQueue, k, i, interfaceC2712a);
            this.f10743d = Long.MAX_VALUE;
            this.f10744e = LocalCache.m15494w();
            this.f10745f = LocalCache.m15494w();
            this.f10746g = Long.MAX_VALUE;
            this.f10747h = LocalCache.m15494w();
            this.f10748i = LocalCache.m15494w();
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public long getAccessTime() {
            return this.f10743d;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInAccessQueue() {
            return this.f10744e;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInWriteQueue() {
            return this.f10747h;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
            return this.f10745f;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
            return this.f10748i;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public long getWriteTime() {
            return this.f10746g;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setAccessTime(long j) {
            this.f10743d = j;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10744e = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10747h = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10745f = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10748i = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setWriteTime(long j) {
            this.f10746g = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$w */
    public static class C2699w<K, V> extends WeakReference<K> implements InterfaceC2712a<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f10749a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2712a<K, V> f10750b;

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC2695s<K, V> f10751c;

        public C2699w(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(k, referenceQueue);
            this.f10751c = LocalCache.m15489K();
            this.f10749a = i;
            this.f10750b = interfaceC2712a;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public int getHash() {
            return this.f10749a;
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNext() {
            return this.f10750b;
        }

        public InterfaceC2712a<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC2712a<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC2712a<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public InterfaceC2695s<K, V> getValueReference() {
            return this.f10751c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC2712a
        public void setValueReference(InterfaceC2695s<K, V> interfaceC2695s) {
            this.f10751c = interfaceC2695s;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$x */
    public static class C2700x<K, V> extends WeakReference<V> implements InterfaceC2695s<K, V> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2712a<K, V> f10752a;

        public C2700x(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            super(v2, referenceQueue);
            this.f10752a = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: a */
        public InterfaceC2712a<K, V> mo15530a() {
            return this.f10752a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: b */
        public void mo15531b(V v2) {
        }

        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: d */
        public V mo15533d() {
            return get();
        }

        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            return new C2700x(referenceQueue, v2, interfaceC2712a);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: k */
        public boolean mo15535k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$y */
    public static final class C2701y<K, V> extends C2699w<K, V> {

        /* JADX INFO: renamed from: d */
        public volatile long f10753d;

        /* JADX INFO: renamed from: e */
        public InterfaceC2712a<K, V> f10754e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2712a<K, V> f10755f;

        public C2701y(ReferenceQueue<K> referenceQueue, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            super(referenceQueue, k, i, interfaceC2712a);
            this.f10753d = Long.MAX_VALUE;
            this.f10754e = LocalCache.m15494w();
            this.f10755f = LocalCache.m15494w();
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getNextInWriteQueue() {
            return this.f10754e;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public InterfaceC2712a<K, V> getPreviousInWriteQueue() {
            return this.f10755f;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public long getWriteTime() {
            return this.f10753d;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setNextInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10754e = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setPreviousInWriteQueue(InterfaceC2712a<K, V> interfaceC2712a) {
            this.f10755f = interfaceC2712a;
        }

        @Override // com.google.common.cache.LocalCache.C2699w, com.google.common.cache.InterfaceC2712a
        public void setWriteTime(long j) {
            this.f10753d = j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$z */
    public static final class C2702z<K, V> extends C2688l<K, V> {

        /* JADX INFO: renamed from: b */
        public final int f10756b;

        public C2702z(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a, int i) {
            super(referenceQueue, v2, interfaceC2712a);
            this.f10756b = i;
        }

        @Override // com.google.common.cache.LocalCache.C2688l, com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return this.f10756b;
        }

        @Override // com.google.common.cache.LocalCache.C2688l, com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            return new C2702z(referenceQueue, v2, interfaceC2712a, this.f10756b);
        }
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        this.f10668d = Math.min(cacheBuilder.m15461h(), 65536);
        Strength strengthM15466m = cacheBuilder.m15466m();
        this.f10671g = strengthM15466m;
        this.f10672h = cacheBuilder.m15473t();
        this.f10669e = cacheBuilder.m15465l();
        this.f10670f = cacheBuilder.m15472s();
        long jM15467n = cacheBuilder.m15467n();
        this.f10673i = jM15467n;
        this.f10674j = (mnp0<K, V>) cacheBuilder.m15474u();
        this.f10675k = cacheBuilder.m15462i();
        this.f10676l = cacheBuilder.m15463j();
        this.f10677m = cacheBuilder.m15468o();
        CacheBuilder.NullListener nullListener = (vqc0<K, V>) cacheBuilder.m15469p();
        this.f10679o = nullListener;
        this.f10678n = nullListener == CacheBuilder.NullListener.INSTANCE ? m15493g() : new ConcurrentLinkedQueue<>();
        this.f10680p = cacheBuilder.m15471r(m15500D());
        this.f10681q = EntryFactory.getFactory(strengthM15466m, m15505L(), m15509P());
        this.f10682r = cacheBuilder.m15470q().get();
        this.f10683s = cacheLoader;
        int iMin = Math.min(cacheBuilder.m15464k(), 1073741824);
        if (m15514h() && !m15513f()) {
            iMin = (int) Math.min(iMin, jM15467n);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f10668d && (!m15514h() || i4 * 20 <= this.f10673i)) {
            i3++;
            i4 <<= 1;
        }
        this.f10666b = 32 - i3;
        this.f10665a = i4 - 1;
        this.f10667c = m15528v(i4);
        int i5 = iMin / i4;
        while (i2 < (i5 * i4 < iMin ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (m15514h()) {
            long j = this.f10673i;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                Segment<K, V>[] segmentArr = this.f10667c;
                if (i >= segmentArr.length) {
                    return;
                }
                if (i == j4) {
                    j3--;
                }
                segmentArr[i] = m15512e(i2, j3, cacheBuilder.m15470q().get());
                i++;
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f10667c;
                if (i >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i] = m15512e(i2, -1L, cacheBuilder.m15470q().get());
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m15487H(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX INFO: renamed from: J */
    public static <E> ArrayList<E> m15488J(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.m15871a(arrayList, collection.iterator());
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static <K, V> InterfaceC2695s<K, V> m15489K() {
        return (InterfaceC2695s<K, V>) f10663x;
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> void m15491c(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
        interfaceC2712a.setNextInAccessQueue(interfaceC2712a2);
        interfaceC2712a2.setPreviousInAccessQueue(interfaceC2712a);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> void m15492d(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
        interfaceC2712a.setNextInWriteQueue(interfaceC2712a2);
        interfaceC2712a2.setPreviousInWriteQueue(interfaceC2712a);
    }

    /* JADX INFO: renamed from: g */
    public static <E> Queue<E> m15493g() {
        return (Queue<E>) f10664y;
    }

    /* JADX INFO: renamed from: w */
    public static <K, V> InterfaceC2712a<K, V> m15494w() {
        return NullEntry.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static <K, V> void m15495x(InterfaceC2712a<K, V> interfaceC2712a) {
        InterfaceC2712a<K, V> interfaceC2712aM15494w = m15494w();
        interfaceC2712a.setNextInAccessQueue(interfaceC2712aM15494w);
        interfaceC2712a.setPreviousInAccessQueue(interfaceC2712aM15494w);
    }

    /* JADX INFO: renamed from: y */
    public static <K, V> void m15496y(InterfaceC2712a<K, V> interfaceC2712a) {
        InterfaceC2712a<K, V> interfaceC2712aM15494w = m15494w();
        interfaceC2712a.setNextInWriteQueue(interfaceC2712aM15494w);
        interfaceC2712a.setPreviousInWriteQueue(interfaceC2712aM15494w);
    }

    /* JADX INFO: renamed from: A */
    public void m15497A(InterfaceC2712a<K, V> interfaceC2712a) throws Throwable {
        int hash = interfaceC2712a.getHash();
        m15504I(hash).reclaimKey(interfaceC2712a, hash);
    }

    /* JADX INFO: renamed from: B */
    public void m15498B(InterfaceC2695s<K, V> interfaceC2695s) throws Throwable {
        InterfaceC2712a<K, V> interfaceC2712aMo15530a = interfaceC2695s.mo15530a();
        int hash = interfaceC2712aMo15530a.getHash();
        m15504I(hash).reclaimValue(interfaceC2712aMo15530a.getKey(), hash, interfaceC2695s);
    }

    /* JADX INFO: renamed from: C */
    public boolean m15499C() {
        return m15515i();
    }

    /* JADX INFO: renamed from: D */
    public boolean m15500D() {
        return m15501E() || m15499C();
    }

    /* JADX INFO: renamed from: E */
    public boolean m15501E() {
        return m15516j() || m15503G();
    }

    /* JADX INFO: renamed from: F */
    public void m15502F(K k) {
        int iM15523q = m15523q(sf80.m183894p(k));
        m15504I(iM15523q).refresh(k, iM15523q, this.f10683s, false);
    }

    /* JADX INFO: renamed from: G */
    public boolean m15503G() {
        return this.f10677m > 0;
    }

    /* JADX INFO: renamed from: I */
    public Segment<K, V> m15504I(int i) {
        return this.f10667c[this.f10665a & (i >>> this.f10666b)];
    }

    /* JADX INFO: renamed from: L */
    public boolean m15505L() {
        return m15506M() || m15499C();
    }

    /* JADX INFO: renamed from: M */
    public boolean m15506M() {
        return m15515i() || m15514h();
    }

    /* JADX INFO: renamed from: N */
    public boolean m15507N() {
        return this.f10671g != Strength.STRONG;
    }

    /* JADX INFO: renamed from: O */
    public boolean m15508O() {
        return this.f10672h != Strength.STRONG;
    }

    /* JADX INFO: renamed from: P */
    public boolean m15509P() {
        return m15510Q() || m15501E();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m15510Q() {
        return m15516j();
    }

    /* JADX INFO: renamed from: b */
    public void m15511b() {
        for (Segment<K, V> segment : this.f10667c) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (Segment<K, V> segment : this.f10667c) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM15523q = m15523q(obj);
        return m15504I(iM15523q).containsKey(obj, iM15523q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        int i = 0;
        if (obj == null) {
            return false;
        }
        long jMo15486a = this.f10680p.mo15486a();
        Segment<K, V>[] segmentArr = this.f10667c;
        long j = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            int i3 = i == true ? 1 : 0;
            while (i3 < length) {
                Segment<K, V> segment = segmentArr[i3];
                int i4 = segment.count;
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = segment.table;
                int i5 = i;
                while (i5 < atomicReferenceArray.length()) {
                    InterfaceC2712a<K, V> next = atomicReferenceArray.get(i5);
                    while (next != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V liveValue = segment.getLiveValue(next, jMo15486a);
                        InterfaceC2712a<K, V> interfaceC2712a = next;
                        if (liveValue != null && this.f10670f.equivalent(obj, liveValue)) {
                            return true;
                        }
                        next = interfaceC2712a.getNext();
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
    public Segment<K, V> m15512e(int i, long j, InterfaceC15818b7 interfaceC15818b7) {
        return new Segment<>(this, i, j, interfaceC15818b7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f10686v;
        if (set != null) {
            return set;
        }
        C2683g c2683g = new C2683g();
        this.f10686v = c2683g;
        return c2683g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m15513f() {
        return this.f10674j != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM15523q = m15523q(obj);
        return m15504I(iM15523q).get(obj, iM15523q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    /* JADX INFO: renamed from: h */
    public boolean m15514h() {
        return this.f10673i >= 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15515i() {
        return this.f10675k > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f10667c;
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
    public boolean m15516j() {
        return this.f10676l > 0;
    }

    /* JADX INFO: renamed from: k */
    public V m15517k(K k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iM15523q = m15523q(sf80.m183894p(k));
        return m15504I(iM15523q).get(k, iM15523q, cacheLoader);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f10684t;
        if (set != null) {
            return set;
        }
        C2686j c2686j = new C2686j();
        this.f10684t = c2686j;
        return c2686j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public ImmutableMap<K, V> m15518l(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapM16044s = Maps.m16044s();
        LinkedHashSet linkedHashSetM16124i = Sets.m16124i();
        int i = 0;
        int i2 = 0;
        for (K k : iterable) {
            Object obj = get(k);
            if (!linkedHashMapM16044s.containsKey(k)) {
                linkedHashMapM16044s.put(k, obj);
                if (obj == null) {
                    i2++;
                    linkedHashSetM16124i.add(k);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!linkedHashSetM16124i.isEmpty()) {
                try {
                    Map mapM15526t = m15526t(Collections.unmodifiableSet(linkedHashSetM16124i), this.f10683s);
                    for (Object obj2 : linkedHashSetM16124i) {
                        Object obj3 = mapM15526t.get(obj2);
                        if (obj3 == null) {
                            String strValueOf = String.valueOf(obj2);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                            sb.append("loadAll failed to return a value for ");
                            sb.append(strValueOf);
                            throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                        }
                        linkedHashMapM16044s.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetM16124i) {
                        i2--;
                        linkedHashMapM16044s.put(obj4, m15517k(obj4, this.f10683s));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapM16044s);
            this.f10682r.mo15479a(i);
            this.f10682r.mo15482d(i2);
            return immutableMapCopyOf;
        } catch (Throwable th) {
            this.f10682r.mo15479a(i);
            this.f10682r.mo15482d(i2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public ImmutableMap<K, V> m15519m(Iterable<?> iterable) {
        ImmutableMap.C2786b c2786bBuilder = ImmutableMap.builder();
        int i = 0;
        int i2 = 0;
        for (Object obj : iterable) {
            V v2 = get(obj);
            if (v2 == null) {
                i2++;
            } else {
                c2786bBuilder.mo15661g(obj, v2);
                i++;
            }
        }
        this.f10682r.mo15479a(i);
        this.f10682r.mo15482d(i2);
        return c2786bBuilder.mo15659c();
    }

    /* JADX INFO: renamed from: n */
    public V m15520n(Object obj) throws Throwable {
        int iM15523q = m15523q(sf80.m183894p(obj));
        V v2 = m15504I(iM15523q).get(obj, iM15523q);
        InterfaceC15818b7 interfaceC15818b7 = this.f10682r;
        if (v2 == null) {
            interfaceC15818b7.mo15482d(1);
            return v2;
        }
        interfaceC15818b7.mo15479a(1);
        return v2;
    }

    /* JADX INFO: renamed from: o */
    public V m15521o(InterfaceC2712a<K, V> interfaceC2712a, long j) {
        V v2;
        if (interfaceC2712a.getKey() == null || (v2 = interfaceC2712a.getValueReference().get()) == null || m15525s(interfaceC2712a, j)) {
            return null;
        }
        return v2;
    }

    /* JADX INFO: renamed from: p */
    public V m15522p(K k) throws ExecutionException {
        return m15517k(k, this.f10683s);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        sf80.m183894p(k);
        sf80.m183894p(v2);
        int iM15523q = m15523q(k);
        return m15504I(iM15523q).put(k, iM15523q, v2, false);
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
        int iM15523q = m15523q(k);
        return m15504I(iM15523q).put(k, iM15523q, v2, true);
    }

    /* JADX INFO: renamed from: q */
    public int m15523q(Object obj) {
        return m15487H(this.f10669e.hash(obj));
    }

    /* JADX INFO: renamed from: r */
    public void m15524r(Iterable<?> iterable) {
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
        int iM15523q = m15523q(obj);
        return m15504I(iM15523q).remove(obj, iM15523q, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v2, V v3) {
        sf80.m183894p(k);
        sf80.m183894p(v3);
        if (v2 == null) {
            return false;
        }
        int iM15523q = m15523q(k);
        return m15504I(iM15523q).replace(k, iM15523q, v2, v3);
    }

    /* JADX INFO: renamed from: s */
    public boolean m15525s(InterfaceC2712a<K, V> interfaceC2712a, long j) {
        sf80.m183894p(interfaceC2712a);
        if (!m15515i() || j - interfaceC2712a.getAccessTime() < this.f10675k) {
            return m15516j() && j - interfaceC2712a.getWriteTime() >= this.f10676l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.m16468m(m15527u());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX INFO: renamed from: t */
    public Map<K, V> m15526t(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        sf80.m183894p(cacheLoader);
        sf80.m183894p(set);
        ixf0 ixf0VarM138842c = ixf0.m138842c();
        boolean z = true;
        boolean z2 = false;
        try {
            try {
                try {
                    Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                    if (mapLoadAll == null) {
                        this.f10682r.mo15483e(ixf0VarM138842c.m138844e(timeUnit));
                        String strValueOf = String.valueOf(cacheLoader);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31);
                        sb.append(strValueOf);
                        sb.append(" returned null map from loadAll");
                        throw new CacheLoader.InvalidCacheLoadException(sb.toString());
                    }
                    ixf0VarM138842c.m138847h();
                    for (Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                        K key = entry.getKey();
                        V value = entry.getValue();
                        if (key == null || value == null) {
                            z2 = true;
                        } else {
                            put(key, value);
                        }
                    }
                    InterfaceC15818b7 interfaceC15818b7 = this.f10682r;
                    if (!z2) {
                        interfaceC15818b7.mo15481c(ixf0VarM138842c.m138844e(timeUnit));
                        return mapLoadAll;
                    }
                    interfaceC15818b7.mo15483e(ixf0VarM138842c.m138844e(timeUnit));
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
                        this.f10682r.mo15483e(ixf0VarM138842c.m138844e(timeUnit));
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
                this.f10682r.mo15483e(ixf0VarM138842c.m138844e(timeUnit));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public long m15527u() {
        long jMax = 0;
        for (Segment<K, V> segment : this.f10667c) {
            jMax += (long) Math.max(0, segment.count);
        }
        return jMax;
    }

    /* JADX INFO: renamed from: v */
    public final Segment<K, V>[] m15528v(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f10685u;
        if (collection != null) {
            return collection;
        }
        C2696t c2696t = new C2696t();
        this.f10685u = c2696t;
        return c2696t;
    }

    /* JADX INFO: renamed from: z */
    public void m15529z() {
        while (true) {
            RemovalNotification<K, V> removalNotificationPoll = this.f10678n.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.f10679o.onRemoval(removalNotificationPoll);
            } catch (Throwable th) {
                f10662w.log(Level.WARNING, "Exception thrown by removal listener", th);
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
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2691o(k, i, interfaceC2712a);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2689m(k, i, interfaceC2712a);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2693q(k, i, interfaceC2712a);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2690n(k, i, interfaceC2712a);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2699w(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2697u(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2701y(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2698v(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2691o(k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2689m(k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2693q(k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2690n(k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2699w(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2697u(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2701y(segment.keyReferenceQueue, k, i, interfaceC2712a);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = super.copyEntry(segment, interfaceC2712a, interfaceC2712a2);
                copyAccessEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                copyWriteEntry(interfaceC2712a, interfaceC2712aCopyEntry);
                return interfaceC2712aCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
                return new C2698v(segment.keyReferenceQueue, k, i, interfaceC2712a);
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

        public <K, V> void copyAccessEntry(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
            interfaceC2712a2.setAccessTime(interfaceC2712a.getAccessTime());
            LocalCache.m15491c(interfaceC2712a.getPreviousInAccessQueue(), interfaceC2712a2);
            LocalCache.m15491c(interfaceC2712a2, interfaceC2712a.getNextInAccessQueue());
            LocalCache.m15495x(interfaceC2712a);
        }

        public <K, V> InterfaceC2712a<K, V> copyEntry(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
            return newEntry(segment, interfaceC2712a.getKey(), interfaceC2712a.getHash(), interfaceC2712a2);
        }

        public <K, V> void copyWriteEntry(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
            interfaceC2712a2.setWriteTime(interfaceC2712a.getWriteTime());
            LocalCache.m15492d(interfaceC2712a.getPreviousInWriteQueue(), interfaceC2712a2);
            LocalCache.m15492d(interfaceC2712a2, interfaceC2712a.getNextInWriteQueue());
            LocalCache.m15496y(interfaceC2712a);
        }

        public abstract <K, V> InterfaceC2712a<K, V> newEntry(Segment<K, V> segment, K k, int i, InterfaceC2712a<K, V> interfaceC2712a);

        public /* synthetic */ EntryFactory(String str, int i, C2673a c2673a) {
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
            public <K, V> InterfaceC2695s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, V v2, int i) {
                return i == 1 ? new C2692p(v2) : new C2674a0(v2, i);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC2695s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, V v2, int i) {
                return i == 1 ? new C2688l(segment.valueReferenceQueue, v2, interfaceC2712a) : new C2702z(segment.valueReferenceQueue, v2, interfaceC2712a, i);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC2695s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, V v2, int i) {
                return i == 1 ? new C2700x(segment.valueReferenceQueue, v2, interfaceC2712a) : new C2676b0(segment.valueReferenceQueue, v2, interfaceC2712a, i);
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> InterfaceC2695s<K, V> referenceValue(Segment<K, V> segment, InterfaceC2712a<K, V> interfaceC2712a, V v2, int i);

        /* synthetic */ Strength(C2673a c2673a) {
            this();
        }
    }

    public static class ManualSerializationProxy<K, V> extends pzi<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;
        transient vw3<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final vqc0<? super K, ? super V> removalListener;
        final cqi0 ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final mnp0<K, V> weigher;

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, mnp0<K, V> mnp0Var, int i, vqc0<? super K, ? super V> vqc0Var, cqi0 cqi0Var, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = mnp0Var;
            this.concurrencyLevel = i;
            this.removalListener = vqc0Var;
            this.ticker = (cqi0Var == cqi0.m108276b() || cqi0Var == CacheBuilder.f10639t) ? null : cqi0Var;
            this.loader = cacheLoader;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = (vw3<K, V>) recreateCacheBuilder().m15454a();
        }

        private Object readResolve() {
            return this.delegate;
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.m15448y().m15449A(this.keyStrength).m15450B(this.valueStrength).m15475v(this.keyEquivalence).m15452D(this.valueEquivalence).m15458e(this.concurrencyLevel).m15478z(this.removalListener);
            cacheBuilder.f10641a = false;
            long j = this.expireAfterWriteNanos;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (j > 0) {
                cacheBuilder.m15460g(j, timeUnit);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                cacheBuilder.m15459f(j2, timeUnit);
            }
            mnp0 mnp0Var = this.weigher;
            if (mnp0Var != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.m15453E(mnp0Var);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    cacheBuilder.m15477x(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    cacheBuilder.m15476w(j4);
                }
            }
            cqi0 cqi0Var = this.ticker;
            if (cqi0Var != null) {
                cacheBuilder.m15451C(cqi0Var);
            }
            return cacheBuilder;
        }

        @Override // p149l.pzi, p149l.a0j
        public vw3<K, V> delegate() {
            return this.delegate;
        }

        public ManualSerializationProxy(LocalCache<K, V> localCache) {
            this(localCache.f10671g, localCache.f10672h, localCache.f10669e, localCache.f10670f, localCache.f10676l, localCache.f10675k, localCache.f10673i, localCache.f10674j, localCache.f10668d, localCache.f10679o, localCache.f10680p, localCache.f10683s);
        }
    }

    public static class LocalManualCache<K, V> implements vw3<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$LocalManualCache$a */
        public class C2668a extends CacheLoader<Object, V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callable f10687a;

            public C2668a(LocalManualCache localManualCache, Callable callable) {
                this.f10687a = callable;
            }

            @Override // com.google.common.cache.CacheLoader
            public V load(Object obj) throws Exception {
                return (V) this.f10687a.call();
            }
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        @Override // p149l.vw3
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // p149l.vw3
        public void cleanUp() {
            this.localCache.m15511b();
        }

        @Override // p149l.vw3
        public V get(K k, Callable<? extends V> callable) throws ExecutionException {
            sf80.m183894p(callable);
            return this.localCache.m15517k(k, new C2668a(this, callable));
        }

        @Override // p149l.vw3
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.localCache.m15519m(iterable);
        }

        @Override // p149l.vw3
        public V getIfPresent(Object obj) {
            return this.localCache.m15520n(obj);
        }

        @Override // p149l.vw3
        public void invalidate(Object obj) {
            sf80.m183894p(obj);
            this.localCache.remove(obj);
        }

        @Override // p149l.vw3
        public void invalidateAll(Iterable<?> iterable) {
            this.localCache.m15524r(iterable);
        }

        @Override // p149l.vw3
        public void put(K k, V v2) {
            this.localCache.put(k, v2);
        }

        @Override // p149l.vw3
        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // p149l.vw3
        public long size() {
            return this.localCache.m15527u();
        }

        @Override // p149l.vw3
        public ix3 stats() {
            C15535a7 c15535a7 = new C15535a7();
            c15535a7.m95170g(this.localCache.f10682r);
            for (Segment<K, V> segment : this.localCache.f10667c) {
                c15535a7.m95170g(segment.statsCounter);
            }
            return c15535a7.mo15484f();
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        @Override // p149l.vw3
        public void invalidateAll() throws Throwable {
            this.localCache.clear();
        }

        public /* synthetic */ LocalManualCache(LocalCache localCache, C2673a c2673a) {
            this(localCache);
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.localCache = localCache;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$c */
    public abstract class AbstractC2677c<T> extends AbstractSet<T> {
        public AbstractC2677c() {
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
            return LocalCache.m15488J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m15488J(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$t */
    public final class C2696t extends AbstractCollection<V> {
        public C2696t() {
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
            return new C2694r(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.m15488J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m15488J(this).toArray(eArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LocalCache$k */
    public static class C2687k<K, V> implements InterfaceC2695s<K, V> {

        /* JADX INFO: renamed from: a */
        public volatile InterfaceC2695s<K, V> f10717a;

        /* JADX INFO: renamed from: b */
        public final C3083h<V> f10718b;

        /* JADX INFO: renamed from: c */
        public final ixf0 f10719c;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$k$a */
        public class a implements gaj<V, V> {
            public a() {
            }

            @Override // p149l.gaj
            public V apply(V v2) {
                C2687k.this.m15555j(v2);
                return v2;
            }
        }

        public C2687k(InterfaceC2695s<K, V> interfaceC2695s) {
            this.f10718b = C3083h.m16661G();
            this.f10719c = ixf0.m138843d();
            this.f10717a = interfaceC2695s;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: a */
        public InterfaceC2712a<K, V> mo15530a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: b */
        public void mo15531b(V v2) {
            if (v2 != null) {
                m15555j(v2);
            } else {
                this.f10717a = LocalCache.m15489K();
            }
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: c */
        public int mo15532c() {
            return this.f10717a.mo15532c();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: d */
        public V mo15533d() throws ExecutionException {
            return (V) noj0.m160415a(this.f10718b);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: e */
        public InterfaceC2695s<K, V> mo15534e(ReferenceQueue<V> referenceQueue, V v2, InterfaceC2712a<K, V> interfaceC2712a) {
            return this;
        }

        /* JADX INFO: renamed from: f */
        public long m15551f() {
            return this.f10719c.m138844e(TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: g */
        public final gnr<V> m15552g(Throwable th) {
            return C3080e.m16656c(th);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public V get() {
            return this.f10717a.get();
        }

        /* JADX INFO: renamed from: h */
        public InterfaceC2695s<K, V> m15553h() {
            return this.f10717a;
        }

        /* JADX INFO: renamed from: i */
        public gnr<V> m15554i(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f10719c.m138846g();
                V v2 = this.f10717a.get();
                if (v2 == null) {
                    V vLoad = cacheLoader.load(k);
                    return m15555j(vLoad) ? this.f10718b : C3080e.m16657d(vLoad);
                }
                gnr<V> gnrVarReload = cacheLoader.reload(k, v2);
                return gnrVarReload == null ? C3080e.m16657d(null) : C3080e.m16658e(gnrVarReload, new a(), C3082g.m16659a());
            } catch (Throwable th) {
                gnr<V> gnrVarM15552g = m15556l(th) ? this.f10718b : m15552g(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return gnrVarM15552g;
            }
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        public boolean isLoading() {
            return true;
        }

        /* JADX INFO: renamed from: j */
        public boolean m15555j(V v2) {
            return this.f10718b.mo16596C(v2);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC2695s
        /* JADX INFO: renamed from: k */
        public boolean mo15535k() {
            return this.f10717a.mo15535k();
        }

        /* JADX INFO: renamed from: l */
        public boolean m15556l(Throwable th) {
            return this.f10718b.mo16597D(th);
        }

        public C2687k() {
            this(LocalCache.m15489K());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM15523q = m15523q(obj);
        return m15504I(iM15523q).remove(obj, iM15523q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v2) {
        sf80.m183894p(k);
        sf80.m183894p(v2);
        int iM15523q = m15523q(k);
        return m15504I(iM15523q).replace(k, iM15523q, v2);
    }

    public static class Segment<K, V> extends ReentrantLock {
        final Queue<InterfaceC2712a<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<InterfaceC2712a<K, V>> recencyQueue;
        final InterfaceC15818b7 statsCounter;
        volatile AtomicReferenceArray<InterfaceC2712a<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<InterfaceC2712a<K, V>> writeQueue;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$Segment$a */
        public class RunnableC2669a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f10688a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f10689b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C2687k f10690c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ gnr f10691d;

            public RunnableC2669a(Object obj, int i, C2687k c2687k, gnr gnrVar) {
                this.f10688a = obj;
                this.f10689b = i;
                this.f10690c = c2687k;
                this.f10691d = gnrVar;
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
                    Segment.this.getAndRecordStats(this.f10688a, this.f10689b, this.f10690c, this.f10691d);
                } catch (Throwable th) {
                    LocalCache.f10662w.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f10690c.m15556l(th);
                }
            }
        }

        public Segment(LocalCache<K, V> localCache, int i, long j, InterfaceC15818b7 interfaceC15818b7) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (InterfaceC15818b7) sf80.m183894p(interfaceC15818b7);
            initTable(newEntryArray(i));
            this.keyReferenceQueue = localCache.m15507N() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.m15508O() ? new ReferenceQueue<>() : null;
            this.recencyQueue = localCache.m15506M() ? new ConcurrentLinkedQueue<>() : LocalCache.m15493g();
            this.writeQueue = localCache.m15510Q() ? new C2678c0<>() : LocalCache.m15493g();
            this.accessQueue = localCache.m15506M() ? new C2681e<>() : LocalCache.m15493g();
        }

        public void cleanUp() {
            runLockedCleanup(this.map.f10680p.mo15486a());
            runUnlockedCleanup();
        }

        public void clear() throws Throwable {
            Segment<K, V> segment;
            if (this.count == 0) {
                return;
            }
            lock();
            try {
                preWriteCleanup(this.map.f10680p.mo15486a());
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                for (int i = 0; i < atomicReferenceArray.length(); i++) {
                    InterfaceC2712a<K, V> next = atomicReferenceArray.get(i);
                    while (next != null) {
                        if (next.getValueReference().mo15535k()) {
                            K key = next.getKey();
                            V v2 = next.getValueReference().get();
                            segment = this;
                            try {
                                segment.enqueueNotification(key, next.getHash(), v2, next.getValueReference().mo15532c(), (key == null || v2 == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
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
            if (this.map.m15507N()) {
                clearKeyReferenceQueue();
            }
            if (this.map.m15508O()) {
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
                InterfaceC2712a<K, V> liveEntry = getLiveEntry(obj, i, this.map.f10680p.mo15486a());
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
                    long jMo15486a = this.map.f10680p.mo15486a();
                    AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (InterfaceC2712a<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next, jMo15486a);
                            if (liveValue != null && this.map.f10670f.equivalent(obj, liveValue)) {
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

        public InterfaceC2712a<K, V> copyEntry(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
            if (interfaceC2712a.getKey() == null) {
                return null;
            }
            InterfaceC2695s<K, V> valueReference = interfaceC2712a.getValueReference();
            V v2 = valueReference.get();
            if (v2 == null && valueReference.mo15535k()) {
                return null;
            }
            InterfaceC2712a<K, V> interfaceC2712aCopyEntry = this.map.f10681q.copyEntry(this, interfaceC2712a, interfaceC2712a2);
            interfaceC2712aCopyEntry.setValueReference(valueReference.mo15534e(this.valueReferenceQueue, v2, interfaceC2712aCopyEntry));
            return interfaceC2712aCopyEntry;
        }

        public void drainKeyReferenceQueue() throws Throwable {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.keyReferenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.m15497A((InterfaceC2712a) referencePoll);
                i++;
            } while (i != 16);
        }

        public void drainRecencyQueue() {
            while (true) {
                InterfaceC2712a<K, V> interfaceC2712aPoll = this.recencyQueue.poll();
                if (interfaceC2712aPoll == null) {
                    return;
                }
                if (this.accessQueue.contains(interfaceC2712aPoll)) {
                    this.accessQueue.add(interfaceC2712aPoll);
                }
            }
        }

        public void drainReferenceQueues() throws Throwable {
            if (this.map.m15507N()) {
                drainKeyReferenceQueue();
            }
            if (this.map.m15508O()) {
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
                this.map.m15498B((InterfaceC2695s) referencePoll);
                i++;
            } while (i != 16);
        }

        public void enqueueNotification(K k, int i, V v2, int i2, RemovalCause removalCause) {
            this.totalWeight -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.mo15480b();
            }
            if (this.map.f10678n != LocalCache.f10664y) {
                this.map.f10678n.offer(RemovalNotification.create(k, v2, removalCause));
            }
        }

        public void evictEntries(InterfaceC2712a<K, V> interfaceC2712a) {
            if (this.map.m15514h()) {
                drainRecencyQueue();
                if (interfaceC2712a.getValueReference().mo15532c() > this.maxSegmentWeight && !removeEntry(interfaceC2712a, interfaceC2712a.getHash(), RemovalCause.SIZE)) {
                    shg0.m184191a();
                    return;
                }
                while (this.totalWeight > this.maxSegmentWeight) {
                    InterfaceC2712a<K, V> nextEvictable = getNextEvictable();
                    if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                        shg0.m184191a();
                        return;
                    }
                }
            }
        }

        public void expand() {
            AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC2712a<K, V> next = atomicReferenceArray.get(i2);
                if (next != null) {
                    InterfaceC2712a<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InterfaceC2712a<K, V> interfaceC2712a = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC2712a = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, interfaceC2712a);
                        while (next != interfaceC2712a) {
                            int hash3 = next.getHash() & length2;
                            InterfaceC2712a<K, V> interfaceC2712aCopyEntry = copyEntry(next, atomicReferenceArrayNewEntryArray.get(hash3));
                            if (interfaceC2712aCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, interfaceC2712aCopyEntry);
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
            InterfaceC2712a<K, V> interfaceC2712aPeek;
            InterfaceC2712a<K, V> interfaceC2712aPeek2;
            drainRecencyQueue();
            do {
                interfaceC2712aPeek = this.writeQueue.peek();
                if (interfaceC2712aPeek == null || !this.map.m15525s(interfaceC2712aPeek, j)) {
                    do {
                        interfaceC2712aPeek2 = this.accessQueue.peek();
                        if (interfaceC2712aPeek2 == null || !this.map.m15525s(interfaceC2712aPeek2, j)) {
                            return;
                        }
                    } while (removeEntry(interfaceC2712aPeek2, interfaceC2712aPeek2.getHash(), RemovalCause.EXPIRED));
                    shg0.m184191a();
                    return;
                }
            } while (removeEntry(interfaceC2712aPeek, interfaceC2712aPeek.getHash(), RemovalCause.EXPIRED));
            shg0.m184191a();
        }

        public V get(K k, int i, CacheLoader<? super K, V> cacheLoader) throws Throwable {
            Segment<K, V> segment;
            K k2;
            InterfaceC2712a<K, V> entry;
            sf80.m183894p(k);
            sf80.m183894p(cacheLoader);
            try {
                try {
                    try {
                        if (this.count != 0 && (entry = getEntry(k, i)) != null) {
                            long jMo15486a = this.map.f10680p.mo15486a();
                            V liveValue = getLiveValue(entry, jMo15486a);
                            if (liveValue != null) {
                                recordRead(entry, jMo15486a);
                                this.statsCounter.mo15479a(1);
                                V vScheduleRefresh = scheduleRefresh(entry, k, i, liveValue, jMo15486a, cacheLoader);
                                postReadCleanup();
                                return vScheduleRefresh;
                            }
                            segment = this;
                            k2 = k;
                            InterfaceC2695s<K, V> valueReference = entry.getValueReference();
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

        public V getAndRecordStats(K k, int i, C2687k<K, V> c2687k, gnr<V> gnrVar) throws Throwable {
            V v2;
            try {
                v2 = (V) noj0.m160415a(gnrVar);
                try {
                    if (v2 != null) {
                        this.statsCounter.mo15481c(c2687k.m15551f());
                        storeLoadedValue(k, i, c2687k, v2);
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
                        this.statsCounter.mo15483e(c2687k.m15551f());
                        removeLoadingValue(k, i, c2687k);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v2 = null;
            }
        }

        public InterfaceC2712a<K, V> getEntry(Object obj, int i) {
            for (InterfaceC2712a<K, V> first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    K key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.f10669e.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public InterfaceC2712a<K, V> getFirst(int i) {
            AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public InterfaceC2712a<K, V> getLiveEntry(Object obj, int i, long j) {
            InterfaceC2712a<K, V> entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (!this.map.m15525s(entry, j)) {
                return entry;
            }
            tryExpireEntries(j);
            return null;
        }

        public V getLiveValue(InterfaceC2712a<K, V> interfaceC2712a, long j) {
            if (interfaceC2712a.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v2 = interfaceC2712a.getValueReference().get();
            if (v2 == null) {
                tryDrainReferenceQueues();
                return null;
            }
            if (!this.map.m15525s(interfaceC2712a, j)) {
                return v2;
            }
            tryExpireEntries(j);
            return null;
        }

        public InterfaceC2712a<K, V> getNextEvictable() {
            for (InterfaceC2712a<K, V> interfaceC2712a : this.accessQueue) {
                if (interfaceC2712a.getValueReference().mo15532c() > 0) {
                    return interfaceC2712a;
                }
            }
            shg0.m184191a();
            return null;
        }

        public void initTable(AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.m15513f()) {
                int i = this.threshold;
                if (i == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        public C2687k<K, V> insertLoadingValueReference(K k, int i, boolean z) {
            lock();
            try {
                long jMo15486a = this.map.f10680p.mo15486a();
                preWriteCleanup(jMo15486a);
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2712a<K, V> interfaceC2712a = (InterfaceC2712a) atomicReferenceArray.get(length);
                for (InterfaceC2712a next = interfaceC2712a; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(k, key)) {
                        InterfaceC2695s<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z || jMo15486a - next.getWriteTime() >= this.map.f10677m)) {
                            this.modCount++;
                            C2687k<K, V> c2687k = new C2687k<>(valueReference);
                            next.setValueReference(c2687k);
                            return c2687k;
                        }
                        return null;
                    }
                }
                this.modCount++;
                C2687k<K, V> c2687k2 = new C2687k<>();
                InterfaceC2712a<K, V> interfaceC2712aNewEntry = newEntry(k, i, interfaceC2712a);
                interfaceC2712aNewEntry.setValueReference(c2687k2);
                atomicReferenceArray.set(length, interfaceC2712aNewEntry);
                return c2687k2;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public gnr<V> loadAsync(K k, int i, C2687k<K, V> c2687k, CacheLoader<? super K, V> cacheLoader) {
            gnr<V> gnrVarM15554i = c2687k.m15554i(k, cacheLoader);
            gnrVarM15554i.addListener(new RunnableC2669a(k, i, c2687k, gnrVarM15554i), C3082g.m16659a());
            return gnrVarM15554i;
        }

        public V loadSync(K k, int i, C2687k<K, V> c2687k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return getAndRecordStats(k, i, c2687k, c2687k.m15554i(k, cacheLoader));
        }

        public V lockedGetOrLoad(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C2687k<K, V> c2687k;
            boolean z;
            InterfaceC2695s<K, V> valueReference;
            V vLoadSync;
            int i2 = i;
            lock();
            try {
                long jMo15486a = this.map.f10680p.mo15486a();
                preWriteCleanup(jMo15486a);
                int i3 = this.count - 1;
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> interfaceC2712aNewEntry = interfaceC2712a;
                while (true) {
                    c2687k = null;
                    if (interfaceC2712aNewEntry == null) {
                        z = true;
                        valueReference = null;
                        break;
                    }
                    long j = jMo15486a;
                    K key = interfaceC2712aNewEntry.getKey();
                    if (interfaceC2712aNewEntry.getHash() == i2 && key != null && this.map.f10669e.equivalent(k, key)) {
                        valueReference = interfaceC2712aNewEntry.getValueReference();
                        if (!valueReference.isLoading()) {
                            V v2 = valueReference.get();
                            if (v2 == null) {
                                enqueueNotification(key, i2, v2, valueReference.mo15532c(), RemovalCause.COLLECTED);
                                i2 = i;
                            } else {
                                if (!this.map.m15525s(interfaceC2712aNewEntry, j)) {
                                    recordLockedRead(interfaceC2712aNewEntry, j);
                                    this.statsCounter.mo15479a(1);
                                    unlock();
                                    postWriteCleanup();
                                    return v2;
                                }
                                i2 = i;
                                enqueueNotification(key, i2, v2, valueReference.mo15532c(), RemovalCause.EXPIRED);
                            }
                            this.writeQueue.remove(interfaceC2712aNewEntry);
                            this.accessQueue.remove(interfaceC2712aNewEntry);
                            this.count = i3;
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    interfaceC2712aNewEntry = interfaceC2712aNewEntry.getNext();
                    jMo15486a = j;
                }
                if (z) {
                    c2687k = new C2687k<>();
                    if (interfaceC2712aNewEntry == null) {
                        interfaceC2712aNewEntry = newEntry(k, i2, interfaceC2712a);
                        interfaceC2712aNewEntry.setValueReference(c2687k);
                        atomicReferenceArray.set(length, interfaceC2712aNewEntry);
                    } else {
                        interfaceC2712aNewEntry.setValueReference(c2687k);
                    }
                }
                unlock();
                postWriteCleanup();
                if (!z) {
                    return waitForLoadingValue(interfaceC2712aNewEntry, k, valueReference);
                }
                try {
                    synchronized (interfaceC2712aNewEntry) {
                        vLoadSync = loadSync(k, i2, c2687k, cacheLoader);
                    }
                    this.statsCounter.mo15482d(1);
                    return vLoadSync;
                } catch (Throwable th) {
                    this.statsCounter.mo15482d(1);
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
        public InterfaceC2712a<K, V> newEntry(K k, int i, InterfaceC2712a<K, V> interfaceC2712a) {
            return this.map.f10681q.newEntry(this, sf80.m183894p(k), i, interfaceC2712a);
        }

        public AtomicReferenceArray<InterfaceC2712a<K, V>> newEntryArray(int i) {
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
            InterfaceC2712a<K, V> interfaceC2712a;
            int i2;
            lock();
            try {
                long jMo15486a = this.map.f10680p.mo15486a();
                preWriteCleanup(jMo15486a);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC2712a<K, V> interfaceC2712a2 = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a2;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(k, key)) {
                        InterfaceC2695s<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (v3 != null) {
                            long j = jMo15486a;
                            InterfaceC2712a<K, V> interfaceC2712a3 = next;
                            if (z) {
                                recordLockedRead(interfaceC2712a3, j);
                                return v3;
                            }
                            this.modCount++;
                            enqueueNotification(k, i, v3, valueReference.mo15532c(), RemovalCause.REPLACED);
                            setValue(interfaceC2712a3, k, v2, j);
                            evictEntries(interfaceC2712a3);
                            return v3;
                        }
                        this.modCount++;
                        if (valueReference.mo15535k()) {
                            enqueueNotification(k, i, v3, valueReference.mo15532c(), RemovalCause.COLLECTED);
                            InterfaceC2712a<K, V> interfaceC2712a4 = next;
                            setValue(interfaceC2712a4, k, v2, jMo15486a);
                            i2 = this.count;
                            interfaceC2712a = interfaceC2712a4;
                        } else {
                            InterfaceC2712a<K, V> interfaceC2712a5 = next;
                            setValue(interfaceC2712a5, k, v2, jMo15486a);
                            interfaceC2712a = interfaceC2712a5;
                            i2 = this.count + 1;
                        }
                        this.count = i2;
                        evictEntries(interfaceC2712a);
                        return null;
                    }
                    long j2 = jMo15486a;
                    next = next.getNext();
                    jMo15486a = j2;
                }
                this.modCount++;
                InterfaceC2712a<K, V> interfaceC2712aNewEntry = newEntry(k, i, interfaceC2712a2);
                setValue(interfaceC2712aNewEntry, k, v2, jMo15486a);
                atomicReferenceArray.set(length, interfaceC2712aNewEntry);
                this.count++;
                evictEntries(interfaceC2712aNewEntry);
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        public boolean reclaimKey(InterfaceC2712a<K, V> interfaceC2712a, int i) throws Throwable {
            Segment<K, V> segment;
            lock();
            try {
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2712a<K, V> interfaceC2712a2 = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a2;
                while (next != null) {
                    if (next == interfaceC2712a) {
                        this.modCount++;
                        segment = this;
                        InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2712a2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
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

        public boolean reclaimValue(K k, int i, InterfaceC2695s<K, V> interfaceC2695s) throws Throwable {
            Segment<K, V> segment;
            lock();
            try {
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(k, key)) {
                        if (next.getValueReference() != interfaceC2695s) {
                            Segment<K, V> segment2 = this;
                            segment2.unlock();
                            if (!segment2.isHeldByCurrentThread()) {
                                segment2.postWriteCleanup();
                            }
                            return false;
                        }
                        this.modCount++;
                        segment = this;
                        InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2712a, next, key, i, interfaceC2695s.get(), interfaceC2695s, RemovalCause.COLLECTED);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
                        segment.count = i2;
                        segment.unlock();
                        if (!segment.isHeldByCurrentThread()) {
                            segment.postWriteCleanup();
                        }
                        return true;
                    }
                    segment = this;
                    int i3 = i;
                    InterfaceC2695s<K, V> interfaceC2695s2 = interfaceC2695s;
                    try {
                        next = next.getNext();
                        this = segment;
                        i = i3;
                        interfaceC2695s = interfaceC2695s2;
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

        public void recordLockedRead(InterfaceC2712a<K, V> interfaceC2712a, long j) {
            if (this.map.m15499C()) {
                interfaceC2712a.setAccessTime(j);
            }
            this.accessQueue.add(interfaceC2712a);
        }

        public void recordRead(InterfaceC2712a<K, V> interfaceC2712a, long j) {
            if (this.map.m15499C()) {
                interfaceC2712a.setAccessTime(j);
            }
            this.recencyQueue.add(interfaceC2712a);
        }

        public void recordWrite(InterfaceC2712a<K, V> interfaceC2712a, int i, long j) {
            drainRecencyQueue();
            this.totalWeight += (long) i;
            if (this.map.m15499C()) {
                interfaceC2712a.setAccessTime(j);
            }
            if (this.map.m15501E()) {
                interfaceC2712a.setWriteTime(j);
            }
            this.accessQueue.add(interfaceC2712a);
            this.writeQueue.add(interfaceC2712a);
        }

        public V refresh(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            C2687k<K, V> c2687kInsertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (c2687kInsertLoadingValueReference == null) {
                return null;
            }
            gnr<V> gnrVarLoadAsync = loadAsync(k, i, c2687kInsertLoadingValueReference, cacheLoader);
            if (gnrVarLoadAsync.isDone()) {
                try {
                    return (V) noj0.m160415a(gnrVarLoadAsync);
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
                preWriteCleanup(this.map.f10680p.mo15486a());
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(obj, key)) {
                        InterfaceC2695s<K, V> valueReference = next.getValueReference();
                        V v2 = valueReference.get();
                        if (!this.map.f10670f.equivalent(obj2, v2)) {
                            if (v2 != null || !valueReference.mo15535k()) {
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
                        InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2712a, next, key, i, v2, valueReference, removalCause2);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
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

        public void removeCollectedEntry(InterfaceC2712a<K, V> interfaceC2712a) {
            enqueueNotification(interfaceC2712a.getKey(), interfaceC2712a.getHash(), interfaceC2712a.getValueReference().get(), interfaceC2712a.getValueReference().mo15532c(), RemovalCause.COLLECTED);
            this.writeQueue.remove(interfaceC2712a);
            this.accessQueue.remove(interfaceC2712a);
        }

        public boolean removeEntry(InterfaceC2712a<K, V> interfaceC2712a, int i, RemovalCause removalCause) {
            AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC2712a<K, V> interfaceC2712a2 = atomicReferenceArray.get(length);
            for (InterfaceC2712a<K, V> next = interfaceC2712a2; next != null; next = next.getNext()) {
                if (next == interfaceC2712a) {
                    this.modCount++;
                    InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = removeValueFromChain(interfaceC2712a2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
                    this.count = i2;
                    return true;
                }
            }
            return false;
        }

        public InterfaceC2712a<K, V> removeEntryFromChain(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2) {
            int i = this.count;
            InterfaceC2712a<K, V> next = interfaceC2712a2.getNext();
            while (interfaceC2712a != interfaceC2712a2) {
                InterfaceC2712a<K, V> interfaceC2712aCopyEntry = copyEntry(interfaceC2712a, next);
                if (interfaceC2712aCopyEntry != null) {
                    next = interfaceC2712aCopyEntry;
                } else {
                    removeCollectedEntry(interfaceC2712a);
                    i--;
                }
                interfaceC2712a = interfaceC2712a.getNext();
            }
            this.count = i;
            return next;
        }

        public boolean removeLoadingValue(K k, int i, C2687k<K, V> c2687k) {
            lock();
            try {
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                for (InterfaceC2712a<K, V> next = interfaceC2712a; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(k, key)) {
                        if (next.getValueReference() != c2687k) {
                            break;
                        }
                        if (c2687k.mo15535k()) {
                            next.setValueReference(c2687k.m15553h());
                        } else {
                            atomicReferenceArray.set(length, removeEntryFromChain(interfaceC2712a, next));
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

        public InterfaceC2712a<K, V> removeValueFromChain(InterfaceC2712a<K, V> interfaceC2712a, InterfaceC2712a<K, V> interfaceC2712a2, K k, int i, V v2, InterfaceC2695s<K, V> interfaceC2695s, RemovalCause removalCause) {
            enqueueNotification(k, i, v2, interfaceC2695s.mo15532c(), removalCause);
            this.writeQueue.remove(interfaceC2712a2);
            this.accessQueue.remove(interfaceC2712a2);
            if (!interfaceC2695s.isLoading()) {
                return removeEntryFromChain(interfaceC2712a, interfaceC2712a2);
            }
            interfaceC2695s.mo15531b(null);
            return interfaceC2712a;
        }

        public boolean replace(K k, int i, V v2, V v3) {
            int i2 = i;
            lock();
            try {
                long jMo15486a = this.map.f10680p.mo15486a();
                preWriteCleanup(jMo15486a);
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = i2 & (atomicReferenceArray.length() - 1);
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a;
                while (next != null) {
                    InterfaceC2712a<K, V> interfaceC2712a2 = next;
                    K key = interfaceC2712a2.getKey();
                    if (interfaceC2712a2.getHash() == i2 && key != null && this.map.f10669e.equivalent(k, key)) {
                        long j = jMo15486a;
                        InterfaceC2695s<K, V> valueReference = interfaceC2712a2.getValueReference();
                        V v4 = valueReference.get();
                        if (v4 != null) {
                            if (!this.map.f10670f.equivalent(v2, v4)) {
                                recordLockedRead(interfaceC2712a2, j);
                                break;
                            }
                            this.modCount++;
                            enqueueNotification(k, i, v4, valueReference.mo15532c(), RemovalCause.REPLACED);
                            setValue(interfaceC2712a2, k, v3, j);
                            evictEntries(interfaceC2712a2);
                            unlock();
                            postWriteCleanup();
                            return true;
                        }
                        if (!valueReference.mo15535k()) {
                            break;
                        }
                        this.modCount++;
                        InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = removeValueFromChain(interfaceC2712a, interfaceC2712a2, key, i2, v4, valueReference, RemovalCause.COLLECTED);
                        int i3 = this.count - 1;
                        atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
                        this.count = i3;
                        break;
                    }
                    InterfaceC2712a<K, V> interfaceC2712a3 = interfaceC2712a;
                    long j2 = jMo15486a;
                    next = interfaceC2712a2.getNext();
                    interfaceC2712a = interfaceC2712a3;
                    i2 = i;
                    jMo15486a = j2;
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
            this.map.m15529z();
        }

        public V scheduleRefresh(InterfaceC2712a<K, V> interfaceC2712a, K k, int i, V v2, long j, CacheLoader<? super K, V> cacheLoader) {
            V vRefresh;
            return (!this.map.m15503G() || j - interfaceC2712a.getWriteTime() <= this.map.f10677m || interfaceC2712a.getValueReference().isLoading() || (vRefresh = refresh(k, i, cacheLoader, true)) == null) ? v2 : vRefresh;
        }

        public void setValue(InterfaceC2712a<K, V> interfaceC2712a, K k, V v2, long j) {
            InterfaceC2695s<K, V> valueReference = interfaceC2712a.getValueReference();
            int iWeigh = this.map.f10674j.weigh(k, v2);
            sf80.m183901w(iWeigh >= 0, "Weights must be non-negative");
            interfaceC2712a.setValueReference(this.map.f10672h.referenceValue(this, interfaceC2712a, v2, iWeigh));
            recordWrite(interfaceC2712a, iWeigh, j);
            valueReference.mo15531b(v2);
        }

        public boolean storeLoadedValue(K k, int i, C2687k<K, V> c2687k, V v2) {
            lock();
            try {
                long jMo15486a = this.map.f10680p.mo15486a();
                preWriteCleanup(jMo15486a);
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                for (InterfaceC2712a<K, V> next = interfaceC2712a; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(k, key)) {
                        InterfaceC2695s<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (c2687k != valueReference && (v3 != null || valueReference == LocalCache.f10663x)) {
                            enqueueNotification(k, i, v2, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.modCount++;
                        if (c2687k.mo15535k()) {
                            enqueueNotification(k, i, v3, c2687k.mo15532c(), v3 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i2--;
                        }
                        InterfaceC2712a<K, V> interfaceC2712a2 = next;
                        setValue(interfaceC2712a2, k, v2, jMo15486a);
                        this.count = i2;
                        evictEntries(interfaceC2712a2);
                        return true;
                    }
                }
                this.modCount++;
                InterfaceC2712a<K, V> interfaceC2712aNewEntry = newEntry(k, i, interfaceC2712a);
                setValue(interfaceC2712aNewEntry, k, v2, jMo15486a);
                atomicReferenceArray.set(length, interfaceC2712aNewEntry);
                this.count = i2;
                evictEntries(interfaceC2712aNewEntry);
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

        public V waitForLoadingValue(InterfaceC2712a<K, V> interfaceC2712a, K k, InterfaceC2695s<K, V> interfaceC2695s) throws ExecutionException {
            if (!interfaceC2695s.isLoading()) {
                shg0.m184191a();
                return null;
            }
            sf80.m183904z(!Thread.holdsLock(interfaceC2712a), "Recursive load of: %s", k);
            try {
                V vMo15533d = interfaceC2695s.mo15533d();
                if (vMo15533d != null) {
                    recordRead(interfaceC2712a, this.map.f10680p.mo15486a());
                    this.statsCounter.mo15482d(1);
                    return vMo15533d;
                }
                String strValueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(strValueOf);
                sb.append(".");
                throw new CacheLoader.InvalidCacheLoadException(sb.toString());
            } catch (Throwable th) {
                this.statsCounter.mo15482d(1);
                throw th;
            }
        }

        public V get(Object obj, int i) throws Throwable {
            Segment<K, V> segment;
            try {
                if (this.count != 0) {
                    long jMo15486a = this.map.f10680p.mo15486a();
                    InterfaceC2712a<K, V> liveEntry = getLiveEntry(obj, i, jMo15486a);
                    if (liveEntry == null) {
                        postReadCleanup();
                        return null;
                    }
                    V v2 = liveEntry.getValueReference().get();
                    try {
                        if (v2 != null) {
                            recordRead(liveEntry, jMo15486a);
                            V vScheduleRefresh = scheduleRefresh(liveEntry, liveEntry.getKey(), i, v2, jMo15486a, this.map.f10683s);
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
                preWriteCleanup(this.map.f10680p.mo15486a());
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(obj, key)) {
                        InterfaceC2695s<K, V> valueReference = next.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 != null) {
                            try {
                                removalCause = RemovalCause.EXPLICIT;
                            } catch (Throwable th2) {
                                th = th2;
                                segment = this;
                            }
                        } else {
                            if (!valueReference.mo15535k()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.modCount++;
                        segment = this;
                        InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = segment.removeValueFromChain(interfaceC2712a, next, key, i, v2, valueReference, removalCause2);
                        int i2 = segment.count - 1;
                        atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
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
                long jMo15486a = this.map.f10680p.mo15486a();
                preWriteCleanup(jMo15486a);
                AtomicReferenceArray<InterfaceC2712a<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC2712a<K, V> interfaceC2712a = atomicReferenceArray.get(length);
                InterfaceC2712a<K, V> next = interfaceC2712a;
                while (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f10669e.equivalent(k, key)) {
                        long j = jMo15486a;
                        InterfaceC2695s<K, V> valueReference = next.getValueReference();
                        V v3 = valueReference.get();
                        if (v3 == null) {
                            if (!valueReference.mo15535k()) {
                                break;
                            }
                            this.modCount++;
                            InterfaceC2712a<K, V> interfaceC2712aRemoveValueFromChain = removeValueFromChain(interfaceC2712a, next, key, i, v3, valueReference, RemovalCause.COLLECTED);
                            int i2 = this.count - 1;
                            atomicReferenceArray.set(length, interfaceC2712aRemoveValueFromChain);
                            this.count = i2;
                            break;
                        }
                        InterfaceC2712a<K, V> interfaceC2712a2 = next;
                        this.modCount++;
                        enqueueNotification(k, i, v3, valueReference.mo15532c(), RemovalCause.REPLACED);
                        setValue(interfaceC2712a2, k, v2, j);
                        evictEntries(interfaceC2712a2);
                        unlock();
                        postWriteCleanup();
                        return v3;
                    }
                    InterfaceC2712a<K, V> interfaceC2712a3 = interfaceC2712a;
                    long j2 = jMo15486a;
                    next = next.getNext();
                    interfaceC2712a = interfaceC2712a3;
                    jMo15486a = j2;
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
