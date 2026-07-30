package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class oof0<K, V> {

    /* JADX INFO: renamed from: d */
    @Nullable
    static Object[] f148353d;

    /* JADX INFO: renamed from: e */
    static int f148354e;

    /* JADX INFO: renamed from: f */
    @Nullable
    static Object[] f148355f;

    /* JADX INFO: renamed from: g */
    static int f148356g;

    /* JADX INFO: renamed from: a */
    int[] f148357a;

    /* JADX INFO: renamed from: b */
    Object[] f148358b;

    /* JADX INFO: renamed from: c */
    int f148359c;

    public oof0(int i) {
        if (i == 0) {
            this.f148357a = u16.f176970a;
            this.f148358b = u16.f176972c;
        } else {
            m168574a(i);
        }
        this.f148359c = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m168574a(int i) {
        if (i == 8) {
            synchronized (oof0.class) {
                try {
                    Object[] objArr = f148355f;
                    if (objArr != null) {
                        this.f148358b = objArr;
                        f148355f = (Object[]) objArr[0];
                        this.f148357a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f148356g--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (oof0.class) {
                try {
                    Object[] objArr2 = f148353d;
                    if (objArr2 != null) {
                        this.f148358b = objArr2;
                        f148353d = (Object[]) objArr2[0];
                        this.f148357a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f148354e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f148357a = new int[i];
        this.f148358b = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    private static int m168575b(int[] iArr, int i, int i2) {
        try {
            return u16.m193896a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            nof0.m164126a();
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m168576d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (oof0.class) {
                try {
                    if (f148356g < 10) {
                        objArr[0] = f148355f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f148355f = objArr;
                        f148356g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (oof0.class) {
                try {
                    if (f148354e < 10) {
                        objArr[0] = f148353d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f148353d = objArr;
                        f148354e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m168577c(int i) {
        int i2 = this.f148359c;
        int[] iArr = this.f148357a;
        if (iArr.length < i) {
            Object[] objArr = this.f148358b;
            m168574a(i);
            if (this.f148359c > 0) {
                System.arraycopy(iArr, 0, this.f148357a, 0, i2);
                System.arraycopy(objArr, 0, this.f148358b, 0, i2 << 1);
            }
            m168576d(iArr, objArr, i2);
        }
        if (this.f148359c == i2) {
            return;
        }
        nof0.m164126a();
    }

    public void clear() {
        int i = this.f148359c;
        if (i > 0) {
            int[] iArr = this.f148357a;
            Object[] objArr = this.f148358b;
            this.f148357a = u16.f176970a;
            this.f148358b = u16.f176972c;
            this.f148359c = 0;
            m168576d(iArr, objArr, i);
        }
        if (this.f148359c <= 0) {
            return;
        }
        nof0.m164126a();
    }

    public boolean containsKey(@Nullable Object obj) {
        return m168579f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m168581h(obj) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public int m168578e(Object obj, int i) {
        int i2 = this.f148359c;
        if (i2 == 0) {
            return -1;
        }
        int iM168575b = m168575b(this.f148357a, i2, i);
        if (iM168575b < 0 || obj.equals(this.f148358b[iM168575b << 1])) {
            return iM168575b;
        }
        int i3 = iM168575b + 1;
        while (i3 < i2 && this.f148357a[i3] == i) {
            if (obj.equals(this.f148358b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM168575b - 1; i4 >= 0 && this.f148357a[i4] == i; i4--) {
            if (obj.equals(this.f148358b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oof0) {
            oof0 oof0Var = (oof0) obj;
            if (size() != oof0Var.size()) {
                return false;
            }
            for (int i = 0; i < this.f148359c; i++) {
                try {
                    K kM168582i = m168582i(i);
                    V vM168583m = m168583m(i);
                    Object obj2 = oof0Var.get(kM168582i);
                    if (vM168583m == null) {
                        if (obj2 != null || !oof0Var.containsKey(kM168582i)) {
                            return false;
                        }
                    } else if (!vM168583m.equals(obj2)) {
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
            for (int i2 = 0; i2 < this.f148359c; i2++) {
                try {
                    K kM168582i2 = m168582i(i2);
                    V vM168583m2 = m168583m(i2);
                    Object obj3 = map.get(kM168582i2);
                    if (vM168583m2 == null) {
                        if (obj3 != null || !map.containsKey(kM168582i2)) {
                            return false;
                        }
                    } else if (!vM168583m2.equals(obj3)) {
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
    public int m168579f(@Nullable Object obj) {
        return obj == null ? m168580g() : m168578e(obj, obj.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public int m168580g() {
        int i = this.f148359c;
        if (i == 0) {
            return -1;
        }
        int iM168575b = m168575b(this.f148357a, i, 0);
        if (iM168575b < 0 || this.f148358b[iM168575b << 1] == null) {
            return iM168575b;
        }
        int i2 = iM168575b + 1;
        while (i2 < i && this.f148357a[i2] == 0) {
            if (this.f148358b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM168575b - 1; i3 >= 0 && this.f148357a[i3] == 0; i3--) {
            if (this.f148358b[i3 << 1] == null) {
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
        int iM168579f = m168579f(obj);
        return iM168579f >= 0 ? (V) this.f148358b[(iM168579f << 1) + 1] : v2;
    }

    /* JADX INFO: renamed from: h */
    public int m168581h(Object obj) {
        int i = this.f148359c * 2;
        Object[] objArr = this.f148358b;
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
        int[] iArr = this.f148357a;
        Object[] objArr = this.f148358b;
        int i = this.f148359c;
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
    public K m168582i(int i) {
        return (K) this.f148358b[i << 1];
    }

    public boolean isEmpty() {
        return this.f148359c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public void mo147462j(@NonNull oof0<? extends K, ? extends V> oof0Var) {
        int i = oof0Var.f148359c;
        m168577c(this.f148359c + i);
        if (this.f148359c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(oof0Var.m168582i(i2), oof0Var.m168583m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(oof0Var.f148357a, 0, this.f148357a, 0, i);
            System.arraycopy(oof0Var.f148358b, 0, this.f148358b, 0, i << 1);
            this.f148359c = i;
        }
    }

    /* JADX INFO: renamed from: k */
    public V mo147463k(int i) {
        Object[] objArr = this.f148358b;
        int i2 = i << 1;
        V v2 = (V) objArr[i2 + 1];
        int i3 = this.f148359c;
        int[] iArr = this.f148357a;
        int i4 = 0;
        if (i3 <= 1) {
            m168576d(iArr, objArr, i3);
            this.f148357a = u16.f176970a;
            this.f148358b = u16.f176972c;
        } else {
            int i5 = i3 - 1;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f148358b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f148358b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m168574a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f148359c) {
                    nof0.m164126a();
                    return null;
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f148357a, 0, i);
                    System.arraycopy(objArr, 0, this.f148358b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f148357a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f148358b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f148359c) {
            this.f148359c = i4;
            return v2;
        }
        nof0.m164126a();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public V mo147464l(int i, V v2) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f148358b;
        V v3 = (V) objArr[i2];
        objArr[i2] = v2;
        return v3;
    }

    /* JADX INFO: renamed from: m */
    public V m168583m(int i) {
        return (V) this.f148358b[(i << 1) + 1];
    }

    @Nullable
    public V put(K k, V v2) {
        int i;
        int iM168578e;
        int i2 = this.f148359c;
        if (k == null) {
            iM168578e = m168580g();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iM168578e = m168578e(k, iHashCode);
        }
        if (iM168578e >= 0) {
            int i3 = (iM168578e << 1) + 1;
            Object[] objArr = this.f148358b;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
        int i4 = ~iM168578e;
        int[] iArr = this.f148357a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f148358b;
            m168574a(i5);
            if (i2 != this.f148359c) {
                nof0.m164126a();
                return null;
            }
            int[] iArr2 = this.f148357a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f148358b, 0, objArr2.length);
            }
            m168576d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f148357a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f148358b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f148359c - i4) << 1);
        }
        int i7 = this.f148359c;
        if (i2 == i7) {
            int[] iArr4 = this.f148357a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f148358b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v2;
                this.f148359c = i7 + 1;
                return null;
            }
        }
        nof0.m164126a();
        return null;
    }

    @Nullable
    public V putIfAbsent(K k, V v2) {
        V v3 = get(k);
        return v3 == null ? put(k, v2) : v3;
    }

    public boolean remove(Object obj, Object obj2) {
        int iM168579f = m168579f(obj);
        if (iM168579f < 0) {
            return false;
        }
        V vM168583m = m168583m(iM168579f);
        if (obj2 != vM168583m && (obj2 == null || !obj2.equals(vM168583m))) {
            return false;
        }
        mo147463k(iM168579f);
        return true;
    }

    public boolean replace(K k, V v2, V v3) {
        int iM168579f = m168579f(k);
        if (iM168579f < 0) {
            return false;
        }
        V vM168583m = m168583m(iM168579f);
        if (vM168583m != v2 && (v2 == null || !v2.equals(vM168583m))) {
            return false;
        }
        mo147464l(iM168579f, v3);
        return true;
    }

    public int size() {
        return this.f148359c;
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb = new StringBuilder(this.f148359c * 28);
        sb.append('{');
        for (int i = 0; i < this.f148359c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM168582i = m168582i(i);
            if (kM168582i != this) {
                sb.append(kM168582i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM168583m = m168583m(i);
            if (vM168583m != this) {
                sb.append(vM168583m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public oof0() {
        this.f148357a = u16.f176970a;
        this.f148358b = u16.f176972c;
        this.f148359c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oof0(oof0<K, V> oof0Var) {
        this();
        if (oof0Var != 0) {
            mo147462j(oof0Var);
        }
    }

    @Nullable
    public V remove(Object obj) {
        int iM168579f = m168579f(obj);
        if (iM168579f >= 0) {
            return mo147463k(iM168579f);
        }
        return null;
    }

    @Nullable
    public V replace(K k, V v2) {
        int iM168579f = m168579f(k);
        if (iM168579f >= 0) {
            return mo147464l(iM168579f, v2);
        }
        return null;
    }
}
