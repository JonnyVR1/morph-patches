package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qoi {

    /* JADX INFO: renamed from: l.qoi$b */
    public static final class C19549b {

        /* JADX INFO: renamed from: a */
        public final long[] f155576a;

        /* JADX INFO: renamed from: b */
        public final int[] f155577b;

        /* JADX INFO: renamed from: c */
        public final int f155578c;

        /* JADX INFO: renamed from: d */
        public final long[] f155579d;

        /* JADX INFO: renamed from: e */
        public final int[] f155580e;

        /* JADX INFO: renamed from: f */
        public final long f155581f;

        public C19549b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f155576a = jArr;
            this.f155577b = iArr;
            this.f155578c = i;
            this.f155579d = jArr2;
            this.f155580e = iArr2;
            this.f155581f = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C19549b m175749a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iM197872l = 0;
        for (int i3 : iArr) {
            iM197872l += vck0.m197872l(i3, i2);
        }
        long[] jArr2 = new long[iM197872l];
        int[] iArr2 = new int[iM197872l];
        long[] jArr3 = new long[iM197872l];
        int[] iArr3 = new int[iM197872l];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                int i8 = i * iMin;
                iArr2[i5] = i8;
                iMax = Math.max(iMax, i8);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                j2 += (long) iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new C19549b(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4));
    }
}
