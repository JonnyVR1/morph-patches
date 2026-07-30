package p149l;

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
public class fcx0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public final int f96872a;

    /* JADX INFO: renamed from: b */
    public List f96873b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f96874c;

    /* JADX INFO: renamed from: d */
    public boolean f96875d;

    /* JADX INFO: renamed from: e */
    public volatile dcx0 f96876e;

    /* JADX INFO: renamed from: f */
    public Map f96877f;

    public /* synthetic */ fcx0(int i, ecx0 ecx0Var) {
        this.f96872a = i;
        Map map = Collections.EMPTY_MAP;
        this.f96874c = map;
        this.f96877f = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo120493a() {
        if (this.f96875d) {
            return;
        }
        this.f96874c = this.f96874c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f96874c);
        this.f96877f = this.f96877f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f96877f);
        this.f96875d = true;
    }

    /* JADX INFO: renamed from: b */
    public final int m120494b() {
        return this.f96873b.size();
    }

    /* JADX INFO: renamed from: c */
    public final Iterable m120495c() {
        return this.f96874c.isEmpty() ? ybx0.m213984a() : this.f96874c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m120502n();
        if (!this.f96873b.isEmpty()) {
            this.f96873b.clear();
        }
        if (this.f96874c.isEmpty()) {
            return;
        }
        this.f96874c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m120499k(comparable) >= 0 || this.f96874c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m120502n();
        int iM120499k = m120499k(comparable);
        if (iM120499k >= 0) {
            return ((zbx0) this.f96873b.get(iM120499k)).setValue(obj);
        }
        m120502n();
        if (this.f96873b.isEmpty() && !(this.f96873b instanceof ArrayList)) {
            this.f96873b = new ArrayList(this.f96872a);
        }
        int i = -(iM120499k + 1);
        if (i >= this.f96872a) {
            return m120501m().put(comparable, obj);
        }
        int size = this.f96873b.size();
        int i2 = this.f96872a;
        if (size == i2) {
            zbx0 zbx0Var = (zbx0) this.f96873b.remove(i2 - 1);
            m120501m().put(zbx0Var.m218006a(), zbx0Var.getValue());
        }
        this.f96873b.add(i, new zbx0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f96876e == null) {
            this.f96876e = new dcx0(this, null);
        }
        return this.f96876e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcx0)) {
            return super.equals(obj);
        }
        fcx0 fcx0Var = (fcx0) obj;
        int size = size();
        if (size != fcx0Var.size()) {
            return false;
        }
        int iM120494b = m120494b();
        if (iM120494b != fcx0Var.m120494b()) {
            return entrySet().equals(fcx0Var.entrySet());
        }
        for (int i = 0; i < iM120494b; i++) {
            if (!m120497g(i).equals(fcx0Var.m120497g(i))) {
                return false;
            }
        }
        if (iM120494b != size) {
            return this.f96874c.equals(fcx0Var.f96874c);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final Map.Entry m120497g(int i) {
        return (Map.Entry) this.f96873b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM120499k = m120499k(comparable);
        return iM120499k >= 0 ? ((zbx0) this.f96873b.get(iM120499k)).getValue() : this.f96874c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM120494b = m120494b();
        int iHashCode = 0;
        for (int i = 0; i < iM120494b; i++) {
            iHashCode += ((zbx0) this.f96873b.get(i)).hashCode();
        }
        return this.f96874c.size() > 0 ? iHashCode + this.f96874c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m120498j() {
        return this.f96875d;
    }

    /* JADX INFO: renamed from: k */
    public final int m120499k(Comparable comparable) {
        int size = this.f96873b.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((zbx0) this.f96873b.get(i)).m218006a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((zbx0) this.f96873b.get(i3)).m218006a());
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
    public final Object m120500l(int i) {
        m120502n();
        Object value = ((zbx0) this.f96873b.remove(i)).getValue();
        if (!this.f96874c.isEmpty()) {
            Iterator it = m120501m().entrySet().iterator();
            List list = this.f96873b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zbx0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: m */
    public final SortedMap m120501m() {
        m120502n();
        if (this.f96874c.isEmpty() && !(this.f96874c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f96874c = treeMap;
            this.f96877f = treeMap.descendingMap();
        }
        return (SortedMap) this.f96874c;
    }

    /* JADX INFO: renamed from: n */
    public final void m120502n() {
        if (this.f96875d) {
            bz00.m104536a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m120502n();
        Comparable comparable = (Comparable) obj;
        int iM120499k = m120499k(comparable);
        if (iM120499k >= 0) {
            return m120500l(iM120499k);
        }
        if (this.f96874c.isEmpty()) {
            return null;
        }
        return this.f96874c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f96873b.size() + this.f96874c.size();
    }
}
