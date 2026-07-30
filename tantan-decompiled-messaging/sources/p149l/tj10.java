package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class tj10 implements lbq0 {

    /* JADX INFO: renamed from: l.tj10$a */
    public static /* synthetic */ class C20185a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170643a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f170643a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f170643a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f170643a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f170643a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f170643a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f170643a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f170643a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f170643a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f170643a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f170643a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f170643a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f170643a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f170643a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        lbq0 oieVar;
        switch (C20185a.f170643a[barcodeFormat.ordinal()]) {
            case 1:
                oieVar = new oie();
                break;
            case 2:
                oieVar = new vgj0();
                break;
            case 3:
                oieVar = new mie();
                break;
            case 4:
                oieVar = new ogj0();
                break;
            case 5:
                oieVar = new jnb0();
                break;
            case 6:
                oieVar = new fb5();
                break;
            case 7:
                oieVar = new hb5();
                break;
            case 8:
                oieVar = new Code128Writer();
                break;
            case 9:
                oieVar = new c4m();
                break;
            case 10:
                oieVar = new y060();
                break;
            case 11:
                oieVar = new cb5();
                break;
            case 12:
                oieVar = new q4c();
                break;
            case 13:
                oieVar = new tp1();
                break;
            default:
                ig3.m135964a("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
                return null;
        }
        return oieVar.mo17346a(str, barcodeFormat, i, i2, map);
    }
}
