package p153l;

import p137rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class qx50<T> {

    /* JADX INFO: renamed from: a */
    public final float f160011a;

    /* JADX INFO: renamed from: b */
    public int f160012b;

    /* JADX INFO: renamed from: c */
    public int f160013c;

    /* JADX INFO: renamed from: d */
    public int f160014d;

    /* JADX INFO: renamed from: e */
    public T[] f160015e;

    public qx50(int i, float f) {
        this.f160011a = f;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f160012b = iRoundToPowerOfTwo - 1;
        this.f160014d = (int) (f * iRoundToPowerOfTwo);
        this.f160015e = (T[]) new Object[iRoundToPowerOfTwo];
    }

    /* JADX INFO: renamed from: b */
    public static int m178573b(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* JADX INFO: renamed from: a */
    public boolean m178574a(T t) {
        T t2;
        T[] tArr = this.f160015e;
        int i = this.f160012b;
        int iM178573b = m178573b(t.hashCode()) & i;
        T t3 = tArr[iM178573b];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iM178573b = (iM178573b + 1) & i;
                t2 = tArr[iM178573b];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iM178573b] = t;
        int i2 = this.f160013c + 1;
        this.f160013c = i2;
        if (i2 >= this.f160014d) {
            m178575c();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m178575c() {
        T t;
        T[] tArr = this.f160015e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f160013c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f160012b = i2;
                this.f160014d = (int) (i * this.f160011a);
                this.f160015e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iM178573b = m178573b(t.hashCode()) & i2;
            if (tArr2[iM178573b] != null) {
                do {
                    iM178573b = (iM178573b + 1) & i2;
                } while (tArr2[iM178573b] != null);
            }
            tArr2[iM178573b] = tArr[length];
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m178576d(T t) {
        T t2;
        T[] tArr = this.f160015e;
        int i = this.f160012b;
        int iM178573b = m178573b(t.hashCode()) & i;
        T t3 = tArr[iM178573b];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m178577e(iM178573b, tArr, i);
        }
        do {
            iM178573b = (iM178573b + 1) & i;
            t2 = tArr[iM178573b];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m178577e(iM178573b, tArr, i);
    }

    /* JADX INFO: renamed from: e */
    public boolean m178577e(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f160013c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int iM178573b = m178573b(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iM178573b && iM178573b > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else {
                        if (i >= iM178573b || iM178573b > i3) {
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
    public void m178578f() {
        this.f160013c = 0;
        this.f160015e = (T[]) new Object[0];
    }

    /* JADX INFO: renamed from: g */
    public T[] m178579g() {
        return this.f160015e;
    }

    public qx50() {
        this(16, 0.75f);
    }
}
