package p149l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class hih0 {

    /* JADX INFO: renamed from: a */
    public NinePatchDrawable f107930a;

    /* JADX INFO: renamed from: b */
    public Rect f107931b;

    /* JADX INFO: renamed from: a */
    public void m131258a(Drawable drawable) {
        this.f107930a = (NinePatchDrawable) drawable;
        Rect rect = new Rect();
        this.f107931b = rect;
        this.f107930a.getPadding(rect);
    }
}
