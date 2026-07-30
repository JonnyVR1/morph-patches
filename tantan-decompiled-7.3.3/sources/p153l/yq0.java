package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes.dex */
public interface yq0 extends kr0 {

    /* JADX INFO: renamed from: l.yq0$a */
    public interface InterfaceC21665a {
    }

    /* JADX INFO: renamed from: a */
    int mo143067a();

    /* JADX INFO: renamed from: b */
    int mo143068b();

    /* JADX INFO: renamed from: c */
    void mo143069c(Rect rect);

    void clear();

    /* JADX INFO: renamed from: d */
    void mo143070d(ColorFilter colorFilter);

    /* JADX INFO: renamed from: e */
    void mo143071e(InterfaceC21665a interfaceC21665a);

    /* JADX INFO: renamed from: h */
    void mo143074h(@IntRange(from = 0, to = 255) int i);

    /* JADX INFO: renamed from: i */
    boolean mo99580i(Drawable drawable, Canvas canvas, int i);
}
