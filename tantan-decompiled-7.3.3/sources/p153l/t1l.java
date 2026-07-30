package p153l;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class t1l extends ConstraintWidget {

    /* JADX INFO: renamed from: v0 */
    public ConstraintWidget[] f171681v0 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: w0 */
    public int f171682w0 = 0;

    /* JADX INFO: renamed from: I0 */
    public void m188925I0(ConstraintWidget constraintWidget) {
        int i = this.f171682w0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f171681v0;
        if (i > constraintWidgetArr.length) {
            this.f171681v0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f171681v0;
        int i2 = this.f171682w0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.f171682w0 = i2 + 1;
    }

    /* JADX INFO: renamed from: J0 */
    public void m188926J0() {
        this.f171682w0 = 0;
    }
}
