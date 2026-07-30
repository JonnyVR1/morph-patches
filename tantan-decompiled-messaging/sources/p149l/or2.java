package p149l;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class or2 implements o8f {

    /* JADX INFO: renamed from: a */
    public final z5j0 f145213a;

    /* JADX INFO: renamed from: b */
    public final int f145214b;

    /* JADX INFO: renamed from: c */
    public final int[] f145215c;

    /* JADX INFO: renamed from: d */
    public final int f145216d;

    /* JADX INFO: renamed from: e */
    public final C1871k[] f145217e;

    /* JADX INFO: renamed from: f */
    public final long[] f145218f;

    /* JADX INFO: renamed from: g */
    public int f145219g;

    public or2(z5j0 z5j0Var, int[] iArr, int i) {
        C1871k[] c1871kArr;
        int i2 = 0;
        p11.m167013g(iArr.length > 0);
        this.f145216d = i;
        this.f145213a = (z5j0) p11.m167011e(z5j0Var);
        int length = iArr.length;
        this.f145214b = length;
        this.f145217e = new C1871k[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            c1871kArr = this.f145217e;
            if (i3 >= length2) {
                break;
            }
            c1871kArr[i3] = z5j0Var.m217358c(iArr[i3]);
            i3++;
        }
        Arrays.sort(c1871kArr, new Comparator() { // from class: l.nr2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return or2.m165510t((C1871k) obj, (C1871k) obj2);
            }
        });
        this.f145215c = new int[this.f145214b];
        while (true) {
            int i4 = this.f145214b;
            if (i2 >= i4) {
                this.f145218f = new long[i4];
                return;
            } else {
                this.f145215c[i2] = z5j0Var.m217359d(this.f145217e[i2]);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m165510t(C1871k c1871k, C1871k c1871k2) {
        return c1871k2.f7744h - c1871k.f7744h;
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: a */
    public boolean mo11300a(int i, long j) {
        return this.f145218f[i] > j;
    }

    @Override // p149l.r6j0
    /* JADX INFO: renamed from: c */
    public final int mo11302c(int i) {
        return this.f145215c[i];
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: d */
    public boolean mo11303d(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo11300a = mo11300a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f145214b && !zMo11300a) {
            zMo11300a = (i2 == i || mo11300a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo11300a) {
            return false;
        }
        long[] jArr = this.f145218f;
        jArr[i] = Math.max(jArr[i], vck0.m197842b(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            or2 or2Var = (or2) obj;
            if (this.f145213a == or2Var.f145213a && Arrays.equals(this.f145215c, or2Var.f145215c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.r6j0
    /* JADX INFO: renamed from: f */
    public final int mo11305f(int i) {
        for (int i2 = 0; i2 < this.f145214b; i2++) {
            if (this.f145215c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p149l.r6j0
    /* JADX INFO: renamed from: h */
    public final z5j0 mo11307h() {
        return this.f145213a;
    }

    public int hashCode() {
        if (this.f145219g == 0) {
            this.f145219g = (System.identityHashCode(this.f145213a) * 31) + Arrays.hashCode(this.f145215c);
        }
        return this.f145219g;
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: i */
    public int mo11308i(long j, List<? extends fix> list) {
        return list.size();
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: j */
    public final int mo11309j() {
        return this.f145215c[mo11301b()];
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: k */
    public final C1871k mo11310k() {
        return this.f145217e[mo11301b()];
    }

    @Override // p149l.r6j0
    public final int length() {
        return this.f145215c.length;
    }

    @Override // p149l.r6j0
    /* JADX INFO: renamed from: m */
    public final C1871k mo11312m(int i) {
        return this.f145217e[i];
    }

    @Override // p149l.r6j0
    /* JADX INFO: renamed from: r */
    public final int mo11317r(C1871k c1871k) {
        for (int i = 0; i < this.f145214b; i++) {
            if (this.f145217e[i] == c1871k) {
                return i;
            }
        }
        return -1;
    }

    @Override // p149l.o8f
    public void disable() {
    }

    @Override // p149l.o8f
    public void enable() {
    }

    @Override // p149l.o8f
    /* JADX INFO: renamed from: n */
    public void mo11313n(float f) {
    }

    public or2(z5j0 z5j0Var, int... iArr) {
        this(z5j0Var, iArr, 0);
    }
}
