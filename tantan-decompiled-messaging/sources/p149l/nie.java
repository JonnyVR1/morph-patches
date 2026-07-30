package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class nie extends sgj0 {

    /* JADX INFO: renamed from: i */
    public final int[] f139085i = new int[4];

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: k */
    public int mo149888k(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f139085i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM152494m = m03Var.m152494m();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < iM152494m; i2++) {
            sb.append((char) (sgj0.m184103i(m03Var, iArr2, i, sgj0.f164440g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = sgj0.m184104m(m03Var, i, true, sgj0.f164438e)[1];
        for (int i5 = 0; i5 < 4 && i4 < iM152494m; i5++) {
            sb.append((char) (sgj0.m184103i(m03Var, iArr2, i4, sgj0.f164440g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo149889p() {
        return BarcodeFormat.EAN_8;
    }
}
