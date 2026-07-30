package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import p149l.qri0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements MenuBuilder.InterfaceC0079b, InterfaceC0092h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final int[] f331c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuBuilder f332a;

    /* JADX INFO: renamed from: b */
    public int f333b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, f331c, i, 0);
        if (qri0VarM175993u.m176011r(0)) {
            setBackgroundDrawable(qri0VarM175993u.m176000g(0));
        }
        if (qri0VarM175993u.m176011r(1)) {
            setDivider(qri0VarM175993u.m176000g(1));
        }
        qri0VarM175993u.m176012v();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079b
    /* JADX INFO: renamed from: c */
    public boolean mo375c(MenuItemImpl menuItemImpl) {
        return this.f332a.performItemAction(menuItemImpl, 0);
    }

    public int getWindowAnimations() {
        return this.f333b;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h
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
        mo375c((MenuItemImpl) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
