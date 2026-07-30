package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mri {

    /* JADX INFO: renamed from: l.mri$b */
    public static final class C18692b {

        /* JADX INFO: renamed from: a */
        public final long[] f138381a;

        /* JADX INFO: renamed from: b */
        public final int[] f138382b;

        /* JADX INFO: renamed from: c */
        public final int f138383c;

        /* JADX INFO: renamed from: d */
        public final long[] f138384d;

        /* JADX INFO: renamed from: e */
        public final int[] f138385e;

        /* JADX INFO: renamed from: f */
        public final long f138386f;

        public C18692b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f138381a = jArr;
            this.f138382b = iArr;
            this.f138383c = i;
            this.f138384d = jArr2;
            this.f138385e = iArr2;
            this.f138386f = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18692b m159707a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iM105150l = 0;
        for (int i3 : iArr) {
            iM105150l += bmk0.m105150l(i3, i2);
        }
        long[] jArr2 = new long[iM105150l];
        int[] iArr2 = new int[iM105150l];
        long[] jArr3 = new long[iM105150l];
        int[] iArr3 = new int[iM105150l];
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
        return new C18692b(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4));
    }
}
