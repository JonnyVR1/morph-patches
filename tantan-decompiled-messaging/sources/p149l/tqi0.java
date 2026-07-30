package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tqi0<V> {

    /* JADX INFO: renamed from: a */
    public long[] f171592a;

    /* JADX INFO: renamed from: b */
    public V[] f171593b;

    /* JADX INFO: renamed from: c */
    public int f171594c;

    /* JADX INFO: renamed from: d */
    public int f171595d;

    public tqi0(int i) {
        this.f171592a = new long[i];
        this.f171593b = (V[]) m190112f(i);
    }

    /* JADX INFO: renamed from: f */
    public static <V> V[] m190112f(int i) {
        return (V[]) new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m190113a(long j, V v2) {
        m190116d(j);
        m190117e();
        m190114b(j, v2);
    }

    /* JADX INFO: renamed from: b */
    public final void m190114b(long j, V v2) {
        int i = this.f171594c;
        int i2 = this.f171595d;
        V[] vArr = this.f171593b;
        int length = (i + i2) % vArr.length;
        this.f171592a[length] = j;
        vArr[length] = v2;
        this.f171595d = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m190115c() {
        this.f171594c = 0;
        this.f171595d = 0;
        Arrays.fill(this.f171593b, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public final void m190116d(long j) {
        int i = this.f171595d;
        if (i > 0) {
            if (j <= this.f171592a[((this.f171594c + i) - 1) % this.f171593b.length]) {
                m190115c();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m190117e() {
        int length = this.f171593b.length;
        if (this.f171595d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) m190112f(i);
        int i2 = this.f171594c;
        int i3 = length - i2;
        System.arraycopy(this.f171592a, i2, jArr, 0, i3);
        System.arraycopy(this.f171593b, this.f171594c, vArr, 0, i3);
        int i4 = this.f171594c;
        if (i4 > 0) {
            System.arraycopy(this.f171592a, 0, jArr, i3, i4);
            System.arraycopy(this.f171593b, 0, vArr, i3, this.f171594c);
        }
        this.f171592a = jArr;
        this.f171593b = vArr;
        this.f171594c = 0;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public synchronized V m190118g(long j) {
        return m190119h(j, false);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final V m190119h(long j, boolean z) {
        V vM190122k = null;
        long j2 = Long.MAX_VALUE;
        while (this.f171595d > 0) {
            long j3 = j - this.f171592a[this.f171594c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vM190122k = m190122k();
            j2 = j3;
        }
        return vM190122k;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public synchronized V m190120i() {
        return this.f171595d == 0 ? null : m190122k();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public synchronized V m190121j(long j) {
        return m190119h(j, true);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final V m190122k() {
        p11.m167013g(this.f171595d > 0);
        V[] vArr = this.f171593b;
        int i = this.f171594c;
        V v2 = vArr[i];
        vArr[i] = null;
        this.f171594c = (i + 1) % vArr.length;
        this.f171595d--;
        return v2;
    }

    /* JADX INFO: renamed from: l */
    public synchronized int m190123l() {
        return this.f171595d;
    }

    public tqi0() {
        this(10);
    }
}
