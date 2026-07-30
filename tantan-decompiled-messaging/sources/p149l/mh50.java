package p149l;

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
public abstract class mh50 implements ydc0 {
    /* JADX INFO: renamed from: d */
    public static float m154609d(int[] iArr, int[] iArr2, float f) {
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
    public static void m154610e(m03 m03Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iM152494m = m03Var.m152494m();
        if (i >= iM152494m) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !m03Var.m152490f(i);
        while (i < iM152494m) {
            if (m03Var.m152490f(i) == z) {
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
            if (i2 != length - 1 || i != iM152494m) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m154611f(m03 m03Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zM152490f = m03Var.m152490f(i);
        while (i > 0 && length >= 0) {
            i--;
            if (m03Var.m152490f(i) != zM152490f) {
                length--;
                zM152490f = !zM152490f;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        m154610e(m03Var, i + 1, iArr);
    }

    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return m154612c(nx2Var, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !nx2Var.m161929e()) {
                throw e;
            }
            nx2 nx2VarM161930f = nx2Var.m161930f();
            oxc0 oxc0VarM154612c = m154612c(nx2VarM161930f, map);
            Map<ResultMetadataType, Object> mapM166530d = oxc0VarM154612c.m166530d();
            int iIntValue = 270;
            if (mapM166530d != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (mapM166530d.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) mapM166530d.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            oxc0VarM154612c.m166534h(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            pxc0[] pxc0VarArrM166531e = oxc0VarM154612c.m166531e();
            if (pxc0VarArrM166531e != null) {
                int iM161927c = nx2VarM161930f.m161927c();
                for (int i = 0; i < pxc0VarArrM166531e.length; i++) {
                    pxc0VarArrM166531e[i] = new pxc0((iM161927c - pxc0VarArrM166531e[i].m171832d()) - 1.0f, pxc0VarArrM166531e[i].m171831c());
                }
            }
            return oxc0VarM154612c;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* JADX INFO: renamed from: c */
    public final oxc0 m154612c(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i;
        Map<DecodeHintType, ?> map3 = map;
        int iM161928d = nx2Var.m161928d();
        int iM161927c = nx2Var.m161927c();
        m03 m03Var = new m03(iM161928d);
        int i2 = 1;
        boolean z = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, iM161927c >> (z ? 8 : 5));
        int i3 = z ? iM161927c : 15;
        int i4 = iM161927c / 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if ((i5 & 1) != 0) {
                i7 = -i7;
            }
            int i8 = (i7 * iMax) + i4;
            if (i8 < 0 || i8 >= iM161927c) {
                break;
            }
            try {
                m03Var = nx2Var.m161926b(i8, m03Var);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i2) {
                        m03Var.m152497q();
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
                        oxc0 oxc0VarMo100271b = mo100271b(i8, m03Var, map3);
                        if (i9 == i2) {
                            try {
                                oxc0VarMo100271b.m166534h(ResultMetadataType.ORIENTATION, 180);
                                pxc0[] pxc0VarArrM166531e = oxc0VarMo100271b.m166531e();
                                if (pxc0VarArrM166531e != null) {
                                    i = i2;
                                    float f = iM161928d;
                                    try {
                                        map2 = map3;
                                        try {
                                            try {
                                                pxc0VarArrM166531e[0] = new pxc0((f - pxc0VarArrM166531e[0].m171831c()) - 1.0f, pxc0VarArrM166531e[0].m171832d());
                                                pxc0VarArrM166531e[i] = new pxc0((f - pxc0VarArrM166531e[i].m171831c()) - 1.0f, pxc0VarArrM166531e[i].m171832d());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i9++;
                                                map3 = map2;
                                                i2 = i;
                                                iM161928d = iM161928d;
                                            }
                                        } catch (ReaderException unused2) {
                                            i9++;
                                            map3 = map2;
                                            i2 = i;
                                            iM161928d = iM161928d;
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
                        return oxc0VarMo100271b;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i = i2;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i5 = i6;
            i2 = i2;
            iM161928d = iM161928d;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.ydc0
    public void reset() {
    }
}
