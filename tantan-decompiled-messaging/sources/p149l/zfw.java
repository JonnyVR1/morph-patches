package p149l;

import com.clevertap.android.sdk.Constants;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes7.dex */
public class zfw {

    /* JADX INFO: renamed from: a */
    private static final String f202990a = sgw.m184137a(new byte[]{101, 50, 119, 26, 89});

    /* JADX INFO: renamed from: b */
    private static char[] f202991b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: c */
    private static byte[] f202992c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, HttpTokens.COLON, HttpTokens.SEMI_COLON, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, HttpTokens.SPACE, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static String m218624a(byte[] bArr) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b = bArr[i];
            int i3 = b & 255;
            if (i2 == length) {
                stringBuffer.append(f202991b[i3 >>> 2]);
                stringBuffer.append(f202991b[(b & 3) << 4]);
                stringBuffer.append(sgw.m184137a(new byte[]{HttpTokens.CARRIAGE_RETURN, 91}));
                break;
            }
            int i4 = i + 2;
            byte b2 = bArr[i2];
            if (i4 == length) {
                stringBuffer.append(f202991b[i3 >>> 2]);
                stringBuffer.append(f202991b[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                stringBuffer.append(f202991b[(b2 & 15) << 2]);
                stringBuffer.append(sgw.m184137a(new byte[]{HttpTokens.CARRIAGE_RETURN}));
                break;
            }
            i += 3;
            byte b3 = bArr[i4];
            stringBuffer.append(f202991b[i3 >>> 2]);
            stringBuffer.append(f202991b[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
            stringBuffer.append(f202991b[((b2 & 15) << 2) | ((b3 & 192) >>> 6)]);
            stringBuffer.append(f202991b[b3 & Utf8.REPLACEMENT_BYTE]);
        }
        return stringBuffer.toString();
    }
}
