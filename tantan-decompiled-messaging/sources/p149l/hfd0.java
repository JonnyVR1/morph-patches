package p149l;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes.dex */
public class hfd0 extends gfd0 {
    public hfd0(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // p149l.gfd0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (o6j.m162852d()) {
            o6j.m162850a("RoundedNinePatchDrawable#draw");
        }
        if (!mo125885j()) {
            super.draw(canvas);
            if (o6j.m162852d()) {
                o6j.m162851b();
                return;
            }
            return;
        }
        mo125888o();
        m125886k();
        canvas.clipPath(this.f102366e);
        super.draw(canvas);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }
}
