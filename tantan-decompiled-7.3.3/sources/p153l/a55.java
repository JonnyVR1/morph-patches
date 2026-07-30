package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class a55 {

    /* JADX INFO: renamed from: a */
    public int[] f68500a;

    /* JADX INFO: renamed from: b */
    public int f68501b;

    /* JADX INFO: renamed from: c */
    public int f68502c;

    /* JADX INFO: renamed from: d */
    public int f68503d;

    public a55(int i) {
        if (i < 1) {
            wg3.m206174a("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            wg3.m206174a("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f68503d = i - 1;
        this.f68500a = new int[i];
    }

    /* JADX INFO: renamed from: a */
    public void m96025a(int i) {
        int[] iArr = this.f68500a;
        int i2 = this.f68502c;
        iArr[i2] = i;
        int i3 = this.f68503d & (i2 + 1);
        this.f68502c = i3;
        if (i3 == this.f68501b) {
            m96027c();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m96026b() {
        this.f68502c = this.f68501b;
    }

    /* JADX INFO: renamed from: c */
    public final void m96027c() {
        int[] iArr = this.f68500a;
        int length = iArr.length;
        int i = this.f68501b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            azk0.m101074a("Max array capacity exceeded");
            return;
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f68500a, 0, iArr2, i2, this.f68501b);
        this.f68500a = iArr2;
        this.f68501b = 0;
        this.f68502c = length;
        this.f68503d = i3 - 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m96028d() {
        return this.f68501b == this.f68502c;
    }

    /* JADX INFO: renamed from: e */
    public int m96029e() {
        int i = this.f68501b;
        if (i == this.f68502c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f68500a[i];
        this.f68501b = (i + 1) & this.f68503d;
        return i2;
    }

    public a55() {
        this(8);
    }
}
