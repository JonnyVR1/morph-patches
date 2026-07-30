package p153l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public class tnl0 extends rnl0 {

    /* JADX INFO: renamed from: g */
    public static boolean f175295g = true;

    @Override // p153l.vnl0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public void mo191954f(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo191954f(view, i);
        } else if (f175295g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f175295g = false;
            }
        }
    }
}
