package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0207c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p149l.e6q0;
import p149l.ovc0;
import p149l.s100;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.e */
/* JADX INFO: loaded from: classes.dex */
public class C0214e extends e6q0 {

    /* JADX INFO: renamed from: A0 */
    public int f1135A0;

    /* JADX INFO: renamed from: B0 */
    public int f1136B0;

    /* JADX INFO: renamed from: C0 */
    public int f1137C0;

    /* JADX INFO: renamed from: y0 */
    public C0219j f1155y0;

    /* JADX INFO: renamed from: z0 */
    public int f1156z0;

    /* JADX INFO: renamed from: w0 */
    public boolean f1153w0 = false;

    /* JADX INFO: renamed from: x0 */
    public C0207c f1154x0 = new C0207c();

    /* JADX INFO: renamed from: D0 */
    public int f1138D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public int f1139E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public C0213d[] f1140F0 = new C0213d[4];

    /* JADX INFO: renamed from: G0 */
    public C0213d[] f1141G0 = new C0213d[4];

    /* JADX INFO: renamed from: H0 */
    public List<C0215f> f1142H0 = new ArrayList();

    /* JADX INFO: renamed from: I0 */
    public boolean f1143I0 = false;

    /* JADX INFO: renamed from: J0 */
    public boolean f1144J0 = false;

    /* JADX INFO: renamed from: K0 */
    public boolean f1145K0 = false;

    /* JADX INFO: renamed from: L0 */
    public int f1146L0 = 0;

    /* JADX INFO: renamed from: M0 */
    public int f1147M0 = 0;

    /* JADX INFO: renamed from: N0 */
    public int f1148N0 = 7;

    /* JADX INFO: renamed from: O0 */
    public boolean f1149O0 = false;

    /* JADX INFO: renamed from: P0 */
    public boolean f1150P0 = false;

    /* JADX INFO: renamed from: Q0 */
    public boolean f1151Q0 = false;

    /* JADX INFO: renamed from: R0 */
    public int f1152R0 = 0;

