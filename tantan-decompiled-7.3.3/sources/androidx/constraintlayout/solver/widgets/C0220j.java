package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.j */
/* JADX INFO: loaded from: classes.dex */
public class C0220j {

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
            this.f1198b = constraintAnchor.m965i();
            this.f1199c = constraintAnchor.m960d();
            this.f1200d = constraintAnchor.m964h();
            this.f1201e = constraintAnchor.m959c();
        }

        /* JADX INFO: renamed from: a */
        public void m1130a(ConstraintWidget constraintWidget) {
            constraintWidget.mo1019h(this.f1197a.m966j()).m958b(this.f1198b, this.f1199c, this.f1200d, this.f1201e);
        }

        /* JADX INFO: renamed from: b */
        public void m1131b(ConstraintWidget constraintWidget) {
            ConstraintAnchor constraintAnchorMo1019h = constraintWidget.mo1019h(this.f1197a.m966j());
            this.f1197a = constraintAnchorMo1019h;
            if (constraintAnchorMo1019h != null) {
                this.f1198b = constraintAnchorMo1019h.m965i();
                this.f1199c = this.f1197a.m960d();
                this.f1200d = this.f1197a.m964h();
                this.f1201e = this.f1197a.m959c();
                return;
            }
            this.f1198b = null;
            this.f1199c = 0;
            this.f1200d = ConstraintAnchor.Strength.STRONG;
            this.f1201e = 0;
        }
    }

    public C0220j(ConstraintWidget constraintWidget) {
        this.f1192a = constraintWidget.m983G();
        this.f1193b = constraintWidget.m985H();
        this.f1194c = constraintWidget.m977D();
        this.f1195d = constraintWidget.m1039r();
        ArrayList<ConstraintAnchor> arrayListMo1021i = constraintWidget.mo1021i();
        int size = arrayListMo1021i.size();
        for (int i = 0; i < size; i++) {
            this.f1196e.add(new a(arrayListMo1021i.get(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1128a(ConstraintWidget constraintWidget) {
        constraintWidget.m976C0(this.f1192a);
        constraintWidget.m978D0(this.f1193b);
        constraintWidget.m1054y0(this.f1194c);
        constraintWidget.m1008b0(this.f1195d);
        int size = this.f1196e.size();
        for (int i = 0; i < size; i++) {
            this.f1196e.get(i).m1130a(constraintWidget);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1129b(ConstraintWidget constraintWidget) {
        this.f1192a = constraintWidget.m983G();
        this.f1193b = constraintWidget.m985H();
        this.f1194c = constraintWidget.m977D();
        this.f1195d = constraintWidget.m1039r();
        int size = this.f1196e.size();
        for (int i = 0; i < size; i++) {
            this.f1196e.get(i).m1131b(constraintWidget);
        }
    }
}
