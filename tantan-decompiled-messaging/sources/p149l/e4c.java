package p149l;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes7.dex */
public final class e4c {

    /* JADX INFO: renamed from: a */
    public final int f89263a;

    /* JADX INFO: renamed from: b */
    public final byte[] f89264b;

    public e4c(int i, byte[] bArr) {
        this.f89263a = i;
        this.f89264b = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static e4c[] m114669b(byte[] bArr, j0l0 j0l0Var, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != j0l0Var.m139174h()) {
            x9g0.m207497a();
            return null;
        }
        j0l0.C17662b c17662bM139173f = j0l0Var.m139173f(errorCorrectionLevel);
        j0l0.C17661a[] c17661aArrM139178a = c17662bM139173f.m139178a();
        int iM139176a = 0;
        for (j0l0.C17661a c17661a : c17661aArrM139178a) {
            iM139176a += c17661a.m139176a();
        }
        e4c[] e4cVarArr = new e4c[iM139176a];
        int i = 0;
        for (j0l0.C17661a c17661a2 : c17661aArrM139178a) {
            int i2 = 0;
            while (i2 < c17661a2.m139176a()) {
                int iM139177b = c17661a2.m139177b();
                e4cVarArr[i] = new e4c(iM139177b, new byte[c17662bM139173f.m139179b() + iM139177b]);
                i2++;
                i++;
            }
        }
        int length = e4cVarArr[0].f89264b.length;
        int i3 = iM139176a - 1;
        while (i3 >= 0 && e4cVarArr[i3].f89264b.length != length) {
            i3--;
        }
        int i4 = i3 + 1;
        int iM139179b = length - c17662bM139173f.m139179b();
        int i5 = 0;
        for (int i6 = 0; i6 < iM139179b; i6++) {
            int i7 = 0;
            while (i7 < i) {
                e4cVarArr[i7].f89264b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        int i8 = i4;
        while (i8 < i) {
            e4cVarArr[i8].f89264b[iM139179b] = bArr[i5];
            i8++;
            i5++;
        }
        int length2 = e4cVarArr[0].f89264b.length;
        while (iM139179b < length2) {
            int i9 = 0;
            while (i9 < i) {
                e4cVarArr[i9].f89264b[i9 < i4 ? iM139179b : iM139179b + 1] = bArr[i5];
                i9++;
                i5++;
            }
            iM139179b++;
        }
        return e4cVarArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m114670a() {
        return this.f89264b;
    }

    /* JADX INFO: renamed from: c */
    public int m114671c() {
        return this.f89263a;
    }
}
