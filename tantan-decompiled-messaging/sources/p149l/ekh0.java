package p149l;

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
public class ekh0 {

    /* JADX INFO: renamed from: a */
    public View f91979a;

    /* JADX INFO: renamed from: b */
    public Drawable f91980b;

    /* JADX INFO: renamed from: c */
    public final Rect f91981c = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f91982d = false;

    /* JADX INFO: renamed from: e */
    public boolean f91983e = false;

    /* JADX INFO: renamed from: f */
    public boolean f91984f = false;

    public ekh0(View view) {
        this.f91979a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m116967a(Canvas canvas) {
        Drawable drawable = this.f91980b;
        if (drawable != null) {
            if (this.f91983e) {
                this.f91983e = false;
                int right = this.f91979a.getRight() - this.f91979a.getLeft();
                int bottom = this.f91979a.getBottom() - this.f91979a.getTop();
                if (this.f91982d) {
                    Rect rect = this.f91981c;
                    drawable.setBounds(rect.left, rect.top, right - rect.right, bottom - rect.bottom);
                } else {
                    drawable.setBounds(0, 0, right, bottom);
                }
            }
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m116968b() {
        Drawable drawable = this.f91980b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m116969c() {
        this.f91983e = true;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: d */
    public void m116970d(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getActionMasked() != 0 || (drawable = this.f91980b) == null) {
            return;
        }
        drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
    }

    /* JADX INFO: renamed from: e */
    public boolean m116971e(Drawable drawable) {
        return drawable == this.f91980b;
    }

    /* JADX INFO: renamed from: f */
    public void m116972f() {
        Drawable drawable = this.f91980b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f91980b.setState(this.f91979a.getDrawableState());
    }

    /* JADX INFO: renamed from: g */
    public Drawable m116973g() {
        return this.f91980b;
    }

    /* JADX INFO: renamed from: h */
    public void m116974h(Context context, AttributeSet attributeSet, int i) {
        NinePatchDrawable ninePatchDrawable;
        this.f91981c.left = this.f91979a.getPaddingLeft();
        this.f91981c.top = this.f91979a.getPaddingTop();
        this.f91981c.right = this.f91979a.getPaddingRight();
        this.f91981c.bottom = this.f91979a.getPaddingBottom();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74400c0, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.f74414e0);
        this.f91982d = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74421f0, false);
        this.f91984f = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74407d0, false);
        if (!this.f91982d && (this.f91979a.getBackground() instanceof NinePatchDrawable) && (ninePatchDrawable = (NinePatchDrawable) this.f91979a.getBackground()) != null && ninePatchDrawable.getPadding(this.f91981c)) {
            this.f91982d = true;
        }
        Drawable background = this.f91979a.getBackground();
        if (this.f91984f && background != null) {
            m116975i(background);
        } else if (drawable != null) {
            m116975i(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: i */
    public void m116975i(Drawable drawable) {
        Drawable drawable2 = this.f91980b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.f91979a.unscheduleDrawable(this.f91980b);
            }
            this.f91980b = drawable;
            View view = this.f91979a;
            if (drawable != null) {
                view.setWillNotDraw(false);
                drawable.setCallback(this.f91979a);
                if (drawable.isStateful()) {
                    drawable.setState(this.f91979a.getDrawableState());
                }
            } else {
                view.setWillNotDraw(true);
            }
            this.f91979a.requestLayout();
            this.f91979a.invalidate();
        }
    }
}
