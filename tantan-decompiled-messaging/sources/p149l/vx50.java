package p149l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class vx50 extends uzi {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Matrix f183421e;

    /* JADX INFO: renamed from: f */
    public int f183422f;

    /* JADX INFO: renamed from: g */
    public int f183423g;

    /* JADX INFO: renamed from: h */
    public final Matrix f183424h;

    /* JADX INFO: renamed from: i */
    public final RectF f183425i;

    public vx50(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f183424h = new Matrix();
        this.f183425i = new RectF();
        this.f183421e = new Matrix();
        this.f183422f = i - (i % 90);
        this.f183423g = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f183422f <= 0 && ((i = this.f183423g) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f183421e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f183423g;
        return (i == 5 || i == 7 || this.f183422f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f183423g;
        return (i == 5 || i == 7 || this.f183422f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // p149l.uzi, p149l.n7j0
    /* JADX INFO: renamed from: j */
    public void mo158146j(Matrix matrix) {
        m196418o(matrix);
        if (this.f183421e.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f183421e);
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i2 = this.f183422f;
        if (i2 <= 0 && ((i = this.f183423g) == 0 || i == 1)) {
            current.setBounds(rect);
            return;
        }
        int i3 = this.f183423g;
        if (i3 == 2) {
            this.f183421e.setScale(-1.0f, 1.0f);
        } else if (i3 == 7) {
            this.f183421e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f183421e.postScale(-1.0f, 1.0f);
        } else if (i3 != 4) {
            Matrix matrix = this.f183421e;
            if (i3 != 5) {
                matrix.setRotate(i2, rect.centerX(), rect.centerY());
            } else {
                matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.f183421e.postScale(1.0f, -1.0f);
            }
        } else {
            this.f183421e.setScale(1.0f, -1.0f);
        }
        this.f183424h.reset();
        this.f183421e.invert(this.f183424h);
        this.f183425i.set(rect);
        this.f183424h.mapRect(this.f183425i);
        RectF rectF = this.f183425i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
