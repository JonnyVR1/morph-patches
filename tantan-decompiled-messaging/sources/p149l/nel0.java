package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(22)
public class nel0 extends lel0 {

    /* JADX INFO: renamed from: f */
    public static boolean f138627f = true;

    @Override // p149l.rel0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo159119d(@NonNull View view, int i, int i2, int i3, int i4) {
        if (f138627f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f138627f = false;
            }
        }
    }
}
