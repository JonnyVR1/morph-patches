package p153l;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class pnl0 extends mnl0 {

    /* JADX INFO: renamed from: d */
    public static boolean f153313d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f153314e = true;

    @Override // p153l.vnl0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo173071g(@NonNull View view, @NonNull Matrix matrix) {
        if (f153313d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f153313d = false;
            }
        }
    }

    @Override // p153l.vnl0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public void mo173072h(@NonNull View view, @NonNull Matrix matrix) {
        if (f153314e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f153314e = false;
            }
        }
    }
}
