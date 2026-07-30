package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.j */
/* JADX INFO: loaded from: classes.dex */
public class C0219j {

    /* JADX INFO: renamed from: a */
    public int f1192a;

    /* JADX INFO: renamed from: b */
    public int f1193b;

    /* JADX INFO: renamed from: c */
    public int f1194c;

    /* JADX INFO: renamed from: d */
    public int f1195d;

    /* JADX INFO: renamed from: e */
    public ArrayList<a> f1196e = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public ConstraintAnchor f1197a;

        /* JADX INFO: renamed from: b */
        public ConstraintAnchor f1198b;

        /* JADX INFO: renamed from: c */
        public int f1199c;

        /* JADX INFO: renamed from: d */
        public ConstraintAnchor.Strength f1200d;

        /* JADX INFO: renamed from: e */
        public int f1201e;

        public a(ConstraintAnchor constraintAnchor) {
            this.f1197a = constraintAnchor;
            this.f1198b = constraintAnchor.m964i();
            this.f1199c = constraintAnchor.m959d();
            this.f1200d = constraintAnchor.m963h();
            this.f1201e = constraintAnchor.m958c();
        }

        /* JADX INFO: renamed from: a */
        public void m1129a(ConstraintWidget constraintWidget) {
            constraintWidget.mo1018h(this.f1197a.m965j()).m957b(this.f1198b, this.f1199c, this.f1200d, this.f1201e);
        }

        /* JADX INFO: renamed from: b */
        public void m1130b(ConstraintWidget constraintWidget) {
            ConstraintAnchor constraintAnchorMo1018h = constraintWidget.mo1018h(this.f1197a.m965j());
            this.f1197a = constraintAnchorMo1018h;
            if (constraintAnchorMo1018h != null) {
                this.f1198b = constraintAnchorMo1018h.m964i();
                this.f1199c = this.f1197a.m959d();
                this.f1200d = this.f1197a.m963h();
                this.f1201e = this.f1197a.m958c();
                return;
            }
            this.f1198b = null;
            this.f1199c = 0;
            this.f1200d = ConstraintAnchor.Strength.STRONG;
            this.f1201e = 0;
        }
    }

    public C0219j(ConstraintWidget constraintWidget) {
        this.f1192a = constraintWidget.m982G();
        this.f1193b = constraintWidget.m984H();
        this.f1194c = constraintWidget.m976D();
        this.f1195d = constraintWidget.m1038r();
        ArrayList<ConstraintAnchor> arrayListMo1020i = constraintWidget.mo1020i();
        int size = arrayListMo1020i.size();
        for (int i = 0; i < size; i++) {
            this.f1196e.add(new a(arrayListMo1020i.get(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1127a(ConstraintWidget constraintWidget) {
        constraintWidget.m975C0(this.f1192a);
        constraintWidget.m977D0(this.f1193b);
        constraintWidget.m1053y0(this.f1194c);
        constraintWidget.m1007b0(this.f1195d);
        int size = this.f1196e.size();
        for (int i = 0; i < size; i++) {
            this.f1196e.get(i).m1129a(constraintWidget);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1128b(ConstraintWidget constraintWidget) {
        this.f1192a = constraintWidget.m982G();
        this.f1193b = constraintWidget.m984H();
        this.f1194c = constraintWidget.m976D();
        this.f1195d = constraintWidget.m1038r();
        int size = this.f1196e.size();
        for (int i = 0; i < size; i++) {
            this.f1196e.get(i).m1130b(constraintWidget);
        }
    }
}
