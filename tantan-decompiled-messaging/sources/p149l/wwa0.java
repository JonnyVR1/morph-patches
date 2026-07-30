package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wwa0 {

    /* JADX INFO: renamed from: a */
    public final C20983a f188357a;

    /* JADX INFO: renamed from: b */
    public final C20983a f188358b;

    /* JADX INFO: renamed from: c */
    public final int f188359c;

    /* JADX INFO: renamed from: d */
    public final boolean f188360d;

    /* JADX INFO: renamed from: l.wwa0$a */
    public static final class C20983a {

        /* JADX INFO: renamed from: a */
        public final C20984b[] f188361a;

        public C20983a(C20984b... c20984bArr) {
            this.f188361a = c20984bArr;
        }

        /* JADX INFO: renamed from: a */
        public C20984b m205849a(int i) {
            return this.f188361a[i];
        }

        /* JADX INFO: renamed from: b */
        public int m205850b() {
            return this.f188361a.length;
        }
    }

    /* JADX INFO: renamed from: l.wwa0$b */
    public static final class C20984b {

        /* JADX INFO: renamed from: a */
        public final int f188362a;

        /* JADX INFO: renamed from: b */
        public final int f188363b;

        /* JADX INFO: renamed from: c */
        public final float[] f188364c;

        /* JADX INFO: renamed from: d */
        public final float[] f188365d;

        public C20984b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f188362a = i;
            p11.m167007a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f188364c = fArr;
            this.f188365d = fArr2;
            this.f188363b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m205851a() {
            return this.f188364c.length / 3;
        }
    }

    public wwa0(C20983a c20983a, C20983a c20983a2, int i) {
        this.f188357a = c20983a;
        this.f188358b = c20983a2;
        this.f188359c = i;
        this.f188360d = c20983a == c20983a2;
    }

    /* JADX INFO: renamed from: a */
    public static wwa0 m205847a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5 = i;
        p11.m167007a(f > 0.0f);
        p11.m167007a(i5 >= 1);
        p11.m167007a(i2 >= 1);
        p11.m167007a(f2 > 0.0f && f2 <= 180.0f);
        p11.m167007a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f4 = radians / i5;
        float f5 = radians2 / i2;
        int i6 = i2 + 1;
        int i7 = ((i6 * 2) + 2) * i5;
        float[] fArr = new float[i7 * 3];
        float[] fArr2 = new float[i7 * 2];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < i5) {
            float f6 = radians / 2.0f;
            float f7 = (i8 * f4) - f6;
            int i11 = i8 + 1;
            float f8 = (i11 * f4) - f6;
            int i12 = 0;
            while (i12 < i6) {
                float f9 = radians;
                float f10 = radians2;
                int i13 = 0;
                int i14 = 2;
                while (i13 < i14) {
                    float f11 = f4;
                    float f12 = i12 * f5;
                    float f13 = f5;
                    float f14 = f7;
                    double d = f;
                    double d2 = (f12 + 3.1415927f) - (f10 / 2.0f);
                    double d3 = i13 == 0 ? f7 : f8;
                    fArr[i9] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    fArr[i9 + 1] = (float) (d * Math.sin(d3));
                    int i15 = i9 + 3;
                    fArr[i9 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr2[i10] = f12 / f10;
                    int i16 = i10 + 2;
                    fArr2[i10 + 1] = ((i8 + i13) * f11) / f9;
                    if ((i12 == 0 && i13 == 0) || (i12 == i2 && i13 == 1)) {
                        System.arraycopy(fArr, i9, fArr, i15, 3);
                        i9 += 6;
                        i4 = 2;
                        System.arraycopy(fArr2, i10, fArr2, i16, 2);
                        i10 += 4;
                    } else {
                        i4 = 2;
                        i9 = i15;
                        i10 = i16;
                    }
                    i13++;
                    i14 = i4;
                    f4 = f11;
                    f5 = f13;
                    f7 = f14;
                }
                i12++;
                radians2 = f10;
                radians = f9;
                f4 = f4;
            }
            i5 = i;
            i8 = i11;
        }
        return new wwa0(new C20983a(new C20984b(0, fArr, fArr2, 1)), i3);
    }

    /* JADX INFO: renamed from: b */
    public static wwa0 m205848b(int i) {
        return m205847a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public wwa0(C20983a c20983a, int i) {
        this(c20983a, c20983a, i);
    }
}
