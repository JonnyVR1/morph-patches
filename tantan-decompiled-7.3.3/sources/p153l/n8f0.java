package p153l;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface n8f0 {
    /* JADX INFO: renamed from: a */
    int mo161913a(int i);

    /* JADX INFO: renamed from: b */
    int mo161914b(int i);

    /* JADX INFO: renamed from: c */
    int mo161915c();

    /* JADX INFO: renamed from: d */
    n8f0 mo161916d();

    /* JADX INFO: renamed from: e */
    int mo161917e();

    /* JADX INFO: renamed from: f */
    n8f0 mo161918f(int i, int i2);

    /* JADX INFO: renamed from: g */
    n8f0 mo161919g(int i, int i2);

    int getLength();

    /* JADX INFO: renamed from: l.n8f0$a */
    public static class C18822a implements n8f0 {

        /* JADX INFO: renamed from: a */
        public final Random f140678a;

        /* JADX INFO: renamed from: b */
        public final int[] f140679b;

        /* JADX INFO: renamed from: c */
        public final int[] f140680c;

        public C18822a(int[] iArr, Random random) {
            this.f140679b = iArr;
            this.f140678a = random;
            this.f140680c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f140680c[iArr[i]] = i;
            }
        }

        /* JADX INFO: renamed from: h */
        public static int[] m161920h(int i, Random random) {
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

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: a */
        public int mo161913a(int i) {
            int i2 = this.f140680c[i] - 1;
            if (i2 >= 0) {
                return this.f140679b[i2];
            }
            return -1;
        }

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: b */
        public int mo161914b(int i) {
            int i2 = this.f140680c[i] + 1;
            int[] iArr = this.f140679b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: c */
        public int mo161915c() {
            int[] iArr = this.f140679b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: d */
        public n8f0 mo161916d() {
            return new C18822a(0, new Random(this.f140678a.nextLong()));
        }

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: e */
        public int mo161917e() {
            int[] iArr = this.f140679b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: f */
        public n8f0 mo161918f(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f140679b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f140679b;
                if (i4 >= iArr2.length) {
                    return new C18822a(iArr, new Random(this.f140678a.nextLong()));
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

        @Override // p153l.n8f0
        /* JADX INFO: renamed from: g */
        public n8f0 mo161919g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f140678a.nextInt(this.f140679b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f140678a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f140679b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f140679b;
                if (i3 >= iArr4.length + i2) {
                    return new C18822a(iArr3, new Random(this.f140678a.nextLong()));
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

        @Override // p153l.n8f0
        public int getLength() {
            return this.f140679b.length;
        }

        public C18822a(int i, Random random) {
            this(m161920h(i, random), random);
        }

        public C18822a(int i) {
            this(i, new Random());
        }
    }
}
