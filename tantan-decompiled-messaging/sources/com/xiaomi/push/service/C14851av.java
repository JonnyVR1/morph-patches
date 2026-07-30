package com.xiaomi.push.service;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.aag0;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.av */
/* JADX INFO: loaded from: classes2.dex */
public class C14851av {

    /* JADX INFO: renamed from: a */
    private static RSAPublicKey f62986a;

    /* JADX INFO: renamed from: a */
    private static final byte[] f62987a;

    static {
        byte[] bArr = {48, -127, -97, 48, HttpTokens.CARRIAGE_RETURN, 6, 9, 42, -122, 72, -122, -9, HttpTokens.CARRIAGE_RETURN, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -109, -38, -114, 26, -72, 78, Tnaf.POW_2_WIDTH, 70, -90, 113, -30, 36, 85, -3, -43, 123, 61, -98, 4, -16, 67, 19, -90, -73, -5, -89, 36, 44, -27, HttpTokens.SEMI_COLON, -123, 72, -73, -48, 49, HttpTokens.CARRIAGE_RETURN, Tnaf.POW_2_WIDTH, 50, -27, -82, 18, -28, 84, 0, -41, Tnaf.POW_2_WIDTH, 69, -39, 7, 82, 56, 79, -37, 40, 85, 107, 98, 33, 123, -34, -49, 111, -11, 49, 28, 117, -74, 114, -122, -29, -84, 82, 22, -122, 42, -40, -79, 18, -116, -42, 101, -70, 44, 11, 62, -49, -3, -22, -2, 66, 90, -116, -75, -99, 34, 121, 69, 10, -81, -57, 89, -23, -36, -60, -81, 67, -114, 10, 79, 100, 29, 47, -24, 110, -66, -7, 87, Tnaf.POW_2_WIDTH, -125, -91, -43, -103, 67, -20, 41, 117, -37, -11, 2, 3, 1, 0, 1};
        f62987a = bArr;
        try {
            f62986a = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable unused) {
            ilq0.m137025B("rsa key pair init failure!!!");
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m86570a(Cipher cipher, int i, byte[] bArr, int i2) {
        if (cipher != null && bArr != null) {
            int i3 = i == 2 ? i2 / 8 : (i2 / 8) - 11;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (bArr.length > i4) {
                    byte[] bArrDoFinal = bArr.length - i4 > i3 ? cipher.doFinal(bArr, i4, i3) : cipher.doFinal(bArr, i4, bArr.length - i4);
                    byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                    i5++;
                    i4 = i5 * i3;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                aag0.m95543a(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m86569a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, f62986a);
            return Base64.encodeToString(m86570a(cipher, 1, str.getBytes("UTF-8"), f62986a.getModulus().bitLength()), 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
