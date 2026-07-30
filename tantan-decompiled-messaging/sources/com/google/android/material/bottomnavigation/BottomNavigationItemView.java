package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.InterfaceC0092h;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.google.android.material.C2466R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import p149l.dti0;
import p149l.e16;
import p149l.gbl0;
import p149l.ha80;
import p149l.kbe;
import p149l.mji0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends FrameLayout implements InterfaceC0092h.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int INVALID_ITEM_POSITION = -1;

    @Nullable
    private BadgeDrawable badgeDrawable;
    private final int defaultMargin;
    private ImageView icon;

    @Nullable
    private ColorStateList iconTint;
    private boolean isShifting;

    @Nullable
    private MenuItemImpl itemData;
    private int itemPosition;
    private int labelVisibilityMode;
    private final TextView largeLabel;

    @Nullable
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;

    @Nullable
    private Drawable wrappedIconDrawable;

    public BottomNavigationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.itemPosition = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C2466R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(C2466R.drawable.design_bottom_navigation_item_background);
        this.defaultMargin = resources.getDimensionPixelSize(C2466R.dimen.design_bottom_navigation_margin);
        this.icon = (ImageView) findViewById(C2466R.id.icon);
        TextView textView = (TextView) findViewById(C2466R.id.smallLabel);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(C2466R.id.largeLabel);
        this.largeLabel = textView2;
        gbl0.m125221t0(textView, 2);
        gbl0.m125221t0(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (BottomNavigationItemView.this.icon.getVisibility() == 0) {
                        BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                        bottomNavigationItemView.tryUpdateBadgeBounds(bottomNavigationItemView.icon);
                    }
                }
            });
        }
        gbl0.m125201j0(this, null);
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    @Nullable
    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view == imageView && BadgeUtils.USE_COMPAT_PARENT) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private void setViewLayoutParams(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void setViewValues(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private void tryAttachBadgeToAnchor(@Nullable View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(@Nullable View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
            this.badgeDrawable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h.a
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h.a
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        dti0.m113570a(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
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

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable == null || !badgeDrawable.isVisible()) {
            return;
        }
        CharSequence title = this.itemData.getTitle();
        if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
            title = this.itemData.getContentDescription();
        }
        accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        this.badgeDrawable = badgeDrawable;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.largeLabel;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.largeLabel;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.smallLabel;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.smallLabel;
        textView4.setPivotY(textView4.getBaseline());
        int i = this.labelVisibilityMode;
        if (i != -1) {
            if (i == 0) {
                ImageView imageView = this.icon;
                if (z) {
                    setViewLayoutParams(imageView, this.defaultMargin, 49);
                    setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                } else {
                    setViewLayoutParams(imageView, this.defaultMargin, 17);
                    setViewValues(this.largeLabel, 0.5f, 0.5f, 4);
                }
                this.smallLabel.setVisibility(4);
            } else if (i == 1) {
                ImageView imageView2 = this.icon;
                if (z) {
                    setViewLayoutParams(imageView2, (int) (this.defaultMargin + this.shiftAmount), 49);
                    setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                    TextView textView5 = this.smallLabel;
                    float f = this.scaleUpFactor;
                    setViewValues(textView5, f, f, 4);
                } else {
                    setViewLayoutParams(imageView2, this.defaultMargin, 49);
                    TextView textView6 = this.largeLabel;
                    float f2 = this.scaleDownFactor;
                    setViewValues(textView6, f2, f2, 4);
                    setViewValues(this.smallLabel, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                setViewLayoutParams(this.icon, this.defaultMargin, 17);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
            }
        } else if (this.isShifting) {
            ImageView imageView3 = this.icon;
            if (z) {
                setViewLayoutParams(imageView3, this.defaultMargin, 49);
                setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
            } else {
                setViewLayoutParams(imageView3, this.defaultMargin, 17);
                setViewValues(this.largeLabel, 0.5f, 0.5f, 4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            ImageView imageView4 = this.icon;
            if (z) {
                setViewLayoutParams(imageView4, (int) (this.defaultMargin + this.shiftAmount), 49);
                setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView7 = this.smallLabel;
                float f3 = this.scaleUpFactor;
                setViewValues(textView7, f3, f3, 4);
            } else {
                setViewLayoutParams(imageView4, this.defaultMargin, 49);
                TextView textView8 = this.largeLabel;
                float f4 = this.scaleDownFactor;
                setViewValues(textView8, f4, f4, 4);
                setViewValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        if (z) {
            gbl0.m125148A0(this, ha80.m130070b(getContext(), 1002));
        } else {
            gbl0.m125148A0(this, null);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = kbe.m145284r(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                kbe.m145281o(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        kbe.m145281o(drawable, colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        gbl0.m125207m0(this, drawable);
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            MenuItemImpl menuItemImpl = this.itemData;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            MenuItemImpl menuItemImpl = this.itemData;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        mji0.m154821o(this.largeLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        mji0.m154821o(this.smallLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        dti0.m113570a(this, charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : e16.m114377e(getContext(), i));
    }

    public BottomNavigationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(@NonNull Context context) {
        this(context, null);
    }
}
