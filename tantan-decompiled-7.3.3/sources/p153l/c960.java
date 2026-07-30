package p153l;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class c960 {

    /* JADX INFO: renamed from: a */
    public static final c3f f80303a = new c3f();

    /* JADX INFO: renamed from: a */
    public static cf3 m108414a(oyd oydVar) throws NotFoundException {
        int[] iArrM169840j;
        if (oydVar == null || (iArrM169840j = oydVar.m169840j()) == null) {
            return null;
        }
        int iM108429p = m108429p(iArrM169840j);
        int i = 0;
        int i2 = 0;
        for (int i3 : iArrM169840j) {
            i2 += iM108429p - i3;
            if (i3 > 0) {
                break;
            }
        }
        wc5[] wc5VarArrM165321d = oydVar.m165321d();
        for (int i4 = 0; i2 > 0 && wc5VarArrM165321d[i4] == null; i4++) {
            i2--;
        }
        for (int length = iArrM169840j.length - 1; length >= 0; length--) {
            int i5 = iArrM169840j[length];
            i += iM108429p - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = wc5VarArrM165321d.length - 1; i > 0 && wc5VarArrM165321d[length2] == null; length2--) {
            i--;
        }
        return oydVar.m165318a().m109514a(i2, i, oydVar.m169841k());
    }

    /* JADX INFO: renamed from: b */
    public static void m108415b(myd mydVar, le2[][] le2VarArr) throws NotFoundException {
        le2 le2Var = le2VarArr[0][1];
        int[] iArrM153864a = le2Var.m153864a();
        int iM160782j = (mydVar.m160782j() * mydVar.m160784l()) - m108431r(mydVar.m160783k());
        if (iArrM153864a.length != 0) {
            if (iArrM153864a[0] != iM160782j) {
                le2Var.m153865b(iM160782j);
            }
        } else {
            if (iM160782j <= 0 || iM160782j > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            le2Var.m153865b(iM160782j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m108416c(d13 d13Var, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z == d13Var.m113480d(i6, i4)) {
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
                    if (z == d13Var.m113480d(i6, i4)) {
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
    public static boolean m108417d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* JADX INFO: renamed from: e */
    public static int m108418e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f80303a.m107784a(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* JADX INFO: renamed from: f */
    public static le2[][] m108419f(myd mydVar) {
        int iM205785c;
        le2[][] le2VarArr = (le2[][]) Array.newInstance((Class<?>) le2.class, mydVar.m160784l(), mydVar.m160782j() + 2);
        for (le2[] le2VarArr2 : le2VarArr) {
            int i = 0;
            while (true) {
                if (i < le2VarArr2.length) {
                    le2VarArr2[i] = new le2();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (nyd nydVar : mydVar.m160787o()) {
            if (nydVar != null) {
                for (wc5 wc5Var : nydVar.m165321d()) {
                    if (wc5Var != null && (iM205785c = wc5Var.m205785c()) >= 0 && iM205785c < le2VarArr.length) {
                        le2VarArr[iM205785c][i2].m153865b(wc5Var.m205787e());
                    }
                }
            }
            i2++;
        }
        return le2VarArr;
    }

    /* JADX INFO: renamed from: g */
    public static mid m108420g(myd mydVar) throws NotFoundException, ChecksumException, FormatException {
        le2[][] le2VarArrM108419f = m108419f(mydVar);
        m108415b(mydVar, le2VarArrM108419f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[mydVar.m160784l() * mydVar.m160782j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < mydVar.m160784l(); i++) {
            int i2 = 0;
            while (i2 < mydVar.m160782j()) {
                int i3 = i2 + 1;
                int[] iArrM153864a = le2VarArrM108419f[i][i3].m153864a();
                int iM160782j = (mydVar.m160782j() * i) + i2;
                if (iArrM153864a.length == 0) {
                    arrayList.add(Integer.valueOf(iM160782j));
                } else if (iArrM153864a.length == 1) {
                    iArr[iM160782j] = iArrM153864a[0];
                } else {
                    arrayList3.add(Integer.valueOf(iM160782j));
                    arrayList2.add(iArrM153864a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m108421h(mydVar.m160783k(), iArr, w860.m205400b(arrayList), w860.m205400b(arrayList3), iArr2);
    }

    /* JADX INFO: renamed from: h */
    public static mid m108421h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
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
                return m108423j(iArr, i, iArr2);
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
    public static mid m108422i(d13 d13Var, s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4, int i, int i2) throws NotFoundException, ChecksumException, FormatException {
        cf3 cf3Var;
        nyd oydVar;
        nyd nydVar;
        int i3;
        int i4;
        wc5 wc5VarM108424k;
        oyd oydVar2 = null;
        boolean z = false;
        cf3 cf3Var2 = new cf3(d13Var, s5d0Var, s5d0Var2, s5d0Var3, s5d0Var4);
        oyd oydVarM108432s = null;
        myd mydVarM108435v = null;
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                cf3Var = cf3Var2;
                break;
            }
            oyd oydVarM108432s2 = s5d0Var != null ? m108432s(d13Var, cf3Var2, s5d0Var, true, i, i2) : oydVar2;
            if (s5d0Var3 != null) {
                oydVarM108432s = m108432s(d13Var, cf3Var2, s5d0Var3, false, i, i2);
            }
            cf3Var = cf3Var2;
            mydVarM108435v = m108435v(oydVarM108432s2, oydVarM108432s);
            if (mydVarM108435v == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i5 != 0 || mydVarM108435v.m160785m() == null || (mydVarM108435v.m160785m().m109520g() >= cf3Var.m109520g() && mydVarM108435v.m160785m().m109518e() <= cf3Var.m109518e())) {
                mydVarM108435v.m160788p(cf3Var);
                oydVar2 = oydVarM108432s2;
                break;
            }
            cf3Var2 = mydVarM108435v.m160785m();
            i5++;
            oydVar2 = oydVarM108432s2;
        }
        myd mydVar = mydVarM108435v;
        int iM160782j = mydVar.m160782j() + 1;
        mydVar.m160789q(0, oydVar2);
        mydVar.m160789q(iM160782j, oydVarM108432s);
        boolean z2 = oydVar2 != null;
        int i6 = i;
        int i7 = i2;
        int i8 = 1;
        while (i8 <= iM160782j) {
            int i9 = z2 ? i8 : iM160782j - i8;
            if (mydVar.m160786n(i9) == null) {
                if (i9 == 0 || i9 == iM160782j) {
                    oydVar = new oyd(cf3Var, i9 == 0 ? true : z);
                } else {
                    oydVar = new nyd(cf3Var);
                }
                mydVar.m160789q(i9, oydVar);
                int i10 = -1;
                int iMin = i6;
                int iMax = i7;
                int iM109520g = cf3Var.m109520g();
                int i11 = -1;
                while (iM109520g <= cf3Var.m109518e()) {
                    int iM108433t = m108433t(mydVar, i9, iM109520g, z2);
                    if (iM108433t >= 0 && iM108433t <= cf3Var.m109517d()) {
                        nydVar = oydVar;
                        i3 = i10;
                        i4 = iM108433t;
                        wc5VarM108424k = m108424k(d13Var, cf3Var.m109519f(), cf3Var.m109517d(), z2, i4, iM109520g, iMin, iMax);
                        if (wc5VarM108424k != null) {
                            nydVar.m165323f(iM109520g, wc5VarM108424k);
                            iMin = Math.min(iMin, wc5VarM108424k.m205788f());
                            iMax = Math.max(iMax, wc5VarM108424k.m205788f());
                            i11 = i4;
                        }
                    } else if (i11 != i10) {
                        iM108433t = i11;
                        nydVar = oydVar;
                        i3 = i10;
                        i4 = iM108433t;
                        wc5VarM108424k = m108424k(d13Var, cf3Var.m109519f(), cf3Var.m109517d(), z2, i4, iM109520g, iMin, iMax);
                        if (wc5VarM108424k != null) {
                            nydVar.m165323f(iM109520g, wc5VarM108424k);
                            iMin = Math.min(iMin, wc5VarM108424k.m205788f());
                            iMax = Math.max(iMax, wc5VarM108424k.m205788f());
                            i11 = i4;
                        }
                    } else {
                        nydVar = oydVar;
                        i3 = i10;
                    }
                    iM109520g++;
                    oydVar = nydVar;
                    i10 = i3;
                }
                i6 = iMin;
                i7 = iMax;
            }
            i8++;
            z = false;
        }
        return m108420g(mydVar);
    }

    /* JADX INFO: renamed from: j */
    public static mid m108423j(int[] iArr, int i, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i2 = 1 << (i + 1);
        int iM108418e = m108418e(iArr, iArr2, i2);
        m108436w(iArr, i2);
        mid midVarM17412b = DecodedBitStreamParser.m17412b(iArr, String.valueOf(i));
        midVarM17412b.m158497k(Integer.valueOf(iM108418e));
        midVarM17412b.m158496j(Integer.valueOf(iArr2.length));
        return midVarM17412b;
    }

    /* JADX INFO: renamed from: k */
    public static wc5 m108424k(d13 d13Var, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int iM200294d;
        int iM205399a;
        int iM108416c = m108416c(d13Var, i, i2, z, i3, i4);
        int[] iArrM108430q = m108430q(d13Var, i, i2, z, iM108416c, i4);
        if (iArrM108430q == null) {
            return null;
        }
        int iM140046d = ihx.m140046d(iArrM108430q);
        if (z) {
            i7 = iM108416c + iM140046d;
        } else {
            for (int i8 = 0; i8 < iArrM108430q.length / 2; i8++) {
                int i9 = iArrM108430q[i8];
                iArrM108430q[i8] = iArrM108430q[(iArrM108430q.length - 1) - i8];
                iArrM108430q[(iArrM108430q.length - 1) - i8] = i9;
            }
            iM108416c -= iM140046d;
            i7 = iM108416c;
        }
        if (m108417d(iM140046d, i5, i6) && (iM205399a = w860.m205399a((iM200294d = v860.m200294d(iArrM108430q)))) != -1) {
            return new wc5(iM108416c, i7, m108427n(iM200294d), iM205399a);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static je2 m108425l(oyd oydVar, oyd oydVar2) {
        je2 je2VarM169839i;
        je2 je2VarM169839i2;
        if (oydVar == null || (je2VarM169839i = oydVar.m169839i()) == null) {
            if (oydVar2 == null) {
                return null;
            }
            return oydVar2.m169839i();
        }
        if (oydVar2 == null || (je2VarM169839i2 = oydVar2.m169839i()) == null || je2VarM169839i.m144509a() == je2VarM169839i2.m144509a() || je2VarM169839i.m144510b() == je2VarM169839i2.m144510b() || je2VarM169839i.m144511c() == je2VarM169839i2.m144511c()) {
            return je2VarM169839i;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m108426m(int i) {
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
    public static int m108427n(int i) {
        return m108428o(m108426m(i));
    }

    /* JADX INFO: renamed from: o */
    public static int m108428o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* JADX INFO: renamed from: p */
    public static int m108429p(int[] iArr) {
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
    public static int[] m108430q(d13 d13Var, int i, int i2, boolean z, int i3, int i4) {
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
                if (d13Var.m113480d(i3, i4) == z2) {
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
                if (d13Var.m113480d(i3, i4) == z2) {
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
    public static int m108431r(int i) {
        return 2 << i;
    }

    /* JADX INFO: renamed from: s */
    public static oyd m108432s(d13 d13Var, cf3 cf3Var, s5d0 s5d0Var, boolean z, int i, int i2) {
        oyd oydVar = new oyd(cf3Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int iM184657c = (int) s5d0Var.m184657c();
            for (int iM184658d = (int) s5d0Var.m184658d(); iM184658d <= cf3Var.m109518e() && iM184658d >= cf3Var.m109520g(); iM184658d += i4) {
                wc5 wc5VarM108424k = m108424k(d13Var, 0, d13Var.m113486m(), z, iM184657c, iM184658d, i, i2);
                if (wc5VarM108424k != null) {
                    oydVar.m165323f(iM184658d, wc5VarM108424k);
                    iM184657c = z ? wc5VarM108424k.m205786d() : wc5VarM108424k.m205784b();
                }
            }
            i3++;
        }
        return oydVar;
    }

    /* JADX INFO: renamed from: t */
    public static int m108433t(myd mydVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        wc5 wc5VarM165319b = m108434u(mydVar, i4) ? mydVar.m160786n(i4).m165319b(i2) : null;
        if (wc5VarM165319b != null) {
            return z ? wc5VarM165319b.m205784b() : wc5VarM165319b.m205786d();
        }
        wc5 wc5VarM165320c = mydVar.m160786n(i).m165320c(i2);
        if (wc5VarM165320c != null) {
            return z ? wc5VarM165320c.m205786d() : wc5VarM165320c.m205784b();
        }
        if (m108434u(mydVar, i4)) {
            wc5VarM165320c = mydVar.m160786n(i4).m165320c(i2);
        }
        if (wc5VarM165320c != null) {
            return z ? wc5VarM165320c.m205784b() : wc5VarM165320c.m205786d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!m108434u(mydVar, i)) {
                cf3 cf3VarM160785m = mydVar.m160785m();
                return z ? cf3VarM160785m.m109519f() : cf3VarM160785m.m109517d();
            }
            for (wc5 wc5Var : mydVar.m160786n(i).m165321d()) {
                if (wc5Var != null) {
                    return (z ? wc5Var.m205784b() : wc5Var.m205786d()) + (i3 * i5 * (wc5Var.m205784b() - wc5Var.m205786d()));
                }
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m108434u(myd mydVar, int i) {
        return i >= 0 && i <= mydVar.m160782j() + 1;
    }

    /* JADX INFO: renamed from: v */
    public static myd m108435v(oyd oydVar, oyd oydVar2) throws NotFoundException {
        je2 je2VarM108425l;
        if ((oydVar == null && oydVar2 == null) || (je2VarM108425l = m108425l(oydVar, oydVar2)) == null) {
            return null;
        }
        return new myd(je2VarM108425l, cf3.m109513j(m108414a(oydVar), m108414a(oydVar2)));
    }

    /* JADX INFO: renamed from: w */
    public static void m108436w(int[] iArr, int i) throws FormatException {
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
