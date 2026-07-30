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
import p149l.aac0;
import p149l.ddl0;
import p149l.fel0;
import p149l.g7c0;
import p149l.gbl0;
import p149l.n0c0;
import p149l.qkq0;
import p149l.qri0;
import p149l.s5c0;
import p149l.u30;

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
    public class ViewOnClickListenerC0096a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u30 f501a;

        public ViewOnClickListenerC0096a(u30 u30Var) {
            this.f501a = u30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f501a.mo108669a();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, aac0.f68533x, i, 0);
        gbl0.m125207m0(this, qri0VarM175993u.m176000g(aac0.f68538y));
        this.f497p = qri0VarM175993u.m176007n(aac0.f68303C, 0);
        this.f498q = qri0VarM175993u.m176007n(aac0.f68298B, 0);
        this.f473e = qri0VarM175993u.m176006m(aac0.f68293A, 0);
        this.f500s = qri0VarM175993u.m176007n(aac0.f68543z, g7c0.f101356d);
        qri0VarM175993u.m176012v();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ ddl0 mo453f(int i, long j) {
        return super.mo453f(i, j);
    }

    /* JADX INFO: renamed from: g */
    public void m457g() {
        if (this.f492k == null) {
            m461k();
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
    public void m458h(u30 u30Var) {
        View view = this.f492k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f500s, (ViewGroup) this, false);
            this.f492k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f492k);
        }
        this.f492k.findViewById(s5c0.f162525i).setOnClickListener(new ViewOnClickListenerC0096a(u30Var));
        MenuBuilder menuBuilder = (MenuBuilder) u30Var.mo108671c();
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m500q();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f472d = actionMenuPresenter2;
        actionMenuPresenter2.m497B(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.addMenuPresenter(this.f472d, this.f470b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f472d.mo398h(this);
        this.f471c = actionMenuView;
        gbl0.m125207m0(actionMenuView, null);
        addView(this.f471c, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final void m459i() {
        if (this.f494m == null) {
            LayoutInflater.from(getContext()).inflate(g7c0.f101353a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f494m = linearLayout;
            this.f495n = (TextView) linearLayout.findViewById(s5c0.f162521e);
            this.f496o = (TextView) this.f494m.findViewById(s5c0.f162520d);
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
    public boolean m460j() {
        return this.f499r;
    }

    /* JADX INFO: renamed from: k */
    public void m461k() {
        removeAllViews();
        this.f493l = null;
        this.f471c = null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m462l() {
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m498C();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f472d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m503t();
            this.f472d.m504u();
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
        boolean zM121043b = fel0.m121043b(this);
        int paddingRight = zM121043b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f492k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f492k.getLayoutParams();
            int i5 = zM121043b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM121043b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM450d = AbsActionBarView.m450d(paddingRight, i5, zM121043b);
            paddingRight = AbsActionBarView.m450d(iM450d + m452e(this.f492k, iM450d, paddingTop, paddingTop2, zM121043b), i6, zM121043b);
        }
        int iM452e = paddingRight;
        LinearLayout linearLayout = this.f494m;
        if (linearLayout != null && this.f493l == null && linearLayout.getVisibility() != 8) {
            iM452e += m452e(this.f494m, iM452e, paddingTop, paddingTop2, zM121043b);
        }
        View view2 = this.f493l;
        if (view2 != null) {
            m452e(view2, iM452e, paddingTop, paddingTop2, zM121043b);
        }
        int paddingLeft = zM121043b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f471c;
        if (actionMenuView != null) {
            m452e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM121043b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            qkq0.m175383a(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            qkq0.m175383a(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
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
            int iM451c = m451c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f492k.getLayoutParams();
            paddingLeft = iM451c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f471c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m451c(this.f471c, paddingLeft, iMakeMeasureSpec, 0);
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
                paddingLeft = m451c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
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
        m459i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f490i = charSequence;
        m459i();
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
        this(context, attributeSet, n0c0.f136519k);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
