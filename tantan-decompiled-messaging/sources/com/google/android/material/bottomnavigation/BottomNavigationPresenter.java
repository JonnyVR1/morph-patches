package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.InterfaceC0092h;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuC0094j;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationPresenter implements InterfaceC0091g {

    /* JADX INFO: renamed from: id */
    private int f10583id;
    private MenuBuilder menu;
    private BottomNavigationMenuView menuView;
    private boolean updateSuspended = false;

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public int getId() {
        return this.f10583id;
    }

    public InterfaceC0092h getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
        this.menuView.initialize(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.setBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean onSubMenuSelected(SubMenuC0094j subMenuC0094j) {
        return false;
    }

    public void setBottomNavigationMenuView(BottomNavigationMenuView bottomNavigationMenuView) {
        this.menuView = bottomNavigationMenuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void setCallback(InterfaceC0091g.a aVar) {
    }

    public void setId(int i) {
        this.f10583id = i;
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        BottomNavigationMenuView bottomNavigationMenuView = this.menuView;
        if (z) {
            bottomNavigationMenuView.buildMenuView();
        } else {
            bottomNavigationMenuView.updateMenuView();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        @Nullable
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public SavedState(@NonNull Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        public SavedState() {
        }
    }
}
