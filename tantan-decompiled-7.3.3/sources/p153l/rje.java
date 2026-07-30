package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class rje extends vpj0 {

    /* JADX INFO: renamed from: i */
    public final int[] f163449i = new int[4];

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: k */
    public int mo172489k(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f163449i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM101402m = b13Var.m101402m();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < iM101402m; i2++) {
            sb.append((char) (vpj0.m202256i(b13Var, iArr2, i, vpj0.f185262g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = vpj0.m202257m(b13Var, i, true, vpj0.f185260e)[1];
        for (int i5 = 0; i5 < 4 && i4 < iM101402m; i5++) {
            sb.append((char) (vpj0.m202256i(b13Var, iArr2, i4, vpj0.f185262g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo172490p() {
        return BarcodeFormat.EAN_8;
    }
}
