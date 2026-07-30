package androidx.datastore.preferences.protobuf;

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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0340k0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public final int f1690a;

    /* JADX INFO: renamed from: b */
    public List<C0340k0<K, V>.e> f1691b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f1692c;

    /* JADX INFO: renamed from: d */
    public boolean f1693d;

    /* JADX INFO: renamed from: e */
    public volatile C0340k0<K, V>.g f1694e;

    /* JADX INFO: renamed from: f */
    public Map<K, V> f1695f;

    /* JADX INFO: renamed from: g */
    public volatile C0340k0<K, V>.c f1696g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$a */
    public static class a<FieldDescriptorType> extends C0340k0<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // androidx.datastore.preferences.protobuf.C0340k0
        /* JADX INFO: renamed from: p */
        public void mo2214p() {
            if (!m2213o()) {
                for (int i = 0; i < m2209k(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryM2208j = m2208j(i);
                    if (((C0348p.b) entryM2208j.getKey()).isRepeated()) {
                        entryM2208j.setValue(Collections.unmodifiableList((List) entryM2208j.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m2211m()) {
                    if (((C0348p.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo2214p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m2215r((C0348p.b) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static final Iterator<Object> f1701a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable<Object> f1702b = new b();

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$d$a */
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

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$d$b */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f1701a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static <T> Iterable<T> m2220b() {
            return (Iterable<T>) f1702b;
        }
    }

    public C0340k0(int i) {
        this.f1690a = i;
        this.f1691b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f1692c = map;
        this.f1695f = map;
    }

    /* JADX INFO: renamed from: q */
    public static <FieldDescriptorType extends C0348p.b<FieldDescriptorType>> C0340k0<FieldDescriptorType, Object> m2203q(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m2205g();
        if (!this.f1691b.isEmpty()) {
            this.f1691b.clear();
        }
        if (this.f1692c.isEmpty()) {
            return;
        }
        this.f1692c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m2204f(comparable) >= 0 || this.f1692c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f1694e == null) {
            this.f1694e = new g(this, null);
        }
        return this.f1694e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0340k0)) {
            return super.equals(obj);
        }
        C0340k0 c0340k0 = (C0340k0) obj;
        int size = size();
        if (size != c0340k0.size()) {
            return false;
        }
        int iM2209k = m2209k();
        if (iM2209k != c0340k0.m2209k()) {
            return entrySet().equals(c0340k0.entrySet());
        }
        for (int i = 0; i < iM2209k; i++) {
            if (!m2208j(i).equals(c0340k0.m2208j(i))) {
                return false;
            }
        }
        if (iM2209k != size) {
            return this.f1692c.equals(c0340k0.f1692c);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final int m2204f(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f1691b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f1691b.get(i3).getKey());
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
            int iCompareTo2 = k.compareTo(this.f1691b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f1691b.get(i3).getKey());
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

    /* JADX INFO: renamed from: g */
    public final void m2205g() {
        if (this.f1693d) {
            l710.m153113a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM2204f = m2204f(comparable);
        return iM2204f >= 0 ? this.f1691b.get(iM2204f).getValue() : this.f1692c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public Set<Map.Entry<K, V>> m2206h() {
        if (this.f1696g == null) {
            this.f1696g = new c(this, null);
        }
        return this.f1696g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM2209k = m2209k();
        int iHashCode = 0;
        for (int i = 0; i < iM2209k; i++) {
            iHashCode += this.f1691b.get(i).hashCode();
        }
        return m2210l() > 0 ? iHashCode + this.f1692c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m2207i() {
        m2205g();
        if (!this.f1691b.isEmpty() || (this.f1691b instanceof ArrayList)) {
            return;
        }
        this.f1691b = new ArrayList(this.f1690a);
    }

    /* JADX INFO: renamed from: j */
    public Map.Entry<K, V> m2208j(int i) {
        return this.f1691b.get(i);
    }

    /* JADX INFO: renamed from: k */
    public int m2209k() {
        return this.f1691b.size();
    }

    /* JADX INFO: renamed from: l */
    public int m2210l() {
        return this.f1692c.size();
    }

    /* JADX INFO: renamed from: m */
    public Iterable<Map.Entry<K, V>> m2211m() {
        return this.f1692c.isEmpty() ? d.m2220b() : this.f1692c.entrySet();
    }

    /* JADX INFO: renamed from: n */
    public final SortedMap<K, V> m2212n() {
        m2205g();
        if (this.f1692c.isEmpty() && !(this.f1692c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1692c = treeMap;
            this.f1695f = treeMap.descendingMap();
        }
        return (SortedMap) this.f1692c;
    }

    /* JADX INFO: renamed from: o */
    public boolean m2213o() {
        return this.f1693d;
    }

    /* JADX INFO: renamed from: p */
    public void mo2214p() {
        if (this.f1693d) {
            return;
        }
        this.f1692c = this.f1692c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f1692c);
        this.f1695f = this.f1695f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f1695f);
        this.f1693d = true;
    }

    /* JADX INFO: renamed from: r */
    public V m2215r(K k, V v2) {
        m2205g();
        int iM2204f = m2204f(k);
        if (iM2204f >= 0) {
            return this.f1691b.get(iM2204f).setValue(v2);
        }
        m2207i();
        int i = -(iM2204f + 1);
        if (i >= this.f1690a) {
            return m2212n().put(k, v2);
        }
        int size = this.f1691b.size();
        int i2 = this.f1690a;
        if (size == i2) {
            C0340k0<K, V>.e eVarRemove = this.f1691b.remove(i2 - 1);
            m2212n().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f1691b.add(i, new e(k, v2));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m2205g();
        Comparable comparable = (Comparable) obj;
        int iM2204f = m2204f(comparable);
        if (iM2204f >= 0) {
            return m2216s(iM2204f);
        }
        if (this.f1692c.isEmpty()) {
            return null;
        }
        return this.f1692c.remove(comparable);
    }

    /* JADX INFO: renamed from: s */
    public final V m2216s(int i) {
        m2205g();
        V value = this.f1691b.remove(i).getValue();
        if (!this.f1692c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m2212n().entrySet().iterator();
            this.f1691b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f1691b.size() + this.f1692c.size();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$g */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C0340k0.this.m2215r(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0340k0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C0340k0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C0340k0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C0340k0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0340k0.this.size();
        }

        public /* synthetic */ g(C0340k0 c0340k0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$c */
    public class c extends C0340k0<K, V>.g {
        public c() {
            super(C0340k0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.C0340k0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C0340k0.this, null);
        }

        public /* synthetic */ c(C0340k0 c0340k0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$f */
    public class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f1706a;

        /* JADX INFO: renamed from: b */
        public boolean f1707b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f1708c;

        public f() {
            this.f1706a = -1;
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m2224a() {
            if (this.f1708c == null) {
                this.f1708c = C0340k0.this.f1692c.entrySet().iterator();
            }
            return this.f1708c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f1707b = true;
            int i = this.f1706a + 1;
            this.f1706a = i;
            return i < C0340k0.this.f1691b.size() ? (Map.Entry) C0340k0.this.f1691b.get(this.f1706a) : m2224a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1706a + 1 < C0340k0.this.f1691b.size() || (!C0340k0.this.f1692c.isEmpty() && m2224a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1707b) {
                wtq0.m207906a("remove() was called before next()");
                return;
            }
            this.f1707b = false;
            C0340k0.this.m2205g();
            if (this.f1706a >= C0340k0.this.f1691b.size()) {
                m2224a().remove();
                return;
            }
            C0340k0 c0340k0 = C0340k0.this;
            int i = this.f1706a;
            this.f1706a = i - 1;
            c0340k0.m2216s(i);
        }

        public /* synthetic */ f(C0340k0 c0340k0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$e */
    public class e implements Map.Entry<K, V>, Comparable<C0340k0<K, V>.e> {

        /* JADX INFO: renamed from: a */
        public final K f1703a;

        /* JADX INFO: renamed from: b */
        public V f1704b;

        public e(C0340k0 c0340k0, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0340k0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m2222b(Object obj, Object obj2) {
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
            return m2222b(this.f1703a, entry.getKey()) && m2222b(this.f1704b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f1703a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1704b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f1703a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v2 = this.f1704b;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            C0340k0.this.m2205g();
            V v3 = this.f1704b;
            this.f1704b = v2;
            return v3;
        }

        public String toString() {
            return this.f1703a + "=" + this.f1704b;
        }

        public e(K k, V v2) {
            this.f1703a = k;
            this.f1704b = v2;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f1697a;

        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> f1698b;

        public b() {
            this.f1697a = C0340k0.this.f1691b.size();
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m2217a() {
            if (this.f1698b == null) {
                this.f1698b = C0340k0.this.f1695f.entrySet().iterator();
            }
            return this.f1698b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (m2217a().hasNext()) {
                return m2217a().next();
            }
            List list = C0340k0.this.f1691b;
            int i = this.f1697a - 1;
            this.f1697a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f1697a;
            return (i > 0 && i <= C0340k0.this.f1691b.size()) || m2217a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(C0340k0 c0340k0, a aVar) {
            this();
        }
    }

    public /* synthetic */ C0340k0(int i, a aVar) {
        this(i);
    }
}
