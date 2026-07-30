package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes.dex */
public interface uq0 extends gr0 {

    /* JADX INFO: renamed from: l.uq0$a */
    public interface InterfaceC20483a {
    }

    /* JADX INFO: renamed from: a */
    int mo191269a();

    /* JADX INFO: renamed from: b */
    int mo191270b();

    /* JADX INFO: renamed from: c */
    void mo191271c(Rect rect);

    void clear();

    /* JADX INFO: renamed from: d */
    void mo191272d(ColorFilter colorFilter);

    /* JADX INFO: renamed from: e */
    void mo191273e(InterfaceC20483a interfaceC20483a);

    /* JADX INFO: renamed from: h */
    void mo191274h(@IntRange(from = 0, to = 255) int i);

    /* JADX INFO: renamed from: i */
    boolean mo191275i(Drawable drawable, Canvas canvas, int i);
}
