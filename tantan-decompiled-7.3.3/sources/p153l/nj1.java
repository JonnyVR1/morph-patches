package p153l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class nj1 extends p2j implements Runnable {

    /* JADX INFO: renamed from: e */
    public int f142255e;

    /* JADX INFO: renamed from: f */
    public boolean f142256f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public float f142257g;

    /* JADX INFO: renamed from: h */
    public boolean f142258h;

    public nj1(Drawable drawable, int i, boolean z) {
        super((Drawable) wn80.m207182g(drawable));
        this.f142257g = 0.0f;
        this.f142258h = false;
        this.f142255e = i;
        this.f142256f = z;
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.f142257g;
        if (!this.f142256f) {
            f = 360.0f - f;
        }
        canvas.rotate(f, i2 + (i3 / 2), i5 + (i6 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        m163402t();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f142258h = false;
        this.f142257g += m163401s();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    public final int m163401s() {
        return (int) ((20.0f / this.f142255e) * 360.0f);
    }

    /* JADX INFO: renamed from: t */
    public final void m163402t() {
        if (this.f142258h) {
            return;
        }
        this.f142258h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    public nj1(Drawable drawable, int i) {
        this(drawable, i, true);
    }
}
