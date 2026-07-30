package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.d13;
import p153l.ioi;
import p153l.koi;
import p153l.s5d0;
import p153l.t5d0;

/* JADX INFO: loaded from: classes7.dex */
public class FinderPatternFinder {

    /* JADX INFO: renamed from: a */
    public final d13 f11717a;

    /* JADX INFO: renamed from: c */
    public boolean f11719c;

    /* JADX INFO: renamed from: e */
    public final t5d0 f11721e;

    /* JADX INFO: renamed from: b */
    public final List<ioi> f11718b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final int[] f11720d = new int[5];

    public static final class CenterComparator implements Serializable, Comparator<ioi> {
        private final float average;

        private CenterComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(ioi ioiVar, ioi ioiVar2) {
            int iCompare = Integer.compare(ioiVar2.m141311h(), ioiVar.m141311h());
            return iCompare == 0 ? Float.compare(Math.abs(ioiVar.m141312i() - this.average), Math.abs(ioiVar2.m141312i() - this.average)) : iCompare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<ioi> {
        private final float average;

        private FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(ioi ioiVar, ioi ioiVar2) {
            return Float.compare(Math.abs(ioiVar2.m141312i() - this.average), Math.abs(ioiVar.m141312i() - this.average));
        }
    }

    public FinderPatternFinder(d13 d13Var, t5d0 t5d0Var) {
        this.f11717a = d13Var;
        this.f11721e = t5d0Var;
    }

    /* JADX INFO: renamed from: a */
    public static float m17425a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17426h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17427i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m17428b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17429c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrM17434j = m17434j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f11717a.m113480d(i2 - i6, i - i6)) {
            iArrM17434j[2] = iArrM17434j[2] + 1;
            i6++;
        }
        if (iArrM17434j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f11717a.m113480d(i2 - i6, i - i6)) {
            iArrM17434j[1] = iArrM17434j[1] + 1;
            i6++;
        }
        if (iArrM17434j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f11717a.m113480d(i2 - i6, i - i6)) {
            iArrM17434j[0] = iArrM17434j[0] + 1;
            i6++;
        }
        if (iArrM17434j[0] == 0) {
            return false;
        }
        int iM113483j = this.f11717a.m113483j();
        int iM113486m = this.f11717a.m113486m();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= iM113483j || (i5 = i2 + i7) >= iM113486m || !this.f11717a.m113480d(i5, i8)) {
                break;
            }
            iArrM17434j[2] = iArrM17434j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= iM113483j || (i4 = i2 + i7) >= iM113486m || this.f11717a.m113480d(i4, i9)) {
                break;
            }
            iArrM17434j[3] = iArrM17434j[3] + 1;
            i7++;
        }
        if (iArrM17434j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= iM113483j || (i3 = i2 + i7) >= iM113486m || !this.f11717a.m113480d(i3, i10)) {
                break;
            }
            iArrM17434j[4] = iArrM17434j[4] + 1;
            i7++;
        }
        if (iArrM17434j[4] == 0) {
            return false;
        }
        return m17427i(iArrM17434j);
    }

    /* JADX INFO: renamed from: d */
    public final float m17430d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        d13 d13Var = this.f11717a;
        int iM113486m = d13Var.m113486m();
        int[] iArrM17434j = m17434j();
        int i8 = i;
        while (i8 >= 0 && d13Var.m113480d(i8, i2)) {
            iArrM17434j[2] = iArrM17434j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !d13Var.m113480d(i8, i2)) {
            int i9 = iArrM17434j[1];
            if (i9 > i3) {
                break;
            }
            iArrM17434j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrM17434j[1] <= i3) {
            while (i8 >= 0 && d13Var.m113480d(i8, i2) && (i7 = iArrM17434j[0]) <= i3) {
                iArrM17434j[0] = i7 + 1;
                i8--;
            }
            if (iArrM17434j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iM113486m && d13Var.m113480d(i10, i2)) {
                iArrM17434j[2] = iArrM17434j[2] + 1;
                i10++;
            }
            if (i10 == iM113486m) {
                return Float.NaN;
            }
            while (i10 < iM113486m && !d13Var.m113480d(i10, i2) && (i6 = iArrM17434j[3]) < i3) {
                iArrM17434j[3] = i6 + 1;
                i10++;
            }
            if (i10 != iM113486m && iArrM17434j[3] < i3) {
                while (i10 < iM113486m && d13Var.m113480d(i10, i2) && (i5 = iArrM17434j[4]) < i3) {
                    iArrM17434j[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrM17434j[4];
                if (i11 < i3 && Math.abs(((((iArrM17434j[0] + iArrM17434j[1]) + iArrM17434j[2]) + iArrM17434j[3]) + i11) - i4) * 5 < i4 && m17426h(iArrM17434j)) {
                    return m17425a(iArrM17434j, i10);
                }
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public final float m17431e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        d13 d13Var = this.f11717a;
        int iM113483j = d13Var.m113483j();
        int[] iArrM17434j = m17434j();
        int i8 = i;
        while (i8 >= 0 && d13Var.m113480d(i2, i8)) {
            iArrM17434j[2] = iArrM17434j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !d13Var.m113480d(i2, i8)) {
            int i9 = iArrM17434j[1];
            if (i9 > i3) {
                break;
            }
            iArrM17434j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrM17434j[1] <= i3) {
            while (i8 >= 0 && d13Var.m113480d(i2, i8) && (i7 = iArrM17434j[0]) <= i3) {
                iArrM17434j[0] = i7 + 1;
                i8--;
            }
            if (iArrM17434j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iM113483j && d13Var.m113480d(i2, i10)) {
                iArrM17434j[2] = iArrM17434j[2] + 1;
                i10++;
            }
            if (i10 == iM113483j) {
                return Float.NaN;
            }
            while (i10 < iM113483j && !d13Var.m113480d(i2, i10) && (i6 = iArrM17434j[3]) < i3) {
                iArrM17434j[3] = i6 + 1;
                i10++;
            }
            if (i10 != iM113483j && iArrM17434j[3] < i3) {
                while (i10 < iM113483j && d13Var.m113480d(i2, i10) && (i5 = iArrM17434j[4]) < i3) {
                    iArrM17434j[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrM17434j[4];
                if (i11 < i3 && Math.abs(((((iArrM17434j[0] + iArrM17434j[1]) + iArrM17434j[2]) + iArrM17434j[3]) + i11) - i4) * 5 < i4 * 2 && m17426h(iArrM17434j)) {
                    return m17425a(iArrM17434j, i10);
                }
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: f */
    public final koi m17432f(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int iM113483j = this.f11717a.m113483j();
        int iM113486m = this.f11717a.m113486m();
        int i = (iM113483j * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean zM17436l = false;
        while (i2 < iM113483j && !zM17436l) {
            m17428b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < iM113486m) {
                if (this.f11717a.m113480d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (m17426h(iArr) && m17435k(iArr, i2, i3)) {
                    if (this.f11719c) {
                        zM17436l = m17436l();
                    } else {
                        int iM17433g = m17433g();
                        int i5 = iArr[2];
                        if (iM17433g > i5) {
                            i2 += (iM17433g - i5) - 2;
                            i3 = iM113486m - 1;
                        }
                    }
                    m17428b(iArr);
                    i = 2;
                    i4 = 0;
                } else {
                    m17438n(iArr);
                    i4 = 3;
                }
                i3++;
            }
            if (m17426h(iArr) && m17435k(iArr, i2, iM113486m)) {
                i = iArr[0];
                if (this.f11719c) {
                    zM17436l = m17436l();
                }
            }
            i2 += i;
        }
        ioi[] ioiVarArrM17437m = m17437m();
        s5d0.m184656e(ioiVarArrM17437m);
        return new koi(ioiVarArrM17437m);
    }

    /* JADX INFO: renamed from: g */
    public final int m17433g() {
        if (this.f11718b.size() <= 1) {
            return 0;
        }
        ioi ioiVar = null;
        for (ioi ioiVar2 : this.f11718b) {
            if (ioiVar2.m141311h() >= 2) {
                if (ioiVar != null) {
                    this.f11719c = true;
                    return ((int) (Math.abs(ioiVar.m184657c() - ioiVar2.m184657c()) - Math.abs(ioiVar.m184658d() - ioiVar2.m184658d()))) / 2;
                }
                ioiVar = ioiVar2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m17434j() {
        m17428b(this.f11720d);
        return this.f11720d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17435k(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iM17425a = (int) m17425a(iArr, i2);
        float fM17431e = m17431e(i, iM17425a, iArr[2], i3);
        if (!Float.isNaN(fM17431e)) {
            int i4 = (int) fM17431e;
            float fM17430d = m17430d(iM17425a, i4, iArr[2], i3);
            if (!Float.isNaN(fM17430d) && m17429c(i4, (int) fM17430d)) {
                float f = i3 / 7.0f;
                for (int i5 = 0; i5 < this.f11718b.size(); i5++) {
                    ioi ioiVar = this.f11718b.get(i5);
                    if (ioiVar.m141309f(f, fM17431e, fM17430d)) {
                        this.f11718b.set(i5, ioiVar.m141310g(fM17431e, fM17430d, f));
                        return true;
                    }
                }
                ioi ioiVar2 = new ioi(fM17430d, fM17431e, f);
                this.f11718b.add(ioiVar2);
                t5d0 t5d0Var = this.f11721e;
                if (t5d0Var != null) {
                    t5d0Var.mo189379a(ioiVar2);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17436l() {
        int size = this.f11718b.size();
        float fAbs = 0.0f;
        int i = 0;
        float fM141312i = 0.0f;
        for (ioi ioiVar : this.f11718b) {
            if (ioiVar.m141311h() >= 2) {
                i++;
                fM141312i += ioiVar.m141312i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f = fM141312i / size;
        Iterator<ioi> it = this.f11718b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().m141312i() - f);
        }
        return fAbs <= fM141312i * 0.05f;
    }

    /* JADX INFO: renamed from: m */
    public final ioi[] m17437m() throws NotFoundException {
        int size = this.f11718b.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fM141312i = 0.0f;
        if (size > 3) {
            Iterator<ioi> it = this.f11718b.iterator();
            float f = 0.0f;
            float f2 = 0.0f;
            while (it.hasNext()) {
                float fM141312i2 = it.next().m141312i();
                f += fM141312i2;
                f2 += fM141312i2 * fM141312i2;
            }
            float f3 = size;
            float f4 = f / f3;
            float fSqrt = (float) Math.sqrt((f2 / f3) - (f4 * f4));
            Collections.sort(this.f11718b, new FurthestFromAverageComparator(f4));
            float fMax = Math.max(0.2f * f4, fSqrt);
            int i = 0;
            while (i < this.f11718b.size() && this.f11718b.size() > 3) {
                if (Math.abs(this.f11718b.get(i).m141312i() - f4) > fMax) {
                    this.f11718b.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (this.f11718b.size() > 3) {
            Iterator<ioi> it2 = this.f11718b.iterator();
            while (it2.hasNext()) {
                fM141312i += it2.next().m141312i();
            }
            Collections.sort(this.f11718b, new CenterComparator(fM141312i / this.f11718b.size()));
            List<ioi> list = this.f11718b;
            list.subList(3, list.size()).clear();
        }
        return new ioi[]{this.f11718b.get(0), this.f11718b.get(1), this.f11718b.get(2)};
    }

    /* JADX INFO: renamed from: n */
    public final void m17438n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
