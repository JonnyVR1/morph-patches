package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.s3d0;
import p153l.t1l;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.a */
/* JADX INFO: loaded from: classes.dex */
public class C0211a {
    /* JADX INFO: renamed from: a */
    public static void m1057a(C0215e c0215e) {
        if ((c0215e.m1083S0() & 32) != 32) {
            m1066j(c0215e);
            return;
        }
        c0215e.f1149O0 = true;
        c0215e.f1143I0 = false;
        c0215e.f1144J0 = false;
        c0215e.f1145K0 = false;
        ArrayList<ConstraintWidget> arrayList = c0215e.f120612v0;
        List<C0216f> list = c0215e.f1142H0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s = c0215e.m1041s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z = dimensionBehaviourM1041s == dimensionBehaviour;
        boolean z2 = c0215e.m973B() == dimensionBehaviour;
        boolean z3 = z || z2;
        list.clear();
        for (ConstraintWidget constraintWidget : arrayList) {
            constraintWidget.f1101r = null;
            constraintWidget.f1088k0 = false;
            constraintWidget.mo997S();
        }
        for (ConstraintWidget constraintWidget2 : arrayList) {
            if (constraintWidget2.f1101r == null && !m1058b(constraintWidget2, list, z3)) {
                m1066j(c0215e);
                c0215e.f1149O0 = false;
                return;
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        for (C0216f c0216f : list) {
            iMax = Math.max(iMax, m1059c(c0216f, 0));
            iMax2 = Math.max(iMax2, m1059c(c0216f, 1));
        }
        if (z) {
            c0215e.m1018g0(ConstraintWidget.DimensionBehaviour.FIXED);
            c0215e.m1054y0(iMax);
            c0215e.f1143I0 = true;
            c0215e.f1144J0 = true;
            c0215e.f1146L0 = iMax;
        }
        if (z2) {
            c0215e.m1046u0(ConstraintWidget.DimensionBehaviour.FIXED);
            c0215e.m1008b0(iMax2);
            c0215e.f1143I0 = true;
            c0215e.f1145K0 = true;
            c0215e.f1147M0 = iMax2;
        }
        m1065i(list, 0, c0215e.m977D());
        m1065i(list, 1, c0215e.m1039r());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1058b(ConstraintWidget constraintWidget, List<C0216f> list, boolean z) {
        C0216f c0216f = new C0216f(new ArrayList(), true);
        list.add(c0216f);
        return m1067k(constraintWidget, c0216f, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static int m1059c(C0216f c0216f, int i) {
        int i2 = i * 2;
        List<ConstraintWidget> listM1099b = c0216f.m1099b(i);
        int size = listM1099b.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = listM1099b.get(i3);
            ConstraintAnchor[] constraintAnchorArr = constraintWidget.f1043C;
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i2 + 1].f1032d;
            iMax = Math.max(iMax, m1060d(constraintWidget, i, constraintAnchor == null || !(constraintAnchorArr[i2].f1032d == null || constraintAnchor == null), 0));
        }
        c0216f.f1161e[i] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: d */
    public static int m1060d(ConstraintWidget constraintWidget, int i, boolean z, int i2) {
        int iM1039r;
        int iM1023j;
        int i3;
        int i4;
        int i5;
        int iM977D;
        int i6;
        int iMax = 0;
        if (!constraintWidget.f1084i0) {
            return 0;
        }
        boolean z2 = constraintWidget.f1111y.f1032d != null && i == 1;
        if (z) {
            iM1039r = constraintWidget.m1023j();
            iM1023j = constraintWidget.m1039r() - constraintWidget.m1023j();
            i4 = i * 2;
            i3 = i4 + 1;
        } else {
            iM1039r = constraintWidget.m1039r() - constraintWidget.m1023j();
            iM1023j = constraintWidget.m1023j();
            i3 = i * 2;
            i4 = i3 + 1;
        }
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.f1043C;
        if (constraintAnchorArr[i3].f1032d == null || constraintAnchorArr[i4].f1032d != null) {
            i5 = 1;
        } else {
            int i7 = i3;
            i3 = i4;
            i4 = i7;
            i5 = -1;
        }
        int i8 = z2 ? i2 - iM1039r : i2;
        int iM960d = (constraintAnchorArr[i4].m960d() * i5) + m1061e(constraintWidget, i);
        int i9 = i8 + iM960d;
        int iM977D2 = (i == 0 ? constraintWidget.m977D() : constraintWidget.m1039r()) * i5;
        Iterator<s3d0> it = constraintWidget.f1043C[i4].m962f().f165994a.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, m1060d(((C0219i) it.next()).f1179c.f1030b, i, z, i9));
        }
        Iterator<s3d0> it2 = constraintWidget.f1043C[i3].m962f().f165994a.iterator();
        int iMax2 = 0;
        while (it2.hasNext()) {
            iMax2 = Math.max(iMax2, m1060d(((C0219i) it2.next()).f1179c.f1030b, i, z, iM977D2 + i9));
            z2 = z2;
        }
        boolean z3 = z2;
        if (z3) {
            iMax -= iM1039r;
            iM977D = iMax2 + iM1023j;
        } else {
            iM977D = iMax2 + ((i == 0 ? constraintWidget.m977D() : constraintWidget.m1039r()) * i5);
        }
        int i10 = 1;
        if (i == 1) {
            Iterator<s3d0> it3 = constraintWidget.f1111y.m962f().f165994a.iterator();
            int iMax3 = 0;
            while (it3.hasNext()) {
                Iterator<s3d0> it4 = it3;
                C0219i c0219i = (C0219i) it3.next();
                iMax3 = i5 == i10 ? Math.max(iMax3, m1060d(c0219i.f1179c.f1030b, i, z, iM1039r + i9)) : Math.max(iMax3, m1060d(c0219i.f1179c.f1030b, i, z, (iM1023j * i5) + i9));
                it3 = it4;
                i10 = 1;
            }
            if (constraintWidget.f1111y.m962f().f165994a.size() <= 0 || z3) {
                i6 = iMax3;
            } else {
                i6 = i5 == 1 ? iMax3 + iM1039r : iMax3 - iM1023j;
            }
        } else {
            i6 = 0;
        }
        int iMax4 = iM960d + Math.max(iMax, Math.max(iM977D, i6));
        int i11 = iM977D2 + i9;
        if (i5 == -1) {
            i11 = i9;
            i9 = i11;
        }
        if (z) {
            C0218h.m1114e(constraintWidget, i, i9);
            constraintWidget.m1004Z(i9, i11, i);
        } else {
            constraintWidget.f1101r.m1098a(constraintWidget, i);
            constraintWidget.m1038q0(i9, i);
        }
        if (constraintWidget.m1033o(i) == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f1049I != 0.0f) {
            constraintWidget.f1101r.m1098a(constraintWidget, i);
        }
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.f1043C;
        if (constraintAnchorArr2[i4].f1032d != null && constraintAnchorArr2[i3].f1032d != null) {
            ConstraintWidget constraintWidgetM1045u = constraintWidget.m1045u();
            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget.f1043C;
            if (constraintAnchorArr3[i4].f1032d.f1030b == constraintWidgetM1045u && constraintAnchorArr3[i3].f1032d.f1030b == constraintWidgetM1045u) {
                constraintWidget.f1101r.m1098a(constraintWidget, i);
            }
        }
        return iMax4;
    }

    /* JADX INFO: renamed from: e */
    public static int m1061e(ConstraintWidget constraintWidget, int i) {
        ConstraintAnchor constraintAnchor;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.f1043C;
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2 + 1];
        ConstraintAnchor constraintAnchor4 = constraintAnchor2.f1032d;
        if (constraintAnchor4 == null) {
            return 0;
        }
        ConstraintWidget constraintWidget2 = constraintAnchor4.f1030b;
        ConstraintWidget constraintWidget3 = constraintWidget.f1046F;
        if (constraintWidget2 != constraintWidget3 || (constraintAnchor = constraintAnchor3.f1032d) == null || constraintAnchor.f1030b != constraintWidget3) {
            return 0;
        }
        return (int) ((((constraintWidget3.m1043t(i) - constraintAnchor2.m960d()) - constraintAnchor3.m960d()) - constraintWidget.m1043t(i)) * (i == 0 ? constraintWidget.f1066Z : constraintWidget.f1068a0));
    }

    /* JADX INFO: renamed from: f */
    public static void m1062f(C0215e c0215e, ConstraintWidget constraintWidget, C0216f c0216f) {
        c0216f.f1160d = false;
        c0215e.f1149O0 = false;
        constraintWidget.f1084i0 = false;
    }

    /* JADX INFO: renamed from: g */
    public static int m1063g(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s = constraintWidget.m1041s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviourM1041s == dimensionBehaviour) {
            int iM1039r = (int) (constraintWidget.f1050J == 0 ? constraintWidget.m1039r() * constraintWidget.f1049I : constraintWidget.m1039r() / constraintWidget.f1049I);
            constraintWidget.m1054y0(iM1039r);
            return iM1039r;
        }
        if (constraintWidget.m973B() != dimensionBehaviour) {
            return -1;
        }
        int iM977D = (int) (constraintWidget.f1050J == 1 ? constraintWidget.m977D() * constraintWidget.f1049I : constraintWidget.m977D() / constraintWidget.f1049I);
        constraintWidget.m1008b0(iM977D);
        return iM977D;
    }

