package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import p153l.gic0;
import p153l.hml0;
import p153l.jnl0;
import p153l.kfc0;
import p153l.kkl0;
import p153l.o30;
import p153l.s8c0;
import p153l.t0j0;
import p153l.wtq0;
import p153l.xdc0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends AbsActionBarView {

    /* JADX INFO: renamed from: i */
    public CharSequence f490i;

    /* JADX INFO: renamed from: j */
    public CharSequence f491j;

    /* JADX INFO: renamed from: k */
    public View f492k;

    /* JADX INFO: renamed from: l */
    public View f493l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f494m;

    /* JADX INFO: renamed from: n */
    public TextView f495n;

    /* JADX INFO: renamed from: o */
    public TextView f496o;

    /* JADX INFO: renamed from: p */
    public int f497p;

    /* JADX INFO: renamed from: q */
    public int f498q;

    /* JADX INFO: renamed from: r */
    public boolean f499r;

    /* JADX INFO: renamed from: s */
    public int f500s;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0097a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ o30 f501a;

        public ViewOnClickListenerC0097a(o30 o30Var) {
            this.f501a = o30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f501a.mo152473a();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0j0 t0j0VarM188782u = t0j0.m188782u(context, attributeSet, gic0.f104459x, i, 0);
        kkl0.m150170m0(this, t0j0VarM188782u.m188789g(gic0.f104464y));
        this.f497p = t0j0VarM188782u.m188796n(gic0.f104229C, 0);
        this.f498q = t0j0VarM188782u.m188796n(gic0.f104224B, 0);
        this.f473e = t0j0VarM188782u.m188795m(gic0.f104219A, 0);
        this.f500s = t0j0VarM188782u.m188796n(gic0.f104469z, kfc0.f126268d);
        t0j0VarM188782u.m188801v();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ hml0 mo454f(int i, long j) {
        return super.mo454f(i, j);
    }

    /* JADX INFO: renamed from: g */
    public void m458g() {
        if (this.f492k == null) {
            m462k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f491j;
    }

    public CharSequence getTitle() {
        return this.f490i;
    }

    /* JADX INFO: renamed from: h */
    public void m459h(o30 o30Var) {
        View view = this.f492k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f500s, (ViewGroup) this, false);
            this.f492k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f492k);
        }
        this.f492k.findViewById(xdc0.f193564i).setOnClickListener(new ViewOnClickListenerC0097a(o30Var));
        MenuBuilder menuBuilder = (MenuBuilder) o30Var.mo152475c();
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m501q();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f472d = actionMenuPresenter2;
        actionMenuPresenter2.m498B(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.addMenuPresenter(this.f472d, this.f470b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f472d.mo399h(this);
        this.f471c = actionMenuView;
        kkl0.m150170m0(actionMenuView, null);
        addView(this.f471c, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final void m460i() {
        if (this.f494m == null) {
            LayoutInflater.from(getContext()).inflate(kfc0.f126265a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f494m = linearLayout;
            this.f495n = (TextView) linearLayout.findViewById(xdc0.f193560e);
            this.f496o = (TextView) this.f494m.findViewById(xdc0.f193559d);
            if (this.f497p != 0) {
                this.f495n.setTextAppearance(getContext(), this.f497p);
            }
            if (this.f498q != 0) {
                this.f496o.setTextAppearance(getContext(), this.f498q);
            }
        }
        this.f495n.setText(this.f490i);
        this.f496o.setText(this.f491j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f490i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f491j);
        this.f496o.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f494m.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f494m.getParent() == null) {
            addView(this.f494m);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m461j() {
        return this.f499r;
    }

    /* JADX INFO: renamed from: k */
    public void m462k() {
        removeAllViews();
        this.f493l = null;
        this.f471c = null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m463l() {
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m499C();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m504t();
            this.f472d.m505u();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f490i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM146265b = jnl0.m146265b(this);
        int paddingRight = zM146265b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f492k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f492k.getLayoutParams();
            int i5 = zM146265b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM146265b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM451d = AbsActionBarView.m451d(paddingRight, i5, zM146265b);
            paddingRight = AbsActionBarView.m451d(iM451d + m453e(this.f492k, iM451d, paddingTop, paddingTop2, zM146265b), i6, zM146265b);
        }
        int iM453e = paddingRight;
        LinearLayout linearLayout = this.f494m;
        if (linearLayout != null && this.f493l == null && linearLayout.getVisibility() != 8) {
            iM453e += m453e(this.f494m, iM453e, paddingTop, paddingTop2, zM146265b);
        }
        View view2 = this.f493l;
        if (view2 != null) {
            m453e(view2, iM453e, paddingTop, paddingTop2, zM146265b);
        }
        int paddingLeft = zM146265b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f471c;
        if (actionMenuView != null) {
            m453e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM146265b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            wtq0.m207906a(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            wtq0.m207906a(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f473e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f492k;
        if (view != null) {
            int iM452c = m452c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f492k.getLayoutParams();
            paddingLeft = iM452c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f471c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m452c(this.f471c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f494m;
        if (linearLayout != null && this.f493l == null) {
            if (this.f499r) {
                this.f494m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f494m.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f494m.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m452c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f493l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f493l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f473e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i) {
        this.f473e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f493l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f493l = view;
        if (view != null && (linearLayout = this.f494m) != null) {
            removeView(linearLayout);
            this.f494m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f491j = charSequence;
        m460i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f490i = charSequence;
        m460i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f499r) {
            requestLayout();
        }
        this.f499r = z;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166791k);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
