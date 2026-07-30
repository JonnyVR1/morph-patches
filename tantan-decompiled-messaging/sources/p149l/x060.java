package p149l;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class x060 {

    /* JADX INFO: renamed from: a */
    public static final x1f f188933a = new x1f();

    /* JADX INFO: renamed from: a */
    public static ne3 m206582a(axd axdVar) throws NotFoundException {
        int[] iArrM99401j;
        if (axdVar == null || (iArrM99401j = axdVar.m99401j()) == null) {
            return null;
        }
        int iM206597p = m206597p(iArrM99401j);
        int i = 0;
        int i2 = 0;
        for (int i3 : iArrM99401j) {
            i2 += iM206597p - i3;
            if (i3 > 0) {
                break;
            }
        }
        wb5[] wb5VarArrM220585d = axdVar.m220585d();
        for (int i4 = 0; i2 > 0 && wb5VarArrM220585d[i4] == null; i4++) {
            i2--;
        }
        for (int length = iArrM99401j.length - 1; length >= 0; length--) {
            int i5 = iArrM99401j[length];
            i += iM206597p - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = wb5VarArrM220585d.length - 1; i > 0 && wb5VarArrM220585d[length2] == null; length2--) {
            i--;
        }
        return axdVar.m220582a().m159091a(i2, i, axdVar.m99402k());
    }

    /* JADX INFO: renamed from: b */
    public static void m206583b(ywd ywdVar, ee2[][] ee2VarArr) throws NotFoundException {
        ee2 ee2Var = ee2VarArr[0][1];
        int[] iArrM115842a = ee2Var.m115842a();
        int iM216357j = (ywdVar.m216357j() * ywdVar.m216359l()) - m206599r(ywdVar.m216358k());
        if (iArrM115842a.length != 0) {
            if (iArrM115842a[0] != iM216357j) {
                ee2Var.m115843b(iM216357j);
            }
        } else {
            if (iM216357j <= 0 || iM216357j > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            ee2Var.m115843b(iM216357j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m206584c(o03 o03Var, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z == o03Var.m162110d(i6, i4)) {
                        break;
                        break;
                    }
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                } else {
                    if (i6 < i) {
                        break;
                    }
                    if (z == o03Var.m162110d(i6, i4)) {
                        break;
                    }
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m206585d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* JADX INFO: renamed from: e */
    public static int m206586e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f188933a.m206705a(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* JADX INFO: renamed from: f */
    public static ee2[][] m206587f(ywd ywdVar) {
        int iM202515c;
        ee2[][] ee2VarArr = (ee2[][]) Array.newInstance((Class<?>) ee2.class, ywdVar.m216359l(), ywdVar.m216357j() + 2);
        for (ee2[] ee2VarArr2 : ee2VarArr) {
            int i = 0;
            while (true) {
                if (i < ee2VarArr2.length) {
                    ee2VarArr2[i] = new ee2();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (zwd zwdVar : ywdVar.m216362o()) {
            if (zwdVar != null) {
                for (wb5 wb5Var : zwdVar.m220585d()) {
                    if (wb5Var != null && (iM202515c = wb5Var.m202515c()) >= 0 && iM202515c < ee2VarArr.length) {
                        ee2VarArr[iM202515c][i2].m115843b(wb5Var.m202517e());
                    }
                }
            }
            i2++;
        }
        return ee2VarArr;
    }

    /* JADX INFO: renamed from: g */
    public static ghd m206588g(ywd ywdVar) throws NotFoundException, ChecksumException, FormatException {
        ee2[][] ee2VarArrM206587f = m206587f(ywdVar);
        m206583b(ywdVar, ee2VarArrM206587f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[ywdVar.m216359l() * ywdVar.m216357j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < ywdVar.m216359l(); i++) {
            int i2 = 0;
            while (i2 < ywdVar.m216357j()) {
                int i3 = i2 + 1;
                int[] iArrM115842a = ee2VarArrM206587f[i][i3].m115842a();
                int iM216357j = (ywdVar.m216357j() * i) + i2;
                if (iArrM115842a.length == 0) {
                    arrayList.add(Integer.valueOf(iM216357j));
                } else if (iArrM115842a.length == 1) {
                    iArr[iM216357j] = iArrM115842a[0];
                } else {
                    arrayList3.add(Integer.valueOf(iM216357j));
                    arrayList2.add(iArrM115842a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m206589h(ywdVar.m216358k(), iArr, r060.m177332b(arrayList), r060.m177332b(arrayList3), iArr2);
    }

    /* JADX INFO: renamed from: h */
    public static ghd m206589h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
            }
            try {
                return m206591j(iArr, i, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr5[i5];
                    if (i6 < iArr4[i5].length - 1) {
                        iArr5[i5] = i6 + 1;
                        break;
                    }
                    iArr5[i5] = 0;
                    if (i5 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                i2 = i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x010a A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static ghd m206590i(o03 o03Var, pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4, int i, int i2) throws NotFoundException, ChecksumException, FormatException {
        ne3 ne3Var;
        zwd axdVar;
        zwd zwdVar;
        int i3;
        int i4;
        wb5 wb5VarM206592k;
        axd axdVar2 = null;
        boolean z = false;
        ne3 ne3Var2 = new ne3(o03Var, pxc0Var, pxc0Var2, pxc0Var3, pxc0Var4);
        axd axdVarM206600s = null;
        ywd ywdVarM206603v = null;
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                ne3Var = ne3Var2;
                break;
            }
            axd axdVarM206600s2 = pxc0Var != null ? m206600s(o03Var, ne3Var2, pxc0Var, true, i, i2) : axdVar2;
            if (pxc0Var3 != null) {
                axdVarM206600s = m206600s(o03Var, ne3Var2, pxc0Var3, false, i, i2);
            }
            ne3Var = ne3Var2;
            ywdVarM206603v = m206603v(axdVarM206600s2, axdVarM206600s);
            if (ywdVarM206603v == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i5 != 0 || ywdVarM206603v.m216360m() == null || (ywdVarM206603v.m216360m().m159097g() >= ne3Var.m159097g() && ywdVarM206603v.m216360m().m159095e() <= ne3Var.m159095e())) {
                ywdVarM206603v.m216363p(ne3Var);
                axdVar2 = axdVarM206600s2;
                break;
            }
            ne3Var2 = ywdVarM206603v.m216360m();
            i5++;
            axdVar2 = axdVarM206600s2;
        }
        ywd ywdVar = ywdVarM206603v;
        int iM216357j = ywdVar.m216357j() + 1;
        ywdVar.m216364q(0, axdVar2);
        ywdVar.m216364q(iM216357j, axdVarM206600s);
        boolean z2 = axdVar2 != null;
        int i6 = i;
        int i7 = i2;
        int i8 = 1;
        while (i8 <= iM216357j) {
            int i9 = z2 ? i8 : iM216357j - i8;
            if (ywdVar.m216361n(i9) == null) {
                if (i9 == 0 || i9 == iM216357j) {
                    axdVar = new axd(ne3Var, i9 == 0 ? true : z);
                } else {
                    axdVar = new zwd(ne3Var);
                }
                ywdVar.m216364q(i9, axdVar);
                int i10 = -1;
                int iMin = i6;
                int iMax = i7;
                int iM159097g = ne3Var.m159097g();
                int i11 = -1;
                while (iM159097g <= ne3Var.m159095e()) {
                    int iM206601t = m206601t(ywdVar, i9, iM159097g, z2);
                    if (iM206601t >= 0 && iM206601t <= ne3Var.m159094d()) {
                        zwdVar = axdVar;
                        i3 = i10;
                        i4 = iM206601t;
                        wb5VarM206592k = m206592k(o03Var, ne3Var.m159096f(), ne3Var.m159094d(), z2, i4, iM159097g, iMin, iMax);
                        if (wb5VarM206592k != null) {
                            zwdVar.m220587f(iM159097g, wb5VarM206592k);
                            iMin = Math.min(iMin, wb5VarM206592k.m202518f());
                            iMax = Math.max(iMax, wb5VarM206592k.m202518f());
                            i11 = i4;
                        }
                    } else if (i11 != i10) {
                        iM206601t = i11;
                        zwdVar = axdVar;
                        i3 = i10;
                        i4 = iM206601t;
                        wb5VarM206592k = m206592k(o03Var, ne3Var.m159096f(), ne3Var.m159094d(), z2, i4, iM159097g, iMin, iMax);
                        if (wb5VarM206592k != null) {
                            zwdVar.m220587f(iM159097g, wb5VarM206592k);
                            iMin = Math.min(iMin, wb5VarM206592k.m202518f());
                            iMax = Math.max(iMax, wb5VarM206592k.m202518f());
                            i11 = i4;
                        }
                    } else {
                        zwdVar = axdVar;
                        i3 = i10;
                    }
                    iM159097g++;
                    axdVar = zwdVar;
                    i10 = i3;
                }
                i6 = iMin;
                i7 = iMax;
            }
            i8++;
            z = false;
        }
        return m206588g(ywdVar);
    }

    /* JADX INFO: renamed from: j */
    public static ghd m206591j(int[] iArr, int i, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i2 = 1 << (i + 1);
        int iM206586e = m206586e(iArr, iArr2, i2);
        m206604w(iArr, i2);
        ghd ghdVarM17357b = DecodedBitStreamParser.m17357b(iArr, String.valueOf(i));
        ghdVarM17357b.m126174k(Integer.valueOf(iM206586e));
        ghdVarM17357b.m126173j(Integer.valueOf(iArr2.length));
        return ghdVarM17357b;
    }

    /* JADX INFO: renamed from: k */
    public static wb5 m206592k(o03 o03Var, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int iM172293d;
        int iM177331a;
        int iM206584c = m206584c(o03Var, i, i2, z, i3, i4);
        int[] iArrM206598q = m206598q(o03Var, i, i2, z, iM206584c, i4);
        if (iArrM206598q == null) {
            return null;
        }
        int iM141165d = jex.m141165d(iArrM206598q);
        if (z) {
            i7 = iM206584c + iM141165d;
        } else {
            for (int i8 = 0; i8 < iArrM206598q.length / 2; i8++) {
                int i9 = iArrM206598q[i8];
                iArrM206598q[i8] = iArrM206598q[(iArrM206598q.length - 1) - i8];
                iArrM206598q[(iArrM206598q.length - 1) - i8] = i9;
            }
            iM206584c -= iM141165d;
            i7 = iM206584c;
        }
        if (m206585d(iM141165d, i5, i6) && (iM177331a = r060.m177331a((iM172293d = q060.m172293d(iArrM206598q)))) != -1) {
            return new wb5(iM206584c, i7, m206595n(iM172293d), iM177331a);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static ce2 m206593l(axd axdVar, axd axdVar2) {
        ce2 ce2VarM99400i;
        ce2 ce2VarM99400i2;
        if (axdVar == null || (ce2VarM99400i = axdVar.m99400i()) == null) {
            if (axdVar2 == null) {
                return null;
            }
            return axdVar2.m99400i();
        }
        if (axdVar2 == null || (ce2VarM99400i2 = axdVar2.m99400i()) == null || ce2VarM99400i.m106304a() == ce2VarM99400i2.m106304a() || ce2VarM99400i.m106305b() == ce2VarM99400i2.m106305b() || ce2VarM99400i.m106306c() == ce2VarM99400i2.m106306c()) {
            return ce2VarM99400i;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m206594m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m206595n(int i) {
        return m206596o(m206594m(i));
    }

    /* JADX INFO: renamed from: o */
    public static int m206596o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* JADX INFO: renamed from: p */
    public static int m206597p(int[] iArr) {
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:28:0x0027 A[EDGE_INSN: B:28:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:31:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001b A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public static int[] m206598q(o03 o03Var, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
                if (i6 < 8) {
                    break;
                    break;
                }
                if (o03Var.m162110d(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            } else {
                if (i3 >= i2) {
                    break;
                }
                if (i6 < 8) {
                    break;
                }
                if (o03Var.m162110d(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (i3 != i || i6 != 7) {
                return null;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: r */
    public static int m206599r(int i) {
        return 2 << i;
    }

    /* JADX INFO: renamed from: s */
    public static axd m206600s(o03 o03Var, ne3 ne3Var, pxc0 pxc0Var, boolean z, int i, int i2) {
        axd axdVar = new axd(ne3Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int iM171831c = (int) pxc0Var.m171831c();
            for (int iM171832d = (int) pxc0Var.m171832d(); iM171832d <= ne3Var.m159095e() && iM171832d >= ne3Var.m159097g(); iM171832d += i4) {
                wb5 wb5VarM206592k = m206592k(o03Var, 0, o03Var.m162116m(), z, iM171831c, iM171832d, i, i2);
                if (wb5VarM206592k != null) {
                    axdVar.m220587f(iM171832d, wb5VarM206592k);
                    iM171831c = z ? wb5VarM206592k.m202516d() : wb5VarM206592k.m202514b();
                }
            }
            i3++;
        }
        return axdVar;
    }

    /* JADX INFO: renamed from: t */
    public static int m206601t(ywd ywdVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        wb5 wb5VarM220583b = m206602u(ywdVar, i4) ? ywdVar.m216361n(i4).m220583b(i2) : null;
        if (wb5VarM220583b != null) {
            return z ? wb5VarM220583b.m202514b() : wb5VarM220583b.m202516d();
        }
        wb5 wb5VarM220584c = ywdVar.m216361n(i).m220584c(i2);
        if (wb5VarM220584c != null) {
            return z ? wb5VarM220584c.m202516d() : wb5VarM220584c.m202514b();
        }
        if (m206602u(ywdVar, i4)) {
            wb5VarM220584c = ywdVar.m216361n(i4).m220584c(i2);
        }
        if (wb5VarM220584c != null) {
            return z ? wb5VarM220584c.m202514b() : wb5VarM220584c.m202516d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!m206602u(ywdVar, i)) {
                ne3 ne3VarM216360m = ywdVar.m216360m();
                return z ? ne3VarM216360m.m159096f() : ne3VarM216360m.m159094d();
            }
            for (wb5 wb5Var : ywdVar.m216361n(i).m220585d()) {
                if (wb5Var != null) {
                    return (z ? wb5Var.m202514b() : wb5Var.m202516d()) + (i3 * i5 * (wb5Var.m202514b() - wb5Var.m202516d()));
                }
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m206602u(ywd ywdVar, int i) {
        return i >= 0 && i <= ywdVar.m216357j() + 1;
    }

    /* JADX INFO: renamed from: v */
    public static ywd m206603v(axd axdVar, axd axdVar2) throws NotFoundException {
        ce2 ce2VarM206593l;
        if ((axdVar == null && axdVar2 == null) || (ce2VarM206593l = m206593l(axdVar, axdVar2)) == null) {
            return null;
        }
        return new ywd(ce2VarM206593l, ne3.m159090j(m206582a(axdVar), m206582a(axdVar2)));
    }

    /* JADX INFO: renamed from: w */
    public static void m206604w(int[] iArr, int i) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i2 == 0) {
            if (i >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i;
        }
    }
}
