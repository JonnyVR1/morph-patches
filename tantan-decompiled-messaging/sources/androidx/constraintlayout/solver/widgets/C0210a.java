package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.dzk;
import p149l.pvc0;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.a */
/* JADX INFO: loaded from: classes.dex */
public class C0210a {
    /* JADX INFO: renamed from: a */
    public static void m1056a(C0214e c0214e) {
        if ((c0214e.m1082S0() & 32) != 32) {
            m1065j(c0214e);
            return;
        }
        c0214e.f1149O0 = true;
        c0214e.f1143I0 = false;
        c0214e.f1144J0 = false;
        c0214e.f1145K0 = false;
        ArrayList<ConstraintWidget> arrayList = c0214e.f89632v0;
        List<C0215f> list = c0214e.f1142H0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1040s = c0214e.m1040s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z = dimensionBehaviourM1040s == dimensionBehaviour;
        boolean z2 = c0214e.m972B() == dimensionBehaviour;
        boolean z3 = z || z2;
        list.clear();
        for (ConstraintWidget constraintWidget : arrayList) {
            constraintWidget.f1101r = null;
            constraintWidget.f1088k0 = false;
            constraintWidget.mo996S();
        }
        for (ConstraintWidget constraintWidget2 : arrayList) {
            if (constraintWidget2.f1101r == null && !m1057b(constraintWidget2, list, z3)) {
                m1065j(c0214e);
                c0214e.f1149O0 = false;
                return;
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        for (C0215f c0215f : list) {
            iMax = Math.max(iMax, m1058c(c0215f, 0));
            iMax2 = Math.max(iMax2, m1058c(c0215f, 1));
        }
        if (z) {
            c0214e.m1017g0(ConstraintWidget.DimensionBehaviour.FIXED);
            c0214e.m1053y0(iMax);
            c0214e.f1143I0 = true;
            c0214e.f1144J0 = true;
            c0214e.f1146L0 = iMax;
        }
        if (z2) {
            c0214e.m1045u0(ConstraintWidget.DimensionBehaviour.FIXED);
            c0214e.m1007b0(iMax2);
            c0214e.f1143I0 = true;
            c0214e.f1145K0 = true;
            c0214e.f1147M0 = iMax2;
        }
        m1064i(list, 0, c0214e.m976D());
        m1064i(list, 1, c0214e.m1038r());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1057b(ConstraintWidget constraintWidget, List<C0215f> list, boolean z) {
        C0215f c0215f = new C0215f(new ArrayList(), true);
        list.add(c0215f);
        return m1066k(constraintWidget, c0215f, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static int m1058c(C0215f c0215f, int i) {
        int i2 = i * 2;
        List<ConstraintWidget> listM1098b = c0215f.m1098b(i);
        int size = listM1098b.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = listM1098b.get(i3);
            ConstraintAnchor[] constraintAnchorArr = constraintWidget.f1043C;
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i2 + 1].f1032d;
            iMax = Math.max(iMax, m1059d(constraintWidget, i, constraintAnchor == null || !(constraintAnchorArr[i2].f1032d == null || constraintAnchor == null), 0));
        }
        c0215f.f1161e[i] = iMax;
        return iMax;
    }

    /* JADX INFO: renamed from: d */
    public static int m1059d(ConstraintWidget constraintWidget, int i, boolean z, int i2) {
        int iM1038r;
        int iM1022j;
        int i3;
        int i4;
        int i5;
        int iM976D;
        int i6;
        int iMax = 0;
        if (!constraintWidget.f1084i0) {
            return 0;
        }
        boolean z2 = constraintWidget.f1111y.f1032d != null && i == 1;
        if (z) {
            iM1038r = constraintWidget.m1022j();
            iM1022j = constraintWidget.m1038r() - constraintWidget.m1022j();
            i4 = i * 2;
            i3 = i4 + 1;
        } else {
            iM1038r = constraintWidget.m1038r() - constraintWidget.m1022j();
            iM1022j = constraintWidget.m1022j();
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
        int i8 = z2 ? i2 - iM1038r : i2;
        int iM959d = (constraintAnchorArr[i4].m959d() * i5) + m1060e(constraintWidget, i);
        int i9 = i8 + iM959d;
        int iM976D2 = (i == 0 ? constraintWidget.m976D() : constraintWidget.m1038r()) * i5;
        Iterator<pvc0> it = constraintWidget.f1043C[i4].m961f().f151443a.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, m1059d(((C0218i) it.next()).f1179c.f1030b, i, z, i9));
        }
        Iterator<pvc0> it2 = constraintWidget.f1043C[i3].m961f().f151443a.iterator();
        int iMax2 = 0;
        while (it2.hasNext()) {
            iMax2 = Math.max(iMax2, m1059d(((C0218i) it2.next()).f1179c.f1030b, i, z, iM976D2 + i9));
            z2 = z2;
        }
        boolean z3 = z2;
        if (z3) {
            iMax -= iM1038r;
            iM976D = iMax2 + iM1022j;
        } else {
            iM976D = iMax2 + ((i == 0 ? constraintWidget.m976D() : constraintWidget.m1038r()) * i5);
        }
        int i10 = 1;
        if (i == 1) {
            Iterator<pvc0> it3 = constraintWidget.f1111y.m961f().f151443a.iterator();
            int iMax3 = 0;
            while (it3.hasNext()) {
                Iterator<pvc0> it4 = it3;
                C0218i c0218i = (C0218i) it3.next();
                iMax3 = i5 == i10 ? Math.max(iMax3, m1059d(c0218i.f1179c.f1030b, i, z, iM1038r + i9)) : Math.max(iMax3, m1059d(c0218i.f1179c.f1030b, i, z, (iM1022j * i5) + i9));
                it3 = it4;
                i10 = 1;
            }
            if (constraintWidget.f1111y.m961f().f151443a.size() <= 0 || z3) {
                i6 = iMax3;
            } else {
                i6 = i5 == 1 ? iMax3 + iM1038r : iMax3 - iM1022j;
            }
        } else {
            i6 = 0;
        }
        int iMax4 = iM959d + Math.max(iMax, Math.max(iM976D, i6));
        int i11 = iM976D2 + i9;
        if (i5 == -1) {
            i11 = i9;
            i9 = i11;
        }
        if (z) {
            C0217h.m1113e(constraintWidget, i, i9);
            constraintWidget.m1003Z(i9, i11, i);
        } else {
            constraintWidget.f1101r.m1097a(constraintWidget, i);
            constraintWidget.m1037q0(i9, i);
        }
        if (constraintWidget.m1032o(i) == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f1049I != 0.0f) {
            constraintWidget.f1101r.m1097a(constraintWidget, i);
        }
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.f1043C;
        if (constraintAnchorArr2[i4].f1032d != null && constraintAnchorArr2[i3].f1032d != null) {
            ConstraintWidget constraintWidgetM1044u = constraintWidget.m1044u();
            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget.f1043C;
            if (constraintAnchorArr3[i4].f1032d.f1030b == constraintWidgetM1044u && constraintAnchorArr3[i3].f1032d.f1030b == constraintWidgetM1044u) {
                constraintWidget.f1101r.m1097a(constraintWidget, i);
            }
        }
        return iMax4;
    }

    /* JADX INFO: renamed from: e */
    public static int m1060e(ConstraintWidget constraintWidget, int i) {
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
        return (int) ((((constraintWidget3.m1042t(i) - constraintAnchor2.m959d()) - constraintAnchor3.m959d()) - constraintWidget.m1042t(i)) * (i == 0 ? constraintWidget.f1066Z : constraintWidget.f1068a0));
    }

    /* JADX INFO: renamed from: f */
    public static void m1061f(C0214e c0214e, ConstraintWidget constraintWidget, C0215f c0215f) {
        c0215f.f1160d = false;
        c0214e.f1149O0 = false;
        constraintWidget.f1084i0 = false;
    }

    /* JADX INFO: renamed from: g */
    public static int m1062g(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1040s = constraintWidget.m1040s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviourM1040s == dimensionBehaviour) {
            int iM1038r = (int) (constraintWidget.f1050J == 0 ? constraintWidget.m1038r() * constraintWidget.f1049I : constraintWidget.m1038r() / constraintWidget.f1049I);
            constraintWidget.m1053y0(iM1038r);
            return iM1038r;
        }
        if (constraintWidget.m972B() != dimensionBehaviour) {
            return -1;
        }
        int iM976D = (int) (constraintWidget.f1050J == 1 ? constraintWidget.m976D() * constraintWidget.f1049I : constraintWidget.m976D() / constraintWidget.f1049I);
        constraintWidget.m1007b0(iM976D);
        return iM976D;
    }

    /* JADX INFO: renamed from: h */
    public static void m1063h(ConstraintAnchor constraintAnchor) {
        C0218i c0218iM961f = constraintAnchor.m961f();
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1032d;
        if (constraintAnchor2 == null || constraintAnchor2.f1032d == constraintAnchor) {
            return;
        }
        constraintAnchor2.m961f().m171616a(c0218iM961f);
    }

    /* JADX INFO: renamed from: i */
    public static void m1064i(List<C0215f> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (ConstraintWidget constraintWidget : list.get(i3).m1099c(i)) {
                if (constraintWidget.f1084i0) {
                    m1067l(constraintWidget, i, i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1065j(C0214e c0214e) {
        c0214e.f1142H0.clear();
        c0214e.f1142H0.add(0, new C0215f(c0214e.f89632v0));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX INFO: renamed from: k */
    public static boolean m1066k(ConstraintWidget constraintWidget, C0215f c0215f, List<C0215f> list, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (constraintWidget == null) {
            return true;
        }
        constraintWidget.f1086j0 = false;
        C0214e c0214e = (C0214e) constraintWidget.m1044u();
        C0215f c0215f2 = constraintWidget.f1101r;
        if (c0215f2 != null) {
            if (c0215f2 != c0215f) {
                c0215f.f1157a.addAll(c0215f2.f1157a);
                c0215f.f1162f.addAll(constraintWidget.f1101r.f1162f);
                c0215f.f1163g.addAll(constraintWidget.f1101r.f1163g);
                C0215f c0215f3 = constraintWidget.f1101r;
                if (!c0215f3.f1160d) {
                    c0215f.f1160d = false;
                }
                list.remove(c0215f3);
                Iterator<ConstraintWidget> it = constraintWidget.f1101r.f1157a.iterator();
                while (it.hasNext()) {
                    it.next().f1101r = c0215f;
                }
            }
            return true;
        }
        constraintWidget.f1084i0 = true;
        c0215f.f1157a.add(constraintWidget);
        constraintWidget.f1101r = c0215f;
        if (constraintWidget.f1107u.f1032d == null && constraintWidget.f1109w.f1032d == null && constraintWidget.f1108v.f1032d == null && constraintWidget.f1110x.f1032d == null && constraintWidget.f1111y.f1032d == null && constraintWidget.f1042B.f1032d == null) {
            m1061f(c0214e, constraintWidget, c0215f);
            if (z) {
                return false;
            }
        }
        if (constraintWidget.f1108v.f1032d != null && constraintWidget.f1110x.f1032d != null) {
            c0214e.m972B();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z) {
                m1061f(c0214e, constraintWidget, c0215f);
                return false;
            }
            if (constraintWidget.f1108v.f1032d.f1030b != constraintWidget.m1044u() || constraintWidget.f1110x.f1032d.f1030b != constraintWidget.m1044u()) {
                m1061f(c0214e, constraintWidget, c0215f);
            }
        }
        if (constraintWidget.f1107u.f1032d != null && constraintWidget.f1109w.f1032d != null) {
            c0214e.m1040s();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z) {
                m1061f(c0214e, constraintWidget, c0215f);
                return false;
            }
            if (constraintWidget.f1107u.f1032d.f1030b != constraintWidget.m1044u() || constraintWidget.f1109w.f1032d.f1030b != constraintWidget.m1044u()) {
                m1061f(c0214e, constraintWidget, c0215f);
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1040s = constraintWidget.m1040s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (((dimensionBehaviourM1040s == dimensionBehaviour3) ^ (constraintWidget.m972B() == dimensionBehaviour3)) && constraintWidget.f1049I != 0.0f) {
            m1062g(constraintWidget);
        } else if (constraintWidget.m1040s() == dimensionBehaviour3 || constraintWidget.m972B() == dimensionBehaviour3) {
            m1061f(c0214e, constraintWidget, c0215f);
            if (z) {
                return false;
            }
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f1107u.f1032d;
        if ((constraintAnchor3 == null && constraintWidget.f1109w.f1032d == null) || ((constraintAnchor3 != null && constraintAnchor3.f1030b == constraintWidget.f1046F && constraintWidget.f1109w.f1032d == null) || ((constraintAnchor = constraintWidget.f1109w.f1032d) != null && constraintAnchor.f1030b == constraintWidget.f1046F && constraintAnchor3 == null))) {
            if (constraintWidget.f1042B.f1032d == null) {
                c0215f.f1162f.add(constraintWidget);
            }
        } else if (constraintAnchor3 != null) {
            ConstraintWidget constraintWidget2 = constraintAnchor3.f1030b;
            ConstraintWidget constraintWidget3 = constraintWidget.f1046F;
            if (constraintWidget2 == constraintWidget3 && constraintAnchor != null && constraintAnchor.f1030b == constraintWidget3) {
                if (constraintWidget.f1042B.f1032d == null && !(constraintWidget instanceof C0216g) && !(constraintWidget instanceof dzk)) {
                    c0215f.f1162f.add(constraintWidget);
                }
            }
        }
        ConstraintAnchor constraintAnchor4 = constraintWidget.f1108v.f1032d;
        if ((constraintAnchor4 == null && constraintWidget.f1110x.f1032d == null) || ((constraintAnchor4 != null && constraintAnchor4.f1030b == constraintWidget.f1046F && constraintWidget.f1110x.f1032d == null) || ((constraintAnchor2 = constraintWidget.f1110x.f1032d) != null && constraintAnchor2.f1030b == constraintWidget.f1046F && constraintAnchor4 == null))) {
            if (constraintWidget.f1042B.f1032d == null) {
                c0215f.f1163g.add(constraintWidget);
            }
        } else if (constraintAnchor4 != null) {
            ConstraintWidget constraintWidget4 = constraintAnchor4.f1030b;
            ConstraintWidget constraintWidget5 = constraintWidget.f1046F;
            if (constraintWidget4 == constraintWidget5 && constraintAnchor2 != null && constraintAnchor2.f1030b == constraintWidget5) {
                if (constraintWidget.f1042B.f1032d == null && constraintWidget.f1111y.f1032d == null && !(constraintWidget instanceof C0216g) && !(constraintWidget instanceof dzk)) {
                    c0215f.f1163g.add(constraintWidget);
                }
            }
        }
        if (constraintWidget instanceof dzk) {
            m1061f(c0214e, constraintWidget, c0215f);
            if (z) {
                return false;
            }
            dzk dzkVar = (dzk) constraintWidget;
            for (int i = 0; i < dzkVar.f88489w0; i++) {
                if (!m1066k(dzkVar.f88488v0[i], c0215f, list, z)) {
                    return false;
                }
            }
        }
        int length = constraintWidget.f1043C.length;
        for (int i2 = 0; i2 < length; i2++) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f1043C[i2];
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f1032d;
            if (constraintAnchor6 != null && constraintAnchor6.f1030b != constraintWidget.m1044u()) {
                if (constraintAnchor5.f1031c == ConstraintAnchor.Type.CENTER) {
                    m1061f(c0214e, constraintWidget, c0215f);
                    if (z) {
                        return false;
                    }
                } else {
                    m1063h(constraintAnchor5);
                }
                if (!m1066k(constraintAnchor5.f1032d.f1030b, c0215f, list, z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m1067l(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = constraintWidget.f1043C;
        ConstraintAnchor constraintAnchor = constraintAnchorArr[i3];
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i3 + 1];
        if (constraintAnchor.f1032d != null && constraintAnchor2.f1032d != null) {
            C0217h.m1113e(constraintWidget, i, m1060e(constraintWidget, i) + constraintAnchor.m959d());
            return;
        }
        if (constraintWidget.f1049I == 0.0f || constraintWidget.m1032o(i) != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int iM1046v = i2 - constraintWidget.m1046v(i);
            int iM1042t = iM1046v - constraintWidget.m1042t(i);
            constraintWidget.m1003Z(iM1042t, iM1046v, i);
            C0217h.m1113e(constraintWidget, i, iM1042t);
            return;
        }
        int iM1062g = m1062g(constraintWidget);
        int i4 = (int) constraintWidget.f1043C[i3].m961f().f1184h;
        constraintAnchor2.m961f().f1183g = constraintAnchor.m961f();
        constraintAnchor2.m961f().f1184h = iM1062g;
        constraintAnchor2.m961f().f151444b = 1;
        constraintWidget.m1003Z(i4, i4 + iM1062g, i);
    }
}
