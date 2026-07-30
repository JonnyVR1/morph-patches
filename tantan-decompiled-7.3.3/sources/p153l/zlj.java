package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class zlj {

    /* JADX INFO: renamed from: h */
    public static final zlj f204929h = new zlj(4201, 4096, 1);

    /* JADX INFO: renamed from: i */
    public static final zlj f204930i = new zlj(1033, 1024, 1);

    /* JADX INFO: renamed from: j */
    public static final zlj f204931j;

    /* JADX INFO: renamed from: k */
    public static final zlj f204932k;

    /* JADX INFO: renamed from: l */
    public static final zlj f204933l;

    /* JADX INFO: renamed from: m */
    public static final zlj f204934m;

    /* JADX INFO: renamed from: n */
    public static final zlj f204935n;

    /* JADX INFO: renamed from: o */
    public static final zlj f204936o;

    /* JADX INFO: renamed from: a */
    public final int[] f204937a;

    /* JADX INFO: renamed from: b */
    public final int[] f204938b;

    /* JADX INFO: renamed from: c */
    public final amj f204939c;

    /* JADX INFO: renamed from: d */
    public final amj f204940d;

    /* JADX INFO: renamed from: e */
    public final int f204941e;

    /* JADX INFO: renamed from: f */
    public final int f204942f;

    /* JADX INFO: renamed from: g */
    public final int f204943g;

    static {
        zlj zljVar = new zlj(67, 64, 1);
        f204931j = zljVar;
        f204932k = new zlj(19, 16, 1);
        f204933l = new zlj(285, 256, 0);
        zlj zljVar2 = new zlj(301, 256, 1);
        f204934m = zljVar2;
        f204935n = zljVar2;
        f204936o = zljVar;
    }

    public zlj(int i, int i2, int i3) {
        this.f204942f = i;
        this.f204941e = i2;
        this.f204943g = i3;
        this.f204937a = new int[i2];
        this.f204938b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f204937a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f204938b[this.f204937a[i6]] = i6;
        }
        this.f204939c = new amj(this, new int[]{0});
        this.f204940d = new amj(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public static int m220217a(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: renamed from: b */
    public amj m220218b(int i, int i2) {
        if (i < 0) {
            fig0.m125680a();
            return null;
        }
        if (i2 == 0) {
            return this.f204939c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new amj(this, iArr);
    }

    /* JADX INFO: renamed from: c */
    public int m220219c(int i) {
        return this.f204937a[i];
    }

    /* JADX INFO: renamed from: d */
    public int m220220d() {
        return this.f204943g;
    }

    /* JADX INFO: renamed from: e */
    public amj m220221e() {
        return this.f204940d;
    }

    /* JADX INFO: renamed from: f */
    public int m220222f() {
        return this.f204941e;
    }

    /* JADX INFO: renamed from: g */
    public amj m220223g() {
        return this.f204939c;
    }

    /* JADX INFO: renamed from: h */
    public int m220224h(int i) {
        if (i != 0) {
            return this.f204937a[(this.f204941e - this.f204938b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: i */
    public int m220225i(int i) {
        if (i != 0) {
            return this.f204938b[i];
        }
        fig0.m125680a();
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public int m220226j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f204937a;
        int[] iArr2 = this.f204938b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f204941e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f204942f) + ',' + this.f204941e + ')';
    }
}
