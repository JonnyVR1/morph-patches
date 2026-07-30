package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class f4c {

    /* JADX INFO: renamed from: a */
    public final int f94754a;

    /* JADX INFO: renamed from: b */
    public final byte[] f94755b;

    public f4c(int i, byte[] bArr) {
        this.f94754a = i;
        this.f94755b = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static f4c[] m119296b(byte[] bArr, i0l0 i0l0Var) {
        i0l0.C17457c c17457cM133893d = i0l0Var.m133893d();
        i0l0.C17456b[] c17456bArrM133900a = c17457cM133893d.m133900a();
        int iM133898a = 0;
        for (i0l0.C17456b c17456b : c17456bArrM133900a) {
            iM133898a += c17456b.m133898a();
        }
        f4c[] f4cVarArr = new f4c[iM133898a];
        int i = 0;
        for (i0l0.C17456b c17456b2 : c17456bArrM133900a) {
            int i2 = 0;
            while (i2 < c17456b2.m133898a()) {
                int iM133899b = c17456b2.m133899b();
                f4cVarArr[i] = new f4c(iM133899b, new byte[c17457cM133893d.m133901b() + iM133899b]);
                i2++;
                i++;
            }
        }
        int length = f4cVarArr[0].f94755b.length - c17457cM133893d.m133901b();
        int i3 = length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (i6 < i) {
                f4cVarArr[i6].f94755b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        boolean z = i0l0Var.m133897i() == 24;
        int i7 = z ? 8 : i;
        int i8 = 0;
        while (i8 < i7) {
            f4cVarArr[i8].f94755b[i3] = bArr[i4];
            i8++;
            i4++;
        }
        int length2 = f4cVarArr[0].f94755b.length;
        while (length < length2) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = z ? (i9 + 8) % i : i9;
                f4cVarArr[i10].f94755b[(!z || i10 <= 7) ? length : length - 1] = bArr[i4];
                i9++;
                i4++;
            }
            length++;
        }
        if (i4 == bArr.length) {
            return f4cVarArr;
        }
        x9g0.m207497a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m119297a() {
        return this.f94755b;
    }

    /* JADX INFO: renamed from: c */
    public int m119298c() {
        return this.f94754a;
    }
}
