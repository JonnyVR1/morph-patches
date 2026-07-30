package p153l;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class scy0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public Object[] f167357a;

    /* JADX INFO: renamed from: b */
    public int f167358b;

    /* JADX INFO: renamed from: c */
    public Map<K, V> f167359c;

    /* JADX INFO: renamed from: d */
    public boolean f167360d;

    /* JADX INFO: renamed from: e */
    public volatile hey0 f167361e;

    /* JADX INFO: renamed from: f */
    public Map<K, V> f167362f;

    public scy0() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f167359c = map;
        this.f167362f = map;
    }

    /* JADX INFO: renamed from: a */
    public final int m185401a() {
        return this.f167358b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final int m185402b(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.f167358b;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = k.compareTo((Comparable) ((fdy0) this.f167357a[i3]).getKey());
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
            int iCompareTo2 = k.compareTo((Comparable) ((fdy0) this.f167357a[i5]).getKey());
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = k.compareTo((Comparable) ((fdy0) this.f167357a[i3]).getKey());
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
        m185410q();
        if (this.f167358b != 0) {
            this.f167357a = null;
            this.f167358b = 0;
        }
        if (this.f167359c.isEmpty()) {
            return;
        }
        this.f167359c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m185402b(comparable) >= 0 || this.f167359c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v2) {
        m185410q();
        int iM185402b = m185402b(k);
        if (iM185402b >= 0) {
            return (V) ((fdy0) this.f167357a[iM185402b]).setValue(v2);
        }
        m185410q();
        if (this.f167357a == null) {
            this.f167357a = new Object[16];
        }
        int i = -(iM185402b + 1);
        if (i >= 16) {
            return m185409p().put(k, v2);
        }
        int i2 = this.f167358b;
        if (i2 == 16) {
            fdy0 fdy0Var = (fdy0) this.f167357a[15];
            this.f167358b = i2 - 1;
            m185409p().put((Comparable) fdy0Var.getKey(), fdy0Var.getValue());
        }
        Object[] objArr = this.f167357a;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f167357a[i] = new fdy0(this, k, v2);
        this.f167358b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f167361e == null) {
            this.f167361e = new hey0(this);
        }
        return this.f167361e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scy0)) {
            return super.equals(obj);
        }
        scy0 scy0Var = (scy0) obj;
        int size = size();
        if (size != scy0Var.size()) {
            return false;
        }
        int i = this.f167358b;
        if (i != scy0Var.f167358b) {
            return entrySet().equals(scy0Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!m185404f(i2).equals(scy0Var.m185404f(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f167359c.equals(scy0Var.f167359c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Map.Entry<K, V> m185404f(int i) {
        if (i < this.f167358b) {
            return (fdy0) this.f167357a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: g */
    public final Iterable<Map.Entry<K, V>> m185405g() {
        return this.f167359c.isEmpty() ? Collections.EMPTY_SET : this.f167359c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM185402b = m185402b(comparable);
        return iM185402b >= 0 ? (V) ((fdy0) this.f167357a[iM185402b]).getValue() : this.f167359c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final V m185406h(int i) {
        m185410q();
        V v2 = (V) ((fdy0) this.f167357a[i]).getValue();
        Object[] objArr = this.f167357a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f167358b - i) - 1);
        this.f167358b--;
        if (!this.f167359c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m185409p().entrySet().iterator();
            this.f167357a[this.f167358b] = new fdy0(this, it.next());
            this.f167358b++;
            it.remove();
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = this.f167358b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f167357a[i2].hashCode();
        }
        return this.f167359c.size() > 0 ? iHashCode + this.f167359c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public final Set<Map.Entry<K, V>> m185407k() {
        return new eey0(this);
    }

    /* JADX INFO: renamed from: l */
    public void mo109265l() {
        if (this.f167360d) {
            return;
        }
        this.f167359c = this.f167359c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f167359c);
        this.f167362f = this.f167362f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f167362f);
        this.f167360d = true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m185408n() {
        return this.f167360d;
    }

    /* JADX INFO: renamed from: p */
    public final SortedMap<K, V> m185409p() {
        m185410q();
        if (this.f167359c.isEmpty() && !(this.f167359c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f167359c = treeMap;
            this.f167362f = treeMap.descendingMap();
        }
        return (SortedMap) this.f167359c;
    }

    /* JADX INFO: renamed from: q */
    public final void m185410q() {
        if (this.f167360d) {
            l710.m153113a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m185410q();
        Comparable comparable = (Comparable) obj;
        int iM185402b = m185402b(comparable);
        if (iM185402b >= 0) {
            return m185406h(iM185402b);
        }
        if (this.f167359c.isEmpty()) {
            return null;
        }
        return this.f167359c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f167358b + this.f167359c.size();
    }
}
