package p153l;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes.dex */
public class knd0 extends jnd0 {
    public knd0(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // p153l.jnd0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (i9j.m139099d()) {
            i9j.m139097a("RoundedNinePatchDrawable#draw");
        }
        if (!mo105372j()) {
            super.draw(canvas);
            if (i9j.m139099d()) {
                i9j.m139098b();
                return;
            }
            return;
        }
        mo105373o();
        m146237k();
        canvas.clipPath(this.f121810e);
        super.draw(canvas);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }
}
