package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p153l.t1l;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.f */
/* JADX INFO: loaded from: classes.dex */
public class C0216f {

    /* JADX INFO: renamed from: a */
    public List<ConstraintWidget> f1157a;

    /* JADX INFO: renamed from: b */
    public int f1158b;

    /* JADX INFO: renamed from: c */
    public int f1159c;

    /* JADX INFO: renamed from: d */
    public boolean f1160d;

    /* JADX INFO: renamed from: e */
    public final int[] f1161e;

    /* JADX INFO: renamed from: f */
    public List<ConstraintWidget> f1162f;

    /* JADX INFO: renamed from: g */
    public List<ConstraintWidget> f1163g;

    /* JADX INFO: renamed from: h */
    public HashSet<ConstraintWidget> f1164h;

    /* JADX INFO: renamed from: i */
    public HashSet<ConstraintWidget> f1165i;

    /* JADX INFO: renamed from: j */
    public List<ConstraintWidget> f1166j;

    /* JADX INFO: renamed from: k */
    public List<ConstraintWidget> f1167k;

    public C0216f(List<ConstraintWidget> list, boolean z) {
        this.f1158b = -1;
        this.f1159c = -1;
        this.f1160d = false;
        this.f1161e = new int[]{-1, -1};
        this.f1162f = new ArrayList();
        this.f1163g = new ArrayList();
        this.f1164h = new HashSet<>();
        this.f1165i = new HashSet<>();
        this.f1166j = new ArrayList();
        this.f1167k = new ArrayList();
        this.f1157a = list;
        this.f1160d = z;
    }

    /* JADX INFO: renamed from: a */
    public void m1098a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            this.f1164h.add(constraintWidget);
        } else if (i == 1) {
            this.f1165i.add(constraintWidget);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<ConstraintWidget> m1099b(int i) {
        if (i == 0) {
            return this.f1162f;
        }
        if (i == 1) {
            return this.f1163g;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Set<ConstraintWidget> m1100c(int i) {
        if (i == 0) {
            return this.f1164h;
        }
        if (i == 1) {
            return this.f1165i;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public List<ConstraintWidget> m1101d() {
        if (!this.f1166j.isEmpty()) {
            return this.f1166j;
        }
        int size = this.f1157a.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f1157a.get(i);
            if (!constraintWidget.f1084i0) {
                m1102e((ArrayList) this.f1166j, constraintWidget);
            }
        }
        this.f1167k.clear();
        this.f1167k.addAll(this.f1157a);
        this.f1167k.removeAll(this.f1166j);
        return this.f1166j;
    }

    /* JADX INFO: renamed from: e */
    public final void m1102e(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget.f1088k0) {
            return;
        }
        arrayList.add(constraintWidget);
        constraintWidget.f1088k0 = true;
        if (constraintWidget.m990L()) {
            return;
        }
        if (constraintWidget instanceof t1l) {
            t1l t1lVar = (t1l) constraintWidget;
            int i = t1lVar.f171682w0;
            for (int i2 = 0; i2 < i; i2++) {
                m1102e(arrayList, t1lVar.f171681v0[i2]);
            }
        }
        int length = constraintWidget.f1043C.length;
        for (int i3 = 0; i3 < length; i3++) {
            ConstraintAnchor constraintAnchor = constraintWidget.f1043C[i3].f1032d;
            if (constraintAnchor != null && (constraintWidget2 = constraintAnchor.f1030b) != constraintWidget.m1045u()) {
                m1102e(arrayList, constraintWidget2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX INFO: renamed from: f */
    public final void m1103f(ConstraintWidget constraintWidget) {
        int iM977D;
        if (!constraintWidget.f1084i0 || constraintWidget.m990L()) {
            return;
        }
        ConstraintAnchor constraintAnchor = constraintWidget.f1109w.f1032d;
        boolean z = constraintAnchor != null;
        if (!z) {
            constraintAnchor = constraintWidget.f1107u.f1032d;
        }
        if (constraintAnchor != null) {
            ConstraintWidget constraintWidget2 = constraintAnchor.f1030b;
            if (!constraintWidget2.f1086j0) {
                m1103f(constraintWidget2);
            }
            ConstraintAnchor.Type type = constraintAnchor.f1031c;
            if (type == ConstraintAnchor.Type.RIGHT) {
                ConstraintWidget constraintWidget3 = constraintAnchor.f1030b;
                iM977D = constraintWidget3.f1051K + constraintWidget3.m977D();
            } else if (type == ConstraintAnchor.Type.LEFT) {
                iM977D = constraintAnchor.f1030b.f1051K;
            } else {
                iM977D = 0;
            }
        } else {
            iM977D = 0;
        }
        int iM960d = z ? iM977D - constraintWidget.f1109w.m960d() : iM977D + constraintWidget.f1107u.m960d() + constraintWidget.m977D();
        constraintWidget.m1016f0(iM960d - constraintWidget.m977D(), iM960d);
        ConstraintAnchor constraintAnchor2 = constraintWidget.f1111y.f1032d;
        if (constraintAnchor2 != null) {
            ConstraintWidget constraintWidget4 = constraintAnchor2.f1030b;
            if (!constraintWidget4.f1086j0) {
                m1103f(constraintWidget4);
            }
            ConstraintWidget constraintWidget5 = constraintAnchor2.f1030b;
            int i = (constraintWidget5.f1052L + constraintWidget5.f1061U) - constraintWidget.f1061U;
            constraintWidget.m1044t0(i, constraintWidget.f1048H + i);
            constraintWidget.f1086j0 = true;
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f1110x.f1032d;
        boolean z2 = constraintAnchor3 != null;
        if (!z2) {
            constraintAnchor3 = constraintWidget.f1108v.f1032d;
        }
        if (constraintAnchor3 != null) {
            ConstraintWidget constraintWidget6 = constraintAnchor3.f1030b;
            if (!constraintWidget6.f1086j0) {
                m1103f(constraintWidget6);
            }
            ConstraintAnchor.Type type2 = constraintAnchor3.f1031c;
            if (type2 == ConstraintAnchor.Type.BOTTOM) {
                ConstraintWidget constraintWidget7 = constraintAnchor3.f1030b;
                iM960d = constraintWidget7.f1052L + constraintWidget7.m1039r();
            } else if (type2 == ConstraintAnchor.Type.TOP) {
                iM960d = constraintAnchor3.f1030b.f1052L;
            }
        }
        int iM960d2 = z2 ? iM960d - constraintWidget.f1110x.m960d() : iM960d + constraintWidget.f1108v.m960d() + constraintWidget.m1039r();
        constraintWidget.m1044t0(iM960d2 - constraintWidget.m1039r(), iM960d2);
        constraintWidget.f1086j0 = true;
    }

    /* JADX INFO: renamed from: g */
    public void m1104g() {
        int size = this.f1167k.size();
        for (int i = 0; i < size; i++) {
            m1103f(this.f1167k.get(i));
        }
    }

    public C0216f(List<ConstraintWidget> list) {
        this.f1158b = -1;
        this.f1159c = -1;
        this.f1160d = false;
        this.f1161e = new int[]{-1, -1};
        this.f1162f = new ArrayList();
        this.f1163g = new ArrayList();
        this.f1164h = new HashSet<>();
        this.f1165i = new HashSet<>();
        this.f1166j = new ArrayList();
        this.f1167k = new ArrayList();
        this.f1157a = list;
    }
}
