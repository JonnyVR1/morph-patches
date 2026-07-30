package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0206b;
import androidx.constraintlayout.solver.C0207c;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.c */
/* JADX INFO: loaded from: classes.dex */
public class C0212c {
    /* JADX INFO: renamed from: a */
    public static void m1071a(C0214e c0214e, C0207c c0207c, int i) {
        int i2;
        C0213d[] c0213dArr;
        int i3;
        if (i == 0) {
            i2 = c0214e.f1138D0;
            c0213dArr = c0214e.f1141G0;
            i3 = 0;
        } else {
            i2 = c0214e.f1139E0;
            c0213dArr = c0214e.f1140F0;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0213d c0213d = c0213dArr[i4];
            c0213d.m1074a();
            if (!c0214e.m1088Y0(4)) {
                m1072b(c0214e, c0207c, i, i3, c0213d);
            } else if (!C0217h.m1110b(c0214e, c0207c, i, i3, c0213d)) {
                m1072b(c0214e, c0207c, i, i3, c0213d);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r14 r15
      0x002f: PHI (r14v30 boolean) = (r14v1 boolean), (r14v32 boolean) binds: [B:26:0x0043, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r15v5 boolean) = (r15v1 boolean), (r15v7 boolean) binds: [B:26:0x0043, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r14 r15
      0x0031: PHI (r14v3 boolean) = (r14v1 boolean), (r14v32 boolean) binds: [B:26:0x0043, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r15v3 boolean) = (r15v1 boolean), (r15v7 boolean) binds: [B:26:0x0043, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:264:0x047b  */
    /* JADX WARN: Code duplicated, block: B:265:0x047e  */
    /* JADX WARN: Code duplicated, block: B:268:0x0484  */
    /* JADX WARN: Code duplicated, block: B:269:0x0487  */
    /* JADX WARN: Code duplicated, block: B:271:0x048b  */
    /* JADX WARN: Code duplicated, block: B:273:0x0493  */
    /* JADX WARN: Code duplicated, block: B:276:0x049b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.constraintlayout.solver.c] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.constraintlayout.solver.c] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r5v28, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX INFO: renamed from: b */
    public static void m1072b(C0214e c0214e, C0207c c0207c, int i, int i2, C0213d c0213d) {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r0;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget;
        int i3;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int i4;
        ConstraintAnchor[] constraintAnchorArr;
        int i5;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable5;
        ConstraintAnchor constraintAnchor5;
        Object obj;
        int size;
        int i6;
        int i7;
        ConstraintWidget constraintWidget2 = c0213d.f1118a;
        ConstraintWidget constraintWidget3 = c0213d.f1120c;
        ConstraintWidget constraintWidget4 = c0213d.f1119b;
        ConstraintWidget constraintWidget5 = c0213d.f1121d;
        ConstraintWidget constraintWidget6 = c0213d.f1122e;
        float f = c0213d.f1128k;
        boolean z4 = c0214e.f1045E[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            int i8 = constraintWidget6.f1090l0;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i9 = constraintWidget6.f1092m0;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r13 = constraintWidget2;
        boolean z5 = false;
        while (true) {
            Object obj2 = null;
            if (z5) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = r13.f1043C[i2];
            int i10 = (z4 || z3) ? 1 : 4;
            int iM959d = constraintAnchor6.m959d();
            ConstraintAnchor constraintAnchor7 = constraintAnchor6.f1032d;
            if (constraintAnchor7 != null && r13 != constraintWidget2) {
                iM959d += constraintAnchor7.m959d();
            }
            int i11 = iM959d;
            if (!z3 || r13 == constraintWidget2 || r13 == constraintWidget4) {
                i6 = (z && z4) ? 4 : i10;
            } else {
                i6 = 6;
            }
            ConstraintAnchor constraintAnchor8 = constraintAnchor6.f1032d;
            boolean z6 = z5;
            if (constraintAnchor8 != null) {
                SolverVariable solverVariable6 = constraintAnchor6.f1038j;
                if (r13 == constraintWidget4) {
                    c0207c.m940i(solverVariable6, constraintAnchor8.f1038j, i11, 5);
                } else {
                    c0207c.m940i(solverVariable6, constraintAnchor8.f1038j, i11, 6);
                }
                c0207c.m936e(constraintAnchor6.f1038j, constraintAnchor6.f1032d.f1038j, i11, i6);
            } else {
                z = z;
            }
            if (z4 != 0) {
                if (r13.m974C() == 8 || r13.f1045E[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr2 = r13.f1043C;
                    i7 = 0;
                    c0207c.m940i(constraintAnchorArr2[i2 + 1].f1038j, constraintAnchorArr2[i2].f1038j, 0, 5);
                }
                c0207c.m940i(r13.f1043C[i2].f1038j, c0214e.f1043C[i2].f1038j, i7, 6);
            }
            ConstraintAnchor constraintAnchor9 = r13.f1043C[i2 + 1].f1032d;
            if (constraintAnchor9 != null) {
                ConstraintWidget constraintWidget7 = constraintAnchor9.f1030b;
                ConstraintAnchor constraintAnchor10 = constraintWidget7.f1043C[i2].f1032d;
                if (constraintAnchor10 != null && constraintAnchor10.f1030b == r13) {
                    obj2 = constraintWidget7;
                }
            }
            if (obj2 != null) {
                r13 = obj2;
                z5 = z6;
            } else {
                z5 = true;
            }
            z3 = z3;
            z4 = z4;
            z = z;
            r13 = r13;
        }
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z;
        if (constraintWidget5 != null) {
            int i12 = i2 + 1;
            ConstraintAnchor constraintAnchor11 = constraintWidget3.f1043C[i12].f1032d;
            if (constraintAnchor11 != null) {
                ConstraintAnchor constraintAnchor12 = constraintWidget5.f1043C[i12];
                c0207c.m942k(constraintAnchor12.f1038j, constraintAnchor11.f1038j, -constraintAnchor12.m959d(), 5);
            }
        }
        if (z7) {
            int i13 = i2 + 1;
            SolverVariable solverVariable7 = c0214e.f1043C[i13].f1038j;
            ConstraintAnchor constraintAnchor13 = constraintWidget3.f1043C[i13];
            c0207c.m940i(solverVariable7, constraintAnchor13.f1038j, constraintAnchor13.m959d(), 6);
        }
        ArrayList<ConstraintWidget> arrayList = c0213d.f1125h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f2 = (!c0213d.f1131n || c0213d.f1133p) ? f : c0213d.f1127j;
            float f3 = 0.0f;
            float f4 = 0.0f;
            ConstraintWidget constraintWidget8 = null;
            int i14 = 0;
            while (i14 < size) {
                ConstraintWidget constraintWidget9 = arrayList.get(i14);
                float f5 = constraintWidget9.f1098p0[i];
                if (f5 < f3) {
                    if (c0213d.f1133p) {
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget9.f1043C;
                        f3 = f3;
                        c0207c.m936e(constraintAnchorArr3[i2 + 1].f1038j, constraintAnchorArr3[i2].f1038j, 0, 4);
                    } else {
                        f5 = 1.0f;
                    }
                    i14++;
                    f3 = f3;
                }
                float f6 = f5;
                if (f6 == f3) {
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget9.f1043C;
                    c0207c.m936e(constraintAnchorArr4[i2 + 1].f1038j, constraintAnchorArr4[i2].f1038j, 0, 6);
                } else {
                    if (constraintWidget8 != null) {
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget8.f1043C;
                        SolverVariable solverVariable8 = constraintAnchorArr5[i2].f1038j;
                        int i15 = i2 + 1;
                        SolverVariable solverVariable9 = constraintAnchorArr5[i15].f1038j;
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget9.f1043C;
                        SolverVariable solverVariable10 = constraintAnchorArr6[i2].f1038j;
                        SolverVariable solverVariable11 = constraintAnchorArr6[i15].f1038j;
                        C0206b c0206bM950s = c0207c.m950s();
                        c0206bM950s.m909k(f4, f2, f6, solverVariable8, solverVariable9, solverVariable10, solverVariable11);
                        c0207c.m935d(c0206bM950s);
                    }
                    constraintWidget8 = constraintWidget9;
                    f4 = f6;
                }
                i14++;
                f3 = f3;
            }
        }
        if (constraintWidget4 != null && (constraintWidget4 == constraintWidget5 || z8)) {
            ConstraintAnchor constraintAnchor14 = constraintWidget2.f1043C[i2];
            int i16 = i2 + 1;
            ConstraintAnchor constraintAnchor15 = constraintWidget3.f1043C[i16];
            ConstraintAnchor constraintAnchor16 = constraintAnchor14.f1032d;
            SolverVariable solverVariable12 = constraintAnchor16 != null ? constraintAnchor16.f1038j : null;
            ConstraintAnchor constraintAnchor17 = constraintAnchor15.f1032d;
            SolverVariable solverVariable13 = constraintAnchor17 != null ? constraintAnchor17.f1038j : null;
            if (constraintWidget4 == constraintWidget5) {
                ConstraintAnchor[] constraintAnchorArr7 = constraintWidget4.f1043C;
                ConstraintAnchor constraintAnchor18 = constraintAnchorArr7[i2];
                constraintAnchor15 = constraintAnchorArr7[i16];
                constraintAnchor14 = constraintAnchor18;
            }
            if (solverVariable12 != null && solverVariable13 != null) {
                c0207c.m934c(constraintAnchor14.f1038j, solverVariable12, constraintAnchor14.m959d(), i == 0 ? constraintWidget6.f1066Z : constraintWidget6.f1068a0, solverVariable13, constraintAnchor15.f1038j, constraintAnchor15.m959d(), 5);
            }
        } else {
            if (!z9 || constraintWidget4 == null) {
                int i17 = 8;
                if (z2 && constraintWidget4 != null) {
                    int i18 = c0213d.f1127j;
                    boolean z10 = i18 > 0 && c0213d.f1126i == i18;
                    ConstraintWidget constraintWidget10 = constraintWidget4;
                    ConstraintWidget constraintWidget11 = constraintWidget10;
                    while (constraintWidget11 != null) {
                        ConstraintWidget constraintWidget12 = constraintWidget11.f1102r0[i];
                        while (constraintWidget12 != null && constraintWidget12.m974C() == i17) {
                            constraintWidget12 = constraintWidget12.f1102r0[i];
                        }
                        if (constraintWidget11 == constraintWidget4 || constraintWidget11 == constraintWidget5 || constraintWidget12 == null) {
                            constraintWidget10 = constraintWidget10;
                        } else {
                            if (constraintWidget12 == constraintWidget5) {
                                constraintWidget12 = null;
                            }
                            ConstraintAnchor constraintAnchor19 = constraintWidget11.f1043C[i2];
                            SolverVariable solverVariable14 = constraintAnchor19.f1038j;
                            ConstraintAnchor constraintAnchor20 = constraintAnchor19.f1032d;
                            if (constraintAnchor20 != null) {
                                SolverVariable solverVariable15 = constraintAnchor20.f1038j;
                            }
                            int i19 = i2 + 1;
                            SolverVariable solverVariable16 = constraintWidget10.f1043C[i19].f1038j;
                            int iM959d2 = constraintAnchor19.m959d();
                            int iM959d3 = constraintWidget11.f1043C[i19].m959d();
                            if (constraintWidget12 != null) {
                                constraintAnchor = constraintWidget12.f1043C[i2];
                                solverVariable2 = constraintAnchor.f1038j;
                                ConstraintAnchor constraintAnchor21 = constraintAnchor.f1032d;
                                solverVariable = constraintAnchor21 != null ? constraintAnchor21.f1038j : null;
                            } else {
                                ConstraintAnchor constraintAnchor22 = constraintWidget11.f1043C[i19];
                                ConstraintAnchor constraintAnchor23 = constraintAnchor22.f1032d;
                                SolverVariable solverVariable17 = constraintAnchor23 != null ? constraintAnchor23.f1038j : null;
                                solverVariable = constraintAnchor22.f1038j;
                                constraintAnchor = constraintAnchor23;
                                solverVariable2 = solverVariable17;
                            }
                            if (constraintAnchor != null) {
                                iM959d3 += constraintAnchor.m959d();
                            }
                            int i20 = iM959d3;
                            int iM959d4 = iM959d2 + constraintWidget10.f1043C[i19].m959d();
                            SolverVariable solverVariable18 = solverVariable2;
                            int i21 = z10 ? 6 : 4;
                            if (solverVariable14 == null || solverVariable16 == null || solverVariable18 == null || solverVariable == null) {
                                constraintWidget = constraintWidget12;
                            } else {
                                constraintWidget = constraintWidget12;
                                c0207c.m934c(solverVariable14, solverVariable16, iM959d4, 0.5f, solverVariable18, solverVariable, i20, i21);
                            }
                            constraintWidget12 = constraintWidget;
                        }
                        if (constraintWidget11.m974C() == 8) {
                            constraintWidget11 = constraintWidget10;
                        }
                        i17 = 8;
                        constraintWidget10 = constraintWidget11;
                        constraintWidget11 = constraintWidget12;
                    }
                    r0 = c0207c;
                    ConstraintAnchor constraintAnchor24 = constraintWidget4.f1043C[i2];
                    ConstraintAnchor constraintAnchor25 = constraintWidget2.f1043C[i2].f1032d;
                    int i22 = i2 + 1;
                    ConstraintAnchor constraintAnchor26 = constraintWidget5.f1043C[i22];
                    ConstraintAnchor constraintAnchor27 = constraintWidget3.f1043C[i22].f1032d;
                    if (constraintAnchor25 != null) {
                        if (constraintWidget4 != constraintWidget5) {
                            r0.m936e(constraintAnchor24.f1038j, constraintAnchor25.f1038j, constraintAnchor24.m959d(), 5);
                        } else if (constraintAnchor27 != null) {
                            r0.m934c(constraintAnchor24.f1038j, constraintAnchor25.f1038j, constraintAnchor24.m959d(), 0.5f, constraintAnchor26.f1038j, constraintAnchor27.f1038j, constraintAnchor26.m959d(), 5);
                        }
                    }
                    if (constraintAnchor27 != null && constraintWidget4 != constraintWidget5) {
                        r0.m936e(constraintAnchor26.f1038j, constraintAnchor27.f1038j, -constraintAnchor26.m959d(), 5);
                    }
                }
                if ((!z9 || z2) && constraintWidget4 != null) {
                    constraintAnchorArr = constraintWidget4.f1043C;
                    ConstraintAnchor constraintAnchor28 = constraintAnchorArr[i2];
                    i5 = i2 + 1;
                    constraintAnchor3 = constraintWidget5.f1043C[i5];
                    constraintAnchor4 = constraintAnchor28.f1032d;
                    if (constraintAnchor4 != null) {
                        solverVariable5 = constraintAnchor4.f1038j;
                    } else {
                        solverVariable5 = null;
                    }
                    constraintAnchor5 = constraintAnchor3.f1032d;
                    if (constraintAnchor5 != null) {
                        obj = constraintAnchor5.f1038j;
                    } else {
                        obj = null;
                    }
                    if (constraintWidget3 != constraintWidget5) {
                        ConstraintAnchor constraintAnchor29 = constraintWidget3.f1043C[i5].f1032d;
                        obj = constraintAnchor29 != null ? constraintAnchor29.f1038j : null;
                    }
                    if (constraintWidget4 == constraintWidget5) {
                        constraintAnchor3 = constraintAnchorArr[i5];
                    }
                    if (solverVariable5 != null || obj == null) {
                    }
                    r0.m934c(constraintAnchor28.f1038j, solverVariable5, constraintAnchor28.m959d(), 0.5f, obj, constraintAnchor3.f1038j, constraintWidget5.f1043C[i5].m959d(), 5);
                    return;
                }
                return;
            }
            int i23 = c0213d.f1127j;
            boolean z11 = i23 > 0 && c0213d.f1126i == i23;
            ConstraintWidget constraintWidget13 = constraintWidget4;
            ConstraintWidget constraintWidget14 = constraintWidget13;
            while (constraintWidget13 != null) {
                ConstraintWidget constraintWidget15 = constraintWidget13.f1102r0[i];
                while (true) {
                    if (constraintWidget15 == null) {
                        i3 = 8;
                        break;
                    }
                    i3 = 8;
                    if (constraintWidget15.m974C() != 8) {
                        break;
                    } else {
                        constraintWidget15 = constraintWidget15.f1102r0[i];
                    }
                }
                if (constraintWidget15 != null || constraintWidget13 == constraintWidget5) {
                    ConstraintAnchor constraintAnchor30 = constraintWidget13.f1043C[i2];
                    SolverVariable solverVariable19 = constraintAnchor30.f1038j;
                    ConstraintAnchor constraintAnchor31 = constraintAnchor30.f1032d;
                    SolverVariable solverVariable20 = constraintAnchor31 != null ? constraintAnchor31.f1038j : null;
                    if (constraintWidget14 != constraintWidget13) {
                        solverVariable20 = constraintWidget14.f1043C[i2 + 1].f1038j;
                    } else if (constraintWidget13 == constraintWidget4 && constraintWidget14 == constraintWidget13) {
                        ConstraintAnchor constraintAnchor32 = constraintWidget2.f1043C[i2].f1032d;
                        solverVariable20 = constraintAnchor32 != null ? constraintAnchor32.f1038j : null;
                    }
                    int iM959d5 = constraintAnchor30.m959d();
                    int i24 = i2 + 1;
                    int iM959d6 = constraintWidget13.f1043C[i24].m959d();
                    if (constraintWidget15 != null) {
                        constraintAnchor2 = constraintWidget15.f1043C[i2];
                        solverVariable3 = constraintAnchor2.f1038j;
                        solverVariable4 = constraintWidget13.f1043C[i24].f1038j;
                    } else {
                        constraintAnchor2 = constraintWidget3.f1043C[i24].f1032d;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.f1038j : null;
                        solverVariable4 = constraintWidget13.f1043C[i24].f1038j;
                    }
                    if (constraintAnchor2 != null) {
                        iM959d6 += constraintAnchor2.m959d();
                    }
                    if (constraintWidget14 != null) {
                        iM959d5 += constraintWidget14.f1043C[i24].m959d();
                    }
                    if (solverVariable19 == null || solverVariable20 == null || solverVariable3 == null || solverVariable4 == null) {
                        i4 = 8;
                    } else {
                        if (constraintWidget13 == constraintWidget4) {
                            iM959d5 = constraintWidget4.f1043C[i2].m959d();
                        }
                        if (constraintWidget13 == constraintWidget5) {
                            iM959d6 = constraintWidget5.f1043C[i24].m959d();
                        }
                        i4 = 8;
                        c0207c.m934c(solverVariable19, solverVariable20, iM959d5, 0.5f, solverVariable3, solverVariable4, iM959d6, z11 ? 6 : 4);
                    }
                } else {
                    i4 = i3;
                }
                if (constraintWidget13.m974C() != i4) {
                    constraintWidget14 = constraintWidget13;
                }
                constraintWidget13 = constraintWidget15;
            }
        }
        r0 = c0207c;
        if (z9) {
        }
        constraintAnchorArr = constraintWidget4.f1043C;
        ConstraintAnchor constraintAnchor210 = constraintAnchorArr[i2];
        i5 = i2 + 1;
        constraintAnchor3 = constraintWidget5.f1043C[i5];
        constraintAnchor4 = constraintAnchor210.f1032d;
        if (constraintAnchor4 != null) {
            solverVariable5 = constraintAnchor4.f1038j;
        } else {
            solverVariable5 = null;
        }
        constraintAnchor5 = constraintAnchor3.f1032d;
        if (constraintAnchor5 != null) {
            obj = constraintAnchor5.f1038j;
        } else {
            obj = null;
        }
        if (constraintWidget3 != constraintWidget5) {
            ConstraintAnchor constraintAnchor211 = constraintWidget3.f1043C[i5].f1032d;
            obj = constraintAnchor211 != null ? constraintAnchor211.f1038j : null;
        }
        if (constraintWidget4 == constraintWidget5) {
            constraintAnchor3 = constraintAnchorArr[i5];
        }
        if (solverVariable5 != null) {
        }
    }
}
