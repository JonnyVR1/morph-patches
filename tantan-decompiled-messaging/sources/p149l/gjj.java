package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class gjj {

    /* JADX INFO: renamed from: h */
    public static final gjj f103070h = new gjj(4201, 4096, 1);

    /* JADX INFO: renamed from: i */
    public static final gjj f103071i = new gjj(1033, 1024, 1);

    /* JADX INFO: renamed from: j */
    public static final gjj f103072j;

    /* JADX INFO: renamed from: k */
    public static final gjj f103073k;

    /* JADX INFO: renamed from: l */
    public static final gjj f103074l;

    /* JADX INFO: renamed from: m */
    public static final gjj f103075m;

    /* JADX INFO: renamed from: n */
    public static final gjj f103076n;

    /* JADX INFO: renamed from: o */
    public static final gjj f103077o;

    /* JADX INFO: renamed from: a */
    public final int[] f103078a;

    /* JADX INFO: renamed from: b */
    public final int[] f103079b;

    /* JADX INFO: renamed from: c */
    public final hjj f103080c;

    /* JADX INFO: renamed from: d */
    public final hjj f103081d;

    /* JADX INFO: renamed from: e */
    public final int f103082e;

    /* JADX INFO: renamed from: f */
    public final int f103083f;

    /* JADX INFO: renamed from: g */
    public final int f103084g;

    static {
        gjj gjjVar = new gjj(67, 64, 1);
        f103072j = gjjVar;
        f103073k = new gjj(19, 16, 1);
        f103074l = new gjj(285, 256, 0);
        gjj gjjVar2 = new gjj(301, 256, 1);
        f103075m = gjjVar2;
        f103076n = gjjVar2;
        f103077o = gjjVar;
    }

    public gjj(int i, int i2, int i3) {
        this.f103083f = i;
        this.f103082e = i2;
        this.f103084g = i3;
        this.f103078a = new int[i2];
        this.f103079b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f103078a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f103079b[this.f103078a[i6]] = i6;
        }
        this.f103080c = new hjj(this, new int[]{0});
        this.f103081d = new hjj(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public static int m126537a(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: renamed from: b */
    public hjj m126538b(int i, int i2) {
        if (i < 0) {
            x9g0.m207497a();
            return null;
        }
        if (i2 == 0) {
            return this.f103080c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new hjj(this, iArr);
    }

    /* JADX INFO: renamed from: c */
    public int m126539c(int i) {
        return this.f103078a[i];
    }

    /* JADX INFO: renamed from: d */
    public int m126540d() {
        return this.f103084g;
    }

    /* JADX INFO: renamed from: e */
    public hjj m126541e() {
        return this.f103081d;
    }

    /* JADX INFO: renamed from: f */
    public int m126542f() {
        return this.f103082e;
    }

    /* JADX INFO: renamed from: g */
    public hjj m126543g() {
        return this.f103080c;
    }

    /* JADX INFO: renamed from: h */
    public int m126544h(int i) {
        if (i != 0) {
            return this.f103078a[(this.f103082e - this.f103079b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: i */
    public int m126545i(int i) {
        if (i != 0) {
            return this.f103079b[i];
        }
        x9g0.m207497a();
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public int m126546j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f103078a;
        int[] iArr2 = this.f103079b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f103082e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f103083f) + ',' + this.f103082e + ')';
    }
}
