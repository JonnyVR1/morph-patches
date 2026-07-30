package p153l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class kmd0 extends p2j implements wem0 {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public Drawable f127468e;

    /* JADX INFO: renamed from: f */
    public xem0 f127469f;

    public kmd0(Drawable drawable) {
        super(drawable);
        this.f127468e = null;
    }

    @Override // p153l.wem0
    /* JADX INFO: renamed from: d */
    public void mo150429d(xem0 xem0Var) {
        this.f127469f = xem0Var;
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            xem0 xem0Var = this.f127469f;
            if (xem0Var != null) {
                xem0Var.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f127468e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f127468e.draw(canvas);
            }
        }
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public void m150430s(Drawable drawable) {
        this.f127468e = drawable;
        invalidateSelf();
    }

    @Override // p153l.p2j, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        xem0 xem0Var = this.f127469f;
        if (xem0Var != null) {
            xem0Var.mo158587g(z);
        }
        return super.setVisible(z, z2);
    }
}
