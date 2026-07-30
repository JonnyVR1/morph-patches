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
import p149l.bz00;
import p149l.qkq0;

/* JADX INFO: renamed from: com.google.protobuf.t */
/* JADX INFO: loaded from: classes7.dex */
public class C3422t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public final int f11633a;

    /* JADX INFO: renamed from: b */
    public List<C3422t<K, V>.c> f11634b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f11635c;

    /* JADX INFO: renamed from: d */
    public boolean f11636d;

    /* JADX INFO: renamed from: e */
    public volatile C3422t<K, V>.e f11637e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: com.google.protobuf.t$a */
    public static class a<FieldDescriptorType> extends C3422t<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.C3422t
        /* JADX INFO: renamed from: n */
        public void mo17303n() {
            if (!m17302m()) {
                for (int i = 0; i < m17298i(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryM17297h = m17297h(i);
                    if (((C3411i.b) entryM17297h.getKey()).isRepeated()) {
                        entryM17297h.setValue(Collections.unmodifiableList((List) entryM17297h.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m17300k()) {
                    if (((C3411i.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo17303n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m17304p((C3411i.b) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Iterator<Object> f11638a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable<Object> f11639b = new C22682b();

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
        public static class C22682b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f11638a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static <T> Iterable<T> m17307b() {
            return (Iterable<T>) f11639b;
        }
    }

    public C3422t(int i) {
        this.f11633a = i;
        this.f11634b = Collections.EMPTY_LIST;
        this.f11635c = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: o */
    public static <FieldDescriptorType extends C3411i.b<FieldDescriptorType>> C3422t<FieldDescriptorType, Object> m17293o(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m17295f();
        if (!this.f11634b.isEmpty()) {
            this.f11634b.clear();
        }
        if (this.f11635c.isEmpty()) {
            return;
        }
        this.f11635c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m17294e(comparable) >= 0 || this.f11635c.containsKey(comparable);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final int m17294e(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f11634b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f11634b.get(i3).getKey());
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
            int iCompareTo2 = k.compareTo(this.f11634b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f11634b.get(i3).getKey());
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
        if (this.f11637e == null) {
            this.f11637e = new e(this, null);
        }
        return this.f11637e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3422t)) {
            return super.equals(obj);
        }
        C3422t c3422t = (C3422t) obj;
        int size = size();
        if (size != c3422t.size()) {
            return false;
        }
        int iM17298i = m17298i();
        if (iM17298i != c3422t.m17298i()) {
            return entrySet().equals(c3422t.entrySet());
        }
        for (int i = 0; i < iM17298i; i++) {
            if (!m17297h(i).equals(c3422t.m17297h(i))) {
                return false;
            }
        }
        if (iM17298i != size) {
            return this.f11635c.equals(c3422t.f11635c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17295f() {
        if (this.f11636d) {
            bz00.m104536a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m17296g() {
        m17295f();
        if (!this.f11634b.isEmpty() || (this.f11634b instanceof ArrayList)) {
            return;
        }
        this.f11634b = new ArrayList(this.f11633a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM17294e = m17294e(comparable);
        return iM17294e >= 0 ? this.f11634b.get(iM17294e).getValue() : this.f11635c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public Map.Entry<K, V> m17297h(int i) {
        return this.f11634b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM17298i = m17298i();
        int iHashCode = 0;
        for (int i = 0; i < iM17298i; i++) {
            iHashCode += this.f11634b.get(i).hashCode();
        }
        return m17299j() > 0 ? iHashCode + this.f11635c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public int m17298i() {
        return this.f11634b.size();
    }

    /* JADX INFO: renamed from: j */
    public int m17299j() {
        return this.f11635c.size();
    }

    /* JADX INFO: renamed from: k */
    public Iterable<Map.Entry<K, V>> m17300k() {
        return this.f11635c.isEmpty() ? b.m17307b() : this.f11635c.entrySet();
    }

    /* JADX INFO: renamed from: l */
    public final SortedMap<K, V> m17301l() {
        m17295f();
        if (this.f11635c.isEmpty() && !(this.f11635c instanceof TreeMap)) {
            this.f11635c = new TreeMap();
        }
        return (SortedMap) this.f11635c;
    }

    /* JADX INFO: renamed from: m */
    public boolean m17302m() {
        return this.f11636d;
    }

    /* JADX INFO: renamed from: n */
    public void mo17303n() {
        if (this.f11636d) {
            return;
        }
        this.f11635c = this.f11635c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f11635c);
        this.f11636d = true;
    }

    /* JADX INFO: renamed from: p */
    public V m17304p(K k, V v2) {
        m17295f();
        int iM17294e = m17294e(k);
        if (iM17294e >= 0) {
            return this.f11634b.get(iM17294e).setValue(v2);
        }
        m17296g();
        int i = -(iM17294e + 1);
        if (i >= this.f11633a) {
            return m17301l().put(k, v2);
        }
        int size = this.f11634b.size();
        int i2 = this.f11633a;
        if (size == i2) {
            C3422t<K, V>.c cVarRemove = this.f11634b.remove(i2 - 1);
            m17301l().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f11634b.add(i, new c(k, v2));
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final V m17305q(int i) {
        m17295f();
        V value = this.f11634b.remove(i).getValue();
        if (!this.f11635c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m17301l().entrySet().iterator();
            this.f11634b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m17295f();
        Comparable comparable = (Comparable) obj;
        int iM17294e = m17294e(comparable);
        if (iM17294e >= 0) {
            return m17305q(iM17294e);
        }
        if (this.f11635c.isEmpty()) {
            return null;
        }
        return this.f11635c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f11634b.size() + this.f11635c.size();
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
            C3422t.this.m17304p(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3422t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3422t.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(C3422t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3422t.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3422t.this.size();
        }

        public /* synthetic */ e(C3422t c3422t, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$d */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f11643a;

        /* JADX INFO: renamed from: b */
        public boolean f11644b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f11645c;

        public d() {
            this.f11643a = -1;
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m17311a() {
            if (this.f11645c == null) {
                this.f11645c = C3422t.this.f11635c.entrySet().iterator();
            }
            return this.f11645c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f11644b = true;
            int i = this.f11643a + 1;
            this.f11643a = i;
            return i < C3422t.this.f11634b.size() ? (Map.Entry) C3422t.this.f11634b.get(this.f11643a) : m17311a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11643a + 1 < C3422t.this.f11634b.size() || m17311a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f11644b) {
                qkq0.m175383a("remove() was called before next()");
                return;
            }
            this.f11644b = false;
            C3422t.this.m17295f();
            if (this.f11643a >= C3422t.this.f11634b.size()) {
                m17311a().remove();
                return;
            }
            C3422t c3422t = C3422t.this;
            int i = this.f11643a;
            this.f11643a = i - 1;
            c3422t.m17305q(i);
        }

        public /* synthetic */ d(C3422t c3422t, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$c */
    public class c implements Map.Entry<K, V>, Comparable<C3422t<K, V>.c> {

        /* JADX INFO: renamed from: a */
        public final K f11640a;

        /* JADX INFO: renamed from: b */
        public V f11641b;

        public c(C3422t c3422t, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C3422t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m17309b(Object obj, Object obj2) {
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
            return m17309b(this.f11640a, entry.getKey()) && m17309b(this.f11641b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f11640a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f11641b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f11640a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v2 = this.f11641b;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            C3422t.this.m17295f();
            V v3 = this.f11641b;
            this.f11641b = v2;
            return v3;
        }

        public String toString() {
            return this.f11640a + "=" + this.f11641b;
        }

        public c(K k, V v2) {
            this.f11640a = k;
            this.f11641b = v2;
        }
    }

    public /* synthetic */ C3422t(int i, a aVar) {
        this(i);
    }
}
