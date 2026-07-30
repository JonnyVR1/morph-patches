package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class a5b0 {

    /* JADX INFO: renamed from: a */
    public final C15649a f68532a;

    /* JADX INFO: renamed from: b */
    public final C15649a f68533b;

    /* JADX INFO: renamed from: c */
    public final int f68534c;

    /* JADX INFO: renamed from: d */
    public final boolean f68535d;

    /* JADX INFO: renamed from: l.a5b0$a */
    public static final class C15649a {

        /* JADX INFO: renamed from: a */
        public final C15650b[] f68536a;

        public C15649a(C15650b... c15650bArr) {
            this.f68536a = c15650bArr;
        }

        /* JADX INFO: renamed from: a */
        public C15650b m96044a(int i) {
            return this.f68536a[i];
        }

        /* JADX INFO: renamed from: b */
        public int m96045b() {
            return this.f68536a.length;
        }
    }

    /* JADX INFO: renamed from: l.a5b0$b */
    public static final class C15650b {

        /* JADX INFO: renamed from: a */
        public final int f68537a;

        /* JADX INFO: renamed from: b */
        public final int f68538b;

        /* JADX INFO: renamed from: c */
        public final float[] f68539c;

        /* JADX INFO: renamed from: d */
        public final float[] f68540d;

        public C15650b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f68537a = i;
            w11.m204365a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f68539c = fArr;
            this.f68540d = fArr2;
            this.f68538b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m96046a() {
            return this.f68539c.length / 3;
        }
    }

    public a5b0(C15649a c15649a, C15649a c15649a2, int i) {
        this.f68532a = c15649a;
        this.f68533b = c15649a2;
        this.f68534c = i;
        this.f68535d = c15649a == c15649a2;
    }

    /* JADX INFO: renamed from: a */
    public static a5b0 m96042a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5 = i;
        w11.m204365a(f > 0.0f);
        w11.m204365a(i5 >= 1);
        w11.m204365a(i2 >= 1);
        w11.m204365a(f2 > 0.0f && f2 <= 180.0f);
        w11.m204365a(f3 > 0.0f && f3 <= 360.0f);
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
        return new a5b0(new C15649a(new C15650b(0, fArr, fArr2, 1)), i3);
    }

    /* JADX INFO: renamed from: b */
    public static a5b0 m96043b(int i) {
        return m96042a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public a5b0(C15649a c15649a, int i) {
        this(c15649a, c15649a, i);
    }
}