    /* JADX WARN: Code duplicated, block: B:104:0x0243  */
    /* JADX WARN: Code duplicated, block: B:107:0x0255  */
    /* JADX WARN: Code duplicated, block: B:110:0x0272  */
    /* JADX WARN: Code duplicated, block: B:112:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x02c0 A[PHI: r0 r18
      0x02c0: PHI (r0v37 int) = (r0v36 int), (r0v39 int), (r0v39 int), (r0v39 int) binds: [B:111:0x027f, B:120:0x02a8, B:121:0x02aa, B:123:0x02b0] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r18v6 boolean) = (r18v5 boolean), (r18v7 boolean), (r18v7 boolean), (r18v7 boolean) binds: [B:111:0x027f, B:120:0x02a8, B:121:0x02aa, B:123:0x02b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v44 */
    @Override // p149l.e6q0
    /* JADX INFO: renamed from: K0 */
    public void mo1076K0() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean zM1078O0;
        C0207c c0207c;
        int i3;
        ConstraintWidget constraintWidget;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i4;
        int iMax;
        boolean z3;
        int iMax2;
        boolean z4;
        boolean z5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ?? r7;
        int i5 = this.f1051K;
        int i6 = this.f1052L;
        int i7 = 0;
        int iMax3 = Math.max(0, m976D());
        int iMax4 = Math.max(0, m1038r());
        this.f1150P0 = false;
        this.f1151Q0 = false;
        if (this.f1046F != null) {
            if (this.f1155y0 == null) {
                this.f1155y0 = new C0219j(this);
            }
            this.f1155y0.m1128b(this);
            m975C0(this.f1156z0);
            m977D0(this.f1135A0);
            m995R();
            mo997T(this.f1154x0.m954x());
        } else {
            this.f1051K = 0;
            this.f1052L = 0;
        }
        int i8 = 32;
        boolean z6 = true;
        if (this.f1148N0 != 0) {
            if (!m1088Y0(8)) {
                m1090a1();
            }
            if (!m1088Y0(32)) {
                m1087X0();
            }
            this.f1154x0.f1019g = true;
        } else {
            this.f1154x0.f1019g = false;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f1045E;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
        m1092c1();
        if (this.f1142H0.size() == 0) {
            this.f1142H0.clear();
            this.f1142H0.add(0, new C0215f(this.f89632v0));
        }
        int size = this.f1142H0.size();
        ArrayList<ConstraintWidget> arrayList = this.f89632v0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1040s = m1040s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z7 = dimensionBehaviourM1040s == dimensionBehaviour7 || m972B() == dimensionBehaviour7;
        boolean z8 = false;
        int i9 = 0;
        while (true) {
            i = i7;
            if (i9 >= size || this.f1149O0) {
                break;
            }
            if (this.f1142H0.get(i9).f1160d) {
                i2 = size;
            } else {
                if (m1088Y0(i8)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourM1040s2 = m1040s();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviourM1040s2 == dimensionBehaviour8 && m972B() == dimensionBehaviour8) {
                        this.f89632v0 = (ArrayList) this.f1142H0.get(i9).m1100d();
                    } else {
                        this.f89632v0 = (ArrayList) this.f1142H0.get(i9).f1157a;
                    }
                }
                m1092c1();
                int size2 = this.f89632v0.size();
                int i10 = i;
                while (i10 < size2) {
                    boolean z9 = z6;
                    ConstraintWidget constraintWidget2 = this.f89632v0.get(i10);
                    if (constraintWidget2 instanceof e6q0) {
                        ((e6q0) constraintWidget2).mo1076K0();
                    }
                    i10++;
                    z6 = z9;
                }
                boolean z10 = z6;
                boolean z11 = z8 ? 1 : 0;
                int i11 = i;
                int i12 = z10 ? 1 : 0;
                while (i12 != 0) {
                    int i13 = i11 + 1;
                    try {
                        this.f1154x0.m930F();
                        m1092c1();
                        m1016g(this.f1154x0);
                        int i14 = i;
                        while (i14 < size2) {
                            boolean z12 = z11;
                            try {
                                this.f89632v0.get(i14).m1016g(this.f1154x0);
                                i14++;
                                z11 = z12 ? 1 : 0;
                            } catch (Exception e) {
                                e = e;
                                z = z12;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                zM1078O0 = i12 == true ? 1 : 0;
                                z2 = z;
                                c0207c = this.f1154x0;
                                if (zM1078O0) {
                                    m1096g1(c0207c, C0217h.f1178a);
                                } else {
                                    mo983G0(c0207c);
                                    i3 = i;
                                    while (true) {
                                        if (i3 < size2) {
                                            constraintWidget = this.f89632v0.get(i3);
                                            dimensionBehaviour = constraintWidget.f1045E[i];
                                            c = 2;
                                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                            if (dimensionBehaviour != dimensionBehaviour2) {
                                            }
                                            if (constraintWidget.f1045E[z10 ? 1 : 0] != dimensionBehaviour2) {
                                            }
                                            i3++;
                                        }
                                    }
                                    if (z7) {
                                        i4 = i;
                                    } else {
                                        i4 = i;
                                    }
                                    iMax = Math.max(this.f1062V, m976D());
                                    z3 = z2;
                                    if (iMax > m976D()) {
                                        m1053y0(iMax);
                                        this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        i4 = z10 ? 1 : 0;
                                        z3 = i4 == true ? 1 : 0;
                                    }
                                    iMax2 = Math.max(this.f1063W, m1038r());
                                    z4 = z3;
                                    if (iMax2 > m1038r()) {
                                        m1007b0(iMax2);
                                        this.f1045E[z10 ? 1 : 0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        i4 = z10 ? 1 : 0;
                                        z4 = i4 == true ? 1 : 0;
                                    }
                                    if (z4) {
                                        i12 = i4;
                                        z5 = z4;
                                    } else {
                                        dimensionBehaviour3 = this.f1045E[i];
                                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                                            r7 = z10 ? 1 : 0;
                                            z4 = z4;
                                        } else {
                                            r7 = z10 ? 1 : 0;
                                            z4 = z4;
                                        }
                                        if (this.f1045E[r7] == dimensionBehaviour4) {
                                            i12 = i4;
                                            z5 = z4;
                                        } else {
                                            i12 = i4;
                                            z5 = z4;
                                        }
                                    }
                                    i11 = i13;
                                    size = size;
                                    z10 = true;
                                    z11 = z5;
                                }
                                c = 2;
                                if (z7) {
                                    i4 = i;
                                } else {
                                    i4 = i;
                                }
                                iMax = Math.max(this.f1062V, m976D());
                                z3 = z2;
                                if (iMax > m976D()) {
                                    m1053y0(iMax);
                                    this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    i4 = z10 ? 1 : 0;
                                    z3 = i4 == true ? 1 : 0;
                                }
                                iMax2 = Math.max(this.f1063W, m1038r());
                                z4 = z3;
                                if (iMax2 > m1038r()) {
                                    m1007b0(iMax2);
                                    this.f1045E[z10 ? 1 : 0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    i4 = z10 ? 1 : 0;
                                    z4 = i4 == true ? 1 : 0;
                                }
                                if (z4) {
                                    dimensionBehaviour3 = this.f1045E[i];
                                    dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                                        r7 = z10 ? 1 : 0;
                                        z4 = z4;
                                    } else {
                                        r7 = z10 ? 1 : 0;
                                        z4 = z4;
                                    }
                                    if (this.f1045E[r7] == dimensionBehaviour4) {
                                        i12 = i4;
                                        z5 = z4;
                                    } else {
                                        i12 = i4;
                                        z5 = z4;
                                    }
                                } else {
                                    i12 = i4;
                                    z5 = z4;
                                }
                                i11 = i13;
                                size = size;
                                z10 = true;
                                z11 = z5;
                            }
                        }
                        z2 = z11;
                        zM1078O0 = m1078O0(this.f1154x0);
                        if (zM1078O0) {
                            this.f1154x0.m926B();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z = z11 ? 1 : 0;
                    }
                    c0207c = this.f1154x0;
                    if (zM1078O0) {
                        m1096g1(c0207c, C0217h.f1178a);
                    } else {
                        mo983G0(c0207c);
                        i3 = i;
                        while (true) {
                            if (i3 < size2) {
                                constraintWidget = this.f89632v0.get(i3);
                                dimensionBehaviour = constraintWidget.f1045E[i];
                                c = 2;
                                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.m976D() < constraintWidget.m980F()) {
                                    C0217h.f1178a[2] = z10;
                                    break;
                                } else {
                                    if (constraintWidget.f1045E[z10 ? 1 : 0] != dimensionBehaviour2 && constraintWidget.m1038r() < constraintWidget.m978E()) {
                                        C0217h.f1178a[2] = z10;
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        }
                        if (z7 || i13 >= 8 || !C0217h.f1178a[c]) {
                            i4 = i;
                        } else {
                            int i15 = i;
                            int iMax5 = i15;
                            int iMax6 = iMax5;
                            while (i15 < size2) {
                                ConstraintWidget constraintWidget3 = this.f89632v0.get(i15);
                                iMax5 = Math.max(iMax5, constraintWidget3.f1051K + constraintWidget3.m976D());
                                iMax6 = Math.max(iMax6, constraintWidget3.f1052L + constraintWidget3.m1038r());
                                i15++;
                            }
                            int iMax7 = Math.max(this.f1062V, iMax5);
                            int iMax8 = Math.max(this.f1063W, iMax6);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour6 != dimensionBehaviour9 || m976D() >= iMax7) {
                                i4 = i;
                                z2 = z2;
                            } else {
                                m1053y0(iMax7);
                                this.f1045E[i] = dimensionBehaviour9;
                                i4 = z10 ? 1 : 0;
                                z2 = i4 == true ? 1 : 0;
                            }
                            if (dimensionBehaviour5 == dimensionBehaviour9 && m1038r() < iMax8) {
                                m1007b0(iMax8);
                                this.f1045E[z10 ? 1 : 0] = dimensionBehaviour9;
                                i4 = z10 ? 1 : 0;
                                z2 = i4 == true ? 1 : 0;
                            }
                        }
                        iMax = Math.max(this.f1062V, m976D());
                        z3 = z2;
                        if (iMax > m976D()) {
                            m1053y0(iMax);
                            this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                            i4 = z10 ? 1 : 0;
                            z3 = i4 == true ? 1 : 0;
                        }
                        iMax2 = Math.max(this.f1063W, m1038r());
                        z4 = z3;
                        if (iMax2 > m1038r()) {
                            m1007b0(iMax2);
                            this.f1045E[z10 ? 1 : 0] = ConstraintWidget.DimensionBehaviour.FIXED;
                            i4 = z10 ? 1 : 0;
                            z4 = i4 == true ? 1 : 0;
                        }
                        if (z4) {
                            dimensionBehaviour3 = this.f1045E[i];
                            dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour3 == dimensionBehaviour4 || iMax3 <= 0 || m976D() <= iMax3) {
                                r7 = z10 ? 1 : 0;
                                z4 = z4;
                            } else {
                                boolean z13 = z10 ? 1 : 0;
                                this.f1150P0 = z13;
                                this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                                m1053y0(iMax3);
                                i4 = z13 ? 1 : 0;
                                z4 = i4 == true ? 1 : 0;
                                r7 = z13;
                            }
                            if (this.f1045E[r7] == dimensionBehaviour4 || iMax4 <= 0 || m1038r() <= iMax4) {
                                i12 = i4;
                                z5 = z4;
                            } else {
                                this.f1151Q0 = r7;
                                this.f1045E[r7] = ConstraintWidget.DimensionBehaviour.FIXED;
                                m1007b0(iMax4);
                                z5 = true;
                                i12 = 1;
                            }
                        } else {
                            i12 = i4;
                            z5 = z4;
                        }
                        i11 = i13;
                        size = size;
                        z10 = true;
                        z11 = z5;
                    }
                    c = 2;
                    if (z7) {
                        i4 = i;
                    } else {
                        i4 = i;
                    }
                    iMax = Math.max(this.f1062V, m976D());
                    z3 = z2;
                    if (iMax > m976D()) {
                        m1053y0(iMax);
                        this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                        i4 = z10 ? 1 : 0;
                        z3 = i4 == true ? 1 : 0;
                    }
                    iMax2 = Math.max(this.f1063W, m1038r());
                    z4 = z3;
                    if (iMax2 > m1038r()) {
                        m1007b0(iMax2);
                        this.f1045E[z10 ? 1 : 0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        i4 = z10 ? 1 : 0;
                        z4 = i4 == true ? 1 : 0;
                    }
                    if (z4) {
                        dimensionBehaviour3 = this.f1045E[i];
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                            r7 = z10 ? 1 : 0;
                            z4 = z4;
                        } else {
                            r7 = z10 ? 1 : 0;
                            z4 = z4;
                        }
                        if (this.f1045E[r7] == dimensionBehaviour4) {
                            i12 = i4;
                            z5 = z4;
                        } else {
                            i12 = i4;
                            z5 = z4;
                        }
                    } else {
                        i12 = i4;
                        z5 = z4;
                    }
                    i11 = i13;
                    size = size;
                    z10 = true;
                    z11 = z5;
                }
                boolean z14 = z11 ? 1 : 0;
                i2 = size;
                this.f1142H0.get(i9).m1103g();
                z8 = z14 ? 1 : 0;
            }
            i9++;
            i7 = i;
            size = i2;
            i8 = 32;
            z6 = true;
            z8 = z8;
        }
        this.f89632v0 = arrayList;
        if (this.f1046F != null) {
            int iMax9 = Math.max(this.f1062V, m976D());
            int iMax10 = Math.max(this.f1063W, m1038r());
            this.f1155y0.m1127a(this);
            m1053y0(iMax9 + this.f1156z0 + this.f1136B0);
            m1007b0(iMax10 + this.f1135A0 + this.f1137C0);
        } else {
            this.f1051K = i5;
            this.f1052L = i6;
        }
        if (z8) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f1045E;
            dimensionBehaviourArr2[i] = dimensionBehaviour6;
            dimensionBehaviourArr2[1] = dimensionBehaviour5;
        }
        mo997T(this.f1154x0.m954x());
        if (this == m115105J0()) {
            mo981F0();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m1077N0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m1079P0(constraintWidget);
        } else if (i == 1) {
            m1080Q0(constraintWidget);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m1078O0(C0207c c0207c) {
        mo1006b(c0207c);
        int size = this.f89632v0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f89632v0.get(i);
            if (constraintWidget instanceof C0214e) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1045E;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour3) {
                    constraintWidget.m1017g0(ConstraintWidget.DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    constraintWidget.m1045u0(ConstraintWidget.DimensionBehaviour.FIXED);
                }
                constraintWidget.mo1006b(c0207c);
                if (dimensionBehaviour == dimensionBehaviour3) {
                    constraintWidget.m1017g0(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    constraintWidget.m1045u0(dimensionBehaviour2);
                }
            } else {
                C0217h.m1111c(this, c0207c, constraintWidget);
                constraintWidget.mo1006b(c0207c);
            }
        }
        if (this.f1138D0 > 0) {
            C0212c.m1071a(this, c0207c, 0);
        }
        if (this.f1139E0 > 0) {
            C0212c.m1071a(this, c0207c, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m1079P0(ConstraintWidget constraintWidget) {
        int i = this.f1138D0 + 1;
        C0213d[] c0213dArr = this.f1141G0;
        if (i >= c0213dArr.length) {
            this.f1141G0 = (C0213d[]) Arrays.copyOf(c0213dArr, c0213dArr.length * 2);
        }
        this.f1141G0[this.f1138D0] = new C0213d(constraintWidget, 0, m1085V0());
        this.f1138D0++;
    }

    @Override // p149l.e6q0, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: Q */
    public void mo994Q() {
        this.f1154x0.m930F();
        this.f1156z0 = 0;
        this.f1136B0 = 0;
        this.f1135A0 = 0;
        this.f1137C0 = 0;
        this.f1142H0.clear();
        this.f1149O0 = false;
        super.mo994Q();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m1080Q0(ConstraintWidget constraintWidget) {
        int i = this.f1139E0 + 1;
        C0213d[] c0213dArr = this.f1140F0;
        if (i >= c0213dArr.length) {
            this.f1140F0 = (C0213d[]) Arrays.copyOf(c0213dArr, c0213dArr.length * 2);
        }
        this.f1140F0[this.f1139E0] = new C0213d(constraintWidget, 1, m1085V0());
        this.f1139E0++;
    }

    /* JADX INFO: renamed from: R0 */
    public void m1081R0(s100 s100Var) {
        this.f1154x0.m953w(s100Var);
    }

    /* JADX INFO: renamed from: S0 */
    public int m1082S0() {
        return this.f1148N0;
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m1083T0() {
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m1084U0() {
        return this.f1151Q0;
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m1085V0() {
        return this.f1153w0;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m1086W0() {
        return this.f1150P0;
    }

    /* JADX INFO: renamed from: X0 */
    public void m1087X0() {
        if (!m1088Y0(8)) {
            mo1010d(this.f1148N0);
        }
        m1095f1();
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m1088Y0(int i) {
        return (this.f1148N0 & i) == i;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m1089Z0(int i, int i2) {
        ovc0 ovc0Var;
        ovc0 ovc0Var2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f1045E[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && (ovc0Var2 = this.f1071c) != null) {
            ovc0Var2.m166169h(i);
        }
        if (this.f1045E[1] == dimensionBehaviour2 || (ovc0Var = this.f1073d) == null) {
            return;
        }
        ovc0Var.m166169h(i2);
    }

    /* JADX INFO: renamed from: a1 */
    public void m1090a1() {
        int size = this.f89632v0.size();
        mo996S();
        for (int i = 0; i < size; i++) {
            this.f89632v0.get(i).mo996S();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m1091b1() {
        m1090a1();
        mo1010d(this.f1148N0);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1092c1() {
        this.f1138D0 = 0;
        this.f1139E0 = 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: d */
    public void mo1010d(int i) {
        super.mo1010d(i);
        int size = this.f89632v0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f89632v0.get(i2).mo1010d(i);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m1093d1(int i) {
        this.f1148N0 = i;
    }

    /* JADX INFO: renamed from: e1 */
    public void m1094e1(boolean z) {
        this.f1153w0 = z;
    }

    /* JADX INFO: renamed from: f1 */
    public void m1095f1() {
        C0218i c0218iM961f = mo1018h(ConstraintAnchor.Type.LEFT).m961f();
        C0218i c0218iM961f2 = mo1018h(ConstraintAnchor.Type.TOP).m961f();
        c0218iM961f.m1121l(null, 0.0f);
        c0218iM961f2.m1121l(null, 0.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public void m1096g1(C0207c c0207c, boolean[] zArr) {
        zArr[2] = false;
        mo983G0(c0207c);
        int size = this.f89632v0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f89632v0.get(i);
            constraintWidget.mo983G0(c0207c);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.f1045E[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget.m976D() < constraintWidget.m980F()) {
                zArr[2] = true;
            }
            if (constraintWidget.f1045E[1] == dimensionBehaviour2 && constraintWidget.m1038r() < constraintWidget.m978E()) {
                zArr[2] = true;
            }
        }
    }
}
