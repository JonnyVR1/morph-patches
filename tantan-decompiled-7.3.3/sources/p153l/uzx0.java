package p153l;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class uzx0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public Object[] f181819a;

    /* JADX INFO: renamed from: b */
    public int f181820b;

    /* JADX INFO: renamed from: c */
    public Map f181821c;

    /* JADX INFO: renamed from: d */
    public boolean f181822d;

    /* JADX INFO: renamed from: e */
    public volatile lzx0 f181823e;

    /* JADX INFO: renamed from: f */
    public Map f181824f;

    public /* synthetic */ uzx0(qzx0 qzx0Var) {
        Map map = Collections.EMPTY_MAP;
        this.f181821c = map;
        this.f181824f = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo198868a() {
        if (this.f181822d) {
            return;
        }
        this.f181821c = this.f181821c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f181821c);
        this.f181824f = this.f181824f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f181824f);
        this.f181822d = true;
    }

    /* JADX INFO: renamed from: c */
    public final int m198869c() {
        return this.f181820b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m198877o();
        if (this.f181820b != 0) {
            this.f181819a = null;
            this.f181820b = 0;
        }
        if (this.f181821c.isEmpty()) {
            return;
        }
        this.f181821c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m198874l(comparable) >= 0 || this.f181821c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m198870d() {
        return this.f181821c.isEmpty() ? Collections.EMPTY_SET : this.f181821c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f181823e == null) {
            this.f181823e = new lzx0(this, null);
        }
        return this.f181823e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzx0)) {
            return super.equals(obj);
        }
        uzx0 uzx0Var = (uzx0) obj;
        int size = size();
        if (size != uzx0Var.size()) {
            return false;
        }
        int i = this.f181820b;
        if (i != uzx0Var.f181820b) {
            return entrySet().equals(uzx0Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!m198872g(i2).equals(uzx0Var.m198872g(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f181821c.equals(uzx0Var.f181821c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m198877o();
        int iM198874l = m198874l(comparable);
        if (iM198874l >= 0) {
            return ((czx0) this.f181819a[iM198874l]).setValue(obj);
        }
        m198877o();
        if (this.f181819a == null) {
            this.f181819a = new Object[16];
        }
        int i = -(iM198874l + 1);
        if (i >= 16) {
            return m198876n().put(comparable, obj);
        }
        if (this.f181820b == 16) {
            czx0 czx0Var = (czx0) this.f181819a[15];
            this.f181820b = 15;
            m198876n().put(czx0Var.m113352a(), czx0Var.getValue());
        }
        Object[] objArr = this.f181819a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f181819a[i] = new czx0(this, comparable, obj);
        this.f181820b++;
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Map.Entry m198872g(int i) {
        if (i < this.f181820b) {
            return (czx0) this.f181819a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM198874l = m198874l(comparable);
        return iM198874l >= 0 ? ((czx0) this.f181819a[iM198874l]).getValue() : this.f181821c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f181820b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f181819a[i2].hashCode();
        }
        return this.f181821c.size() > 0 ? iHashCode + this.f181821c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m198873j() {
        return this.f181822d;
    }

    /* JADX INFO: renamed from: l */
    public final int m198874l(Comparable comparable) {
        int i = this.f181820b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((czx0) this.f181819a[i2]).m113352a());
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((czx0) this.f181819a[i4]).m113352a());
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: m */
    public final Object m198875m(int i) {
        m198877o();
        Object value = ((czx0) this.f181819a[i]).getValue();
        Object[] objArr = this.f181819a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f181820b - i) - 1);
        this.f181820b--;
        if (!this.f181821c.isEmpty()) {
            Iterator it = m198876n().entrySet().iterator();
            Object[] objArr2 = this.f181819a;
            int i2 = this.f181820b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new czx0(this, (Comparable) entry.getKey(), entry.getValue());
            this.f181820b++;
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: n */
    public final SortedMap m198876n() {
        m198877o();
        if (this.f181821c.isEmpty() && !(this.f181821c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f181821c = treeMap;
            this.f181824f = treeMap.descendingMap();
        }
        return (SortedMap) this.f181821c;
    }

    /* JADX INFO: renamed from: o */
    public final void m198877o() {
        if (this.f181822d) {
            l710.m153113a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m198877o();
        Comparable comparable = (Comparable) obj;
        int iM198874l = m198874l(comparable);
        if (iM198874l >= 0) {
            return m198875m(iM198874l);
        }
        if (this.f181821c.isEmpty()) {
            return null;
        }
        return this.f181821c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f181820b + this.f181821c.size();
    }
}
