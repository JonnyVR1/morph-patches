package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i01<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e */
    public static final int[] f110243e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f110244f = new Object[0];

    /* JADX INFO: renamed from: g */
    @Nullable
    public static Object[] f110245g;

    /* JADX INFO: renamed from: h */
    public static int f110246h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static Object[] f110247i;

    /* JADX INFO: renamed from: j */
    public static int f110248j;

    /* JADX INFO: renamed from: a */
    public int[] f110249a;

    /* JADX INFO: renamed from: b */
    public Object[] f110250b;

    /* JADX INFO: renamed from: c */
    public int f110251c;

    /* JADX INFO: renamed from: d */
    public ztw<E, E> f110252d;

    /* JADX INFO: renamed from: l.i01$a */
    public class C17442a extends ztw<E, E> {
        public C17442a() {
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: a */
        public void mo114144a() {
            i01.this.clear();
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: b */
        public Object mo114145b(int i, int i2) {
            return i01.this.f110250b[i];
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: c */
        public Map<E, E> mo114146c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: d */
        public int mo114147d() {
            return i01.this.f110251c;
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: e */
        public int mo114148e(Object obj) {
            return i01.this.indexOf(obj);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: f */
        public int mo114149f(Object obj) {
            return i01.this.indexOf(obj);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: g */
        public void mo114150g(E e, E e2) {
            i01.this.add(e);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: h */
        public void mo114151h(int i) {
            i01.this.m133740j(i);
        }

        @Override // p149l.ztw
        /* JADX INFO: renamed from: i */
        public E mo114152i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public i01(int i) {
        if (i == 0) {
            this.f110249a = f110243e;
            this.f110250b = f110244f;
        } else {
            m133735a(i);
        }
        this.f110251c = 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m133734f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (i01.class) {
                try {
                    if (f110248j < 10) {
                        objArr[0] = f110247i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f110247i = objArr;
                        f110248j++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i01.class) {
                try {
                    if (f110246h < 10) {
                        objArr[0] = f110245g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f110245g = objArr;
                        f110246h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m133735a(int i) {
        if (i == 8) {
            synchronized (i01.class) {
                try {
                    Object[] objArr = f110247i;
                    if (objArr != null) {
                        this.f110250b = objArr;
                        f110247i = (Object[]) objArr[0];
                        this.f110249a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f110248j--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (i01.class) {
                try {
                    Object[] objArr2 = f110245g;
                    if (objArr2 != null) {
                        this.f110250b = objArr2;
                        f110245g = (Object[]) objArr2[0];
                        this.f110249a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f110246h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f110249a = new int[i];
        this.f110250b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e) {
        int i;
        int iM133738h;
        if (e == null) {
            iM133738h = m133739i();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM133738h = m133738h(e, iHashCode);
        }
        if (iM133738h >= 0) {
            return false;
        }
        int i2 = ~iM133738h;
        int i3 = this.f110251c;
        int[] iArr = this.f110249a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f110250b;
            m133735a(i4);
            int[] iArr2 = this.f110249a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f110250b, 0, objArr.length);
            }
            m133734f(iArr, objArr, this.f110251c);
        }
        int i5 = this.f110251c;
        if (i2 < i5) {
            int[] iArr3 = this.f110249a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f110250b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f110251c - i2);
        }
        this.f110249a[i2] = i;
        this.f110250b[i2] = e;
        this.f110251c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        m133736c(this.f110251c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public void m133736c(int i) {
        int[] iArr = this.f110249a;
        if (iArr.length < i) {
            Object[] objArr = this.f110250b;
            m133735a(i);
            int i2 = this.f110251c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f110249a, 0, i2);
                System.arraycopy(objArr, 0, this.f110250b, 0, this.f110251c);
            }
            m133734f(iArr, objArr, this.f110251c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f110251c;
        if (i != 0) {
            m133734f(this.f110249a, this.f110250b, i);
            this.f110249a = f110243e;
            this.f110250b = f110244f;
            this.f110251c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f110251c; i++) {
                try {
                    if (!set.contains(m133741l(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final ztw<E, E> m133737g() {
        if (this.f110252d == null) {
            this.f110252d = new C17442a();
        }
        return this.f110252d;
    }

    /* JADX INFO: renamed from: h */
    public final int m133738h(Object obj, int i) {
        int i2 = this.f110251c;
        if (i2 == 0) {
            return -1;
        }
        int iM166911a = p06.m166911a(this.f110249a, i2, i);
        if (iM166911a < 0 || obj.equals(this.f110250b[iM166911a])) {
            return iM166911a;
        }
        int i3 = iM166911a + 1;
        while (i3 < i2 && this.f110249a[i3] == i) {
            if (obj.equals(this.f110250b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM166911a - 1; i4 >= 0 && this.f110249a[i4] == i; i4--) {
            if (obj.equals(this.f110250b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f110249a;
        int i = this.f110251c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public final int m133739i() {
        int i = this.f110251c;
        if (i == 0) {
            return -1;
        }
        int iM166911a = p06.m166911a(this.f110249a, i, 0);
        if (iM166911a < 0 || this.f110250b[iM166911a] == null) {
            return iM166911a;
        }
        int i2 = iM166911a + 1;
        while (i2 < i && this.f110249a[i2] == 0) {
            if (this.f110250b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM166911a - 1; i3 >= 0 && this.f110249a[i3] == 0; i3--) {
            if (this.f110250b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? m133739i() : m133738h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f110251c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m133737g().m220148m().iterator();
    }

    /* JADX INFO: renamed from: j */
    public E m133740j(int i) {
        Object[] objArr = this.f110250b;
        E e = (E) objArr[i];
        int i2 = this.f110251c;
        int[] iArr = this.f110249a;
        if (i2 <= 1) {
            m133734f(iArr, objArr, i2);
            this.f110249a = f110243e;
            this.f110250b = f110244f;
            this.f110251c = 0;
            return e;
        }
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f110251c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f110250b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f110251c - i);
            }
            this.f110250b[this.f110251c] = null;
            return e;
        }
        m133735a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f110251c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f110249a, 0, i);
            System.arraycopy(objArr, 0, this.f110250b, 0, i);
        }
        int i5 = this.f110251c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f110249a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f110250b, i, this.f110251c - i);
        }
        return e;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public E m133741l(int i) {
        return (E) this.f110250b[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m133740j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.f110251c - 1; i >= 0; i--) {
            if (!collection.contains(this.f110250b[i])) {
                m133740j(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f110251c;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f110251c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f110251c));
        }
        System.arraycopy(this.f110250b, 0, tArr, 0, this.f110251c);
        int length = tArr.length;
        int i = this.f110251c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f110251c * 14);
        sb.append('{');
        for (int i = 0; i < this.f110251c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eM133741l = m133741l(i);
            if (eM133741l != this) {
                sb.append(eM133741l);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i01() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i = this.f110251c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f110250b, 0, objArr, 0, i);
        return objArr;
    }
}
