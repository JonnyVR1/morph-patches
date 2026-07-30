package p153l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class x0e0 extends p2j {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public h1e0 f191885e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public Object f191886f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public PointF f191887g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public int f191888h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public int f191889i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public Matrix f191890j;

    /* JADX INFO: renamed from: k */
    public Matrix f191891k;

    public x0e0(Drawable drawable, h1e0 h1e0Var) {
        super(drawable);
        this.f191887g = null;
        this.f191888h = 0;
        this.f191889i = 0;
        this.f191891k = new Matrix();
        this.f191885e = h1e0Var;
    }

    /* JADX INFO: renamed from: t */
    private void m208818t() {
        h1e0 h1e0Var = this.f191885e;
        boolean z = false;
        if (h1e0Var instanceof t1e0) {
            Object state = ((t1e0) h1e0Var).getState();
            z = state == null || !state.equals(this.f191886f);
            this.f191886f = state;
        }
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f191888h == current.getIntrinsicWidth() && this.f191889i == current.getIntrinsicHeight() && !z) {
            return;
        }
        m208819s();
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m208818t();
        if (this.f191890j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f191890j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p153l.p2j, p153l.rgj0
    /* JADX INFO: renamed from: j */
    public void mo96260j(Matrix matrix) {
        m170352o(matrix);
        m208818t();
        Matrix matrix2 = this.f191890j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m208819s();
    }

    @Override // p153l.p2j
    /* JADX INFO: renamed from: q */
    public Drawable mo163253q(Drawable drawable) {
        Drawable drawableMo163253q = super.mo163253q(drawable);
        m208819s();
        return drawableMo163253q;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: s */
    public void m208819s() {
        Drawable current = getCurrent();
        if (current == null) {
            this.f191889i = 0;
            this.f191888h = 0;
            this.f191890j = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f191888h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f191889i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f191890j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f191890j = null;
            return;
        }
        if (this.f191885e == h1e0.f107444a) {
            current.setBounds(bounds);
            this.f191890j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f191891k.reset();
        h1e0 h1e0Var = this.f191885e;
        Matrix matrix = this.f191891k;
        PointF pointF = this.f191887g;
        h1e0Var.mo128503a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
        this.f191890j = this.f191891k;
    }

    /* JADX INFO: renamed from: u */
    public PointF m208820u() {
        return this.f191887g;
    }

    /* JADX INFO: renamed from: v */
    public h1e0 m208821v() {
        return this.f191885e;
    }

    /* JADX INFO: renamed from: w */
    public void m208822w(PointF pointF) {
        if (i950.m139074a(this.f191887g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f191887g = null;
        } else {
            if (this.f191887g == null) {
                this.f191887g = new PointF();
            }
            this.f191887g.set(pointF);
        }
        m208819s();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: x */
    public void m208823x(h1e0 h1e0Var) {
        if (i950.m139074a(this.f191885e, h1e0Var)) {
            return;
        }
        this.f191885e = h1e0Var;
        this.f191886f = null;
        m208819s();
        invalidateSelf();
    }
}
