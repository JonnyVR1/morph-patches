package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wzi0<V> {

    /* JADX INFO: renamed from: a */
    public long[] f191800a;

    /* JADX INFO: renamed from: b */
    public V[] f191801b;

    /* JADX INFO: renamed from: c */
    public int f191802c;

    /* JADX INFO: renamed from: d */
    public int f191803d;

    public wzi0(int i) {
        this.f191800a = new long[i];
        this.f191801b = (V[]) m208725f(i);
    }

    /* JADX INFO: renamed from: f */
    public static <V> V[] m208725f(int i) {
        return (V[]) new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m208726a(long j, V v2) {
        m208729d(j);
        m208730e();
        m208727b(j, v2);
    }

    /* JADX INFO: renamed from: b */
    public final void m208727b(long j, V v2) {
        int i = this.f191802c;
        int i2 = this.f191803d;
        V[] vArr = this.f191801b;
        int length = (i + i2) % vArr.length;
        this.f191800a[length] = j;
        vArr[length] = v2;
        this.f191803d = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m208728c() {
        this.f191802c = 0;
        this.f191803d = 0;
        Arrays.fill(this.f191801b, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public final void m208729d(long j) {
        int i = this.f191803d;
        if (i > 0) {
            if (j <= this.f191800a[((this.f191802c + i) - 1) % this.f191801b.length]) {
                m208728c();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m208730e() {
        int length = this.f191801b.length;
        if (this.f191803d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) m208725f(i);
        int i2 = this.f191802c;
        int i3 = length - i2;
        System.arraycopy(this.f191800a, i2, jArr, 0, i3);
        System.arraycopy(this.f191801b, this.f191802c, vArr, 0, i3);
        int i4 = this.f191802c;
        if (i4 > 0) {
            System.arraycopy(this.f191800a, 0, jArr, i3, i4);
            System.arraycopy(this.f191801b, 0, vArr, i3, this.f191802c);
        }
        this.f191800a = jArr;
        this.f191801b = vArr;
        this.f191802c = 0;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public synchronized V m208731g(long j) {
        return m208732h(j, false);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final V m208732h(long j, boolean z) {
        V vM208735k = null;
        long j2 = Long.MAX_VALUE;
        while (this.f191803d > 0) {
            long j3 = j - this.f191800a[this.f191802c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vM208735k = m208735k();
            j2 = j3;
        }
        return vM208735k;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public synchronized V m208733i() {
        return this.f191803d == 0 ? null : m208735k();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public synchronized V m208734j(long j) {
        return m208732h(j, true);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final V m208735k() {
        w11.m204371g(this.f191803d > 0);
        V[] vArr = this.f191801b;
        int i = this.f191802c;
        V v2 = vArr[i];
        vArr[i] = null;
        this.f191802c = (i + 1) % vArr.length;
        this.f191803d--;
        return v2;
    }

    /* JADX INFO: renamed from: l */
    public synchronized int m208736l() {
        return this.f191803d;
    }

    public wzi0() {
        this(10);
    }
}
