package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface InterfaceC0092h {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.h$a */
    public interface a {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl, int i);

        boolean prefersCondensedTitle();
    }

    void initialize(MenuBuilder menuBuilder);
}
