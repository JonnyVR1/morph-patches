package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class z35 {

    /* JADX INFO: renamed from: a */
    public int[] f201306a;

    /* JADX INFO: renamed from: b */
    public int f201307b;

    /* JADX INFO: renamed from: c */
    public int f201308c;

    /* JADX INFO: renamed from: d */
    public int f201309d;

    public z35(int i) {
        if (i < 1) {
            ig3.m135964a("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            ig3.m135964a("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f201309d = i - 1;
        this.f201306a = new int[i];
    }

    /* JADX INFO: renamed from: a */
    public void m217014a(int i) {
        int[] iArr = this.f201306a;
        int i2 = this.f201308c;
        iArr[i2] = i;
        int i3 = this.f201309d & (i2 + 1);
        this.f201308c = i3;
        if (i3 == this.f201307b) {
            m217016c();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m217015b() {
        this.f201308c = this.f201307b;
    }

    /* JADX INFO: renamed from: c */
    public final void m217016c() {
        int[] iArr = this.f201306a;
        int length = iArr.length;
        int i = this.f201307b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            upk0.m194883a("Max array capacity exceeded");
            return;
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f201306a, 0, iArr2, i2, this.f201307b);
        this.f201306a = iArr2;
        this.f201307b = 0;
        this.f201308c = length;
        this.f201309d = i3 - 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m217017d() {
        return this.f201307b == this.f201308c;
    }

    /* JADX INFO: renamed from: e */
    public int m217018e() {
        int i = this.f201307b;
        if (i == this.f201308c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f201306a[i];
        this.f201307b = (i + 1) & this.f201309d;
        return i2;
    }

    public z35() {
        this(8);
    }
}
