package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C2489R;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import p153l.dgq0;
import p153l.g7h0;
import p153l.j26;
import p153l.kkl0;
import p153l.s8c0;
import p153l.t0j0;
import p153l.tu0;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final int[] tmpLocation;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int iM188796n;
        boolean z;
        super(context, attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        NavigationMenu navigationMenu = new NavigationMenu(context);
        this.menu = navigationMenu;
        t0j0 t0j0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context, attributeSet, C2489R.styleable.NavigationView, i, C2489R.style.Widget_Design_NavigationView, new int[0]);
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_android_background)) {
            kkl0.m150170m0(this, t0j0VarObtainTintedStyledAttributes.m188789g(C2489R.styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.initializeElevationOverlay(context);
            kkl0.m150170m0(this, materialShapeDrawable);
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_elevation)) {
            setElevation(t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListM188785c = t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_itemIconTint) ? t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.NavigationView_itemIconTint) : createDefaultColorStateList(R.attr.textColorSecondary);
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_itemTextAppearance)) {
            iM188796n = t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            iM188796n = 0;
            z = false;
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListM188785c2 = t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_itemTextColor) ? t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.NavigationView_itemTextColor) : null;
        if (!z && colorStateListM188785c2 == null) {
            colorStateListM188785c2 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM188789g = t0j0VarObtainTintedStyledAttributes.m188789g(C2489R.styleable.NavigationView_itemBackground);
        if (drawableM188789g == null && hasShapeAppearance(t0j0VarObtainTintedStyledAttributes)) {
            drawableM188789g = createDefaultItemBackground(t0j0VarObtainTintedStyledAttributes);
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_itemHorizontalPadding)) {
            navigationMenuPresenter.setItemHorizontalPadding(t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.NavigationView_itemHorizontalPadding, 0));
        }
        int iM188788f = t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new MenuBuilder.InterfaceC0079a() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context, navigationMenu);
        navigationMenuPresenter.setItemIconTintList(colorStateListM188785c);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (z) {
            navigationMenuPresenter.setItemTextAppearance(iM188796n);
        }
        navigationMenuPresenter.setItemTextColor(colorStateListM188785c2);
        navigationMenuPresenter.setItemBackground(drawableM188789g);
        navigationMenuPresenter.setItemIconPadding(iM188788f);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_menu)) {
            inflateMenu(t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.NavigationView_menu, 0));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.NavigationView_headerLayout, 0));
        }
        t0j0VarObtainTintedStyledAttributes.m188801v();
        setupInsetScrimsListener();
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM192701a = tu0.m192701a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(s8c0.f166805y, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM192701a.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM192701a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    private final Drawable createDefaultItemBackground(@NonNull t0j0 t0j0Var) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), t0j0Var.m188796n(C2489R.styleable.NavigationView_itemShapeAppearance, 0), t0j0Var.m188796n(C2489R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(MaterialResources.getColorStateList(getContext(), t0j0Var, C2489R.styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) materialShapeDrawable, t0j0Var.m188788f(C2489R.styleable.NavigationView_itemShapeInsetStart, 0), t0j0Var.m188788f(C2489R.styleable.NavigationView_itemShapeInsetTop, 0), t0j0Var.m188788f(C2489R.styleable.NavigationView_itemShapeInsetEnd, 0), t0j0Var.m188788f(C2489R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new g7h0(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull t0j0 t0j0Var) {
        return t0j0Var.m188800r(C2489R.styleable.NavigationView_itemShapeAppearance) || t0j0Var.m188800r(C2489R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z);
                NavigationView.this.setDrawTopInsetForeground(z);
                Context context = NavigationView.this.getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    NavigationView.this.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0));
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull dgq0 dgq0Var) {
        this.presenter.dispatchApplyWindowInsets(dgq0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) menuItemFindItem);
        } else {
            wg3.m206174a("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(j26.m143192e(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) menuItemFindItem);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2489R.attr.navigationViewStyle);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }
}
