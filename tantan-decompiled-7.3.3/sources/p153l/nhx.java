package p153l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class nhx extends p2j {

    /* JADX INFO: renamed from: e */
    public Matrix f142075e;

    /* JADX INFO: renamed from: f */
    public Matrix f142076f;

    /* JADX INFO: renamed from: g */
    public int f142077g;

    /* JADX INFO: renamed from: h */
    public int f142078h;

    /* JADX INFO: renamed from: s */
    private void m163252s() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f142077g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f142078h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f142076f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f142076f = this.f142075e;
        }
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m163254t();
        if (this.f142076f == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f142076f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p153l.p2j, p153l.rgj0
    /* JADX INFO: renamed from: j */
    public void mo96260j(Matrix matrix) {
        super.mo96260j(matrix);
        Matrix matrix2 = this.f142076f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m163252s();
    }

    @Override // p153l.p2j
    /* JADX INFO: renamed from: q */
    public Drawable mo163253q(Drawable drawable) {
        Drawable drawableMo163253q = super.mo163253q(drawable);
        m163252s();
        return drawableMo163253q;
    }

    /* JADX INFO: renamed from: t */
    public final void m163254t() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f142077g == current.getIntrinsicWidth() && this.f142078h == current.getIntrinsicHeight()) {
            return;
        }
        m163252s();
    }
}
