package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import p149l.aac0;
import p149l.gbl0;
import p149l.j30;
import p149l.s5c0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f480a;

    /* JADX INFO: renamed from: b */
    public View f481b;

    /* JADX INFO: renamed from: c */
    public View f482c;

    /* JADX INFO: renamed from: d */
    public View f483d;

    /* JADX INFO: renamed from: e */
    public Drawable f484e;

    /* JADX INFO: renamed from: f */
    public Drawable f485f;

    /* JADX INFO: renamed from: g */
    public Drawable f486g;

    /* JADX INFO: renamed from: h */
    public boolean f487h;

    /* JADX INFO: renamed from: i */
    public boolean f488i;

    /* JADX INFO: renamed from: j */
    public int f489j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        gbl0.m125207m0(this, new j30(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68418a);
        this.f484e = typedArrayObtainStyledAttributes.getDrawable(aac0.f68423b);
        this.f485f = typedArrayObtainStyledAttributes.getDrawable(aac0.f68433d);
        this.f489j = typedArrayObtainStyledAttributes.getDimensionPixelSize(aac0.f68463j, -1);
        boolean z = true;
        if (getId() == s5c0.f162508N) {
            this.f487h = true;
            this.f486g = typedArrayObtainStyledAttributes.getDrawable(aac0.f68428c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f487h ? this.f484e != null || this.f485f != null : this.f486g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* JADX INFO: renamed from: a */
    public final int m455a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m456b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f484e;
        if (drawable != null && drawable.isStateful()) {
            this.f484e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f485f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f485f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f486g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f486g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f481b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f484e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f485f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f486g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f482c = findViewById(s5c0.f162517a);
        this.f483d = findViewById(s5c0.f162522f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f480a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f481b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f487h) {
            Drawable drawable2 = this.f486g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f484e != null) {
                if (this.f482c.getVisibility() == 0) {
                    this.f484e.setBounds(this.f482c.getLeft(), this.f482c.getTop(), this.f482c.getRight(), this.f482c.getBottom());
                } else {
                    View view2 = this.f483d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f484e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f484e.setBounds(this.f483d.getLeft(), this.f483d.getTop(), this.f483d.getRight(), this.f483d.getBottom());
                    }
                }
                z3 = true;
            }
            this.f488i = z4;
            if (!z4 || (drawable = this.f485f) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM455a;
        int i3;
        if (this.f482c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f489j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f482c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f481b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (m456b(this.f482c)) {
            iM455a = !m456b(this.f483d) ? m455a(this.f483d) : 0;
        } else {
            iM455a = m455a(this.f482c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iM455a + m455a(this.f481b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f484e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f484e);
        }
        this.f484e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f482c;
            if (view != null) {
                this.f484e.setBounds(view.getLeft(), this.f482c.getTop(), this.f482c.getRight(), this.f482c.getBottom());
            }
        }
        boolean z = false;
        if (!this.f487h ? !(this.f484e != null || this.f485f != null) : this.f486g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f486g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f486g);
        }
        this.f486g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f487h && (drawable2 = this.f486g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f487h ? !(this.f484e != null || this.f485f != null) : this.f486g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f485f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f485f);
        }
        this.f485f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f488i && (drawable2 = this.f485f) != null) {
                drawable2.setBounds(this.f481b.getLeft(), this.f481b.getTop(), this.f481b.getRight(), this.f481b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f487h ? !(this.f484e != null || this.f485f != null) : this.f486g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f481b;
        if (view != null) {
            removeView(view);
        }
        this.f481b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f480a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f484e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f485f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f486g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f484e && !this.f487h) {
            return true;
        }
        if (drawable == this.f485f && this.f488i) {
            return true;
        }
        return (drawable == this.f486g && this.f487h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