    /* JADX INFO: renamed from: h */
    public static void m1064h(ConstraintAnchor constraintAnchor) {
        C0219i c0219iM962f = constraintAnchor.m962f();
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1032d;
        if (constraintAnchor2 == null || constraintAnchor2.f1032d == constraintAnchor) {
            return;
        }
        constraintAnchor2.m962f().m184232a(c0219iM962f);
    }

    /* JADX INFO: renamed from: i */
    public static void m1065i(List<C0216f> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (ConstraintWidget constraintWidget : list.get(i3).m1100c(i)) {
                if (constraintWidget.f1084i0) {
                    m1068l(constraintWidget, i, i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1066j(C0215e c0215e) {
        c0215e.f1142H0.clear();
        c0215e.f1142H0.add(0, new C0216f(c0215e.f120612v0));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX INFO: renamed from: k */
    public static boolean m1067k(ConstraintWidget constraintWidget, C0216f c0216f, List<C0216f> list, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (constraintWidget == null) {
            return true;
        }
        constraintWidget.f1086j0 = false;
        C0215e c0215e = (C0215e) constraintWidget.m1045u();
        C0216f c0216f2 = constraintWidget.f1101r;
        if (c0216f2 != null) {
            if (c0216f2 != c0216f) {
                c0216f.f1157a.addAll(c0216f2.f1157a);
                c0216f.f1162f.addAll(constraintWidget.f1101r.f1162f);
                c0216f.f1163g.addAll(constraintWidget.f1101r.f1163g);
                C0216f c0216f3 = constraintWidget.f1101r;
                if (!c0216f3.f1160d) {
                    c0216f.f1160d = false;
                }
                list.remove(c0216f3);
                Iterator<ConstraintWidget> it = constraintWidget.f1101r.f1157a.iterator();
                while (it.hasNext()) {
                    it.next().f1101r = c0216f;
                }
            }
            return true;
        }
        constraintWidget.f1084i0 = true;
        c0216f.f1157a.add(constraintWidget);
        constraintWidget.f1101r = c0216f;
        if (constraintWidget.f1107u.f1032d == null && constraintWidget.f1109w.f1032d == null && constraintWidget.f1108v.f1032d == null && constraintWidget.f1110x.f1032d == null && constraintWidget.f1111y.f1032d == null && constraintWidget.f1042B.f1032d == null) {
            m1062f(c0215e, constraintWidget, c0216f);
            if (z) {
                return false;
            }
        }
        if (constraintWidget.f1108v.f1032d != null && constraintWidget.f1110x.f1032d != null) {
            c0215e.m973B();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z) {
                m1062f(c0215e, constraintWidget, c0216f);
                return false;
            }
            if (constraintWidget.f1108v.f1032d.f1030b != constraintWidget.m1045u() || constraintWidget.f1110x.f1032d.f1030b != constraintWidget.m1045u()) {
                m1062f(c0215e, constraintWidget, c0216f);
            }
        }
        if (constraintWidget.f1107u.f1032d != null && constraintWidget.f1109w.f1032d != null) {
            c0215e.m1041s();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z) {
                m1062f(c0215e, constraintWidget, c0216f);
                return false;
            }
            if (constraintWidget.f1107u.f1032d.f1030b != constraintWidget.m1045u() || constraintWidget.f1109w.f1032d.f1030b != constraintWidget.m1045u()) {
                m1062f(c0215e, constraintWidget, c0216f);
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s = constraintWidget.m1041s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (((dimensionBehaviourM1041s == dimensionBehaviour3) ^ (constraintWidget.m973B() == dimensionBehaviour3)) && constraintWidget.f1049I != 0.0f) {
            m1063g(constraintWidget);
        } else if (constraintWidget.m1041s() == dimensionBehaviour3 || constraintWidget.m973B() == dimensionBehaviour3) {
            m1062f(c0215e, constraintWidget, c0216f);
            if (z) {
                return false;
            }
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f1107u.f1032d;
        if ((constraintAnchor3 == null && constraintWidget.f1109w.f1032d == null) || ((constraintAnchor3 != null && constraintAnchor3.f1030b == constraintWidget.f1046F && constraintWidget.f1109w.f1032d == null) || ((constraintAnchor = constraintWidget.f1109w.f1032d) != null && constraintAnchor.f1030b == constraintWidget.f1046F && constraintAnchor3 == null))) {
            if (constraintWidget.f1042B.f1032d == null) {
                c0216f.f1162f.add(constraintWidget);
            }
        } else if (constraintAnchor3 != null) {
            ConstraintWidget constraintWidget2 = constraintAnchor3.f1030b;
            ConstraintWidget constraintWidget3 = constraintWidget.f1046F;
            if (constraintWidget2 == constraintWidget3 && constraintAnchor != null && constraintAnchor.f1030b == constraintWidget3) {
                if (constraintWidget.f1042B.f1032d == null && !(constraintWidget instanceof C0217g) && !(constraintWidget instanceof t1l)) {
                    c0216f.f1162f.add(constraintWidget);
                }
            }
        }
        ConstraintAnchor constraintAnchor4 = constraintWidget.f1108v.f1032d;
        if ((constraintAnchor4 == null && constraintWidget.f1110x.f1032d == null) || ((constraintAnchor4 != null && constraintAnchor4.f1030b == constraintWidget.f1046F && constraintWidget.f1110x.f1032d == null) || ((constraintAnchor2 = constraintWidget.f1110x.f1032d) != null && constraintAnchor2.f1030b == constraintWidget.f1046F && constraintAnchor4 == null))) {
            if (constraintWidget.f1042B.f1032d == null) {
                c0216f.f1163g.add(constraintWidget);
            }
        } else if (constraintAnchor4 != null) {
            ConstraintWidget constraintWidget4 = constraintAnchor4.f1030b;
            ConstraintWidget constraintWidget5 = constraintWidget.f1046F;
            if (constraintWidget4 == constraintWidget5 && constraintAnchor2 != null && constraintAnchor2.f1030b == constraintWidget5) {
                if (constraintWidget.f1042B.f1032d == null && constraintWidget.f1111y.f1032d == null && !(constraintWidget instanceof C0217g) && !(constraintWidget instanceof t1l)) {
                    c0216f.f1163g.add(constraintWidget);
                }
            }
        }
        if (constraintWidget instanceof t1l) {
            m1062f(c0215e, constraintWidget, c0216f);
            if (z) {
                return false;
            }
            t1l t1lVar = (t1l) constraintWidget;
            for (int i = 0; i < t1lVar.f171682w0; i++) {
                if (!m1067k(t1lVar.f171681v0[i], c0216f, list, z)) {
                    return false;
                }
            }
        }
        int length = constraintWidget.f1043C.length;
        for (int i2 = 0; i2 < length; i2++) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f1043C[i2];
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f1032d;
            if (constraintAnchor6 != null && constraintAnchor6.f1030b != constraintWidget.m1045u()) {
                if (constraintAnchor5.f1031c == ConstraintAnchor.Type.CENTER) {
                    m1062f(c0215e, constraintWidget, c0216f);
                    if (z) {
                        return false;
                    }
                } else {
                    m1064h(constraintAnchor5);
                }
                if (!m1067k(constraintAnchor5.f1032d.f1030b, c0216f, list, z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m1068l(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.f1043C;
        ConstraintAnchor constraintAnchor = constraintAnchorArr[i3];
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i3 + 1];
        if (constraintAnchor.f1032d != null && constraintAnchor2.f1032d != null) {
            C0218h.m1114e(constraintWidget, i, m1061e(constraintWidget, i) + constraintAnchor.m960d());
            return;
        }
        if (constraintWidget.f1049I == 0.0f || constraintWidget.m1033o(i) != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int iM1047v = i2 - constraintWidget.m1047v(i);
            int iM1043t = iM1047v - constraintWidget.m1043t(i);
            constraintWidget.m1004Z(iM1043t, iM1047v, i);
            C0218h.m1114e(constraintWidget, i, iM1043t);
            return;
        }
        int iM1063g = m1063g(constraintWidget);
        int i4 = (int) constraintWidget.f1043C[i3].m962f().f1184h;
        constraintAnchor2.m962f().f1183g = constraintAnchor.m962f();
        constraintAnchor2.m962f().f1184h = iM1063g;
        constraintAnchor2.m962f().f165995b = 1;
        constraintWidget.m1004Z(i4, i4 + iM1063g, i);
    }
}
