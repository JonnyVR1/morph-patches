package p149l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public class pel0 extends nel0 {

    /* JADX INFO: renamed from: g */
    public static boolean f148456g = true;

    @Override // p149l.rel0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public void mo168523f(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo168523f(view, i);
        } else if (f148456g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f148456g = false;
            }
        }
    }
}
