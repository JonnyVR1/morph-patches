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
import p153l.l710;
import p153l.wtq0;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public class C15409d<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public final int f66395a;

    /* JADX INFO: renamed from: b */
    public List<C15409d<K, V>.c> f66396b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f66397c;

    /* JADX INFO: renamed from: d */
    public boolean f66398d;

    /* JADX INFO: renamed from: e */
    public volatile C15409d<K, V>.e f66399e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    public static class a<FieldDescriptorType> extends C15409d<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C15409d
        /* JADX INFO: renamed from: m */
        public void mo92301m() {
            if (!m92300l()) {
                for (int i = 0; i < m92297i(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryM92296h = m92296h(i);
                    if (((FieldSet.FieldDescriptorLite) entryM92296h.getKey()).isRepeated()) {
                        entryM92296h.setValue(Collections.unmodifiableList((List) entryM92296h.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m92298j()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo92301m();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m92302o((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Iterator<Object> f66400a = new a();

        /* JADX INFO: renamed from: b */
        public static final Iterable<Object> f66401b = new C22834b();

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
        public static class C22834b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f66400a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static <T> Iterable<T> m92305b() {
            return (Iterable<T>) f66401b;
        }
    }

    public C15409d(int i) {
        this.f66395a = i;
        this.f66396b = Collections.EMPTY_LIST;
        this.f66397c = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: n */
    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> C15409d<FieldDescriptorType, Object> m92292n(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m92294f();
        if (!this.f66396b.isEmpty()) {
            this.f66396b.clear();
        }
        if (this.f66397c.isEmpty()) {
            return;
        }
        this.f66397c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m92293e(comparable) >= 0 || this.f66397c.containsKey(comparable);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final int m92293e(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f66396b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f66396b.get(i3).getKey());
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
            int iCompareTo2 = k.compareTo(this.f66396b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f66396b.get(i3).getKey());
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
        if (this.f66399e == null) {
            this.f66399e = new e(this, null);
        }
        return this.f66399e;
    }

    /* JADX INFO: renamed from: f */
    public final void m92294f() {
        if (this.f66398d) {
            l710.m153113a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m92295g() {
        m92294f();
        if (!this.f66396b.isEmpty() || (this.f66396b instanceof ArrayList)) {
            return;
        }
        this.f66396b = new ArrayList(this.f66395a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM92293e = m92293e(comparable);
        return iM92293e >= 0 ? this.f66396b.get(iM92293e).getValue() : this.f66397c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public Map.Entry<K, V> m92296h(int i) {
        return this.f66396b.get(i);
    }

    /* JADX INFO: renamed from: i */
    public int m92297i() {
        return this.f66396b.size();
    }

    /* JADX INFO: renamed from: j */
    public Iterable<Map.Entry<K, V>> m92298j() {
        return this.f66397c.isEmpty() ? b.m92305b() : this.f66397c.entrySet();
    }

    /* JADX INFO: renamed from: k */
    public final SortedMap<K, V> m92299k() {
        m92294f();
        if (this.f66397c.isEmpty() && !(this.f66397c instanceof TreeMap)) {
            this.f66397c = new TreeMap();
        }
        return (SortedMap) this.f66397c;
    }

    /* JADX INFO: renamed from: l */
    public boolean m92300l() {
        return this.f66398d;
    }

    /* JADX INFO: renamed from: m */
    public void mo92301m() {
        if (this.f66398d) {
            return;
        }
        this.f66397c = this.f66397c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f66397c);
        this.f66398d = true;
    }

    /* JADX INFO: renamed from: o */
    public V m92302o(K k, V v2) {
        m92294f();
        int iM92293e = m92293e(k);
        if (iM92293e >= 0) {
            return this.f66396b.get(iM92293e).setValue(v2);
        }
        m92295g();
        int i = -(iM92293e + 1);
        if (i >= this.f66395a) {
            return m92299k().put(k, v2);
        }
        int size = this.f66396b.size();
        int i2 = this.f66395a;
        if (size == i2) {
            C15409d<K, V>.c cVarRemove = this.f66396b.remove(i2 - 1);
            m92299k().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f66396b.add(i, new c(k, v2));
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final V m92303p(int i) {
        m92294f();
        V value = this.f66396b.remove(i).getValue();
        if (!this.f66397c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m92299k().entrySet().iterator();
            this.f66396b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m92294f();
        Comparable comparable = (Comparable) obj;
        int iM92293e = m92293e(comparable);
        if (iM92293e >= 0) {
            return m92303p(iM92293e);
        }
        if (this.f66397c.isEmpty()) {
            return null;
        }
        return this.f66397c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f66396b.size() + this.f66397c.size();
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
            C15409d.this.m92302o(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C15409d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C15409d.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(C15409d.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C15409d.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C15409d.this.size();
        }

        public /* synthetic */ e(C15409d c15409d, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$d */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f66405a;

        /* JADX INFO: renamed from: b */
        public boolean f66406b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f66407c;

        public d() {
            this.f66405a = -1;
        }

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, V>> m92309a() {
            if (this.f66407c == null) {
                this.f66407c = C15409d.this.f66397c.entrySet().iterator();
            }
            return this.f66407c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f66406b = true;
            int i = this.f66405a + 1;
            this.f66405a = i;
            return i < C15409d.this.f66396b.size() ? (Map.Entry) C15409d.this.f66396b.get(this.f66405a) : m92309a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66405a + 1 < C15409d.this.f66396b.size() || m92309a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f66406b) {
                wtq0.m207906a("remove() was called before next()");
                return;
            }
            this.f66406b = false;
            C15409d.this.m92294f();
            if (this.f66405a >= C15409d.this.f66396b.size()) {
                m92309a().remove();
                return;
            }
            C15409d c15409d = C15409d.this;
            int i = this.f66405a;
            this.f66405a = i - 1;
            c15409d.m92303p(i);
        }

        public /* synthetic */ d(C15409d c15409d, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$c */
    public class c implements Comparable<C15409d<K, V>.c>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f66402a;

        /* JADX INFO: renamed from: b */
        public V f66403b;

        public c(C15409d c15409d, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15409d<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m92307b(Object obj, Object obj2) {
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
            return m92307b(this.f66402a, entry.getKey()) && m92307b(this.f66403b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f66402a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f66403b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f66402a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v2 = this.f66403b;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            C15409d.this.m92294f();
            V v3 = this.f66403b;
            this.f66403b = v2;
            return v3;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f66402a);
            String strValueOf2 = String.valueOf(this.f66403b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        public c(K k, V v2) {
            this.f66402a = k;
            this.f66403b = v2;
        }
    }

    public /* synthetic */ C15409d(int i, a aVar) {
        this(i);
    }
}
