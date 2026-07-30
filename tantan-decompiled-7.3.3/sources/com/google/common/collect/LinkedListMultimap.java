package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.AbstractC18359l7;
import p153l.ju10;
import p153l.mor;
import p153l.nof0;
import p153l.xgj0;
import p153l.xn80;
import p153l.zor;

/* JADX INFO: loaded from: classes7.dex */
public class LinkedListMultimap<K, V> extends AbstractC2985a<K, V> implements zor<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient C2852g<K, V> head;
    private transient Map<K, C2851f<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient C2852g<K, V> tail;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$a */
    public class C2846a extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f11008a;

        public C2846a(Object obj) {
            this.f11008a = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            return new C2854i(this.f11008a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            C2851f c2851f = (C2851f) LinkedListMultimap.this.keyToKeyList.get(this.f11008a);
            if (c2851f == null) {
                return 0;
            }
            return c2851f.f11021c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$b */
    public class C2847b extends AbstractSequentialList<Map.Entry<K, V>> {
        public C2847b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i) {
            return new C2853h(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$c */
    public class C2848c extends Sets.AbstractC2941e<K> {
        public C2848c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C2850e(LinkedListMultimap.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return !LinkedListMultimap.this.removeAll(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedListMultimap.this.keyToKeyList.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$d */
    public class C2849d extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$d$a */
        public class a extends xgj0<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2853h f11013b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2849d c2849d, ListIterator listIterator, C2853h c2853h) {
                super(listIterator);
                this.f11013b = c2853h;
            }

            @Override // p153l.wgj0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V mo15951a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // p153l.xgj0, java.util.ListIterator
            public void set(V v2) {
                this.f11013b.m15967f(v2);
            }
        }

        public C2849d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            C2853h c2853h = new C2853h(i);
            return new a(this, c2853h, c2853h);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$f */
    public static class C2851f<K, V> {

        /* JADX INFO: renamed from: a */
        public C2852g<K, V> f11019a;

        /* JADX INFO: renamed from: b */
        public C2852g<K, V> f11020b;

        /* JADX INFO: renamed from: c */
        public int f11021c;

        public C2851f(C2852g<K, V> c2852g) {
            this.f11019a = c2852g;
            this.f11020b = c2852g;
            c2852g.f11027f = null;
            c2852g.f11026e = null;
            this.f11021c = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$g */
    public static final class C2852g<K, V> extends AbstractC18359l7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f11022a;

        /* JADX INFO: renamed from: b */
        public V f11023b;

        /* JADX INFO: renamed from: c */
        public C2852g<K, V> f11024c;

        /* JADX INFO: renamed from: d */
        public C2852g<K, V> f11025d;

        /* JADX INFO: renamed from: e */
        public C2852g<K, V> f11026e;

        /* JADX INFO: renamed from: f */
        public C2852g<K, V> f11027f;

        public C2852g(K k, V v2) {
            this.f11022a = k;
            this.f11023b = v2;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public K getKey() {
            return this.f11022a;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V getValue() {
            return this.f11023b;
        }

        @Override // p153l.AbstractC18359l7, java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = this.f11023b;
            this.f11023b = v2;
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$h */
    public class C2853h implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f11028a;

        /* JADX INFO: renamed from: b */
        public C2852g<K, V> f11029b;

        /* JADX INFO: renamed from: c */
        public C2852g<K, V> f11030c;

        /* JADX INFO: renamed from: d */
        public C2852g<K, V> f11031d;

        /* JADX INFO: renamed from: e */
        public int f11032e;

        public C2853h(int i) {
            this.f11032e = LinkedListMultimap.this.modCount;
            int size = LinkedListMultimap.this.size();
            xn80.m212114s(i, size);
            if (i < size / 2) {
                this.f11029b = LinkedListMultimap.this.head;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.f11031d = LinkedListMultimap.this.tail;
                this.f11028a = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.f11030c = null;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: b */
        public final void m15963b() {
            if (LinkedListMultimap.this.modCount == this.f11032e) {
                return;
            }
            nof0.m164126a();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C2852g<K, V> next() {
            m15963b();
            C2852g<K, V> c2852g = this.f11029b;
            if (c2852g == null) {
                mor.m159308a();
                return null;
            }
            this.f11030c = c2852g;
            this.f11031d = c2852g;
            this.f11029b = c2852g.f11024c;
            this.f11028a++;
            return c2852g;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2852g<K, V> previous() {
            m15963b();
            C2852g<K, V> c2852g = this.f11031d;
            if (c2852g == null) {
                mor.m159308a();
                return null;
            }
            this.f11030c = c2852g;
            this.f11029b = c2852g;
            this.f11031d = c2852g.f11025d;
            this.f11028a--;
            return c2852g;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: f */
        public void m15967f(V v2) {
            xn80.m212117v(this.f11030c != null);
            this.f11030c.f11023b = v2;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            m15963b();
            return this.f11029b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            m15963b();
            return this.f11031d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f11028a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f11028a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m15963b();
            xn80.m212118w(this.f11030c != null, "no calls to next() since the last call to remove()");
            C2852g<K, V> c2852g = this.f11030c;
            if (c2852g != this.f11029b) {
                this.f11031d = c2852g.f11025d;
                this.f11028a--;
            } else {
                this.f11029b = c2852g.f11024c;
            }
            LinkedListMultimap.this.removeNode(c2852g);
            this.f11030c = null;
            this.f11032e = LinkedListMultimap.this.modCount;
        }
    }

    private LinkedListMultimap(ju10<? extends K, ? extends V> ju10Var) {
        this(ju10Var.keySet().size());
        putAll(ju10Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2852g<K, V> addNode(K k, V v2, C2852g<K, V> c2852g) {
        C2852g<K, V> c2852g2 = new C2852g<>(k, v2);
        if (this.head == null) {
            this.tail = c2852g2;
            this.head = c2852g2;
            this.keyToKeyList.put(k, new C2851f<>(c2852g2));
            this.modCount++;
        } else if (c2852g == null) {
            C2852g<K, V> c2852g3 = this.tail;
            Objects.requireNonNull(c2852g3);
            c2852g3.f11024c = c2852g2;
            c2852g2.f11025d = this.tail;
            this.tail = c2852g2;
            C2851f<K, V> c2851f = this.keyToKeyList.get(k);
            if (c2851f == null) {
                this.keyToKeyList.put(k, new C2851f<>(c2852g2));
                this.modCount++;
            } else {
                c2851f.f11021c++;
                C2852g<K, V> c2852g4 = c2851f.f11020b;
                c2852g4.f11026e = c2852g2;
                c2852g2.f11027f = c2852g4;
                c2851f.f11020b = c2852g2;
            }
        } else {
            C2851f<K, V> c2851f2 = this.keyToKeyList.get(k);
            Objects.requireNonNull(c2851f2);
            c2851f2.f11021c++;
            c2852g2.f11025d = c2852g.f11025d;
            c2852g2.f11027f = c2852g.f11027f;
            c2852g2.f11024c = c2852g;
            c2852g2.f11026e = c2852g;
            C2852g<K, V> c2852g5 = c2852g.f11027f;
            if (c2852g5 == null) {
                c2851f2.f11019a = c2852g2;
            } else {
                c2852g5.f11026e = c2852g2;
            }
            C2852g<K, V> c2852g6 = c2852g.f11025d;
            if (c2852g6 == null) {
                this.head = c2852g2;
            } else {
                c2852g6.f11024c = c2852g2;
            }
            c2852g.f11025d = c2852g2;
            c2852g.f11027f = c2852g2;
        }
        this.size++;
        return c2852g2;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private List<V> getCopy(K k) {
        return Collections.unmodifiableList(Lists.m15979l(new C2854i(k)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = CompactLinkedHashMap.create();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(K k) {
        Iterators.m15929e(new C2854i(k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(C2852g<K, V> c2852g) {
        C2852g<K, V> c2852g2 = c2852g.f11025d;
        C2852g<K, V> c2852g3 = c2852g.f11024c;
        if (c2852g2 != null) {
            c2852g2.f11024c = c2852g3;
        } else {
            this.head = c2852g3;
        }
        C2852g<K, V> c2852g4 = c2852g.f11024c;
        if (c2852g4 != null) {
            c2852g4.f11025d = c2852g2;
        } else {
            this.tail = c2852g2;
        }
        if (c2852g.f11027f == null && c2852g.f11026e == null) {
            C2851f<K, V> c2851fRemove = this.keyToKeyList.remove(c2852g.f11022a);
            Objects.requireNonNull(c2851fRemove);
            c2851fRemove.f11021c = 0;
            this.modCount++;
        } else {
            C2851f<K, V> c2851f = this.keyToKeyList.get(c2852g.f11022a);
            Objects.requireNonNull(c2851f);
            c2851f.f11021c--;
            C2852g<K, V> c2852g5 = c2852g.f11027f;
            C2852g<K, V> c2852g6 = c2852g.f11026e;
            if (c2852g5 == null) {
                Objects.requireNonNull(c2852g6);
                c2851f.f11019a = c2852g6;
            } else {
                c2852g5.f11026e = c2852g6;
            }
            C2852g<K, V> c2852g7 = c2852g.f11026e;
            C2852g<K, V> c2852g8 = c2852g.f11027f;
            if (c2852g7 == null) {
                Objects.requireNonNull(c2852g8);
                c2851f.f11020b = c2852g8;
            } else {
                c2852g7.f11027f = c2852g8;
            }
        }
        this.size--;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // p153l.ju10
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // p153l.ju10
    public boolean containsKey(Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Map<K, Collection<V>> createAsMap() {
        return new Multimaps.C2916a(this);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public List<Map.Entry<K, V>> createEntries() {
        return new C2847b();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Set<K> createKeySet() {
        return new C2848c();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public InterfaceC2995k<K> createKeys() {
        return new Multimaps.C2918c(this);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public List<V> createValues() {
        return new C2849d();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p153l.ju10, p153l.zor
    public List<V> get(K k) {
        return new C2846a(k);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ InterfaceC2995k keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean put(K k, V v2) {
        addNode(k, v2, null);
        return true;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ju10, p153l.zor
    public List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k);
        C2854i c2854i = new C2854i(k);
        Iterator<? extends V> it = iterable.iterator();
        while (c2854i.hasNext() && it.hasNext()) {
            c2854i.next();
            c2854i.set(it.next());
        }
        while (c2854i.hasNext()) {
            c2854i.next();
            c2854i.remove();
        }
        while (it.hasNext()) {
            c2854i.add(it.next());
        }
        return copy;
    }

    @Override // p153l.ju10
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractC2985a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public List<V> values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(ju10 ju10Var) {
        return super.putAll(ju10Var);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    public static <K, V> LinkedListMultimap<K, V> create(ju10<? extends K, ? extends V> ju10Var) {
        return new LinkedListMultimap<>(ju10Var);
    }

    private LinkedListMultimap(int i) {
        this.keyToKeyList = C2997m.m16351c(i);
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$e */
    public class C2850e implements Iterator<K> {

        /* JADX INFO: renamed from: a */
        public final Set<K> f11014a;

        /* JADX INFO: renamed from: b */
        public C2852g<K, V> f11015b;

        /* JADX INFO: renamed from: c */
        public C2852g<K, V> f11016c;

        /* JADX INFO: renamed from: d */
        public int f11017d;

        public C2850e() {
            this.f11014a = Sets.m16176g(LinkedListMultimap.this.keySet().size());
            this.f11015b = LinkedListMultimap.this.head;
            this.f11017d = LinkedListMultimap.this.modCount;
        }

        /* JADX INFO: renamed from: a */
        public final void m15961a() {
            if (LinkedListMultimap.this.modCount == this.f11017d) {
                return;
            }
            nof0.m164126a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15961a();
            return this.f11015b != null;
        }

        @Override // java.util.Iterator
        public K next() {
            C2852g<K, V> c2852g;
            m15961a();
            C2852g<K, V> c2852g2 = this.f11015b;
            if (c2852g2 == null) {
                mor.m159308a();
                return null;
            }
            this.f11016c = c2852g2;
            this.f11014a.add(c2852g2.f11022a);
            do {
                c2852g = this.f11015b.f11024c;
                this.f11015b = c2852g;
                if (c2852g == null) {
                    break;
                }
            } while (!this.f11014a.add(c2852g.f11022a));
            return this.f11016c.f11022a;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15961a();
            xn80.m212118w(this.f11016c != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.removeAllNodes(this.f11016c.f11022a);
            this.f11016c = null;
            this.f11017d = LinkedListMultimap.this.modCount;
        }

        public /* synthetic */ C2850e(LinkedListMultimap linkedListMultimap, C2846a c2846a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$i */
    public class C2854i implements ListIterator<V> {

        /* JADX INFO: renamed from: a */
        public final K f11034a;

        /* JADX INFO: renamed from: b */
        public int f11035b;

        /* JADX INFO: renamed from: c */
        public C2852g<K, V> f11036c;

        /* JADX INFO: renamed from: d */
        public C2852g<K, V> f11037d;

        /* JADX INFO: renamed from: e */
        public C2852g<K, V> f11038e;

        public C2854i(K k, int i) {
            C2851f c2851f = (C2851f) LinkedListMultimap.this.keyToKeyList.get(k);
            int i2 = c2851f == null ? 0 : c2851f.f11021c;
            xn80.m212114s(i, i2);
            if (i < i2 / 2) {
                this.f11036c = c2851f == null ? null : c2851f.f11019a;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                this.f11038e = c2851f == null ? null : c2851f.f11020b;
                this.f11035b = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f11034a = k;
            this.f11037d = null;
        }

        @Override // java.util.ListIterator
        public void add(V v2) {
            this.f11038e = LinkedListMultimap.this.addNode(this.f11034a, v2, this.f11036c);
            this.f11035b++;
            this.f11037d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f11036c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f11038e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public V next() {
            C2852g<K, V> c2852g = this.f11036c;
            if (c2852g == null) {
                mor.m159308a();
                return null;
            }
            this.f11037d = c2852g;
            this.f11038e = c2852g;
            this.f11036c = c2852g.f11026e;
            this.f11035b++;
            return c2852g.f11023b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f11035b;
        }

        @Override // java.util.ListIterator
        public V previous() {
            C2852g<K, V> c2852g = this.f11038e;
            if (c2852g == null) {
                mor.m159308a();
                return null;
            }
            this.f11037d = c2852g;
            this.f11036c = c2852g;
            this.f11038e = c2852g.f11027f;
            this.f11035b--;
            return c2852g.f11023b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f11035b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            xn80.m212118w(this.f11037d != null, "no calls to next() since the last call to remove()");
            C2852g<K, V> c2852g = this.f11037d;
            if (c2852g != this.f11036c) {
                this.f11038e = c2852g.f11027f;
                this.f11035b--;
            } else {
                this.f11036c = c2852g.f11026e;
            }
            LinkedListMultimap.this.removeNode(c2852g);
            this.f11037d = null;
        }

        @Override // java.util.ListIterator
        public void set(V v2) {
            xn80.m212117v(this.f11037d != null);
            this.f11037d.f11023b = v2;
        }

        public C2854i(K k) {
            this.f11034a = k;
            C2851f c2851f = (C2851f) LinkedListMultimap.this.keyToKeyList.get(k);
            this.f11036c = c2851f == null ? null : c2851f.f11019a;
        }
    }
}
