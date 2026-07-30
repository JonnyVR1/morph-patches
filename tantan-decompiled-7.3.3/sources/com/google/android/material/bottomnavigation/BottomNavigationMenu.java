package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BottomNavigationMenu extends MenuBuilder {
    public static final int MAX_ITEM_COUNT = 5;

    public BottomNavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > 5) {
            wg3.m206174a("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
            return null;
        }
        stopDispatchingItemsChanged();
        MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
        if (menuItemAddInternal instanceof MenuItemImpl) {
            ((MenuItemImpl) menuItemAddInternal).setExclusiveCheckable(true);
        }
        startDispatchingItemsChanged();
        return menuItemAddInternal;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
