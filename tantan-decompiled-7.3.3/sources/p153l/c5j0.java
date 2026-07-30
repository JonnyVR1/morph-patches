package p153l;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c5j0<T> {

    /* JADX INFO: renamed from: a */
    public final int f79867a;

    /* JADX INFO: renamed from: b */
    public final Comparator<? super T> f79868b;

    /* JADX INFO: renamed from: c */
    public final T[] f79869c;

    /* JADX INFO: renamed from: d */
    public int f79870d;

    /* JADX INFO: renamed from: e */
    public T f79871e;

    public c5j0(Comparator<? super T> comparator, int i) {
        this.f79868b = (Comparator) xn80.m212112q(comparator, "comparator");
        this.f79867a = i;
        xn80.m212101f(i >= 0, "k (%s) must be >= 0", i);
        xn80.m212101f(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f79869c = (T[]) new Object[nym.m165341b(i, 2)];
        this.f79870d = 0;
        this.f79871e = null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> c5j0<T> m108056a(int i, Comparator<? super T> comparator) {
        return new c5j0<>(comparator, i);
    }

    /* JADX INFO: renamed from: b */
    public void m108057b(T t) {
        int i = this.f79867a;
        if (i == 0) {
            return;
        }
        int i2 = this.f79870d;
        if (i2 == 0) {
            this.f79869c[0] = t;
            this.f79871e = t;
            this.f79870d = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.f79869c;
            this.f79870d = i2 + 1;
            tArr[i2] = t;
            if (this.f79868b.compare(t, (Object) k350.m147997a(this.f79871e)) > 0) {
                this.f79871e = t;
                return;
            }
            return;
        }
        if (this.f79868b.compare(t, (Object) k350.m147997a(this.f79871e)) < 0) {
            T[] tArr2 = this.f79869c;
            int i3 = this.f79870d;
            int i4 = i3 + 1;
            this.f79870d = i4;
            tArr2[i3] = t;
            if (i4 == this.f79867a * 2) {
                m108062g();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m108058c(Iterator<? extends T> it) {
        while (it.hasNext()) {
            m108057b(it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m108059d(int i, int i2, int i3) {
        Object objM147997a = k350.m147997a(this.f79869c[i3]);
        T[] tArr = this.f79869c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f79868b.compare((Object) k350.m147997a(this.f79869c[i]), objM147997a) < 0) {
                m108060e(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f79869c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = objM147997a;
        return i4;
    }

    /* JADX INFO: renamed from: e */
    public final void m108060e(int i, int i2) {
        T[] tArr = this.f79869c;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    /* JADX INFO: renamed from: f */
    public List<T> m108061f() {
        Arrays.sort(this.f79869c, 0, this.f79870d, this.f79868b);
        int i = this.f79870d;
        int i2 = this.f79867a;
        if (i > i2) {
            T[] tArr = this.f79869c;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.f79867a;
            this.f79870d = i3;
            this.f79871e = this.f79869c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f79869c, this.f79870d)));
    }

    /* JADX INFO: renamed from: g */
    public final void m108062g() {
        int i = (this.f79867a * 2) - 1;
        int iM165345f = nym.m165345f(i, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        while (iMax < i) {
            int iM108059d = m108059d(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.f79867a;
            if (iM108059d <= i4) {
                if (iM108059d >= i4) {
                    break;
                }
                iMax = Math.max(iM108059d, iMax + 1);
                i3 = iM108059d;
            } else {
                i = iM108059d - 1;
            }
            i2++;
            if (i2 >= iM165345f) {
                Arrays.sort(this.f79869c, iMax, i + 1, this.f79868b);
                break;
            }
        }
        this.f79870d = this.f79867a;
        this.f79871e = (T) k350.m147997a(this.f79869c[i3]);
        while (true) {
            i3++;
            if (i3 >= this.f79867a) {
                return;
            }
            if (this.f79868b.compare((Object) k350.m147997a(this.f79869c[i3]), (Object) k350.m147997a(this.f79871e)) > 0) {
                this.f79871e = this.f79869c[i3];
            }
        }
    }
}
