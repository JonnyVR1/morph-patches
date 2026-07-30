package p149l;

import androidx.constraintlayout.solver.widgets.C0214e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e6q0 extends ConstraintWidget {

    /* JADX INFO: renamed from: v0 */
    public ArrayList<ConstraintWidget> f89632v0 = new ArrayList<>();

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: F0 */
    public void mo981F0() {
        super.mo981F0();
        ArrayList<ConstraintWidget> arrayList = this.f89632v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f89632v0.get(i);
            constraintWidget.mo1031n0(m1034p(), m1036q());
            if (!(constraintWidget instanceof C0214e)) {
                constraintWidget.mo981F0();
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m115104I0(ConstraintWidget constraintWidget) {
        this.f89632v0.add(constraintWidget);
        if (constraintWidget.m1044u() != null) {
            ((e6q0) constraintWidget.m1044u()).m115106L0(constraintWidget);
        }
        constraintWidget.m1035p0(this);
    }

    /* JADX INFO: renamed from: J0 */
    public C0214e m115105J0() {
        ConstraintWidget constraintWidgetM1044u = m1044u();
        C0214e c0214e = this instanceof C0214e ? (C0214e) this : null;
        while (constraintWidgetM1044u != null) {
            ConstraintWidget constraintWidgetM1044u2 = constraintWidgetM1044u.m1044u();
            if (constraintWidgetM1044u instanceof C0214e) {
                c0214e = (C0214e) constraintWidgetM1044u;
            }
            constraintWidgetM1044u = constraintWidgetM1044u2;
        }
        return c0214e;
    }

    /* JADX INFO: renamed from: K0 */
    public void mo1076K0() {
        mo981F0();
        ArrayList<ConstraintWidget> arrayList = this.f89632v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f89632v0.get(i);
            if (constraintWidget instanceof e6q0) {
                ((e6q0) constraintWidget).mo1076K0();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m115106L0(ConstraintWidget constraintWidget) {
        this.f89632v0.remove(constraintWidget);
        constraintWidget.m1035p0(null);
    }

    /* JADX INFO: renamed from: M0 */
    public void m115107M0() {
        this.f89632v0.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: Q */
    public void mo994Q() {
        this.f89632v0.clear();
        super.mo994Q();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: T */
    public void mo997T(xw3 xw3Var) {
        super.mo997T(xw3Var);
        int size = this.f89632v0.size();
        for (int i = 0; i < size; i++) {
            this.f89632v0.get(i).mo997T(xw3Var);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: n0 */
    public void mo1031n0(int i, int i2) {
        super.mo1031n0(i, i2);
        int size = this.f89632v0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f89632v0.get(i3).mo1031n0(m1054z(), m970A());
        }
    }
}
