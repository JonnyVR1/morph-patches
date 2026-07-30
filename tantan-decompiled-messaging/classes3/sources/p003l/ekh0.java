package p003l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ekh0 {

    /* JADX INFO: renamed from: a */
    public View f3319a;

    /* JADX INFO: renamed from: b */
    public Drawable f3320b;

    /* JADX INFO: renamed from: c */
    public final Rect f3321c = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f3322d = false;

    /* JADX INFO: renamed from: e */
    public boolean f3323e = false;

    /* JADX INFO: renamed from: f */
    public boolean f3324f = false;

    public ekh0(View view) {
        this.f3319a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m3891a(Canvas canvas) {
        Drawable drawable = this.f3320b;
        if (drawable != null) {
            if (this.f3323e) {
                this.f3323e = false;
                int right = this.f3319a.getRight() - this.f3319a.getLeft();
                int bottom = this.f3319a.getBottom() - this.f3319a.getTop();
                if (this.f3322d) {
                    Rect rect = this.f3321c;
                    drawable.setBounds(rect.left, rect.top, right - rect.right, bottom - rect.bottom);
                } else {
                    drawable.setBounds(0, 0, right, bottom);
                }
            }
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3892b() {
        Drawable drawable = this.f3320b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3893c() {
        this.f3323e = true;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: d */
    public void m3894d(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getActionMasked() != 0 || (drawable = this.f3320b) == null) {
            return;
        }
        drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
    }

    /* JADX INFO: renamed from: e */
    public boolean m3895e(Drawable drawable) {
        return drawable == this.f3320b;
    }

    /* JADX INFO: renamed from: f */
    public void m3896f() {
        Drawable drawable = this.f3320b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3320b.setState(this.f3319a.getDrawableState());
    }

    /* JADX INFO: renamed from: g */
    public Drawable m3897g() {
        return this.f3320b;
    }

    /* JADX INFO: renamed from: h */
    public void m3898h(Context context, AttributeSet attributeSet, int i) {
        NinePatchDrawable ninePatchDrawable;
        this.f3321c.left = this.f3319a.getPaddingLeft();
        this.f3321c.top = this.f3319a.getPaddingTop();
        this.f3321c.right = this.f3319a.getPaddingRight();
        this.f3321c.bottom = this.f3319a.getPaddingBottom();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.c0, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.e0);
        this.f3322d = typedArrayObtainStyledAttributes.getBoolean(b9c0.f0, false);
        this.f3324f = typedArrayObtainStyledAttributes.getBoolean(b9c0.d0, false);
        if (!this.f3322d && (this.f3319a.getBackground() instanceof NinePatchDrawable) && (ninePatchDrawable = (NinePatchDrawable) this.f3319a.getBackground()) != null && ninePatchDrawable.getPadding(this.f3321c)) {
            this.f3322d = true;
        }
        Drawable background = this.f3319a.getBackground();
        if (this.f3324f && background != null) {
            m3899i(background);
        } else if (drawable != null) {
            m3899i(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: i */
    public void m3899i(Drawable drawable) {
        Drawable drawable2 = this.f3320b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.f3319a.unscheduleDrawable(this.f3320b);
            }
            this.f3320b = drawable;
            View view = this.f3319a;
            if (drawable != null) {
                view.setWillNotDraw(false);
                drawable.setCallback(this.f3319a);
                if (drawable.isStateful()) {
                    drawable.setState(this.f3319a.getDrawableState());
                }
            } else {
                view.setWillNotDraw(true);
            }
            this.f3319a.requestLayout();
            this.f3319a.invalidate();
        }
    }
}
