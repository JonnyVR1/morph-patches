package p153l;

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
import androidx.appcompat.view.menu.C0089d;
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class kqy implements a8f0, InterfaceC0092g, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f128402a;

    /* JADX INFO: renamed from: d */
    public static int m150969d(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
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
    public static boolean m150970n(MenuBuilder menuBuilder) {
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
    public static C0089d m150971o(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0089d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0089d) listAdapter;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo402a(MenuBuilder menuBuilder);

    /* JADX INFO: renamed from: b */
    public boolean mo403b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public Rect m150972c() {
        return this.f128402a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo404e(View view);

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m150973f(Rect rect) {
        this.f128402a = rect;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public int getId() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo406h(boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo407i(int i);

    /* JADX INFO: renamed from: j */
    public abstract void mo408j(int i);

    /* JADX INFO: renamed from: k */
    public abstract void mo409k(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: l */
    public abstract void mo410l(boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo411m(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m150971o(listAdapter).f423a.performItemAction((MenuItem) listAdapter.getItem(i), this, mo403b() ? 0 : 4);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void initForMenu(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
    }
}
