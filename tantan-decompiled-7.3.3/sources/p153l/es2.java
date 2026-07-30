package p153l;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class es2 implements u9f {

    /* JADX INFO: renamed from: a */
    public final dfj0 f95555a;

    /* JADX INFO: renamed from: b */
    public final int f95556b;

    /* JADX INFO: renamed from: c */
    public final int[] f95557c;

    /* JADX INFO: renamed from: d */
    public final int f95558d;

    /* JADX INFO: renamed from: e */
    public final C1894k[] f95559e;

    /* JADX INFO: renamed from: f */
    public final long[] f95560f;

    /* JADX INFO: renamed from: g */
    public int f95561g;

    public es2(dfj0 dfj0Var, int[] iArr, int i) {
        C1894k[] c1894kArr;
        int i2 = 0;
        w11.m204371g(iArr.length > 0);
        this.f95558d = i;
        this.f95555a = (dfj0) w11.m204369e(dfj0Var);
        int length = iArr.length;
        this.f95556b = length;
        this.f95559e = new C1894k[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            c1894kArr = this.f95559e;
            if (i3 >= length2) {
                break;
            }
            c1894kArr[i3] = dfj0Var.m115519c(iArr[i3]);
            i3++;
        }
        Arrays.sort(c1894kArr, new Comparator() { // from class: l.ds2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return es2.m122303t((C1894k) obj, (C1894k) obj2);
            }
        });
        this.f95557c = new int[this.f95556b];
        while (true) {
            int i4 = this.f95556b;
            if (i2 >= i4) {
                this.f95560f = new long[i4];
                return;
            } else {
                this.f95557c[i2] = dfj0Var.m115520d(this.f95559e[i2]);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m122303t(C1894k c1894k, C1894k c1894k2) {
        return c1894k2.f7781h - c1894k.f7781h;
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: a */
    public boolean mo11354a(int i, long j) {
        return this.f95560f[i] > j;
    }

    @Override // p153l.vfj0
    /* JADX INFO: renamed from: c */
    public final int mo11356c(int i) {
        return this.f95557c[i];
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: d */
    public boolean mo11357d(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo11354a = mo11354a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f95556b && !zMo11354a) {
            zMo11354a = (i2 == i || mo11354a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo11354a) {
            return false;
        }
        long[] jArr = this.f95560f;
        jArr[i] = Math.max(jArr[i], bmk0.m105120b(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            es2 es2Var = (es2) obj;
            if (this.f95555a == es2Var.f95555a && Arrays.equals(this.f95557c, es2Var.f95557c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.vfj0
    /* JADX INFO: renamed from: f */
    public final int mo11359f(int i) {
        for (int i2 = 0; i2 < this.f95556b; i2++) {
            if (this.f95557c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p153l.vfj0
    /* JADX INFO: renamed from: h */
    public final dfj0 mo11361h() {
        return this.f95555a;
    }

    public int hashCode() {
        if (this.f95561g == 0) {
            this.f95561g = (System.identityHashCode(this.f95555a) * 31) + Arrays.hashCode(this.f95557c);
        }
        return this.f95561g;
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: i */
    public int mo11362i(long j, List<? extends crx> list) {
        return list.size();
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: j */
    public final int mo11363j() {
        return this.f95557c[mo11355b()];
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: k */
    public final C1894k mo11364k() {
        return this.f95559e[mo11355b()];
    }

    @Override // p153l.vfj0
    public final int length() {
        return this.f95557c.length;
    }

    @Override // p153l.vfj0
    /* JADX INFO: renamed from: m */
    public final C1894k mo11366m(int i) {
        return this.f95559e[i];
    }

    @Override // p153l.vfj0
    /* JADX INFO: renamed from: r */
    public final int mo11371r(C1894k c1894k) {
        for (int i = 0; i < this.f95556b; i++) {
            if (this.f95559e[i] == c1894k) {
                return i;
            }
        }
        return -1;
    }

    @Override // p153l.u9f
    public void disable() {
    }

    @Override // p153l.u9f
    public void enable() {
    }

    @Override // p153l.u9f
    /* JADX INFO: renamed from: n */
    public void mo11367n(float f) {
    }

    public es2(dfj0 dfj0Var, int... iArr) {
        this(dfj0Var, iArr, 0);
    }
}
