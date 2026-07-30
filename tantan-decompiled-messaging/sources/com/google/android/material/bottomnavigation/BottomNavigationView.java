package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C2466R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import p149l.e16;
import p149l.gbl0;
import p149l.kbe;
import p149l.qri0;
import p149l.y6q0;
import p149l.yyg0;

/* JADX INFO: loaded from: classes7.dex */
public class BottomNavigationView extends FrameLayout {
    private static final int DEF_STYLE_RES = C2466R.style.Widget_Design_BottomNavigationView;
    private static final int MENU_PRESENTER_ID = 1;

    @Nullable
    private ColorStateList itemRippleColor;

    @NonNull
    private final MenuBuilder menu;
    private MenuInflater menuInflater;

    @NonNull
    @VisibleForTesting
    final BottomNavigationMenuView menuView;
    private final BottomNavigationPresenter presenter;
    private OnNavigationItemReselectedListener reselectedListener;
    private OnNavigationItemSelectedListener selectedListener;

    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(ThemeEnforcement.createThemedContext(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.presenter = bottomNavigationPresenter;
        Context context2 = getContext();
        MenuBuilder bottomNavigationMenu = new BottomNavigationMenu(context2);
        this.menu = bottomNavigationMenu;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.menuView = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.setBottomNavigationMenuView(bottomNavigationMenuView);
        bottomNavigationPresenter.setId(1);
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        bottomNavigationMenu.addMenuPresenter(bottomNavigationPresenter);
        bottomNavigationPresenter.initForMenu(getContext(), bottomNavigationMenu);
        qri0 qri0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C2466R.styleable.BottomNavigationView, i, C2466R.style.Widget_Design_BottomNavigationView, C2466R.styleable.BottomNavigationView_itemTextAppearanceInactive, C2466R.styleable.BottomNavigationView_itemTextAppearanceActive);
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.BottomNavigationView_itemIconTint)) {
            bottomNavigationMenuView.setIconTintList(qri0VarObtainTintedStyledAttributes.m175996c(C2466R.styleable.BottomNavigationView_itemIconTint));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.createDefaultColorStateList(R.attr.textColorSecondary));
        }
        setItemIconSize(qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C2466R.dimen.design_bottom_navigation_icon_size)));
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.BottomNavigationView_itemTextColor)) {
            setItemTextColor(qri0VarObtainTintedStyledAttributes.m175996c(C2466R.styleable.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            gbl0.m125207m0(this, createMaterialShapeDrawableBackground(context2));
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.BottomNavigationView_elevation)) {
            gbl0.m125215q0(this, qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.BottomNavigationView_elevation, 0));
        }
        kbe.m145281o(getBackground().mutate(), MaterialResources.getColorStateList(context2, qri0VarObtainTintedStyledAttributes, C2466R.styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(qri0VarObtainTintedStyledAttributes.m176005l(C2466R.styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(qri0VarObtainTintedStyledAttributes.m175994a(C2466R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int iM176007n = qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.BottomNavigationView_itemBackground, 0);
        if (iM176007n != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(iM176007n);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, qri0VarObtainTintedStyledAttributes, C2466R.styleable.BottomNavigationView_itemRippleColor));
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.BottomNavigationView_menu)) {
            inflateMenu(qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.BottomNavigationView_menu, 0));
        }
        qri0VarObtainTintedStyledAttributes.m176012v();
        addView(bottomNavigationMenuView, layoutParams);
        bottomNavigationMenu.setCallback(new MenuBuilder.InterfaceC0078a() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                if (BottomNavigationView.this.reselectedListener == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                    return (BottomNavigationView.this.selectedListener == null || BottomNavigationView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                BottomNavigationView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        applyWindowInsets();
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(e16.m114375c(context, C2466R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C2466R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public y6q0 onApplyWindowInsets(View view, @NonNull y6q0 y6q0Var, @NonNull ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom += y6q0Var.m213182i();
                relativePadding.applyToView(view);
                return y6q0Var;
            }
        });
    }

    @NonNull
    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new yyg0(getContext());
        }
        return this.menuInflater;
    }

    @Nullable
    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    @IdRes
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.menuView.isItemHorizontalTranslationEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.menuView.setItemBackground(drawable);
        this.itemRippleColor = null;
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.menuView.setItemBackgroundRes(i);
        this.itemRippleColor = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.menuView.isItemHorizontalTranslationEnabled() != z) {
            this.menuView.setItemHorizontalTranslationEnabled(z);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.itemRippleColor == colorStateList) {
            if (colorStateList != null || this.menuView.getItemBackground() == null) {
                return;
            }
            this.menuView.setItemBackground(null);
            return;
        }
        this.itemRippleColor = colorStateList;
        if (colorStateList == null) {
            this.menuView.setItemBackground(null);
        } else {
            this.menuView.setItemBackground(new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.reselectedListener = onNavigationItemReselectedListener;
    }

    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.selectedListener = onNavigationItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem == null || this.menu.performItemAction(menuItemFindItem, this.presenter, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        @Nullable
        Bundle menuPresenterState;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        private void readFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2466R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, null);
    }
}
