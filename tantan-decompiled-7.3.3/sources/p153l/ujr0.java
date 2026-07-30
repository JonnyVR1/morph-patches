package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzage;
import com.google.android.gms.internal.ads.zzagg;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagm;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzahb;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class ujr0 {

    /* JADX INFO: renamed from: a */
    public static final sjr0 f179328a = new sjr0() { // from class: l.rjr0
    };

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final zzby m196447a(byte[] bArr, int i, sjr0 sjr0Var, uir0 uir0Var) {
        boolean z;
        tjr0 tjr0Var;
        int i2;
        int iM196451e;
        zzagr zzagrVarM196452f;
        ArrayList arrayList = new ArrayList();
        bgw0 bgw0Var = new bgw0(bArr, i);
        boolean z2 = false;
        if (bgw0Var.m104275q() < 10) {
            y4w0.m214278f("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM104247D = bgw0Var.m104247D();
            if (iM104247D == 4801587) {
                int iM104245B = bgw0Var.m104245B();
                bgw0Var.m104270l(1);
                int iM104245B2 = bgw0Var.m104245B();
                int iM104244A = bgw0Var.m104244A();
                if (iM104245B != 2) {
                    if (iM104245B == 3) {
                        if ((iM104245B2 & 64) != 0) {
                            int iM104280v = bgw0Var.m104280v();
                            bgw0Var.m104270l(iM104280v);
                            iM104244A -= iM104280v + 4;
                        }
                    } else if (iM104245B == 4) {
                        if ((iM104245B2 & 64) != 0) {
                            int iM104244A2 = bgw0Var.m104244A();
                            bgw0Var.m104270l(iM104244A2 - 4);
                            iM104244A -= iM104244A2;
                        }
                        if ((iM104245B2 & 16) != 0) {
                            iM104244A -= 10;
                        }
                    } else {
                        y4w0.m214278f("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM104245B);
                    }
                    if (iM104245B < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    tjr0Var = new tjr0(iM104245B, z, iM104244A);
                } else if ((iM104245B2 & 64) != 0) {
                    y4w0.m214278f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM104245B < 4 || (iM104245B2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    tjr0Var = new tjr0(iM104245B, z, iM104244A);
                }
                if (tjr0Var == null) {
                    return null;
                }
                int iM104277s = bgw0Var.m104277s();
                i2 = tjr0Var.f174608a == 2 ? 6 : 10;
                iM196451e = tjr0Var.f174610c;
                if (tjr0Var.f174609b) {
                    iM196451e = m196451e(bgw0Var, tjr0Var.f174610c);
                }
                bgw0Var.m104268j(iM104277s + iM196451e);
                if (!m196457k(bgw0Var, tjr0Var.f174608a, i2, false)) {
                    if (tjr0Var.f174608a == 4 || !m196457k(bgw0Var, 4, i2, true)) {
                        y4w0.m214278f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + tjr0Var.f174608a);
                        return null;
                    }
                    z2 = true;
                }
                while (bgw0Var.m104275q() >= i2) {
                    zzagrVarM196452f = m196452f(tjr0Var.f174608a, bgw0Var, z2, i2, sjr0Var);
                    if (zzagrVarM196452f != null) {
                        arrayList.add(zzagrVarM196452f);
                    }
                }
                return new zzby(arrayList);
            }
            y4w0.m214278f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM104247D))));
        }
        tjr0Var = null;
        if (tjr0Var == null) {
            return null;
        }
        int iM104277s2 = bgw0Var.m104277s();
        if (tjr0Var.f174608a == 2) {
        }
        iM196451e = tjr0Var.f174610c;
        if (tjr0Var.f174609b) {
            iM196451e = m196451e(bgw0Var, tjr0Var.f174610c);
        }
        bgw0Var.m104268j(iM104277s2 + iM196451e);
        if (!m196457k(bgw0Var, tjr0Var.f174608a, i2, false)) {
            if (tjr0Var.f174608a == 4) {
            }
            y4w0.m214278f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + tjr0Var.f174608a);
            return null;
        }
        while (bgw0Var.m104275q() >= i2) {
            zzagrVarM196452f = m196452f(tjr0Var.f174608a, bgw0Var, z2, i2, sjr0Var);
            if (zzagrVarM196452f != null) {
                arrayList.add(zzagrVarM196452f);
            }
        }
        return new zzby(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static int m196448b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static int m196449c(byte[] bArr, int i, int i2) {
        int iM196450d = m196450d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM196450d;
        }
        while (true) {
            int length = bArr.length;
            if (iM196450d >= length - 1) {
                return length;
            }
            int i3 = iM196450d + 1;
            if ((iM196450d - i) % 2 == 0 && bArr[i3] == 0) {
                return iM196450d;
            }
            iM196450d = m196450d(bArr, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m196450d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m196451e(bgw0 bgw0Var, int i) {
        byte[] bArrM104271m = bgw0Var.m104271m();
        int iM104277s = bgw0Var.m104277s();
        int i2 = iM104277s;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM104277s + i) {
                return i;
            }
            if ((bArrM104271m[i2] & 255) == 255 && bArrM104271m[i3] == 0) {
                System.arraycopy(bArrM104271m, i2 + 2, bArrM104271m, i3, (i - (i2 - iM104277s)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02a7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:161:0x02a7, B:163:0x02ae, B:175:0x02f2, B:171:0x02cf, B:173:0x02e9, B:187:0x032e, B:194:0x0371, B:198:0x03ab, B:202:0x03b8, B:203:0x03be, B:205:0x03c4, B:207:0x03cb, B:208:0x03cf, B:216:0x03f0, B:220:0x041b, B:222:0x0426, B:223:0x045c, B:224:0x0469, B:226:0x046f, B:228:0x0476, B:229:0x047a, B:233:0x0490, B:240:0x04a1, B:242:0x04cb, B:243:0x04da, B:244:0x04e5), top: B:257:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cf A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:161:0x02a7, B:163:0x02ae, B:175:0x02f2, B:171:0x02cf, B:173:0x02e9, B:187:0x032e, B:194:0x0371, B:198:0x03ab, B:202:0x03b8, B:203:0x03be, B:205:0x03c4, B:207:0x03cb, B:208:0x03cf, B:216:0x03f0, B:220:0x041b, B:222:0x0426, B:223:0x045c, B:224:0x0469, B:226:0x046f, B:228:0x0476, B:229:0x047a, B:233:0x0490, B:240:0x04a1, B:242:0x04cb, B:243:0x04da, B:244:0x04e5), top: B:257:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02e9 A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:161:0x02a7, B:163:0x02ae, B:175:0x02f2, B:171:0x02cf, B:173:0x02e9, B:187:0x032e, B:194:0x0371, B:198:0x03ab, B:202:0x03b8, B:203:0x03be, B:205:0x03c4, B:207:0x03cb, B:208:0x03cf, B:216:0x03f0, B:220:0x041b, B:222:0x0426, B:223:0x045c, B:224:0x0469, B:226:0x046f, B:228:0x0476, B:229:0x047a, B:233:0x0490, B:240:0x04a1, B:242:0x04cb, B:243:0x04da, B:244:0x04e5), top: B:257:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:178:0x031e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0365 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0367  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:234:0x0495 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x0497  */
    /* JADX WARN: Code duplicated, block: B:251:0x0505  */
    /* JADX WARN: Instruction removed from duplicated block: B:251:0x0505, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static zzagr m196452f(int i, bgw0 bgw0Var, boolean z, int i2, @Nullable sjr0 sjr0Var) {
        int iM104248E;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        zzagr zzagrVar;
        int i5;
        zzagr zzageVar;
        zzagr zzagvVar;
        byte[] bArr;
        String strM207228a;
        int i6;
        String strConcat;
        int iM104245B = bgw0Var.m104245B();
        int iM104245B2 = bgw0Var.m104245B();
        int iM104245B3 = bgw0Var.m104245B();
        int iM104245B4 = i >= 3 ? bgw0Var.m104245B() : 0;
        if (i == 4) {
            iM104248E = bgw0Var.m104248E();
            if (!z) {
                iM104248E = ((iM104248E >> 24) << 21) | (iM104248E & 255) | (((iM104248E >> 8) & 255) << 7) | (((iM104248E >> 16) & 255) << 14);
            }
        } else {
            iM104248E = i == 3 ? bgw0Var.m104248E() : bgw0Var.m104247D();
        }
        int iM104249F = i >= 3 ? bgw0Var.m104249F() : 0;
        if (iM104245B == 0 && iM104245B2 == 0 && iM104245B3 == 0 && iM104245B4 == 0 && iM104248E == 0 && iM104249F == 0) {
            bgw0Var.m104269k(bgw0Var.m104278t());
            return null;
        }
        int iM104277s = bgw0Var.m104277s() + iM104248E;
        String str = "Id3Decoder";
        if (iM104277s > bgw0Var.m104278t()) {
            y4w0.m214278f("Id3Decoder", "Frame size exceeds remaining tag data");
            bgw0Var.m104269k(bgw0Var.m104278t());
            return null;
        }
        if (sjr0Var != null) {
            bgw0Var.m104269k(iM104277s);
            return null;
        }
        if (i == 3) {
            int i7 = iM104249F & 64;
            i3 = (iM104249F & 128) != 0 ? 1 : 0;
            iM104245B = 0;
            z3 = i7 != 0;
            z2 = (iM104249F & 32) != 0;
            i4 = i3;
        } else if (i == 4) {
            boolean z4 = (iM104249F & 64) != 0;
            int i8 = (iM104249F & 8) != 0 ? 1 : 0;
            z3 = (iM104249F & 4) != 0;
            iM104245B = (iM104249F & 2) != 0 ? 1 : 0;
            i4 = iM104249F & 1;
            int i9 = i8;
            z2 = z4;
            i3 = i9;
        } else {
            i3 = 0;
            i4 = 0;
            z2 = false;
            z3 = false;
            iM104245B = 0;
        }
        if (i3 != 0 || z3) {
            y4w0.m214278f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            bgw0Var.m104269k(iM104277s);
            return null;
        }
        if (z2) {
            bgw0Var.m104270l(1);
            iM104248E--;
        }
        if (i4 != 0) {
            bgw0Var.m104270l(4);
            iM104248E -= 4;
        }
        if (iM104245B != 0) {
            iM104248E = m196451e(bgw0Var, iM104248E);
        }
        try {
            try {
                if (iM104245B == 84 && iM104245B2 == 88 && iM104245B3 == 88 && (i == 2 || iM104245B4 == 88)) {
                    if (iM104248E <= 0) {
                        iM104245B = iM104245B;
                        str = "Id3Decoder";
                        zzageVar = null;
                    } else {
                        int iM104245B5 = bgw0Var.m104245B();
                        int i10 = iM104248E - 1;
                        byte[] bArr2 = new byte[i10];
                        bgw0Var.m104265g(bArr2, 0, i10);
                        int iM196449c = m196449c(bArr2, 0, iM104245B5);
                        zzageVar = new zzagz("TXXX", new String(bArr2, 0, iM196449c, m196456j(iM104245B5)), m196453g(bArr2, iM104245B5, iM196449c + m196448b(iM104245B5)));
                        str = "Id3Decoder";
                    }
                } else if (iM104245B == 84) {
                    String strM196455i = m196455i(i, 84, iM104245B2, iM104245B3, iM104245B4);
                    if (iM104248E <= 0) {
                        iM104245B = iM104245B;
                        str = "Id3Decoder";
                        zzageVar = null;
                    } else {
                        int iM104245B6 = bgw0Var.m104245B();
                        int i11 = iM104248E - 1;
                        byte[] bArr3 = new byte[i11];
                        bgw0Var.m104265g(bArr3, 0, i11);
                        zzageVar = new zzagz(strM196455i, null, m196453g(bArr3, iM104245B6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iM104245B == 87) {
                        if (iM104245B2 != 88 || iM104245B3 != 88 || (i != 2 && iM104245B4 != 88)) {
                            i5 = 87;
                        }
                        if (iM104248E <= 0) {
                            iM104245B = iM104245B;
                            str = "Id3Decoder";
                            zzageVar = null;
                        } else {
                            int iM104245B7 = bgw0Var.m104245B();
                            int i12 = iM104248E - 1;
                            byte[] bArr4 = new byte[i12];
                            bgw0Var.m104265g(bArr4, 0, i12);
                            int iM196449c2 = m196449c(bArr4, 0, iM104245B7);
                            String str2 = new String(bArr4, 0, iM196449c2, m196456j(iM104245B7));
                            int iM196448b = iM196449c2 + m196448b(iM104245B7);
                            zzageVar = new zzahb("WXXX", str2, m196454h(bArr4, iM196448b, m196450d(bArr4, iM196448b), cow0.f82930b));
                            str = "Id3Decoder";
                        }
                    } else {
                        i5 = iM104245B;
                    }
                    if (i5 == 87) {
                        String strM196455i2 = m196455i(i, 87, iM104245B2, iM104245B3, iM104245B4);
                        byte[] bArr5 = new byte[iM104248E];
                        bgw0Var.m104265g(bArr5, 0, iM104248E);
                        zzageVar = new zzahb(strM196455i2, null, new String(bArr5, 0, m196450d(bArr5, 0), cow0.f82930b));
                    } else {
                        if (i5 == 80) {
                            if (iM104245B2 == 82 && iM104245B3 == 73 && iM104245B4 == 86) {
                                byte[] bArr6 = new byte[iM104248E];
                                bgw0Var.m104265g(bArr6, 0, iM104248E);
                                int iM196450d = m196450d(bArr6, 0);
                                zzageVar = new zzagx(new String(bArr6, 0, iM196450d, cow0.f82930b), m196458l(bArr6, iM196450d + 1, iM104248E));
                            } else {
                                i5 = 80;
                            }
                        }
                        try {
                            if (i5 != 71) {
                                try {
                                    if (i == 2) {
                                        if (i5 != 80 && iM104245B2 == 73 && iM104245B3 == 67) {
                                            int iM104245B8 = bgw0Var.m104245B();
                                            Charset charsetM196456j = m196456j(iM104245B8);
                                            int i13 = iM104248E - 1;
                                            bArr = new byte[i13];
                                            bgw0Var.m104265g(bArr, 0, i13);
                                            if (i == 2) {
                                                strConcat = "image/".concat(String.valueOf(wnw0.m207228a(new String(bArr, 0, 3, cow0.f82930b))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                                }
                                                i6 = 2;
                                            } else {
                                                int iM196450d2 = m196450d(bArr, 0);
                                                strM207228a = wnw0.m207228a(new String(bArr, 0, iM196450d2, cow0.f82930b));
                                                if (strM207228a.indexOf(47) == -1) {
                                                    strM207228a = "image/".concat(strM207228a);
                                                }
                                                String str3 = strM207228a;
                                                i6 = iM196450d2;
                                                strConcat = str3;
                                            }
                                            int i14 = bArr[i6 + 1] & 255;
                                            int i15 = i6 + 2;
                                            int iM196449c3 = m196449c(bArr, i15, iM104245B8);
                                            zzageVar = new zzagc(strConcat, new String(bArr, i15, iM196449c3 - i15, charsetM196456j), i14, m196458l(bArr, iM196449c3 + m196448b(iM104245B8), i13));
                                        } else {
                                            iM104245B = iM104245B;
                                            if (i5 == 67 || iM104245B2 != 79 || iM104245B3 != 77 || (iM104245B4 != 77 && i != 2)) {
                                                if (i5 != 67 && iM104245B2 == 72 && iM104245B3 == 65 && iM104245B4 == 80) {
                                                    int iM104277s2 = bgw0Var.m104277s();
                                                    int iM196450d3 = m196450d(bgw0Var.m104271m(), iM104277s2);
                                                    String str4 = new String(bgw0Var.m104271m(), iM104277s2, iM196450d3 - iM104277s2, cow0.f82930b);
                                                    bgw0Var.m104269k(iM196450d3 + 1);
                                                    int iM104280v = bgw0Var.m104280v();
                                                    int iM104280v2 = bgw0Var.m104280v();
                                                    long jM104253J = bgw0Var.m104253J();
                                                    long j = jM104253J == 4294967295L ? -1L : jM104253J;
                                                    long jM104253J2 = bgw0Var.m104253J();
                                                    long j2 = jM104253J2 == 4294967295L ? -1L : jM104253J2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i16 = iM104277s2 + iM104248E;
                                                    while (bgw0Var.m104277s() < i16) {
                                                        zzagr zzagrVarM196452f = m196452f(i, bgw0Var, z, i2, null);
                                                        if (zzagrVarM196452f != null) {
                                                            arrayList.add(zzagrVarM196452f);
                                                        }
                                                    }
                                                    zzagvVar = new zzagg(str4, iM104280v, iM104280v2, j, j2, (zzagr[]) arrayList.toArray(new zzagr[0]));
                                                } else if (i5 != 67 && iM104245B2 == 84 && iM104245B3 == 79 && iM104245B4 == 67) {
                                                    int iM104277s3 = bgw0Var.m104277s();
                                                    int iM196450d4 = m196450d(bgw0Var.m104271m(), iM104277s3);
                                                    String str5 = new String(bgw0Var.m104271m(), iM104277s3, iM196450d4 - iM104277s3, cow0.f82930b);
                                                    bgw0Var.m104269k(iM196450d4 + 1);
                                                    int iM104245B9 = bgw0Var.m104245B();
                                                    boolean z5 = (iM104245B9 & 2) != 0;
                                                    int i17 = iM104245B9 & 1;
                                                    int iM104245B10 = bgw0Var.m104245B();
                                                    String[] strArr = new String[iM104245B10];
                                                    int i18 = 0;
                                                    while (i18 < iM104245B10) {
                                                        int iM104277s4 = bgw0Var.m104277s();
                                                        int i19 = iM104277s3;
                                                        int iM196450d5 = m196450d(bgw0Var.m104271m(), iM104277s4);
                                                        String[] strArr2 = strArr;
                                                        strArr2[i18] = new String(bgw0Var.m104271m(), iM104277s4, iM196450d5 - iM104277s4, cow0.f82930b);
                                                        bgw0Var.m104269k(iM196450d5 + 1);
                                                        i18++;
                                                        iM104277s3 = i19;
                                                        iM104245B10 = iM104245B10;
                                                        str5 = str5;
                                                        strArr = strArr2;
                                                    }
                                                    int i20 = iM104277s3;
                                                    String str6 = str5;
                                                    String[] strArr3 = strArr;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int i21 = i20 + iM104248E;
                                                    while (bgw0Var.m104277s() < i21) {
                                                        zzagr zzagrVarM196452f2 = m196452f(i, bgw0Var, z, i2, null);
                                                        if (zzagrVarM196452f2 != null) {
                                                            arrayList2.add(zzagrVarM196452f2);
                                                        }
                                                    }
                                                    zzagvVar = new zzagi(str6, z5, 1 == i17, strArr3, (zzagr[]) arrayList2.toArray(new zzagr[0]));
                                                } else if (i5 != 77 && iM104245B2 == 76 && iM104245B3 == 76 && iM104245B4 == 84) {
                                                    int iM104249F2 = bgw0Var.m104249F();
                                                    int iM104247D = bgw0Var.m104247D();
                                                    int iM104247D2 = bgw0Var.m104247D();
                                                    int iM104245B11 = bgw0Var.m104245B();
                                                    int iM104245B12 = bgw0Var.m104245B();
                                                    dfw0 dfw0Var = new dfw0();
                                                    dfw0Var.m115557i(bgw0Var);
                                                    int i22 = ((iM104248E - 10) * 8) / (iM104245B11 + iM104245B12);
                                                    int[] iArr = new int[i22];
                                                    int[] iArr2 = new int[i22];
                                                    for (int i23 = 0; i23 < i22; i23++) {
                                                        int iM115552d = dfw0Var.m115552d(iM104245B11);
                                                        int iM115552d2 = dfw0Var.m115552d(iM104245B12);
                                                        iArr[i23] = iM115552d;
                                                        iArr2[i23] = iM115552d2;
                                                    }
                                                    zzagvVar = new zzagv(iM104249F2, iM104247D, iM104247D2, iArr, iArr2);
                                                } else {
                                                    String strM196455i3 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                    byte[] bArr7 = new byte[iM104248E];
                                                    bgw0Var.m104265g(bArr7, 0, iM104248E);
                                                    zzageVar = new zzage(strM196455i3, bArr7);
                                                }
                                                zzageVar = zzagvVar;
                                            } else if (iM104248E < 4) {
                                                zzageVar = null;
                                            } else {
                                                int iM104245B13 = bgw0Var.m104245B();
                                                Charset charsetM196456j2 = m196456j(iM104245B13);
                                                byte[] bArr8 = new byte[3];
                                                bgw0Var.m104265g(bArr8, 0, 3);
                                                String str7 = new String(bArr8, 0, 3);
                                                int i24 = iM104248E - 4;
                                                byte[] bArr9 = new byte[i24];
                                                bgw0Var.m104265g(bArr9, 0, i24);
                                                int iM196449c4 = m196449c(bArr9, 0, iM104245B13);
                                                String str8 = new String(bArr9, 0, iM196449c4, charsetM196456j2);
                                                int iM196448b2 = iM196449c4 + m196448b(iM104245B13);
                                                zzageVar = new zzagk(str7, str8, m196454h(bArr9, iM196448b2, m196449c(bArr9, iM196448b2, iM104245B13), charsetM196456j2));
                                            }
                                        }
                                    } else if (i5 != 65 && iM104245B2 == 80 && iM104245B3 == 73 && iM104245B4 == 67) {
                                        int iM104245B14 = bgw0Var.m104245B();
                                        Charset charsetM196456j3 = m196456j(iM104245B14);
                                        int i110 = iM104248E - 1;
                                        bArr = new byte[i110];
                                        bgw0Var.m104265g(bArr, 0, i110);
                                        if (i == 2) {
                                            strConcat = "image/".concat(String.valueOf(wnw0.m207228a(new String(bArr, 0, 3, cow0.f82930b))));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                            }
                                            i6 = 2;
                                        } else {
                                            int iM196450d6 = m196450d(bArr, 0);
                                            strM207228a = wnw0.m207228a(new String(bArr, 0, iM196450d6, cow0.f82930b));
                                            if (strM207228a.indexOf(47) == -1) {
                                                strM207228a = "image/".concat(strM207228a);
                                            }
                                            String str9 = strM207228a;
                                            i6 = iM196450d6;
                                            strConcat = str9;
                                        }
                                        int i111 = bArr[i6 + 1] & 255;
                                        int i112 = i6 + 2;
                                        int iM196449c5 = m196449c(bArr, i112, iM104245B14);
                                        zzageVar = new zzagc(strConcat, new String(bArr, i112, iM196449c5 - i112, charsetM196456j3), i111, m196458l(bArr, iM196449c5 + m196448b(iM104245B14), i110));
                                    } else {
                                        iM104245B = iM104245B;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM196455i4 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                    byte[] bArr10 = new byte[iM104248E];
                                                    bgw0Var.m104265g(bArr10, 0, iM104248E);
                                                    zzageVar = new zzage(strM196455i4, bArr10);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM196455i5 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                    byte[] bArr11 = new byte[iM104248E];
                                                    bgw0Var.m104265g(bArr11, 0, iM104248E);
                                                    zzageVar = new zzage(strM196455i5, bArr11);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i6 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr12 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr12, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i6, bArr12);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i7 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr13 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr13, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i7, bArr13);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i8 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr14 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr14, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i8, bArr14);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i9 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr15 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr15, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i9, bArr15);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i10 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr16 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr16, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i10, bArr16);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i11 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr17 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr17, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i11, bArr17);
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    bgw0Var.m104269k(iM104277s);
                                    zzagrVar = null;
                                } catch (OutOfMemoryError e2) {
                                    e = e2;
                                    bgw0Var.m104269k(iM104277s);
                                    zzagrVar = null;
                                }
                                if (zzagrVar == null) {
                                    y4w0.m214279g(str, "Failed to decode frame: id=" + m196455i(i, iM104245B, iM104245B2, iM104245B3, iM104245B4) + ", frameSize=" + iM104248E, e);
                                }
                                return zzagrVar;
                            }
                            if (iM104245B2 != 69 || iM104245B3 != 79) {
                                i5 = 71;
                                if (i == 2) {
                                    if (i5 != 80) {
                                    }
                                    iM104245B = iM104245B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i12 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr18 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr18, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i12, bArr18);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i13 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr19 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr19, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i13, bArr19);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i14 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr110 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr110, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i14, bArr110);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i15 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr111 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr111, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i15, bArr111);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i16 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr112 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr112, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i16, bArr112);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i17 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr113 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr113, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i17, bArr113);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i18 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr114 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr114, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i18, bArr114);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i19 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr115 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr115, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i19, bArr115);
                                    }
                                } else {
                                    if (i5 != 65) {
                                    }
                                    iM104245B = iM104245B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i110 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr116 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr116, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i110, bArr116);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i111 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr117 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr117, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i111, bArr117);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i112 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr118 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr118, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i112, bArr118);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i113 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr119 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr119, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i113, bArr119);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i114 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr1110 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr1110, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i114, bArr1110);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i115 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr1111 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr1111, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i115, bArr1111);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i116 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr1112 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr1112, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i116, bArr1112);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i117 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr1113 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr1113, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i117, bArr1113);
                                    }
                                }
                                if (zzagrVar == null) {
                                    y4w0.m214279g(str, "Failed to decode frame: id=" + m196455i(i, iM104245B, iM104245B2, iM104245B3, iM104245B4) + ", frameSize=" + iM104248E, e);
                                }
                                return zzagrVar;
                            }
                            if (iM104245B4 != 66 && i != 2) {
                                i5 = 71;
                                if (i == 2) {
                                    if (i5 != 80) {
                                    }
                                    iM104245B = iM104245B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i118 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr1114 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr1114, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i118, bArr1114);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i119 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr1115 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr1115, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i119, bArr1115);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i1110 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr1116 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr1116, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i1110, bArr1116);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i1111 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr1117 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr1117, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i1111, bArr1117);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i1112 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr1118 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr1118, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i1112, bArr1118);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i1113 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr1119 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr1119, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i1113, bArr1119);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i1114 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr11110 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr11110, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i1114, bArr11110);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i1115 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr11111 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr11111, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i1115, bArr11111);
                                    }
                                } else {
                                    if (i5 != 65) {
                                    }
                                    iM104245B = iM104245B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i1116 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr11112 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr11112, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i1116, bArr11112);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM196455i1117 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                                byte[] bArr11113 = new byte[iM104248E];
                                                bgw0Var.m104265g(bArr11113, 0, iM104248E);
                                                zzageVar = new zzage(strM196455i1117, bArr11113);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i1118 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr11114 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr11114, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i1118, bArr11114);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i1119 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr11115 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr11115, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i1119, bArr11115);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i11110 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr11116 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr11116, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i11110, bArr11116);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM196455i11111 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                            byte[] bArr11117 = new byte[iM104248E];
                                            bgw0Var.m104265g(bArr11117, 0, iM104248E);
                                            zzageVar = new zzage(strM196455i11111, bArr11117);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i11112 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr11118 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr11118, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i11112, bArr11118);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM196455i11113 = m196455i(i, i5, iM104245B2, iM104245B3, iM104245B4);
                                        byte[] bArr11119 = new byte[iM104248E];
                                        bgw0Var.m104265g(bArr11119, 0, iM104248E);
                                        zzageVar = new zzage(strM196455i11113, bArr11119);
                                    }
                                }
                                if (zzagrVar == null) {
                                    y4w0.m214279g(str, "Failed to decode frame: id=" + m196455i(i, iM104245B, iM104245B2, iM104245B3, iM104245B4) + ", frameSize=" + iM104248E, e);
                                }
                                return zzagrVar;
                            }
                            try {
                                int iM104245B15 = bgw0Var.m104245B();
                                Charset charsetM196456j4 = m196456j(iM104245B15);
                                int i25 = iM104248E - 1;
                                byte[] bArr20 = new byte[i25];
                                bgw0Var.m104265g(bArr20, 0, i25);
                                int iM196450d7 = m196450d(bArr20, 0);
                                str = "Id3Decoder";
                                String strM96493e = a8t0.m96493e(new String(bArr20, 0, iM196450d7, cow0.f82930b));
                                int i26 = iM196450d7 + 1;
                                int iM196449c6 = m196449c(bArr20, i26, iM104245B15);
                                String strM196454h = m196454h(bArr20, i26, iM196449c6, charsetM196456j4);
                                int iM196448b3 = iM196449c6 + m196448b(iM104245B15);
                                int iM196449c7 = m196449c(bArr20, iM196448b3, iM104245B15);
                                iM104245B = iM104245B;
                                zzageVar = new zzagm(strM96493e, strM196454h, m196454h(bArr20, iM196448b3, iM196449c7, charsetM196456j4), m196458l(bArr20, iM196449c7 + m196448b(iM104245B15), i25));
                            } catch (Exception e3) {
                                e = e3;
                                str = "Id3Decoder";
                                iM104245B = iM104245B;
                                bgw0Var.m104269k(iM104277s);
                                zzagrVar = null;
                            } catch (OutOfMemoryError e4) {
                                e = e4;
                                str = "Id3Decoder";
                                iM104245B = iM104245B;
                                bgw0Var.m104269k(iM104277s);
                                zzagrVar = null;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                        }
                    }
                    str = "Id3Decoder";
                }
                bgw0Var.m104269k(iM104277s);
                zzagrVar = zzageVar;
                e = null;
            } catch (Throwable th) {
                bgw0Var.m104269k(iM104277s);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            iM104245B = iM104245B;
            str = "Id3Decoder";
            bgw0Var.m104269k(iM104277s);
            zzagrVar = null;
            if (zzagrVar == null) {
                y4w0.m214279g(str, "Failed to decode frame: id=" + m196455i(i, iM104245B, iM104245B2, iM104245B3, iM104245B4) + ", frameSize=" + iM104248E, e);
            }
            return zzagrVar;
        } catch (OutOfMemoryError e8) {
            e = e8;
            iM104245B = iM104245B;
            str = "Id3Decoder";
            bgw0Var.m104269k(iM104277s);
            zzagrVar = null;
            if (zzagrVar == null) {
                y4w0.m214279g(str, "Failed to decode frame: id=" + m196455i(i, iM104245B, iM104245B2, iM104245B3, iM104245B4) + ", frameSize=" + iM104248E, e);
            }
            return zzagrVar;
        }
        if (zzagrVar == null) {
            y4w0.m214279g(str, "Failed to decode frame: id=" + m196455i(i, iM104245B, iM104245B2, iM104245B3, iM104245B4) + ", frameSize=" + iM104248E, e);
        }
        return zzagrVar;
    }

    /* JADX INFO: renamed from: g */
    public static zzgaa m196453g(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgaa.zzm("");
        }
        mqw0 mqw0Var = new mqw0();
        int iM196449c = m196449c(bArr, i2, i);
        while (i2 < iM196449c) {
            mqw0Var.m159613g(new String(bArr, i2, iM196449c - i2, m196456j(i)));
            i2 = m196448b(i) + iM196449c;
            iM196449c = m196449c(bArr, i2, i);
        }
        zzgaa zzgaaVarM159616j = mqw0Var.m159616j();
        return zzgaaVarM159616j.isEmpty() ? zzgaa.zzm("") : zzgaaVarM159616j;
    }

    /* JADX INFO: renamed from: h */
    public static String m196454h(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* JADX INFO: renamed from: i */
    public static String m196455i(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: j */
    public static Charset m196456j(int i) {
        if (i == 1) {
            return cow0.f82934f;
        }
        if (i != 2) {
            return i != 3 ? cow0.f82930b : cow0.f82931c;
        }
        return cow0.f82932d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX INFO: renamed from: k */
    public static boolean m196457k(bgw0 bgw0Var, int i, int i2, boolean z) {
        boolean z2;
        int iM104247D;
        long jM104247D;
        int iM104249F;
        int i3;
        int iM104277s = bgw0Var.m104277s();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i4 = 1;
                int i5 = 1;
                if (bgw0Var.m104275q() >= i2) {
                    if (i >= 3) {
                        iM104247D = bgw0Var.m104280v();
                        jM104247D = bgw0Var.m104253J();
                        iM104249F = bgw0Var.m104249F();
                    } else {
                        iM104247D = bgw0Var.m104247D();
                        jM104247D = bgw0Var.m104247D();
                        iM104249F = 0;
                    }
                    if (iM104247D != 0 || jM104247D != 0 || iM104249F != 0) {
                        if (i != 4 || z) {
                            if (i == 4) {
                                if ((iM104249F & 64) != 0) {
                                    i4 = 0;
                                }
                                int i6 = i4;
                                i5 = iM104249F & 1;
                                i3 = i6;
                            } else if (i == 3) {
                                if ((iM104249F & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iM104249F & 128) != 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jM104247D >= i3 && bgw0Var.m104275q() >= jM104247D) {
                                bgw0Var.m104270l((int) jM104247D);
                            }
                        } else if ((8421504 & jM104247D) == 0) {
                            long j = ((jM104247D >> 16) & 255) << 14;
                            jM104247D = ((jM104247D >> 24) << 21) | j | (jM104247D & 255) | (((jM104247D >> 8) & 255) << 7);
                            if (i == 4) {
                                if ((iM104249F & 64) != 0) {
                                    i4 = 0;
                                }
                                int i7 = i4;
                                i5 = iM104249F & 1;
                                i3 = i7;
                            } else if (i == 3) {
                                if ((iM104249F & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iM104249F & 128) != 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jM104247D >= i3) {
                                bgw0Var.m104270l((int) jM104247D);
                            }
                        }
                        z2 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                bgw0Var.m104269k(iM104277s);
                throw th;
            }
        }
        bgw0Var.m104269k(iM104277s);
        return z2;
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m196458l(byte[] bArr, int i, int i2) {
        return i2 <= i ? mpw0.f137962f : Arrays.copyOfRange(bArr, i, i2);
    }
}
