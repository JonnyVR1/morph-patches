package p153l;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class sp50 implements fmc0 {
    /* JADX INFO: renamed from: d */
    public static float m187324d(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* JADX INFO: renamed from: e */
    public static void m187325e(b13 b13Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iM101402m = b13Var.m101402m();
        if (i >= iM101402m) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !b13Var.m101398f(i);
        while (i < iM101402m) {
            if (b13Var.m101398f(i) == z) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != iM101402m) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m187326f(b13 b13Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zM101398f = b13Var.m101398f(i);
        while (i > 0 && length >= 0) {
            i--;
            if (b13Var.m101398f(i) != zM101398f) {
                length--;
                zM101398f = !zM101398f;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        m187325e(b13Var, i + 1, iArr);
    }

    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return m187327c(cy2Var, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !cy2Var.m113090e()) {
                throw e;
            }
            cy2 cy2VarM113091f = cy2Var.m113091f();
            r5d0 r5d0VarM187327c = m187327c(cy2VarM113091f, map);
            Map<ResultMetadataType, Object> mapM179855d = r5d0VarM187327c.m179855d();
            int iIntValue = 270;
            if (mapM179855d != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (mapM179855d.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) mapM179855d.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            r5d0VarM187327c.m179859h(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            s5d0[] s5d0VarArrM179856e = r5d0VarM187327c.m179856e();
            if (s5d0VarArrM179856e != null) {
                int iM113088c = cy2VarM113091f.m113088c();
                for (int i = 0; i < s5d0VarArrM179856e.length; i++) {
                    s5d0VarArrM179856e[i] = new s5d0((iM113088c - s5d0VarArrM179856e[i].m184658d()) - 1.0f, s5d0VarArrM179856e[i].m184657c());
                }
            }
            return r5d0VarM187327c;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* JADX INFO: renamed from: c */
    public final r5d0 m187327c(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i;
        Map<DecodeHintType, ?> map3 = map;
        int iM113089d = cy2Var.m113089d();
        int iM113088c = cy2Var.m113088c();
        b13 b13Var = new b13(iM113089d);
        int i2 = 1;
        boolean z = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, iM113088c >> (z ? 8 : 5));
        int i3 = z ? iM113088c : 15;
        int i4 = iM113088c / 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if ((i5 & 1) != 0) {
                i7 = -i7;
            }
            int i8 = (i7 * iMax) + i4;
            if (i8 < 0 || i8 >= iM113088c) {
                break;
            }
            try {
                b13Var = cy2Var.m113087b(i8, b13Var);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i2) {
                        b13Var.m101405q();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        r5d0 r5d0VarMo99812b = mo99812b(i8, b13Var, map3);
                        if (i9 == i2) {
                            try {
                                r5d0VarMo99812b.m179859h(ResultMetadataType.ORIENTATION, 180);
                                s5d0[] s5d0VarArrM179856e = r5d0VarMo99812b.m179856e();
                                if (s5d0VarArrM179856e != null) {
                                    i = i2;
                                    float f = iM113089d;
                                    try {
                                        map2 = map3;
                                        try {
                                            try {
                                                s5d0VarArrM179856e[0] = new s5d0((f - s5d0VarArrM179856e[0].m184657c()) - 1.0f, s5d0VarArrM179856e[0].m184658d());
                                                s5d0VarArrM179856e[i] = new s5d0((f - s5d0VarArrM179856e[i].m184657c()) - 1.0f, s5d0VarArrM179856e[i].m184658d());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i9++;
                                                map3 = map2;
                                                i2 = i;
                                                iM113089d = iM113089d;
                                            }
                                        } catch (ReaderException unused2) {
                                            i9++;
                                            map3 = map2;
                                            i2 = i;
                                            iM113089d = iM113089d;
                                        }
                                    } catch (ReaderException unused3) {
                                        map2 = map3;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                                i = i2;
                            }
                        }
                        return r5d0VarMo99812b;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i = i2;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i5 = i6;
            i2 = i2;
            iM113089d = iM113089d;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.fmc0
    public void reset() {
    }
}
