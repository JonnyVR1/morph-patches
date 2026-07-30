package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0207c;
import p149l.s100;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.h */
/* JADX INFO: loaded from: classes.dex */
public class C0217h {

    /* JADX INFO: renamed from: a */
    public static boolean[] f1178a = new boolean[3];

    /* JADX INFO: renamed from: a */
    public static void m1109a(int i, ConstraintWidget constraintWidget) {
        constraintWidget.m985H0();
        C0218i c0218iM961f = constraintWidget.f1107u.m961f();
        C0218i c0218iM961f2 = constraintWidget.f1108v.m961f();
        C0218i c0218iM961f3 = constraintWidget.f1109w.m961f();
        C0218i c0218iM961f4 = constraintWidget.f1110x.m961f();
        boolean z = (i & 8) == 8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.f1045E[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2 && m1112d(constraintWidget, 0);
        if (c0218iM961f.f1185i != 4 && c0218iM961f3.f1185i != 4) {
            if (constraintWidget.f1045E[0] == ConstraintWidget.DimensionBehaviour.FIXED || (z2 && constraintWidget.m974C() == 8)) {
                ConstraintAnchor constraintAnchor = constraintWidget.f1107u.f1032d;
                if (constraintAnchor == null && constraintWidget.f1109w.f1032d == null) {
                    c0218iM961f.m1125p(1);
                    c0218iM961f3.m1125p(1);
                    if (z) {
                        c0218iM961f3.m1119j(c0218iM961f, 1, constraintWidget.m1050x());
                    } else {
                        c0218iM961f3.m1118i(c0218iM961f, constraintWidget.m976D());
                    }
                } else if (constraintAnchor != null && constraintWidget.f1109w.f1032d == null) {
                    c0218iM961f.m1125p(1);
                    c0218iM961f3.m1125p(1);
                    if (z) {
                        c0218iM961f3.m1119j(c0218iM961f, 1, constraintWidget.m1050x());
                    } else {
                        c0218iM961f3.m1118i(c0218iM961f, constraintWidget.m976D());
                    }
                } else if (constraintAnchor == null && constraintWidget.f1109w.f1032d != null) {
                    c0218iM961f.m1125p(1);
                    c0218iM961f3.m1125p(1);
                    c0218iM961f.m1118i(c0218iM961f3, -constraintWidget.m976D());
                    if (z) {
                        c0218iM961f.m1119j(c0218iM961f3, -1, constraintWidget.m1050x());
                    } else {
                        c0218iM961f.m1118i(c0218iM961f3, -constraintWidget.m976D());
                    }
                } else if (constraintAnchor != null && constraintWidget.f1109w.f1032d != null) {
                    c0218iM961f.m1125p(2);
                    c0218iM961f3.m1125p(2);
                    if (z) {
                        constraintWidget.m1050x().m171616a(c0218iM961f);
                        constraintWidget.m1050x().m171616a(c0218iM961f3);
                        c0218iM961f.m1124o(c0218iM961f3, -1, constraintWidget.m1050x());
                        c0218iM961f3.m1124o(c0218iM961f, 1, constraintWidget.m1050x());
                    } else {
                        c0218iM961f.m1123n(c0218iM961f3, -constraintWidget.m976D());
                        c0218iM961f3.m1123n(c0218iM961f, constraintWidget.m976D());
                    }
                }
            } else if (z2) {
                int iM976D = constraintWidget.m976D();
                c0218iM961f.m1125p(1);
                c0218iM961f3.m1125p(1);
                ConstraintAnchor constraintAnchor2 = constraintWidget.f1107u.f1032d;
                if (constraintAnchor2 == null && constraintWidget.f1109w.f1032d == null) {
                    if (z) {
                        c0218iM961f3.m1119j(c0218iM961f, 1, constraintWidget.m1050x());
                    } else {
                        c0218iM961f3.m1118i(c0218iM961f, iM976D);
                    }
                } else if (constraintAnchor2 == null || constraintWidget.f1109w.f1032d != null) {
                    if (constraintAnchor2 != null || constraintWidget.f1109w.f1032d == null) {
                        if (constraintAnchor2 != null && constraintWidget.f1109w.f1032d != null) {
                            if (z) {
                                constraintWidget.m1050x().m171616a(c0218iM961f);
                                constraintWidget.m1050x().m171616a(c0218iM961f3);
                            }
                            if (constraintWidget.f1049I == 0.0f) {
                                c0218iM961f.m1125p(3);
                                c0218iM961f3.m1125p(3);
                                c0218iM961f.m1123n(c0218iM961f3, 0.0f);
                                c0218iM961f3.m1123n(c0218iM961f, 0.0f);
                            } else {
                                c0218iM961f.m1125p(2);
                                c0218iM961f3.m1125p(2);
                                c0218iM961f.m1123n(c0218iM961f3, -iM976D);
                                c0218iM961f3.m1123n(c0218iM961f, iM976D);
                                constraintWidget.m1053y0(iM976D);
                            }
                        }
                    } else if (z) {
                        c0218iM961f.m1119j(c0218iM961f3, -1, constraintWidget.m1050x());
                    } else {
                        c0218iM961f.m1118i(c0218iM961f3, -iM976D);
                    }
                } else if (z) {
                    c0218iM961f3.m1119j(c0218iM961f, 1, constraintWidget.m1050x());
                } else {
                    c0218iM961f3.m1118i(c0218iM961f, iM976D);
                }
            }
        }
        boolean z3 = constraintWidget.f1045E[1] == dimensionBehaviour2 && m1112d(constraintWidget, 1);
        if (c0218iM961f2.f1185i == 4 || c0218iM961f4.f1185i == 4) {
            return;
        }
        if (constraintWidget.f1045E[1] != ConstraintWidget.DimensionBehaviour.FIXED && (!z3 || constraintWidget.m974C() != 8)) {
            if (z3) {
                int iM1038r = constraintWidget.m1038r();
                c0218iM961f2.m1125p(1);
                c0218iM961f4.m1125p(1);
                ConstraintAnchor constraintAnchor3 = constraintWidget.f1108v.f1032d;
                if (constraintAnchor3 == null && constraintWidget.f1110x.f1032d == null) {
                    if (z) {
                        c0218iM961f4.m1119j(c0218iM961f2, 1, constraintWidget.m1048w());
                        return;
                    } else {
                        c0218iM961f4.m1118i(c0218iM961f2, iM1038r);
                        return;
                    }
                }
                if (constraintAnchor3 != null && constraintWidget.f1110x.f1032d == null) {
                    if (z) {
                        c0218iM961f4.m1119j(c0218iM961f2, 1, constraintWidget.m1048w());
                        return;
                    } else {
                        c0218iM961f4.m1118i(c0218iM961f2, iM1038r);
                        return;
                    }
                }
                if (constraintAnchor3 == null && constraintWidget.f1110x.f1032d != null) {
                    if (z) {
                        c0218iM961f2.m1119j(c0218iM961f4, -1, constraintWidget.m1048w());
                        return;
                    } else {
                        c0218iM961f2.m1118i(c0218iM961f4, -iM1038r);
                        return;
                    }
                }
                if (constraintAnchor3 == null || constraintWidget.f1110x.f1032d == null) {
                    return;
                }
                if (z) {
                    constraintWidget.m1048w().m171616a(c0218iM961f2);
                    constraintWidget.m1050x().m171616a(c0218iM961f4);
                }
                if (constraintWidget.f1049I == 0.0f) {
                    c0218iM961f2.m1125p(3);
                    c0218iM961f4.m1125p(3);
                    c0218iM961f2.m1123n(c0218iM961f4, 0.0f);
                    c0218iM961f4.m1123n(c0218iM961f2, 0.0f);
                    return;
                }
                c0218iM961f2.m1125p(2);
                c0218iM961f4.m1125p(2);
                c0218iM961f2.m1123n(c0218iM961f4, -iM1038r);
                c0218iM961f4.m1123n(c0218iM961f2, iM1038r);
                constraintWidget.m1007b0(iM1038r);
                if (constraintWidget.f1061U > 0) {
                    constraintWidget.f1111y.m961f().m1117h(1, c0218iM961f2, constraintWidget.f1061U);
                    return;
                }
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor4 = constraintWidget.f1108v.f1032d;
        if (constraintAnchor4 == null && constraintWidget.f1110x.f1032d == null) {
            c0218iM961f2.m1125p(1);
            c0218iM961f4.m1125p(1);
            if (z) {
                c0218iM961f4.m1119j(c0218iM961f2, 1, constraintWidget.m1048w());
            } else {
                c0218iM961f4.m1118i(c0218iM961f2, constraintWidget.m1038r());
            }
            ConstraintAnchor constraintAnchor5 = constraintWidget.f1111y;
            if (constraintAnchor5.f1032d != null) {
                constraintAnchor5.m961f().m1125p(1);
                c0218iM961f2.m1117h(1, constraintWidget.f1111y.m961f(), -constraintWidget.f1061U);
                return;
            }
            return;
        }
        if (constraintAnchor4 != null && constraintWidget.f1110x.f1032d == null) {
            c0218iM961f2.m1125p(1);
            c0218iM961f4.m1125p(1);
            if (z) {
                c0218iM961f4.m1119j(c0218iM961f2, 1, constraintWidget.m1048w());
            } else {
                c0218iM961f4.m1118i(c0218iM961f2, constraintWidget.m1038r());
            }
            if (constraintWidget.f1061U > 0) {
                constraintWidget.f1111y.m961f().m1117h(1, c0218iM961f2, constraintWidget.f1061U);
                return;
            }
            return;
        }
        if (constraintAnchor4 == null && constraintWidget.f1110x.f1032d != null) {
            c0218iM961f2.m1125p(1);
            c0218iM961f4.m1125p(1);
            if (z) {
                c0218iM961f2.m1119j(c0218iM961f4, -1, constraintWidget.m1048w());
            } else {
                c0218iM961f2.m1118i(c0218iM961f4, -constraintWidget.m1038r());
            }
            if (constraintWidget.f1061U > 0) {
                constraintWidget.f1111y.m961f().m1117h(1, c0218iM961f2, constraintWidget.f1061U);
                return;
            }
            return;
        }
        if (constraintAnchor4 == null || constraintWidget.f1110x.f1032d == null) {
            return;
        }
        c0218iM961f2.m1125p(2);
        c0218iM961f4.m1125p(2);
        if (z) {
            c0218iM961f2.m1124o(c0218iM961f4, -1, constraintWidget.m1048w());
            c0218iM961f4.m1124o(c0218iM961f2, 1, constraintWidget.m1048w());
            constraintWidget.m1048w().m171616a(c0218iM961f2);
            constraintWidget.m1050x().m171616a(c0218iM961f4);
        } else {
            c0218iM961f2.m1123n(c0218iM961f4, -constraintWidget.m1038r());
            c0218iM961f4.m1123n(c0218iM961f2, constraintWidget.m1038r());
        }
        if (constraintWidget.f1061U > 0) {
            constraintWidget.f1111y.m961f().m1117h(1, c0218iM961f2, constraintWidget.f1061U);
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
    public static boolean m1110b(C0214e c0214e, C0207c c0207c, int i, int i2, C0213d c0213d) {
        boolean z;
        boolean z2;
        boolean z3;
        C0218i c0218i;
        float fM959d;
        boolean z4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = c0213d.f1118a;
        ConstraintWidget constraintWidget3 = c0213d.f1120c;
        ConstraintWidget constraintWidget4 = c0213d.f1119b;
        ConstraintWidget constraintWidget5 = c0213d.f1121d;
        ConstraintWidget constraintWidget6 = c0213d.f1122e;
        float f = c0213d.f1128k;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = c0214e.f1045E[i];
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
        float fM976D = 0.0f;
        float fM959d2 = 0.0f;
        while (!z5) {
            if (constraintWidget7.m974C() != 8) {
                i6++;
                fM976D += i == 0 ? constraintWidget7.m976D() : constraintWidget7.m1038r();
                if (constraintWidget7 != constraintWidget4) {
                    fM976D += constraintWidget7.f1043C[i2].m959d();
                }
                if (constraintWidget7 != constraintWidget5) {
                    fM976D += constraintWidget7.f1043C[i2 + 1].m959d();
                }
                fM959d2 = fM959d2 + constraintWidget7.f1043C[i2].m959d() + constraintWidget7.f1043C[i2 + 1].m959d();
            }
            ConstraintAnchor constraintAnchor = constraintWidget7.f1043C[i2];
            if (constraintWidget7.m974C() != 8 && constraintWidget7.f1045E[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
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
        C0218i c0218iM961f = constraintWidget2.f1043C[i2].m961f();
        int i7 = i2 + 1;
        C0218i c0218iM961f2 = constraintWidget3.f1043C[i7].m961f();
        C0218i c0218i2 = c0218iM961f.f1181e;
        if (c0218i2 != null && (c0218i = c0218iM961f2.f1181e) != null) {
            boolean z6 = z3;
            if (c0218i2.f151444b == 1 && c0218i.f151444b == 1) {
                if (i5 > 0 && i5 != i6) {
                    return false;
                }
                if (z6 || z || z2) {
                    fM959d = constraintWidget4 != null ? constraintWidget4.f1043C[i2].m959d() : 0.0f;
                    if (constraintWidget5 != null) {
                        fM959d += constraintWidget5.f1043C[i7].m959d();
                    }
                } else {
                    fM959d = 0.0f;
                }
                float fM959d3 = c0218iM961f.f1181e.f1184h;
                float f2 = c0218iM961f2.f1181e.f1184h;
                float f3 = (fM959d3 < f2 ? f2 - fM959d3 : fM959d3 - f2) - fM976D;
                if (i5 > 0 && i5 == i6) {
                    if (constraintWidget7.m1044u() != null && constraintWidget7.m1044u().f1045E[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        return false;
                    }
                    float f4 = (f3 + fM976D) - fM959d2;
                    while (constraintWidget2 != null) {
                        s100 s100Var = C0207c.f1012r;
                        if (s100Var != null) {
                            s100Var.f161830B--;
                            s100Var.f161851s++;
                            s100Var.f161857y++;
                        }
                        ConstraintWidget constraintWidget9 = constraintWidget2.f1102r0[i];
                        if (constraintWidget9 != null || constraintWidget2 == constraintWidget3) {
                            float f5 = f4 / i5;
                            if (f > 0.0f) {
                                float f6 = constraintWidget2.f1098p0[i];
                                f5 = f6 == -1.0f ? 0.0f : (f6 * f4) / f;
                            }
                            if (constraintWidget2.m974C() == 8) {
                                f5 = 0.0f;
                            }
                            float fM959d4 = fM959d3 + constraintWidget2.f1043C[i2].m959d();
                            constraintWidget2.f1043C[i2].m961f().m1121l(c0218iM961f.f1183g, fM959d4);
                            float f7 = fM959d4 + f5;
                            constraintWidget2.f1043C[i7].m961f().m1121l(c0218iM961f.f1183g, f7);
                            constraintWidget2.f1043C[i2].m961f().m1116g(c0207c);
                            constraintWidget2.f1043C[i7].m961f().m1116g(c0207c);
                            fM959d3 = f7 + constraintWidget2.f1043C[i7].m959d();
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
                    float fM1024k = fM959d3 + ((f3 - fM959d) * constraintWidget2.m1024k(i));
                    while (constraintWidget2 != null) {
                        s100 s100Var2 = C0207c.f1012r;
                        if (s100Var2 != null) {
                            s100Var2.f161830B--;
                            s100Var2.f161851s++;
                            s100Var2.f161857y++;
                        }
                        ConstraintWidget constraintWidget10 = constraintWidget2.f1102r0[i];
                        if (constraintWidget10 != null || constraintWidget2 == constraintWidget3) {
                            float fM976D2 = i == 0 ? constraintWidget2.m976D() : constraintWidget2.m1038r();
                            float fM959d5 = fM1024k + constraintWidget2.f1043C[i2].m959d();
                            constraintWidget2.f1043C[i2].m961f().m1121l(c0218iM961f.f1183g, fM959d5);
                            float f8 = fM959d5 + fM976D2;
                            constraintWidget2.f1043C[i7].m961f().m1121l(c0218iM961f.f1183g, f8);
                            constraintWidget2.f1043C[i2].m961f().m1116g(c0207c);
                            constraintWidget2.f1043C[i7].m961f().m1116g(c0207c);
                            fM1024k = f8 + constraintWidget2.f1043C[i7].m959d();
                        }
                        constraintWidget2 = constraintWidget10;
                    }
                    return true;
                }
                if (!z4 && !z2) {
                    return true;
                }
                if (z4 || z2) {
                    f3 -= fM959d;
                }
                float f9 = f3 / (i6 + 1);
                if (z2) {
                    f9 = f3 / (i6 > 1 ? i6 - 1 : 2.0f);
                }
                float fM959d6 = constraintWidget2.m974C() != 8 ? fM959d3 + f9 : fM959d3;
                if (z2 && i6 > 1) {
                    fM959d6 = constraintWidget4.f1043C[i2].m959d() + fM959d3;
                }
                if (z4 && constraintWidget4 != null) {
                    fM959d6 += constraintWidget4.f1043C[i2].m959d();
                }
                while (constraintWidget2 != null) {
                    s100 s100Var3 = C0207c.f1012r;
                    if (s100Var3 != null) {
                        s100Var3.f161830B--;
                        s100Var3.f161851s++;
                        s100Var3.f161857y++;
                    }
                    ConstraintWidget constraintWidget11 = constraintWidget2.f1102r0[i];
                    if (constraintWidget11 != null || constraintWidget2 == constraintWidget3) {
                        float fM976D3 = i == 0 ? constraintWidget2.m976D() : constraintWidget2.m1038r();
                        if (constraintWidget2 != constraintWidget4) {
                            fM959d6 += constraintWidget2.f1043C[i2].m959d();
                        }
                        constraintWidget2.f1043C[i2].m961f().m1121l(c0218iM961f.f1183g, fM959d6);
                        constraintWidget2.f1043C[i7].m961f().m1121l(c0218iM961f.f1183g, fM959d6 + fM976D3);
                        constraintWidget2.f1043C[i2].m961f().m1116g(c0207c);
                        constraintWidget2.f1043C[i7].m961f().m1116g(c0207c);
                        fM959d6 += fM976D3 + constraintWidget2.f1043C[i7].m959d();
                        if (constraintWidget11 != null) {
                            if (constraintWidget11.m974C() != 8) {
                                fM959d6 += f9;
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
    public static void m1111c(C0214e c0214e, C0207c c0207c, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = c0214e.f1045E[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f1045E[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f1107u.f1033e;
            int iM976D = c0214e.m976D() - constraintWidget.f1109w.f1033e;
            ConstraintAnchor constraintAnchor = constraintWidget.f1107u;
            constraintAnchor.f1038j = c0207c.m949r(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f1109w;
            constraintAnchor2.f1038j = c0207c.m949r(constraintAnchor2);
            c0207c.m937f(constraintWidget.f1107u.f1038j, i);
            c0207c.m937f(constraintWidget.f1109w.f1038j, iM976D);
            constraintWidget.f1067a = 2;
            constraintWidget.m1015f0(i, iM976D);
        }
        if (c0214e.f1045E[1] == dimensionBehaviour2 || constraintWidget.f1045E[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.f1108v.f1033e;
        int iM1038r = c0214e.m1038r() - constraintWidget.f1110x.f1033e;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f1108v;
        constraintAnchor3.f1038j = c0207c.m949r(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f1110x;
        constraintAnchor4.f1038j = c0207c.m949r(constraintAnchor4);
        c0207c.m937f(constraintWidget.f1108v.f1038j, i2);
        c0207c.m937f(constraintWidget.f1110x.f1038j, iM1038r);
        if (constraintWidget.f1061U > 0 || constraintWidget.m974C() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f1111y;
            constraintAnchor5.f1038j = c0207c.m949r(constraintAnchor5);
            c0207c.m937f(constraintWidget.f1111y.f1038j, constraintWidget.f1061U + i2);
        }
        constraintWidget.f1069b = 2;
        constraintWidget.m1043t0(i2, iM1038r);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1112d(ConstraintWidget constraintWidget, int i) {
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
    public static void m1113e(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        constraintWidget.f1043C[i3].m961f().f1183g = constraintWidget.m1044u().f1107u.m961f();
        constraintWidget.f1043C[i3].m961f().f1184h = i2;
        constraintWidget.f1043C[i3].m961f().f151444b = 1;
        constraintWidget.f1043C[i4].m961f().f1183g = constraintWidget.f1043C[i3].m961f();
        constraintWidget.f1043C[i4].m961f().f1184h = constraintWidget.m1042t(i);
        constraintWidget.f1043C[i4].m961f().f151444b = 1;
    }
}
