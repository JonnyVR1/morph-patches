package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0088d;
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class nhy implements tze0, InterfaceC0091g, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f139044a;

    /* JADX INFO: renamed from: d */
    public static int m159478d(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m159479n(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static C0088d m159480o(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0088d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0088d) listAdapter;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo401a(MenuBuilder menuBuilder);

    /* JADX INFO: renamed from: b */
    public boolean mo402b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public Rect m159481c() {
        return this.f139044a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo403e(View view);

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m159482f(Rect rect) {
        this.f139044a = rect;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public int getId() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo405h(boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo406i(int i);

    /* JADX INFO: renamed from: j */
    public abstract void mo407j(int i);

    /* JADX INFO: renamed from: k */
    public abstract void mo408k(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: l */
    public abstract void mo409l(boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo410m(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m159480o(listAdapter).f423a.performItemAction((MenuItem) listAdapter.getItem(i), this, mo402b() ? 0 : 4);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void initForMenu(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
    }
}
