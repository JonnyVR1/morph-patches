package com.alibaba.fastjson.util;

import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import java.lang.reflect.Array;
import java.math.BigInteger;
import p153l.za50;

/* JADX INFO: loaded from: classes.dex */
public final class RyuDouble {
    private static final int[][] POW5_INV_SPLIT;
    private static final int[][] POW5_SPLIT;

    static {
        Class cls = Integer.TYPE;
        POW5_SPLIT = (int[][]) Array.newInstance((Class<?>) cls, 326, 4);
        POW5_INV_SPLIT = (int[][]) Array.newInstance((Class<?>) cls, 291, 4);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger.shiftLeft(31).subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigInteger.shiftLeft(31).subtract(bigInteger);
        int i = 0;
        while (i < 326) {
            BigInteger bigIntegerPow = BigInteger.valueOf(5L).pow(i);
            int iBitLength = bigIntegerPow.bitLength();
            int i2 = i == 0 ? 1 : (int) (((((long) i) * 23219280) + 9999999) / 10000000);
            if (i2 != iBitLength) {
                throw new IllegalStateException(iBitLength + " != " + i2);
            }
            if (i < POW5_SPLIT.length) {
                for (int i3 = 0; i3 < 4; i3++) {
                    POW5_SPLIT[i][i3] = bigIntegerPow.shiftRight((iBitLength - 121) + ((3 - i3) * 31)).and(bigIntegerSubtract).intValue();
                }
            }
            if (i < POW5_INV_SPLIT.length) {
                BigInteger bigInteger2 = BigInteger.ONE;
                BigInteger bigIntegerAdd = bigInteger2.shiftLeft(iBitLength + 121).divide(bigIntegerPow).add(bigInteger2);
                for (int i4 = 0; i4 < 4; i4++) {
                    if (i4 == 0) {
                        POW5_INV_SPLIT[i][i4] = bigIntegerAdd.shiftRight((3 - i4) * 31).intValue();
                    } else {
                        POW5_INV_SPLIT[i][i4] = bigIntegerAdd.shiftRight((3 - i4) * 31).and(bigIntegerSubtract2).intValue();
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: char[]
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
    /* JADX WARN: Failed to set immutable type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: char[]
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
    /* JADX WARN: Failed to set immutable type for var: r57v0 char[]
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 char[], new type: char[]
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
    public static int toString(double d, char[] cArr, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        int iMax;
        boolean z2;
        boolean z3;
        long j2;
        long j3;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        int i10;
        int i11;
        int i12;
        int i13;
        if (!Double.isNaN(d)) {
            if (d == Double.POSITIVE_INFINITY) {
                cArr[i] = 'I';
                cArr[i + 1] = 'n';
                cArr[i + 2] = 'f';
                cArr[i + 3] = 'i';
                cArr[i + 4] = 'n';
                cArr[i + 5] = 'i';
                cArr[i + 6] = Constants.INAPP_POSITION_TOP;
                i9 = i + 8;
                cArr[i + 7] = 'y';
            } else if (d == Double.NEGATIVE_INFINITY) {
                cArr[i] = '-';
                cArr[i + 1] = 'I';
                cArr[i + 2] = 'n';
                cArr[i + 3] = 'f';
                cArr[i + 4] = 'i';
                cArr[i + 5] = 'n';
                cArr[i + 6] = 'i';
                cArr[i + 7] = Constants.INAPP_POSITION_TOP;
                i13 = i + 9;
                cArr[i + 8] = 'y';
            } else {
                long jDoubleToLongBits = Double.doubleToLongBits(d);
                if (jDoubleToLongBits == 0) {
                    cArr[i] = '0';
                    cArr[i + 1] = '.';
                    i13 = i + 3;
                    cArr[i + 2] = '0';
                } else if (jDoubleToLongBits == Long.MIN_VALUE) {
                    cArr[i] = '-';
                    cArr[i + 1] = '0';
                    cArr[i + 2] = '.';
                    i9 = i + 4;
                    cArr[i + 3] = '0';
                } else {
                    int i14 = (int) ((jDoubleToLongBits >>> 52) & 2047);
                    long j5 = jDoubleToLongBits & 4503599627370495L;
                    if (i14 == 0) {
                        i2 = -1074;
                    } else {
                        i2 = i14 - 1075;
                        j5 |= 4503599627370496L;
                    }
                    boolean z6 = jDoubleToLongBits < 0;
                    boolean z7 = (j5 & 1) == 0;
                    long j6 = 4 * j5;
                    long j7 = j6 + 2;
                    int i15 = (j5 != 4503599627370496L || i14 <= 1) ? 1 : 0;
                    long j8 = (j6 - 1) - ((long) i15);
                    int i16 = i2 - 2;
                    if (i16 >= 0) {
                        i3 = 3;
                        iMax = Math.max(0, ((int) ((((long) i16) * 3010299) / 10000000)) - 1);
                        int i17 = (-i16) + iMax + (iMax == 0 ? 1 : (int) (((((long) iMax) * 23219280) + 9999999) / 10000000)) + 121 + EffectsSDKEffectConstants.EffectsSDKResultCode.BEF_RESULT_INVALID_LICENSE;
                        if (i17 < 0) {
                            za50.m219101a("", i17);
                            return 0;
                        }
                        int[] iArr = POW5_INV_SPLIT[iMax];
                        long j9 = j6 >>> 31;
                        long j10 = j6 & 2147483647L;
                        int i18 = iArr[0];
                        long j11 = ((long) i18) * j9;
                        int i19 = iArr[1];
                        int i20 = iArr[2];
                        int i21 = iArr[3];
                        long j12 = ((((((((((((j10 * ((long) i21)) >>> 31) + (((long) i20) * j10)) + (j9 * ((long) i21))) >>> 31) + (((long) i19) * j10)) + (((long) i20) * j9)) >>> 31) + (((long) i18) * j10)) + (((long) i19) * j9)) >>> 21) + (j11 << 10)) >>> i17;
                        long j13 = j7 >>> 31;
                        long j14 = j7 & 2147483647L;
                        long j15 = ((((((((((((j14 * ((long) i21)) >>> 31) + (((long) i20) * j14)) + (j13 * ((long) i21))) >>> 31) + (((long) i19) * j14)) + (((long) i20) * j13)) >>> 31) + (((long) i18) * j14)) + (((long) i19) * j13)) >>> 21) + ((((long) i18) * j13) << 10)) >>> i17;
                        long j16 = j8 >>> 31;
                        long j17 = j8 & 2147483647L;
                        j = j15;
                        long j18 = ((((((((((((j17 * ((long) i21)) >>> 31) + (((long) i20) * j17)) + (j16 * ((long) i21))) >>> 31) + (((long) i19) * j17)) + (((long) i20) * j16)) >>> 31) + (((long) i18) * j17)) + (((long) i19) * j16)) >>> 21) + ((((long) i18) * j16) << 10)) >>> i17;
                        if (iMax <= 21) {
                            long j19 = j6 % 5;
                            if (j19 == 0) {
                                if (j19 != 0) {
                                    i12 = 0;
                                } else if (j6 % 25 != 0) {
                                    i12 = 1;
                                } else if (j6 % 125 != 0) {
                                    i12 = 2;
                                } else if (j6 % 625 != 0) {
                                    i12 = 3;
                                } else {
                                    long j20 = j6 / 625;
                                    i12 = 4;
                                    while (j20 > 0 && j20 % 5 == 0) {
                                        j20 /= 5;
                                        i12++;
                                    }
                                }
                                z5 = i12 >= iMax;
                                z4 = false;
                            } else if (z7) {
                                if (j8 % 5 != 0) {
                                    i11 = 0;
                                } else if (j8 % 25 != 0) {
                                    i11 = 1;
                                } else if (j8 % 125 != 0) {
                                    i11 = 2;
                                } else if (j8 % 625 != 0) {
                                    i11 = 3;
                                } else {
                                    long j21 = j8 / 625;
                                    i11 = 4;
                                    while (j21 > 0 && j21 % 5 == 0) {
                                        j21 /= 5;
                                        i11++;
                                    }
                                }
                                z4 = i11 >= iMax;
                                z5 = false;
                            } else {
                                if (j7 % 5 != 0) {
                                    i10 = 0;
                                } else if (j7 % 25 != 0) {
                                    i10 = 1;
                                } else if (j7 % 125 != 0) {
                                    i10 = 2;
                                } else if (j7 % 625 != 0) {
                                    i10 = 3;
                                } else {
                                    long j22 = j7 / 625;
                                    i10 = 4;
                                    while (j22 > 0 && j22 % 5 == 0) {
                                        j22 /= 5;
                                        i10++;
                                    }
                                }
                                if (i10 >= iMax) {
                                    j--;
                                }
                                z4 = false;
                                z5 = false;
                            }
                        } else {
                            z4 = false;
                            z5 = false;
                        }
                        z3 = z5;
                        boolean z8 = z6;
                        z2 = z4;
                        j2 = j18;
                        j3 = j12;
                        z = z8;
                        i4 = 10;
                    } else {
                        i3 = 3;
                        int i22 = -i16;
                        int iMax2 = Math.max(0, ((int) ((((long) i22) * 6989700) / 10000000)) - 1);
                        int i23 = i22 - iMax2;
                        int i24 = (iMax2 - ((i23 == 0 ? 1 : (int) (((((long) i23) * 23219280) + 9999999) / 10000000)) - 121)) + EffectsSDKEffectConstants.EffectsSDKResultCode.BEF_RESULT_INVALID_LICENSE;
                        if (i24 < 0) {
                            za50.m219101a("", i24);
                            return 0;
                        }
                        int[] iArr2 = POW5_SPLIT[i23];
                        long j23 = j6 >>> 31;
                        long j24 = j6 & 2147483647L;
                        int i25 = iArr2[0];
                        i4 = 10;
                        int i26 = iArr2[1];
                        z = z6;
                        int i27 = iArr2[2];
                        int i28 = iArr2[3];
                        long j25 = ((((((((((((j24 * ((long) i28)) >>> 31) + (((long) i27) * j24)) + (((long) i28) * j23)) >>> 31) + (((long) i26) * j24)) + (((long) i27) * j23)) >>> 31) + (((long) i25) * j24)) + (j23 * ((long) i26))) >>> 21) + ((((long) i25) * j23) << 10)) >>> i24;
                        long j26 = j7 >>> 31;
                        long j27 = j7 & 2147483647L;
                        j = ((((((((((((j27 * ((long) i28)) >>> 31) + (((long) i27) * j27)) + (j26 * ((long) i28))) >>> 31) + (((long) i26) * j27)) + (((long) i27) * j26)) >>> 31) + (((long) i25) * j27)) + (((long) i26) * j26)) >>> 21) + ((((long) i25) * j26) << 10)) >>> i24;
                        long j28 = j8 >>> 31;
                        long j29 = j8 & 2147483647L;
                        long j30 = ((((((((((((j29 * ((long) i28)) >>> 31) + (((long) i27) * j29)) + (((long) i28) * j28)) >>> 31) + (((long) i26) * j29)) + (((long) i27) * j28)) >>> 31) + (((long) i25) * j29)) + (((long) i26) * j28)) >>> 21) + ((((long) i25) * j28) << 10)) >>> i24;
                        iMax = iMax2 + i16;
                        if (iMax2 <= 1) {
                            if (z7) {
                                boolean z9 = i15 == 1;
                                iMax = iMax;
                                z3 = true;
                                z2 = z9;
                            } else {
                                j--;
                                z3 = true;
                                z2 = false;
                            }
                        } else if (iMax2 < 63) {
                            z3 = (j6 & ((1 << (iMax2 - 1)) - 1)) == 0;
                            z2 = false;
                        } else {
                            iMax = iMax;
                            z2 = false;
                            z3 = false;
                        }
                        j2 = j30;
                        j3 = j25;
                    }
                    if (j >= 1000000000000000000L) {
                        i5 = 19;
                    } else if (j >= 100000000000000000L) {
                        i5 = 18;
                    } else if (j >= 10000000000000000L) {
                        i5 = 17;
                    } else if (j >= 1000000000000000L) {
                        i5 = 16;
                    } else if (j >= 100000000000000L) {
                        i5 = 15;
                    } else if (j >= 10000000000000L) {
                        i5 = 14;
                    } else if (j >= 1000000000000L) {
                        i5 = 13;
                    } else if (j >= 100000000000L) {
                        i5 = 12;
                    } else if (j >= 10000000000L) {
                        i5 = 11;
                    } else if (j >= 1000000000) {
                        i5 = i4;
                    } else if (j >= 100000000) {
                        i5 = 9;
                    } else if (j >= 10000000) {
                        i5 = 8;
                    } else if (j >= 1000000) {
                        i5 = 7;
                    } else if (j >= 100000) {
                        i5 = 6;
                    } else if (j >= 10000) {
                        i5 = 5;
                    } else if (j >= 1000) {
                        i5 = 4;
                    } else if (j >= 100) {
                        i5 = i3;
                    } else {
                        i5 = j >= 10 ? 2 : 1;
                    }
                    int i29 = iMax + i5;
                    int i30 = i29 - 1;
                    boolean z10 = i30 < -3 || i30 >= 7;
                    if (z2 || z3) {
                        boolean z11 = z2;
                        boolean z12 = z3;
                        int i31 = 0;
                        int i32 = 0;
                        while (true) {
                            long j31 = j / 10;
                            long j32 = j2 / 10;
                            if (j31 <= j32 || (j < 100 && z10)) {
                                break;
                            }
                            z11 &= j2 % 10 == 0;
                            z12 &= i31 == 0;
                            i31 = (int) (j3 % 10);
                            j3 /= 10;
                            i32++;
                            j = j31;
                            j2 = j32;
                        }
                        if (z11 && z7) {
                            for (long j33 = 100; j2 % 10 == 0 && (j >= j33 || !z10); j33 = 100) {
                                z12 &= i31 == 0;
                                i31 = (int) (j3 % 10);
                                j /= 10;
                                j3 /= 10;
                                j2 /= 10;
                                i32++;
                            }
                        }
                        if (z12 && i31 == 5 && j3 % 2 == 0) {
                            i31 = 4;
                        }
                        j4 = j3 + ((long) (((j3 != j2 || (z11 && z7)) && i31 < 5) ? 0 : 1));
                        i6 = i32;
                    } else {
                        i6 = 0;
                        int i33 = 0;
                        while (true) {
                            long j34 = j / 10;
                            long j35 = j2 / 10;
                            if (j34 <= j35 || (j < 100 && z10)) {
                                break;
                            }
                            i33 = (int) (j3 % 10);
                            j3 /= 10;
                            i6++;
                            j = j34;
                            j2 = j35;
                        }
                        j4 = j3 + ((long) ((j3 == j2 || i33 >= 5) ? 1 : 0));
                    }
                    int i34 = i5 - i6;
                    if (z) {
                        i7 = i + 1;
                        cArr[i] = 45;
                    } else {
                        i7 = i;
                    }
                    if (!z10) {
                        if (i30 < 0) {
                            int i35 = i7 + 1;
                            cArr[i7] = r8;
                            int i36 = i7 + 2;
                            cArr[i35] = r6;
                            int i37 = -1;
                            while (i37 > i30) {
                                cArr[i36] = r8;
                                i37--;
                                i36++;
                            }
                            i8 = i36;
                            for (int i38 = 0; i38 < i34; i38++) {
                                cArr[((i36 + i34) - i38) - 1] = (char) ((j4 % 10) + 48);
                                j4 /= 10;
                                i8++;
                            }
                        } else if (i29 >= i34) {
                            for (int i39 = 0; i39 < i34; i39++) {
                                cArr[((i7 + i34) - i39) - 1] = (char) ((j4 % 10) + 48);
                                j4 /= 10;
                            }
                            int i40 = i7 + i34;
                            while (i34 < i29) {
                                cArr[i40] = r8;
                                i34++;
                                i40++;
                            }
                            cArr[i40] = r6;
                            i8 = i40 + 2;
                            cArr[i40 + 1] = r8;
                        } else {
                            int i41 = i7 + 1;
                            for (int i42 = 0; i42 < i34; i42++) {
                                if ((i34 - i42) - 1 == i30) {
                                    cArr[((i41 + i34) - i42) - 1] = r6;
                                    i41--;
                                }
                                cArr[((i41 + i34) - i42) - 1] = (char) ((j4 % 10) + 48);
                                j4 /= 10;
                            }
                            i8 = i7 + i34 + 1;
                        }
                        return i8 - i;
                    }
                    for (int i43 = 0; i43 < i34 - 1; i43++) {
                        int i44 = (int) (j4 % 10);
                        j4 /= 10;
                        cArr[(i7 + i34) - i43] = (char) (i44 + 48);
                    }
                    cArr[i7] = (char) ((j4 % 10) + 48);
                    cArr[i7 + 1] = 46;
                    int i45 = i7 + i34 + 1;
                    if (i34 == 1) {
                        cArr[i45] = 48;
                        i45++;
                    }
                    int i46 = i45 + 1;
                    cArr[i45] = 'E';
                    if (i30 < 0) {
                        cArr[i46] = r7;
                        i30 = -i30;
                        i46 = i45 + 2;
                    }
                    if (i30 >= 100) {
                        int i47 = i46 + 1;
                        cArr[i46] = (char) ((i30 / 100) + 48);
                        i30 %= 100;
                        i46 += 2;
                        cArr[i47] = (char) ((i30 / 10) + 48);
                    } else if (i30 >= i4) {
                        cArr[i46] = (char) ((i30 / 10) + 48);
                        i46++;
                    }
                    i9 = i46 + 1;
                    cArr[i46] = (char) ((i30 % 10) + 48);
                }
            }
            return i9 - i;
        }
        cArr[i] = 'N';
        cArr[i + 1] = 'a';
        i13 = i + 3;
        cArr[i + 2] = 'N';
        return i13 - i;
    }

    public static String toString(double d) {
        char[] cArr = new char[24];
        return new String(cArr, 0, toString(d, cArr, 0));
    }
}
