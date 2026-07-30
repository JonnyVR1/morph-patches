package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0208c;
import p153l.pa00;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.h */
/* JADX INFO: loaded from: classes.dex */
public class C0218h {

    /* JADX INFO: renamed from: a */
    public static boolean[] f1178a = new boolean[3];

    /* JADX INFO: renamed from: a */
    public static void m1110a(int i, ConstraintWidget constraintWidget) {
        constraintWidget.m986H0();
        C0219i c0219iM962f = constraintWidget.f1107u.m962f();
        C0219i c0219iM962f2 = constraintWidget.f1108v.m962f();
        C0219i c0219iM962f3 = constraintWidget.f1109w.m962f();
        C0219i c0219iM962f4 = constraintWidget.f1110x.m962f();
        boolean z = (i & 8) == 8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.f1045E[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2 && m1113d(constraintWidget, 0);
        if (c0219iM962f.f1185i != 4 && c0219iM962f3.f1185i != 4) {
            if (constraintWidget.f1045E[0] == ConstraintWidget.DimensionBehaviour.FIXED || (z2 && constraintWidget.m975C() == 8)) {
                ConstraintAnchor constraintAnchor = constraintWidget.f1107u.f1032d;
                if (constraintAnchor == null && constraintWidget.f1109w.f1032d == null) {
                    c0219iM962f.m1126p(1);
                    c0219iM962f3.m1126p(1);
                    if (z) {
                        c0219iM962f3.m1120j(c0219iM962f, 1, constraintWidget.m1051x());
                    } else {
                        c0219iM962f3.m1119i(c0219iM962f, constraintWidget.m977D());
                    }
                } else if (constraintAnchor != null && constraintWidget.f1109w.f1032d == null) {
                    c0219iM962f.m1126p(1);
                    c0219iM962f3.m1126p(1);
                    if (z) {
                        c0219iM962f3.m1120j(c0219iM962f, 1, constraintWidget.m1051x());
                    } else {
                        c0219iM962f3.m1119i(c0219iM962f, constraintWidget.m977D());
                    }
                } else if (constraintAnchor == null && constraintWidget.f1109w.f1032d != null) {
                    c0219iM962f.m1126p(1);
                    c0219iM962f3.m1126p(1);
                    c0219iM962f.m1119i(c0219iM962f3, -constraintWidget.m977D());
                    if (z) {
                        c0219iM962f.m1120j(c0219iM962f3, -1, constraintWidget.m1051x());
                    } else {
                        c0219iM962f.m1119i(c0219iM962f3, -constraintWidget.m977D());
                    }
                } else if (constraintAnchor != null && constraintWidget.f1109w.f1032d != null) {
                    c0219iM962f.m1126p(2);
                    c0219iM962f3.m1126p(2);
                    if (z) {
                        constraintWidget.m1051x().m184232a(c0219iM962f);
                        constraintWidget.m1051x().m184232a(c0219iM962f3);
                        c0219iM962f.m1125o(c0219iM962f3, -1, constraintWidget.m1051x());
                        c0219iM962f3.m1125o(c0219iM962f, 1, constraintWidget.m1051x());
                    } else {
                        c0219iM962f.m1124n(c0219iM962f3, -constraintWidget.m977D());
                        c0219iM962f3.m1124n(c0219iM962f, constraintWidget.m977D());
                    }
                }
            } else if (z2) {
                int iM977D = constraintWidget.m977D();
                c0219iM962f.m1126p(1);
                c0219iM962f3.m1126p(1);
                ConstraintAnchor constraintAnchor2 = constraintWidget.f1107u.f1032d;
                if (constraintAnchor2 == null && constraintWidget.f1109w.f1032d == null) {
                    if (z) {
                        c0219iM962f3.m1120j(c0219iM962f, 1, constraintWidget.m1051x());
                    } else {
                        c0219iM962f3.m1119i(c0219iM962f, iM977D);
                    }
                } else if (constraintAnchor2 == null || constraintWidget.f1109w.f1032d != null) {
                    if (constraintAnchor2 != null || constraintWidget.f1109w.f1032d == null) {
                        if (constraintAnchor2 != null && constraintWidget.f1109w.f1032d != null) {
                            if (z) {
                                constraintWidget.m1051x().m184232a(c0219iM962f);
                                constraintWidget.m1051x().m184232a(c0219iM962f3);
                            }
                            if (constraintWidget.f1049I == 0.0f) {
                                c0219iM962f.m1126p(3);
                                c0219iM962f3.m1126p(3);
                                c0219iM962f.m1124n(c0219iM962f3, 0.0f);
                                c0219iM962f3.m1124n(c0219iM962f, 0.0f);
                            } else {
                                c0219iM962f.m1126p(2);
                                c0219iM962f3.m1126p(2);
                                c0219iM962f.m1124n(c0219iM962f3, -iM977D);
                                c0219iM962f3.m1124n(c0219iM962f, iM977D);
                                constraintWidget.m1054y0(iM977D);
                            }
                        }
                    } else if (z) {
                        c0219iM962f.m1120j(c0219iM962f3, -1, constraintWidget.m1051x());
                    } else {
                        c0219iM962f.m1119i(c0219iM962f3, -iM977D);
                    }
                } else if (z) {
                    c0219iM962f3.m1120j(c0219iM962f, 1, constraintWidget.m1051x());
                } else {
                    c0219iM962f3.m1119i(c0219iM962f, iM977D);
                }
            }
        }
        boolean z3 = constraintWidget.f1045E[1] == dimensionBehaviour2 && m1113d(constraintWidget, 1);
        if (c0219iM962f2.f1185i == 4 || c0219iM962f4.f1185i == 4) {
            return;
        }
        if (constraintWidget.f1045E[1] != ConstraintWidget.DimensionBehaviour.FIXED && (!z3 || constraintWidget.m975C() != 8)) {
            if (z3) {
                int iM1039r = constraintWidget.m1039r();
                c0219iM962f2.m1126p(1);
                c0219iM962f4.m1126p(1);
                ConstraintAnchor constraintAnchor3 = constraintWidget.f1108v.f1032d;
                if (constraintAnchor3 == null && constraintWidget.f1110x.f1032d == null) {
                    if (z) {
                        c0219iM962f4.m1120j(c0219iM962f2, 1, constraintWidget.m1049w());
                        return;
                    } else {
                        c0219iM962f4.m1119i(c0219iM962f2, iM1039r);
                        return;
                    }
                }
                if (constraintAnchor3 != null && constraintWidget.f1110x.f1032d == null) {
                    if (z) {
                        c0219iM962f4.m1120j(c0219iM962f2, 1, constraintWidget.m1049w());
                        return;
                    } else {
                        c0219iM962f4.m1119i(c0219iM962f2, iM1039r);
                        return;
                    }
                }
                if (constraintAnchor3 == null && constraintWidget.f1110x.f1032d != null) {
                    if (z) {
                        c0219iM962f2.m1120j(c0219iM962f4, -1, constraintWidget.m1049w());
                        return;
                    } else {
                        c0219iM962f2.m1119i(c0219iM962f4, -iM1039r);
                        return;
                    }
                }
                if (constraintAnchor3 == null || constraintWidget.f1110x.f1032d == null) {
                    return;
                }
                if (z) {
                    constraintWidget.m1049w().m184232a(c0219iM962f2);
                    constraintWidget.m1051x().m184232a(c0219iM962f4);
                }
                if (constraintWidget.f1049I == 0.0f) {
                    c0219iM962f2.m1126p(3);
                    c0219iM962f4.m1126p(3);
                    c0219iM962f2.m1124n(c0219iM962f4, 0.0f);
                    c0219iM962f4.m1124n(c0219iM962f2, 0.0f);
                    return;
                }
                c0219iM962f2.m1126p(2);
                c0219iM962f4.m1126p(2);
                c0219iM962f2.m1124n(c0219iM962f4, -iM1039r);
                c0219iM962f4.m1124n(c0219iM962f2, iM1039r);
                constraintWidget.m1008b0(iM1039r);
                if (constraintWidget.f1061U > 0) {
                    constraintWidget.f1111y.m962f().m1118h(1, c0219iM962f2, constraintWidget.f1061U);
                    return;
                }
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor4 = constraintWidget.f1108v.f1032d;
        if (constraintAnchor4 == null && constraintWidget.f1110x.f1032d == null) {
            c0219iM962f2.m1126p(1);
            c0219iM962f4.m1126p(1);
            if (z) {
                c0219iM962f4.m1120j(c0219iM962f2, 1, constraintWidget.m1049w());
            } else {
                c0219iM962f4.m1119i(c0219iM962f2, constraintWidget.m1039r());
            }
            ConstraintAnchor constraintAnchor5 = constraintWidget.f1111y;
            if (constraintAnchor5.f1032d != null) {
                constraintAnchor5.m962f().m1126p(1);
                c0219iM962f2.m1118h(1, constraintWidget.f1111y.m962f(), -constraintWidget.f1061U);
                return;
            }
            return;
        }
        if (constraintAnchor4 != null && constraintWidget.f1110x.f1032d == null) {
            c0219iM962f2.m1126p(1);
            c0219iM962f4.m1126p(1);
            if (z) {
                c0219iM962f4.m1120j(c0219iM962f2, 1, constraintWidget.m1049w());
            } else {
                c0219iM962f4.m1119i(c0219iM962f2, constraintWidget.m1039r());
            }
            if (constraintWidget.f1061U > 0) {
                constraintWidget.f1111y.m962f().m1118h(1, c0219iM962f2, constraintWidget.f1061U);
                return;
            }
            return;
        }
        if (constraintAnchor4 == null && constraintWidget.f1110x.f1032d != null) {
            c0219iM962f2.m1126p(1);
            c0219iM962f4.m1126p(1);
            if (z) {
                c0219iM962f2.m1120j(c0219iM962f4, -1, constraintWidget.m1049w());
            } else {
                c0219iM962f2.m1119i(c0219iM962f4, -constraintWidget.m1039r());
            }
            if (constraintWidget.f1061U > 0) {
                constraintWidget.f1111y.m962f().m1118h(1, c0219iM962f2, constraintWidget.f1061U);
                return;
            }
            return;
        }
        if (constraintAnchor4 == null || constraintWidget.f1110x.f1032d == null) {
            return;
        }
        c0219iM962f2.m1126p(2);
        c0219iM962f4.m1126p(2);
        if (z) {
            c0219iM962f2.m1125o(c0219iM962f4, -1, constraintWidget.m1049w());
            c0219iM962f4.m1125o(c0219iM962f2, 1, constraintWidget.m1049w());
            constraintWidget.m1049w().m184232a(c0219iM962f2);
            constraintWidget.m1051x().m184232a(c0219iM962f4);
        } else {
            c0219iM962f2.m1124n(c0219iM962f4, -constraintWidget.m1039r());
            c0219iM962f4.m1124n(c0219iM962f2, constraintWidget.m1039r());
        }
        if (constraintWidget.f1061U > 0) {
            constraintWidget.f1111y.m962f().m1118h(1, c0219iM962f2, constraintWidget.f1061U);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c A[PHI: r11 r12
      0x002c: PHI (r11v13 boolean) = (r11v1 boolean), (r11v15 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r12v8 boolean) = (r12v1 boolean), (r12v10 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e A[PHI: r11 r12
      0x002e: PHI (r11v3 boolean) = (r11v1 boolean), (r11v15 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r12v3 boolean) = (r12v1 boolean), (r12v10 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x02fb A[PHI: r7
      0x02fb: PHI (r7v22 float) = (r7v18 float), (r7v16 float) binds: [B:193:0x0354, B:183:0x02f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX INFO: renamed from: b */
    public static boolean m1111b(C0215e c0215e, C0208c c0208c, int i, int i2, C0214d c0214d) {
        boolean z;
        boolean z2;
        boolean z3;
        C0219i c0219i;
        float fM960d;
        boolean z4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = c0214d.f1118a;
        ConstraintWidget constraintWidget3 = c0214d.f1120c;
        ConstraintWidget constraintWidget4 = c0214d.f1119b;
        ConstraintWidget constraintWidget5 = c0214d.f1121d;
        ConstraintWidget constraintWidget6 = c0214d.f1122e;
        float f = c0214d.f1128k;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = c0215e.f1045E[i];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (i == 0) {
            int i3 = constraintWidget6.f1090l0;
            z = i3 == 0;
            z2 = i3 == 1;
            if (i3 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i4 = constraintWidget6.f1092m0;
            z = i4 == 0;
            z2 = i4 == 1;
            if (i4 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ConstraintWidget constraintWidget7 = constraintWidget2;
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        float fM977D = 0.0f;
        float fM960d2 = 0.0f;
        while (!z5) {
            if (constraintWidget7.m975C() != 8) {
                i6++;
                fM977D += i == 0 ? constraintWidget7.m977D() : constraintWidget7.m1039r();
                if (constraintWidget7 != constraintWidget4) {
                    fM977D += constraintWidget7.f1043C[i2].m960d();
                }
                if (constraintWidget7 != constraintWidget5) {
                    fM977D += constraintWidget7.f1043C[i2 + 1].m960d();
                }
                fM960d2 = fM960d2 + constraintWidget7.f1043C[i2].m960d() + constraintWidget7.f1043C[i2 + 1].m960d();
            }
            ConstraintAnchor constraintAnchor = constraintWidget7.f1043C[i2];
            if (constraintWidget7.m975C() != 8 && constraintWidget7.f1045E[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                i5++;
                if (i != 0) {
                    if (constraintWidget7.f1077f == 0 && constraintWidget7.f1087k == 0 && constraintWidget7.f1089l == 0) {
                    }
                    return false;
                }
                if (constraintWidget7.f1075e != 0 || constraintWidget7.f1081h != 0 || constraintWidget7.f1083i != 0) {
                    return false;
                }
                if (constraintWidget7.f1049I != 0.0f) {
                    return false;
                }
            }
            ConstraintAnchor constraintAnchor2 = constraintWidget7.f1043C[i2 + 1].f1032d;
            if (constraintAnchor2 != null) {
                ConstraintWidget constraintWidget8 = constraintAnchor2.f1030b;
                ConstraintAnchor constraintAnchor3 = constraintWidget8.f1043C[i2].f1032d;
                if (constraintAnchor3 == null || constraintAnchor3.f1030b != constraintWidget7) {
                    constraintWidget = null;
                } else {
                    constraintWidget = constraintWidget8;
                }
            } else {
                constraintWidget = null;
            }
            if (constraintWidget != null) {
                constraintWidget7 = constraintWidget;
            } else {
                z5 = true;
            }
        }
        C0219i c0219iM962f = constraintWidget2.f1043C[i2].m962f();
        int i7 = i2 + 1;
        C0219i c0219iM962f2 = constraintWidget3.f1043C[i7].m962f();
        C0219i c0219i2 = c0219iM962f.f1181e;
        if (c0219i2 != null && (c0219i = c0219iM962f2.f1181e) != null) {
            boolean z6 = z3;
            if (c0219i2.f165995b == 1 && c0219i.f165995b == 1) {
                if (i5 > 0 && i5 != i6) {
                    return false;
                }
                if (z6 || z || z2) {
                    fM960d = constraintWidget4 != null ? constraintWidget4.f1043C[i2].m960d() : 0.0f;
                    if (constraintWidget5 != null) {
                        fM960d += constraintWidget5.f1043C[i7].m960d();
                    }
                } else {
                    fM960d = 0.0f;
                }
                float fM960d3 = c0219iM962f.f1181e.f1184h;
                float f2 = c0219iM962f2.f1181e.f1184h;
                float f3 = (fM960d3 < f2 ? f2 - fM960d3 : fM960d3 - f2) - fM977D;
                if (i5 > 0 && i5 == i6) {
                    if (constraintWidget7.m1045u() != null && constraintWidget7.m1045u().f1045E[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        return false;
                    }
                    float f4 = (f3 + fM977D) - fM960d2;
                    while (constraintWidget2 != null) {
                        pa00 pa00Var = C0208c.f1012r;
                        if (pa00Var != null) {
                            pa00Var.f151201B--;
                            pa00Var.f151222s++;
                            pa00Var.f151228y++;
                        }
                        ConstraintWidget constraintWidget9 = constraintWidget2.f1102r0[i];
                        if (constraintWidget9 != null || constraintWidget2 == constraintWidget3) {
                            float f5 = f4 / i5;
                            if (f > 0.0f) {
                                float f6 = constraintWidget2.f1098p0[i];
                                f5 = f6 == -1.0f ? 0.0f : (f6 * f4) / f;
                            }
                            if (constraintWidget2.m975C() == 8) {
                                f5 = 0.0f;
                            }
                            float fM960d4 = fM960d3 + constraintWidget2.f1043C[i2].m960d();
                            constraintWidget2.f1043C[i2].m962f().m1122l(c0219iM962f.f1183g, fM960d4);
                            float f7 = fM960d4 + f5;
                            constraintWidget2.f1043C[i7].m962f().m1122l(c0219iM962f.f1183g, f7);
                            constraintWidget2.f1043C[i2].m962f().m1117g(c0208c);
                            constraintWidget2.f1043C[i7].m962f().m1117g(c0208c);
                            fM960d3 = f7 + constraintWidget2.f1043C[i7].m960d();
                        }
                        constraintWidget2 = constraintWidget9;
                    }
                    return true;
                }
                if (f3 < 0.0f) {
                    z4 = false;
                    z2 = false;
                    z6 = true;
                } else {
                    z4 = z;
                }
                if (z6) {
                    float fM1025k = fM960d3 + ((f3 - fM960d) * constraintWidget2.m1025k(i));
                    while (constraintWidget2 != null) {
                        pa00 pa00Var2 = C0208c.f1012r;
                        if (pa00Var2 != null) {
                            pa00Var2.f151201B--;
                            pa00Var2.f151222s++;
                            pa00Var2.f151228y++;
                        }
                        ConstraintWidget constraintWidget10 = constraintWidget2.f1102r0[i];
                        if (constraintWidget10 != null || constraintWidget2 == constraintWidget3) {
                            float fM977D2 = i == 0 ? constraintWidget2.m977D() : constraintWidget2.m1039r();
                            float fM960d5 = fM1025k + constraintWidget2.f1043C[i2].m960d();
                            constraintWidget2.f1043C[i2].m962f().m1122l(c0219iM962f.f1183g, fM960d5);
                            float f8 = fM960d5 + fM977D2;
                            constraintWidget2.f1043C[i7].m962f().m1122l(c0219iM962f.f1183g, f8);
                            constraintWidget2.f1043C[i2].m962f().m1117g(c0208c);
                            constraintWidget2.f1043C[i7].m962f().m1117g(c0208c);
                            fM1025k = f8 + constraintWidget2.f1043C[i7].m960d();
                        }
                        constraintWidget2 = constraintWidget10;
                    }
                    return true;
                }
                if (!z4 && !z2) {
                    return true;
                }
                if (z4 || z2) {
                    f3 -= fM960d;
                }
                float f9 = f3 / (i6 + 1);
                if (z2) {
                    f9 = f3 / (i6 > 1 ? i6 - 1 : 2.0f);
                }
                float fM960d6 = constraintWidget2.m975C() != 8 ? fM960d3 + f9 : fM960d3;
                if (z2 && i6 > 1) {
                    fM960d6 = constraintWidget4.f1043C[i2].m960d() + fM960d3;
                }
                if (z4 && constraintWidget4 != null) {
                    fM960d6 += constraintWidget4.f1043C[i2].m960d();
                }
                while (constraintWidget2 != null) {
                    pa00 pa00Var3 = C0208c.f1012r;
                    if (pa00Var3 != null) {
                        pa00Var3.f151201B--;
                        pa00Var3.f151222s++;
                        pa00Var3.f151228y++;
                    }
                    ConstraintWidget constraintWidget11 = constraintWidget2.f1102r0[i];
                    if (constraintWidget11 != null || constraintWidget2 == constraintWidget3) {
                        float fM977D3 = i == 0 ? constraintWidget2.m977D() : constraintWidget2.m1039r();
                        if (constraintWidget2 != constraintWidget4) {
                            fM960d6 += constraintWidget2.f1043C[i2].m960d();
                        }
                        constraintWidget2.f1043C[i2].m962f().m1122l(c0219iM962f.f1183g, fM960d6);
                        constraintWidget2.f1043C[i7].m962f().m1122l(c0219iM962f.f1183g, fM960d6 + fM977D3);
                        constraintWidget2.f1043C[i2].m962f().m1117g(c0208c);
                        constraintWidget2.f1043C[i7].m962f().m1117g(c0208c);
                        fM960d6 += fM977D3 + constraintWidget2.f1043C[i7].m960d();
                        if (constraintWidget11 != null) {
                            if (constraintWidget11.m975C() != 8) {
                                fM960d6 += f9;
                            }
                        }
                    }
                    constraintWidget2 = constraintWidget11;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m1112c(C0215e c0215e, C0208c c0208c, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = c0215e.f1045E[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f1045E[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f1107u.f1033e;
            int iM977D = c0215e.m977D() - constraintWidget.f1109w.f1033e;
            ConstraintAnchor constraintAnchor = constraintWidget.f1107u;
            constraintAnchor.f1038j = c0208c.m950r(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f1109w;
            constraintAnchor2.f1038j = c0208c.m950r(constraintAnchor2);
            c0208c.m938f(constraintWidget.f1107u.f1038j, i);
            c0208c.m938f(constraintWidget.f1109w.f1038j, iM977D);
            constraintWidget.f1067a = 2;
            constraintWidget.m1016f0(i, iM977D);
        }
        if (c0215e.f1045E[1] == dimensionBehaviour2 || constraintWidget.f1045E[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.f1108v.f1033e;
        int iM1039r = c0215e.m1039r() - constraintWidget.f1110x.f1033e;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f1108v;
        constraintAnchor3.f1038j = c0208c.m950r(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f1110x;
        constraintAnchor4.f1038j = c0208c.m950r(constraintAnchor4);
        c0208c.m938f(constraintWidget.f1108v.f1038j, i2);
        c0208c.m938f(constraintWidget.f1110x.f1038j, iM1039r);
        if (constraintWidget.f1061U > 0 || constraintWidget.m975C() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f1111y;
            constraintAnchor5.f1038j = c0208c.m950r(constraintAnchor5);
            c0208c.m938f(constraintWidget.f1111y.f1038j, constraintWidget.f1061U + i2);
        }
        constraintWidget.f1069b = 2;
        constraintWidget.m1044t0(i2, iM1039r);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1113d(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1045E;
        if (dimensionBehaviourArr[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        if (constraintWidget.f1049I != 0.0f) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i == 0) {
            if (constraintWidget.f1075e != 0 || constraintWidget.f1081h != 0 || constraintWidget.f1083i != 0) {
                return false;
            }
        } else if (constraintWidget.f1077f != 0 || constraintWidget.f1087k != 0 || constraintWidget.f1089l != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m1114e(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        constraintWidget.f1043C[i3].m962f().f1183g = constraintWidget.m1045u().f1107u.m962f();
        constraintWidget.f1043C[i3].m962f().f1184h = i2;
        constraintWidget.f1043C[i3].m962f().f165995b = 1;
        constraintWidget.f1043C[i4].m962f().f1183g = constraintWidget.f1043C[i3].m962f();
        constraintWidget.f1043C[i4].m962f().f1184h = constraintWidget.m1043t(i);
        constraintWidget.f1043C[i4].m962f().f165995b = 1;
    }
}
