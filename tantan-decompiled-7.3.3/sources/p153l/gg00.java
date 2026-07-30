package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class gg00 {

    /* JADX INFO: renamed from: f */
    public static final gg00 f103980f = new gg00(929, 3);

    /* JADX INFO: renamed from: a */
    public final int[] f103981a;

    /* JADX INFO: renamed from: b */
    public final int[] f103982b;

    /* JADX INFO: renamed from: c */
    public final hg00 f103983c;

    /* JADX INFO: renamed from: d */
    public final hg00 f103984d;

    /* JADX INFO: renamed from: e */
    public final int f103985e;

    public gg00(int i, int i2) {
        this.f103985e = i;
        this.f103981a = new int[i];
        this.f103982b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f103981a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f103982b[this.f103981a[i5]] = i5;
        }
        this.f103983c = new hg00(this, new int[]{0});
        this.f103984d = new hg00(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public int m130128a(int i, int i2) {
        return (i + i2) % this.f103985e;
    }

    /* JADX INFO: renamed from: b */
    public hg00 m130129b(int i, int i2) {
        if (i < 0) {
            fig0.m125680a();
            return null;
        }
        if (i2 == 0) {
            return this.f103983c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new hg00(this, iArr);
    }

    /* JADX INFO: renamed from: c */
    public int m130130c(int i) {
        return this.f103981a[i];
    }

    /* JADX INFO: renamed from: d */
    public hg00 m130131d() {
        return this.f103984d;
    }

    /* JADX INFO: renamed from: e */
    public int m130132e() {
        return this.f103985e;
    }

    /* JADX INFO: renamed from: f */
    public hg00 m130133f() {
        return this.f103983c;
    }

    /* JADX INFO: renamed from: g */
    public int m130134g(int i) {
        if (i != 0) {
            return this.f103981a[(this.f103985e - this.f103982b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: h */
    public int m130135h(int i) {
        if (i != 0) {
            return this.f103982b[i];
        }
        fig0.m125680a();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m130136i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f103981a;
        int[] iArr2 = this.f103982b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f103985e - 1)];
    }

    /* JADX INFO: renamed from: j */
    public int m130137j(int i, int i2) {
        int i3 = this.f103985e;
        return ((i + i3) - i2) % i3;
    }
}
