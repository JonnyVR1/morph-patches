package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class x700 {

    /* JADX INFO: renamed from: f */
    public static final x700 f191305f = new x700(929, 3);

    /* JADX INFO: renamed from: a */
    public final int[] f191306a;

    /* JADX INFO: renamed from: b */
    public final int[] f191307b;

    /* JADX INFO: renamed from: c */
    public final y700 f191308c;

    /* JADX INFO: renamed from: d */
    public final y700 f191309d;

    /* JADX INFO: renamed from: e */
    public final int f191310e;

    public x700(int i, int i2) {
        this.f191310e = i;
        this.f191306a = new int[i];
        this.f191307b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f191306a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f191307b[this.f191306a[i5]] = i5;
        }
        this.f191308c = new y700(this, new int[]{0});
        this.f191309d = new y700(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public int m207230a(int i, int i2) {
        return (i + i2) % this.f191310e;
    }

    /* JADX INFO: renamed from: b */
    public y700 m207231b(int i, int i2) {
        if (i < 0) {
            x9g0.m207497a();
            return null;
        }
        if (i2 == 0) {
            return this.f191308c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new y700(this, iArr);
    }

    /* JADX INFO: renamed from: c */
    public int m207232c(int i) {
        return this.f191306a[i];
    }

    /* JADX INFO: renamed from: d */
    public y700 m207233d() {
        return this.f191309d;
    }

    /* JADX INFO: renamed from: e */
    public int m207234e() {
        return this.f191310e;
    }

    /* JADX INFO: renamed from: f */
    public y700 m207235f() {
        return this.f191308c;
    }

    /* JADX INFO: renamed from: g */
    public int m207236g(int i) {
        if (i != 0) {
            return this.f191306a[(this.f191310e - this.f191307b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: h */
    public int m207237h(int i) {
        if (i != 0) {
            return this.f191307b[i];
        }
        x9g0.m207497a();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m207238i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f191306a;
        int[] iArr2 = this.f191307b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f191310e - 1)];
    }

    /* JADX INFO: renamed from: j */
    public int m207239j(int i, int i2) {
        int i3 = this.f191310e;
        return ((i + i3) - i2) % i3;
    }
}
