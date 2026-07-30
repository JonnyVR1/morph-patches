package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p01<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e */
    public static final int[] f149990e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f149991f = new Object[0];

    /* JADX INFO: renamed from: g */
    @Nullable
    public static Object[] f149992g;

    /* JADX INFO: renamed from: h */
    public static int f149993h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static Object[] f149994i;

    /* JADX INFO: renamed from: j */
    public static int f149995j;

    /* JADX INFO: renamed from: a */
    public int[] f149996a;

    /* JADX INFO: renamed from: b */
    public Object[] f149997b;

    /* JADX INFO: renamed from: c */
    public int f149998c;

    /* JADX INFO: renamed from: d */
    public yww<E, E> f149999d;

    /* JADX INFO: renamed from: l.p01$a */
    public class C19262a extends yww<E, E> {
        public C19262a() {
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: a */
        public void mo152244a() {
            p01.this.clear();
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: b */
        public Object mo152245b(int i, int i2) {
            return p01.this.f149997b[i];
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: c */
        public Map<E, E> mo152246c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: d */
        public int mo152247d() {
            return p01.this.f149998c;
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: e */
        public int mo152248e(Object obj) {
            return p01.this.indexOf(obj);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: f */
        public int mo152249f(Object obj) {
            return p01.this.indexOf(obj);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: g */
        public void mo152250g(E e, E e2) {
            p01.this.add(e);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: h */
        public void mo152251h(int i) {
            p01.this.m170018j(i);
        }

        @Override // p153l.yww
        /* JADX INFO: renamed from: i */
        public E mo152252i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public p01(int i) {
        if (i == 0) {
            this.f149996a = f149990e;
            this.f149997b = f149991f;
        } else {
            m170013a(i);
        }
        this.f149998c = 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m170012f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (p01.class) {
                try {
                    if (f149995j < 10) {
                        objArr[0] = f149994i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f149994i = objArr;
                        f149995j++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (p01.class) {
                try {
                    if (f149993h < 10) {
                        objArr[0] = f149992g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f149992g = objArr;
                        f149993h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m170013a(int i) {
        if (i == 8) {
            synchronized (p01.class) {
                try {
                    Object[] objArr = f149994i;
                    if (objArr != null) {
                        this.f149997b = objArr;
                        f149994i = (Object[]) objArr[0];
                        this.f149996a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f149995j--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (p01.class) {
                try {
                    Object[] objArr2 = f149992g;
                    if (objArr2 != null) {
                        this.f149997b = objArr2;
                        f149992g = (Object[]) objArr2[0];
                        this.f149996a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f149993h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f149996a = new int[i];
        this.f149997b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e) {
        int i;
        int iM170016h;
        if (e == null) {
            iM170016h = m170017i();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM170016h = m170016h(e, iHashCode);
        }
        if (iM170016h >= 0) {
            return false;
        }
        int i2 = ~iM170016h;
        int i3 = this.f149998c;
        int[] iArr = this.f149996a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f149997b;
            m170013a(i4);
            int[] iArr2 = this.f149996a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f149997b, 0, objArr.length);
            }
            m170012f(iArr, objArr, this.f149998c);
        }
        int i5 = this.f149998c;
        if (i2 < i5) {
            int[] iArr3 = this.f149996a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f149997b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f149998c - i2);
        }
        this.f149996a[i2] = i;
        this.f149997b[i2] = e;
        this.f149998c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        m170014c(this.f149998c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public void m170014c(int i) {
        int[] iArr = this.f149996a;
        if (iArr.length < i) {
            Object[] objArr = this.f149997b;
            m170013a(i);
            int i2 = this.f149998c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f149996a, 0, i2);
                System.arraycopy(objArr, 0, this.f149997b, 0, this.f149998c);
            }
            m170012f(iArr, objArr, this.f149998c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f149998c;
        if (i != 0) {
            m170012f(this.f149996a, this.f149997b, i);
            this.f149996a = f149990e;
            this.f149997b = f149991f;
            this.f149998c = 0;
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
            for (int i = 0; i < this.f149998c; i++) {
                try {
                    if (!set.contains(m170019l(i))) {
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
    public final yww<E, E> m170015g() {
        if (this.f149999d == null) {
            this.f149999d = new C19262a();
        }
        return this.f149999d;
    }

    /* JADX INFO: renamed from: h */
    public final int m170016h(Object obj, int i) {
        int i2 = this.f149998c;
        if (i2 == 0) {
            return -1;
        }
        int iM193896a = u16.m193896a(this.f149996a, i2, i);
        if (iM193896a < 0 || obj.equals(this.f149997b[iM193896a])) {
            return iM193896a;
        }
        int i3 = iM193896a + 1;
        while (i3 < i2 && this.f149996a[i3] == i) {
            if (obj.equals(this.f149997b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM193896a - 1; i4 >= 0 && this.f149996a[i4] == i; i4--) {
            if (obj.equals(this.f149997b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f149996a;
        int i = this.f149998c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public final int m170017i() {
        int i = this.f149998c;
        if (i == 0) {
            return -1;
        }
        int iM193896a = u16.m193896a(this.f149996a, i, 0);
        if (iM193896a < 0 || this.f149997b[iM193896a] == null) {
            return iM193896a;
        }
        int i2 = iM193896a + 1;
        while (i2 < i && this.f149996a[i2] == 0) {
            if (this.f149997b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM193896a - 1; i3 >= 0 && this.f149996a[i3] == 0; i3--) {
            if (this.f149997b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? m170017i() : m170016h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f149998c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m170015g().m217659m().iterator();
    }

    /* JADX INFO: renamed from: j */
    public E m170018j(int i) {
        Object[] objArr = this.f149997b;
        E e = (E) objArr[i];
        int i2 = this.f149998c;
        int[] iArr = this.f149996a;
        if (i2 <= 1) {
            m170012f(iArr, objArr, i2);
            this.f149996a = f149990e;
            this.f149997b = f149991f;
            this.f149998c = 0;
            return e;
        }
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f149998c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f149997b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f149998c - i);
            }
            this.f149997b[this.f149998c] = null;
            return e;
        }
        m170013a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f149998c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f149996a, 0, i);
            System.arraycopy(objArr, 0, this.f149997b, 0, i);
        }
        int i5 = this.f149998c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f149996a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f149997b, i, this.f149998c - i);
        }
        return e;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public E m170019l(int i) {
        return (E) this.f149997b[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m170018j(iIndexOf);
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
        for (int i = this.f149998c - 1; i >= 0; i--) {
            if (!collection.contains(this.f149997b[i])) {
                m170018j(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f149998c;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f149998c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f149998c));
        }
        System.arraycopy(this.f149997b, 0, tArr, 0, this.f149998c);
        int length = tArr.length;
        int i = this.f149998c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f149998c * 14);
        sb.append('{');
        for (int i = 0; i < this.f149998c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eM170019l = m170019l(i);
            if (eM170019l != this) {
                sb.append(eM170019l);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public p01() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i = this.f149998c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f149997b, 0, objArr, 0, i);
        return objArr;
    }
}
