package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hgf0<K, V> {

    /* JADX INFO: renamed from: d */
    @Nullable
    static Object[] f107591d;

    /* JADX INFO: renamed from: e */
    static int f107592e;

    /* JADX INFO: renamed from: f */
    @Nullable
    static Object[] f107593f;

    /* JADX INFO: renamed from: g */
    static int f107594g;

    /* JADX INFO: renamed from: a */
    int[] f107595a;

    /* JADX INFO: renamed from: b */
    Object[] f107596b;

    /* JADX INFO: renamed from: c */
    int f107597c;

    public hgf0(int i) {
        if (i == 0) {
            this.f107595a = p06.f146544a;
            this.f107596b = p06.f146546c;
        } else {
            m130815a(i);
        }
        this.f107597c = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m130815a(int i) {
        if (i == 8) {
            synchronized (hgf0.class) {
                try {
                    Object[] objArr = f107593f;
                    if (objArr != null) {
                        this.f107596b = objArr;
                        f107593f = (Object[]) objArr[0];
                        this.f107595a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f107594g--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (hgf0.class) {
                try {
                    Object[] objArr2 = f107591d;
                    if (objArr2 != null) {
                        this.f107596b = objArr2;
                        f107591d = (Object[]) objArr2[0];
                        this.f107595a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f107592e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f107595a = new int[i];
        this.f107596b = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    private static int m130816b(int[] iArr, int i, int i2) {
        try {
            return p06.m166911a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            ggf0.m125962a();
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m130817d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (hgf0.class) {
                try {
                    if (f107594g < 10) {
                        objArr[0] = f107593f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f107593f = objArr;
                        f107594g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (hgf0.class) {
                try {
                    if (f107592e < 10) {
                        objArr[0] = f107591d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f107591d = objArr;
                        f107592e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m130818c(int i) {
        int i2 = this.f107597c;
        int[] iArr = this.f107595a;
        if (iArr.length < i) {
            Object[] objArr = this.f107596b;
            m130815a(i);
            if (this.f107597c > 0) {
                System.arraycopy(iArr, 0, this.f107595a, 0, i2);
                System.arraycopy(objArr, 0, this.f107596b, 0, i2 << 1);
            }
            m130817d(iArr, objArr, i2);
        }
        if (this.f107597c == i2) {
            return;
        }
        ggf0.m125962a();
    }

    public void clear() {
        int i = this.f107597c;
        if (i > 0) {
            int[] iArr = this.f107595a;
            Object[] objArr = this.f107596b;
            this.f107595a = p06.f146544a;
            this.f107596b = p06.f146546c;
            this.f107597c = 0;
            m130817d(iArr, objArr, i);
        }
        if (this.f107597c <= 0) {
            return;
        }
        ggf0.m125962a();
    }

    public boolean containsKey(@Nullable Object obj) {
        return m130820f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m130822h(obj) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public int m130819e(Object obj, int i) {
        int i2 = this.f107597c;
        if (i2 == 0) {
            return -1;
        }
        int iM130816b = m130816b(this.f107595a, i2, i);
        if (iM130816b < 0 || obj.equals(this.f107596b[iM130816b << 1])) {
            return iM130816b;
        }
        int i3 = iM130816b + 1;
        while (i3 < i2 && this.f107595a[i3] == i) {
            if (obj.equals(this.f107596b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM130816b - 1; i4 >= 0 && this.f107595a[i4] == i; i4--) {
            if (obj.equals(this.f107596b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hgf0) {
            hgf0 hgf0Var = (hgf0) obj;
            if (size() != hgf0Var.size()) {
                return false;
            }
            for (int i = 0; i < this.f107597c; i++) {
                try {
                    K kM130823i = m130823i(i);
                    V vM130827m = m130827m(i);
                    Object obj2 = hgf0Var.get(kM130823i);
                    if (vM130827m == null) {
                        if (obj2 != null || !hgf0Var.containsKey(kM130823i)) {
                            return false;
                        }
                    } else if (!vM130827m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f107597c; i2++) {
                try {
                    K kM130823i2 = m130823i(i2);
                    V vM130827m2 = m130827m(i2);
                    Object obj3 = map.get(kM130823i2);
                    if (vM130827m2 == null) {
                        if (obj3 != null || !map.containsKey(kM130823i2)) {
                            return false;
                        }
                    } else if (!vM130827m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m130820f(@Nullable Object obj) {
        return obj == null ? m130821g() : m130819e(obj, obj.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public int m130821g() {
        int i = this.f107597c;
        if (i == 0) {
            return -1;
        }
        int iM130816b = m130816b(this.f107595a, i, 0);
        if (iM130816b < 0 || this.f107596b[iM130816b << 1] == null) {
            return iM130816b;
        }
        int i2 = iM130816b + 1;
        while (i2 < i && this.f107595a[i2] == 0) {
            if (this.f107596b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM130816b - 1; i3 >= 0 && this.f107595a[i3] == 0; i3--) {
            if (this.f107596b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v2) {
        int iM130820f = m130820f(obj);
        return iM130820f >= 0 ? (V) this.f107596b[(iM130820f << 1) + 1] : v2;
    }

    /* JADX INFO: renamed from: h */
    public int m130822h(Object obj) {
        int i = this.f107597c * 2;
        Object[] objArr = this.f107596b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f107595a;
        Object[] objArr = this.f107596b;
        int i = this.f107597c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public K m130823i(int i) {
        return (K) this.f107596b[i << 1];
    }

    public boolean isEmpty() {
        return this.f107597c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public void mo130824j(@NonNull hgf0<? extends K, ? extends V> hgf0Var) {
        int i = hgf0Var.f107597c;
        m130818c(this.f107597c + i);
        if (this.f107597c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(hgf0Var.m130823i(i2), hgf0Var.m130827m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(hgf0Var.f107595a, 0, this.f107595a, 0, i);
            System.arraycopy(hgf0Var.f107596b, 0, this.f107596b, 0, i << 1);
            this.f107597c = i;
        }
    }

    /* JADX INFO: renamed from: k */
    public V mo130825k(int i) {
        Object[] objArr = this.f107596b;
        int i2 = i << 1;
        V v2 = (V) objArr[i2 + 1];
        int i3 = this.f107597c;
        int[] iArr = this.f107595a;
        int i4 = 0;
        if (i3 <= 1) {
            m130817d(iArr, objArr, i3);
            this.f107595a = p06.f146544a;
            this.f107596b = p06.f146546c;
        } else {
            int i5 = i3 - 1;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f107596b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f107596b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m130815a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f107597c) {
                    ggf0.m125962a();
                    return null;
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f107595a, 0, i);
                    System.arraycopy(objArr, 0, this.f107596b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f107595a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f107596b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f107597c) {
            this.f107597c = i4;
            return v2;
        }
        ggf0.m125962a();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public V mo130826l(int i, V v2) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f107596b;
        V v3 = (V) objArr[i2];
        objArr[i2] = v2;
        return v3;
    }

    /* JADX INFO: renamed from: m */
    public V m130827m(int i) {
        return (V) this.f107596b[(i << 1) + 1];
    }

    @Nullable
    public V put(K k, V v2) {
        int i;
        int iM130819e;
        int i2 = this.f107597c;
        if (k == null) {
            iM130819e = m130821g();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iM130819e = m130819e(k, iHashCode);
        }
        if (iM130819e >= 0) {
            int i3 = (iM130819e << 1) + 1;
            Object[] objArr = this.f107596b;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
        int i4 = ~iM130819e;
        int[] iArr = this.f107595a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f107596b;
            m130815a(i5);
            if (i2 != this.f107597c) {
                ggf0.m125962a();
                return null;
            }
            int[] iArr2 = this.f107595a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f107596b, 0, objArr2.length);
            }
            m130817d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f107595a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f107596b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f107597c - i4) << 1);
        }
        int i7 = this.f107597c;
        if (i2 == i7) {
            int[] iArr4 = this.f107595a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f107596b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v2;
                this.f107597c = i7 + 1;
                return null;
            }
        }
        ggf0.m125962a();
        return null;
    }

    @Nullable
    public V putIfAbsent(K k, V v2) {
        V v3 = get(k);
        return v3 == null ? put(k, v2) : v3;
    }

    public boolean remove(Object obj, Object obj2) {
        int iM130820f = m130820f(obj);
        if (iM130820f < 0) {
            return false;
        }
        V vM130827m = m130827m(iM130820f);
        if (obj2 != vM130827m && (obj2 == null || !obj2.equals(vM130827m))) {
            return false;
        }
        mo130825k(iM130820f);
        return true;
    }

    public boolean replace(K k, V v2, V v3) {
        int iM130820f = m130820f(k);
        if (iM130820f < 0) {
            return false;
        }
        V vM130827m = m130827m(iM130820f);
        if (vM130827m != v2 && (v2 == null || !v2.equals(vM130827m))) {
            return false;
        }
        mo130826l(iM130820f, v3);
        return true;
    }

    public int size() {
        return this.f107597c;
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f107597c * 28);
        sb.append('{');
        for (int i = 0; i < this.f107597c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM130823i = m130823i(i);
            if (kM130823i != this) {
                sb.append(kM130823i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM130827m = m130827m(i);
            if (vM130827m != this) {
                sb.append(vM130827m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public hgf0() {
        this.f107595a = p06.f146544a;
        this.f107596b = p06.f146546c;
        this.f107597c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hgf0(hgf0<K, V> hgf0Var) {
        this();
        if (hgf0Var != 0) {
            mo130824j(hgf0Var);
        }
    }

    @Nullable
    public V remove(Object obj) {
        int iM130820f = m130820f(obj);
        if (iM130820f >= 0) {
            return mo130825k(iM130820f);
        }
        return null;
    }

    @Nullable
    public V replace(K k, V v2) {
        int iM130820f = m130820f(k);
        if (iM130820f >= 0) {
            return mo130826l(iM130820f, v2);
        }
        return null;
    }
}
