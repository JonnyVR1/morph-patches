package p149l;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class lel0 extends iel0 {

    /* JADX INFO: renamed from: d */
    public static boolean f127722d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f127723e = true;

    @Override // p149l.rel0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo149583g(@NonNull View view, @NonNull Matrix matrix) {
        if (f127722d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f127722d = false;
            }
        }
    }

    @Override // p149l.rel0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public void mo149584h(@NonNull View view, @NonNull Matrix matrix) {
        if (f127723e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f127723e = false;
            }
        }
    }
}
