package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import p153l.t0j0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements MenuBuilder.InterfaceC0080b, InterfaceC0093h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final int[] f331c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuBuilder f332a;

    /* JADX INFO: renamed from: b */
    public int f333b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t0j0 t0j0VarM188782u = t0j0.m188782u(context, attributeSet, f331c, i, 0);
        if (t0j0VarM188782u.m188800r(0)) {
            setBackgroundDrawable(t0j0VarM188782u.m188789g(0));
        }
        if (t0j0VarM188782u.m188800r(1)) {
            setDivider(t0j0VarM188782u.m188789g(1));
        }
        t0j0VarM188782u.m188801v();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0080b
    /* JADX INFO: renamed from: c */
    public boolean mo376c(MenuItemImpl menuItemImpl) {
        return this.f332a.performItemAction(menuItemImpl, 0);
    }

    public int getWindowAnimations() {
        return this.f333b;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h
    public void initialize(MenuBuilder menuBuilder) {
        this.f332a = menuBuilder;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo376c((MenuItemImpl) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
