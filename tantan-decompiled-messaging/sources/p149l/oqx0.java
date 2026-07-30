package p149l;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class oqx0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public Object[] f145202a;

    /* JADX INFO: renamed from: b */
    public int f145203b;

    /* JADX INFO: renamed from: c */
    public Map f145204c;

    /* JADX INFO: renamed from: d */
    public boolean f145205d;

    /* JADX INFO: renamed from: e */
    public volatile fqx0 f145206e;

    /* JADX INFO: renamed from: f */
    public Map f145207f;

    public /* synthetic */ oqx0(kqx0 kqx0Var) {
        Map map = Collections.EMPTY_MAP;
        this.f145204c = map;
        this.f145207f = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo165499a() {
        if (this.f145205d) {
            return;
        }
        this.f145204c = this.f145204c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f145204c);
        this.f145207f = this.f145207f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f145207f);
        this.f145205d = true;
    }

    /* JADX INFO: renamed from: c */
    public final int m165500c() {
        return this.f145203b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m165508o();
        if (this.f145203b != 0) {
            this.f145202a = null;
            this.f145203b = 0;
        }
        if (this.f145204c.isEmpty()) {
            return;
        }
        this.f145204c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m165505l(comparable) >= 0 || this.f145204c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m165501d() {
        return this.f145204c.isEmpty() ? Collections.EMPTY_SET : this.f145204c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f145206e == null) {
            this.f145206e = new fqx0(this, null);
        }
        return this.f145206e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqx0)) {
            return super.equals(obj);
        }
        oqx0 oqx0Var = (oqx0) obj;
        int size = size();
        if (size != oqx0Var.size()) {
            return false;
        }
        int i = this.f145203b;
        if (i != oqx0Var.f145203b) {
            return entrySet().equals(oqx0Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!m165503g(i2).equals(oqx0Var.m165503g(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f145204c.equals(oqx0Var.f145204c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m165508o();
        int iM165505l = m165505l(comparable);
        if (iM165505l >= 0) {
            return ((wpx0) this.f145202a[iM165505l]).setValue(obj);
        }
        m165508o();
        if (this.f145202a == null) {
            this.f145202a = new Object[16];
        }
        int i = -(iM165505l + 1);
        if (i >= 16) {
            return m165507n().put(comparable, obj);
        }
        if (this.f145203b == 16) {
            wpx0 wpx0Var = (wpx0) this.f145202a[15];
            this.f145203b = 15;
            m165507n().put(wpx0Var.m204951a(), wpx0Var.getValue());
        }
        Object[] objArr = this.f145202a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f145202a[i] = new wpx0(this, comparable, obj);
        this.f145203b++;
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Map.Entry m165503g(int i) {
        if (i < this.f145203b) {
            return (wpx0) this.f145202a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM165505l = m165505l(comparable);
        return iM165505l >= 0 ? ((wpx0) this.f145202a[iM165505l]).getValue() : this.f145204c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f145203b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f145202a[i2].hashCode();
        }
        return this.f145204c.size() > 0 ? iHashCode + this.f145204c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m165504j() {
        return this.f145205d;
    }

    /* JADX INFO: renamed from: l */
    public final int m165505l(Comparable comparable) {
        int i = this.f145203b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((wpx0) this.f145202a[i2]).m204951a());
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((wpx0) this.f145202a[i4]).m204951a());
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
    public final Object m165506m(int i) {
        m165508o();
        Object value = ((wpx0) this.f145202a[i]).getValue();
        Object[] objArr = this.f145202a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f145203b - i) - 1);
        this.f145203b--;
        if (!this.f145204c.isEmpty()) {
            Iterator it = m165507n().entrySet().iterator();
            Object[] objArr2 = this.f145202a;
            int i2 = this.f145203b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new wpx0(this, (Comparable) entry.getKey(), entry.getValue());
            this.f145203b++;
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: n */
    public final SortedMap m165507n() {
        m165508o();
        if (this.f145204c.isEmpty() && !(this.f145204c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f145204c = treeMap;
            this.f145207f = treeMap.descendingMap();
        }
        return (SortedMap) this.f145204c;
    }

    /* JADX INFO: renamed from: o */
    public final void m165508o() {
        if (this.f145205d) {
            bz00.m104536a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m165508o();
        Comparable comparable = (Comparable) obj;
        int iM165505l = m165505l(comparable);
        if (iM165505l >= 0) {
            return m165506m(iM165505l);
        }
        if (this.f145204c.isEmpty()) {
            return null;
        }
        return this.f145204c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f145203b + this.f145204c.size();
    }
}
