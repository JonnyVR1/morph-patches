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
import p149l.aiq;
import p149l.e0j;
import p149l.js5;
import p149l.mwm;
import p149l.sd5;
import p149l.sf80;
import p149l.wzi;

/* JADX INFO: loaded from: classes7.dex */
public final class ConcurrentHashMultiset<E> extends AbstractC2963b<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$b */
    public class C2755b extends AbstractIterator<InterfaceC2972k.a<E>> {

        /* JADX INFO: renamed from: c */
        public final Iterator<Map.Entry<E, AtomicInteger>> f10847c;

        public C2755b() {
            this.f10847c = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public InterfaceC2972k.a<E> mo15565a() {
            while (this.f10847c.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f10847c.next();
                int i = next.getValue().get();
                if (i != 0) {
                    return Multisets.m16096g(next.getKey(), i);
                }
            }
            return m15566b();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$c */
    public class C2756c extends wzi<InterfaceC2972k.a<E>> {

        /* JADX INFO: renamed from: a */
        public InterfaceC2972k.a<E> f10849a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f10850b;

        public C2756c(Iterator it) {
            this.f10850b = it;
        }

        @Override // p149l.a0j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator<InterfaceC2972k.a<E>> delegate() {
            return this.f10850b;
        }

        @Override // p149l.wzi, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2972k.a<E> next() {
            InterfaceC2972k.a<E> aVar = (InterfaceC2972k.a) super.next();
            this.f10849a = aVar;
            return aVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            sf80.m183901w(this.f10849a != null, "no calls to next() since the last call to remove()");
            ConcurrentHashMultiset.this.setCount(this.f10849a.getElement(), 0);
            this.f10849a = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$e */
    public static class C2758e {

        /* JADX INFO: renamed from: a */
        public static final C2976o.b<ConcurrentHashMultiset> f10853a = C2976o.m16304a(ConcurrentHashMultiset.class, "countMap");
    }

    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        sf80.m183889k(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C2758e.f10853a.m16316b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList arrayListM15928o = Lists.m15928o(size());
        for (InterfaceC2972k.a aVar : entrySet()) {
            Object element = aVar.getElement();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayListM15928o.add(element);
            }
        }
        return arrayListM15928o;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int add(E e, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i2;
        AtomicInteger atomicInteger;
        sf80.m183894p(e);
        if (i == 0) {
            return count(e);
        }
        sd5.m183446d(i, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.m16049x(this.countMap, e);
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
                        js5.m142992a(65, "Overflow adding ", i, " occurrences to a count of ", i2);
                        return 0;
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i2, mwm.m156750a(i2, i)));
            return i2;
        } while (!this.countMap.replace(e, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.InterfaceC2972k
    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16049x(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Set<E> createElementSet() {
        return new C2754a(this, this.countMap.keySet());
    }

    @Override // com.google.common.collect.AbstractC2963b
    @Deprecated
    public Set<InterfaceC2972k.a<E>> createEntrySet() {
        return new C2757d(this, null);
    }

    @Override // com.google.common.collect.AbstractC2963b
    public int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC2963b
    public Iterator<InterfaceC2972k.a<E>> entryIterator() {
        return new C2756c(new C2755b());
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2972k
    public Iterator<E> iterator() {
        return Multisets.m16098i(this);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int remove(Object obj, int i) {
        int i2;
        int iMax;
        if (i == 0) {
            return count(obj);
        }
        sd5.m183446d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16049x(this.countMap, obj);
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
        sd5.m183446d(i, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16049x(this.countMap, obj);
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

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public boolean setCount(E e, int i, int i2) {
        sf80.m183894p(e);
        sd5.m183444b(i, "oldCount");
        sd5.m183444b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.m16049x(this.countMap, e);
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

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
    public int size() {
        Iterator<AtomicInteger> it = this.countMap.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().get();
        }
        return Ints.m16468m(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$a */
    public class C2754a extends e0j<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f10846a;

        public C2754a(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
            this.f10846a = set;
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return obj != null && C2968g.m16260c(this.f10846a, obj);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return obj != null && C2968g.m16261d(this.f10846a, obj);
        }

        @Override // p149l.qzi, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // p149l.e0j, p149l.qzi, p149l.a0j
        public Set<E> delegate() {
            return this.f10846a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ConcurrentHashMultiset$d */
    public class C2757d extends AbstractC2963b<E>.b {
        public C2757d() {
            super();
        }

        @Override // com.google.common.collect.AbstractC2963b.b, com.google.common.collect.Multisets.AbstractC2899d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset<E> mo15633a() {
            return ConcurrentHashMultiset.this;
        }

        /* JADX INFO: renamed from: f */
        public final List<InterfaceC2972k.a<E>> m15635f() {
            ArrayList arrayListM15928o = Lists.m15928o(size());
            Iterators.m15871a(arrayListM15928o, iterator());
            return arrayListM15928o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m15635f().toArray();
        }

        public /* synthetic */ C2757d(ConcurrentHashMultiset concurrentHashMultiset, C2754a c2754a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m15635f().toArray(tArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        aiq.m96875a(concurrentHashMultisetCreate, iterable);
        return concurrentHashMultisetCreate;
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
    public int setCount(E e, int i) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        sf80.m183894p(e);
        sd5.m183444b(i, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.m16049x(this.countMap, e);
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
