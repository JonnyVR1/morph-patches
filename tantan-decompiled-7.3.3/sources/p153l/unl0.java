package p153l;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class unl0 extends tnl0 {
    @Override // p153l.mnl0, p153l.vnl0
    /* JADX INFO: renamed from: b */
    public float mo159189b(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // p153l.rnl0, p153l.vnl0
    /* JADX INFO: renamed from: d */
    public void mo182318d(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p153l.mnl0, p153l.vnl0
    /* JADX INFO: renamed from: e */
    public void mo159191e(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p153l.tnl0, p153l.vnl0
    /* JADX INFO: renamed from: f */
    public void mo191954f(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p153l.pnl0, p153l.vnl0
    /* JADX INFO: renamed from: g */
    public void mo173071g(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p153l.pnl0, p153l.vnl0
    /* JADX INFO: renamed from: h */
    public void mo173072h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
