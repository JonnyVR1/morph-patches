package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0208c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p153l.jfq0;
import p153l.pa00;
import p153l.r3d0;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.e */
/* JADX INFO: loaded from: classes.dex */
public class C0215e extends jfq0 {

    /* JADX INFO: renamed from: A0 */
    public int f1135A0;

    /* JADX INFO: renamed from: B0 */
    public int f1136B0;

    /* JADX INFO: renamed from: C0 */
    public int f1137C0;

    /* JADX INFO: renamed from: y0 */
    public C0220j f1155y0;

    /* JADX INFO: renamed from: z0 */
    public int f1156z0;

    /* JADX INFO: renamed from: w0 */
    public boolean f1153w0 = false;

    /* JADX INFO: renamed from: x0 */
    public C0208c f1154x0 = new C0208c();

    /* JADX INFO: renamed from: D0 */
    public int f1138D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public int f1139E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public C0214d[] f1140F0 = new C0214d[4];

    /* JADX INFO: renamed from: G0 */
    public C0214d[] f1141G0 = new C0214d[4];

    /* JADX INFO: renamed from: H0 */
    public List<C0216f> f1142H0 = new ArrayList();

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
    @Override // p153l.jfq0
    /* JADX INFO: renamed from: K0 */
    public void mo1077K0() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean zM1079O0;
        C0208c c0208c;
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
        int iMax3 = Math.max(0, m977D());
        int iMax4 = Math.max(0, m1039r());
        this.f1150P0 = false;
        this.f1151Q0 = false;
        if (this.f1046F != null) {
            if (this.f1155y0 == null) {
                this.f1155y0 = new C0220j(this);
            }
            this.f1155y0.m1129b(this);
            m976C0(this.f1156z0);
            m978D0(this.f1135A0);
            m996R();
            mo998T(this.f1154x0.m955x());
        } else {
            this.f1051K = 0;
            this.f1052L = 0;
        }
        int i8 = 32;
        boolean z6 = true;
        if (this.f1148N0 != 0) {
            if (!m1089Y0(8)) {
                m1091a1();
            }
            if (!m1089Y0(32)) {
                m1088X0();
            }
            this.f1154x0.f1019g = true;
        } else {
            this.f1154x0.f1019g = false;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f1045E;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
        m1093c1();
        if (this.f1142H0.size() == 0) {
            this.f1142H0.clear();
            this.f1142H0.add(0, new C0216f(this.f120612v0));
        }
        int size = this.f1142H0.size();
        ArrayList<ConstraintWidget> arrayList = this.f120612v0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s = m1041s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z7 = dimensionBehaviourM1041s == dimensionBehaviour7 || m973B() == dimensionBehaviour7;
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
                if (m1089Y0(i8)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s2 = m1041s();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviourM1041s2 == dimensionBehaviour8 && m973B() == dimensionBehaviour8) {
                        this.f120612v0 = (ArrayList) this.f1142H0.get(i9).m1101d();
                    } else {
                        this.f120612v0 = (ArrayList) this.f1142H0.get(i9).f1157a;
                    }
                }
                m1093c1();
                int size2 = this.f120612v0.size();
                int i10 = i;
                while (i10 < size2) {
                    boolean z9 = z6;
                    ConstraintWidget constraintWidget2 = this.f120612v0.get(i10);
                    if (constraintWidget2 instanceof jfq0) {
                        ((jfq0) constraintWidget2).mo1077K0();
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
                        this.f1154x0.m931F();
                        m1093c1();
                        m1017g(this.f1154x0);
                        int i14 = i;
                        while (i14 < size2) {
                            boolean z12 = z11;
                            try {
                                this.f120612v0.get(i14).m1017g(this.f1154x0);
                                i14++;
                                z11 = z12 ? 1 : 0;
                            } catch (Exception e) {
                                e = e;
                                z = z12;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                zM1079O0 = i12 == true ? 1 : 0;
                                z2 = z;
                                c0208c = this.f1154x0;
                                if (zM1079O0) {
                                    m1097g1(c0208c, C0218h.f1178a);
                                } else {
                                    mo984G0(c0208c);
                                    i3 = i;
                                    while (true) {
                                        if (i3 < size2) {
                                            constraintWidget = this.f120612v0.get(i3);
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
                                    iMax = Math.max(this.f1062V, m977D());
                                    z3 = z2;
                                    if (iMax > m977D()) {
                                        m1054y0(iMax);
                                        this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        i4 = z10 ? 1 : 0;
                                        z3 = i4 == true ? 1 : 0;
                                    }
                                    iMax2 = Math.max(this.f1063W, m1039r());
                                    z4 = z3;
                                    if (iMax2 > m1039r()) {
                                        m1008b0(iMax2);
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
                                iMax = Math.max(this.f1062V, m977D());
                                z3 = z2;
                                if (iMax > m977D()) {
                                    m1054y0(iMax);
                                    this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    i4 = z10 ? 1 : 0;
                                    z3 = i4 == true ? 1 : 0;
                                }
                                iMax2 = Math.max(this.f1063W, m1039r());
                                z4 = z3;
                                if (iMax2 > m1039r()) {
                                    m1008b0(iMax2);
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
                        zM1079O0 = m1079O0(this.f1154x0);
                        if (zM1079O0) {
                            this.f1154x0.m927B();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z = z11 ? 1 : 0;
                    }
                    c0208c = this.f1154x0;
                    if (zM1079O0) {
                        m1097g1(c0208c, C0218h.f1178a);
                    } else {
                        mo984G0(c0208c);
                        i3 = i;
                        while (true) {
                            if (i3 < size2) {
                                constraintWidget = this.f120612v0.get(i3);
                                dimensionBehaviour = constraintWidget.f1045E[i];
                                c = 2;
                                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.m977D() < constraintWidget.m981F()) {
                                    C0218h.f1178a[2] = z10;
                                    break;
                                } else {
                                    if (constraintWidget.f1045E[z10 ? 1 : 0] != dimensionBehaviour2 && constraintWidget.m1039r() < constraintWidget.m979E()) {
                                        C0218h.f1178a[2] = z10;
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        }
                        if (z7 || i13 >= 8 || !C0218h.f1178a[c]) {
                            i4 = i;
                        } else {
                            int i15 = i;
                            int iMax5 = i15;
                            int iMax6 = iMax5;
                            while (i15 < size2) {
                                ConstraintWidget constraintWidget3 = this.f120612v0.get(i15);
                                iMax5 = Math.max(iMax5, constraintWidget3.f1051K + constraintWidget3.m977D());
                                iMax6 = Math.max(iMax6, constraintWidget3.f1052L + constraintWidget3.m1039r());
                                i15++;
                            }
                            int iMax7 = Math.max(this.f1062V, iMax5);
                            int iMax8 = Math.max(this.f1063W, iMax6);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour6 != dimensionBehaviour9 || m977D() >= iMax7) {
                                i4 = i;
                                z2 = z2;
                            } else {
                                m1054y0(iMax7);
                                this.f1045E[i] = dimensionBehaviour9;
                                i4 = z10 ? 1 : 0;
                                z2 = i4 == true ? 1 : 0;
                            }
                            if (dimensionBehaviour5 == dimensionBehaviour9 && m1039r() < iMax8) {
                                m1008b0(iMax8);
                                this.f1045E[z10 ? 1 : 0] = dimensionBehaviour9;
                                i4 = z10 ? 1 : 0;
                                z2 = i4 == true ? 1 : 0;
                            }
                        }
                        iMax = Math.max(this.f1062V, m977D());
                        z3 = z2;
                        if (iMax > m977D()) {
                            m1054y0(iMax);
                            this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                            i4 = z10 ? 1 : 0;
                            z3 = i4 == true ? 1 : 0;
                        }
                        iMax2 = Math.max(this.f1063W, m1039r());
                        z4 = z3;
                        if (iMax2 > m1039r()) {
                            m1008b0(iMax2);
                            this.f1045E[z10 ? 1 : 0] = ConstraintWidget.DimensionBehaviour.FIXED;
                            i4 = z10 ? 1 : 0;
                            z4 = i4 == true ? 1 : 0;
                        }
                        if (z4) {
                            dimensionBehaviour3 = this.f1045E[i];
                            dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour3 == dimensionBehaviour4 || iMax3 <= 0 || m977D() <= iMax3) {
                                r7 = z10 ? 1 : 0;
                                z4 = z4;
                            } else {
                                boolean z13 = z10 ? 1 : 0;
                                this.f1150P0 = z13;
                                this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                                m1054y0(iMax3);
                                i4 = z13 ? 1 : 0;
                                z4 = i4 == true ? 1 : 0;
                                r7 = z13;
                            }
                            if (this.f1045E[r7] == dimensionBehaviour4 || iMax4 <= 0 || m1039r() <= iMax4) {
                                i12 = i4;
                                z5 = z4;
                            } else {
                                this.f1151Q0 = r7;
                                this.f1045E[r7] = ConstraintWidget.DimensionBehaviour.FIXED;
                                m1008b0(iMax4);
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
                    iMax = Math.max(this.f1062V, m977D());
                    z3 = z2;
                    if (iMax > m977D()) {
                        m1054y0(iMax);
                        this.f1045E[i] = ConstraintWidget.DimensionBehaviour.FIXED;
                        i4 = z10 ? 1 : 0;
                        z3 = i4 == true ? 1 : 0;
                    }
                    iMax2 = Math.max(this.f1063W, m1039r());
                    z4 = z3;
                    if (iMax2 > m1039r()) {
                        m1008b0(iMax2);
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
                this.f1142H0.get(i9).m1104g();
                z8 = z14 ? 1 : 0;
            }
            i9++;
            i7 = i;
            size = i2;
            i8 = 32;
            z6 = true;
            z8 = z8;
        }
        this.f120612v0 = arrayList;
        if (this.f1046F != null) {
            int iMax9 = Math.max(this.f1062V, m977D());
            int iMax10 = Math.max(this.f1063W, m1039r());
            this.f1155y0.m1128a(this);
            m1054y0(iMax9 + this.f1156z0 + this.f1136B0);
            m1008b0(iMax10 + this.f1135A0 + this.f1137C0);
        } else {
            this.f1051K = i5;
            this.f1052L = i6;
        }
        if (z8) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f1045E;
            dimensionBehaviourArr2[i] = dimensionBehaviour6;
            dimensionBehaviourArr2[1] = dimensionBehaviour5;
        }
        mo998T(this.f1154x0.m955x());
        if (this == m144700J0()) {
            mo982F0();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m1078N0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m1080P0(constraintWidget);
        } else if (i == 1) {
            m1081Q0(constraintWidget);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m1079O0(C0208c c0208c) {
        mo1007b(c0208c);
        int size = this.f120612v0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f120612v0.get(i);
            if (constraintWidget instanceof C0215e) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1045E;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour3) {
                    constraintWidget.m1018g0(ConstraintWidget.DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    constraintWidget.m1046u0(ConstraintWidget.DimensionBehaviour.FIXED);
                }
                constraintWidget.mo1007b(c0208c);
                if (dimensionBehaviour == dimensionBehaviour3) {
                    constraintWidget.m1018g0(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    constraintWidget.m1046u0(dimensionBehaviour2);
                }
            } else {
                C0218h.m1112c(this, c0208c, constraintWidget);
                constraintWidget.mo1007b(c0208c);
            }
        }
        if (this.f1138D0 > 0) {
            C0213c.m1072a(this, c0208c, 0);
        }
        if (this.f1139E0 > 0) {
            C0213c.m1072a(this, c0208c, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m1080P0(ConstraintWidget constraintWidget) {
        int i = this.f1138D0 + 1;
        C0214d[] c0214dArr = this.f1141G0;
        if (i >= c0214dArr.length) {
            this.f1141G0 = (C0214d[]) Arrays.copyOf(c0214dArr, c0214dArr.length * 2);
        }
        this.f1141G0[this.f1138D0] = new C0214d(constraintWidget, 0, m1086V0());
        this.f1138D0++;
    }

    @Override // p153l.jfq0, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: Q */
    public void mo995Q() {
        this.f1154x0.m931F();
        this.f1156z0 = 0;
        this.f1136B0 = 0;
        this.f1135A0 = 0;
        this.f1137C0 = 0;
        this.f1142H0.clear();
        this.f1149O0 = false;
        super.mo995Q();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m1081Q0(ConstraintWidget constraintWidget) {
        int i = this.f1139E0 + 1;
        C0214d[] c0214dArr = this.f1140F0;
        if (i >= c0214dArr.length) {
            this.f1140F0 = (C0214d[]) Arrays.copyOf(c0214dArr, c0214dArr.length * 2);
        }
        this.f1140F0[this.f1139E0] = new C0214d(constraintWidget, 1, m1086V0());
        this.f1139E0++;
    }

    /* JADX INFO: renamed from: R0 */
    public void m1082R0(pa00 pa00Var) {
        this.f1154x0.m954w(pa00Var);
    }

    /* JADX INFO: renamed from: S0 */
    public int m1083S0() {
        return this.f1148N0;
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m1084T0() {
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m1085U0() {
        return this.f1151Q0;
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m1086V0() {
        return this.f1153w0;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m1087W0() {
        return this.f1150P0;
    }

    /* JADX INFO: renamed from: X0 */
    public void m1088X0() {
        if (!m1089Y0(8)) {
            mo1011d(this.f1148N0);
        }
        m1096f1();
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m1089Y0(int i) {
        return (this.f1148N0 & i) == i;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m1090Z0(int i, int i2) {
        r3d0 r3d0Var;
        r3d0 r3d0Var2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f1045E[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && (r3d0Var2 = this.f1071c) != null) {
            r3d0Var2.m179602h(i);
        }
        if (this.f1045E[1] == dimensionBehaviour2 || (r3d0Var = this.f1073d) == null) {
            return;
        }
        r3d0Var.m179602h(i2);
    }

    /* JADX INFO: renamed from: a1 */
    public void m1091a1() {
        int size = this.f120612v0.size();
        mo997S();
        for (int i = 0; i < size; i++) {
            this.f120612v0.get(i).mo997S();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m1092b1() {
        m1091a1();
        mo1011d(this.f1148N0);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1093c1() {
        this.f1138D0 = 0;
        this.f1139E0 = 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: d */
    public void mo1011d(int i) {
        super.mo1011d(i);
        int size = this.f120612v0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f120612v0.get(i2).mo1011d(i);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m1094d1(int i) {
        this.f1148N0 = i;
    }

    /* JADX INFO: renamed from: e1 */
    public void m1095e1(boolean z) {
        this.f1153w0 = z;
    }

    /* JADX INFO: renamed from: f1 */
    public void m1096f1() {
        C0219i c0219iM962f = mo1019h(ConstraintAnchor.Type.LEFT).m962f();
        C0219i c0219iM962f2 = mo1019h(ConstraintAnchor.Type.TOP).m962f();
        c0219iM962f.m1122l(null, 0.0f);
        c0219iM962f2.m1122l(null, 0.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public void m1097g1(C0208c c0208c, boolean[] zArr) {
        zArr[2] = false;
        mo984G0(c0208c);
        int size = this.f120612v0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f120612v0.get(i);
            constraintWidget.mo984G0(c0208c);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.f1045E[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget.m977D() < constraintWidget.m981F()) {
                zArr[2] = true;
            }
            if (constraintWidget.f1045E[1] == dimensionBehaviour2 && constraintWidget.m1039r() < constraintWidget.m979E()) {
                zArr[2] = true;
            }
        }
    }
}
