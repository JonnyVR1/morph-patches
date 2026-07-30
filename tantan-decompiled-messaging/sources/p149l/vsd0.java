package p149l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class vsd0 extends uzi {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public ftd0 f182829e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public Object f182830f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public PointF f182831g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public int f182832h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public int f182833i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public Matrix f182834j;

    /* JADX INFO: renamed from: k */
    public Matrix f182835k;

    public vsd0(Drawable drawable, ftd0 ftd0Var) {
        super(drawable);
        this.f182831g = null;
        this.f182832h = 0;
        this.f182833i = 0;
        this.f182835k = new Matrix();
        this.f182829e = ftd0Var;
    }

    /* JADX INFO: renamed from: t */
    private void m199855t() {
        ftd0 ftd0Var = this.f182829e;
        boolean z = false;
        if (ftd0Var instanceof rtd0) {
            Object state = ((rtd0) ftd0Var).getState();
            z = state == null || !state.equals(this.f182830f);
            this.f182830f = state;
        }
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f182832h == current.getIntrinsicWidth() && this.f182833i == current.getIntrinsicHeight() && !z) {
            return;
        }
        m199856s();
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m199855t();
        if (this.f182834j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f182834j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p149l.uzi, p149l.n7j0
    /* JADX INFO: renamed from: j */
    public void mo158146j(Matrix matrix) {
        m196418o(matrix);
        m199855t();
        Matrix matrix2 = this.f182834j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m199856s();
    }

    @Override // p149l.uzi
    /* JADX INFO: renamed from: q */
    public Drawable mo164036q(Drawable drawable) {
        Drawable drawableMo164036q = super.mo164036q(drawable);
        m199856s();
        return drawableMo164036q;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: s */
    public void m199856s() {
        Drawable current = getCurrent();
        if (current == null) {
            this.f182833i = 0;
            this.f182832h = 0;
            this.f182834j = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f182832h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f182833i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f182834j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f182834j = null;
            return;
        }
        if (this.f182829e == ftd0.f99177a) {
            current.setBounds(bounds);
            this.f182834j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f182835k.reset();
        ftd0 ftd0Var = this.f182829e;
        Matrix matrix = this.f182835k;
        PointF pointF = this.f182831g;
        ftd0Var.mo118081a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
        this.f182834j = this.f182835k;
    }

    /* JADX INFO: renamed from: u */
    public PointF m199857u() {
        return this.f182831g;
    }

    /* JADX INFO: renamed from: v */
    public ftd0 m199858v() {
        return this.f182829e;
    }

    /* JADX INFO: renamed from: w */
    public void m199859w(PointF pointF) {
        if (t050.m186814a(this.f182831g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f182831g = null;
        } else {
            if (this.f182831g == null) {
                this.f182831g = new PointF();
            }
            this.f182831g.set(pointF);
        }
        m199856s();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: x */
    public void m199860x(ftd0 ftd0Var) {
        if (t050.m186814a(this.f182829e, ftd0Var)) {
            return;
        }
        this.f182829e = ftd0Var;
        this.f182830f = null;
        m199856s();
        invalidateSelf();
    }
}
