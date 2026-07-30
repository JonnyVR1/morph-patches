package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import p149l.g7c0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0087c implements InterfaceC0091g, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f411a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f412b;

    /* JADX INFO: renamed from: c */
    public MenuBuilder f413c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f414d;

    /* JADX INFO: renamed from: e */
    public int f415e;

    /* JADX INFO: renamed from: f */
    public int f416f;

    /* JADX INFO: renamed from: g */
    public int f417g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0091g.a f418h;

    /* JADX INFO: renamed from: i */
    public a f419i;

    /* JADX INFO: renamed from: j */
    public int f420j;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.c$a */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public int f421a = -1;

        public a() {
            m425a();
        }

        /* JADX INFO: renamed from: a */
        public void m425a() {
            MenuItemImpl expandedItem = C0087c.this.f413c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> nonActionItems = C0087c.this.f413c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.f421a = i;
                        return;
                    }
                }
            }
            this.f421a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItemImpl getItem(int i) {
            ArrayList<MenuItemImpl> nonActionItems = C0087c.this.f413c.getNonActionItems();
            int i2 = i + C0087c.this.f415e;
            int i3 = this.f421a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0087c.this.f413c.getNonActionItems().size() - C0087c.this.f415e;
            return this.f421a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0087c c0087c = C0087c.this;
                view = c0087c.f412b.inflate(c0087c.f417g, viewGroup, false);
            }
            ((InterfaceC0092h.a) view).initialize(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m425a();
            super.notifyDataSetChanged();
        }
    }

    public C0087c(Context context, int i) {
        this(i, 0);
        this.f411a = context;
        this.f412b = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public ListAdapter m421a() {
        if (this.f419i == null) {
            this.f419i = new a();
        }
        return this.f419i;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0092h m422b(ViewGroup viewGroup) {
        if (this.f414d == null) {
            this.f414d = (ExpandedMenuView) this.f412b.inflate(g7c0.f101361i, viewGroup, false);
            if (this.f419i == null) {
                this.f419i = new a();
            }
            this.f414d.setAdapter((ListAdapter) this.f419i);
            this.f414d.setOnItemClickListener(this);
        }
        return this.f414d;
    }

    /* JADX INFO: renamed from: c */
    public void m423c(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f414d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m424d(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f414d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
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
        return this.f420j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        if (this.f416f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f416f);
            this.f411a = contextThemeWrapper;
            this.f412b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f411a != null) {
            this.f411a = context;
            if (this.f412b == null) {
                this.f412b = LayoutInflater.from(context);
            }
        }
        this.f413c = menuBuilder;
        a aVar = this.f419i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        InterfaceC0091g.a aVar = this.f418h;
        if (aVar != null) {
            aVar.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f413c.performItemAction(this.f419i.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onRestoreInstanceState(Parcelable parcelable) {
        m423c((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public Parcelable onSaveInstanceState() {
        if (this.f414d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m424d(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean onSubMenuSelected(SubMenuC0094j subMenuC0094j) {
        if (!subMenuC0094j.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0089e(subMenuC0094j).m432c(null);
        InterfaceC0091g.a aVar = this.f418h;
        if (aVar == null) {
            return true;
        }
        aVar.mo345a(subMenuC0094j);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void setCallback(InterfaceC0091g.a aVar) {
        this.f418h = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void updateMenuView(boolean z) {
        a aVar = this.f419i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public C0087c(int i, int i2) {
        this.f417g = i;
        this.f416f = i2;
    }
}
