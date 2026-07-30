package p149l;

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
public final class oar0 {

    /* JADX INFO: renamed from: a */
    public static final mar0 f142861a = new mar0() { // from class: l.lar0
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
    public static final zzby m163364a(byte[] bArr, int i, mar0 mar0Var, o9r0 o9r0Var) {
        boolean z;
        nar0 nar0Var;
        int i2;
        int iM163368e;
        zzagr zzagrVarM163369f;
        ArrayList arrayList = new ArrayList();
        v6w0 v6w0Var = new v6w0(bArr, i);
        boolean z2 = false;
        if (v6w0Var.m197268q() < 10) {
            svv0.m186111f("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM197240D = v6w0Var.m197240D();
            if (iM197240D == 4801587) {
                int iM197238B = v6w0Var.m197238B();
                v6w0Var.m197263l(1);
                int iM197238B2 = v6w0Var.m197238B();
                int iM197237A = v6w0Var.m197237A();
                if (iM197238B != 2) {
                    if (iM197238B == 3) {
                        if ((iM197238B2 & 64) != 0) {
                            int iM197273v = v6w0Var.m197273v();
                            v6w0Var.m197263l(iM197273v);
                            iM197237A -= iM197273v + 4;
                        }
                    } else if (iM197238B == 4) {
                        if ((iM197238B2 & 64) != 0) {
                            int iM197237A2 = v6w0Var.m197237A();
                            v6w0Var.m197263l(iM197237A2 - 4);
                            iM197237A -= iM197237A2;
                        }
                        if ((iM197238B2 & 16) != 0) {
                            iM197237A -= 10;
                        }
                    } else {
                        svv0.m186111f("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM197238B);
                    }
                    if (iM197238B < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    nar0Var = new nar0(iM197238B, z, iM197237A);
                } else if ((iM197238B2 & 64) != 0) {
                    svv0.m186111f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM197238B < 4 || (iM197238B2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    nar0Var = new nar0(iM197238B, z, iM197237A);
                }
                if (nar0Var == null) {
                    return null;
                }
                int iM197270s = v6w0Var.m197270s();
                i2 = nar0Var.f137966a == 2 ? 6 : 10;
                iM163368e = nar0Var.f137968c;
                if (nar0Var.f137967b) {
                    iM163368e = m163368e(v6w0Var, nar0Var.f137968c);
                }
                v6w0Var.m197261j(iM197270s + iM163368e);
                if (!m163374k(v6w0Var, nar0Var.f137966a, i2, false)) {
                    if (nar0Var.f137966a == 4 || !m163374k(v6w0Var, 4, i2, true)) {
                        svv0.m186111f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + nar0Var.f137966a);
                        return null;
                    }
                    z2 = true;
                }
                while (v6w0Var.m197268q() >= i2) {
                    zzagrVarM163369f = m163369f(nar0Var.f137966a, v6w0Var, z2, i2, mar0Var);
                    if (zzagrVarM163369f != null) {
                        arrayList.add(zzagrVarM163369f);
                    }
                }
                return new zzby(arrayList);
            }
            svv0.m186111f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM197240D))));
        }
        nar0Var = null;
        if (nar0Var == null) {
            return null;
        }
        int iM197270s2 = v6w0Var.m197270s();
        if (nar0Var.f137966a == 2) {
        }
        iM163368e = nar0Var.f137968c;
        if (nar0Var.f137967b) {
            iM163368e = m163368e(v6w0Var, nar0Var.f137968c);
        }
        v6w0Var.m197261j(iM197270s2 + iM163368e);
        if (!m163374k(v6w0Var, nar0Var.f137966a, i2, false)) {
            if (nar0Var.f137966a == 4) {
            }
            svv0.m186111f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + nar0Var.f137966a);
            return null;
        }
        while (v6w0Var.m197268q() >= i2) {
            zzagrVarM163369f = m163369f(nar0Var.f137966a, v6w0Var, z2, i2, mar0Var);
            if (zzagrVarM163369f != null) {
                arrayList.add(zzagrVarM163369f);
            }
        }
        return new zzby(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static int m163365b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public static int m163366c(byte[] bArr, int i, int i2) {
        int iM163367d = m163367d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM163367d;
        }
        while (true) {
            int length = bArr.length;
            if (iM163367d >= length - 1) {
                return length;
            }
            int i3 = iM163367d + 1;
            if ((iM163367d - i) % 2 == 0 && bArr[i3] == 0) {
                return iM163367d;
            }
            iM163367d = m163367d(bArr, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m163367d(byte[] bArr, int i) {
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
    public static int m163368e(v6w0 v6w0Var, int i) {
        byte[] bArrM197264m = v6w0Var.m197264m();
        int iM197270s = v6w0Var.m197270s();
        int i2 = iM197270s;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM197270s + i) {
                return i;
            }
            if ((bArrM197264m[i2] & 255) == 255 && bArrM197264m[i3] == 0) {
                System.arraycopy(bArrM197264m, i2 + 2, bArrM197264m, i3, (i - (i2 - iM197270s)) - 2);
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
    public static zzagr m163369f(int i, v6w0 v6w0Var, boolean z, int i2, @Nullable mar0 mar0Var) {
        int iM197241E;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        zzagr zzagrVar;
        int i5;
        zzagr zzageVar;
        zzagr zzagvVar;
        byte[] bArr;
        String strM174257a;
        int i6;
        String strConcat;
        int iM197238B = v6w0Var.m197238B();
        int iM197238B2 = v6w0Var.m197238B();
        int iM197238B3 = v6w0Var.m197238B();
        int iM197238B4 = i >= 3 ? v6w0Var.m197238B() : 0;
        if (i == 4) {
            iM197241E = v6w0Var.m197241E();
            if (!z) {
                iM197241E = ((iM197241E >> 24) << 21) | (iM197241E & 255) | (((iM197241E >> 8) & 255) << 7) | (((iM197241E >> 16) & 255) << 14);
            }
        } else {
            iM197241E = i == 3 ? v6w0Var.m197241E() : v6w0Var.m197240D();
        }
        int iM197242F = i >= 3 ? v6w0Var.m197242F() : 0;
        if (iM197238B == 0 && iM197238B2 == 0 && iM197238B3 == 0 && iM197238B4 == 0 && iM197241E == 0 && iM197242F == 0) {
            v6w0Var.m197262k(v6w0Var.m197271t());
            return null;
        }
        int iM197270s = v6w0Var.m197270s() + iM197241E;
        String str = "Id3Decoder";
        if (iM197270s > v6w0Var.m197271t()) {
            svv0.m186111f("Id3Decoder", "Frame size exceeds remaining tag data");
            v6w0Var.m197262k(v6w0Var.m197271t());
            return null;
        }
        if (mar0Var != null) {
            v6w0Var.m197262k(iM197270s);
            return null;
        }
        if (i == 3) {
            int i7 = iM197242F & 64;
            i3 = (iM197242F & 128) != 0 ? 1 : 0;
            iM197238B = 0;
            z3 = i7 != 0;
            z2 = (iM197242F & 32) != 0;
            i4 = i3;
        } else if (i == 4) {
            boolean z4 = (iM197242F & 64) != 0;
            int i8 = (iM197242F & 8) != 0 ? 1 : 0;
            z3 = (iM197242F & 4) != 0;
            iM197238B = (iM197242F & 2) != 0 ? 1 : 0;
            i4 = iM197242F & 1;
            int i9 = i8;
            z2 = z4;
            i3 = i9;
        } else {
            i3 = 0;
            i4 = 0;
            z2 = false;
            z3 = false;
            iM197238B = 0;
        }
        if (i3 != 0 || z3) {
            svv0.m186111f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            v6w0Var.m197262k(iM197270s);
            return null;
        }
        if (z2) {
            v6w0Var.m197263l(1);
            iM197241E--;
        }
        if (i4 != 0) {
            v6w0Var.m197263l(4);
            iM197241E -= 4;
        }
        if (iM197238B != 0) {
            iM197241E = m163368e(v6w0Var, iM197241E);
        }
        try {
            try {
                if (iM197238B == 84 && iM197238B2 == 88 && iM197238B3 == 88 && (i == 2 || iM197238B4 == 88)) {
                    if (iM197241E <= 0) {
                        iM197238B = iM197238B;
                        str = "Id3Decoder";
                        zzageVar = null;
                    } else {
                        int iM197238B5 = v6w0Var.m197238B();
                        int i10 = iM197241E - 1;
                        byte[] bArr2 = new byte[i10];
                        v6w0Var.m197258g(bArr2, 0, i10);
                        int iM163366c = m163366c(bArr2, 0, iM197238B5);
                        zzageVar = new zzagz("TXXX", new String(bArr2, 0, iM163366c, m163373j(iM197238B5)), m163370g(bArr2, iM197238B5, iM163366c + m163365b(iM197238B5)));
                        str = "Id3Decoder";
                    }
                } else if (iM197238B == 84) {
                    String strM163372i = m163372i(i, 84, iM197238B2, iM197238B3, iM197238B4);
                    if (iM197241E <= 0) {
                        iM197238B = iM197238B;
                        str = "Id3Decoder";
                        zzageVar = null;
                    } else {
                        int iM197238B6 = v6w0Var.m197238B();
                        int i11 = iM197241E - 1;
                        byte[] bArr3 = new byte[i11];
                        v6w0Var.m197258g(bArr3, 0, i11);
                        zzageVar = new zzagz(strM163372i, null, m163370g(bArr3, iM197238B6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iM197238B == 87) {
                        if (iM197238B2 != 88 || iM197238B3 != 88 || (i != 2 && iM197238B4 != 88)) {
                            i5 = 87;
                        }
                        if (iM197241E <= 0) {
                            iM197238B = iM197238B;
                            str = "Id3Decoder";
                            zzageVar = null;
                        } else {
                            int iM197238B7 = v6w0Var.m197238B();
                            int i12 = iM197241E - 1;
                            byte[] bArr4 = new byte[i12];
                            v6w0Var.m197258g(bArr4, 0, i12);
                            int iM163366c2 = m163366c(bArr4, 0, iM197238B7);
                            String str2 = new String(bArr4, 0, iM163366c2, m163373j(iM197238B7));
                            int iM163365b = iM163366c2 + m163365b(iM197238B7);
                            zzageVar = new zzahb("WXXX", str2, m163371h(bArr4, iM163365b, m163367d(bArr4, iM163365b), wew0.f185989b));
                            str = "Id3Decoder";
                        }
                    } else {
                        i5 = iM197238B;
                    }
                    if (i5 == 87) {
                        String strM163372i2 = m163372i(i, 87, iM197238B2, iM197238B3, iM197238B4);
                        byte[] bArr5 = new byte[iM197241E];
                        v6w0Var.m197258g(bArr5, 0, iM197241E);
                        zzageVar = new zzahb(strM163372i2, null, new String(bArr5, 0, m163367d(bArr5, 0), wew0.f185989b));
                    } else {
                        if (i5 == 80) {
                            if (iM197238B2 == 82 && iM197238B3 == 73 && iM197238B4 == 86) {
                                byte[] bArr6 = new byte[iM197241E];
                                v6w0Var.m197258g(bArr6, 0, iM197241E);
                                int iM163367d = m163367d(bArr6, 0);
                                zzageVar = new zzagx(new String(bArr6, 0, iM163367d, wew0.f185989b), m163375l(bArr6, iM163367d + 1, iM197241E));
                            } else {
                                i5 = 80;
                            }
                        }
                        try {
                            if (i5 != 71) {
                                try {
                                    if (i == 2) {
                                        if (i5 != 80 && iM197238B2 == 73 && iM197238B3 == 67) {
                                            int iM197238B8 = v6w0Var.m197238B();
                                            Charset charsetM163373j = m163373j(iM197238B8);
                                            int i13 = iM197241E - 1;
                                            bArr = new byte[i13];
                                            v6w0Var.m197258g(bArr, 0, i13);
                                            if (i == 2) {
                                                strConcat = "image/".concat(String.valueOf(qew0.m174257a(new String(bArr, 0, 3, wew0.f185989b))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                                }
                                                i6 = 2;
                                            } else {
                                                int iM163367d2 = m163367d(bArr, 0);
                                                strM174257a = qew0.m174257a(new String(bArr, 0, iM163367d2, wew0.f185989b));
                                                if (strM174257a.indexOf(47) == -1) {
                                                    strM174257a = "image/".concat(strM174257a);
                                                }
                                                String str3 = strM174257a;
                                                i6 = iM163367d2;
                                                strConcat = str3;
                                            }
                                            int i14 = bArr[i6 + 1] & 255;
                                            int i15 = i6 + 2;
                                            int iM163366c3 = m163366c(bArr, i15, iM197238B8);
                                            zzageVar = new zzagc(strConcat, new String(bArr, i15, iM163366c3 - i15, charsetM163373j), i14, m163375l(bArr, iM163366c3 + m163365b(iM197238B8), i13));
                                        } else {
                                            iM197238B = iM197238B;
                                            if (i5 == 67 || iM197238B2 != 79 || iM197238B3 != 77 || (iM197238B4 != 77 && i != 2)) {
                                                if (i5 != 67 && iM197238B2 == 72 && iM197238B3 == 65 && iM197238B4 == 80) {
                                                    int iM197270s2 = v6w0Var.m197270s();
                                                    int iM163367d3 = m163367d(v6w0Var.m197264m(), iM197270s2);
                                                    String str4 = new String(v6w0Var.m197264m(), iM197270s2, iM163367d3 - iM197270s2, wew0.f185989b);
                                                    v6w0Var.m197262k(iM163367d3 + 1);
                                                    int iM197273v = v6w0Var.m197273v();
                                                    int iM197273v2 = v6w0Var.m197273v();
                                                    long jM197246J = v6w0Var.m197246J();
                                                    long j = jM197246J == 4294967295L ? -1L : jM197246J;
                                                    long jM197246J2 = v6w0Var.m197246J();
                                                    long j2 = jM197246J2 == 4294967295L ? -1L : jM197246J2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i16 = iM197270s2 + iM197241E;
                                                    while (v6w0Var.m197270s() < i16) {
                                                        zzagr zzagrVarM163369f = m163369f(i, v6w0Var, z, i2, null);
                                                        if (zzagrVarM163369f != null) {
                                                            arrayList.add(zzagrVarM163369f);
                                                        }
                                                    }
                                                    zzagvVar = new zzagg(str4, iM197273v, iM197273v2, j, j2, (zzagr[]) arrayList.toArray(new zzagr[0]));
                                                } else if (i5 != 67 && iM197238B2 == 84 && iM197238B3 == 79 && iM197238B4 == 67) {
                                                    int iM197270s3 = v6w0Var.m197270s();
                                                    int iM163367d4 = m163367d(v6w0Var.m197264m(), iM197270s3);
                                                    String str5 = new String(v6w0Var.m197264m(), iM197270s3, iM163367d4 - iM197270s3, wew0.f185989b);
                                                    v6w0Var.m197262k(iM163367d4 + 1);
                                                    int iM197238B9 = v6w0Var.m197238B();
                                                    boolean z5 = (iM197238B9 & 2) != 0;
                                                    int i17 = iM197238B9 & 1;
                                                    int iM197238B10 = v6w0Var.m197238B();
                                                    String[] strArr = new String[iM197238B10];
                                                    int i18 = 0;
                                                    while (i18 < iM197238B10) {
                                                        int iM197270s4 = v6w0Var.m197270s();
                                                        int i19 = iM197270s3;
                                                        int iM163367d5 = m163367d(v6w0Var.m197264m(), iM197270s4);
                                                        String[] strArr2 = strArr;
                                                        strArr2[i18] = new String(v6w0Var.m197264m(), iM197270s4, iM163367d5 - iM197270s4, wew0.f185989b);
                                                        v6w0Var.m197262k(iM163367d5 + 1);
                                                        i18++;
                                                        iM197270s3 = i19;
                                                        iM197238B10 = iM197238B10;
                                                        str5 = str5;
                                                        strArr = strArr2;
                                                    }
                                                    int i20 = iM197270s3;
                                                    String str6 = str5;
                                                    String[] strArr3 = strArr;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int i21 = i20 + iM197241E;
                                                    while (v6w0Var.m197270s() < i21) {
                                                        zzagr zzagrVarM163369f2 = m163369f(i, v6w0Var, z, i2, null);
                                                        if (zzagrVarM163369f2 != null) {
                                                            arrayList2.add(zzagrVarM163369f2);
                                                        }
                                                    }
                                                    zzagvVar = new zzagi(str6, z5, 1 == i17, strArr3, (zzagr[]) arrayList2.toArray(new zzagr[0]));
                                                } else if (i5 != 77 && iM197238B2 == 76 && iM197238B3 == 76 && iM197238B4 == 84) {
                                                    int iM197242F2 = v6w0Var.m197242F();
                                                    int iM197240D = v6w0Var.m197240D();
                                                    int iM197240D2 = v6w0Var.m197240D();
                                                    int iM197238B11 = v6w0Var.m197238B();
                                                    int iM197238B12 = v6w0Var.m197238B();
                                                    x5w0 x5w0Var = new x5w0();
                                                    x5w0Var.m207155i(v6w0Var);
                                                    int i22 = ((iM197241E - 10) * 8) / (iM197238B11 + iM197238B12);
                                                    int[] iArr = new int[i22];
                                                    int[] iArr2 = new int[i22];
                                                    for (int i23 = 0; i23 < i22; i23++) {
                                                        int iM207150d = x5w0Var.m207150d(iM197238B11);
                                                        int iM207150d2 = x5w0Var.m207150d(iM197238B12);
                                                        iArr[i23] = iM207150d;
                                                        iArr2[i23] = iM207150d2;
                                                    }
                                                    zzagvVar = new zzagv(iM197242F2, iM197240D, iM197240D2, iArr, iArr2);
                                                } else {
                                                    String strM163372i3 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                    byte[] bArr7 = new byte[iM197241E];
                                                    v6w0Var.m197258g(bArr7, 0, iM197241E);
                                                    zzageVar = new zzage(strM163372i3, bArr7);
                                                }
                                                zzageVar = zzagvVar;
                                            } else if (iM197241E < 4) {
                                                zzageVar = null;
                                            } else {
                                                int iM197238B13 = v6w0Var.m197238B();
                                                Charset charsetM163373j2 = m163373j(iM197238B13);
                                                byte[] bArr8 = new byte[3];
                                                v6w0Var.m197258g(bArr8, 0, 3);
                                                String str7 = new String(bArr8, 0, 3);
                                                int i24 = iM197241E - 4;
                                                byte[] bArr9 = new byte[i24];
                                                v6w0Var.m197258g(bArr9, 0, i24);
                                                int iM163366c4 = m163366c(bArr9, 0, iM197238B13);
                                                String str8 = new String(bArr9, 0, iM163366c4, charsetM163373j2);
                                                int iM163365b2 = iM163366c4 + m163365b(iM197238B13);
                                                zzageVar = new zzagk(str7, str8, m163371h(bArr9, iM163365b2, m163366c(bArr9, iM163365b2, iM197238B13), charsetM163373j2));
                                            }
                                        }
                                    } else if (i5 != 65 && iM197238B2 == 80 && iM197238B3 == 73 && iM197238B4 == 67) {
                                        int iM197238B14 = v6w0Var.m197238B();
                                        Charset charsetM163373j3 = m163373j(iM197238B14);
                                        int i110 = iM197241E - 1;
                                        bArr = new byte[i110];
                                        v6w0Var.m197258g(bArr, 0, i110);
                                        if (i == 2) {
                                            strConcat = "image/".concat(String.valueOf(qew0.m174257a(new String(bArr, 0, 3, wew0.f185989b))));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                            }
                                            i6 = 2;
                                        } else {
                                            int iM163367d6 = m163367d(bArr, 0);
                                            strM174257a = qew0.m174257a(new String(bArr, 0, iM163367d6, wew0.f185989b));
                                            if (strM174257a.indexOf(47) == -1) {
                                                strM174257a = "image/".concat(strM174257a);
                                            }
                                            String str9 = strM174257a;
                                            i6 = iM163367d6;
                                            strConcat = str9;
                                        }
                                        int i111 = bArr[i6 + 1] & 255;
                                        int i112 = i6 + 2;
                                        int iM163366c5 = m163366c(bArr, i112, iM197238B14);
                                        zzageVar = new zzagc(strConcat, new String(bArr, i112, iM163366c5 - i112, charsetM163373j3), i111, m163375l(bArr, iM163366c5 + m163365b(iM197238B14), i110));
                                    } else {
                                        iM197238B = iM197238B;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM163372i4 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                    byte[] bArr10 = new byte[iM197241E];
                                                    v6w0Var.m197258g(bArr10, 0, iM197241E);
                                                    zzageVar = new zzage(strM163372i4, bArr10);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strM163372i5 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                    byte[] bArr11 = new byte[iM197241E];
                                                    v6w0Var.m197258g(bArr11, 0, iM197241E);
                                                    zzageVar = new zzage(strM163372i5, bArr11);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i6 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr12 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr12, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i6, bArr12);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i7 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr13 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr13, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i7, bArr13);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i8 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr14 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr14, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i8, bArr14);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i9 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr15 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr15, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i9, bArr15);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i10 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr16 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr16, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i10, bArr16);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i11 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr17 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr17, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i11, bArr17);
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    v6w0Var.m197262k(iM197270s);
                                    zzagrVar = null;
                                } catch (OutOfMemoryError e2) {
                                    e = e2;
                                    v6w0Var.m197262k(iM197270s);
                                    zzagrVar = null;
                                }
                                if (zzagrVar == null) {
                                    svv0.m186112g(str, "Failed to decode frame: id=" + m163372i(i, iM197238B, iM197238B2, iM197238B3, iM197238B4) + ", frameSize=" + iM197241E, e);
                                }
                                return zzagrVar;
                            }
                            if (iM197238B2 != 69 || iM197238B3 != 79) {
                                i5 = 71;
                                if (i == 2) {
                                    if (i5 != 80) {
                                    }
                                    iM197238B = iM197238B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i12 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr18 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr18, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i12, bArr18);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i13 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr19 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr19, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i13, bArr19);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i14 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr110 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr110, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i14, bArr110);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i15 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr111 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr111, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i15, bArr111);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i16 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr112 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr112, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i16, bArr112);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i17 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr113 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr113, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i17, bArr113);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i18 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr114 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr114, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i18, bArr114);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i19 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr115 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr115, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i19, bArr115);
                                    }
                                } else {
                                    if (i5 != 65) {
                                    }
                                    iM197238B = iM197238B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i110 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr116 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr116, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i110, bArr116);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i111 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr117 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr117, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i111, bArr117);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i112 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr118 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr118, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i112, bArr118);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i113 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr119 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr119, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i113, bArr119);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i114 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr1110 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr1110, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i114, bArr1110);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i115 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr1111 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr1111, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i115, bArr1111);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i116 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr1112 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr1112, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i116, bArr1112);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i117 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr1113 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr1113, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i117, bArr1113);
                                    }
                                }
                                if (zzagrVar == null) {
                                    svv0.m186112g(str, "Failed to decode frame: id=" + m163372i(i, iM197238B, iM197238B2, iM197238B3, iM197238B4) + ", frameSize=" + iM197241E, e);
                                }
                                return zzagrVar;
                            }
                            if (iM197238B4 != 66 && i != 2) {
                                i5 = 71;
                                if (i == 2) {
                                    if (i5 != 80) {
                                    }
                                    iM197238B = iM197238B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i118 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr1114 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr1114, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i118, bArr1114);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i119 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr1115 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr1115, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i119, bArr1115);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i1110 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr1116 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr1116, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i1110, bArr1116);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i1111 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr1117 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr1117, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i1111, bArr1117);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i1112 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr1118 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr1118, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i1112, bArr1118);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i1113 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr1119 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr1119, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i1113, bArr1119);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i1114 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr11110 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr11110, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i1114, bArr11110);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i1115 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr11111 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr11111, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i1115, bArr11111);
                                    }
                                } else {
                                    if (i5 != 65) {
                                    }
                                    iM197238B = iM197238B;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i1116 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr11112 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr11112, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i1116, bArr11112);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strM163372i1117 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                                byte[] bArr11113 = new byte[iM197241E];
                                                v6w0Var.m197258g(bArr11113, 0, iM197241E);
                                                zzageVar = new zzage(strM163372i1117, bArr11113);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i1118 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr11114 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr11114, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i1118, bArr11114);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i1119 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr11115 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr11115, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i1119, bArr11115);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i11110 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr11116 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr11116, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i11110, bArr11116);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strM163372i11111 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                            byte[] bArr11117 = new byte[iM197241E];
                                            v6w0Var.m197258g(bArr11117, 0, iM197241E);
                                            zzageVar = new zzage(strM163372i11111, bArr11117);
                                        }
                                    } else if (i5 != 67) {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i11112 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr11118 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr11118, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i11112, bArr11118);
                                    } else {
                                        if (i5 != 77) {
                                        }
                                        String strM163372i11113 = m163372i(i, i5, iM197238B2, iM197238B3, iM197238B4);
                                        byte[] bArr11119 = new byte[iM197241E];
                                        v6w0Var.m197258g(bArr11119, 0, iM197241E);
                                        zzageVar = new zzage(strM163372i11113, bArr11119);
                                    }
                                }
                                if (zzagrVar == null) {
                                    svv0.m186112g(str, "Failed to decode frame: id=" + m163372i(i, iM197238B, iM197238B2, iM197238B3, iM197238B4) + ", frameSize=" + iM197241E, e);
                                }
                                return zzagrVar;
                            }
                            try {
                                int iM197238B15 = v6w0Var.m197238B();
                                Charset charsetM163373j4 = m163373j(iM197238B15);
                                int i25 = iM197241E - 1;
                                byte[] bArr20 = new byte[i25];
                                v6w0Var.m197258g(bArr20, 0, i25);
                                int iM163367d7 = m163367d(bArr20, 0);
                                str = "Id3Decoder";
                                String strM196368e = uys0.m196368e(new String(bArr20, 0, iM163367d7, wew0.f185989b));
                                int i26 = iM163367d7 + 1;
                                int iM163366c6 = m163366c(bArr20, i26, iM197238B15);
                                String strM163371h = m163371h(bArr20, i26, iM163366c6, charsetM163373j4);
                                int iM163365b3 = iM163366c6 + m163365b(iM197238B15);
                                int iM163366c7 = m163366c(bArr20, iM163365b3, iM197238B15);
                                iM197238B = iM197238B;
                                zzageVar = new zzagm(strM196368e, strM163371h, m163371h(bArr20, iM163365b3, iM163366c7, charsetM163373j4), m163375l(bArr20, iM163366c7 + m163365b(iM197238B15), i25));
                            } catch (Exception e3) {
                                e = e3;
                                str = "Id3Decoder";
                                iM197238B = iM197238B;
                                v6w0Var.m197262k(iM197270s);
                                zzagrVar = null;
                            } catch (OutOfMemoryError e4) {
                                e = e4;
                                str = "Id3Decoder";
                                iM197238B = iM197238B;
                                v6w0Var.m197262k(iM197270s);
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
                v6w0Var.m197262k(iM197270s);
                zzagrVar = zzageVar;
                e = null;
            } catch (Throwable th) {
                v6w0Var.m197262k(iM197270s);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            iM197238B = iM197238B;
            str = "Id3Decoder";
            v6w0Var.m197262k(iM197270s);
            zzagrVar = null;
            if (zzagrVar == null) {
                svv0.m186112g(str, "Failed to decode frame: id=" + m163372i(i, iM197238B, iM197238B2, iM197238B3, iM197238B4) + ", frameSize=" + iM197241E, e);
            }
            return zzagrVar;
        } catch (OutOfMemoryError e8) {
            e = e8;
            iM197238B = iM197238B;
            str = "Id3Decoder";
            v6w0Var.m197262k(iM197270s);
            zzagrVar = null;
            if (zzagrVar == null) {
                svv0.m186112g(str, "Failed to decode frame: id=" + m163372i(i, iM197238B, iM197238B2, iM197238B3, iM197238B4) + ", frameSize=" + iM197241E, e);
            }
            return zzagrVar;
        }
        if (zzagrVar == null) {
            svv0.m186112g(str, "Failed to decode frame: id=" + m163372i(i, iM197238B, iM197238B2, iM197238B3, iM197238B4) + ", frameSize=" + iM197241E, e);
        }
        return zzagrVar;
    }

    /* JADX INFO: renamed from: g */
    public static zzgaa m163370g(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgaa.zzm("");
        }
        ghw0 ghw0Var = new ghw0();
        int iM163366c = m163366c(bArr, i2, i);
        while (i2 < iM163366c) {
            ghw0Var.m126240g(new String(bArr, i2, iM163366c - i2, m163373j(i)));
            i2 = m163365b(i) + iM163366c;
            iM163366c = m163366c(bArr, i2, i);
        }
        zzgaa zzgaaVarM126243j = ghw0Var.m126243j();
        return zzgaaVarM126243j.isEmpty() ? zzgaa.zzm("") : zzgaaVarM126243j;
    }

    /* JADX INFO: renamed from: h */
    public static String m163371h(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* JADX INFO: renamed from: i */
    public static String m163372i(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: j */
    public static Charset m163373j(int i) {
        if (i == 1) {
            return wew0.f185993f;
        }
        if (i != 2) {
            return i != 3 ? wew0.f185989b : wew0.f185990c;
        }
        return wew0.f185991d;
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
    public static boolean m163374k(v6w0 v6w0Var, int i, int i2, boolean z) {
        boolean z2;
        int iM197240D;
        long jM197240D;
        int iM197242F;
        int i3;
        int iM197270s = v6w0Var.m197270s();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i4 = 1;
                int i5 = 1;
                if (v6w0Var.m197268q() >= i2) {
                    if (i >= 3) {
                        iM197240D = v6w0Var.m197273v();
                        jM197240D = v6w0Var.m197246J();
                        iM197242F = v6w0Var.m197242F();
                    } else {
                        iM197240D = v6w0Var.m197240D();
                        jM197240D = v6w0Var.m197240D();
                        iM197242F = 0;
                    }
                    if (iM197240D != 0 || jM197240D != 0 || iM197242F != 0) {
                        if (i != 4 || z) {
                            if (i == 4) {
                                if ((iM197242F & 64) != 0) {
                                    i4 = 0;
                                }
                                int i6 = i4;
                                i5 = iM197242F & 1;
                                i3 = i6;
                            } else if (i == 3) {
                                if ((iM197242F & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iM197242F & 128) != 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jM197240D >= i3 && v6w0Var.m197268q() >= jM197240D) {
                                v6w0Var.m197263l((int) jM197240D);
                            }
                        } else if ((8421504 & jM197240D) == 0) {
                            long j = ((jM197240D >> 16) & 255) << 14;
                            jM197240D = ((jM197240D >> 24) << 21) | j | (jM197240D & 255) | (((jM197240D >> 8) & 255) << 7);
                            if (i == 4) {
                                if ((iM197242F & 64) != 0) {
                                    i4 = 0;
                                }
                                int i7 = i4;
                                i5 = iM197242F & 1;
                                i3 = i7;
                            } else if (i == 3) {
                                if ((iM197242F & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iM197242F & 128) != 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jM197240D >= i3) {
                                v6w0Var.m197263l((int) jM197240D);
                            }
                        }
                        z2 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                v6w0Var.m197262k(iM197270s);
                throw th;
            }
        }
        v6w0Var.m197262k(iM197270s);
        return z2;
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m163375l(byte[] bArr, int i, int i2) {
        return i2 <= i ? ggw0.f102573f : Arrays.copyOfRange(bArr, i, i2);
    }
}
