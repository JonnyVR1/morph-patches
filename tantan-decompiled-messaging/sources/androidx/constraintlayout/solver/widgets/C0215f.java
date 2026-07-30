package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p149l.dzk;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.f */
/* JADX INFO: loaded from: classes.dex */
public class C0215f {

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

    public C0215f(List<ConstraintWidget> list, boolean z) {
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
    public void m1097a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            this.f1164h.add(constraintWidget);
        } else if (i == 1) {
            this.f1165i.add(constraintWidget);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<ConstraintWidget> m1098b(int i) {
        if (i == 0) {
            return this.f1162f;
        }
        if (i == 1) {
            return this.f1163g;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Set<ConstraintWidget> m1099c(int i) {
        if (i == 0) {
            return this.f1164h;
        }
        if (i == 1) {
            return this.f1165i;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public List<ConstraintWidget> m1100d() {
        if (!this.f1166j.isEmpty()) {
            return this.f1166j;
        }
        int size = this.f1157a.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f1157a.get(i);
            if (!constraintWidget.f1084i0) {
                m1101e((ArrayList) this.f1166j, constraintWidget);
            }
        }
        this.f1167k.clear();
        this.f1167k.addAll(this.f1157a);
        this.f1167k.removeAll(this.f1166j);
        return this.f1166j;
    }

    /* JADX INFO: renamed from: e */
    public final void m1101e(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget.f1088k0) {
            return;
        }
        arrayList.add(constraintWidget);
        constraintWidget.f1088k0 = true;
        if (constraintWidget.m989L()) {
            return;
        }
        if (constraintWidget instanceof dzk) {
            dzk dzkVar = (dzk) constraintWidget;
            int i = dzkVar.f88489w0;
            for (int i2 = 0; i2 < i; i2++) {
                m1101e(arrayList, dzkVar.f88488v0[i2]);
            }
        }
        int length = constraintWidget.f1043C.length;
        for (int i3 = 0; i3 < length; i3++) {
            ConstraintAnchor constraintAnchor = constraintWidget.f1043C[i3].f1032d;
            if (constraintAnchor != null && (constraintWidget2 = constraintAnchor.f1030b) != constraintWidget.m1044u()) {
                m1101e(arrayList, constraintWidget2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX INFO: renamed from: f */
    public final void m1102f(ConstraintWidget constraintWidget) {
        int iM976D;
        if (!constraintWidget.f1084i0 || constraintWidget.m989L()) {
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
                m1102f(constraintWidget2);
            }
            ConstraintAnchor.Type type = constraintAnchor.f1031c;
            if (type == ConstraintAnchor.Type.RIGHT) {
                ConstraintWidget constraintWidget3 = constraintAnchor.f1030b;
                iM976D = constraintWidget3.f1051K + constraintWidget3.m976D();
            } else if (type == ConstraintAnchor.Type.LEFT) {
                iM976D = constraintAnchor.f1030b.f1051K;
            } else {
                iM976D = 0;
            }
        } else {
            iM976D = 0;
        }
        int iM959d = z ? iM976D - constraintWidget.f1109w.m959d() : iM976D + constraintWidget.f1107u.m959d() + constraintWidget.m976D();
        constraintWidget.m1015f0(iM959d - constraintWidget.m976D(), iM959d);
        ConstraintAnchor constraintAnchor2 = constraintWidget.f1111y.f1032d;
        if (constraintAnchor2 != null) {
            ConstraintWidget constraintWidget4 = constraintAnchor2.f1030b;
            if (!constraintWidget4.f1086j0) {
                m1102f(constraintWidget4);
            }
            ConstraintWidget constraintWidget5 = constraintAnchor2.f1030b;
            int i = (constraintWidget5.f1052L + constraintWidget5.f1061U) - constraintWidget.f1061U;
            constraintWidget.m1043t0(i, constraintWidget.f1048H + i);
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
                m1102f(constraintWidget6);
            }
            ConstraintAnchor.Type type2 = constraintAnchor3.f1031c;
            if (type2 == ConstraintAnchor.Type.BOTTOM) {
                ConstraintWidget constraintWidget7 = constraintAnchor3.f1030b;
                iM959d = constraintWidget7.f1052L + constraintWidget7.m1038r();
            } else if (type2 == ConstraintAnchor.Type.TOP) {
                iM959d = constraintAnchor3.f1030b.f1052L;
            }
        }
        int iM959d2 = z2 ? iM959d - constraintWidget.f1110x.m959d() : iM959d + constraintWidget.f1108v.m959d() + constraintWidget.m1038r();
        constraintWidget.m1043t0(iM959d2 - constraintWidget.m1038r(), iM959d2);
        constraintWidget.f1086j0 = true;
    }

    /* JADX INFO: renamed from: g */
    public void m1103g() {
        int size = this.f1167k.size();
        for (int i = 0; i < size; i++) {
            m1102f(this.f1167k.get(i));
        }
    }

    public C0215f(List<ConstraintWidget> list) {
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
