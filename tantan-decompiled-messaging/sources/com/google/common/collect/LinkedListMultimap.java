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
import p149l.AbstractC19437q7;
import p149l.bm10;
import p149l.ggf0;
import p149l.lmr;
import p149l.sf80;
import p149l.t7j0;
import p149l.ymr;

/* JADX INFO: loaded from: classes7.dex */
public class LinkedListMultimap<K, V> extends AbstractC2962a<K, V> implements ymr<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient C2829g<K, V> head;
    private transient Map<K, C2828f<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient C2829g<K, V> tail;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$a */
    public class C2823a extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f10971a;

        public C2823a(Object obj) {
            this.f10971a = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            return new C2831i(this.f10971a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            C2828f c2828f = (C2828f) LinkedListMultimap.this.keyToKeyList.get(this.f10971a);
            if (c2828f == null) {
                return 0;
            }
            return c2828f.f10984c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$b */
    public class C2824b extends AbstractSequentialList<Map.Entry<K, V>> {
        public C2824b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i) {
            return new C2830h(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$c */
    public class C2825c extends Sets.AbstractC2918e<K> {
        public C2825c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C2827e(LinkedListMultimap.this, null);
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
    public class C2826d extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$d$a */
        public class a extends t7j0<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2830h f10976b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2826d c2826d, ListIterator listIterator, C2830h c2830h) {
                super(listIterator);
                this.f10976b = c2830h;
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V mo15897a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // p149l.t7j0, java.util.ListIterator
            public void set(V v2) {
                this.f10976b.m15913f(v2);
            }
        }

        public C2826d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
            C2830h c2830h = new C2830h(i);
            return new a(this, c2830h, c2830h);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$f */
    public static class C2828f<K, V> {

        /* JADX INFO: renamed from: a */
        public C2829g<K, V> f10982a;

        /* JADX INFO: renamed from: b */
        public C2829g<K, V> f10983b;

        /* JADX INFO: renamed from: c */
        public int f10984c;

        public C2828f(C2829g<K, V> c2829g) {
            this.f10982a = c2829g;
            this.f10983b = c2829g;
            c2829g.f10990f = null;
            c2829g.f10989e = null;
            this.f10984c = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$g */
    public static final class C2829g<K, V> extends AbstractC19437q7<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f10985a;

        /* JADX INFO: renamed from: b */
        public V f10986b;

        /* JADX INFO: renamed from: c */
        public C2829g<K, V> f10987c;

        /* JADX INFO: renamed from: d */
        public C2829g<K, V> f10988d;

        /* JADX INFO: renamed from: e */
        public C2829g<K, V> f10989e;

        /* JADX INFO: renamed from: f */
        public C2829g<K, V> f10990f;

        public C2829g(K k, V v2) {
            this.f10985a = k;
            this.f10986b = v2;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public K getKey() {
            return this.f10985a;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V getValue() {
            return this.f10986b;
        }

        @Override // p149l.AbstractC19437q7, java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = this.f10986b;
            this.f10986b = v2;
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$h */
    public class C2830h implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f10991a;

        /* JADX INFO: renamed from: b */
        public C2829g<K, V> f10992b;

        /* JADX INFO: renamed from: c */
        public C2829g<K, V> f10993c;

        /* JADX INFO: renamed from: d */
        public C2829g<K, V> f10994d;

        /* JADX INFO: renamed from: e */
        public int f10995e;

        public C2830h(int i) {
            this.f10995e = LinkedListMultimap.this.modCount;
            int size = LinkedListMultimap.this.size();
            sf80.m183897s(i, size);
            if (i < size / 2) {
                this.f10992b = LinkedListMultimap.this.head;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.f10994d = LinkedListMultimap.this.tail;
                this.f10991a = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.f10993c = null;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: b */
        public final void m15909b() {
            if (LinkedListMultimap.this.modCount == this.f10995e) {
                return;
            }
            ggf0.m125962a();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C2829g<K, V> next() {
            m15909b();
            C2829g<K, V> c2829g = this.f10992b;
            if (c2829g == null) {
                lmr.m150601a();
                return null;
            }
            this.f10993c = c2829g;
            this.f10994d = c2829g;
            this.f10992b = c2829g.f10987c;
            this.f10991a++;
            return c2829g;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2829g<K, V> previous() {
            m15909b();
            C2829g<K, V> c2829g = this.f10994d;
            if (c2829g == null) {
                lmr.m150601a();
                return null;
            }
            this.f10993c = c2829g;
            this.f10992b = c2829g;
            this.f10994d = c2829g.f10988d;
            this.f10991a--;
            return c2829g;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: f */
        public void m15913f(V v2) {
            sf80.m183900v(this.f10993c != null);
            this.f10993c.f10986b = v2;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            m15909b();
            return this.f10992b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            m15909b();
            return this.f10994d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10991a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f10991a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m15909b();
            sf80.m183901w(this.f10993c != null, "no calls to next() since the last call to remove()");
            C2829g<K, V> c2829g = this.f10993c;
            if (c2829g != this.f10992b) {
                this.f10994d = c2829g.f10988d;
                this.f10991a--;
            } else {
                this.f10992b = c2829g.f10987c;
            }
            LinkedListMultimap.this.removeNode(c2829g);
            this.f10993c = null;
            this.f10995e = LinkedListMultimap.this.modCount;
        }
    }

    private LinkedListMultimap(bm10<? extends K, ? extends V> bm10Var) {
        this(bm10Var.keySet().size());
        putAll(bm10Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2829g<K, V> addNode(K k, V v2, C2829g<K, V> c2829g) {
        C2829g<K, V> c2829g2 = new C2829g<>(k, v2);
        if (this.head == null) {
            this.tail = c2829g2;
            this.head = c2829g2;
            this.keyToKeyList.put(k, new C2828f<>(c2829g2));
            this.modCount++;
        } else if (c2829g == null) {
            C2829g<K, V> c2829g3 = this.tail;
            Objects.requireNonNull(c2829g3);
            c2829g3.f10987c = c2829g2;
            c2829g2.f10988d = this.tail;
            this.tail = c2829g2;
            C2828f<K, V> c2828f = this.keyToKeyList.get(k);
            if (c2828f == null) {
                this.keyToKeyList.put(k, new C2828f<>(c2829g2));
                this.modCount++;
            } else {
                c2828f.f10984c++;
                C2829g<K, V> c2829g4 = c2828f.f10983b;
                c2829g4.f10989e = c2829g2;
                c2829g2.f10990f = c2829g4;
                c2828f.f10983b = c2829g2;
            }
        } else {
            C2828f<K, V> c2828f2 = this.keyToKeyList.get(k);
            Objects.requireNonNull(c2828f2);
            c2828f2.f10984c++;
            c2829g2.f10988d = c2829g.f10988d;
            c2829g2.f10990f = c2829g.f10990f;
            c2829g2.f10987c = c2829g;
            c2829g2.f10989e = c2829g;
            C2829g<K, V> c2829g5 = c2829g.f10990f;
            if (c2829g5 == null) {
                c2828f2.f10982a = c2829g2;
            } else {
                c2829g5.f10989e = c2829g2;
            }
            C2829g<K, V> c2829g6 = c2829g.f10988d;
            if (c2829g6 == null) {
                this.head = c2829g2;
            } else {
                c2829g6.f10987c = c2829g2;
            }
            c2829g.f10988d = c2829g2;
            c2829g.f10990f = c2829g2;
        }
        this.size++;
        return c2829g2;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private List<V> getCopy(K k) {
        return Collections.unmodifiableList(Lists.m15925l(new C2831i(k)));
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
        Iterators.m15875e(new C2831i(k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(C2829g<K, V> c2829g) {
        C2829g<K, V> c2829g2 = c2829g.f10988d;
        C2829g<K, V> c2829g3 = c2829g.f10987c;
        if (c2829g2 != null) {
            c2829g2.f10987c = c2829g3;
        } else {
            this.head = c2829g3;
        }
        C2829g<K, V> c2829g4 = c2829g.f10987c;
        if (c2829g4 != null) {
            c2829g4.f10988d = c2829g2;
        } else {
            this.tail = c2829g2;
        }
        if (c2829g.f10990f == null && c2829g.f10989e == null) {
            C2828f<K, V> c2828fRemove = this.keyToKeyList.remove(c2829g.f10985a);
            Objects.requireNonNull(c2828fRemove);
            c2828fRemove.f10984c = 0;
            this.modCount++;
        } else {
            C2828f<K, V> c2828f = this.keyToKeyList.get(c2829g.f10985a);
            Objects.requireNonNull(c2828f);
            c2828f.f10984c--;
            C2829g<K, V> c2829g5 = c2829g.f10990f;
            C2829g<K, V> c2829g6 = c2829g.f10989e;
            if (c2829g5 == null) {
                Objects.requireNonNull(c2829g6);
                c2828f.f10982a = c2829g6;
            } else {
                c2829g5.f10989e = c2829g6;
            }
            C2829g<K, V> c2829g7 = c2829g.f10989e;
            C2829g<K, V> c2829g8 = c2829g.f10990f;
            if (c2829g7 == null) {
                Objects.requireNonNull(c2829g8);
                c2828f.f10983b = c2829g8;
            } else {
                c2829g7.f10990f = c2829g8;
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

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // p149l.bm10
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // p149l.bm10
    public boolean containsKey(Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Map<K, Collection<V>> createAsMap() {
        return new Multimaps.C2893a(this);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public List<Map.Entry<K, V>> createEntries() {
        return new C2824b();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Set<K> createKeySet() {
        return new C2825c();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public InterfaceC2972k<K> createKeys() {
        return new Multimaps.C2895c(this);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public List<V> createValues() {
        return new C2826d();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p149l.bm10, p149l.ymr
    public List<V> get(K k) {
        return new C2823a(k);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ InterfaceC2972k keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public boolean put(K k, V v2) {
        addNode(k, v2, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bm10, p149l.ymr
    public List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k);
        C2831i c2831i = new C2831i(k);
        Iterator<? extends V> it = iterable.iterator();
        while (c2831i.hasNext() && it.hasNext()) {
            c2831i.next();
            c2831i.set(it.next());
        }
        while (c2831i.hasNext()) {
            c2831i.next();
            c2831i.remove();
        }
        while (it.hasNext()) {
            c2831i.add(it.next());
        }
        return copy;
    }

    @Override // p149l.bm10
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractC2962a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public List<V> values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean putAll(bm10 bm10Var) {
        return super.putAll(bm10Var);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    public static <K, V> LinkedListMultimap<K, V> create(bm10<? extends K, ? extends V> bm10Var) {
        return new LinkedListMultimap<>(bm10Var);
    }

    private LinkedListMultimap(int i) {
        this.keyToKeyList = C2974m.m16297c(i);
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$e */
    public class C2827e implements Iterator<K> {

        /* JADX INFO: renamed from: a */
        public final Set<K> f10977a;

        /* JADX INFO: renamed from: b */
        public C2829g<K, V> f10978b;

        /* JADX INFO: renamed from: c */
        public C2829g<K, V> f10979c;

        /* JADX INFO: renamed from: d */
        public int f10980d;

        public C2827e() {
            this.f10977a = Sets.m16122g(LinkedListMultimap.this.keySet().size());
            this.f10978b = LinkedListMultimap.this.head;
            this.f10980d = LinkedListMultimap.this.modCount;
        }

        /* JADX INFO: renamed from: a */
        public final void m15907a() {
            if (LinkedListMultimap.this.modCount == this.f10980d) {
                return;
            }
            ggf0.m125962a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15907a();
            return this.f10978b != null;
        }

        @Override // java.util.Iterator
        public K next() {
            C2829g<K, V> c2829g;
            m15907a();
            C2829g<K, V> c2829g2 = this.f10978b;
            if (c2829g2 == null) {
                lmr.m150601a();
                return null;
            }
            this.f10979c = c2829g2;
            this.f10977a.add(c2829g2.f10985a);
            do {
                c2829g = this.f10978b.f10987c;
                this.f10978b = c2829g;
                if (c2829g == null) {
                    break;
                }
            } while (!this.f10977a.add(c2829g.f10985a));
            return this.f10979c.f10985a;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15907a();
            sf80.m183901w(this.f10979c != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.removeAllNodes(this.f10979c.f10985a);
            this.f10979c = null;
            this.f10980d = LinkedListMultimap.this.modCount;
        }

        public /* synthetic */ C2827e(LinkedListMultimap linkedListMultimap, C2823a c2823a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$i */
    public class C2831i implements ListIterator<V> {

        /* JADX INFO: renamed from: a */
        public final K f10997a;

        /* JADX INFO: renamed from: b */
        public int f10998b;

        /* JADX INFO: renamed from: c */
        public C2829g<K, V> f10999c;

        /* JADX INFO: renamed from: d */
        public C2829g<K, V> f11000d;

        /* JADX INFO: renamed from: e */
        public C2829g<K, V> f11001e;

        public C2831i(K k, int i) {
            C2828f c2828f = (C2828f) LinkedListMultimap.this.keyToKeyList.get(k);
            int i2 = c2828f == null ? 0 : c2828f.f10984c;
            sf80.m183897s(i, i2);
            if (i < i2 / 2) {
                this.f10999c = c2828f == null ? null : c2828f.f10982a;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                this.f11001e = c2828f == null ? null : c2828f.f10983b;
                this.f10998b = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f10997a = k;
            this.f11000d = null;
        }

        @Override // java.util.ListIterator
        public void add(V v2) {
            this.f11001e = LinkedListMultimap.this.addNode(this.f10997a, v2, this.f10999c);
            this.f10998b++;
            this.f11000d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10999c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f11001e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public V next() {
            C2829g<K, V> c2829g = this.f10999c;
            if (c2829g == null) {
                lmr.m150601a();
                return null;
            }
            this.f11000d = c2829g;
            this.f11001e = c2829g;
            this.f10999c = c2829g.f10989e;
            this.f10998b++;
            return c2829g.f10986b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10998b;
        }

        @Override // java.util.ListIterator
        public V previous() {
            C2829g<K, V> c2829g = this.f11001e;
            if (c2829g == null) {
                lmr.m150601a();
                return null;
            }
            this.f11000d = c2829g;
            this.f10999c = c2829g;
            this.f11001e = c2829g.f10990f;
            this.f10998b--;
            return c2829g.f10986b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f10998b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            sf80.m183901w(this.f11000d != null, "no calls to next() since the last call to remove()");
            C2829g<K, V> c2829g = this.f11000d;
            if (c2829g != this.f10999c) {
                this.f11001e = c2829g.f10990f;
                this.f10998b--;
            } else {
                this.f10999c = c2829g.f10989e;
            }
            LinkedListMultimap.this.removeNode(c2829g);
            this.f11000d = null;
        }

        @Override // java.util.ListIterator
        public void set(V v2) {
            sf80.m183900v(this.f11000d != null);
            this.f11000d.f10986b = v2;
        }

        public C2831i(K k) {
            this.f10997a = k;
            C2828f c2828f = (C2828f) LinkedListMultimap.this.keyToKeyList.get(k);
            this.f10999c = c2828f == null ? null : c2828f.f10982a;
        }
    }
}
