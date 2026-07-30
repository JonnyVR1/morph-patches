package p003l;

import p014rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class kp50<T> {

    /* JADX INFO: renamed from: a */
    public final float f4998a;

    /* JADX INFO: renamed from: b */
    public int f4999b;

    /* JADX INFO: renamed from: c */
    public int f5000c;

    /* JADX INFO: renamed from: d */
    public int f5001d;

    /* JADX INFO: renamed from: e */
    public T[] f5002e;

    public kp50(int i, float f) {
        this.f4998a = f;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f4999b = iRoundToPowerOfTwo - 1;
        this.f5001d = (int) (f * iRoundToPowerOfTwo);
        this.f5002e = (T[]) new Object[iRoundToPowerOfTwo];
    }

    /* JADX INFO: renamed from: b */
    public static int m5759b(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* JADX INFO: renamed from: a */
    public boolean m5760a(T t) {
        T t2;
        T[] tArr = this.f5002e;
        int i = this.f4999b;
        int iM5759b = m5759b(t.hashCode()) & i;
        T t3 = tArr[iM5759b];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iM5759b = (iM5759b + 1) & i;
                t2 = tArr[iM5759b];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iM5759b] = t;
        int i2 = this.f5000c + 1;
        this.f5000c = i2;
        if (i2 >= this.f5001d) {
            m5761c();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m5761c() {
        T t;
        T[] tArr = this.f5002e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f5000c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f4999b = i2;
                this.f5001d = (int) (i * this.f4998a);
                this.f5002e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iM5759b = m5759b(t.hashCode()) & i2;
            if (tArr2[iM5759b] != null) {
                do {
                    iM5759b = (iM5759b + 1) & i2;
                } while (tArr2[iM5759b] != null);
            }
            tArr2[iM5759b] = tArr[length];
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m5762d(T t) {
        T t2;
        T[] tArr = this.f5002e;
        int i = this.f4999b;
        int iM5759b = m5759b(t.hashCode()) & i;
        T t3 = tArr[iM5759b];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m5763e(iM5759b, tArr, i);
        }
        do {
            iM5759b = (iM5759b + 1) & i;
            t2 = tArr[iM5759b];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m5763e(iM5759b, tArr, i);
    }

    /* JADX INFO: renamed from: e */
    public boolean m5763e(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f5000c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int iM5759b = m5759b(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iM5759b && iM5759b > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else {
                        if (i >= iM5759b || iM5759b > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    }
                } else {
                    tArr[i] = null;
                    return true;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5764f() {
        this.f5000c = 0;
        this.f5002e = (T[]) new Object[0];
    }

    /* JADX INFO: renamed from: g */
    public T[] m5765g() {
        return this.f5002e;
    }

    public kp50() {
        this(16, 0.75f);
    }
}
