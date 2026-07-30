package p149l;

import p133rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class kp50<T> {

    /* JADX INFO: renamed from: a */
    public final float f124120a;

    /* JADX INFO: renamed from: b */
    public int f124121b;

    /* JADX INFO: renamed from: c */
    public int f124122c;

    /* JADX INFO: renamed from: d */
    public int f124123d;

    /* JADX INFO: renamed from: e */
    public T[] f124124e;

    public kp50(int i, float f) {
        this.f124120a = f;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f124121b = iRoundToPowerOfTwo - 1;
        this.f124123d = (int) (f * iRoundToPowerOfTwo);
        this.f124124e = (T[]) new Object[iRoundToPowerOfTwo];
    }

    /* JADX INFO: renamed from: b */
    public static int m146825b(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* JADX INFO: renamed from: a */
    public boolean m146826a(T t) {
        T t2;
        T[] tArr = this.f124124e;
        int i = this.f124121b;
        int iM146825b = m146825b(t.hashCode()) & i;
        T t3 = tArr[iM146825b];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iM146825b = (iM146825b + 1) & i;
                t2 = tArr[iM146825b];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iM146825b] = t;
        int i2 = this.f124122c + 1;
        this.f124122c = i2;
        if (i2 >= this.f124123d) {
            m146827c();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m146827c() {
        T t;
        T[] tArr = this.f124124e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f124122c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f124121b = i2;
                this.f124123d = (int) (i * this.f124120a);
                this.f124124e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iM146825b = m146825b(t.hashCode()) & i2;
            if (tArr2[iM146825b] != null) {
                do {
                    iM146825b = (iM146825b + 1) & i2;
                } while (tArr2[iM146825b] != null);
            }
            tArr2[iM146825b] = tArr[length];
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m146828d(T t) {
        T t2;
        T[] tArr = this.f124124e;
        int i = this.f124121b;
        int iM146825b = m146825b(t.hashCode()) & i;
        T t3 = tArr[iM146825b];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m146829e(iM146825b, tArr, i);
        }
        do {
            iM146825b = (iM146825b + 1) & i;
            t2 = tArr[iM146825b];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m146829e(iM146825b, tArr, i);
    }

    /* JADX INFO: renamed from: e */
    public boolean m146829e(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f124122c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int iM146825b = m146825b(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iM146825b && iM146825b > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else {
                        if (i >= iM146825b || iM146825b > i3) {
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
    public void m146830f() {
        this.f124122c = 0;
        this.f124124e = (T[]) new Object[0];
    }

    /* JADX INFO: renamed from: g */
    public T[] m146831g() {
        return this.f124124e;
    }

    public kp50() {
        this(16, 0.75f);
    }
}
