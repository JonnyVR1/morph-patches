package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0093h;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.C2489R;
import p153l.C15967bc;
import p153l.C16932fb;
import p153l.c5d0;
import p153l.h2j0;
import p153l.kkl0;
import p153l.msi0;
import p153l.oce;
import p153l.s8c0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC0093h.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final C16932fb accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private MenuItemImpl itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16932fb c16932fb = new C16932fb() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // p153l.C16932fb
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull C15967bc c15967bc) {
                super.onInitializeAccessibilityNodeInfo(view, c15967bc);
                c15967bc.m103427m0(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c16932fb;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C2489R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C2489R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C2489R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        kkl0.m150164j0(checkedTextView, c16932fb);
    }

    private void adjustAppearance() {
        boolean zShouldExpandActionArea = shouldExpandActionArea();
        CheckedTextView checkedTextView = this.textView;
        if (zShouldExpandActionArea) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                LinearLayoutCompat.C0132a c0132a = (LinearLayoutCompat.C0132a) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0132a).width = -1;
                this.actionArea.setLayoutParams(c0132a);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            LinearLayoutCompat.C0132a c0132a2 = (LinearLayoutCompat.C0132a) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0132a2).width = -2;
            this.actionArea.setLayoutParams(c0132a2);
        }
    }

    @Nullable
    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(s8c0.f166803w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C2489R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h.a
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h.a
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            kkl0.m150170m0(this, createDefaultBackground());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        h2j0.m133392a(this, menuItemImpl.getTooltipText());
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = oce.m167178r(drawable).mutate();
                oce.m167175o(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM108035e = c5d0.m108035e(getResources(), C2489R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = drawableM108035e;
                if (drawableM108035e != null) {
                    int i2 = this.iconSize;
                    drawableM108035e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        msi0.m159812j(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.iconSize = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        msi0.m159817o(this.textView, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }
}
