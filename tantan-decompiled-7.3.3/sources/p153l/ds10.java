package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ds10 implements qkq0 {

    /* JADX INFO: renamed from: l.ds10$a */
    public static /* synthetic */ class C16615a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90449a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f90449a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90449a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90449a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90449a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90449a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90449a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90449a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f90449a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f90449a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f90449a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f90449a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f90449a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f90449a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        qkq0 sjeVar;
        switch (C16615a.f90449a[barcodeFormat.ordinal()]) {
            case 1:
                sjeVar = new sje();
                break;
            case 2:
                sjeVar = new ypj0();
                break;
            case 3:
                sjeVar = new qje();
                break;
            case 4:
                sjeVar = new rpj0();
                break;
            case 5:
                sjeVar = new nvb0();
                break;
            case 6:
                sjeVar = new fc5();
                break;
            case 7:
                sjeVar = new hc5();
                break;
            case 8:
                sjeVar = new Code128Writer();
                break;
            case 9:
                sjeVar = new s6m();
                break;
            case 10:
                sjeVar = new d960();
                break;
            case 11:
                sjeVar = new cc5();
                break;
            case 12:
                sjeVar = new y5c();
                break;
            case 13:
                sjeVar = new aq1();
                break;
            default:
                wg3.m206174a("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
                return null;
        }
        return sjeVar.mo17401a(str, barcodeFormat, i, i2, map);
    }
}
