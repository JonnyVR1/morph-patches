package com.guardsquare.dexguard.runtime.devicefingerprinting;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.regex.Pattern;
import org.spongycastle.crypto.tls.AlertDescription;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public final class FingerprintGenerator {
    public static final int ADVERTISING_ID = 16;
    public static final int APP_PROCESS = 64;
    public static final int APP_USER_ID = 32;
    public static final int DEVICE = 1;
    public static final int OS_BUILD_INFO = 4;
    public static final int OS_SESSION = 8;
    public static String[] REQUIRED_PERMISSIONS = null;
    public static final int SIM_CARD = 2;

    /* JADX INFO: renamed from: ʼ */
    private static int f11734 = 0;

    /* JADX INFO: renamed from: ʽ */
    private static int f11735 = 1;

    /* JADX INFO: renamed from: ˊ */
    private static final byte[] f11736 = null;

    /* JADX INFO: renamed from: ˋ */
    private static final byte[] f11737;

    /* JADX INFO: renamed from: ˎ */
    private static final String[] f11738;

    /* JADX INFO: renamed from: ˏ */
    private static final String[] f11739;

    /* JADX INFO: renamed from: ॱ */
    private static final Pattern f11740;

    /* JADX INFO: renamed from: ᐝ */
    private static int f11741;

    static {
        m17417();
        byte[] bArr = f11736;
        REQUIRED_PERMISSIONS = new String[]{m17419(bArr[392], (byte) (-bArr[318]), (short) 608), m17419((byte) (-bArr[433]), (byte) (-bArr[318]), (short) 269), m17419((byte) (-bArr[222]), (byte) (-bArr[318]), (short) 506)};
        String strM17419 = m17419(bArr[392], (byte) (f11741 & 494), (short) 532);
        byte b = (byte) (-bArr[102]);
        String strM174110 = m17419(b, (byte) (b << 1), (short) 642);
        byte b2 = bArr[105];
        byte b3 = (byte) (f11741 & 494);
        f11738 = new String[]{strM17419, strM174110, m17419(b2, b3, (short) ((b3 ^ 407) | (b3 & 407)))};
        f11740 = Pattern.compile(m17419((byte) (bArr[392] - 1), (byte) ((-2) - (bArr[143] ^ (-1))), (short) 304));
        String strM174111 = m17419(bArr[31], bArr[268], (short) 266);
        byte b4 = bArr[48];
        byte b5 = bArr[31];
        f11739 = new String[]{strM174111, m17419(b4, b5, (short) ((b5 ^ 191) | (b5 & 191)))};
        f11737 = new byte[0];
        int i = f11735;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        f11734 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private FingerprintGenerator() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ca A[EDGE_INSN: B:26:0x00ca->B:27:0x00d0 BREAK  A[LOOP:0: B:11:0x0043->B:24:0x00bb], PHI: r5
      0x00ca: PHI (r5v1 char) = (r5v0 char), (r5v0 char), (r5v45 char) binds: [B:7:0x0023, B:9:0x0035, B:154:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    public static Fingerprint generateFingerprint(Context context, int i) throws Throwable {
        int i2;
        char c;
        char c2;
        Throwable th;
        char c3;
        char c4;
        char c5;
        char c6;
        byte b;
        byte b2;
        short s;
        C3447 c3447 = new C3447(context);
        int i3 = i & 3;
        if (i3 == 0) {
            int i4 = f11735;
            f11734 = ((i4 & 71) + (i4 | 71)) % 128;
            i2 = i3 | (i ^ 3);
        } else {
            i2 = i;
        }
        char c7 = ':';
        char c8 = 0;
        if ((i2 & 1) == 0) {
            c = c7;
            c2 = 31;
            th = null;
            break;
        }
        int i5 = f11734;
        f11735 = ((i5 ^ 21) + ((i5 & 21) << 1)) % 128;
        if (Build.VERSION.SDK_INT >= 26) {
            c = c7;
            c2 = 31;
            th = null;
            break;
        }
        f11734 = (f11735 + 47) % 128;
        String[] strArr = f11739;
        int length = strArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                c = c7;
                c2 = 31;
                th = null;
                break;
            }
            byte[] bArrM17421 = m17421(strArr[i6], C3447.m17422(c3447));
            StringBuilder sb = new StringBuilder(17);
            int length2 = bArrM17421.length;
            int i7 = 0;
            while (i7 < length2) {
                int i8 = f11735 + 69;
                f11734 = i8 % 128;
                if (i8 % 2 != 0) {
                    byte b3 = bArrM17421[i7];
                    sb.length();
                    throw null;
                }
                byte b4 = bArrM17421[i7];
                if (sb.length() > 0) {
                    sb.append(c7);
                }
                byte b5 = f11736[31];
                sb.append(String.format(m17419(b5, (byte) ((b5 ^ 82) | (b5 & 82)), (short) (f11741 << 2)), Byte.valueOf(b4)));
                i7 = (i7 & 1) + (i7 | 1);
                c7 = c7;
            }
            c = c7;
            c2 = 31;
            th = null;
            if (m17418(sb.toString())) {
                c3447.m17429(bArrM17421);
                break;
            }
            i6 = (i6 ^ 1) + ((i6 & 1) << 1);
            c7 = c;
        }
        if ((i2 & 2) != 0) {
            try {
                byte[] bArr = f11736;
                String strM17419 = m17419(bArr[c], bArr[15], (short) (-bArr[318]));
                Context contextM17424 = C3447.m17424(c3447);
                Class[] clsArr = {String.class};
                c3 = '&';
                try {
                    Object[] objArr = new Object[1];
                    c4 = '\b';
                    try {
                        c8 = 0;
                        try {
                            objArr[0] = m17419(bArr[48], bArr[8], (short) 502);
                            String str = (String) C3452.m17446(m17419(bArr[8], bArr[15], (short) 450), C3452.m17448(strM17419, contextM17424, clsArr, objArr, C3447.m17422(c3447)), C3447.m17422(c3447));
                            if (str != null && m17420(str)) {
                                int i9 = f11734;
                                f11735 = ((i9 & 35) + (i9 | 35)) % 128;
                                c3447.m17430(str.getBytes());
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        c8 = 0;
                    }
                } catch (Exception unused3) {
                    c4 = '\b';
                }
            } catch (Exception unused4) {
                c3 = '&';
            }
            try {
                byte[] bArr2 = f11736;
                String strM174110 = m17419(bArr2[c], bArr2[15], (short) (-bArr2[318]));
                Context contextM17425 = C3447.m17424(c3447);
                Class[] clsArr2 = new Class[1];
                clsArr2[c8] = String.class;
                Object[] objArr2 = new Object[1];
                objArr2[c8] = m17419(bArr2[48], bArr2[c4], (short) 502);
                Object objM17448 = C3452.m17448(strM174110, contextM17425, clsArr2, objArr2, C3447.m17422(c3447));
                byte b6 = bArr2[c3];
                byte b7 = bArr2[15];
                String str2 = (String) C3452.m17446(m17419(b6, b7, (short) ((b7 ^ 361) | (b7 & 361))), objM17448, C3447.m17422(c3447));
                if (str2 != null) {
                    c3447.m17430(str2.getBytes());
                }
            } catch (Exception unused5) {
            }
        } else {
            c8 = 0;
            c3 = '&';
            c4 = '\b';
        }
        if ((i2 & 4) != 0) {
            byte[] bArr3 = f11736;
            c3447.m17427(m17419(bArr3[60], bArr3[25], bArr3[456]));
            c3447.m17427(m17419(bArr3[15], bArr3[25], (short) 460));
            byte b8 = bArr3[c];
            byte b9 = bArr3[25];
            c3447.m17427(m17419(b8, b9, (short) (b9 | 354)));
            c3447.m17427(m17419(bArr3[64], bArr3[25], (short) 434));
            c3447.m17427(m17419(bArr3[64], bArr3[25], (short) 394));
            c3447.m17427(m17419(bArr3[81], bArr3[25], (short) 162));
            try {
                ContentResolver contentResolver = C3447.m17424(c3447).getContentResolver();
                String strM174111 = m17419(bArr3[25], bArr3[15], (short) 426);
                c5 = '<';
                try {
                    Class<?> cls = Class.forName(m17419((byte) (bArr3[109] - 1), (byte) (-bArr3[318]), AlertDescription.unknown_psk_identity));
                    Class[] clsArr3 = new Class[2];
                    try {
                        c6 = 25;
                        try {
                            clsArr3[c8] = Class.forName(m17419(bArr3[34], (byte) (-bArr3[318]), (short) 236));
                            clsArr3[1] = String.class;
                            Object[] objArr3 = new Object[2];
                            objArr3[c8] = contentResolver;
                            objArr3[1] = m17419(bArr3[9], (byte) (-bArr3[318]), (short) 580);
                            String str3 = (String) C3452.m17448(strM174111, cls, clsArr3, objArr3, C3447.m17422(c3447));
                            if (str3 != null) {
                                c3447.m17430(str3.getBytes());
                                int i10 = f11734;
                                f11735 = (((i10 | 99) << 1) - (i10 ^ 99)) % 128;
                            }
                            int i11 = f11735;
                            f11734 = ((i11 ^ 121) + ((i11 & 121) << 1)) % 128;
                        } catch (Exception unused6) {
                        }
                    } catch (Exception unused7) {
                        c6 = 25;
                    }
                } catch (Exception unused8) {
                }
            } catch (Exception unused9) {
                c5 = '<';
            }
        } else {
            c5 = '<';
            c6 = 25;
        }
        if ((i2 & 8) != 0) {
            int i12 = f11735;
            int i13 = ((i12 | 45) << 1) - (i12 ^ 45);
            f11734 = i13 % 128;
            if (i13 % 2 != 0) {
                byte[] bArr4 = f11736;
                b = bArr4[85];
                b2 = bArr4[112];
                s = 29319;
            } else {
                byte[] bArr5 = f11736;
                b = bArr5[15];
                b2 = bArr5[c6];
                s = 337;
            }
            c3447.m17427(m17419(b, b2, s));
        }
        if ((i2 & 16) != 0) {
            f11734 = (f11735 + 3) % 128;
            try {
                String strM17456 = C3453.m17456(C3447.m17424(c3447));
                if (strM17456 != null) {
                    c3447.m17429(strM17456.getBytes());
                }
            } catch (Exception unused10) {
            }
        }
        if ((i2 & 32) != 0) {
            try {
                byte[] bArr6 = f11736;
                byte b10 = bArr6[c4];
                byte b11 = bArr6[15];
                String strM174112 = m17419(b10, b11, (short) (b11 | 550));
                Class<?> cls2 = Class.forName(m17419((byte) (-bArr6[188]), bArr6[105], bArr6[18]));
                Class[] clsArr4 = new Class[1];
                clsArr4[c8] = Class.forName(m17419(bArr6[c5], (byte) (-bArr6[318]), bArr6[c2]));
                Object[] objArr4 = new Object[1];
                objArr4[c8] = C3447.m17424(c3447);
                String str4 = (String) C3452.m17446(m17419(bArr6[48], bArr6[15], AlertDescription.certificate_unobtainable), C3452.m17448(strM174112, cls2, clsArr4, objArr4, C3447.m17422(c3447)), C3447.m17422(c3447));
                if (str4 != null) {
                    int i14 = f11735 + 87;
                    f11734 = i14 % 128;
                    if (i14 % 2 != 0) {
                        c3447.m17429(str4.getBytes());
                        throw th;
                    }
                    c3447.m17429(str4.getBytes());
                }
            } catch (Exception unused11) {
            }
            try {
                byte[] bArr7 = f11736;
                byte b12 = bArr7[c4];
                byte b13 = bArr7[15];
                String str5 = (String) C3452.m17446(m17419(bArr7[48], bArr7[15], AlertDescription.certificate_unobtainable), C3452.m17446(m17419(b12, b13, (short) (b13 | 550)), Class.forName(m17419(bArr7[315], bArr7[105], (short) 195)), C3447.m17422(c3447)), C3447.m17422(c3447));
                if (str5 != null) {
                    int i15 = f11735;
                    int i16 = (i15 ^ 7) + ((i15 & 7) << 1);
                    f11734 = i16 % 128;
                    if (i16 % 2 != 0) {
                        c3447.m17429(str5.getBytes());
                        throw th;
                    }
                    c3447.m17429(str5.getBytes());
                }
            } catch (Exception unused12) {
            }
        }
        if ((i2 & 64) != 0) {
            int i17 = f11735;
            f11734 = ((i17 & 43) + (i17 | 43)) % 128;
            try {
                byte[] bArr8 = f11736;
                byte b14 = bArr8[48];
                byte b15 = bArr8[389];
                c3447.m17428(((Integer) C3452.m17446(m17419(b14, b15, (short) (b15 | 97)), Class.forName(m17419(bArr8[c3], (byte) (-bArr8[318]), (short) 174)), C3447.m17422(c3447))).intValue());
            } catch (Exception unused13) {
            }
            try {
                byte[] bArr9 = f11736;
                c3447.m17428(((Integer) C3452.m17446(m17419(bArr9[48], bArr9[389], (short) 576), Class.forName(m17419(bArr9[c3], (byte) (-bArr9[318]), (short) 174)), C3447.m17422(c3447))).intValue());
            } catch (Exception unused14) {
            }
        }
        Fingerprint fingerprintM17426 = c3447.m17426();
        int i18 = f11735;
        int i19 = (i18 ^ 75) + ((i18 & 75) << 1);
        f11734 = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 52 / 0;
        }
        return fingerprintM17426;
    }

    /* JADX INFO: renamed from: ˊ */
    private static void m17417() {
        byte[] bArr = new byte[685];
        System.arraycopy("ccüwô\u000bó\u0004\u0007\u00067Ìõ\u0002û\u0010øûGìÕ\u0002û\u0010î\u0005\u0003ò\"Û\u0007\u0000\u0010ù\u001bïôý\u000e\u0007ÿ\u0003ò(íÿ#Þ\u0001ó\u000eó\u0001\u0004B¿ÿ\u0004\fð\u0013ðGÂ\rôú\u0010\u0006ÿð\u0000\u0004\u000eôõ\u0003@Èù\u0001\tü\b8Îô\u000bó\u0004\u0007\u00067ÈûûFÆ\u0001\u00067æÜü\u0000\u0014ô\fÿ\u001d\u0006õ*è\u0006\u0003ò,æô\u000bó\u0004\u0007\u00067¿ÿ\u0004ú\u000e\u0006\u0000ôEÜïò\u0001\fü\bõPÒï\u0003ï\u0004\u000eÿù\u000b\u0001÷\u000b\u0001÷\u000b\u0001÷\u000b\u0001÷\u000b\u0001\u0004BÍî\rþ\t7Çúý\u0000ô\u000bó\u0004\u0007\u00067ÀýFßß\u0004\rÿó\u0001\f\fô?õ\u0003@Èù\u0001\tü\b8Éþø\u000e\u0004\u0002ï\u000f8Æ\u0001\u00067éÞø\u000e\u0004\u0002ï\u000f\u001dÜü\u0000\u0014ô\fÿ\u001dæô\u000bó\u0004\u0007\u00067Ìõ\u0002û\u0010øûGìÕ\u0002û\u0010øû#îó\u0005\u0004÷\u0012ôò\r9ô\u000bó\u0004\u0007\u00067¿\fô\u0006\u0005÷\u0001\u000bû\u0002Aîÿ\u0001ÿó\u0001õ\t\u000f\u0004þë\r\u0000\u0014î\u0010Î,\u0004õÙ5È&\u0015èêãJ¶D\u0012¯G¹#,\u0004õÙ5È&\u0015èêãJ¶\u0004B½þ\bû\fý\t8Éþø\u0000\u0000\u0013ô\u0001üöÿ»\u0004B¿ÿ\u0004\fð\u0013ðGÂÿ\f\u0000ú\u000f\u0004þ\u0003ò\"ëý\u001bïô\n\tö\u001fÚ\t\fþô\u0004BÍô\u000fð\u000f7¿\u0005\fî\u000føþ\u0006\u0003ò2Õ\u0002\u0001\n\u0003ð\fû\u0002&Ü\tø\u0003ò\"à\u0003\nü\b\u0004B¿ÿ\u0004\fð\u0013ðGË\u0000ð\u000e\u0007ÿ\u0003ò1àð\u000e\u0007ÿ\u001dæ\u0004BÍî\rþ\t7Éþü\b\u0003ô\u0003ÿ\nüû½û\u0007EÍø\fï\u0001EÃ\u0001\u000b\u0005øúý\u0000FÃ\u0001\u000b3\tú\u0002\nô\u000bó\u0004\u0007\u00067¿\fô\u0006\u0005÷\u0001\u000bû\u0002Aæüû\u0010ô\u0005\nò½û\u0007EÍø\fï\u0001EÎ÷þ\rù=Ã\u0001\u000b\u0002÷\u0002<\u0002Ì\u0000ð\u000e\u0007ÿ7Íû\u0006\u0003ò,Üü\u0000\u0014ô\fÿõ%í\u0006ô\u000bó\u0004\u0007\u0006\u0006÷\u0006\u0003ò'êòþ\tþ\b#Üû\u0010ô\r\u0006ÿÿóô\u000bó\u0004\u0007\u00067¿\fô\u0006\u0005÷\u0001\u000bû\u0002AÝ\u000e\u0005þæ\u0010\tú\u0002\nç\r\u0000\u0014î\u0010½û\u0007EÍø\fï\u0001E½\u0011ñ\u000b\u000bøúý\u0000FÈúý\u0000E\u0002»\b\u0006ùý\u0011\u0007òú\t\fþô".getBytes("ISO-8859-1"), 0, bArr, 0, 685);
        f11736 = bArr;
        f11741 = 89;
    }

    /* JADX INFO: renamed from: ˎ */
    private static boolean m17418(String str) {
        int i = f11735;
        int i2 = (i ^ 97) + ((i & 97) << 1);
        f11734 = i2 % 128;
        if (i2 % 2 == 0 ? str.length() != 17 : str.length() != 0) {
            f11735 = (f11734 + 57) % 128;
            return false;
        }
        byte[] bArr = f11736;
        if (str.equals(m17419(bArr[64], bArr[18], (short) 146))) {
            int i3 = f11735;
            f11734 = (((i3 | 113) << 1) - (i3 ^ 113)) % 128;
            return false;
        }
        boolean zFind = f11740.matcher(str).find();
        int i4 = f11734;
        int i5 = (i4 & 57) + (i4 | 57);
        f11735 = i5 % 128;
        if (i5 % 2 != 0) {
            return zFind;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b A[PHI: r5
      0x004b: PHI (r5v7 int) = (r5v6 int), (r5v16 int) binds: [B:14:0x0049, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX INFO: renamed from: ˏ */
    private static boolean m17420(String str) {
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = f11734;
        int i6 = ((i5 | 61) << 1) - (i5 ^ 61);
        f11735 = i6 % 128;
        if (i6 % 2 == 0) {
            length = str.length();
            i = 1;
        } else {
            length = str.length();
            i = 0;
        }
        int i7 = i;
        while (length > 0) {
            int i8 = f11734;
            int i9 = ((i8 | 125) << 1) - (i8 ^ 125);
            f11735 = i9 % 128;
            if (i9 % 2 == 0) {
                i2 = Integer.parseInt(str.substring(length, length));
                if (i7 != 0) {
                    i2 <<= 1;
                    i3 = i2 / 10;
                    if (i3 != 0) {
                        int i10 = f11734;
                        i4 = ((i10 | 55) << 1) - (i10 ^ 55);
                        f11735 = i4 % 128;
                        if (i4 % 2 == 0) {
                            i2 = (i2 % 127) << (i2 * 12);
                        } else {
                            i2 = (i2 % 10) + i3;
                        }
                    }
                }
            } else {
                i2 = Integer.parseInt(str.substring((length ^ (-1)) + (length << 1), length));
                if (i7 != 0) {
                    i2 <<= 1;
                    i3 = i2 / 10;
                    if (i3 != 0) {
                        int i11 = f11734;
                        i4 = ((i11 | 55) << 1) - (i11 ^ 55);
                        f11735 = i4 % 128;
                        if (i4 % 2 == 0) {
                            i2 = (i2 % 127) << (i2 * 12);
                        } else {
                            i2 = (i2 % 10) + i3;
                        }
                    }
                }
            }
            if (i7 == 0) {
                int i12 = f11735;
                f11734 = ((i12 ^ 79) + ((i12 & 79) << 1)) % 128;
                i7 = 1;
            } else {
                i7 = 0;
            }
            i = (i - (~i2)) - 1;
            length = (-2) - (~length);
        }
        if (i % 10 != 0) {
            int i13 = f11734;
            int i14 = (i13 & 95) + (i13 | 95);
            f11735 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 57 / 0;
            }
            return false;
        }
        int i16 = f11734;
        int i17 = (((i16 | 19) << 1) - (i16 ^ 19)) % 128;
        f11735 = i17;
        int i18 = i17 + 15;
        f11734 = i18 % 128;
        if (i18 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator$ɩ */
    public static class C3447 {

        /* JADX INFO: renamed from: ʽ */
        private static int f11742 = 0;

        /* JADX INFO: renamed from: ॱ */
        private static final byte[] f11743 = {66, 82, 42, -23, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -34, -27, -17, -3, 15, -9, -1, 30, -40, -1, -1, -17, -4, -8, -1, -1, -17, -4, 8, 4, 17, -8, -6, -4, -1, -18, 40, -40, -8, -4, Tnaf.POW_2_WIDTH, -16, 8, -5};

        /* JADX INFO: renamed from: ᐝ */
        private static int f11744 = 1;

        /* JADX INFO: renamed from: ˊ */
        private boolean f11745;

        /* JADX INFO: renamed from: ˋ */
        private final C3450.C22683 f11746 = new C3450.C22683();

        /* JADX INFO: renamed from: ˎ */
        private final MessageDigest f11747;

        /* JADX INFO: renamed from: ˏ */
        private final Context f11748;

        public C3447(Context context) throws Throwable {
            this.f11748 = context;
            MessageDigest messageDigest = null;
            try {
                byte[] bArr = f11743;
                try {
                    messageDigest = (MessageDigest) Class.forName(m17425(bArr[10], (byte) (-bArr[3]), (byte) (-bArr[11])).intern()).getMethod(m17425(36, (short) 20, (byte) (-bArr[50])).intern(), String.class).invoke(null, m17425(bArr[24], (short) 0, (byte) (-bArr[10])).intern());
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
            this.f11747 = messageDigest;
            this.f11745 = false;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003e -> B:15:0x0048). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: ॱ */
        private static java.lang.String m17425(int r6, short r7, int r8) {
            /*
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.f11744
                int r1 = r0 + 105
                int r1 = r1 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.f11742 = r1
                int r7 = r7 + 83
                int r1 = r8 + 6
                byte[] r2 = com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.f11743
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r8 = r8 + 5
                r3 = 0
                if (r2 != 0) goto L28
                int r0 = r0 + 83
                int r4 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.f11742 = r4
                int r0 = r0 % 2
                if (r0 != 0) goto L26
                r0 = r7
                r4 = r2
                r2 = r3
                r7 = r6
                goto L48
            L26:
                r6 = 0
                throw r6
            L28:
                r0 = r3
            L29:
                byte r4 = (byte) r7
                r1[r0] = r4
                int r6 = r6 + 1
                if (r0 != r8) goto L3e
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r3)
                int r7 = com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.f11744
                int r7 = r7 + 125
                int r7 = r7 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.f11742 = r7
                return r6
            L3e:
                int r0 = r0 + 1
                r4 = r2[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r2
                r2 = r0
                r0 = r5
            L48:
                int r0 = r0 - r6
                int r6 = r0 + (-3)
                r0 = r7
                r7 = r6
                r6 = r0
                r0 = r2
                r2 = r4
                goto L29
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.C3447.m17425(int, short, int):java.lang.String");
        }

        /* JADX INFO: renamed from: ˊ */
        public final Fingerprint m17426() throws Throwable {
            MessageDigest messageDigest = this.f11747;
            try {
                byte[] bArr = f11743;
                return new Fingerprint((byte[]) Class.forName(m17425(bArr[10], (byte) (-bArr[3]), (byte) (-bArr[11])).intern()).getMethod(m17425(25, bArr[37], 0).intern(), null).invoke(messageDigest, null), this.f11745);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0037  */
        /* JADX INFO: renamed from: ˋ */
        public final void m17427(String str) {
            int i = f11744;
            f11742 = (((i | 121) << 1) - (i ^ 121)) % 128;
            String strM17440 = C3452.m17440(this.f11748, str, this.f11746);
            if (strM17440 != null) {
                int i2 = f11742;
                int i3 = (i2 & 1) + (i2 | 1);
                f11744 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 60 / 0;
                    if (strM17440.length() > 0) {
                        this.f11747.update(strM17440.getBytes());
                    }
                } else if (strM17440.length() > 0) {
                    this.f11747.update(strM17440.getBytes());
                }
            }
            f11744 = (f11742 + 113) % 128;
        }

        /* JADX INFO: renamed from: ˎ */
        public final void m17429(byte... bArr) {
            int i = (f11742 + 29) % 128;
            f11744 = i;
            if (bArr != null) {
                int i2 = ((i | 17) << 1) - (i ^ 17);
                f11742 = i2 % 128;
                if (i2 % 2 != 0) {
                    int length = bArr.length;
                    throw null;
                }
                if (bArr.length > 0) {
                    int i3 = i + 77;
                    f11742 = i3 % 128;
                    int i4 = i3 % 2;
                    this.f11747.update(bArr);
                    if (i4 != 0) {
                        int i5 = 18 / 0;
                    }
                }
            }
            int i6 = f11742;
            f11744 = ((i6 ^ 37) + ((i6 & 37) << 1)) % 128;
        }

        /* JADX INFO: renamed from: ˏ */
        public final void m17430(byte... bArr) {
            int i = f11744;
            int i2 = (((i | 21) << 1) - (i ^ 21)) % 128;
            f11742 = i2;
            if (bArr != null) {
                int i3 = ((i2 ^ 15) + ((i2 & 15) << 1)) % 128;
                f11744 = i3;
                if (bArr.length > 0) {
                    int i4 = i3 + 91;
                    f11742 = i4 % 128;
                    int i5 = i4 % 2;
                    MessageDigest messageDigest = this.f11747;
                    if (i5 != 0) {
                        messageDigest.update(bArr);
                        this.f11745 = false;
                    } else {
                        messageDigest.update(bArr);
                        this.f11745 = true;
                    }
                }
            }
            int i6 = f11742;
            int i7 = ((i6 | 65) << 1) - (i6 ^ 65);
            f11744 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ˎ */
        public static /* synthetic */ Context m17424(C3447 c3447) {
            int i = f11742;
            int i2 = (((i | 95) << 1) - (i ^ 95)) % 128;
            f11744 = i2;
            Context context = c3447.f11748;
            int i3 = (i2 & 119) + (i2 | 119);
            f11742 = i3 % 128;
            if (i3 % 2 == 0) {
                return context;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ˎ */
        public final void m17428(int i) {
            int i2 = f11742;
            f11744 = ((i2 & 111) + (i2 | 111)) % 128;
            this.f11747.update(m17423(i));
            int i3 = f11744;
            int i4 = (i3 ^ 103) + ((i3 & 103) << 1);
            f11742 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ˋ */
        private static byte[] m17423(int i) {
            int i2 = f11744;
            byte[] bArr = {(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
            f11742 = (((i2 | 9) << 1) - (i2 ^ 9)) % 128;
            return bArr;
        }

        /* JADX INFO: renamed from: ˊ */
        public static /* synthetic */ C3450.C22683 m17422(C3447 c3447) {
            int i = f11744;
            f11742 = ((i ^ 125) + ((i & 125) << 1)) % 128;
            C3450.C22683 c22683 = c3447.f11746;
            f11742 = (((i | 1) << 1) - (i ^ 1)) % 128;
            return c22683;
        }
    }

    /* JADX INFO: renamed from: ˏ */
    private static byte[] m17421(String str, C3450.C22683 c22683) {
        int i = f11735;
        f11734 = ((i ^ 109) + ((i & 109) << 1)) % 128;
        try {
            byte b = f11736[15];
            Enumeration enumeration = (Enumeration) C3452.m17446(m17419(b, b, (short) 589), NetworkInterface.class, c22683);
            int i2 = f11735;
            f11734 = ((i2 & 31) + (i2 | 31)) % 128;
            while (enumeration != null && enumeration.hasMoreElements()) {
                int i3 = f11735;
                int i4 = (i3 & 81) + (i3 | 81);
                f11734 = i4 % 128;
                if (i4 % 2 == 0) {
                    NetworkInterface networkInterface = (NetworkInterface) enumeration.nextElement();
                    if (networkInterface != null && (str == null || str.equalsIgnoreCase(networkInterface.getName()))) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress != null) {
                            int i5 = f11735;
                            int i6 = ((i5 ^ 111) + ((i5 & 111) << 1)) % 128;
                            f11734 = i6;
                            int i7 = (i6 & 61) + (i6 | 61);
                            f11735 = i7 % 128;
                            if (i7 % 2 != 0) {
                                return hardwareAddress;
                            }
                            throw null;
                        }
                        int i8 = f11734;
                        f11735 = ((i8 ^ 5) + ((i8 & 5) << 1)) % 128;
                    }
                } else {
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
        return f11737;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0032 -> B:15:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ˏ */
    private static java.lang.String m17419(int r7, byte r8, short r9) {
        /*
            byte[] r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.f11736
            int r7 = r7 + 4
            int r8 = 119 - r8
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L20
            int r8 = com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.f11734
            int r8 = r8 + 43
            int r3 = r8 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.f11735 = r3
            int r8 = r8 % 2
            if (r8 == 0) goto L1e
            r8 = r7
            r3 = r0
            r5 = r2
            r0 = r9
            goto L40
        L1e:
            r7 = 0
            throw r7
        L20:
            r3 = r2
        L21:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L32
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            java.lang.String r7 = r7.intern()
            return r7
        L32:
            r3 = r0[r9]
            int r4 = com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.f11734
            int r4 = r4 + 71
            int r4 = r4 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.f11735 = r4
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L40:
            int r8 = r8 - r9
            int r8 = r8 + 1
            int r9 = r0 + 1
            r0 = r3
            r3 = r5
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.FingerprintGenerator.m17419(int, byte, short):java.lang.String");
    }

    public static Fingerprint generateFingerprint(Context context) throws Throwable {
        f11735 = (f11734 + 113) % 128;
        Fingerprint fingerprintGenerateFingerprint = generateFingerprint(context, 0);
        int i = f11734;
        int i2 = (i & 49) + (i | 49);
        f11735 = i2 % 128;
        if (i2 % 2 != 0) {
            return fingerprintGenerateFingerprint;
        }
        throw null;
    }
}
