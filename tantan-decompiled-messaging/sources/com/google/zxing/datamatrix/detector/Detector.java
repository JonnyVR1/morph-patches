package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p149l.b6q0;
import p149l.bbk;
import p149l.jex;
import p149l.o03;
import p149l.pxc0;
import p149l.pxd;

/* JADX INFO: loaded from: classes7.dex */
public final class Detector {

    /* JADX INFO: renamed from: a */
    public final o03 f11661a;

    /* JADX INFO: renamed from: b */
    public final b6q0 f11662b;

    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<C3426b> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(C3426b c3426b, C3426b c3426b2) {
            return c3426b.m17343c() - c3426b2.m17343c();
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.detector.Detector$b */
    public static final class C3426b {

        /* JADX INFO: renamed from: a */
        public final pxc0 f11663a;

        /* JADX INFO: renamed from: b */
        public final pxc0 f11664b;

        /* JADX INFO: renamed from: c */
        public final int f11665c;

        public C3426b(pxc0 pxc0Var, pxc0 pxc0Var2, int i) {
            this.f11663a = pxc0Var;
            this.f11664b = pxc0Var2;
            this.f11665c = i;
        }

        /* JADX INFO: renamed from: a */
        public pxc0 m17341a() {
            return this.f11663a;
        }

        /* JADX INFO: renamed from: b */
        public pxc0 m17342b() {
            return this.f11664b;
        }

        /* JADX INFO: renamed from: c */
        public int m17343c() {
            return this.f11665c;
        }

        public String toString() {
            return this.f11663a + "/" + this.f11664b + '/' + this.f11665c;
        }
    }

    public Detector(o03 o03Var) throws NotFoundException {
        this.f11661a = o03Var;
        this.f11662b = new b6q0(o03Var);
    }

    /* JADX INFO: renamed from: d */
    public static int m17333d(pxc0 pxc0Var, pxc0 pxc0Var2) {
        return jex.m141164c(pxc0.m171829b(pxc0Var, pxc0Var2));
    }

    /* JADX INFO: renamed from: e */
    public static void m17334e(Map<pxc0, Integer> map, pxc0 pxc0Var) {
        Integer num = map.get(pxc0Var);
        map.put(pxc0Var, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX INFO: renamed from: g */
    public static o03 m17335g(o03 o03Var, pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return bbk.m100979b().mo100980c(o03Var, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, pxc0Var.m171831c(), pxc0Var.m171832d(), pxc0Var4.m171831c(), pxc0Var4.m171832d(), pxc0Var3.m171831c(), pxc0Var3.m171832d(), pxc0Var2.m171831c(), pxc0Var2.m171832d());
    }

    /* JADX INFO: renamed from: a */
    public final pxc0 m17336a(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4, int i) {
        float f = i;
        float fM17333d = m17333d(pxc0Var, pxc0Var2) / f;
        float fM17333d2 = m17333d(pxc0Var3, pxc0Var4);
        pxc0 pxc0Var5 = new pxc0(pxc0Var4.m171831c() + (((pxc0Var4.m171831c() - pxc0Var3.m171831c()) / fM17333d2) * fM17333d), pxc0Var4.m171832d() + (fM17333d * ((pxc0Var4.m171832d() - pxc0Var3.m171832d()) / fM17333d2)));
        float fM17333d3 = m17333d(pxc0Var, pxc0Var3) / f;
        float fM17333d4 = m17333d(pxc0Var2, pxc0Var4);
        pxc0 pxc0Var6 = new pxc0(pxc0Var4.m171831c() + (((pxc0Var4.m171831c() - pxc0Var2.m171831c()) / fM17333d4) * fM17333d3), pxc0Var4.m171832d() + (fM17333d3 * ((pxc0Var4.m171832d() - pxc0Var2.m171832d()) / fM17333d4)));
        if (m17339f(pxc0Var5)) {
            if (!m17339f(pxc0Var6) || Math.abs(m17340h(pxc0Var3, pxc0Var5).m17343c() - m17340h(pxc0Var2, pxc0Var5).m17343c()) <= Math.abs(m17340h(pxc0Var3, pxc0Var6).m17343c() - m17340h(pxc0Var2, pxc0Var6).m17343c())) {
                return pxc0Var5;
            }
        } else if (!m17339f(pxc0Var6)) {
            return null;
        }
        return pxc0Var6;
    }

    /* JADX INFO: renamed from: b */
    public final pxc0 m17337b(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4, int i, int i2) {
        float fM17333d = m17333d(pxc0Var, pxc0Var2) / i;
        float fM17333d2 = m17333d(pxc0Var3, pxc0Var4);
        pxc0 pxc0Var5 = new pxc0(pxc0Var4.m171831c() + (((pxc0Var4.m171831c() - pxc0Var3.m171831c()) / fM17333d2) * fM17333d), pxc0Var4.m171832d() + (fM17333d * ((pxc0Var4.m171832d() - pxc0Var3.m171832d()) / fM17333d2)));
        float fM17333d3 = m17333d(pxc0Var, pxc0Var3) / i2;
        float fM17333d4 = m17333d(pxc0Var2, pxc0Var4);
        pxc0 pxc0Var6 = new pxc0(pxc0Var4.m171831c() + (((pxc0Var4.m171831c() - pxc0Var2.m171831c()) / fM17333d4) * fM17333d3), pxc0Var4.m171832d() + (fM17333d3 * ((pxc0Var4.m171832d() - pxc0Var2.m171832d()) / fM17333d4)));
        if (m17339f(pxc0Var5)) {
            if (!m17339f(pxc0Var6) || Math.abs(i - m17340h(pxc0Var3, pxc0Var5).m17343c()) + Math.abs(i2 - m17340h(pxc0Var2, pxc0Var5).m17343c()) <= Math.abs(i - m17340h(pxc0Var3, pxc0Var6).m17343c()) + Math.abs(i2 - m17340h(pxc0Var2, pxc0Var6).m17343c())) {
                return pxc0Var5;
            }
        } else if (!m17339f(pxc0Var6)) {
            return null;
        }
        return pxc0Var6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public pxd m17338c() throws NotFoundException {
        pxc0 pxc0Var;
        pxc0 pxc0Var2;
        o03 o03VarM17335g;
        pxc0[] pxc0VarArrM100471c = this.f11662b.m100471c();
        pxc0 pxc0Var3 = pxc0VarArrM100471c[0];
        pxc0 pxc0Var4 = pxc0VarArrM100471c[1];
        pxc0 pxc0Var5 = pxc0VarArrM100471c[2];
        pxc0 pxc0Var6 = pxc0VarArrM100471c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m17340h(pxc0Var3, pxc0Var4));
        arrayList.add(m17340h(pxc0Var3, pxc0Var5));
        arrayList.add(m17340h(pxc0Var4, pxc0Var6));
        arrayList.add(m17340h(pxc0Var5, pxc0Var6));
        pxc0 pxc0Var7 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        C3426b c3426b = (C3426b) arrayList.get(0);
        C3426b c3426b2 = (C3426b) arrayList.get(1);
        HashMap map = new HashMap();
        m17334e(map, c3426b.m17341a());
        m17334e(map, c3426b.m17342b());
        m17334e(map, c3426b2.m17341a());
        m17334e(map, c3426b2.m17342b());
        pxc0 pxc0Var8 = null;
        pxc0 pxc0Var9 = null;
        for (Map.Entry entry : map.entrySet()) {
            pxc0 pxc0Var10 = (pxc0) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                pxc0Var8 = pxc0Var10;
            } else if (pxc0Var7 == null) {
                pxc0Var7 = pxc0Var10;
            } else {
                pxc0Var9 = pxc0Var10;
            }
        }
        if (pxc0Var7 == null || pxc0Var8 == null || pxc0Var9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        pxc0[] pxc0VarArr = {pxc0Var7, pxc0Var8, pxc0Var9};
        pxc0.m171830e(pxc0VarArr);
        pxc0 pxc0Var11 = pxc0VarArr[0];
        pxc0 pxc0Var12 = pxc0VarArr[1];
        pxc0 pxc0Var13 = pxc0VarArr[2];
        if (!map.containsKey(pxc0Var3)) {
            pxc0Var4 = pxc0Var3;
        } else if (map.containsKey(pxc0Var4)) {
            pxc0Var4 = !map.containsKey(pxc0Var5) ? pxc0Var5 : pxc0Var6;
        }
        int iM17343c = m17340h(pxc0Var13, pxc0Var4).m17343c();
        int iM17343c2 = m17340h(pxc0Var11, pxc0Var4).m17343c();
        if ((iM17343c & 1) == 1) {
            iM17343c++;
        }
        int i = iM17343c + 2;
        if ((iM17343c2 & 1) == 1) {
            iM17343c2++;
        }
        int i2 = iM17343c2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            pxc0Var = pxc0Var13;
            pxc0Var2 = pxc0Var12;
            pxc0 pxc0VarM17337b = m17337b(pxc0Var2, pxc0Var11, pxc0Var, pxc0Var4, i, i2);
            pxc0Var11 = pxc0Var11;
            if (pxc0VarM17337b != null) {
                pxc0Var4 = pxc0VarM17337b;
            }
            int iM17343c3 = m17340h(pxc0Var, pxc0Var4).m17343c();
            int iM17343c4 = m17340h(pxc0Var11, pxc0Var4).m17343c();
            if ((iM17343c3 & 1) == 1) {
                iM17343c3++;
            }
            int i3 = iM17343c3;
            if ((iM17343c4 & 1) == 1) {
                iM17343c4++;
            }
            o03VarM17335g = m17335g(this.f11661a, pxc0Var, pxc0Var2, pxc0Var11, pxc0Var4, i3, iM17343c4);
        } else {
            pxc0Var = pxc0Var13;
            pxc0Var2 = pxc0Var12;
            pxc0 pxc0VarM17336a = m17336a(pxc0Var2, pxc0Var11, pxc0Var, pxc0Var4, Math.min(i2, i));
            if (pxc0VarM17336a != null) {
                pxc0Var4 = pxc0VarM17336a;
            }
            int iMax = Math.max(m17340h(pxc0Var, pxc0Var4).m17343c(), m17340h(pxc0Var11, pxc0Var4).m17343c());
            int i4 = iMax + 1;
            if ((i4 & 1) == 1) {
                i4 = iMax + 2;
            }
            int i5 = i4;
            o03VarM17335g = m17335g(this.f11661a, pxc0Var, pxc0Var2, pxc0Var11, pxc0Var4, i5, i5);
        }
        return new pxd(o03VarM17335g, new pxc0[]{pxc0Var, pxc0Var2, pxc0Var11, pxc0Var4});
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17339f(pxc0 pxc0Var) {
        return pxc0Var.m171831c() >= 0.0f && pxc0Var.m171831c() < ((float) this.f11661a.m162116m()) && pxc0Var.m171832d() > 0.0f && pxc0Var.m171832d() < ((float) this.f11661a.m162113j());
    }

    /* JADX INFO: renamed from: h */
    public final C3426b m17340h(pxc0 pxc0Var, pxc0 pxc0Var2) {
        int iM171831c = (int) pxc0Var.m171831c();
        int iM171832d = (int) pxc0Var.m171832d();
        int iM171831c2 = (int) pxc0Var2.m171831c();
        int iM171832d2 = (int) pxc0Var2.m171832d();
        int i = 0;
        boolean z = Math.abs(iM171832d2 - iM171832d) > Math.abs(iM171831c2 - iM171831c);
        if (z) {
            iM171832d = iM171831c;
            iM171831c = iM171832d;
            iM171832d2 = iM171831c2;
            iM171831c2 = iM171832d2;
        }
        int iAbs = Math.abs(iM171831c2 - iM171831c);
        int iAbs2 = Math.abs(iM171832d2 - iM171832d);
        int i2 = (-iAbs) / 2;
        int i3 = iM171832d < iM171832d2 ? 1 : -1;
        int i4 = iM171831c >= iM171831c2 ? -1 : 1;
        boolean zM162110d = this.f11661a.m162110d(z ? iM171832d : iM171831c, z ? iM171831c : iM171832d);
        while (iM171831c != iM171831c2) {
            boolean zM162110d2 = this.f11661a.m162110d(z ? iM171832d : iM171831c, z ? iM171831c : iM171832d);
            if (zM162110d2 != zM162110d) {
                i++;
                zM162110d = zM162110d2;
            }
            i2 += iAbs2;
            if (i2 > 0) {
                if (iM171832d == iM171832d2) {
                    break;
                }
                iM171832d += i3;
                i2 -= iAbs;
            }
            iM171831c += i4;
        }
        return new C3426b(pxc0Var, pxc0Var2, i);
    }
}
