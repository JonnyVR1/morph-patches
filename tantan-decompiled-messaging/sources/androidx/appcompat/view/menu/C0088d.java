package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0088d extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public MenuBuilder f423a;

    /* JADX INFO: renamed from: b */
    public int f424b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f425c;

    /* JADX INFO: renamed from: d */
    public final boolean f426d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f427e;

    /* JADX INFO: renamed from: f */
    public final int f428f;

    public C0088d(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.f426d = z;
        this.f427e = layoutInflater;
        this.f423a = menuBuilder;
        this.f428f = i;
        m427a();
    }

    /* JADX INFO: renamed from: a */
    public void m427a() {
        MenuItemImpl expandedItem = this.f423a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> nonActionItems = this.f423a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.f424b = i;
                    return;
                }
            }
        }
        this.f424b = -1;
    }

    /* JADX INFO: renamed from: b */
    public MenuBuilder m428b() {
        return this.f423a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MenuItemImpl getItem(int i) {
        boolean z = this.f426d;
        MenuBuilder menuBuilder = this.f423a;
        ArrayList<MenuItemImpl> nonActionItems = z ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems();
        int i2 = this.f424b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }

    /* JADX INFO: renamed from: d */
    public void m430d(boolean z) {
        this.f425c = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        boolean z = this.f426d;
        MenuBuilder menuBuilder = this.f423a;
        ArrayList<MenuItemImpl> nonActionItems = z ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems();
        return this.f424b < 0 ? nonActionItems.size() : nonActionItems.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f427e.inflate(this.f428f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f423a.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0092h.a aVar = (InterfaceC0092h.a) view;
        if (this.f425c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m427a();
        super.notifyDataSetChanged();
    }
}
