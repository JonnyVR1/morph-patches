package p153l;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes7.dex */
public final class m5c {

    /* JADX INFO: renamed from: a */
    public final int f134885a;

    /* JADX INFO: renamed from: b */
    public final byte[] f134886b;

    public m5c(int i, byte[] bArr) {
        this.f134885a = i;
        this.f134886b = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static m5c[] m157097b(byte[] bArr, o9l0 o9l0Var, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != o9l0Var.m166750h()) {
            fig0.m125680a();
            return null;
        }
        o9l0.C19061b c19061bM166749f = o9l0Var.m166749f(errorCorrectionLevel);
        o9l0.C19060a[] c19060aArrM166754a = c19061bM166749f.m166754a();
        int iM166752a = 0;
        for (o9l0.C19060a c19060a : c19060aArrM166754a) {
            iM166752a += c19060a.m166752a();
        }
        m5c[] m5cVarArr = new m5c[iM166752a];
        int i = 0;
        for (o9l0.C19060a c19060a2 : c19060aArrM166754a) {
            int i2 = 0;
            while (i2 < c19060a2.m166752a()) {
                int iM166753b = c19060a2.m166753b();
                m5cVarArr[i] = new m5c(iM166753b, new byte[c19061bM166749f.m166755b() + iM166753b]);
                i2++;
                i++;
            }
        }
        int length = m5cVarArr[0].f134886b.length;
        int i3 = iM166752a - 1;
        while (i3 >= 0 && m5cVarArr[i3].f134886b.length != length) {
            i3--;
        }
        int i4 = i3 + 1;
        int iM166755b = length - c19061bM166749f.m166755b();
        int i5 = 0;
        for (int i6 = 0; i6 < iM166755b; i6++) {
            int i7 = 0;
            while (i7 < i) {
                m5cVarArr[i7].f134886b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        int i8 = i4;
        while (i8 < i) {
            m5cVarArr[i8].f134886b[iM166755b] = bArr[i5];
            i8++;
            i5++;
        }
        int length2 = m5cVarArr[0].f134886b.length;
        while (iM166755b < length2) {
            int i9 = 0;
            while (i9 < i) {
                m5cVarArr[i9].f134886b[i9 < i4 ? iM166755b : iM166755b + 1] = bArr[i5];
                i9++;
                i5++;
            }
            iM166755b++;
        }
        return m5cVarArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m157098a() {
        return this.f134886b;
    }

    /* JADX INFO: renamed from: c */
    public int m157099c() {
        return this.f134885a;
    }
}
