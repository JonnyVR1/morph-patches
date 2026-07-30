package p149l;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class m3y0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public Object[] f131205a;

    /* JADX INFO: renamed from: b */
    public int f131206b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f131207c;

    /* JADX INFO: renamed from: d */
    public boolean f131208d;

    /* JADX INFO: renamed from: e */
    public volatile b5y0 f131209e;

    /* JADX INFO: renamed from: f */
    public Map<K, V> f131210f;

    public m3y0() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f131207c = map;
        this.f131210f = map;
    }

    /* JADX INFO: renamed from: a */
    public final int m152969a() {
        return this.f131206b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final int m152970b(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.f131206b;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = k.compareTo((Comparable) ((z3y0) this.f131205a[i3]).getKey());
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo((Comparable) ((z3y0) this.f131205a[i5]).getKey());
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = k.compareTo((Comparable) ((z3y0) this.f131205a[i3]).getKey());
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
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
    public void clear() {
        m152979q();
        if (this.f131206b != 0) {
            this.f131205a = null;
            this.f131206b = 0;
        }
        if (this.f131207c.isEmpty()) {
            return;
        }
        this.f131207c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m152970b(comparable) >= 0 || this.f131207c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v2) {
        m152979q();
        int iM152970b = m152970b(k);
        if (iM152970b >= 0) {
            return (V) ((z3y0) this.f131205a[iM152970b]).setValue(v2);
        }
        m152979q();
        if (this.f131205a == null) {
            this.f131205a = new Object[16];
        }
        int i = -(iM152970b + 1);
        if (i >= 16) {
            return m152978p().put(k, v2);
        }
        int i2 = this.f131206b;
        if (i2 == 16) {
            z3y0 z3y0Var = (z3y0) this.f131205a[15];
            this.f131206b = i2 - 1;
            m152978p().put((Comparable) z3y0Var.getKey(), z3y0Var.getValue());
        }
        Object[] objArr = this.f131205a;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f131205a[i] = new z3y0(this, k, v2);
        this.f131206b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f131209e == null) {
            this.f131209e = new b5y0(this);
        }
        return this.f131209e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3y0)) {
            return super.equals(obj);
        }
        m3y0 m3y0Var = (m3y0) obj;
        int size = size();
        if (size != m3y0Var.size()) {
            return false;
        }
        int i = this.f131206b;
        if (i != m3y0Var.f131206b) {
            return entrySet().equals(m3y0Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!m152972f(i2).equals(m3y0Var.m152972f(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f131207c.equals(m3y0Var.f131207c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Map.Entry<K, V> m152972f(int i) {
        if (i < this.f131206b) {
            return (z3y0) this.f131205a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: g */
    public final Iterable<Map.Entry<K, V>> m152973g() {
        return this.f131207c.isEmpty() ? Collections.EMPTY_SET : this.f131207c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM152970b = m152970b(comparable);
        return iM152970b >= 0 ? (V) ((z3y0) this.f131205a[iM152970b]).getValue() : this.f131207c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final V m152974h(int i) {
        m152979q();
        V v2 = (V) ((z3y0) this.f131205a[i]).getValue();
        Object[] objArr = this.f131205a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f131206b - i) - 1);
        this.f131206b--;
        if (!this.f131207c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m152978p().entrySet().iterator();
            this.f131205a[this.f131206b] = new z3y0(this, it.next());
            this.f131206b++;
            it.remove();
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = this.f131206b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f131205a[i2].hashCode();
        }
        return this.f131207c.size() > 0 ? iHashCode + this.f131207c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public final Set<Map.Entry<K, V>> m152975k() {
        return new y4y0(this);
    }

    /* JADX INFO: renamed from: l */
    public void mo152976l() {
        if (this.f131208d) {
            return;
        }
        this.f131207c = this.f131207c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f131207c);
        this.f131210f = this.f131210f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f131210f);
        this.f131208d = true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m152977n() {
        return this.f131208d;
    }

    /* JADX INFO: renamed from: p */
    public final SortedMap<K, V> m152978p() {
        m152979q();
        if (this.f131207c.isEmpty() && !(this.f131207c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f131207c = treeMap;
            this.f131210f = treeMap.descendingMap();
        }
        return (SortedMap) this.f131207c;
    }

    /* JADX INFO: renamed from: q */
    public final void m152979q() {
        if (this.f131208d) {
            bz00.m104536a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m152979q();
        Comparable comparable = (Comparable) obj;
        int iM152970b = m152970b(comparable);
        if (iM152970b >= 0) {
            return m152974h(iM152970b);
        }
        if (this.f131207c.isEmpty()) {
            return null;
        }
        return this.f131207c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f131206b + this.f131207c.size();
    }
}
