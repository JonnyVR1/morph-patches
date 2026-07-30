package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p153l.d13;
import p153l.dzd;
import p153l.ffq0;
import p153l.ihx;
import p153l.rdk;
import p153l.s5d0;

/* JADX INFO: loaded from: classes7.dex */
public final class Detector {

    /* JADX INFO: renamed from: a */
    public final d13 f11698a;

    /* JADX INFO: renamed from: b */
    public final ffq0 f11699b;

    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<C3449b> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(C3449b c3449b, C3449b c3449b2) {
            return c3449b.m17398c() - c3449b2.m17398c();
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.detector.Detector$b */
    public static final class C3449b {

        /* JADX INFO: renamed from: a */
        public final s5d0 f11700a;

        /* JADX INFO: renamed from: b */
        public final s5d0 f11701b;

        /* JADX INFO: renamed from: c */
        public final int f11702c;

        public C3449b(s5d0 s5d0Var, s5d0 s5d0Var2, int i) {
            this.f11700a = s5d0Var;
            this.f11701b = s5d0Var2;
            this.f11702c = i;
        }

        /* JADX INFO: renamed from: a */
        public s5d0 m17396a() {
            return this.f11700a;
        }

        /* JADX INFO: renamed from: b */
        public s5d0 m17397b() {
            return this.f11701b;
        }

        /* JADX INFO: renamed from: c */
        public int m17398c() {
            return this.f11702c;
        }

        public String toString() {
            return this.f11700a + "/" + this.f11701b + '/' + this.f11702c;
        }
    }

    public Detector(d13 d13Var) throws NotFoundException {
        this.f11698a = d13Var;
        this.f11699b = new ffq0(d13Var);
    }

    /* JADX INFO: renamed from: d */
    public static int m17388d(s5d0 s5d0Var, s5d0 s5d0Var2) {
        return ihx.m140045c(s5d0.m184655b(s5d0Var, s5d0Var2));
    }

    /* JADX INFO: renamed from: e */
    public static void m17389e(Map<s5d0, Integer> map, s5d0 s5d0Var) {
        Integer num = map.get(s5d0Var);
        map.put(s5d0Var, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX INFO: renamed from: g */
    public static d13 m17390g(d13 d13Var, s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return rdk.m180860b().mo180861c(d13Var, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, s5d0Var.m184657c(), s5d0Var.m184658d(), s5d0Var4.m184657c(), s5d0Var4.m184658d(), s5d0Var3.m184657c(), s5d0Var3.m184658d(), s5d0Var2.m184657c(), s5d0Var2.m184658d());
    }

    /* JADX INFO: renamed from: a */
    public final s5d0 m17391a(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4, int i) {
        float f = i;
        float fM17388d = m17388d(s5d0Var, s5d0Var2) / f;
        float fM17388d2 = m17388d(s5d0Var3, s5d0Var4);
        s5d0 s5d0Var5 = new s5d0(s5d0Var4.m184657c() + (((s5d0Var4.m184657c() - s5d0Var3.m184657c()) / fM17388d2) * fM17388d), s5d0Var4.m184658d() + (fM17388d * ((s5d0Var4.m184658d() - s5d0Var3.m184658d()) / fM17388d2)));
        float fM17388d3 = m17388d(s5d0Var, s5d0Var3) / f;
        float fM17388d4 = m17388d(s5d0Var2, s5d0Var4);
        s5d0 s5d0Var6 = new s5d0(s5d0Var4.m184657c() + (((s5d0Var4.m184657c() - s5d0Var2.m184657c()) / fM17388d4) * fM17388d3), s5d0Var4.m184658d() + (fM17388d3 * ((s5d0Var4.m184658d() - s5d0Var2.m184658d()) / fM17388d4)));
        if (m17394f(s5d0Var5)) {
            if (!m17394f(s5d0Var6) || Math.abs(m17395h(s5d0Var3, s5d0Var5).m17398c() - m17395h(s5d0Var2, s5d0Var5).m17398c()) <= Math.abs(m17395h(s5d0Var3, s5d0Var6).m17398c() - m17395h(s5d0Var2, s5d0Var6).m17398c())) {
                return s5d0Var5;
            }
        } else if (!m17394f(s5d0Var6)) {
            return null;
        }
        return s5d0Var6;
    }

    /* JADX INFO: renamed from: b */
    public final s5d0 m17392b(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4, int i, int i2) {
        float fM17388d = m17388d(s5d0Var, s5d0Var2) / i;
        float fM17388d2 = m17388d(s5d0Var3, s5d0Var4);
        s5d0 s5d0Var5 = new s5d0(s5d0Var4.m184657c() + (((s5d0Var4.m184657c() - s5d0Var3.m184657c()) / fM17388d2) * fM17388d), s5d0Var4.m184658d() + (fM17388d * ((s5d0Var4.m184658d() - s5d0Var3.m184658d()) / fM17388d2)));
        float fM17388d3 = m17388d(s5d0Var, s5d0Var3) / i2;
        float fM17388d4 = m17388d(s5d0Var2, s5d0Var4);
        s5d0 s5d0Var6 = new s5d0(s5d0Var4.m184657c() + (((s5d0Var4.m184657c() - s5d0Var2.m184657c()) / fM17388d4) * fM17388d3), s5d0Var4.m184658d() + (fM17388d3 * ((s5d0Var4.m184658d() - s5d0Var2.m184658d()) / fM17388d4)));
        if (m17394f(s5d0Var5)) {
            if (!m17394f(s5d0Var6) || Math.abs(i - m17395h(s5d0Var3, s5d0Var5).m17398c()) + Math.abs(i2 - m17395h(s5d0Var2, s5d0Var5).m17398c()) <= Math.abs(i - m17395h(s5d0Var3, s5d0Var6).m17398c()) + Math.abs(i2 - m17395h(s5d0Var2, s5d0Var6).m17398c())) {
                return s5d0Var5;
            }
        } else if (!m17394f(s5d0Var6)) {
            return null;
        }
        return s5d0Var6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public dzd m17393c() throws NotFoundException {
        s5d0 s5d0Var;
        s5d0 s5d0Var2;
        d13 d13VarM17390g;
        s5d0[] s5d0VarArrM125412c = this.f11699b.m125412c();
        s5d0 s5d0Var3 = s5d0VarArrM125412c[0];
        s5d0 s5d0Var4 = s5d0VarArrM125412c[1];
        s5d0 s5d0Var5 = s5d0VarArrM125412c[2];
        s5d0 s5d0Var6 = s5d0VarArrM125412c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m17395h(s5d0Var3, s5d0Var4));
        arrayList.add(m17395h(s5d0Var3, s5d0Var5));
        arrayList.add(m17395h(s5d0Var4, s5d0Var6));
        arrayList.add(m17395h(s5d0Var5, s5d0Var6));
        s5d0 s5d0Var7 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        C3449b c3449b = (C3449b) arrayList.get(0);
        C3449b c3449b2 = (C3449b) arrayList.get(1);
        HashMap map = new HashMap();
        m17389e(map, c3449b.m17396a());
        m17389e(map, c3449b.m17397b());
        m17389e(map, c3449b2.m17396a());
        m17389e(map, c3449b2.m17397b());
        s5d0 s5d0Var8 = null;
        s5d0 s5d0Var9 = null;
        for (Map.Entry entry : map.entrySet()) {
            s5d0 s5d0Var10 = (s5d0) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                s5d0Var8 = s5d0Var10;
            } else if (s5d0Var7 == null) {
                s5d0Var7 = s5d0Var10;
            } else {
                s5d0Var9 = s5d0Var10;
            }
        }
        if (s5d0Var7 == null || s5d0Var8 == null || s5d0Var9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        s5d0[] s5d0VarArr = {s5d0Var7, s5d0Var8, s5d0Var9};
        s5d0.m184656e(s5d0VarArr);
        s5d0 s5d0Var11 = s5d0VarArr[0];
        s5d0 s5d0Var12 = s5d0VarArr[1];
        s5d0 s5d0Var13 = s5d0VarArr[2];
        if (!map.containsKey(s5d0Var3)) {
            s5d0Var4 = s5d0Var3;
        } else if (map.containsKey(s5d0Var4)) {
            s5d0Var4 = !map.containsKey(s5d0Var5) ? s5d0Var5 : s5d0Var6;
        }
        int iM17398c = m17395h(s5d0Var13, s5d0Var4).m17398c();
        int iM17398c2 = m17395h(s5d0Var11, s5d0Var4).m17398c();
        if ((iM17398c & 1) == 1) {
            iM17398c++;
        }
        int i = iM17398c + 2;
        if ((iM17398c2 & 1) == 1) {
            iM17398c2++;
        }
        int i2 = iM17398c2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            s5d0Var = s5d0Var13;
            s5d0Var2 = s5d0Var12;
            s5d0 s5d0VarM17392b = m17392b(s5d0Var2, s5d0Var11, s5d0Var, s5d0Var4, i, i2);
            s5d0Var11 = s5d0Var11;
            if (s5d0VarM17392b != null) {
                s5d0Var4 = s5d0VarM17392b;
            }
            int iM17398c3 = m17395h(s5d0Var, s5d0Var4).m17398c();
            int iM17398c4 = m17395h(s5d0Var11, s5d0Var4).m17398c();
            if ((iM17398c3 & 1) == 1) {
                iM17398c3++;
            }
            int i3 = iM17398c3;
            if ((iM17398c4 & 1) == 1) {
                iM17398c4++;
            }
            d13VarM17390g = m17390g(this.f11698a, s5d0Var, s5d0Var2, s5d0Var11, s5d0Var4, i3, iM17398c4);
        } else {
            s5d0Var = s5d0Var13;
            s5d0Var2 = s5d0Var12;
            s5d0 s5d0VarM17391a = m17391a(s5d0Var2, s5d0Var11, s5d0Var, s5d0Var4, Math.min(i2, i));
            if (s5d0VarM17391a != null) {
                s5d0Var4 = s5d0VarM17391a;
            }
            int iMax = Math.max(m17395h(s5d0Var, s5d0Var4).m17398c(), m17395h(s5d0Var11, s5d0Var4).m17398c());
            int i4 = iMax + 1;
            if ((i4 & 1) == 1) {
                i4 = iMax + 2;
            }
            int i5 = i4;
            d13VarM17390g = m17390g(this.f11698a, s5d0Var, s5d0Var2, s5d0Var11, s5d0Var4, i5, i5);
        }
        return new dzd(d13VarM17390g, new s5d0[]{s5d0Var, s5d0Var2, s5d0Var11, s5d0Var4});
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17394f(s5d0 s5d0Var) {
        return s5d0Var.m184657c() >= 0.0f && s5d0Var.m184657c() < ((float) this.f11698a.m113486m()) && s5d0Var.m184658d() > 0.0f && s5d0Var.m184658d() < ((float) this.f11698a.m113483j());
    }

    /* JADX INFO: renamed from: h */
    public final C3449b m17395h(s5d0 s5d0Var, s5d0 s5d0Var2) {
        int iM184657c = (int) s5d0Var.m184657c();
        int iM184658d = (int) s5d0Var.m184658d();
        int iM184657c2 = (int) s5d0Var2.m184657c();
        int iM184658d2 = (int) s5d0Var2.m184658d();
        int i = 0;
        boolean z = Math.abs(iM184658d2 - iM184658d) > Math.abs(iM184657c2 - iM184657c);
        if (z) {
            iM184658d = iM184657c;
            iM184657c = iM184658d;
            iM184658d2 = iM184657c2;
            iM184657c2 = iM184658d2;
        }
        int iAbs = Math.abs(iM184657c2 - iM184657c);
        int iAbs2 = Math.abs(iM184658d2 - iM184658d);
        int i2 = (-iAbs) / 2;
        int i3 = iM184658d < iM184658d2 ? 1 : -1;
        int i4 = iM184657c >= iM184657c2 ? -1 : 1;
        boolean zM113480d = this.f11698a.m113480d(z ? iM184658d : iM184657c, z ? iM184657c : iM184658d);
        while (iM184657c != iM184657c2) {
            boolean zM113480d2 = this.f11698a.m113480d(z ? iM184658d : iM184657c, z ? iM184657c : iM184658d);
            if (zM113480d2 != zM113480d) {
                i++;
                zM113480d = zM113480d2;
            }
            i2 += iAbs2;
            if (i2 > 0) {
                if (iM184658d == iM184658d2) {
                    break;
                }
                iM184658d += i3;
                i2 -= iAbs;
            }
            iM184657c += i4;
        }
        return new C3449b(s5d0Var, s5d0Var2, i);
    }
}
