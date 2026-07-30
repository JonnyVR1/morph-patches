package p003l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hih0 {

    /* JADX INFO: renamed from: a */
    public NinePatchDrawable f4213a;

    /* JADX INFO: renamed from: b */
    public Rect f4214b;

    /* JADX INFO: renamed from: a */
    public void m4967a(Drawable drawable) {
        this.f4213a = (NinePatchDrawable) drawable;
        Rect rect = new Rect();
        this.f4214b = rect;
        this.f4213a.getPadding(rect);
    }
}
