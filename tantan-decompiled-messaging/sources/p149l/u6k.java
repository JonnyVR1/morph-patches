package p149l;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class u6k {
    /* JADX INFO: renamed from: a */
    public static void m191980a(int i, int i2, int i3, @NonNull Rect rect, @NonNull Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    /* JADX INFO: renamed from: b */
    public static int m191981b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
