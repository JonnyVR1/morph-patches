package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.InterfaceC0093h;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.google.android.gms.common.api.Api;
import p153l.jnl0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.InterfaceC0080b, InterfaceC0093h {

    /* JADX INFO: renamed from: a */
    public MenuBuilder f564a;

    /* JADX INFO: renamed from: b */
    public Context f565b;

    /* JADX INFO: renamed from: c */
    public int f566c;

    /* JADX INFO: renamed from: d */
    public boolean f567d;

    /* JADX INFO: renamed from: e */
    public ActionMenuPresenter f568e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0092g.a f569f;

    /* JADX INFO: renamed from: g */
    public MenuBuilder.InterfaceC0079a f570g;

    /* JADX INFO: renamed from: h */
    public boolean f571h;

    /* JADX INFO: renamed from: i */
    public int f572i;

    /* JADX INFO: renamed from: j */
    public int f573j;

    /* JADX INFO: renamed from: k */
    public int f574k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0114e f575l;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0110a {
        /* JADX INFO: renamed from: a */
        boolean mo368a();

        /* JADX INFO: renamed from: b */
        boolean mo369b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0111b implements InterfaceC0092g.a {
        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        /* JADX INFO: renamed from: a */
        public boolean mo346a(MenuBuilder menuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0113d implements MenuBuilder.InterfaceC0079a {
        public C0113d() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            InterfaceC0114e interfaceC0114e = ActionMenuView.this.f575l;
            return interfaceC0114e != null && interfaceC0114e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            MenuBuilder.InterfaceC0079a interfaceC0079a = ActionMenuView.this.f570g;
            if (interfaceC0079a != null) {
                interfaceC0079a.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0114e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f573j = (int) (56.0f * f);
        this.f574k = (int) (f * 4.0f);
        this.f565b = context;
        this.f566c = 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: n */
    public static int m514n(View view, int i, int i2, int i3, int i4) {
        int i5;
        C0112c c0112c = (C0112c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m370h();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
            } else {
                i5 = 0;
            }
        } else {
            i5 = 0;
        }
        if (!c0112c.f576c && z2) {
            z = true;
        }
        c0112c.f579f = z;
        c0112c.f577d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0080b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: c */
    public boolean mo376c(MenuItemImpl menuItemImpl) {
        return this.f564a.performItemAction(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0112c;
    }

    /* JADX INFO: renamed from: d */
    public void m515d() {
        ActionMenuPresenter actionMenuPresenter = this.f568e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m501q();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0112c generateDefaultLayoutParams() {
        C0112c c0112c = new C0112c(-2, -2);
        c0112c.f682b = 16;
        return c0112c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0112c generateLayoutParams(AttributeSet attributeSet) {
        return new C0112c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0112c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0112c c0112c = layoutParams instanceof C0112c ? new C0112c((C0112c) layoutParams) : new C0112c(layoutParams);
        if (c0112c.f682b <= 0) {
            c0112c.f682b = 16;
        }
        return c0112c;
    }

    public Menu getMenu() {
        if (this.f564a == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.f564a = menuBuilder;
            menuBuilder.setCallback(new C0113d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f568e = actionMenuPresenter;
            actionMenuPresenter.m498B(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f568e;
            InterfaceC0092g.a c0111b = this.f569f;
            if (c0111b == null) {
                c0111b = new C0111b();
            }
            actionMenuPresenter2.setCallback(c0111b);
            this.f564a.addMenuPresenter(this.f568e, this.f565b);
            this.f568e.m510z(this);
        }
        return this.f564a;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f568e.m503s();
    }

    public int getPopupTheme() {
        return this.f566c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public C0112c m519h() {
        C0112c c0112cGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c0112cGenerateDefaultLayoutParams.f576c = true;
        return c0112cGenerateDefaultLayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public boolean m520i(int i) {
        boolean zMo368a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0110a)) {
            zMo368a = ((InterfaceC0110a) childAt).mo368a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0110a)) ? zMo368a : ((InterfaceC0110a) childAt2).mo369b() | zMo368a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.f564a = menuBuilder;
    }

    /* JADX INFO: renamed from: j */
    public boolean m521j() {
        ActionMenuPresenter actionMenuPresenter = this.f568e;
        return actionMenuPresenter != null && actionMenuPresenter.m504t();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public boolean m522k() {
        ActionMenuPresenter actionMenuPresenter = this.f568e;
        return actionMenuPresenter != null && actionMenuPresenter.m506v();
    }

    /* JADX INFO: renamed from: l */
    public boolean m523l() {
        ActionMenuPresenter actionMenuPresenter = this.f568e;
        return actionMenuPresenter != null && actionMenuPresenter.m507w();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: m */
    public boolean m524m() {
        return this.f567d;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX INFO: renamed from: o */
    public final void m525o(int i, int i2) {
        long j;
        int i3;
        boolean z;
        ?? r3;
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i5 = size - paddingLeft;
        int i6 = this.f573j;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = i6 + (i8 / i7);
        int childCount = getChildCount();
        int iMax = 0;
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        int iMax2 = 0;
        int i12 = 0;
        long j2 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            int i13 = size2;
            if (childAt.getVisibility() == 8) {
                i4 = i9;
            } else {
                boolean z3 = childAt instanceof ActionMenuItemView;
                i11++;
                if (z3) {
                    int i14 = this.f574k;
                    r3 = 0;
                    childAt.setPadding(i14, 0, i14, 0);
                } else {
                    r3 = 0;
                }
                C0112c c0112c = (C0112c) childAt.getLayoutParams();
                c0112c.f581h = r3;
                c0112c.f578e = r3;
                c0112c.f577d = r3;
                c0112c.f579f = r3;
                ((ViewGroup.MarginLayoutParams) c0112c).leftMargin = r3;
                ((ViewGroup.MarginLayoutParams) c0112c).rightMargin = r3;
                c0112c.f580g = z3 && ((ActionMenuItemView) childAt).m370h();
                int iM514n = m514n(childAt, i9, c0112c.f576c ? 1 : i7, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM514n);
                i4 = i9;
                if (c0112c.f579f) {
                    i12++;
                }
                if (c0112c.f576c) {
                    z2 = true;
                }
                i7 -= iM514n;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM514n == 1) {
                    j2 |= (long) (1 << i10);
                }
            }
            i10++;
            size2 = i13;
            i9 = i4;
        }
        int i15 = size2;
        int i16 = i9;
        char c = 2;
        boolean z4 = z2 && i11 == 2;
        boolean z5 = false;
        while (true) {
            if (i12 <= 0 || i7 <= 0) {
                j = 1;
                break;
            }
            int i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            long j3 = 0;
            char c2 = c;
            int i18 = 0;
            int i19 = 0;
            j = 1;
            while (i19 < childCount) {
                C0112c c0112c2 = (C0112c) getChildAt(i19).getLayoutParams();
                boolean z6 = z4;
                if (c0112c2.f579f) {
                    int i20 = c0112c2.f577d;
                    if (i20 < i17) {
                        j3 = 1 << i19;
                        i17 = i20;
                        i18 = 1;
                    } else if (i20 == i17) {
                        j3 |= 1 << i19;
                        i18++;
                    }
                }
                i19++;
                z4 = z6;
            }
            boolean z7 = z4;
            j2 |= j3;
            if (i18 > i7) {
                break;
            }
            int i21 = i17 + 1;
            int i22 = 0;
            while (i22 < childCount) {
                View childAt2 = getChildAt(i22);
                C0112c c0112c3 = (C0112c) childAt2.getLayoutParams();
                long j4 = 1 << i22;
                if ((j3 & j4) == 0) {
                    if (c0112c3.f577d == i21) {
                        j2 |= j4;
                    }
                    i22 = i22;
                } else {
                    if (!z7 || !c0112c3.f580g) {
                        z = true;
                    } else if (i7 == 1) {
                        int i23 = this.f574k;
                        z = true;
                        childAt2.setPadding(i23 + i16, 0, i23, 0);
                    } else {
                        z = true;
                    }
                    c0112c3.f577d++;
                    c0112c3.f581h = z;
                    i7--;
                }
                i22++;
            }
            c = c2;
            z4 = z7;
            z5 = true;
        }
        boolean z8 = !z2 && i11 == 1;
        if (i7 <= 0 || j2 == 0 || (i7 >= i11 - 1 && !z8 && iMax2 <= 1)) {
            i3 = 0;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (z8) {
                i3 = 0;
            } else {
                if ((j2 & j) != 0) {
                    i3 = 0;
                    if (!((C0112c) getChildAt(0).getLayoutParams()).f580g) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i3 = 0;
                }
                int i24 = childCount - 1;
                if ((j2 & ((long) (1 << i24))) != 0 && !((C0112c) getChildAt(i24).getLayoutParams()).f580g) {
                    fBitCount -= 0.5f;
                }
            }
            int i25 = fBitCount > 0.0f ? (int) ((i7 * i16) / fBitCount) : i3;
            boolean z9 = z5;
            for (int i26 = i3; i26 < childCount; i26++) {
                if ((j2 & ((long) (1 << i26))) != 0) {
                    View childAt3 = getChildAt(i26);
                    C0112c c0112c4 = (C0112c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0112c4.f578e = i25;
                        c0112c4.f581h = true;
                        if (i26 == 0 && !c0112c4.f580g) {
                            ((ViewGroup.MarginLayoutParams) c0112c4).leftMargin = (-i25) / 2;
                        }
                        z9 = true;
                    } else if (c0112c4.f576c) {
                        c0112c4.f578e = i25;
                        c0112c4.f581h = true;
                        ((ViewGroup.MarginLayoutParams) c0112c4).rightMargin = (-i25) / 2;
                        z9 = true;
                    } else {
                        if (i26 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0112c4).leftMargin = i25 / 2;
                        }
                        if (i26 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) c0112c4).rightMargin = i25 / 2;
                        }
                    }
                }
            }
            z5 = z9;
        }
        if (z5) {
            for (int i27 = i3; i27 < childCount; i27++) {
                View childAt4 = getChildAt(i27);
                C0112c c0112c5 = (C0112c) childAt4.getLayoutParams();
                if (c0112c5.f581h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0112c5.f577d * i16) + c0112c5.f578e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, mode != 1073741824 ? iMax : i15);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f568e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f568e.m507w()) {
                this.f568e.m504t();
                this.f568e.m499C();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m515d();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f571h) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM146265b = jnl0.m146265b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0112c c0112c = (C0112c) childAt.getLayoutParams();
                if (c0112c.f576c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m520i(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM146265b) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0112c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0112c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0112c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0112c).rightMargin;
                    m520i(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zM146265b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0112c c0112c2 = (C0112c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0112c2.f576c) {
                    int i15 = width2 - ((ViewGroup.MarginLayoutParams) c0112c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0112c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0112c c0112c3 = (C0112c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0112c3.f576c) {
                int i18 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0112c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0112c3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        MenuBuilder menuBuilder;
        boolean z = this.f571h;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f571h = z2;
        if (z != z2) {
            this.f572i = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f571h && (menuBuilder = this.f564a) != null && size != this.f572i) {
            this.f572i = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f571h && childCount > 0) {
            m525o(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0112c c0112c = (C0112c) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0112c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0112c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    public MenuBuilder m526p() {
        return this.f564a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public void m527q(InterfaceC0092g.a aVar, MenuBuilder.InterfaceC0079a interfaceC0079a) {
        this.f569f = aVar;
        this.f570g = interfaceC0079a;
    }

    /* JADX INFO: renamed from: r */
    public boolean m528r() {
        ActionMenuPresenter actionMenuPresenter = this.f568e;
        return actionMenuPresenter != null && actionMenuPresenter.m499C();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f568e.m509y(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0114e interfaceC0114e) {
        this.f575l = interfaceC0114e;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.f568e.m497A(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f567d = z;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f566c != i) {
            this.f566c = i;
            if (i == 0) {
                this.f565b = getContext();
            } else {
                this.f565b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f568e = actionMenuPresenter;
        actionMenuPresenter.m510z(this);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0112c extends LinearLayoutCompat.C0132a {

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public boolean f576c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public int f577d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public int f578e;

        /* JADX INFO: renamed from: f */
        @ViewDebug.ExportedProperty
        public boolean f579f;

        /* JADX INFO: renamed from: g */
        @ViewDebug.ExportedProperty
        public boolean f580g;

        /* JADX INFO: renamed from: h */
        public boolean f581h;

        public C0112c(C0112c c0112c) {
            super(c0112c);
            this.f576c = c0112c.f576c;
        }

        public C0112c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0112c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0112c(int i, int i2) {
            super(i, i2);
            this.f576c = false;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
