package p149l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class gj1 extends uzi implements Runnable {

    /* JADX INFO: renamed from: e */
    public int f102992e;

    /* JADX INFO: renamed from: f */
    public boolean f102993f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public float f102994g;

    /* JADX INFO: renamed from: h */
    public boolean f102995h;

    public gj1(Drawable drawable, int i, boolean z) {
        super((Drawable) rf80.m179116g(drawable));
        this.f102994g = 0.0f;
        this.f102995h = false;
        this.f102992e = i;
        this.f102993f = z;
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.f102994g;
        if (!this.f102993f) {
            f = 360.0f - f;
        }
        canvas.rotate(f, i2 + (i3 / 2), i5 + (i6 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        m126422t();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f102995h = false;
        this.f102994g += m126421s();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    public final int m126421s() {
        return (int) ((20.0f / this.f102992e) * 360.0f);
    }

    /* JADX INFO: renamed from: t */
    public final void m126422t() {
        if (this.f102995h) {
            return;
        }
        this.f102995h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    public gj1(Drawable drawable, int i) {
        this(drawable, i, true);
    }
}
