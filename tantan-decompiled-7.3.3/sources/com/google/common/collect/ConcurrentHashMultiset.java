package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.akq;
import p153l.nt5;
import p153l.nym;
import p153l.r2j;
import p153l.se5;
import p153l.xn80;
import p153l.z2j;

/* JADX INFO: loaded from: classes7.dex */
public final class ConcurrentHashMultiset<E> extends AbstractC2986b<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$b */
    public class C2778b extends AbstractIterator<InterfaceC2995k.a<E>> {

        /* JADX INFO: renamed from: c */
        public final Iterator<Map.Entry<E, AtomicInteger>> f10884c;

        public C2778b() {
            this.f10884c = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public InterfaceC2995k.a<E> mo15619a() {
            while (this.f10884c.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f10884c.next();
                int i = next.getValue().get();
                if (i != 0) {
                    return Multisets.m16150g(next.getKey(), i);
                }
            }
            return m15620b();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$c */
    public class C2779c extends r2j<InterfaceC2995k.a<E>> {

        /* JADX INFO: renamed from: a */
        public InterfaceC2995k.a<E> f10886a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f10887b;

        public C2779c(Iterator it) {
            this.f10887b = it;
        }

        @Override // p153l.v2j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator<InterfaceC2995k.a<E>> delegate() {
            return this.f10887b;
        }

        @Override // p153l.r2j, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2995k.a<E> next() {
            InterfaceC2995k.a<E> aVar = (InterfaceC2995k.a) super.next();
            this.f10886a = aVar;
            return aVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            xn80.m212118w(this.f10886a != null, "no calls to next() since the last call to remove()");
            ConcurrentHashMultiset.this.setCount(this.f10886a.getElement(), 0);
            this.f10886a = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$e */
    public static class C2781e {

        /* JADX INFO: renamed from: a */
        public static final C2999o.b<ConcurrentHashMultiset> f10890a = C2999o.m16358a(ConcurrentHashMultiset.class, "countMap");
    }

    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        xn80.m212106k(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C2781e.f10890a.m16370b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList arrayListM15982o = Lists.m15982o(size());
        for (InterfaceC2995k.a aVar : entrySet()) {
            Object element = aVar.getElement();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayListM15982o.add(element);
            }
        }
        return arrayListM15982o;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public int add(E e, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i2;
        AtomicInteger atomicInteger;
        xn80.m212111p(e);
        if (i == 0) {
            return count(e);
        }
        se5.m185518d(i, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.m16103x(this.countMap, e);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e, new AtomicInteger(i))) == null) {
                return 0;
            }
            do {
                i2 = atomicIntegerPutIfAbsent.get();
                if (i2 == 0) {
                    atomicInteger = new AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        nt5.m164689a(65, "Overflow adding ", i, " occurrences to a count of ", i2);
                        return 0;
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i2, nym.m165340a(i2, i)));
            return i2;
        } while (!this.countMap.replace(e, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.InterfaceC2995k
    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16103x(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public Set<E> createElementSet() {
        return new C2777a(this, this.countMap.keySet());
    }

    @Override // com.google.common.collect.AbstractC2986b
    @Deprecated
    public Set<InterfaceC2995k.a<E>> createEntrySet() {
        return new C2780d(this, null);
    }

    @Override // com.google.common.collect.AbstractC2986b
    public int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2986b
    public Iterator<InterfaceC2995k.a<E>> entryIterator() {
        return new C2779c(new C2778b());
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2995k
    public Iterator<E> iterator() {
        return Multisets.m16152i(this);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public int remove(Object obj, int i) {
        int i2;
        int iMax;
        if (i == 0) {
            return count(obj);
        }
        se5.m185518d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16103x(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            iMax = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, iMax));
        if (iMax == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public boolean removeExactly(Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        se5.m185518d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16103x(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public boolean setCount(E e, int i, int i2) {
        xn80.m212111p(e);
        se5.m185516b(i, "oldCount");
        se5.m185516b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16103x(this.countMap, e);
        if (atomicInteger == null) {
            if (i != 0) {
                return false;
            }
            return i2 == 0 || this.countMap.putIfAbsent(e, new AtomicInteger(i2)) == null;
        }
        int i3 = atomicInteger.get();
        if (i3 == i) {
            if (i3 == 0) {
                if (i2 == 0) {
                    this.countMap.remove(e, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                return this.countMap.putIfAbsent(e, atomicInteger2) == null || this.countMap.replace(e, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i3, i2)) {
                if (i2 == 0) {
                    this.countMap.remove(e, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
    public int size() {
        Iterator<AtomicInteger> it = this.countMap.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().get();
        }
        return Ints.m16523m(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$a */
    public class C2777a extends z2j<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f10883a;

        public C2777a(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
            this.f10883a = set;
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return obj != null && C2991g.m16314c(this.f10883a, obj);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return obj != null && C2991g.m16315d(this.f10883a, obj);
        }

        @Override // p153l.l2j, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // p153l.z2j, p153l.l2j, p153l.v2j
        public Set<E> delegate() {
            return this.f10883a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$d */
    public class C2780d extends AbstractC2986b<E>.b {
        public C2780d() {
            super();
        }

        @Override // com.google.common.collect.AbstractC2986b.b, com.google.common.collect.Multisets.AbstractC2922d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset<E> mo15687a() {
            return ConcurrentHashMultiset.this;
        }

        /* JADX INFO: renamed from: f */
        public final List<InterfaceC2995k.a<E>> m15689f() {
            ArrayList arrayListM15982o = Lists.m15982o(size());
            Iterators.m15925a(arrayListM15982o, iterator());
            return arrayListM15982o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m15689f().toArray();
        }

        public /* synthetic */ C2780d(ConcurrentHashMultiset concurrentHashMultiset, C2777a c2777a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m15689f().toArray(tArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        akq.m98593a(concurrentHashMultisetCreate, iterable);
        return concurrentHashMultisetCreate;
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
    public int setCount(E e, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        xn80.m212111p(e);
        se5.m185516b(i, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.m16103x(this.countMap, e);
            if (atomicIntegerPutIfAbsent != null || (i != 0 && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e, new AtomicInteger(i))) != null)) {
                while (true) {
                    int i2 = atomicIntegerPutIfAbsent.get();
                    if (i2 == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i2, i)) {
                        if (i == 0) {
                            this.countMap.remove(e, atomicIntegerPutIfAbsent);
                        }
                        return i2;
                    }
                }
                if (i != 0) {
                    atomicInteger = new AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } while (!this.countMap.replace(e, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }
}
