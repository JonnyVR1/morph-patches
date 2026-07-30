package com.guardsquare.dexguard.runtime.devicefingerprinting;

import android.text.TextUtils;
import java.io.File;
import java.math.BigInteger;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ǃ */
/* JADX INFO: loaded from: classes7.dex */
final class C3474 {

    /* JADX INFO: renamed from: ˊ */
    private static final byte[] f11793 = null;

    /* JADX INFO: renamed from: ˋ */
    private static int f11794 = 0;

    /* JADX INFO: renamed from: ˎ */
    private static String f11795 = null;

    /* JADX INFO: renamed from: ˏ */
    private static final C3475.C22800 f11796;

    /* JADX INFO: renamed from: ॱ */
    private static int f11797 = 0;

    /* JADX INFO: renamed from: ॱॱ */
    private static int f11798 = 1;

    static {
        m17489();
        int i = f11797;
        byte[] bArr = f11793;
        new BigInteger(m17490(77, (byte) ((i & (-4)) + (i | (-4))), (byte) (-bArr[86])), 16);
        int i2 = f11797;
        new BigInteger(m17490(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, (byte) ((i2 ^ (-4)) + ((i2 & (-4)) << 1)), bArr[14]), 16);
        new BigInteger(m17490((short) (-bArr[22]), (byte) (f11797 - 4), (byte) ((-2) - (bArr[14] ^ (-1)))), 16);
        int i3 = f11797;
        new BigInteger(m17490(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, (byte) (((i3 | (-4)) << 1) - (i3 ^ (-4))), bArr[4]), 16);
        new BigInteger(m17490(108, (byte) (f11797 - 4), bArr[70]), 16);
        short s = bArr[139];
        new BigInteger(m17490(s, (byte) (s & 31), bArr[14]), 16);
        new C3475.C22800();
        f11795 = null;
        f11796 = new C3475.C22800();
        new C3475.C22800();
        int i4 = f11798;
        f11794 = ((i4 & 47) + (i4 | 47)) % 128;
    }

    /* JADX INFO: renamed from: ˊ */
    public static String m17488() {
        String string;
        int i = f11794;
        f11798 = ((i ^ 93) + ((i & 93) << 1)) % 128;
        if (f11795 == null) {
            byte[] bArr = f11793;
            String[] list = new File(m17490(68, bArr[42], bArr[11])).list();
            int length = list.length;
            int i2 = 0;
            while (i2 < length) {
                String str = list[i2];
                StringBuilder sb = new StringBuilder();
                byte[] bArr2 = f11793;
                sb.append(m17490(72, bArr2[9], bArr2[11]));
                sb.append(str);
                sb.append(m17490((short) (f11797 - 5), bArr2[6], bArr2[11]));
                String string2 = sb.toString();
                short s = bArr2[139];
                byte b = bArr2[70];
                String strM17492 = C3475.m17492(string2, m17490(s, b, (byte) ((b ^ 100) | (b & 100))), f11796);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f11795);
                if (TextUtils.isEmpty(strM17492)) {
                    int i3 = (f11798 + 49) % 128;
                    f11794 = i3;
                    f11798 = (((i3 | 33) << 1) - (i3 ^ 33)) % 128;
                    string = "";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(strM17492);
                    short s2 = (short) (f11797 - 5);
                    byte b2 = bArr2[70];
                    sb3.append(m17490(s2, b2, (byte) ((b2 ^ 90) | (b2 & 90))));
                    string = sb3.toString();
                    int i4 = f11794;
                    f11798 = (((i4 | 35) << 1) - (i4 ^ 35)) % 128;
                }
                sb2.append(string);
                f11795 = sb2.toString();
                i2 = ((i2 & 1) << 1) + (i2 ^ 1);
                int i5 = f11794;
                f11798 = (((i5 | 71) << 1) - (i5 ^ 71)) % 128;
            }
        }
        String str2 = f11795;
        f11798 = (f11794 + 63) % 128;
        return str2;
    }

    /* JADX INFO: renamed from: ˎ */
    private static void m17489() {
        f11793 = new byte[]{61, -8, -21, 10, 2, -43, 7, 7, 54, 5, -41, 53, -40, 8, 51, 10, 1, -41, 9, 51, -43, 53, -37, 6, 46, 7, 14, 1, -41, 9, 1, HttpTokens.COLON, -46, 10, 2, -46, -4, 15, -2, 9, 1, 15, 4, -39, 3, 52, 4, 8, -41, 8, 49, 11, -43, 49, 15, 2, 7, 5, 3, -38, 52, -38, 46, 14, 1, -37, 4, 7, 3, HttpTokens.COLON, 0, 6, 4, -59, 4, 9, 18, -59, 4, 9, 18, HttpTokens.COLON, 8, 5, HttpTokens.CARRIAGE_RETURN, 5, -44, 7, 47, 10, 3, -37, 51, 3, -37, 52, 8, -41, 5, 53, 2, 12, 7, 6, -44, 4, 7, 9, 7, 4, 4, 7, 5, 51, 7, 9, 1, 8, -40, 6, 4, HttpTokens.COLON, -43, 48, 9, -37, 46, -34, 46, HttpTokens.CARRIAGE_RETURN, -46, 9, 53, -40, 5, 49, -40, 52, 12, -1, 14, 0, 10, -42, -2, 12, 1, 9, -38, 6, 1, 10, 6, 52, 5, 9, -46, 57, 0, -35, 51, 11, -1, 4, 10, 10, 4, -45, 54, 6, 4, -36, 6, 3, 9, 48, -37, 49, 12, 3, 6, -43, 7, 9, 5, 51, -39, 53, 4, -37, 52, -44, 55, 7, -41, 53, 3, 3, HttpTokens.CARRIAGE_RETURN, 6, 3, -41, 5, 7, 55, -44};
        f11797 = 35;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:11:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0033
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ˏ */
    private static java.lang.String m17490(int r6, byte r7, int r8) {
        /*
            int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3474.f11798
            int r0 = r0 + 121
            int r0 = r0 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3474.f11794 = r0
            byte[] r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3474.f11793
            int r8 = 100 - r8
            int r6 = r6 + 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L3a
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L33
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            java.lang.String r6 = r6.intern()
            int r7 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3474.f11798
            int r7 = r7 + 23
            int r7 = r7 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3474.f11794 = r7
            return r6
        L33:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L3a:
            int r6 = r6 - r4
            int r6 = r6 + 6
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3474.m17490(int, byte, int):java.lang.String");
    }
}
