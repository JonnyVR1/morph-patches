package p149l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class ied0 extends uzi implements s5m0 {

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public Drawable f112752e;

    /* JADX INFO: renamed from: f */
    public t5m0 f112753f;

    public ied0(Drawable drawable) {
        super(drawable);
        this.f112752e = null;
    }

    @Override // p149l.s5m0
    /* JADX INFO: renamed from: d */
    public void mo135667d(t5m0 t5m0Var) {
        this.f112753f = t5m0Var;
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            t5m0 t5m0Var = this.f112753f;
            if (t5m0Var != null) {
                t5m0Var.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f112752e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f112752e.draw(canvas);
            }
        }
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public void m135668s(Drawable drawable) {
        this.f112752e = drawable;
        invalidateSelf();
    }

    @Override // p149l.uzi, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        t5m0 t5m0Var = this.f112753f;
        if (t5m0Var != null) {
            t5m0Var.mo140884g(z);
        }
        return super.setVisible(z, z2);
    }
}
