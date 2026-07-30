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
import p149l.mli;
import p149l.o03;
import p149l.oli;
import p149l.pxc0;
import p149l.qxc0;

/* JADX INFO: loaded from: classes7.dex */
public class FinderPatternFinder {

    /* JADX INFO: renamed from: a */
    public final o03 f11680a;

    /* JADX INFO: renamed from: c */
    public boolean f11682c;

    /* JADX INFO: renamed from: e */
    public final qxc0 f11684e;

    /* JADX INFO: renamed from: b */
    public final List<mli> f11681b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final int[] f11683d = new int[5];

    public static final class CenterComparator implements Serializable, Comparator<mli> {
        private final float average;

        private CenterComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(mli mliVar, mli mliVar2) {
            int iCompare = Integer.compare(mliVar2.m155150h(), mliVar.m155150h());
            return iCompare == 0 ? Float.compare(Math.abs(mliVar.m155151i() - this.average), Math.abs(mliVar2.m155151i() - this.average)) : iCompare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<mli> {
        private final float average;

        private FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(mli mliVar, mli mliVar2) {
            return Float.compare(Math.abs(mliVar2.m155151i() - this.average), Math.abs(mliVar.m155151i() - this.average));
        }
    }

    public FinderPatternFinder(o03 o03Var, qxc0 qxc0Var) {
        this.f11680a = o03Var;
        this.f11684e = qxc0Var;
    }

    /* JADX INFO: renamed from: a */
    public static float m17370a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17371h(int[] iArr) {
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
    public static boolean m17372i(int[] iArr) {
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
    public final void m17373b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17374c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrM17379j = m17379j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f11680a.m162110d(i2 - i6, i - i6)) {
            iArrM17379j[2] = iArrM17379j[2] + 1;
            i6++;
        }
        if (iArrM17379j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f11680a.m162110d(i2 - i6, i - i6)) {
            iArrM17379j[1] = iArrM17379j[1] + 1;
            i6++;
        }
        if (iArrM17379j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f11680a.m162110d(i2 - i6, i - i6)) {
            iArrM17379j[0] = iArrM17379j[0] + 1;
            i6++;
        }
        if (iArrM17379j[0] == 0) {
            return false;
        }
        int iM162113j = this.f11680a.m162113j();
        int iM162116m = this.f11680a.m162116m();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= iM162113j || (i5 = i2 + i7) >= iM162116m || !this.f11680a.m162110d(i5, i8)) {
                break;
            }
            iArrM17379j[2] = iArrM17379j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= iM162113j || (i4 = i2 + i7) >= iM162116m || this.f11680a.m162110d(i4, i9)) {
                break;
            }
            iArrM17379j[3] = iArrM17379j[3] + 1;
            i7++;
        }
        if (iArrM17379j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= iM162113j || (i3 = i2 + i7) >= iM162116m || !this.f11680a.m162110d(i3, i10)) {
                break;
            }
            iArrM17379j[4] = iArrM17379j[4] + 1;
            i7++;
        }
        if (iArrM17379j[4] == 0) {
            return false;
        }
        return m17372i(iArrM17379j);
    }

    /* JADX INFO: renamed from: d */
    public final float m17375d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        o03 o03Var = this.f11680a;
        int iM162116m = o03Var.m162116m();
        int[] iArrM17379j = m17379j();
        int i8 = i;
        while (i8 >= 0 && o03Var.m162110d(i8, i2)) {
            iArrM17379j[2] = iArrM17379j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !o03Var.m162110d(i8, i2)) {
            int i9 = iArrM17379j[1];
            if (i9 > i3) {
                break;
            }
            iArrM17379j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrM17379j[1] <= i3) {
            while (i8 >= 0 && o03Var.m162110d(i8, i2) && (i7 = iArrM17379j[0]) <= i3) {
                iArrM17379j[0] = i7 + 1;
                i8--;
            }
            if (iArrM17379j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iM162116m && o03Var.m162110d(i10, i2)) {
                iArrM17379j[2] = iArrM17379j[2] + 1;
                i10++;
            }
            if (i10 == iM162116m) {
                return Float.NaN;
            }
            while (i10 < iM162116m && !o03Var.m162110d(i10, i2) && (i6 = iArrM17379j[3]) < i3) {
                iArrM17379j[3] = i6 + 1;
                i10++;
            }
            if (i10 != iM162116m && iArrM17379j[3] < i3) {
                while (i10 < iM162116m && o03Var.m162110d(i10, i2) && (i5 = iArrM17379j[4]) < i3) {
                    iArrM17379j[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrM17379j[4];
                if (i11 < i3 && Math.abs(((((iArrM17379j[0] + iArrM17379j[1]) + iArrM17379j[2]) + iArrM17379j[3]) + i11) - i4) * 5 < i4 && m17371h(iArrM17379j)) {
                    return m17370a(iArrM17379j, i10);
                }
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public final float m17376e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        o03 o03Var = this.f11680a;
        int iM162113j = o03Var.m162113j();
        int[] iArrM17379j = m17379j();
        int i8 = i;
        while (i8 >= 0 && o03Var.m162110d(i2, i8)) {
            iArrM17379j[2] = iArrM17379j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !o03Var.m162110d(i2, i8)) {
            int i9 = iArrM17379j[1];
            if (i9 > i3) {
                break;
            }
            iArrM17379j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrM17379j[1] <= i3) {
            while (i8 >= 0 && o03Var.m162110d(i2, i8) && (i7 = iArrM17379j[0]) <= i3) {
                iArrM17379j[0] = i7 + 1;
                i8--;
            }
            if (iArrM17379j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iM162113j && o03Var.m162110d(i2, i10)) {
                iArrM17379j[2] = iArrM17379j[2] + 1;
                i10++;
            }
            if (i10 == iM162113j) {
                return Float.NaN;
            }
            while (i10 < iM162113j && !o03Var.m162110d(i2, i10) && (i6 = iArrM17379j[3]) < i3) {
                iArrM17379j[3] = i6 + 1;
                i10++;
            }
            if (i10 != iM162113j && iArrM17379j[3] < i3) {
                while (i10 < iM162113j && o03Var.m162110d(i2, i10) && (i5 = iArrM17379j[4]) < i3) {
                    iArrM17379j[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrM17379j[4];
                if (i11 < i3 && Math.abs(((((iArrM17379j[0] + iArrM17379j[1]) + iArrM17379j[2]) + iArrM17379j[3]) + i11) - i4) * 5 < i4 * 2 && m17371h(iArrM17379j)) {
                    return m17370a(iArrM17379j, i10);
                }
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: f */
    public final oli m17377f(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int iM162113j = this.f11680a.m162113j();
        int iM162116m = this.f11680a.m162116m();
        int i = (iM162113j * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean zM17381l = false;
        while (i2 < iM162113j && !zM17381l) {
            m17373b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < iM162116m) {
                if (this.f11680a.m162110d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (m17371h(iArr) && m17380k(iArr, i2, i3)) {
                    if (this.f11682c) {
                        zM17381l = m17381l();
                    } else {
                        int iM17378g = m17378g();
                        int i5 = iArr[2];
                        if (iM17378g > i5) {
                            i2 += (iM17378g - i5) - 2;
                            i3 = iM162116m - 1;
                        }
                    }
                    m17373b(iArr);
                    i = 2;
                    i4 = 0;
                } else {
                    m17383n(iArr);
                    i4 = 3;
                }
                i3++;
            }
            if (m17371h(iArr) && m17380k(iArr, i2, iM162116m)) {
                i = iArr[0];
                if (this.f11682c) {
                    zM17381l = m17381l();
                }
            }
            i2 += i;
        }
        mli[] mliVarArrM17382m = m17382m();
        pxc0.m171830e(mliVarArrM17382m);
        return new oli(mliVarArrM17382m);
    }

    /* JADX INFO: renamed from: g */
    public final int m17378g() {
        if (this.f11681b.size() <= 1) {
            return 0;
        }
        mli mliVar = null;
        for (mli mliVar2 : this.f11681b) {
            if (mliVar2.m155150h() >= 2) {
                if (mliVar != null) {
                    this.f11682c = true;
                    return ((int) (Math.abs(mliVar.m171831c() - mliVar2.m171831c()) - Math.abs(mliVar.m171832d() - mliVar2.m171832d()))) / 2;
                }
                mliVar = mliVar2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m17379j() {
        m17373b(this.f11683d);
        return this.f11683d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17380k(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iM17370a = (int) m17370a(iArr, i2);
        float fM17376e = m17376e(i, iM17370a, iArr[2], i3);
        if (!Float.isNaN(fM17376e)) {
            int i4 = (int) fM17376e;
            float fM17375d = m17375d(iM17370a, i4, iArr[2], i3);
            if (!Float.isNaN(fM17375d) && m17374c(i4, (int) fM17375d)) {
                float f = i3 / 7.0f;
                for (int i5 = 0; i5 < this.f11681b.size(); i5++) {
                    mli mliVar = this.f11681b.get(i5);
                    if (mliVar.m155148f(f, fM17376e, fM17375d)) {
                        this.f11681b.set(i5, mliVar.m155149g(fM17376e, fM17375d, f));
                        return true;
                    }
                }
                mli mliVar2 = new mli(fM17375d, fM17376e, f);
                this.f11681b.add(mliVar2);
                qxc0 qxc0Var = this.f11684e;
                if (qxc0Var != null) {
                    qxc0Var.mo176992a(mliVar2);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17381l() {
        int size = this.f11681b.size();
        float fAbs = 0.0f;
        int i = 0;
        float fM155151i = 0.0f;
        for (mli mliVar : this.f11681b) {
            if (mliVar.m155150h() >= 2) {
                i++;
                fM155151i += mliVar.m155151i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f = fM155151i / size;
        Iterator<mli> it = this.f11681b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().m155151i() - f);
        }
        return fAbs <= fM155151i * 0.05f;
    }

    /* JADX INFO: renamed from: m */
    public final mli[] m17382m() throws NotFoundException {
        int size = this.f11681b.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fM155151i = 0.0f;
        if (size > 3) {
            Iterator<mli> it = this.f11681b.iterator();
            float f = 0.0f;
            float f2 = 0.0f;
            while (it.hasNext()) {
                float fM155151i2 = it.next().m155151i();
                f += fM155151i2;
                f2 += fM155151i2 * fM155151i2;
            }
            float f3 = size;
            float f4 = f / f3;
            float fSqrt = (float) Math.sqrt((f2 / f3) - (f4 * f4));
            Collections.sort(this.f11681b, new FurthestFromAverageComparator(f4));
            float fMax = Math.max(0.2f * f4, fSqrt);
            int i = 0;
            while (i < this.f11681b.size() && this.f11681b.size() > 3) {
                if (Math.abs(this.f11681b.get(i).m155151i() - f4) > fMax) {
                    this.f11681b.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (this.f11681b.size() > 3) {
            Iterator<mli> it2 = this.f11681b.iterator();
            while (it2.hasNext()) {
                fM155151i += it2.next().m155151i();
            }
            Collections.sort(this.f11681b, new CenterComparator(fM155151i / this.f11681b.size()));
            List<mli> list = this.f11681b;
            list.subList(3, list.size()).clear();
        }
        return new mli[]{this.f11681b.get(0), this.f11681b.get(1), this.f11681b.get(2)};
    }

    /* JADX INFO: renamed from: n */
    public final void m17383n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
