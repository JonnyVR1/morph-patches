package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuC0095j;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p153l.c30;
import p153l.g7h0;
import p153l.gic0;
import p153l.jnl0;
import p153l.kkl0;
import p153l.kpd0;
import p153l.m9k;
import p153l.pxw;
import p153l.qe5;
import p153l.qid;
import p153l.s8c0;
import p153l.t0j0;
import p153l.tu0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private static final String TAG = "Toolbar";
    private InterfaceC0092g.a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private kpd0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private C0159d mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private MenuBuilder.InterfaceC0079a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView.InterfaceC0114e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    InterfaceC0161f mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private C0165c mWrapper;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0156a implements ActionMenuView.InterfaceC0114e {
        public C0156a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0114e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0161f interfaceC0161f = Toolbar.this.mOnMenuItemClickListener;
            if (interfaceC0161f != null) {
                return interfaceC0161f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0157b implements Runnable {
        public RunnableC0157b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    public class ViewOnClickListenerC0158c implements View.OnClickListener {
        public ViewOnClickListenerC0158c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0159d implements InterfaceC0092g {

        /* JADX INFO: renamed from: a */
        public MenuBuilder f741a;

        /* JADX INFO: renamed from: b */
        public MenuItemImpl f742b;

        public C0159d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof qe5) {
                ((qe5) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f742b = null;
            Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = menuItemImpl.getActionView();
            this.f742b = menuItemImpl;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                C0160e c0160eGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0160eGenerateDefaultLayoutParams.f79555a = (toolbar4.mButtonGravity & 112) | 8388611;
                c0160eGenerateDefaultLayoutParams.f744b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(c0160eGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof qe5) {
                ((qe5) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f741a;
            if (menuBuilder2 != null && (menuItemImpl = this.f742b) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.f741a = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public boolean onSubMenuSelected(SubMenuC0095j subMenuC0095j) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g
        public void updateMenuView(boolean z) {
            if (this.f742b != null) {
                MenuBuilder menuBuilder = this.f741a;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f741a.getItem(i) == this.f742b) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f741a, this.f742b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC0161f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new C0156a();
        this.mShowOverflowMenuRunnable = new RunnableC0157b();
        t0j0 t0j0VarM188782u = t0j0.m188782u(getContext(), attributeSet, gic0.f104378g3, i, 0);
        this.mTitleTextAppearance = t0j0VarM188782u.m188796n(gic0.f104263I3, 0);
        this.mSubtitleTextAppearance = t0j0VarM188782u.m188796n(gic0.f104473z3, 0);
        this.mGravity = t0j0VarM188782u.m188794l(gic0.f104383h3, this.mGravity);
        this.mButtonGravity = t0j0VarM188782u.m188794l(gic0.f104388i3, 48);
        int iM188787e = t0j0VarM188782u.m188787e(gic0.f104233C3, 0);
        iM188787e = t0j0VarM188782u.m188800r(gic0.f104258H3) ? t0j0VarM188782u.m188787e(gic0.f104258H3, iM188787e) : iM188787e;
        this.mTitleMarginBottom = iM188787e;
        this.mTitleMarginTop = iM188787e;
        this.mTitleMarginEnd = iM188787e;
        this.mTitleMarginStart = iM188787e;
        int iM188787e2 = t0j0VarM188782u.m188787e(gic0.f104248F3, -1);
        if (iM188787e2 >= 0) {
            this.mTitleMarginStart = iM188787e2;
        }
        int iM188787e3 = t0j0VarM188782u.m188787e(gic0.f104243E3, -1);
        if (iM188787e3 >= 0) {
            this.mTitleMarginEnd = iM188787e3;
        }
        int iM188787e4 = t0j0VarM188782u.m188787e(gic0.f104253G3, -1);
        if (iM188787e4 >= 0) {
            this.mTitleMarginTop = iM188787e4;
        }
        int iM188787e5 = t0j0VarM188782u.m188787e(gic0.f104238D3, -1);
        if (iM188787e5 >= 0) {
            this.mTitleMarginBottom = iM188787e5;
        }
        this.mMaxButtonHeight = t0j0VarM188782u.m188788f(gic0.f104443t3, -1);
        int iM188787e6 = t0j0VarM188782u.m188787e(gic0.f104423p3, Integer.MIN_VALUE);
        int iM188787e7 = t0j0VarM188782u.m188787e(gic0.f104403l3, Integer.MIN_VALUE);
        int iM188788f = t0j0VarM188782u.m188788f(gic0.f104413n3, 0);
        int iM188788f2 = t0j0VarM188782u.m188788f(gic0.f104418o3, 0);
        ensureContentInsets();
        this.mContentInsets.m150717e(iM188788f, iM188788f2);
        if (iM188787e6 != Integer.MIN_VALUE || iM188787e7 != Integer.MIN_VALUE) {
            this.mContentInsets.m150719g(iM188787e6, iM188787e7);
        }
        this.mContentInsetStartWithNavigation = t0j0VarM188782u.m188787e(gic0.f104428q3, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = t0j0VarM188782u.m188787e(gic0.f104408m3, Integer.MIN_VALUE);
        this.mCollapseIcon = t0j0VarM188782u.m188789g(gic0.f104398k3);
        this.mCollapseDescription = t0j0VarM188782u.m188798p(gic0.f104393j3);
        CharSequence charSequenceM188798p = t0j0VarM188782u.m188798p(gic0.f104228B3);
        if (!TextUtils.isEmpty(charSequenceM188798p)) {
            setTitle(charSequenceM188798p);
        }
        CharSequence charSequenceM188798p2 = t0j0VarM188782u.m188798p(gic0.f104468y3);
        if (!TextUtils.isEmpty(charSequenceM188798p2)) {
            setSubtitle(charSequenceM188798p2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(t0j0VarM188782u.m188796n(gic0.f104463x3, 0));
        Drawable drawableM188789g = t0j0VarM188782u.m188789g(gic0.f104458w3);
        if (drawableM188789g != null) {
            setNavigationIcon(drawableM188789g);
        }
        CharSequence charSequenceM188798p3 = t0j0VarM188782u.m188798p(gic0.f104453v3);
        if (!TextUtils.isEmpty(charSequenceM188798p3)) {
            setNavigationContentDescription(charSequenceM188798p3);
        }
        Drawable drawableM188789g2 = t0j0VarM188782u.m188789g(gic0.f104433r3);
        if (drawableM188789g2 != null) {
            setLogo(drawableM188789g2);
        }
        CharSequence charSequenceM188798p4 = t0j0VarM188782u.m188798p(gic0.f104438s3);
        if (!TextUtils.isEmpty(charSequenceM188798p4)) {
            setLogoDescription(charSequenceM188798p4);
        }
        if (t0j0VarM188782u.m188800r(gic0.f104268J3)) {
            setTitleTextColor(t0j0VarM188782u.m188785c(gic0.f104268J3));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104223A3)) {
            setSubtitleTextColor(t0j0VarM188782u.m188785c(gic0.f104223A3));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104448u3)) {
            inflateMenu(t0j0VarM188782u.m188796n(gic0.f104448u3, 0));
        }
        t0j0VarM188782u.m188801v();
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z = kkl0.m150191x(this) == 1;
        int childCount = getChildCount();
        int iM157578b = m9k.m157578b(i, kkl0.m150191x(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0160e c0160e = (C0160e) childAt.getLayoutParams();
                if (c0160e.f744b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(c0160e.f79555a) == iM157578b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0160e c0160e2 = (C0160e) childAt2.getLayoutParams();
            if (c0160e2.f744b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(c0160e2.f79555a) == iM157578b) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        C0160e c0160eGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0160eGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            c0160eGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0160e) layoutParams;
        }
        c0160eGenerateLayoutParams.f744b = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, c0160eGenerateLayoutParams);
        } else {
            view.setLayoutParams(c0160eGenerateLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new kpd0();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.m526p() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C0159d();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.m527q(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            C0160e c0160eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0160eGenerateDefaultLayoutParams.f79555a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(c0160eGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, s8c0.f166779P);
            C0160e c0160eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0160eGenerateDefaultLayoutParams.f79555a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(c0160eGenerateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int iM150191x = kkl0.m150191x(this);
        int iM157578b = m9k.m157578b(i, iM150191x) & 7;
        if (iM157578b == 1 || iM157578b == 3 || iM157578b == 5) {
            return iM157578b;
        }
        return iM150191x == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        C0160e c0160e = (C0160e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(c0160e.f79555a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0160e).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c0160e).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c0160e).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return pxw.m174249b(marginLayoutParams) + pxw.m174248a(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new g7h0(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0160e c0160e = (C0160e) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c0160e).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c0160e).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private static boolean isCustomView(View view) {
        return ((C0160e) view.getLayoutParams()).f744b == 0;
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        C0160e c0160e = (C0160e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0160e).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, childTop, iMax + measuredWidth, view.getMeasuredHeight() + childTop);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c0160e).rightMargin;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        C0160e c0160e = (C0160e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0160e).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, childTop, iMax, view.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0160e).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void addChildrenForExpandedActionView() {
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            ArrayList<View> arrayList = this.mHiddenViews;
            if (size < 0) {
                arrayList.clear();
                return;
            }
            addView(arrayList.get(size));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.m524m();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0160e);
    }

    public void collapseActionView() {
        C0159d c0159d = this.mExpandedMenuPresenter;
        MenuItemImpl menuItemImpl = c0159d == null ? null : c0159d.f742b;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.m515d();
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, s8c0.f166779P);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C0160e c0160eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0160eGenerateDefaultLayoutParams.f79555a = (this.mButtonGravity & 112) | 8388611;
            c0160eGenerateDefaultLayoutParams.f744b = 2;
            this.mCollapseButtonView.setLayoutParams(c0160eGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC0158c());
        }
    }

    @Override // android.view.ViewGroup
    public C0160e generateDefaultLayoutParams() {
        return new C0160e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0160e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0160e) {
            return new C0160e((C0160e) layoutParams);
        }
        if (layoutParams instanceof c30.C16169a) {
            return new C0160e((c30.C16169a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0160e((ViewGroup.MarginLayoutParams) layoutParams) : new C0160e(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        kpd0 kpd0Var = this.mContentInsets;
        if (kpd0Var != null) {
            return kpd0Var.m150713a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        kpd0 kpd0Var = this.mContentInsets;
        if (kpd0Var != null) {
            return kpd0Var.m150714b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        kpd0 kpd0Var = this.mContentInsets;
        if (kpd0Var != null) {
            return kpd0Var.m150715c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        kpd0 kpd0Var = this.mContentInsets;
        if (kpd0Var != null) {
            return kpd0Var.m150716d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilderM526p;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (menuBuilderM526p = actionMenuView.m526p()) == null || !menuBuilderM526p.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return kkl0.m150191x(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return kkl0.m150191x(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public qid getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C0165c(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        C0159d c0159d = this.mExpandedMenuPresenter;
        return (c0159d == null || c0159d.f742b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m521j();
    }

    public void inflateMenu(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m522k();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m523l();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0251  */
    /* JADX WARN: Code duplicated, block: B:104:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x0276  */
    /* JADX WARN: Code duplicated, block: B:107:0x0279  */
    /* JADX WARN: Code duplicated, block: B:111:0x028f A[LOOP:0: B:109:0x028b->B:111:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ab A[LOOP:1: B:113:0x02a7->B:115:0x02ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e0 A[LOOP:2: B:123:0x02dc->B:125:0x02e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x029c A[EDGE_INSN: B:128:0x029c->B:112:0x029c BREAK  A[LOOP:0: B:109:0x028b->B:111:0x028f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x02b8 A[EDGE_INSN: B:129:0x02b8->B:116:0x02b8 BREAK  A[LOOP:1: B:113:0x02a7->B:115:0x02ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x015c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0208  */
    /* JADX WARN: Code duplicated, block: B:93:0x020b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0214 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0216  */
    /* JADX WARN: Code duplicated, block: B:98:0x021a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iLayoutChildLeft;
        int iLayoutChildRight;
        int iMax;
        int iMin;
        boolean zShouldLayout;
        boolean zShouldLayout2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C0160e c0160e;
        C0160e c0160e2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int iLayoutChildLeft2;
        int i20;
        ArrayList<View> arrayList;
        int size2;
        int i21;
        ArrayList<View> arrayList2;
        int i22;
        int i23;
        int size3;
        ArrayList<View> arrayList3;
        View view;
        View view2;
        View view3;
        View view4;
        boolean z3 = kkl0.m150191x(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM150193y = kkl0.m150193y(this);
        int iMin2 = iM150193y >= 0 ? Math.min(iM150193y, i4 - i2) : 0;
        if (shouldLayout(this.mNavButtonView)) {
            View view5 = this.mNavButtonView;
            if (z3) {
                iLayoutChildRight = layoutChildRight(view5, i24, iArr, iMin2);
                iLayoutChildLeft = paddingLeft;
            } else {
                iLayoutChildLeft = layoutChildLeft(view5, paddingLeft, iArr, iMin2);
            }
            if (shouldLayout(this.mCollapseButtonView)) {
                view4 = this.mCollapseButtonView;
                if (z3) {
                    iLayoutChildRight = layoutChildRight(view4, iLayoutChildRight, iArr, iMin2);
                } else {
                    iLayoutChildLeft = layoutChildLeft(view4, iLayoutChildLeft, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mMenuView)) {
                view3 = this.mMenuView;
                if (z3) {
                    iLayoutChildLeft = layoutChildLeft(view3, iLayoutChildLeft, iArr, iMin2);
                } else {
                    iLayoutChildRight = layoutChildRight(view3, iLayoutChildRight, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iLayoutChildLeft);
            iArr[1] = Math.max(0, currentContentInsetRight - (i24 - iLayoutChildRight));
            iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft);
            iMin = Math.min(iLayoutChildRight, i24 - currentContentInsetRight);
            if (shouldLayout(this.mExpandedActionView)) {
                view2 = this.mExpandedActionView;
                if (z3) {
                    iMin = layoutChildRight(view2, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(view2, iMax, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mLogoView)) {
                view = this.mLogoView;
                if (z3) {
                    iMin = layoutChildRight(view, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(view, iMax, iArr, iMin2);
                }
            }
            zShouldLayout = shouldLayout(this.mTitleTextView);
            zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
            if (zShouldLayout) {
                C0160e c0160e3 = (C0160e) this.mTitleTextView.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) c0160e3).bottomMargin + ((ViewGroup.MarginLayoutParams) c0160e3).topMargin + this.mTitleTextView.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zShouldLayout2) {
                C0160e c0160e4 = (C0160e) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) c0160e4).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0160e4).bottomMargin;
            }
            if (!zShouldLayout || zShouldLayout2) {
                if (zShouldLayout) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zShouldLayout2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                c0160e = (C0160e) textView.getLayoutParams();
                c0160e2 = (C0160e) textView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zShouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (zShouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i6 = this.mGravity & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0160e).topMargin + this.mTitleMarginTop;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) c0160e).topMargin;
                    i16 = this.mTitleMarginTop;
                    if (iMax2 < i15 + i16) {
                        iMax2 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) c0160e).bottomMargin;
                        i19 = this.mTitleMarginBottom;
                        if (i17 < i18 + i19) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0160e2).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0160e2).bottomMargin) - this.mTitleMarginBottom) - i5;
                }
                if (z3) {
                    if (z2) {
                        i12 = this.mTitleMarginStart;
                    } else {
                        i12 = 0;
                    }
                    int i25 = i12 - iArr[1];
                    iMin -= Math.max(0, i25);
                    iArr[1] = Math.max(0, -i25);
                    if (zShouldLayout) {
                        C0160e c0160e5 = (C0160e) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0160e5).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zShouldLayout2) {
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0160e) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i26, iMin, this.mSubtitleTextView.getMeasuredHeight() + i26);
                        i14 = iMin - this.mTitleMarginEnd;
                    } else {
                        i14 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i13, i14);
                    }
                    iMax = i7;
                    i9 = 0;
                } else {
                    if (z2) {
                        i8 = this.mTitleMarginStart;
                    } else {
                        i8 = 0;
                    }
                    i9 = 0;
                    int i27 = i8 - iArr[0];
                    iMax = i7 + Math.max(0, i27);
                    iArr[0] = Math.max(0, -i27);
                    if (zShouldLayout) {
                        C0160e c0160e6 = (C0160e) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i10 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0160e6).bottomMargin;
                    } else {
                        i10 = iMax;
                    }
                    if (zShouldLayout2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0160e) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                        this.mSubtitleTextView.layout(iMax, i28, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i28);
                        i11 = measuredWidth3 + this.mTitleMarginEnd;
                    } else {
                        i11 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i10, i11);
                    }
                }
            } else {
                i9 = 0;
            }
            addCustomViewsWithGravity(this.mTempViews, 3);
            size = this.mTempViews.size();
            iLayoutChildLeft2 = iMax;
            i20 = i9;
            while (true) {
                arrayList = this.mTempViews;
                if (i20 < size) {
                    break;
                }
                iLayoutChildLeft2 = layoutChildLeft(arrayList.get(i20), iLayoutChildLeft2, iArr, iMin2);
                i20++;
            }
            addCustomViewsWithGravity(arrayList, 5);
            size2 = this.mTempViews.size();
            i21 = i9;
            while (true) {
                arrayList2 = this.mTempViews;
                if (i21 < size2) {
                    break;
                }
                iMin = layoutChildRight(arrayList2.get(i21), iMin, iArr, iMin2);
                i21++;
            }
            addCustomViewsWithGravity(arrayList2, 1);
            int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
            i22 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (viewListMeasuredWidth / 2);
            i23 = viewListMeasuredWidth + i22;
            if (i22 >= iLayoutChildLeft2) {
                if (i23 > iMin) {
                    iLayoutChildLeft2 = i22 - (i23 - iMin);
                } else {
                    iLayoutChildLeft2 = i22;
                }
            }
            size3 = this.mTempViews.size();
            while (true) {
                arrayList3 = this.mTempViews;
                if (i9 < size3) {
                    arrayList3.clear();
                    return;
                } else {
                    iLayoutChildLeft2 = layoutChildLeft(arrayList3.get(i9), iLayoutChildLeft2, iArr, iMin2);
                    i9++;
                }
            }
        } else {
            iLayoutChildLeft = paddingLeft;
        }
        iLayoutChildRight = i24;
        if (shouldLayout(this.mCollapseButtonView)) {
            view4 = this.mCollapseButtonView;
            if (z3) {
                iLayoutChildRight = layoutChildRight(view4, iLayoutChildRight, iArr, iMin2);
            } else {
                iLayoutChildLeft = layoutChildLeft(view4, iLayoutChildLeft, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mMenuView)) {
            view3 = this.mMenuView;
            if (z3) {
                iLayoutChildLeft = layoutChildLeft(view3, iLayoutChildLeft, iArr, iMin2);
            } else {
                iLayoutChildRight = layoutChildRight(view3, iLayoutChildRight, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iLayoutChildLeft);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - iLayoutChildRight));
        iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft2);
        iMin = Math.min(iLayoutChildRight, i24 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
            view2 = this.mExpandedActionView;
            if (z3) {
                iMin = layoutChildRight(view2, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(view2, iMax, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mLogoView)) {
            view = this.mLogoView;
            if (z3) {
                iMin = layoutChildRight(view, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(view, iMax, iArr, iMin2);
            }
        }
        zShouldLayout = shouldLayout(this.mTitleTextView);
        zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (zShouldLayout) {
            C0160e c0160e7 = (C0160e) this.mTitleTextView.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) c0160e7).bottomMargin + ((ViewGroup.MarginLayoutParams) c0160e7).topMargin + this.mTitleTextView.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zShouldLayout2) {
            C0160e c0160e8 = (C0160e) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) c0160e8).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0160e8).bottomMargin;
        }
        if (zShouldLayout) {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c0160e = (C0160e) textView.getLayoutParams();
            c0160e2 = (C0160e) textView2.getLayoutParams();
            i5 = measuredHeight;
            if (zShouldLayout) {
            }
            i6 = this.mGravity & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0160e).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c0160e).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax2 < i15 + i16) {
                    iMax2 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c0160e).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0160e2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0160e2).bottomMargin) - this.mTitleMarginBottom) - i5;
            }
            if (z3) {
                if (z2) {
                    i12 = this.mTitleMarginStart;
                } else {
                    i12 = 0;
                }
                int i29 = i12 - iArr[1];
                iMin -= Math.max(0, i29);
                iArr[1] = Math.max(0, -i29);
                if (zShouldLayout) {
                    C0160e c0160e9 = (C0160e) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c0160e9).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zShouldLayout2) {
                    int i210 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0160e) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i210, iMin, this.mSubtitleTextView.getMeasuredHeight() + i210);
                    i14 = iMin - this.mTitleMarginEnd;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                iMax = i7;
                i9 = 0;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                } else {
                    i8 = 0;
                }
                i9 = 0;
                int i211 = i8 - iArr[0];
                iMax = i7 + Math.max(0, i211);
                iArr[0] = Math.max(0, -i211);
                if (zShouldLayout) {
                    C0160e c0160e10 = (C0160e) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i10 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c0160e10).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zShouldLayout2) {
                    int i212 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0160e) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i212, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i212);
                    i11 = measuredWidth6 + this.mTitleMarginEnd;
                } else {
                    i11 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i10, i11);
                }
            }
        } else {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c0160e = (C0160e) textView.getLayoutParams();
            c0160e2 = (C0160e) textView2.getLayoutParams();
            i5 = measuredHeight;
            if (zShouldLayout) {
            }
            i6 = this.mGravity & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0160e).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c0160e).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax2 < i15 + i16) {
                    iMax2 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c0160e).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0160e2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0160e2).bottomMargin) - this.mTitleMarginBottom) - i5;
            }
            if (z3) {
                if (z2) {
                    i12 = this.mTitleMarginStart;
                } else {
                    i12 = 0;
                }
                int i213 = i12 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zShouldLayout) {
                    C0160e c0160e11 = (C0160e) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c0160e11).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zShouldLayout2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0160e) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i214, iMin, this.mSubtitleTextView.getMeasuredHeight() + i214);
                    i14 = iMin - this.mTitleMarginEnd;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                iMax = i7;
                i9 = 0;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                } else {
                    i8 = 0;
                }
                i9 = 0;
                int i215 = i8 - iArr[0];
                iMax = i7 + Math.max(0, i215);
                iArr[0] = Math.max(0, -i215);
                if (zShouldLayout) {
                    C0160e c0160e12 = (C0160e) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i10 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c0160e12).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zShouldLayout2) {
                    int i216 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0160e) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i216, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i216);
                    i11 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i11 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i10, i11);
                }
            }
        }
        addCustomViewsWithGravity(this.mTempViews, 3);
        size = this.mTempViews.size();
        iLayoutChildLeft2 = iMax;
        i20 = i9;
        while (true) {
            arrayList = this.mTempViews;
            if (i20 < size) {
                break;
                break;
            } else {
                iLayoutChildLeft2 = layoutChildLeft(arrayList.get(i20), iLayoutChildLeft2, iArr, iMin2);
                i20++;
            }
        }
        addCustomViewsWithGravity(arrayList, 5);
        size2 = this.mTempViews.size();
        i21 = i9;
        while (true) {
            arrayList2 = this.mTempViews;
            if (i21 < size2) {
                break;
                break;
            } else {
                iMin = layoutChildRight(arrayList2.get(i21), iMin, iArr, iMin2);
                i21++;
            }
        }
        addCustomViewsWithGravity(arrayList2, 1);
        int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
        i22 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (viewListMeasuredWidth2 / 2);
        i23 = viewListMeasuredWidth2 + i22;
        if (i22 >= iLayoutChildLeft2) {
            if (i23 > iMin) {
                iLayoutChildLeft2 = i22 - (i23 - iMin);
            } else {
                iLayoutChildLeft2 = i22;
            }
        }
        size3 = this.mTempViews.size();
        while (true) {
            arrayList3 = this.mTempViews;
            if (i9 < size3) {
                arrayList3.clear();
                return;
            } else {
                iLayoutChildLeft2 = layoutChildLeft(arrayList3.get(i9), iLayoutChildLeft2, iArr, iMin2);
                i9++;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.mTempMargins;
        boolean zM146265b = jnl0.m146265b(this);
        int i3 = !zM146265b ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zM146265b ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iArr = iArr2;
            iMax4 += measureChildCollapseMargins(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (shouldLayout(this.mLogoView)) {
            iMax4 += measureChildCollapseMargins(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C0160e) childAt.getLayoutParams()).f744b == 0 && shouldLayout(childAt)) {
                iMax4 += measureChildCollapseMargins(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i7 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, i5 + i7, i2, i6, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, measureChildCollapseMargins(this.mSubtitleTextView, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        MenuBuilder menuBuilderM526p = actionMenuView != null ? actionMenuView.m526p() : null;
        int i = savedState.expandedMenuItemId;
        if (i != 0 && this.mExpandedMenuPresenter != null && menuBuilderM526p != null && (menuItemFindItem = menuBuilderM526p.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.isOverflowOpen) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        this.mContentInsets.m150718f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0159d c0159d = this.mExpandedMenuPresenter;
        if (c0159d != null && (menuItemImpl = c0159d.f742b) != null) {
            savedState.expandedMenuItemId = menuItemImpl.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0160e) childAt.getLayoutParams()).f744b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.m150717e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.m150719g(i, i2);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenu(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        MenuBuilder menuBuilderM526p = this.mMenuView.m526p();
        if (menuBuilderM526p == menuBuilder) {
            return;
        }
        if (menuBuilderM526p != null) {
            menuBuilderM526p.removeMenuPresenter(this.mOuterActionMenuPresenter);
            menuBuilderM526p.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C0159d();
        }
        actionMenuPresenter.m509y(true);
        Context context = this.mPopupContext;
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, context);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(context, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(InterfaceC0092g.a aVar, MenuBuilder.InterfaceC0079a interfaceC0079a) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = interfaceC0079a;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.m527q(aVar, interfaceC0079a);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0161f interfaceC0161f) {
        this.mOnMenuItemClickListener = interfaceC0161f;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mSubtitleTextView;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else if (textView != null && isChildOrHidden(textView)) {
            removeView(this.mSubtitleTextView);
            this.mHiddenViews.remove(this.mSubtitleTextView);
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else if (textView != null && isChildOrHidden(textView)) {
            removeView(this.mTitleTextView);
            this.mHiddenViews.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m528r();
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0160e extends c30.C16169a {

        /* JADX INFO: renamed from: b */
        public int f744b;

        public C0160e(int i, int i2) {
            super(i, i2);
            this.f744b = 0;
            this.f79555a = 8388627;
        }

        /* JADX INFO: renamed from: a */
        public void m609a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0160e(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f744b = 0;
        }

        public C0160e(C0160e c0160e) {
            super((c30.C16169a) c0160e);
            this.f744b = 0;
            this.f744b = c0160e.f744b;
        }

        public C0160e(c30.C16169a c16169a) {
            super(c16169a);
            this.f744b = 0;
        }

        public C0160e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f744b = 0;
            m609a(marginLayoutParams);
        }

        public C0160e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f744b = 0;
        }
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0155a();
        int expandedMenuItemId;
        boolean isOverflowOpen;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public static class C0155a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(tu0.m192702b(getContext(), i));
    }

    @Override // android.view.ViewGroup
    public C0160e generateLayoutParams(AttributeSet attributeSet) {
        return new C0160e(getContext(), attributeSet);
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(tu0.m192702b(getContext(), i));
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(tu0.m192702b(getContext(), i));
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166780Q);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
