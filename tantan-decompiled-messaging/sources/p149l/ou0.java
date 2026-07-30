package p149l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ou0 extends mu0 {

    /* JADX INFO: renamed from: d */
    public final SeekBar f145642d;

    /* JADX INFO: renamed from: e */
    public Drawable f145643e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f145644f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f145645g;

    /* JADX INFO: renamed from: h */
    public boolean f145646h;

    /* JADX INFO: renamed from: i */
    public boolean f145647i;

    public ou0(SeekBar seekBar) {
        super(seekBar);
        this.f145644f = null;
        this.f145645g = null;
        this.f145646h = false;
        this.f145647i = false;
        this.f145642d = seekBar;
    }

    @Override // p149l.mu0
    /* JADX INFO: renamed from: c */
    public void mo156369c(AttributeSet attributeSet, int i) {
        super.mo156369c(attributeSet, i);
        qri0 qri0VarM175993u = qri0.m175993u(this.f145642d.getContext(), attributeSet, aac0.f68388T, i, 0);
        Drawable drawableM176001h = qri0VarM175993u.m176001h(aac0.f68393U);
        if (drawableM176001h != null) {
            this.f145642d.setThumb(drawableM176001h);
        }
        m165976j(qri0VarM175993u.m176000g(aac0.f68398V));
        if (qri0VarM175993u.m176011r(aac0.f68406X)) {
            this.f145645g = cce.m106048d(qri0VarM175993u.m176004k(aac0.f68406X, -1), this.f145645g);
            this.f145647i = true;
        }
        if (qri0VarM175993u.m176011r(aac0.f68402W)) {
            this.f145644f = qri0VarM175993u.m175996c(aac0.f68402W);
            this.f145646h = true;
        }
        qri0VarM175993u.m176012v();
        m165972f();
    }

    /* JADX INFO: renamed from: f */
    public final void m165972f() {
        Drawable drawable = this.f145643e;
        if (drawable != null) {
            if (this.f145646h || this.f145647i) {
                Drawable drawableM145284r = kbe.m145284r(drawable.mutate());
                this.f145643e = drawableM145284r;
                if (this.f145646h) {
                    kbe.m145281o(drawableM145284r, this.f145644f);
                }
                if (this.f145647i) {
                    kbe.m145282p(this.f145643e, this.f145645g);
                }
                if (this.f145643e.isStateful()) {
                    this.f145643e.setState(this.f145642d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m165973g(Canvas canvas) {
        if (this.f145643e != null) {
            int max = this.f145642d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f145643e.getIntrinsicWidth();
                int intrinsicHeight = this.f145643e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f145643e.setBounds(-i, -i2, i, i2);
                float width = ((this.f145642d.getWidth() - this.f145642d.getPaddingLeft()) - this.f145642d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f145642d.getPaddingLeft(), this.f145642d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f145643e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m165974h() {
        Drawable drawable = this.f145643e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f145642d.getDrawableState())) {
            this.f145642d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m165975i() {
        Drawable drawable = this.f145643e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m165976j(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f145643e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f145643e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f145642d);
            kbe.m145279m(drawable, gbl0.m125228x(this.f145642d));
            if (drawable.isStateful()) {
                drawable.setState(this.f145642d.getDrawableState());
            }
            m165972f();
        }
        this.f145642d.invalidate();
    }
}
