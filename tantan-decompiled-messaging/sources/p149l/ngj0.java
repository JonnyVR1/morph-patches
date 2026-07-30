package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ngj0 extends sgj0 {

    /* JADX INFO: renamed from: i */
    public final sgj0 f138880i = new lie();

    /* JADX INFO: renamed from: r */
    public static oxc0 m159335r(oxc0 oxc0Var) throws FormatException {
        String strM166532f = oxc0Var.m166532f();
        if (strM166532f.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        oxc0 oxc0Var2 = new oxc0(strM166532f.substring(1), null, oxc0Var.m166531e(), BarcodeFormat.UPC_A);
        if (oxc0Var.m166530d() != null) {
            oxc0Var2.m166533g(oxc0Var.m166530d());
        }
        return oxc0Var2;
    }

    @Override // p149l.mh50, p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return m159335r(this.f138880i.mo131886a(nx2Var, map));
    }

    @Override // p149l.sgj0, p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m159335r(this.f138880i.mo100271b(i, m03Var, map));
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: k */
    public int mo149888k(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.f138880i.mo149888k(m03Var, iArr, sb);
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: l */
    public oxc0 mo159336l(int i, m03 m03Var, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m159335r(this.f138880i.mo159336l(i, m03Var, iArr, map));
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo149889p() {
        return BarcodeFormat.UPC_A;
    }
}
