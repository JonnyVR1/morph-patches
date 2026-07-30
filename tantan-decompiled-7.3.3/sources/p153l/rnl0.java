package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(22)
public class rnl0 extends pnl0 {

    /* JADX INFO: renamed from: f */
    public static boolean f164085f = true;

    @Override // p153l.vnl0
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo182318d(@NonNull View view, int i, int i2, int i3, int i4) {
        if (f164085f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f164085f = false;
            }
        }
    }
}
