package kotlin.reflect.jvm.internal.impl.protobuf;

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

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public class C15302d<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public final int f65721a;

    /* JADX INFO: renamed from: b */
    public List<C15302d<K, V>.c> f65722b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f65723c;

    /* JADX INFO: renamed from: d */
    public boolean f65724d;

    /* JADX INFO: renamed from: e */
    public volatile C15302d<K, V>.e f65725e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    public static class a<FieldDescriptorType> extends C15302d<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15302d
        /* JADX INFO: renamed from: m */
        public void mo91410m() {
            if (!m91409l()) {
                for (int i = 0; i < m91406i(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryM91405h = m91405h(i);
                    if (((FieldSet.FieldDescriptorLite) entryM91405h.getKey()).isRepeated()) {
                        entryM91405h.setValue(Collections.unmodifiableList((List) entryM91405h.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m91407j()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo91410m();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m91411o((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Iterator<Object> f65726a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable<Object> f65727b = new C22718b();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b$a */
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

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b$b, reason: collision with other inner class name */
        public static class C22718b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f65726a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static <T> Iterable<T> m91414b() {
            return (Iterable<T>) f65727b;
        }
    }

    public C15302d(int i) {
        this.f65721a = i;
        this.f65722b = Collections.EMPTY_LIST;
        this.f65723c = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: n */
    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> C15302d<FieldDescriptorType, Object> m91401n(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m91403f();
        if (!this.f65722b.isEmpty()) {
            this.f65722b.clear();
        }
        if (this.f65723c.isEmpty()) {
            return;
        }
        this.f65723c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m91402e(comparable) >= 0 || this.f65723c.containsKey(comparable);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final int m91402e(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f65722b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f65722b.get(i3).getKey());
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
            int iCompareTo2 = k.compareTo(this.f65722b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f65722b.get(i3).getKey());
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
        if (this.f65725e == null) {
            this.f65725e = new e(this, null);
        }
        return this.f65725e;
    }

    /* JADX INFO: renamed from: f */
    public final void m91403f() {
        if (this.f65724d) {
            bz00.m104536a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m91404g() {
        m91403f();
        if (!this.f65722b.isEmpty() || (this.f65722b instanceof ArrayList)) {
            return;
        }
        this.f65722b = new ArrayList(this.f65721a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM91402e = m91402e(comparable);
        return iM91402e >= 0 ? this.f65722b.get(iM91402e).getValue() : this.f65723c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public Map.Entry<K, V> m91405h(int i) {
        return this.f65722b.get(i);
    }

    /* JADX INFO: renamed from: i */
    public int m91406i() {
        return this.f65722b.size();
    }

    /* JADX INFO: renamed from: j */
    public Iterable<Map.Entry<K, V>> m91407j() {
        return this.f65723c.isEmpty() ? b.m91414b() : this.f65723c.entrySet();
    }

    /* JADX INFO: renamed from: k */
    public final SortedMap<K, V> m91408k() {
        m91403f();
        if (this.f65723c.isEmpty() && !(this.f65723c instanceof TreeMap)) {
            this.f65723c = new TreeMap();
        }
        return (SortedMap) this.f65723c;
    }

    /* JADX INFO: renamed from: l */
    public boolean m91409l() {
        return this.f65724d;
    }

    /* JADX INFO: renamed from: m */
    public void mo91410m() {
        if (this.f65724d) {
            return;
        }
        this.f65723c = this.f65723c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f65723c);
        this.f65724d = true;
    }

    /* JADX INFO: renamed from: o */
    public V m91411o(K k, V v2) {
        m91403f();
        int iM91402e = m91402e(k);
        if (iM91402e >= 0) {
            return this.f65722b.get(iM91402e).setValue(v2);
        }
        m91404g();
        int i = -(iM91402e + 1);
        if (i >= this.f65721a) {
            return m91408k().put(k, v2);
        }
        int size = this.f65722b.size();
        int i2 = this.f65721a;
        if (size == i2) {
            C15302d<K, V>.c cVarRemove = this.f65722b.remove(i2 - 1);
            m91408k().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f65722b.add(i, new c(k, v2));
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final V m91412p(int i) {
        m91403f();
        V value = this.f65722b.remove(i).getValue();
        if (!this.f65723c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m91408k().entrySet().iterator();
            this.f65722b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m91403f();
        Comparable comparable = (Comparable) obj;
        int iM91402e = m91402e(comparable);
        if (iM91402e >= 0) {
            return m91412p(iM91402e);
        }
        if (this.f65723c.isEmpty()) {
            return null;
        }
        return this.f65723c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f65722b.size() + this.f65723c.size();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$e */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C15302d.this.m91411o(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C15302d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C15302d.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(C15302d.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C15302d.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C15302d.this.size();
        }

        public /* synthetic */ e(C15302d c15302d, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$d */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f65731a;

        /* JADX INFO: renamed from: b */
        public boolean f65732b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f65733c;

        public d() {
            this.f65731a = -1;
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m91418a() {
            if (this.f65733c == null) {
                this.f65733c = C15302d.this.f65723c.entrySet().iterator();
            }
            return this.f65733c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f65732b = true;
            int i = this.f65731a + 1;
            this.f65731a = i;
            return i < C15302d.this.f65722b.size() ? (Map.Entry) C15302d.this.f65722b.get(this.f65731a) : m91418a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65731a + 1 < C15302d.this.f65722b.size() || m91418a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f65732b) {
                qkq0.m175383a("remove() was called before next()");
                return;
            }
            this.f65732b = false;
            C15302d.this.m91403f();
            if (this.f65731a >= C15302d.this.f65722b.size()) {
                m91418a().remove();
                return;
            }
            C15302d c15302d = C15302d.this;
            int i = this.f65731a;
            this.f65731a = i - 1;
            c15302d.m91412p(i);
        }

        public /* synthetic */ d(C15302d c15302d, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$c */
    public class c implements Comparable<C15302d<K, V>.c>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f65728a;

        /* JADX INFO: renamed from: b */
        public V f65729b;

        public c(C15302d c15302d, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15302d<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m91416b(Object obj, Object obj2) {
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
            return m91416b(this.f65728a, entry.getKey()) && m91416b(this.f65729b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f65728a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f65729b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f65728a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v2 = this.f65729b;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            C15302d.this.m91403f();
            V v3 = this.f65729b;
            this.f65729b = v2;
            return v3;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f65728a);
            String strValueOf2 = String.valueOf(this.f65729b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        public c(K k, V v2) {
            this.f65728a = k;
            this.f65729b = v2;
        }
    }

    public /* synthetic */ C15302d(int i, a aVar) {
        this(i);
    }
}
