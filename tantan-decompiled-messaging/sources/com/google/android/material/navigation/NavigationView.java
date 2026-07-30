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
import com.google.android.material.C2466R;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import p149l.e16;
import p149l.gbl0;
import p149l.ig3;
import p149l.n0c0;
import p149l.nu0;
import p149l.qri0;
import p149l.y6q0;
import p149l.yyg0;

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
        int iM176007n;
        boolean z;
        super(context, attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        NavigationMenu navigationMenu = new NavigationMenu(context);
        this.menu = navigationMenu;
        qri0 qri0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context, attributeSet, C2466R.styleable.NavigationView, i, C2466R.style.Widget_Design_NavigationView, new int[0]);
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_android_background)) {
            gbl0.m125207m0(this, qri0VarObtainTintedStyledAttributes.m176000g(C2466R.styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.initializeElevationOverlay(context);
            gbl0.m125207m0(this, materialShapeDrawable);
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_elevation)) {
            setElevation(qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(qri0VarObtainTintedStyledAttributes.m175994a(C2466R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListM175996c = qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_itemIconTint) ? qri0VarObtainTintedStyledAttributes.m175996c(C2466R.styleable.NavigationView_itemIconTint) : createDefaultColorStateList(R.attr.textColorSecondary);
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_itemTextAppearance)) {
            iM176007n = qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            iM176007n = 0;
            z = false;
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListM175996c2 = qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_itemTextColor) ? qri0VarObtainTintedStyledAttributes.m175996c(C2466R.styleable.NavigationView_itemTextColor) : null;
        if (!z && colorStateListM175996c2 == null) {
            colorStateListM175996c2 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM176000g = qri0VarObtainTintedStyledAttributes.m176000g(C2466R.styleable.NavigationView_itemBackground);
        if (drawableM176000g == null && hasShapeAppearance(qri0VarObtainTintedStyledAttributes)) {
            drawableM176000g = createDefaultItemBackground(qri0VarObtainTintedStyledAttributes);
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_itemHorizontalPadding)) {
            navigationMenuPresenter.setItemHorizontalPadding(qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.NavigationView_itemHorizontalPadding, 0));
        }
        int iM175999f = qri0VarObtainTintedStyledAttributes.m175999f(C2466R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(qri0VarObtainTintedStyledAttributes.m176004k(C2466R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new MenuBuilder.InterfaceC0078a() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context, navigationMenu);
        navigationMenuPresenter.setItemIconTintList(colorStateListM175996c);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (z) {
            navigationMenuPresenter.setItemTextAppearance(iM176007n);
        }
        navigationMenuPresenter.setItemTextColor(colorStateListM175996c2);
        navigationMenuPresenter.setItemBackground(drawableM176000g);
        navigationMenuPresenter.setItemIconPadding(iM175999f);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_menu)) {
            inflateMenu(qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.NavigationView_menu, 0));
        }
        if (qri0VarObtainTintedStyledAttributes.m176011r(C2466R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(qri0VarObtainTintedStyledAttributes.m176007n(C2466R.styleable.NavigationView_headerLayout, 0));
        }
        qri0VarObtainTintedStyledAttributes.m176012v();
        setupInsetScrimsListener();
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM161423a = nu0.m161423a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(n0c0.f136533y, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM161423a.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM161423a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    private final Drawable createDefaultItemBackground(@NonNull qri0 qri0Var) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), qri0Var.m176007n(C2466R.styleable.NavigationView_itemShapeAppearance, 0), qri0Var.m176007n(C2466R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(MaterialResources.getColorStateList(getContext(), qri0Var, C2466R.styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) materialShapeDrawable, qri0Var.m175999f(C2466R.styleable.NavigationView_itemShapeInsetStart, 0), qri0Var.m175999f(C2466R.styleable.NavigationView_itemShapeInsetTop, 0), qri0Var.m175999f(C2466R.styleable.NavigationView_itemShapeInsetEnd, 0), qri0Var.m175999f(C2466R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new yyg0(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull qri0 qri0Var) {
        return qri0Var.m176011r(C2466R.styleable.NavigationView_itemShapeAppearance) || qri0Var.m176011r(C2466R.styleable.NavigationView_itemShapeAppearanceOverlay);
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
    public void onInsetsChanged(@NonNull y6q0 y6q0Var) {
        this.presenter.dispatchApplyWindowInsets(y6q0Var);
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
            ig3.m135964a("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
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
        setItemBackground(e16.m114377e(getContext(), i));
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
        this(context, attributeSet, C2466R.attr.navigationViewStyle);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }
}
