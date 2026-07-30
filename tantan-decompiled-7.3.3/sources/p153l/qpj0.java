package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qpj0 extends vpj0 {

    /* JADX INFO: renamed from: i */
    public final vpj0 f158876i = new pje();

    /* JADX INFO: renamed from: r */
    public static r5d0 m177455r(r5d0 r5d0Var) throws FormatException {
        String strM179857f = r5d0Var.m179857f();
        if (strM179857f.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        r5d0 r5d0Var2 = new r5d0(strM179857f.substring(1), null, r5d0Var.m179856e(), BarcodeFormat.UPC_A);
        if (r5d0Var.m179855d() != null) {
            r5d0Var2.m179858g(r5d0Var.m179855d());
        }
        return r5d0Var2;
    }

    @Override // p153l.sp50, p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return m177455r(this.f158876i.mo96539a(cy2Var, map));
    }

    @Override // p153l.vpj0, p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m177455r(this.f158876i.mo99812b(i, b13Var, map));
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: k */
    public int mo172489k(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.f158876i.mo172489k(b13Var, iArr, sb);
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: l */
    public r5d0 mo177456l(int i, b13 b13Var, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m177455r(this.f158876i.mo177456l(i, b13Var, iArr, map));
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo172490p() {
        return BarcodeFormat.UPC_A;
    }
}
