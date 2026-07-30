package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.zxing.BarcodeFormat;
import java.util.Vector;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class shd {

    /* JADX INFO: renamed from: a */
    private static final Pattern f168692a = Pattern.compile(Constants.SEPARATOR_COMMA);

    /* JADX INFO: renamed from: b */
    public static final Vector<BarcodeFormat> f168693b;

    /* JADX INFO: renamed from: c */
    public static final Vector<BarcodeFormat> f168694c;

    /* JADX INFO: renamed from: d */
    public static final Vector<BarcodeFormat> f168695d;

    /* JADX INFO: renamed from: e */
    public static final Vector<BarcodeFormat> f168696e;

    static {
        Vector<BarcodeFormat> vector = new Vector<>(5);
        f168693b = vector;
        vector.add(BarcodeFormat.UPC_A);
        vector.add(BarcodeFormat.UPC_E);
        vector.add(BarcodeFormat.EAN_13);
        vector.add(BarcodeFormat.EAN_8);
        Vector<BarcodeFormat> vector2 = new Vector<>(vector.size() + 4);
        f168694c = vector2;
        vector2.addAll(vector);
        vector2.add(BarcodeFormat.CODE_39);
        vector2.add(BarcodeFormat.CODE_93);
        vector2.add(BarcodeFormat.CODE_128);
        vector2.add(BarcodeFormat.ITF);
        Vector<BarcodeFormat> vector3 = new Vector<>(1);
        f168695d = vector3;
        vector3.add(BarcodeFormat.QR_CODE);
        Vector<BarcodeFormat> vector4 = new Vector<>(1);
        f168696e = vector4;
        vector4.add(BarcodeFormat.DATA_MATRIX);
    }
}
