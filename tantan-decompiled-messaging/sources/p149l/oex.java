package p149l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class oex extends uzi {

    /* JADX INFO: renamed from: e */
    public Matrix f143595e;

    /* JADX INFO: renamed from: f */
    public Matrix f143596f;

    /* JADX INFO: renamed from: g */
    public int f143597g;

    /* JADX INFO: renamed from: h */
    public int f143598h;

    /* JADX INFO: renamed from: s */
    private void m164035s() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f143597g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f143598h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f143596f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f143596f = this.f143595e;
        }
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m164037t();
        if (this.f143596f == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f143596f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p149l.uzi, p149l.n7j0
    /* JADX INFO: renamed from: j */
    public void mo158146j(Matrix matrix) {
        super.mo158146j(matrix);
        Matrix matrix2 = this.f143596f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m164035s();
    }

    @Override // p149l.uzi
    /* JADX INFO: renamed from: q */
    public Drawable mo164036q(Drawable drawable) {
        Drawable drawableMo164036q = super.mo164036q(drawable);
        m164035s();
        return drawableMo164036q;
    }

    /* JADX INFO: renamed from: t */
    public final void m164037t() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f143597g == current.getIntrinsicWidth() && this.f143598h == current.getIntrinsicHeight()) {
            return;
        }
        m164035s();
    }
}
