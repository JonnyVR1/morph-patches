package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class n5c {

    /* JADX INFO: renamed from: a */
    public final int f140325a;

    /* JADX INFO: renamed from: b */
    public final byte[] f140326b;

    public n5c(int i, byte[] bArr) {
        this.f140325a = i;
        this.f140326b = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static n5c[] m161695b(byte[] bArr, n9l0 n9l0Var) {
        n9l0.C18828c c18828cM161993d = n9l0Var.m161993d();
        n9l0.C18827b[] c18827bArrM162000a = c18828cM161993d.m162000a();
        int iM161998a = 0;
        for (n9l0.C18827b c18827b : c18827bArrM162000a) {
            iM161998a += c18827b.m161998a();
        }
        n5c[] n5cVarArr = new n5c[iM161998a];
        int i = 0;
        for (n9l0.C18827b c18827b2 : c18827bArrM162000a) {
            int i2 = 0;
            while (i2 < c18827b2.m161998a()) {
                int iM161999b = c18827b2.m161999b();
                n5cVarArr[i] = new n5c(iM161999b, new byte[c18828cM161993d.m162001b() + iM161999b]);
                i2++;
                i++;
            }
        }
        int length = n5cVarArr[0].f140326b.length - c18828cM161993d.m162001b();
        int i3 = length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (i6 < i) {
                n5cVarArr[i6].f140326b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        boolean z = n9l0Var.m161997i() == 24;
        int i7 = z ? 8 : i;
        int i8 = 0;
        while (i8 < i7) {
            n5cVarArr[i8].f140326b[i3] = bArr[i4];
            i8++;
            i4++;
        }
        int length2 = n5cVarArr[0].f140326b.length;
        while (length < length2) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = z ? (i9 + 8) % i : i9;
                n5cVarArr[i10].f140326b[(!z || i10 <= 7) ? length : length - 1] = bArr[i4];
                i9++;
                i4++;
            }
            length++;
        }
        if (i4 == bArr.length) {
            return n5cVarArr;
        }
        fig0.m125680a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m161696a() {
        return this.f140326b;
    }

    /* JADX INFO: renamed from: c */
    public int m161697c() {
        return this.f140325a;
    }
}
