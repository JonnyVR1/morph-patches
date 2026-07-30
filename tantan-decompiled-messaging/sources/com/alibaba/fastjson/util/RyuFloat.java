package com.alibaba.fastjson.util;

import com.clevertap.android.sdk.Constants;
import com.tencent.p101mm.opensdk.constants.Build;

/* JADX INFO: loaded from: classes.dex */
public final class RyuFloat {
    private static final int[][] POW5_SPLIT = {new int[]{536870912, 0}, new int[]{Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE, 0}, new int[]{838860800, 0}, new int[]{1048576000, 0}, new int[]{655360000, 0}, new int[]{819200000, 0}, new int[]{1024000000, 0}, new int[]{640000000, 0}, new int[]{800000000, 0}, new int[]{1000000000, 0}, new int[]{625000000, 0}, new int[]{781250000, 0}, new int[]{976562500, 0}, new int[]{610351562, 1073741824}, new int[]{762939453, 268435456}, new int[]{953674316, 872415232}, new int[]{596046447, 1619001344}, new int[]{745058059, 1486880768}, new int[]{931322574, 1321730048}, new int[]{582076609, 289210368}, new int[]{727595761, 898383872}, new int[]{909494701, 1659850752}, new int[]{568434188, 1305842176}, new int[]{710542735, 1632302720}, new int[]{888178419, 1503507488}, new int[]{555111512, 671256724}, new int[]{693889390, 839070905}, new int[]{867361737, 2122580455}, new int[]{542101086, 521306416}, new int[]{677626357, 1725374844}, new int[]{847032947, 546105819}, new int[]{1058791184, 145761362}, new int[]{661744490, 91100851}, new int[]{827180612, 1187617888}, new int[]{1033975765, 1484522360}, new int[]{646234853, 1196261931}, new int[]{807793566, 2032198326}, new int[]{1009741958, 1466506084}, new int[]{631088724, 379695390}, new int[]{788860905, 474619238}, new int[]{986076131, 1130144959}, new int[]{616297582, 437905143}, new int[]{770371977, 1621123253}, new int[]{962964972, 415791331}, new int[]{601853107, 1333611405}, new int[]{752316384, 1130143345}, new int[]{940395480, 1412679181}};
    private static final int[][] POW5_INV_SPLIT = {new int[]{268435456, 1}, new int[]{214748364, 1717986919}, new int[]{171798691, 1803886265}, new int[]{137438953, 1013612282}, new int[]{219902325, 1192282922}, new int[]{175921860, 953826338}, new int[]{140737488, 763061070}, new int[]{225179981, 791400982}, new int[]{180143985, 203624056}, new int[]{144115188, 162899245}, new int[]{230584300, 1978625710}, new int[]{184467440, 1582900568}, new int[]{147573952, 1266320455}, new int[]{236118324, 308125809}, new int[]{188894659, 675997377}, new int[]{151115727, 970294631}, new int[]{241785163, 1981968139}, new int[]{193428131, 297084323}, new int[]{154742504, 1955654377}, new int[]{247588007, 1840556814}, new int[]{198070406, 613451992}, new int[]{158456325, 61264864}, new int[]{253530120, 98023782}, new int[]{202824096, 78419026}, new int[]{162259276, 1780722139}, new int[]{259614842, 1990161963}, new int[]{207691874, 733136111}, new int[]{166153499, 1016005619}, new int[]{265845599, 337118801}, new int[]{212676479, 699191770}, new int[]{170141183, 988850146}};

