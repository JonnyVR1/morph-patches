package p149l;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class yvi0<T> {

    /* JADX INFO: renamed from: a */
    public final int f200260a;

    /* JADX INFO: renamed from: b */
    public final Comparator<? super T> f200261b;

    /* JADX INFO: renamed from: c */
    public final T[] f200262c;

    /* JADX INFO: renamed from: d */
    public int f200263d;

    /* JADX INFO: renamed from: e */
    public T f200264e;

    public yvi0(Comparator<? super T> comparator, int i) {
        this.f200261b = (Comparator) sf80.m183895q(comparator, "comparator");
        this.f200260a = i;
        sf80.m183884f(i >= 0, "k (%s) must be >= 0", i);
        sf80.m183884f(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f200262c = (T[]) new Object[mwm.m156751b(i, 2)];
        this.f200263d = 0;
        this.f200264e = null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> yvi0<T> m216217a(int i, Comparator<? super T> comparator) {
        return new yvi0<>(comparator, i);
    }

    /* JADX INFO: renamed from: b */
    public void m216218b(T t) {
        int i = this.f200260a;
        if (i == 0) {
            return;
        }
        int i2 = this.f200263d;
        if (i2 == 0) {
            this.f200262c[0] = t;
            this.f200264e = t;
            this.f200263d = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.f200262c;
            this.f200263d = i2 + 1;
            tArr[i2] = t;
            if (this.f200261b.compare(t, (Object) vu40.m200060a(this.f200264e)) > 0) {
                this.f200264e = t;
                return;
            }
            return;
        }
        if (this.f200261b.compare(t, (Object) vu40.m200060a(this.f200264e)) < 0) {
            T[] tArr2 = this.f200262c;
            int i3 = this.f200263d;
            int i4 = i3 + 1;
            this.f200263d = i4;
            tArr2[i3] = t;
            if (i4 == this.f200260a * 2) {
                m216223g();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m216219c(Iterator<? extends T> it) {
        while (it.hasNext()) {
            m216218b(it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m216220d(int i, int i2, int i3) {
        Object objM200060a = vu40.m200060a(this.f200262c[i3]);
        T[] tArr = this.f200262c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f200261b.compare((Object) vu40.m200060a(this.f200262c[i]), objM200060a) < 0) {
                m216221e(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f200262c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = objM200060a;
        return i4;
    }

    /* JADX INFO: renamed from: e */
    public final void m216221e(int i, int i2) {
        T[] tArr = this.f200262c;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    /* JADX INFO: renamed from: f */
    public List<T> m216222f() {
        Arrays.sort(this.f200262c, 0, this.f200263d, this.f200261b);
        int i = this.f200263d;
        int i2 = this.f200260a;
        if (i > i2) {
            T[] tArr = this.f200262c;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.f200260a;
            this.f200263d = i3;
            this.f200264e = this.f200262c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f200262c, this.f200263d)));
    }

    /* JADX INFO: renamed from: g */
    public final void m216223g() {
        int i = (this.f200260a * 2) - 1;
        int iM156755f = mwm.m156755f(i, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        while (iMax < i) {
            int iM216220d = m216220d(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.f200260a;
            if (iM216220d <= i4) {
                if (iM216220d >= i4) {
                    break;
                }
                iMax = Math.max(iM216220d, iMax + 1);
                i3 = iM216220d;
            } else {
                i = iM216220d - 1;
            }
            i2++;
            if (i2 >= iM156755f) {
                Arrays.sort(this.f200262c, iMax, i + 1, this.f200261b);
                break;
            }
        }
        this.f200263d = this.f200260a;
        this.f200264e = (T) vu40.m200060a(this.f200262c[i3]);
        while (true) {
            i3++;
            if (i3 >= this.f200260a) {
                return;
            }
            if (this.f200261b.compare((Object) vu40.m200060a(this.f200262c[i3]), (Object) vu40.m200060a(this.f200264e)) > 0) {
                this.f200264e = this.f200262c[i3];
            }
        }
    }
}
