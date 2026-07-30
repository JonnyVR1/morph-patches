package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.ByteArrayOutputStream;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes7.dex */
public class je2 {

    /* JADX INFO: renamed from: a */
    private static char[] f117464a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b */
    private static byte[] f117465b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, HttpTokens.COLON, HttpTokens.SEMI_COLON, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, HttpTokens.SPACE, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static byte[] m141097a(byte[] bArr) throws Exception {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (i < length) {
            while (i < bArr.length) {
                int i2 = i + 1;
                b = f117465b[bArr[i]];
                if (i2 >= length || b != -1) {
                    i = i2;
                    break;
                }
                i = i2;
            }
            if (b == -1) {
                break;
            }
            while (i < bArr.length) {
                int i3 = i + 1;
                b2 = f117465b[bArr[i]];
                if (i3 >= length || b2 != -1) {
                    i = i3;
                    break;
                }
                i = i3;
            }
            if (b2 == -1) {
                break;
            }
            byteArrayOutputStream.write((b << 2) | ((b2 & 48) >>> 4));
            while (i < bArr.length) {
                int i4 = i + 1;
                byte b5 = bArr[i];
                if (b5 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b6 = f117465b[b5];
                if (i4 >= length || b6 != -1) {
                    b3 = b6;
                    i = i4;
                    break;
                }
                b3 = b6;
                i = i4;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b2 & 15) << 4) | ((b3 & 60) >>> 2));
            while (i < bArr.length) {
                int i5 = i + 1;
                byte b7 = bArr[i];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b8 = f117465b[b7];
                if (i5 >= length || b8 != -1) {
                    b4 = b8;
                    i = i5;
                    break;
                }
                b4 = b8;
                i = i5;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 3) << 6) | b4);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static String m141098b(byte[] bArr) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b = bArr[i];
            int i3 = b & 255;
            if (i2 == length) {
                stringBuffer.append(f117464a[i3 >>> 2]);
                stringBuffer.append(f117464a[(b & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i + 2;
            byte b2 = bArr[i2];
            if (i4 == length) {
                stringBuffer.append(f117464a[i3 >>> 2]);
                stringBuffer.append(f117464a[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                stringBuffer.append(f117464a[(b2 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b3 = bArr[i4];
            stringBuffer.append(f117464a[i3 >>> 2]);
            stringBuffer.append(f117464a[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
            stringBuffer.append(f117464a[((b2 & 15) << 2) | ((b3 & 192) >>> 6)]);
            stringBuffer.append(f117464a[b3 & Utf8.REPLACEMENT_BYTE]);
        }
        return stringBuffer.toString();
    }
}
