package p153l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class a660 extends p2j {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Matrix f68674e;

    /* JADX INFO: renamed from: f */
    public int f68675f;

    /* JADX INFO: renamed from: g */
    public int f68676g;

    /* JADX INFO: renamed from: h */
    public final Matrix f68677h;

    /* JADX INFO: renamed from: i */
    public final RectF f68678i;

    public a660(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f68677h = new Matrix();
        this.f68678i = new RectF();
        this.f68674e = new Matrix();
        this.f68675f = i - (i % 90);
        this.f68676g = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f68675f <= 0 && ((i = this.f68676g) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f68674e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f68676g;
        return (i == 5 || i == 7 || this.f68675f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f68676g;
        return (i == 5 || i == 7 || this.f68675f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // p153l.p2j, p153l.rgj0
    /* JADX INFO: renamed from: j */
    public void mo96260j(Matrix matrix) {
        m170352o(matrix);
        if (this.f68674e.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f68674e);
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i2 = this.f68675f;
        if (i2 <= 0 && ((i = this.f68676g) == 0 || i == 1)) {
            current.setBounds(rect);
            return;
        }
        int i3 = this.f68676g;
        if (i3 == 2) {
            this.f68674e.setScale(-1.0f, 1.0f);
        } else if (i3 == 7) {
            this.f68674e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f68674e.postScale(-1.0f, 1.0f);
        } else if (i3 != 4) {
            Matrix matrix = this.f68674e;
            if (i3 != 5) {
                matrix.setRotate(i2, rect.centerX(), rect.centerY());
            } else {
                matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.f68674e.postScale(1.0f, -1.0f);
            }
        } else {
            this.f68674e.setScale(1.0f, -1.0f);
        }
        this.f68677h.reset();
        this.f68674e.invert(this.f68677h);
        this.f68678i.set(rect);
        this.f68677h.mapRect(this.f68678i);
        RectF rectF = this.f68678i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
