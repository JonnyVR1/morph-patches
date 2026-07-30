package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p153l.gic0;
import p153l.hml0;
import p153l.jml0;
import p153l.kkl0;
import p153l.s8c0;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0096a f469a;

    /* JADX INFO: renamed from: b */
    public final Context f470b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f471c;

    /* JADX INFO: renamed from: d */
    public ActionMenuPresenter f472d;

    /* JADX INFO: renamed from: e */
    public int f473e;

    /* JADX INFO: renamed from: f */
    public hml0 f474f;

    /* JADX INFO: renamed from: g */
    public boolean f475g;

    /* JADX INFO: renamed from: h */
    public boolean f476h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AbsActionBarView$a */
    public class C0096a implements jml0 {

        /* JADX INFO: renamed from: a */
        public boolean f477a = false;

        /* JADX INFO: renamed from: b */
        public int f478b;

        public C0096a() {
        }

        /* JADX INFO: renamed from: a */
        public C0096a m455a(hml0 hml0Var, int i) {
            AbsActionBarView.this.f474f = hml0Var;
            this.f478b = i;
            return this;
        }

        @Override // p153l.jml0
        public void onAnimationCancel(View view) {
            this.f477a = true;
        }

        @Override // p153l.jml0
        public void onAnimationEnd(View view) {
            if (this.f477a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f474f = null;
            AbsActionBarView.super.setVisibility(this.f478b);
        }

        @Override // p153l.jml0
        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f477a = false;
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f469a = new C0096a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(s8c0.f166781a, typedValue, true) || typedValue.resourceId == 0) {
            this.f470b = context;
        } else {
            this.f470b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m451d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: renamed from: c */
    public int m452c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: renamed from: e */
    public int m453e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: f */
    public hml0 mo454f(int i, long j) {
        hml0 hml0Var = this.f474f;
        if (hml0Var != null) {
            hml0Var.m135940c();
        }
        if (i != 0) {
            hml0 hml0VarM135939b = kkl0.m150149c(this).m135939b(0.0f);
            hml0VarM135939b.m135942e(j);
            hml0VarM135939b.m135944g(this.f469a.m455a(hml0VarM135939b, i));
            return hml0VarM135939b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        hml0 hml0VarM135939b2 = kkl0.m150149c(this).m135939b(1.0f);
        hml0VarM135939b2.m135942e(j);
        hml0VarM135939b2.m135944g(this.f469a.m455a(hml0VarM135939b2, i));
        return hml0VarM135939b2;
    }

    public int getAnimatedVisibility() {
        return this.f474f != null ? this.f469a.f478b : getVisibility();
    }

    public int getContentHeight() {
        return this.f473e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, gic0.f104344a, s8c0.f166783c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(gic0.f104389j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m508x(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f476h = false;
        }
        if (!this.f476h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f476h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f476h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f475g = false;
        }
        if (!this.f475g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f475g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f475g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f473e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            hml0 hml0Var = this.f474f;
            if (hml0Var != null) {
                hml0Var.m135940c();
            }
            super.setVisibility(i);
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsActionBarView(Context context) {
        this(context, null);
    }
}
