package p153l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class oqh0 {

    /* JADX INFO: renamed from: a */
    public NinePatchDrawable f148595a;

    /* JADX INFO: renamed from: b */
    public Rect f148596b;

    /* JADX INFO: renamed from: a */
    public void m168814a(Drawable drawable) {
        this.f148595a = (NinePatchDrawable) drawable;
        Rect rect = new Rect();
        this.f148596b = rect;
        this.f148595a.getPadding(rect);
    }
}
