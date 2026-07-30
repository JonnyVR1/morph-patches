package p153l;

import androidx.constraintlayout.solver.widgets.C0215e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class jfq0 extends ConstraintWidget {

    /* JADX INFO: renamed from: v0 */
    public ArrayList<ConstraintWidget> f120612v0 = new ArrayList<>();

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: F0 */
    public void mo982F0() {
        super.mo982F0();
        ArrayList<ConstraintWidget> arrayList = this.f120612v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f120612v0.get(i);
            constraintWidget.mo1032n0(m1035p(), m1037q());
            if (!(constraintWidget instanceof C0215e)) {
                constraintWidget.mo982F0();
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m144699I0(ConstraintWidget constraintWidget) {
        this.f120612v0.add(constraintWidget);
        if (constraintWidget.m1045u() != null) {
            ((jfq0) constraintWidget.m1045u()).m144701L0(constraintWidget);
        }
        constraintWidget.m1036p0(this);
    }

    /* JADX INFO: renamed from: J0 */
    public C0215e m144700J0() {
        ConstraintWidget constraintWidgetM1045u = m1045u();
        C0215e c0215e = this instanceof C0215e ? (C0215e) this : null;
        while (constraintWidgetM1045u != null) {
            ConstraintWidget constraintWidgetM1045u2 = constraintWidgetM1045u.m1045u();
            if (constraintWidgetM1045u instanceof C0215e) {
                c0215e = (C0215e) constraintWidgetM1045u;
            }
            constraintWidgetM1045u = constraintWidgetM1045u2;
        }
        return c0215e;
    }

    /* JADX INFO: renamed from: K0 */
    public void mo1077K0() {
        mo982F0();
        ArrayList<ConstraintWidget> arrayList = this.f120612v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f120612v0.get(i);
            if (constraintWidget instanceof jfq0) {
                ((jfq0) constraintWidget).mo1077K0();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m144701L0(ConstraintWidget constraintWidget) {
        this.f120612v0.remove(constraintWidget);
        constraintWidget.m1036p0(null);
    }

    /* JADX INFO: renamed from: M0 */
    public void m144702M0() {
        this.f120612v0.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: Q */
    public void mo995Q() {
        this.f120612v0.clear();
        super.mo995Q();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: T */
    public void mo998T(wx3 wx3Var) {
        super.mo998T(wx3Var);
        int size = this.f120612v0.size();
        for (int i = 0; i < size; i++) {
            this.f120612v0.get(i).mo998T(wx3Var);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* JADX INFO: renamed from: n0 */
    public void mo1032n0(int i, int i2) {
        super.mo1032n0(i, i2);
        int size = this.f120612v0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f120612v0.get(i3).mo1032n0(m1055z(), m971A());
        }
    }
}
