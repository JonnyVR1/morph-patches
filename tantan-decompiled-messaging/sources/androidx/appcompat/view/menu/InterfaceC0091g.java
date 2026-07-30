package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface InterfaceC0091g {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo345a(MenuBuilder menuBuilder);

        void onCloseMenu(MenuBuilder menuBuilder, boolean z);
    }

    boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, MenuBuilder menuBuilder);

    void onCloseMenu(MenuBuilder menuBuilder, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC0094j subMenuC0094j);

    void setCallback(a aVar);

    void updateMenuView(boolean z);
}
