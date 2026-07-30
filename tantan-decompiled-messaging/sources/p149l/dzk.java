package p149l;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class dzk extends ConstraintWidget {

    /* JADX INFO: renamed from: v0 */
    public ConstraintWidget[] f88488v0 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: w0 */
    public int f88489w0 = 0;

    /* JADX INFO: renamed from: I0 */
    public void m114127I0(ConstraintWidget constraintWidget) {
        int i = this.f88489w0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f88488v0;
        if (i > constraintWidgetArr.length) {
            this.f88488v0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f88488v0;
        int i2 = this.f88489w0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.f88489w0 = i2 + 1;
    }

    /* JADX INFO: renamed from: J0 */
    public void m114128J0() {
        this.f88489w0 = 0;
    }
}
