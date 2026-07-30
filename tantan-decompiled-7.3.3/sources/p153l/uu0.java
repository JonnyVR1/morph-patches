package p153l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class uu0 extends su0 {

    /* JADX INFO: renamed from: d */
    public final SeekBar f181025d;

    /* JADX INFO: renamed from: e */
    public Drawable f181026e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f181027f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f181028g;

    /* JADX INFO: renamed from: h */
    public boolean f181029h;

    /* JADX INFO: renamed from: i */
    public boolean f181030i;

    public uu0(SeekBar seekBar) {
        super(seekBar);
        this.f181027f = null;
        this.f181028g = null;
        this.f181029h = false;
        this.f181030i = false;
        this.f181025d = seekBar;
    }

    @Override // p153l.su0
    /* JADX INFO: renamed from: c */
    public void mo187979c(AttributeSet attributeSet, int i) {
        super.mo187979c(attributeSet, i);
        t0j0 t0j0VarM188782u = t0j0.m188782u(this.f181025d.getContext(), attributeSet, gic0.f104314T, i, 0);
        Drawable drawableM188790h = t0j0VarM188782u.m188790h(gic0.f104319U);
        if (drawableM188790h != null) {
            this.f181025d.setThumb(drawableM188790h);
        }
        m198136j(t0j0VarM188782u.m188789g(gic0.f104324V));
        if (t0j0VarM188782u.m188800r(gic0.f104332X)) {
            this.f181028g = gde.m129924d(t0j0VarM188782u.m188793k(gic0.f104332X, -1), this.f181028g);
            this.f181030i = true;
        }
        if (t0j0VarM188782u.m188800r(gic0.f104328W)) {
            this.f181027f = t0j0VarM188782u.m188785c(gic0.f104328W);
            this.f181029h = true;
        }
        t0j0VarM188782u.m188801v();
        m198132f();
    }

    /* JADX INFO: renamed from: f */
    public final void m198132f() {
        Drawable drawable = this.f181026e;
        if (drawable != null) {
            if (this.f181029h || this.f181030i) {
                Drawable drawableM167178r = oce.m167178r(drawable.mutate());
                this.f181026e = drawableM167178r;
                if (this.f181029h) {
                    oce.m167175o(drawableM167178r, this.f181027f);
                }
                if (this.f181030i) {
                    oce.m167176p(this.f181026e, this.f181028g);
                }
                if (this.f181026e.isStateful()) {
                    this.f181026e.setState(this.f181025d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m198133g(Canvas canvas) {
        if (this.f181026e != null) {
            int max = this.f181025d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f181026e.getIntrinsicWidth();
                int intrinsicHeight = this.f181026e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f181026e.setBounds(-i, -i2, i, i2);
                float width = ((this.f181025d.getWidth() - this.f181025d.getPaddingLeft()) - this.f181025d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f181025d.getPaddingLeft(), this.f181025d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f181026e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m198134h() {
        Drawable drawable = this.f181026e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f181025d.getDrawableState())) {
            this.f181025d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m198135i() {
        Drawable drawable = this.f181026e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m198136j(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f181026e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f181026e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f181025d);
            oce.m167173m(drawable, kkl0.m150191x(this.f181025d));
            if (drawable.isStateful()) {
                drawable.setState(this.f181025d.getDrawableState());
            }
            m198132f();
        }
        this.f181025d.invalidate();
    }
}
