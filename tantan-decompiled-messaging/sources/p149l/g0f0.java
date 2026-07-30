package p149l;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface g0f0 {
    /* JADX INFO: renamed from: a */
    int mo123962a(int i);

    /* JADX INFO: renamed from: b */
    int mo123963b(int i);

    /* JADX INFO: renamed from: c */
    int mo123964c();

    /* JADX INFO: renamed from: d */
    g0f0 mo123965d();

    /* JADX INFO: renamed from: e */
    int mo123966e();

    /* JADX INFO: renamed from: f */
    g0f0 mo123967f(int i, int i2);

    /* JADX INFO: renamed from: g */
    g0f0 mo123968g(int i, int i2);

    int getLength();

    /* JADX INFO: renamed from: l.g0f0$a */
    public static class C16972a implements g0f0 {

        /* JADX INFO: renamed from: a */
        public final Random f100038a;

        /* JADX INFO: renamed from: b */
        public final int[] f100039b;

        /* JADX INFO: renamed from: c */
        public final int[] f100040c;

        public C16972a(int[] iArr, Random random) {
            this.f100039b = iArr;
            this.f100038a = random;
            this.f100040c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f100040c[iArr[i]] = i;
            }
        }

        /* JADX INFO: renamed from: h */
        public static int[] m123969h(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: a */
        public int mo123962a(int i) {
            int i2 = this.f100040c[i] - 1;
            if (i2 >= 0) {
                return this.f100039b[i2];
            }
            return -1;
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: b */
        public int mo123963b(int i) {
            int i2 = this.f100040c[i] + 1;
            int[] iArr = this.f100039b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: c */
        public int mo123964c() {
            int[] iArr = this.f100039b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: d */
        public g0f0 mo123965d() {
            return new C16972a(0, new Random(this.f100038a.nextLong()));
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: e */
        public int mo123966e() {
            int[] iArr = this.f100039b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: f */
        public g0f0 mo123967f(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f100039b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f100039b;
                if (i4 >= iArr2.length) {
                    return new C16972a(iArr, new Random(this.f100038a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // p149l.g0f0
        /* JADX INFO: renamed from: g */
        public g0f0 mo123968g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f100038a.nextInt(this.f100039b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f100038a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f100039b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f100039b;
                if (i3 >= iArr4.length + i2) {
                    return new C16972a(iArr3, new Random(this.f100038a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // p149l.g0f0
        public int getLength() {
            return this.f100039b.length;
        }

        public C16972a(int i, Random random) {
            this(m123969h(i, random), random);
        }

        public C16972a(int i) {
            this(i, new Random());
        }
    }
}
