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
import p149l.aac0;
import p149l.ddl0;
import p149l.fdl0;
import p149l.gbl0;
import p149l.n0c0;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0095a f469a;

    /* JADX INFO: renamed from: b */
    public final Context f470b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f471c;

    /* JADX INFO: renamed from: d */
    public ActionMenuPresenter f472d;

    /* JADX INFO: renamed from: e */
    public int f473e;

    /* JADX INFO: renamed from: f */
    public ddl0 f474f;

    /* JADX INFO: renamed from: g */
    public boolean f475g;

    /* JADX INFO: renamed from: h */
    public boolean f476h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AbsActionBarView$a */
    public class C0095a implements fdl0 {

        /* JADX INFO: renamed from: a */
        public boolean f477a = false;

        /* JADX INFO: renamed from: b */
        public int f478b;

        public C0095a() {
        }

        /* JADX INFO: renamed from: a */
        public C0095a m454a(ddl0 ddl0Var, int i) {
            AbsActionBarView.this.f474f = ddl0Var;
            this.f478b = i;
            return this;
        }

        @Override // p149l.fdl0
        public void onAnimationCancel(View view) {
            this.f477a = true;
        }

        @Override // p149l.fdl0
        public void onAnimationEnd(View view) {
            if (this.f477a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f474f = null;
            AbsActionBarView.super.setVisibility(this.f478b);
        }

        @Override // p149l.fdl0
        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f477a = false;
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f469a = new C0095a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(n0c0.f136509a, typedValue, true) || typedValue.resourceId == 0) {
            this.f470b = context;
        } else {
            this.f470b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m450d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: renamed from: c */
    public int m451c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: renamed from: e */
    public int m452e(View view, int i, int i2, int i3, boolean z) {
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
    public ddl0 mo453f(int i, long j) {
        ddl0 ddl0Var = this.f474f;
        if (ddl0Var != null) {
            ddl0Var.m111031c();
        }
        if (i != 0) {
            ddl0 ddl0VarM111030b = gbl0.m125186c(this).m111030b(0.0f);
            ddl0VarM111030b.m111033e(j);
            ddl0VarM111030b.m111035g(this.f469a.m454a(ddl0VarM111030b, i));
            return ddl0VarM111030b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ddl0 ddl0VarM111030b2 = gbl0.m125186c(this).m111030b(1.0f);
        ddl0VarM111030b2.m111033e(j);
        ddl0VarM111030b2.m111035g(this.f469a.m454a(ddl0VarM111030b2, i));
        return ddl0VarM111030b2;
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
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, aac0.f68418a, n0c0.f136511c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(aac0.f68463j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m507x(configuration);
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
            ddl0 ddl0Var = this.f474f;
            if (ddl0Var != null) {
                ddl0Var.m111031c();
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
