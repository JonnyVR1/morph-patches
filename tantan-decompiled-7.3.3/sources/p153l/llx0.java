package p153l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class llx0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public final int f132611a;

    /* JADX INFO: renamed from: b */
    public List f132612b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f132613c;

    /* JADX INFO: renamed from: d */
    public boolean f132614d;

    /* JADX INFO: renamed from: e */
    public volatile jlx0 f132615e;

    /* JADX INFO: renamed from: f */
    public Map f132616f;

    public /* synthetic */ llx0(int i, klx0 klx0Var) {
        this.f132611a = i;
        Map map = Collections.EMPTY_MAP;
        this.f132613c = map;
        this.f132616f = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo104934a() {
        if (this.f132614d) {
            return;
        }
        this.f132613c = this.f132613c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f132613c);
        this.f132616f = this.f132616f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f132616f);
        this.f132614d = true;
    }

    /* JADX INFO: renamed from: b */
    public final int m154804b() {
        return this.f132612b.size();
    }

    /* JADX INFO: renamed from: c */
    public final Iterable m154805c() {
        return this.f132613c.isEmpty() ? elx0.m121306a() : this.f132613c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m154812n();
        if (!this.f132612b.isEmpty()) {
            this.f132612b.clear();
        }
        if (this.f132613c.isEmpty()) {
            return;
        }
        this.f132613c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m154809k(comparable) >= 0 || this.f132613c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m154812n();
        int iM154809k = m154809k(comparable);
        if (iM154809k >= 0) {
            return ((flx0) this.f132612b.get(iM154809k)).setValue(obj);
        }
        m154812n();
        if (this.f132612b.isEmpty() && !(this.f132612b instanceof ArrayList)) {
            this.f132612b = new ArrayList(this.f132611a);
        }
        int i = -(iM154809k + 1);
        if (i >= this.f132611a) {
            return m154811m().put(comparable, obj);
        }
        int size = this.f132612b.size();
        int i2 = this.f132611a;
        if (size == i2) {
            flx0 flx0Var = (flx0) this.f132612b.remove(i2 - 1);
            m154811m().put(flx0Var.m126172a(), flx0Var.getValue());
        }
        this.f132612b.add(i, new flx0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f132615e == null) {
            this.f132615e = new jlx0(this, null);
        }
        return this.f132615e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llx0)) {
            return super.equals(obj);
        }
        llx0 llx0Var = (llx0) obj;
        int size = size();
        if (size != llx0Var.size()) {
            return false;
        }
        int iM154804b = m154804b();
        if (iM154804b != llx0Var.m154804b()) {
            return entrySet().equals(llx0Var.entrySet());
        }
        for (int i = 0; i < iM154804b; i++) {
            if (!m154807g(i).equals(llx0Var.m154807g(i))) {
                return false;
            }
        }
        if (iM154804b != size) {
            return this.f132613c.equals(llx0Var.f132613c);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final Map.Entry m154807g(int i) {
        return (Map.Entry) this.f132612b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM154809k = m154809k(comparable);
        return iM154809k >= 0 ? ((flx0) this.f132612b.get(iM154809k)).getValue() : this.f132613c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM154804b = m154804b();
        int iHashCode = 0;
        for (int i = 0; i < iM154804b; i++) {
            iHashCode += ((flx0) this.f132612b.get(i)).hashCode();
        }
        return this.f132613c.size() > 0 ? iHashCode + this.f132613c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m154808j() {
        return this.f132614d;
    }

    /* JADX INFO: renamed from: k */
    public final int m154809k(Comparable comparable) {
        int size = this.f132612b.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((flx0) this.f132612b.get(i)).m126172a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((flx0) this.f132612b.get(i3)).m126172a());
            if (iCompareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: l */
    public final Object m154810l(int i) {
        m154812n();
        Object value = ((flx0) this.f132612b.remove(i)).getValue();
        if (!this.f132613c.isEmpty()) {
            Iterator it = m154811m().entrySet().iterator();
            List list = this.f132612b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new flx0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: m */
    public final SortedMap m154811m() {
        m154812n();
        if (this.f132613c.isEmpty() && !(this.f132613c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f132613c = treeMap;
            this.f132616f = treeMap.descendingMap();
        }
        return (SortedMap) this.f132613c;
    }

    /* JADX INFO: renamed from: n */
    public final void m154812n() {
        if (this.f132614d) {
            l710.m153113a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m154812n();
        Comparable comparable = (Comparable) obj;
        int iM154809k = m154809k(comparable);
        if (iM154809k >= 0) {
            return m154810l(iM154809k);
        }
        if (this.f132613c.isEmpty()) {
            return null;
        }
        return this.f132613c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f132612b.size() + this.f132613c.size();
    }
}
