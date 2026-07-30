package p153l;

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

/* JADX INFO: loaded from: classes3.dex */
public class lsh0 {

    /* JADX INFO: renamed from: a */
    public View f133423a;

    /* JADX INFO: renamed from: b */
    public Drawable f133424b;

    /* JADX INFO: renamed from: c */
    public final Rect f133425c = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f133426d = false;

    /* JADX INFO: renamed from: e */
    public boolean f133427e = false;

    /* JADX INFO: renamed from: f */
    public boolean f133428f = false;

    public lsh0(View view) {
        this.f133423a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m155688a(Canvas canvas) {
        Drawable drawable = this.f133424b;
        if (drawable != null) {
            if (this.f133427e) {
                this.f133427e = false;
                int right = this.f133423a.getRight() - this.f133423a.getLeft();
                int bottom = this.f133423a.getBottom() - this.f133423a.getTop();
                if (this.f133426d) {
                    Rect rect = this.f133425c;
                    drawable.setBounds(rect.left, rect.top, right - rect.right, bottom - rect.bottom);
                } else {
                    drawable.setBounds(0, 0, right, bottom);
                }
            }
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m155689b() {
        Drawable drawable = this.f133424b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m155690c() {
        this.f133427e = true;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: d */
    public void m155691d(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getActionMasked() != 0 || (drawable = this.f133424b) == null) {
            return;
        }
        drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
    }

    /* JADX INFO: renamed from: e */
    public boolean m155692e(Drawable drawable) {
        return drawable == this.f133424b;
    }

    /* JADX INFO: renamed from: f */
    public void m155693f() {
        Drawable drawable = this.f133424b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f133424b.setState(this.f133423a.getDrawableState());
    }

    /* JADX INFO: renamed from: g */
    public Drawable m155694g() {
        return this.f133424b;
    }

    /* JADX INFO: renamed from: h */
    public void m155695h(Context context, AttributeSet attributeSet, int i) {
        NinePatchDrawable ninePatchDrawable;
        this.f133425c.left = this.f133423a.getPaddingLeft();
        this.f133425c.top = this.f133423a.getPaddingTop();
        this.f133425c.right = this.f133423a.getPaddingRight();
        this.f133425c.bottom = this.f133423a.getPaddingBottom();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109709c0, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(hhc0.f109723e0);
        this.f133426d = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109730f0, false);
        this.f133428f = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109716d0, false);
        if (!this.f133426d && (this.f133423a.getBackground() instanceof NinePatchDrawable) && (ninePatchDrawable = (NinePatchDrawable) this.f133423a.getBackground()) != null && ninePatchDrawable.getPadding(this.f133425c)) {
            this.f133426d = true;
        }
        Drawable background = this.f133423a.getBackground();
        if (this.f133428f && background != null) {
            m155696i(background);
        } else if (drawable != null) {
            m155696i(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: i */
    public void m155696i(Drawable drawable) {
        Drawable drawable2 = this.f133424b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.f133423a.unscheduleDrawable(this.f133424b);
            }
            this.f133424b = drawable;
            View view = this.f133423a;
            if (drawable != null) {
                view.setWillNotDraw(false);
                drawable.setCallback(this.f133423a);
                if (drawable.isStateful()) {
                    drawable.setState(this.f133423a.getDrawableState());
                }
            } else {
                view.setWillNotDraw(true);
            }
            this.f133423a.requestLayout();
            this.f133423a.invalidate();
        }
    }
}
