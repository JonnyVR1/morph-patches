package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class pje extends vpj0 {

    /* JADX INFO: renamed from: j */
    public static final int[] f152687j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: i */
    public final int[] f152688i = new int[4];

    /* JADX INFO: renamed from: r */
    public static void m172488r(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f152687j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: k */
    public int mo172489k(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f152688i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM101402m = b13Var.m101402m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < iM101402m; i3++) {
            int iM202256i = vpj0.m202256i(b13Var, iArr2, i, vpj0.f185263h);
            sb.append((char) ((iM202256i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (iM202256i >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m172488r(sb, i2);
        int i5 = vpj0.m202257m(b13Var, i, true, vpj0.f185260e)[1];
        for (int i6 = 0; i6 < 6 && i5 < iM101402m; i6++) {
            sb.append((char) (vpj0.m202256i(b13Var, iArr2, i5, vpj0.f185262g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo172490p() {
        return BarcodeFormat.EAN_13;
    }
}
