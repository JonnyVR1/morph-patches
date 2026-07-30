package com.appsflyer.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFAdRevenueData = null;
    private static int getCurrencyIso4217Code = 1;
    private static int getRevenue;

    static {
        getMonetizationNetwork();
        getRevenue = (getCurrencyIso4217Code + 15) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if ((r8 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r8 = 22 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r7.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r7.length() < 118) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r7.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r8 = (com.appsflyer.internal.AFg1xSDK.getCurrencyIso4217Code + 93) % 128;
        com.appsflyer.internal.AFg1xSDK.getRevenue = r8;
        r8 = r8 + 43;
        com.appsflyer.internal.AFg1xSDK.getCurrencyIso4217Code = r8 % 128;
     */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
        String mediationNetwork;
        int i = getRevenue + 35;
        getCurrencyIso4217Code = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[5];
            strArr[0] = str2;
            strArr[0] = str3;
            strArr[4] = str4;
            strArr[2] = str5;
            strArr[5] = "";
            mediationNetwork = AFb1iSDK.getMediationNetwork(TextUtils.join("\u2063", strArr), str);
        } else {
            mediationNetwork = AFb1iSDK.getMediationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5249a(int[] iArr, boolean z, String str, Object[] objArr) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        int i;
        String str2 = str;
        $11 = ($10 + 61) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1xSDK aFk1xSDK = new AFk1xSDK();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = AFAdRevenueData;
        if (cArr2 != null) {
            int i6 = $10 + 41;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                cArr[i] = (char) (((long) cArr2[i]) ^ 1680572615822685474L);
                i++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            aFk1xSDK.getCurrencyIso4217Code = 0;
            char c = 0;
            while (true) {
                int i7 = aFk1xSDK.getCurrencyIso4217Code;
                if (i7 >= i3) {
                    break;
                }
                if (bArr[i7] == 1) {
                    cArr4[i7] = (char) (((cArr3[i7] * 2) + 1) - c);
                } else {
                    cArr4[i7] = (char) ((cArr3[i7] * 2) - c);
                    $11 = ($10 + 103) % 128;
                }
                c = cArr4[i7];
                aFk1xSDK.getCurrencyIso4217Code = i7 + 1;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i8 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i8, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            aFk1xSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i9 = aFk1xSDK.getCurrencyIso4217Code;
                if (i9 >= i3) {
                    break;
                }
                $11 = ($10 + 67) % 128;
                cArr6[i9] = cArr3[(i3 - i9) - 1];
                aFk1xSDK.getCurrencyIso4217Code = i9 + 1;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            aFk1xSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i10 = aFk1xSDK.getCurrencyIso4217Code;
                if (i10 >= i3) {
                    break;
                }
                $11 = ($10 + 117) % 128;
                cArr3[i10] = (char) (cArr3[i10] - iArr[2]);
                aFk1xSDK.getCurrencyIso4217Code = i10 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @NonNull
    private static AFi1vSDK getCurrencyIso4217Code(@NonNull AFh1aSDK aFh1aSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) throws UnsupportedEncodingException {
        String string;
        if (str == null) {
            return new AFi1vSDK(aFh1aSDK.getCurrencyIso4217Code == AFh1eSDK.DEFAULT, AFi1uSDK.NA);
        }
        Object[] objArr = new Object[1];
        m5249a(new int[]{0, 64, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 41}, true, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFh1aSDK.getCurrencyIso4217Code == AFh1eSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = AFAdRevenueData(new StringBuilder(str3).reverse().toString(), aFh1aSDK.AFAdRevenueData, "android", "v1", string).equals(str);
        return new AFi1vSDK(zEquals, zEquals ? AFi1uSDK.SUCCESS : AFi1uSDK.FAILURE);
    }

    public static void getMonetizationNetwork() {
        AFAdRevenueData = new char[]{13633, 13797, 13797, 13806, 13806, 13796, 13799, 13796, 13797, 13798, 13798, 13799, 13799, 13804, 13807, 13793, 13793, 13797, 13797, 13797, 13796, 13798, 13799, 13796, 13799, 13793, 13798, 13799, 13798, 13796, 13803, 13803, 13797, 13799, 13797, 13797, 13799, 13798, 13796, 13796, 13798, 13801, 13800, 13793, 13798, 13799, 13798, 13800, 13807, 13799, 13792, 13799, 13802, 13802, 13796, 13798, 13796, 13796, 13798, 13793, 13799, 13807, 13806, 13804};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    @NonNull
    public final AFi1vSDK getMonetizationNetwork(@NonNull AFh1aSDK aFh1aSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (aFh1aSDK != null) {
            int i = getRevenue + 113;
            int i2 = i % 128;
            getCurrencyIso4217Code = i2;
            if (i % 2 == 0) {
                int i3 = 51 / 0;
                if (str2 != null) {
                    if (str3 != null) {
                        getRevenue = (i2 + 91) % 128;
                        return getCurrencyIso4217Code(aFh1aSDK, str, str2, str3);
                    }
                }
            } else if (str2 != null) {
                if (str3 != null) {
                    getRevenue = (i2 + 91) % 128;
                    return getCurrencyIso4217Code(aFh1aSDK, str, str2, str3);
                }
            }
        }
        return new AFi1vSDK(false, AFi1uSDK.INTERNAL_ERROR);
    }
}
