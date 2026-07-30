package p149l;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class qel0 extends pel0 {
    @Override // p149l.iel0, p149l.rel0
    /* JADX INFO: renamed from: b */
    public float mo135712b(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // p149l.nel0, p149l.rel0
    /* JADX INFO: renamed from: d */
    public void mo159119d(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p149l.iel0, p149l.rel0
    /* JADX INFO: renamed from: e */
    public void mo135714e(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p149l.pel0, p149l.rel0
    /* JADX INFO: renamed from: f */
    public void mo168523f(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p149l.lel0, p149l.rel0
    /* JADX INFO: renamed from: g */
    public void mo149583g(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p149l.lel0, p149l.rel0
    /* JADX INFO: renamed from: h */
    public void mo149584h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