    /* JADX WARN: Failed to calculate best type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: char[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: char[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r38v0 char[]
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 char[], new type: char[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToForceImmutableTypes(FixTypesVisitor.java:946)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    public static int toString(float f, char[] cArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        int i16;
        if (Float.isNaN(f)) {
            cArr[i] = 'N';
            cArr[i + 1] = 'a';
            i16 = i + 3;
            cArr[i + 2] = 'N';
        } else {
            if (f == Float.POSITIVE_INFINITY) {
                cArr[i] = 'I';
                cArr[i + 1] = 'n';
                cArr[i + 2] = 'f';
                cArr[i + 3] = 'i';
                cArr[i + 4] = 'n';
                cArr[i + 5] = 'i';
                cArr[i + 6] = Constants.INAPP_POSITION_TOP;
                cArr[i + 7] = 'y';
                return (i + 8) - i;
            }
            if (f == Float.NEGATIVE_INFINITY) {
                cArr[i] = '-';
                cArr[i + 1] = 'I';
                cArr[i + 2] = 'n';
                cArr[i + 3] = 'f';
                cArr[i + 4] = 'i';
                cArr[i + 5] = 'n';
                cArr[i + 6] = 'i';
                cArr[i + 7] = Constants.INAPP_POSITION_TOP;
                i16 = i + 9;
                cArr[i + 8] = 'y';
            } else {
                int iFloatToIntBits = Float.floatToIntBits(f);
                if (iFloatToIntBits != 0) {
                    if (iFloatToIntBits == Integer.MIN_VALUE) {
                        cArr[i] = '-';
                        cArr[i + 1] = '0';
                        cArr[i + 2] = '.';
                        cArr[i + 3] = '0';
                        return (i + 4) - i;
                    }
                    int i17 = (iFloatToIntBits >> 23) & 255;
                    int i18 = 8388607 & iFloatToIntBits;
                    if (i17 == 0) {
                        i2 = -149;
                    } else {
                        i2 = i17 - 150;
                        i18 |= 8388608;
                    }
                    boolean z3 = iFloatToIntBits < 0;
                    boolean z4 = (i18 & 1) == 0;
                    int i19 = i18 * 4;
                    int i20 = i19 + 2;
                    int i21 = i19 - ((((long) i18) != 8388608 || i17 <= 1) ? 2 : 1);
                    int i22 = i2 - 2;
                    if (i22 >= 0) {
                        i4 = 0;
                        i8 = (int) ((((long) i22) * 3010299) / 10000000);
                        if (i8 == 0) {
                            i14 = 1;
                            c = 2;
                            j = 10;
                        } else {
                            c = 2;
                            j = 10;
                            i14 = (int) (((((long) i8) * 23219280) + 9999999) / 10000000);
                        }
                        int i23 = (-i22) + i8;
                        int[][] iArr = POW5_INV_SPLIT;
                        int[] iArr2 = iArr[i8];
                        long j2 = iArr2[0];
                        long j3 = iArr2[1];
                        i3 = 10;
                        long j4 = i19;
                        int i24 = ((i14 + 58) + i23) - 31;
                        int i25 = (int) (((j4 * j2) + ((j4 * j3) >> 31)) >> i24);
                        long j5 = i20;
                        int i26 = (int) (((j5 * j2) + ((j5 * j3) >> 31)) >> i24);
                        long j6 = i21;
                        int i27 = (int) (((j2 * j6) + ((j6 * j3) >> 31)) >> i24);
                        if (i8 == 0 || (i26 - 1) / 10 > i27 / 10) {
                            i15 = 0;
                        } else {
                            int i28 = i8 - 1;
                            int i29 = (i23 - 1) + (i28 == 0 ? 1 : (int) (((((long) i28) * 23219280) + 9999999) / 10000000)) + 58;
                            int[] iArr3 = iArr[i28];
                            i15 = (int) ((((((long) iArr3[0]) * j4) + ((j4 * ((long) iArr3[1])) >> 31)) >> (i29 - 31)) % j);
                        }
                        int i30 = 0;
                        while (i20 > 0 && i20 % 5 == 0) {
                            i20 /= 5;
                            i30++;
                        }
                        int i31 = 0;
                        while (i19 > 0 && i19 % 5 == 0) {
                            i19 /= 5;
                            i31++;
                        }
                        int i32 = 0;
                        while (i21 > 0 && i21 % 5 == 0) {
                            i21 /= 5;
                            i32++;
                        }
                        boolean z5 = i30 >= i8;
                        boolean z6 = i31 >= i8;
                        i9 = i32 >= i8 ? 1 : 0;
                        z = z5;
                        i5 = i25;
                        i10 = i15;
                        z2 = z6;
                        i11 = i26;
                        i6 = i27;
                    } else {
                        i3 = 10;
                        i4 = 0;
                        int i33 = -i22;
                        int i34 = (int) ((((long) i33) * 6989700) / 10000000);
                        int i35 = i33 - i34;
                        int i36 = i35 == 0 ? 1 : (int) (((((long) i35) * 23219280) + 9999999) / 10000000);
                        int[][] iArr4 = POW5_SPLIT;
                        int[] iArr5 = iArr4[i35];
                        long j7 = iArr5[0];
                        long j8 = iArr5[1];
                        int i37 = (i34 - (i36 - 61)) - 31;
                        long j9 = i19;
                        i5 = (int) (((j9 * j7) + ((j9 * j8) >> 31)) >> i37);
                        long j10 = i20;
                        int i38 = (int) (((j10 * j7) + ((j10 * j8) >> 31)) >> i37);
                        long j11 = i21;
                        i6 = (int) (((j7 * j11) + ((j11 * j8) >> 31)) >> i37);
                        if (i34 == 0 || (i38 - 1) / 10 > i6 / 10) {
                            i7 = 0;
                        } else {
                            int i39 = i35 + 1;
                            int i40 = (i34 - 1) - ((i39 == 0 ? 1 : (int) (((((long) i39) * 23219280) + 9999999) / 10000000)) - 61);
                            int[] iArr6 = iArr4[i39];
                            i7 = (int) ((((((long) iArr6[0]) * j9) + ((j9 * ((long) iArr6[1])) >> 31)) >> (i40 - 31)) % 10);
                        }
                        i8 = i34 + i22;
                        z = 1 >= i34;
                        z2 = i34 < 23 && (((1 << (i34 + (-1))) - 1) & i19) == 0;
                        i9 = (i21 % 2 == 1 ? 0 : 1) >= i34 ? 1 : 0;
                        i10 = i7;
                        i11 = i38;
                    }
                    int i41 = 1000000000;
                    int i42 = i3;
                    while (i42 > 0 && i11 < i41) {
                        i41 /= 10;
                        i42--;
                    }
                    int i43 = i8 + i42;
                    int i44 = i43 - 1;
                    int i45 = (i44 < -3 || i44 >= 7) ? 1 : i4;
                    if (z && !z4) {
                        i11--;
                    }
                    int i46 = i4;
                    while (true) {
                        int i47 = i11 / 10;
                        int i48 = i6 / 10;
                        if (i47 <= i48 || (i11 < 100 && i45 != 0)) {
                            break;
                        }
                        i9 &= i6 % 10 == 0 ? 1 : i4;
                        i10 = i5 % 10;
                        i5 /= 10;
                        i46++;
                        i11 = i47;
                        i6 = i48;
                    }
                    if (i9 != 0 && z4) {
                        while (i6 % 10 == 0 && (i11 >= 100 || i45 == 0)) {
                            i11 /= 10;
                            i10 = i5 % 10;
                            i5 /= 10;
                            i6 /= 10;
                            i46++;
                        }
                    }
                    int i49 = i5;
                    if (z2 && i10 == 5 && i49 % 2 == 0) {
                        i10 = 4;
                    }
                    int i50 = i49 + (((i49 != i6 || (i9 != 0 && z4)) && i10 < 5) ? i4 : 1);
                    int i51 = i42 - i46;
                    if (z3) {
                        i12 = i + 1;
                        cArr[i] = 45;
                    } else {
                        i12 = i;
                    }
                    if (i45 != 0) {
                        for (int i52 = i4; i52 < i51 - 1; i52++) {
                            int i53 = i50 % 10;
                            i50 /= 10;
                            cArr[(i12 + i51) - i52] = (char) (i53 + 48);
                        }
                        cArr[i12] = (char) ((i50 % 10) + 48);
                        cArr[i12 + 1] = '.';
                        int i54 = i12 + i51 + 1;
                        if (i51 == 1) {
                            cArr[i54] = 48;
                            i54++;
                        }
                        int i55 = i54 + 1;
                        cArr[i54] = 'E';
                        if (i44 < 0) {
                            cArr[i55] = r7;
                            i44 = -i44;
                            i55 = i54 + 2;
                        }
                        if (i44 >= i3) {
                            cArr[i55] = (char) ((i44 / 10) + 48);
                            i55++;
                        }
                        i13 = i55 + 1;
                        cArr[i55] = (char) ((i44 % 10) + 48);
                    } else if (i44 < 0) {
                        int i56 = i12 + 1;
                        cArr[i12] = r2;
                        int i57 = i12 + 2;
                        cArr[i56] = '.';
                        int i58 = -1;
                        while (i58 > i44) {
                            cArr[i57] = r2;
                            i58--;
                            i57++;
                        }
                        int i59 = i57;
                        for (int i60 = i4; i60 < i51; i60++) {
                            cArr[((i57 + i51) - i60) - 1] = (char) ((i50 % 10) + 48);
                            i50 /= 10;
                            i59++;
                        }
                        i13 = i59;
                    } else if (i43 >= i51) {
                        for (int i61 = i4; i61 < i51; i61++) {
                            cArr[((i12 + i51) - i61) - 1] = (char) ((i50 % 10) + 48);
                            i50 /= 10;
                        }
                        int i62 = i12 + i51;
                        while (i51 < i43) {
                            cArr[i62] = r2;
                            i51++;
                            i62++;
                        }
                        cArr[i62] = '.';
                        i13 = i62 + 2;
                        cArr[i62 + 1] = r2;
                    } else {
                        int i63 = i12 + 1;
                        for (int i64 = i4; i64 < i51; i64++) {
                            if ((i51 - i64) - 1 == i44) {
                                cArr[((i63 + i51) - i64) - 1] = '.';
                                i63--;
                            }
                            cArr[((i63 + i51) - i64) - 1] = (char) ((i50 % 10) + 48);
                            i50 /= 10;
                        }
                        i13 = i51 + 1 + i12;
                    }
                    return i13 - i;
                }
                cArr[i] = '0';
                cArr[i + 1] = '.';
                i16 = i + 3;
                cArr[i + 2] = '0';
            }
        }
        return i16 - i;
    }

    public static String toString(float f) {
        char[] cArr = new char[15];
        return new String(cArr, 0, toString(f, cArr, 0));
    }
}
