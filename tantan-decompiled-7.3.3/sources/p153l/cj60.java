package p153l;

import android.graphics.Path;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
public final class cj60 {

    /* JADX INFO: renamed from: l.cj60$a */
    public static class C16273a {

        /* JADX INFO: renamed from: a */
        public int f82103a;

        /* JADX INFO: renamed from: b */
        public boolean f82104b;
    }

    /* JADX INFO: renamed from: a */
    public static void m110062a(ArrayList<C16274b> arrayList, char c, float[] fArr) {
        arrayList.add(new C16274b(c, fArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m110063b(@Nullable C16274b[] c16274bArr, @Nullable C16274b[] c16274bArr2) {
        if (c16274bArr == null || c16274bArr2 == null || c16274bArr.length != c16274bArr2.length) {
            return false;
        }
        for (int i = 0; i < c16274bArr.length; i++) {
            if (c16274bArr[i].f82105a != c16274bArr2[i].f82105a || c16274bArr[i].f82106b.length != c16274bArr2[i].f82106b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static float[] m110064c(float[] fArr, int i, int i2) {
        if (i > i2) {
            fig0.m125680a();
            return null;
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C16274b[] m110065d(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iM110069h = m110069h(str, i2);
            String strTrim = str.substring(i, iM110069h).trim();
            if (!strTrim.isEmpty()) {
                m110062a(arrayList, strTrim.charAt(0), m110068g(strTrim));
            }
            i = iM110069h;
            i2 = iM110069h + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            m110062a(arrayList, str.charAt(i), new float[0]);
        }
        return (C16274b[]) arrayList.toArray(new C16274b[0]);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static C16274b[] m110066e(@NonNull C16274b[] c16274bArr) {
        C16274b[] c16274bArr2 = new C16274b[c16274bArr.length];
        for (int i = 0; i < c16274bArr.length; i++) {
            c16274bArr2[i] = new C16274b(c16274bArr[i]);
        }
        return c16274bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX INFO: renamed from: f */
    public static void m110067f(String str, int i, C16273a c16273a) {
        c16273a.f82104b = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z = false;
                        z3 = true;
                        break;
                    case '-':
                        if (i2 == i || z) {
                            z = false;
                        } else {
                            c16273a.f82104b = true;
                            z = false;
                            z3 = true;
                        }
                        break;
                    case '.':
                        if (z2) {
                            c16273a.f82104b = true;
                            z = false;
                            z3 = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = true;
            }
            if (z3) {
                c16273a.f82103a = i2;
            }
        }
        c16273a.f82103a = i2;
    }

    /* JADX INFO: renamed from: g */
    public static float[] m110068g(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C16273a c16273a = new C16273a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m110067f(str, i, c16273a);
                int i3 = c16273a.f82103a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = c16273a.f82104b ? i3 : i3 + 1;
            }
            return m110064c(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m110069h(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public static void m110070i(@NonNull C16274b[] c16274bArr, @NonNull Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (C16274b c16274b : c16274bArr) {
            C16274b.m110076e(path, fArr, c, c16274b.f82105a, c16274b.f82106b);
            c = c16274b.f82105a;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m110071j(@NonNull C16274b[] c16274bArr, @NonNull C16274b[] c16274bArr2) {
        for (int i = 0; i < c16274bArr2.length; i++) {
            c16274bArr[i].f82105a = c16274bArr2[i].f82105a;
            for (int i2 = 0; i2 < c16274bArr2[i].f82106b.length; i2++) {
                c16274bArr[i].f82106b[i2] = c16274bArr2[i].f82106b[i2];
            }
        }
    }

    /* JADX INFO: renamed from: l.cj60$b */
    public static class C16274b {

        /* JADX INFO: renamed from: a */
        public char f82105a;

        /* JADX INFO: renamed from: b */
        public final float[] f82106b;

        public C16274b(C16274b c16274b) {
            this.f82105a = c16274b.f82105a;
            float[] fArr = c16274b.f82106b;
            this.f82106b = cj60.m110064c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: e */
        public static void m110076e(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            char c3;
            char c4;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            Path path2 = path;
            boolean z3 = false;
            float f14 = fArr[0];
            boolean z4 = true;
            float f15 = fArr[1];
            char c5 = 2;
            float f16 = fArr[2];
            char c6 = 3;
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c2) {
                case 'A':
                case EACTags.APPLICATION_TEMPLATE /* 97 */:
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case EACTags.TRACK1_APPLICATION /* 86 */:
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case EACTags.FILE_REFERENCE /* 81 */:
                case EACTags.DISCRETIONARY_DATA /* 83 */:
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    i2 = 2;
                    break;
            }
            float f20 = f14;
            float f21 = f15;
            float f22 = f18;
            float f23 = f19;
            int i4 = 0;
            char c7 = c;
            while (i4 < fArr2.length) {
                if (c2 == 'A') {
                    z = z3;
                    z2 = z4;
                    c3 = c5;
                    c4 = c6;
                    i3 = i4;
                    int i5 = i3 + 5;
                    int i6 = i3 + 6;
                    m110078g(path, f20, f21, fArr2[i5], fArr2[i6], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f ? z2 : z, fArr2[i3 + 4] != 0 ? z2 : z);
                    f16 = fArr2[i5];
                    f20 = f16;
                    f17 = fArr2[i6];
                    f21 = f17;
                } else if (c2 == 'C') {
                    z = z3;
                    z2 = z4;
                    c3 = c5;
                    c4 = c6;
                    i3 = i4;
                    int i7 = i3 + 2;
                    int i8 = i3 + 3;
                    int i9 = i3 + 4;
                    int i10 = i3 + 5;
                    path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                    float f24 = fArr2[i9];
                    float f25 = fArr2[i10];
                    float f26 = fArr2[i7];
                    float f27 = fArr2[i8];
                    f20 = f24;
                    f21 = f25;
                    f17 = f27;
                    f16 = f26;
                } else if (c2 != 'H') {
                    if (c2 != 'Q') {
                        z = z3;
                        if (c2 == 'V') {
                            z2 = z4;
                            c3 = c5;
                            c4 = c6;
                            i3 = i4;
                            path2.lineTo(f20, fArr2[i3]);
                            f3 = fArr2[i3];
                        } else if (c2 != 'a') {
                            if (c2 != 'c') {
                                z2 = z4;
                                if (c2 != 'h') {
                                    if (c2 != 'q') {
                                        c3 = c5;
                                        if (c2 != 'v') {
                                            if (c2 != 'L') {
                                                if (c2 != 'M') {
                                                    c4 = c6;
                                                    if (c2 == 'S') {
                                                        if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                            f20 = (f20 * 2.0f) - f16;
                                                            f21 = (f21 * 2.0f) - f17;
                                                        }
                                                        float f28 = f20;
                                                        float f29 = f21;
                                                        int i11 = i4 + 1;
                                                        int i12 = i4 + 2;
                                                        int i13 = i4 + 3;
                                                        path2.cubicTo(f28, f29, fArr2[i4], fArr2[i11], fArr2[i12], fArr2[i13]);
                                                        f = fArr2[i4];
                                                        f2 = fArr2[i11];
                                                        f20 = fArr2[i12];
                                                        f21 = fArr2[i13];
                                                        i3 = i4;
                                                    } else if (c2 == 'T') {
                                                        if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                            f20 = (f20 * 2.0f) - f16;
                                                            f21 = (f21 * 2.0f) - f17;
                                                        }
                                                        int i14 = i4 + 1;
                                                        path2.quadTo(f20, f21, fArr2[i4], fArr2[i14]);
                                                        float f30 = fArr2[i4];
                                                        f3 = fArr2[i14];
                                                        f16 = f20;
                                                        f17 = f21;
                                                        i3 = i4;
                                                        f20 = f30;
                                                    } else if (c2 == 'l') {
                                                        int i15 = i4 + 1;
                                                        path2.rLineTo(fArr2[i4], fArr2[i15]);
                                                        f20 += fArr2[i4];
                                                        f7 = fArr2[i15];
                                                    } else if (c2 == 'm') {
                                                        float f31 = fArr2[i4];
                                                        f20 += f31;
                                                        float f32 = fArr2[i4 + 1];
                                                        f21 += f32;
                                                        if (i4 > 0) {
                                                            path2.rLineTo(f31, f32);
                                                        } else {
                                                            path2.rMoveTo(f31, f32);
                                                            f22 = f20;
                                                        }
                                                    } else if (c2 == 's') {
                                                        if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                            f10 = f21 - f17;
                                                            f11 = f20 - f16;
                                                        } else {
                                                            f11 = 0.0f;
                                                            f10 = 0.0f;
                                                        }
                                                        int i16 = i4 + 1;
                                                        int i17 = i4 + 2;
                                                        int i18 = i4 + 3;
                                                        path2.rCubicTo(f11, f10, fArr2[i4], fArr2[i16], fArr2[i17], fArr2[i18]);
                                                        f4 = fArr2[i4] + f20;
                                                        f5 = fArr2[i16] + f21;
                                                        f20 += fArr2[i17];
                                                        f6 = fArr2[i18];
                                                    } else if (c2 == 't') {
                                                        if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                            f12 = f20 - f16;
                                                            f13 = f21 - f17;
                                                        } else {
                                                            f13 = 0.0f;
                                                            f12 = 0.0f;
                                                        }
                                                        int i19 = i4 + 1;
                                                        path2.rQuadTo(f12, f13, fArr2[i4], fArr2[i19]);
                                                        float f33 = f12 + f20;
                                                        float f34 = f13 + f21;
                                                        f20 += fArr2[i4];
                                                        f21 += fArr2[i19];
                                                        f17 = f34;
                                                        f16 = f33;
                                                    }
                                                } else {
                                                    c4 = c6;
                                                    f8 = fArr2[i4];
                                                    f9 = fArr2[i4 + 1];
                                                    if (i4 > 0) {
                                                        path2.lineTo(f8, f9);
                                                    } else {
                                                        path2.moveTo(f8, f9);
                                                        f20 = f8;
                                                        f22 = f20;
                                                        f21 = f9;
                                                    }
                                                }
                                                f23 = f21;
                                            } else {
                                                c4 = c6;
                                                int i20 = i4 + 1;
                                                path2.lineTo(fArr2[i4], fArr2[i20]);
                                                f8 = fArr2[i4];
                                                f9 = fArr2[i20];
                                            }
                                            f20 = f8;
                                            f21 = f9;
                                        } else {
                                            c4 = c6;
                                            path2.rLineTo(0.0f, fArr2[i4]);
                                            f7 = fArr2[i4];
                                        }
                                        f21 += f7;
                                    } else {
                                        c3 = c5;
                                        c4 = c6;
                                        int i21 = i4 + 1;
                                        int i22 = i4 + 2;
                                        int i23 = i4 + 3;
                                        path2.rQuadTo(fArr2[i4], fArr2[i21], fArr2[i22], fArr2[i23]);
                                        f4 = fArr2[i4] + f20;
                                        f5 = fArr2[i21] + f21;
                                        f20 += fArr2[i22];
                                        f6 = fArr2[i23];
                                    }
                                    f21 += f6;
                                    f16 = f4;
                                    f17 = f5;
                                } else {
                                    c3 = c5;
                                    c4 = c6;
                                    path2.rLineTo(fArr2[i4], 0.0f);
                                    f20 += fArr2[i4];
                                }
                            } else {
                                z2 = z4;
                                c3 = c5;
                                c4 = c6;
                                int i24 = i4 + 2;
                                int i25 = i4 + 3;
                                int i26 = i4 + 4;
                                int i27 = i4 + 5;
                                path2.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                float f35 = fArr2[i24] + f20;
                                float f36 = fArr2[i25] + f21;
                                f20 += fArr2[i26];
                                f21 += fArr2[i27];
                                f16 = f35;
                                f17 = f36;
                            }
                            i3 = i4;
                        } else {
                            z2 = z4;
                            c3 = c5;
                            c4 = c6;
                            int i28 = i4 + 5;
                            int i29 = i4 + 6;
                            i3 = i4;
                            float f37 = f20;
                            m110078g(path, f37, f21, fArr2[i28] + f20, fArr2[i29] + f21, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f ? z2 : z, fArr2[i4 + 4] != 0 ? z2 : z);
                            f20 = f37 + fArr2[i28];
                            f21 += fArr2[i29];
                            f16 = f20;
                            f17 = f21;
                        }
                        f21 = f3;
                    } else {
                        z = z3;
                        z2 = z4;
                        c3 = c5;
                        c4 = c6;
                        i3 = i4;
                        int i30 = i3 + 1;
                        int i31 = i3 + 2;
                        int i32 = i3 + 3;
                        path2.quadTo(fArr2[i3], fArr2[i30], fArr2[i31], fArr2[i32]);
                        f = fArr2[i3];
                        f2 = fArr2[i30];
                        f20 = fArr2[i31];
                        f21 = fArr2[i32];
                    }
                    f16 = f;
                    f17 = f2;
                } else {
                    z = z3;
                    z2 = z4;
                    c3 = c5;
                    c4 = c6;
                    i3 = i4;
                    path2.lineTo(fArr2[i3], f21);
                    f20 = fArr2[i3];
                }
                i4 = i3 + i2;
                path2 = path;
                c7 = c2;
                z3 = z;
                z4 = z2;
                c5 = c3;
                c6 = c4;
            }
            fArr[z3 ? 1 : 0] = f20;
            fArr[z4 ? 1 : 0] = f21;
            fArr[c5] = f16;
            fArr[c6] = f17;
            fArr[4] = f22;
            fArr[5] = f23;
        }

        /* JADX INFO: renamed from: f */
        public static void m110077f(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / ((double) iCeil);
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < iCeil) {
                double d24 = d23 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                int i2 = i;
                double d26 = d2 + (d3 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d23;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                dSin = dSin;
                d18 = d18;
                d21 = d25;
                d15 = d15;
                d23 = d24;
                d19 = d28;
                dCos = dCos;
                d10 = d3;
                d22 = d26;
                i = i2 + 1;
                iCeil = iCeil;
                d20 = d27;
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m110078g(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d3 * dCos) + (d4 * dSin)) / d5;
            double d7 = f6;
            double d8 = ((((double) (-f)) * dSin) + (d4 * dCos)) / d7;
            double d9 = f4;
            double d10 = ((((double) f3) * dCos) + (d9 * dSin)) / d5;
            double d11 = ((((double) (-f3)) * dSin) + (d9 * dCos)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d12 * d12) + (d13 * d13);
            if (d16 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
                m110078g(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d17);
            double d18 = d12 * dSqrt;
            double d19 = dSqrt * d13;
            if (z == z2) {
                d = d14 - d19;
                d2 = d15 + d18;
            } else {
                d = d14 + d19;
                d2 = d15 - d18;
            }
            double dAtan2 = Math.atan2(d8 - d2, d6 - d);
            double dAtan3 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
            if (z2 != (dAtan3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
                dAtan3 = dAtan3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d20 = d * d5;
            double d21 = d2 * d7;
            m110077f(path, (d20 * dCos) - (d21 * dSin), (d20 * dSin) + (d21 * dCos), d5, d7, d3, d4, radians, dAtan2, dAtan3);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        /* JADX INFO: renamed from: h */
        public static void m110079h(@NonNull C16274b[] c16274bArr, @NonNull Path path) {
            cj60.m110070i(c16274bArr, path);
        }

        public C16274b(char c, float[] fArr) {
            this.f82105a = c;
            this.f82106b = fArr;
        }
    }
}
