package com.google.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p153l.l710;
import p153l.wtq0;

/* JADX INFO: renamed from: com.google.protobuf.t */
/* JADX INFO: loaded from: classes7.dex */
public class C3445t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public final int f11670a;

    /* JADX INFO: renamed from: b */
    public List<C3445t<K, V>.c> f11671b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f11672c;

    /* JADX INFO: renamed from: d */
    public boolean f11673d;

    /* JADX INFO: renamed from: e */
    public volatile C3445t<K, V>.e f11674e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: com.google.protobuf.t$a */
    public static class a<FieldDescriptorType> extends C3445t<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.C3445t
        /* JADX INFO: renamed from: n */
        public void mo17358n() {
            if (!m17357m()) {
                for (int i = 0; i < m17353i(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryM17352h = m17352h(i);
                    if (((C3434i.b) entryM17352h.getKey()).isRepeated()) {
                        entryM17352h.setValue(Collections.unmodifiableList((List) entryM17352h.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m17355k()) {
                    if (((C3434i.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo17358n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m17359p((C3434i.b) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Iterator<Object> f11675a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable<Object> f11676b = new C22798b();

        /* JADX INFO: renamed from: com.google.protobuf.t$b$a */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.t$b$b, reason: collision with other inner class name */
        public static class C22798b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f11675a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static <T> Iterable<T> m17362b() {
            return (Iterable<T>) f11676b;
        }
    }

    public C3445t(int i) {
        this.f11670a = i;
        this.f11671b = Collections.EMPTY_LIST;
        this.f11672c = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: o */
    public static <FieldDescriptorType extends C3434i.b<FieldDescriptorType>> C3445t<FieldDescriptorType, Object> m17348o(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m17350f();
        if (!this.f11671b.isEmpty()) {
            this.f11671b.clear();
        }
        if (this.f11672c.isEmpty()) {
            return;
        }
        this.f11672c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m17349e(comparable) >= 0 || this.f11672c.containsKey(comparable);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final int m17349e(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f11671b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f11671b.get(i3).getKey());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.f11671b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f11671b.get(i3).getKey());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f11674e == null) {
            this.f11674e = new e(this, null);
        }
        return this.f11674e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3445t)) {
            return super.equals(obj);
        }
        C3445t c3445t = (C3445t) obj;
        int size = size();
        if (size != c3445t.size()) {
            return false;
        }
        int iM17353i = m17353i();
        if (iM17353i != c3445t.m17353i()) {
            return entrySet().equals(c3445t.entrySet());
        }
        for (int i = 0; i < iM17353i; i++) {
            if (!m17352h(i).equals(c3445t.m17352h(i))) {
                return false;
            }
        }
        if (iM17353i != size) {
            return this.f11672c.equals(c3445t.f11672c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17350f() {
        if (this.f11673d) {
            l710.m153113a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m17351g() {
        m17350f();
        if (!this.f11671b.isEmpty() || (this.f11671b instanceof ArrayList)) {
            return;
        }
        this.f11671b = new ArrayList(this.f11670a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM17349e = m17349e(comparable);
        return iM17349e >= 0 ? this.f11671b.get(iM17349e).getValue() : this.f11672c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public Map.Entry<K, V> m17352h(int i) {
        return this.f11671b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM17353i = m17353i();
        int iHashCode = 0;
        for (int i = 0; i < iM17353i; i++) {
            iHashCode += this.f11671b.get(i).hashCode();
        }
        return m17354j() > 0 ? iHashCode + this.f11672c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public int m17353i() {
        return this.f11671b.size();
    }

    /* JADX INFO: renamed from: j */
    public int m17354j() {
        return this.f11672c.size();
    }

    /* JADX INFO: renamed from: k */
    public Iterable<Map.Entry<K, V>> m17355k() {
        return this.f11672c.isEmpty() ? b.m17362b() : this.f11672c.entrySet();
    }

    /* JADX INFO: renamed from: l */
    public final SortedMap<K, V> m17356l() {
        m17350f();
        if (this.f11672c.isEmpty() && !(this.f11672c instanceof TreeMap)) {
            this.f11672c = new TreeMap();
        }
        return (SortedMap) this.f11672c;
    }

    /* JADX INFO: renamed from: m */
    public boolean m17357m() {
        return this.f11673d;
    }

    /* JADX INFO: renamed from: n */
    public void mo17358n() {
        if (this.f11673d) {
            return;
        }
        this.f11672c = this.f11672c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11672c);
        this.f11673d = true;
    }

    /* JADX INFO: renamed from: p */
    public V m17359p(K k, V v2) {
        m17350f();
        int iM17349e = m17349e(k);
        if (iM17349e >= 0) {
            return this.f11671b.get(iM17349e).setValue(v2);
        }
        m17351g();
        int i = -(iM17349e + 1);
        if (i >= this.f11670a) {
            return m17356l().put(k, v2);
        }
        int size = this.f11671b.size();
        int i2 = this.f11670a;
        if (size == i2) {
            C3445t<K, V>.c cVarRemove = this.f11671b.remove(i2 - 1);
            m17356l().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f11671b.add(i, new c(k, v2));
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final V m17360q(int i) {
        m17350f();
        V value = this.f11671b.remove(i).getValue();
        if (!this.f11672c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m17356l().entrySet().iterator();
            this.f11671b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m17350f();
        Comparable comparable = (Comparable) obj;
        int iM17349e = m17349e(comparable);
        if (iM17349e >= 0) {
            return m17360q(iM17349e);
        }
        if (this.f11672c.isEmpty()) {
            return null;
        }
        return this.f11672c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f11671b.size() + this.f11672c.size();
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$e */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C3445t.this.m17359p(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3445t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3445t.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(C3445t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3445t.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3445t.this.size();
        }

        public /* synthetic */ e(C3445t c3445t, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$d */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f11680a;

        /* JADX INFO: renamed from: b */
        public boolean f11681b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f11682c;

        public d() {
            this.f11680a = -1;
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m17366a() {
            if (this.f11682c == null) {
                this.f11682c = C3445t.this.f11672c.entrySet().iterator();
            }
            return this.f11682c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f11681b = true;
            int i = this.f11680a + 1;
            this.f11680a = i;
            return i < C3445t.this.f11671b.size() ? (Map.Entry) C3445t.this.f11671b.get(this.f11680a) : m17366a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11680a + 1 < C3445t.this.f11671b.size() || m17366a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f11681b) {
                wtq0.m207906a("remove() was called before next()");
                return;
            }
            this.f11681b = false;
            C3445t.this.m17350f();
            if (this.f11680a >= C3445t.this.f11671b.size()) {
                m17366a().remove();
                return;
            }
            C3445t c3445t = C3445t.this;
            int i = this.f11680a;
            this.f11680a = i - 1;
            c3445t.m17360q(i);
        }

        public /* synthetic */ d(C3445t c3445t, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$c */
    public class c implements Map.Entry<K, V>, Comparable<C3445t<K, V>.c> {

        /* JADX INFO: renamed from: a */
        public final K f11677a;

        /* JADX INFO: renamed from: b */
        public V f11678b;

        public c(C3445t c3445t, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C3445t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m17364b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m17364b(this.f11677a, entry.getKey()) && m17364b(this.f11678b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f11677a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f11678b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f11677a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v2 = this.f11678b;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            C3445t.this.m17350f();
            V v3 = this.f11678b;
            this.f11678b = v2;
            return v3;
        }

        public String toString() {
            return this.f11677a + "=" + this.f11678b;
        }

        public c(K k, V v2) {
            this.f11677a = k;
            this.f11678b = v2;
        }
    }

    public /* synthetic */ C3445t(int i, a aVar) {
        this(i);
    }
}
